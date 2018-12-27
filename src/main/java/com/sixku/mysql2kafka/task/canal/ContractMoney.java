package com.sixku.mysql2kafka.task.canal;

import com.sixku.mysql2kafka.dao.als7db.BusinessTypesetMapper;
import com.sixku.mysql2kafka.dao.als7db.domain.BusinessTypeset;
import com.sixku.mysql2kafka.dao.als7db.domain.BusinessTypesetExample;
import com.sixku.mysql2kafka.dao.ucard_loan.domain.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class ContractMoney {

    @Autowired
    BusinessTypesetMapper businessTypesetMapper;

    private final static Logger logger = LoggerFactory.getLogger(ContractMoney.class);

    public String getContractMoney(OrderInfo orderInfo) throws Exception{
        //去核心查询产品费率组编号
//        BusinessType businessType = new BusinessType();
//        businessType.setIsInUse("1");
//        businessType.setTypeNo(intoPiecesBean.getProductNumber());
//        List<BusinessType> btList = businessTypeDao.findBusinessType(businessType);

//        BusinessTypeset businessTypeset = new BusinessTypeset();
//        businessTypeset.setFundChannel(Integer.valueOf(intoPiecesBean.getChannel()));
//        businessTypeset.setTypeNo(intoPiecesBean.getProductNumber());
//        businessTypeset.setTerm(intoPiecesBean.getApplyTerm());
//        businessTypeset.setStatus("1");
//        List<BusinessTypeset> btslist = businessTypesetDao.findBusinessTypeset(businessTypeset);

        BusinessTypesetExample businessTypesetExample = new BusinessTypesetExample();
        businessTypesetExample.createCriteria()
                .andFundChannelEqualTo(Integer.valueOf(orderInfo.getChannel()))
                .andTypenoEqualTo(orderInfo.getBusinessType())
                .andTermEqualTo(orderInfo.getPeriods())
                .andStatusEqualTo("1");
        List<BusinessTypeset> btslist = businessTypesetMapper.selectByExample(businessTypesetExample);

        BusinessTypeset businessTypeset = btslist.get(0);
        double dBusinessSum = orderInfo.getApplySum().doubleValue();	//申请金额
        int approveterm = Integer.valueOf(orderInfo.getPeriods());		// 审批通过期限
        BigDecimal payfeerate = BigDecimal.ZERO;	//年化第三方支付费
        BigDecimal loanfeerate = BigDecimal.ZERO;	//年化平台费
        BigDecimal servicefeerate = BigDecimal.ZERO;//年化咨询费
        double dPutoutSum = 0d;//签约金额

        if(businessTypeset.getPayfeerate()!=null){
            payfeerate=businessTypeset.getPayfeerate().multiply(new BigDecimal(0.01));
        }
        if(businessTypeset.getLoanfeerate() != null){
            loanfeerate=businessTypeset.getLoanfeerate().multiply(new BigDecimal(0.01));
        }
        if(businessTypeset.getServicefeerate() != null){
            servicefeerate =businessTypeset.getServicefeerate().multiply(new BigDecimal(0.01));
        }
        //上标金额=到账金额/(1-(平台服务费+咨询费)/(12/期限))
        double d = dBusinessSum/(1-((loanfeerate.add(servicefeerate)).doubleValue())/(12/approveterm));
        dPutoutSum = new BigDecimal(d).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        dPutoutSum = updatePutoutSum(scaleHalf(new BigDecimal(dPutoutSum),2), scale(new BigDecimal(dBusinessSum),2), approveterm, payfeerate, loanfeerate,servicefeerate).doubleValue();
        logger.info("试算后，实际签约金额 dPutoutSum{}："+ dPutoutSum);
        return String.valueOf(dPutoutSum);
    }


    private BigDecimal scaleHalf(BigDecimal bg, int count) {
        BigDecimal f1 = bg.setScale(count, BigDecimal.ROUND_HALF_UP);
        return f1;
    }

    private BigDecimal scale(BigDecimal bg,int count) {
        BigDecimal f1 = bg.setScale(count, BigDecimal.ROUND_DOWN);
        return f1;
    }

    private BigDecimal updatePutoutSum(BigDecimal dPutoutSum, BigDecimal approveSum, int termMonth,
                                              BigDecimal payfeerate, BigDecimal loanfeerate, BigDecimal servicefeerate) {
        BigDecimal step = scale(new BigDecimal(0.01), 2);
        boolean isAdd = true;
        BigDecimal trySum = m2(dPutoutSum, approveSum, termMonth, payfeerate, loanfeerate, servicefeerate);
        if (trySum.compareTo(approveSum) > 0) {
            isAdd = false;
        }
        logger.info("循环计算签约金额....");
        while (true) {
            if (isAdd && trySum.compareTo(approveSum) >= 0 || !isAdd && trySum.compareTo(approveSum) <= 0) {
                break;
            }
            if (isAdd) {
                dPutoutSum = scale(dPutoutSum.add(step), 2);
            } else {
                dPutoutSum = scale(dPutoutSum.subtract(step), 2);
            }
            trySum = m2(dPutoutSum, approveSum, termMonth, payfeerate, loanfeerate, servicefeerate);
        }
        logger.info("循环计算签约试算金额dPutoutSum=" + dPutoutSum);
        return dPutoutSum;
    }

    private BigDecimal m2(BigDecimal dPutoutSum,BigDecimal approveSum,int termMonth,BigDecimal payfeerate, BigDecimal loanfeerate,BigDecimal servicefeerate) {
        BigDecimal n1=scale(dPutoutSum.multiply(payfeerate).multiply(new BigDecimal(termMonth)).divide(new BigDecimal(12),2),2);
        BigDecimal n2=scale(dPutoutSum.multiply(loanfeerate).multiply(new BigDecimal(termMonth)).divide(new BigDecimal(12),2),2);
        BigDecimal n3=scale(dPutoutSum.multiply(servicefeerate).multiply(new BigDecimal(termMonth)).divide(new BigDecimal(12),2),2);
        BigDecimal y = scale(dPutoutSum.subtract(n1).subtract(n2).subtract(n3),2);
        return y;
    }
}
