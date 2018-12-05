package com.sixku.mysql2kafka.dao.als7db.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class AcctLoan implements Serializable {
    /**
     * 借据编号
     */
    private String serialno;

    /**
     * 停用
     */
    private String accountno;

    /**
     * 业务受理编号
     */
    private String contractserialno;

    /**
     * 客户编号
     */
    private String customerid;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 产品类型
     */
    private String businesstype;

    private String productid;

    private String specificid;

    private String versionid;

    /**
     * 币种
     */
    private String currency;

    /**
     * 签约金额
     */
    private BigDecimal businesssum;

    /**
     * 起始日期
     */
    private String putoutdate;

    /**
     * 到期日
     */
    private String maturitydate;

    private String originalmaturitydate;

    private String operateorgid;

    private String accountingorgid;

    /**
     * 贷款状态0	正常
1	逾期
2	正常结清
3	提前结清
4	逾期结清
5	已全部核销/已全部售出
6	已冲销
7	退货终止
     */
    private String loanstatus;

    /**
     * 结清日期
     */
    private String finishdate;

    private String businessdate;

    /**
     * 锁定标识
     */
    private String lockflag;

    /**
     * 逾期天数
     */
    private Integer overduedays;

    /**
     * 五级分类
     */
    private String classifyresult;

    private String putoutserialno;

    private String approveserialno;

    private String applyserialno;

    private String businessstatus;

    /**
     * 月综合费率
     */
    private BigDecimal monthrate;

    /**
     * 总费率
     */
    private BigDecimal rate;

    /**
     * A利率
     */
    private BigDecimal arate;

    /**
     * B利率
     */
    private BigDecimal brate;

    /**
     * C利率
     */
    private BigDecimal crate;

    /**
     * 保险费
     */
    private BigDecimal drate;

    /**
     * 月风险准备金率
     */
    private BigDecimal reserverate;

    /**
     * 产品期限
     */
    private String term;

    /**
     * 商户编号
     */
    private String merchantsno;

    /**
     * SA编号
     */
    private String sano;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 退货人
     */
    private String repayuser;

    /**
     * 销售门店
     */
    private String merchantsname;

    /**
     * 退货说明
     */
    private String returnpolicy;

    /**
     * 放款状态(02：放款成功 03：放款失败 04：放款失败并激活)
     */
    private String status;

    private String inputuserid;

    private String inputorgid;

    private String inputdate;

    /**
     * 期限
     */
    private Integer termmonth;

    /**
     * 审批机构
     */
    private String scrutinyorgid;

    /**
     * 所属团队
     */
    private String groupid;

    /**
     * 小组编号
     */
    private String teamid;

    /**
     * 成功放款用户
     */
    private String sucessuserid;

    /**
     * 回盘起始日
     */
    private String hpputoutdate;

    /**
     * 回盘到期日
     */
    private String hpmaturity;

    /**
     * 实还期数
     */
    private Integer actualpayterm;

    /**
     * 月供
     */
    private BigDecimal monthpay;

    /**
     * 剩余未还款金额
     */
    private BigDecimal unpaybalance;

    /**
     * 当期还款金额
     */
    private BigDecimal currentpayamt;

    /**
     * 贷款流水号
     */
    private String loanserialno;

    /**
     * 首次应还款时间
     */
    private String firstdate;

    /**
     * 批次号
     */
    private String batchno;

    /**
     * 消保期
     */
    private Integer cancellationperiod;

    /**
     * 罚息A
     */
    private BigDecimal afinerate;

    /**
     * 出资方
     */
    private String lenderinfo;

    /**
     * 逾期金额
     */
    private BigDecimal overduebalance;

    /**
     * 当期状态
     */
    private String termmonthstatus;

    /**
     * 除本期外剩余本金
     */
    private BigDecimal residualprincipal;

    /**
     * 一次性结清金额
     */
    private BigDecimal aheadallbalance;

    /**
     * 提前还款违约金
     */
    private BigDecimal aheadscale;

    /**
     * 放款金额
     */
    private BigDecimal amount;

    /**
     * 总费用
     */
    private BigDecimal totalfeeamount;

    /**
     * 计提利息
     */
    private BigDecimal currentinterestamt1;

    /**
     * 下次还款额
     */
    private BigDecimal nextinstalmentamt;

    /**
     * 下次还款日
     */
    private String nextduedate;

    /**
     * 当前期次
     */
    private Integer currentperiodno;

    /**
     * 默认还款日
     */
    private String defaultdueday;

    /**
     * 更新时间
     */
    private Date updatetimestamp;

    /**
     * 续期次数
     */
    private Integer renewaltimes;

    /**
     * 宽限期(grace period)
     */
    private Integer granceperiod;

    /**
     * 罚息日利率2
     */
    private BigDecimal afinerate2;

    /**
     * 产品类别0010：传统产品，0020：闪信贷类产品
     */
    private String productcategory;

    private Byte suspend;

    /**
     * 提现状态   0:处理中,1:成功,2:失败
     */
    private String withdrawstate;

    /**
     * 资金渠道
     */
    private String fundchannel;

    /**
     * 跟进人
     */
    private String follower;

    /**
     * 订单渠道标识（ucard_XJBK04.现金白卡）
     */
    private String orderchannel;

    /**
     * 外部订单号
     */
    private String externalorderno;

    private static final long serialVersionUID = 1L;

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getContractserialno() {
        return contractserialno;
    }

    public void setContractserialno(String contractserialno) {
        this.contractserialno = contractserialno;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getSpecificid() {
        return specificid;
    }

    public void setSpecificid(String specificid) {
        this.specificid = specificid;
    }

    public String getVersionid() {
        return versionid;
    }

    public void setVersionid(String versionid) {
        this.versionid = versionid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getBusinesssum() {
        return businesssum;
    }

    public void setBusinesssum(BigDecimal businesssum) {
        this.businesssum = businesssum;
    }

    public String getPutoutdate() {
        return putoutdate;
    }

    public void setPutoutdate(String putoutdate) {
        this.putoutdate = putoutdate;
    }

    public String getMaturitydate() {
        return maturitydate;
    }

    public void setMaturitydate(String maturitydate) {
        this.maturitydate = maturitydate;
    }

    public String getOriginalmaturitydate() {
        return originalmaturitydate;
    }

    public void setOriginalmaturitydate(String originalmaturitydate) {
        this.originalmaturitydate = originalmaturitydate;
    }

    public String getOperateorgid() {
        return operateorgid;
    }

    public void setOperateorgid(String operateorgid) {
        this.operateorgid = operateorgid;
    }

    public String getAccountingorgid() {
        return accountingorgid;
    }

    public void setAccountingorgid(String accountingorgid) {
        this.accountingorgid = accountingorgid;
    }

    public String getLoanstatus() {
        return loanstatus;
    }

    public void setLoanstatus(String loanstatus) {
        this.loanstatus = loanstatus;
    }

    public String getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(String finishdate) {
        this.finishdate = finishdate;
    }

    public String getBusinessdate() {
        return businessdate;
    }

    public void setBusinessdate(String businessdate) {
        this.businessdate = businessdate;
    }

    public String getLockflag() {
        return lockflag;
    }

    public void setLockflag(String lockflag) {
        this.lockflag = lockflag;
    }

    public Integer getOverduedays() {
        return overduedays;
    }

    public void setOverduedays(Integer overduedays) {
        this.overduedays = overduedays;
    }

    public String getClassifyresult() {
        return classifyresult;
    }

    public void setClassifyresult(String classifyresult) {
        this.classifyresult = classifyresult;
    }

    public String getPutoutserialno() {
        return putoutserialno;
    }

    public void setPutoutserialno(String putoutserialno) {
        this.putoutserialno = putoutserialno;
    }

    public String getApproveserialno() {
        return approveserialno;
    }

    public void setApproveserialno(String approveserialno) {
        this.approveserialno = approveserialno;
    }

    public String getApplyserialno() {
        return applyserialno;
    }

    public void setApplyserialno(String applyserialno) {
        this.applyserialno = applyserialno;
    }

    public String getBusinessstatus() {
        return businessstatus;
    }

    public void setBusinessstatus(String businessstatus) {
        this.businessstatus = businessstatus;
    }

    public BigDecimal getMonthrate() {
        return monthrate;
    }

    public void setMonthrate(BigDecimal monthrate) {
        this.monthrate = monthrate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getArate() {
        return arate;
    }

    public void setArate(BigDecimal arate) {
        this.arate = arate;
    }

    public BigDecimal getBrate() {
        return brate;
    }

    public void setBrate(BigDecimal brate) {
        this.brate = brate;
    }

    public BigDecimal getCrate() {
        return crate;
    }

    public void setCrate(BigDecimal crate) {
        this.crate = crate;
    }

    public BigDecimal getDrate() {
        return drate;
    }

    public void setDrate(BigDecimal drate) {
        this.drate = drate;
    }

    public BigDecimal getReserverate() {
        return reserverate;
    }

    public void setReserverate(BigDecimal reserverate) {
        this.reserverate = reserverate;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getMerchantsno() {
        return merchantsno;
    }

    public void setMerchantsno(String merchantsno) {
        this.merchantsno = merchantsno;
    }

    public String getSano() {
        return sano;
    }

    public void setSano(String sano) {
        this.sano = sano;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRepayuser() {
        return repayuser;
    }

    public void setRepayuser(String repayuser) {
        this.repayuser = repayuser;
    }

    public String getMerchantsname() {
        return merchantsname;
    }

    public void setMerchantsname(String merchantsname) {
        this.merchantsname = merchantsname;
    }

    public String getReturnpolicy() {
        return returnpolicy;
    }

    public void setReturnpolicy(String returnpolicy) {
        this.returnpolicy = returnpolicy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInputuserid() {
        return inputuserid;
    }

    public void setInputuserid(String inputuserid) {
        this.inputuserid = inputuserid;
    }

    public String getInputorgid() {
        return inputorgid;
    }

    public void setInputorgid(String inputorgid) {
        this.inputorgid = inputorgid;
    }

    public String getInputdate() {
        return inputdate;
    }

    public void setInputdate(String inputdate) {
        this.inputdate = inputdate;
    }

    public Integer getTermmonth() {
        return termmonth;
    }

    public void setTermmonth(Integer termmonth) {
        this.termmonth = termmonth;
    }

    public String getScrutinyorgid() {
        return scrutinyorgid;
    }

    public void setScrutinyorgid(String scrutinyorgid) {
        this.scrutinyorgid = scrutinyorgid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }

    public String getSucessuserid() {
        return sucessuserid;
    }

    public void setSucessuserid(String sucessuserid) {
        this.sucessuserid = sucessuserid;
    }

    public String getHpputoutdate() {
        return hpputoutdate;
    }

    public void setHpputoutdate(String hpputoutdate) {
        this.hpputoutdate = hpputoutdate;
    }

    public String getHpmaturity() {
        return hpmaturity;
    }

    public void setHpmaturity(String hpmaturity) {
        this.hpmaturity = hpmaturity;
    }

    public Integer getActualpayterm() {
        return actualpayterm;
    }

    public void setActualpayterm(Integer actualpayterm) {
        this.actualpayterm = actualpayterm;
    }

    public BigDecimal getMonthpay() {
        return monthpay;
    }

    public void setMonthpay(BigDecimal monthpay) {
        this.monthpay = monthpay;
    }

    public BigDecimal getUnpaybalance() {
        return unpaybalance;
    }

    public void setUnpaybalance(BigDecimal unpaybalance) {
        this.unpaybalance = unpaybalance;
    }

    public BigDecimal getCurrentpayamt() {
        return currentpayamt;
    }

    public void setCurrentpayamt(BigDecimal currentpayamt) {
        this.currentpayamt = currentpayamt;
    }

    public String getLoanserialno() {
        return loanserialno;
    }

    public void setLoanserialno(String loanserialno) {
        this.loanserialno = loanserialno;
    }

    public String getFirstdate() {
        return firstdate;
    }

    public void setFirstdate(String firstdate) {
        this.firstdate = firstdate;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public Integer getCancellationperiod() {
        return cancellationperiod;
    }

    public void setCancellationperiod(Integer cancellationperiod) {
        this.cancellationperiod = cancellationperiod;
    }

    public BigDecimal getAfinerate() {
        return afinerate;
    }

    public void setAfinerate(BigDecimal afinerate) {
        this.afinerate = afinerate;
    }

    public String getLenderinfo() {
        return lenderinfo;
    }

    public void setLenderinfo(String lenderinfo) {
        this.lenderinfo = lenderinfo;
    }

    public BigDecimal getOverduebalance() {
        return overduebalance;
    }

    public void setOverduebalance(BigDecimal overduebalance) {
        this.overduebalance = overduebalance;
    }

    public String getTermmonthstatus() {
        return termmonthstatus;
    }

    public void setTermmonthstatus(String termmonthstatus) {
        this.termmonthstatus = termmonthstatus;
    }

    public BigDecimal getResidualprincipal() {
        return residualprincipal;
    }

    public void setResidualprincipal(BigDecimal residualprincipal) {
        this.residualprincipal = residualprincipal;
    }

    public BigDecimal getAheadallbalance() {
        return aheadallbalance;
    }

    public void setAheadallbalance(BigDecimal aheadallbalance) {
        this.aheadallbalance = aheadallbalance;
    }

    public BigDecimal getAheadscale() {
        return aheadscale;
    }

    public void setAheadscale(BigDecimal aheadscale) {
        this.aheadscale = aheadscale;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTotalfeeamount() {
        return totalfeeamount;
    }

    public void setTotalfeeamount(BigDecimal totalfeeamount) {
        this.totalfeeamount = totalfeeamount;
    }

    public BigDecimal getCurrentinterestamt1() {
        return currentinterestamt1;
    }

    public void setCurrentinterestamt1(BigDecimal currentinterestamt1) {
        this.currentinterestamt1 = currentinterestamt1;
    }

    public BigDecimal getNextinstalmentamt() {
        return nextinstalmentamt;
    }

    public void setNextinstalmentamt(BigDecimal nextinstalmentamt) {
        this.nextinstalmentamt = nextinstalmentamt;
    }

    public String getNextduedate() {
        return nextduedate;
    }

    public void setNextduedate(String nextduedate) {
        this.nextduedate = nextduedate;
    }

    public Integer getCurrentperiodno() {
        return currentperiodno;
    }

    public void setCurrentperiodno(Integer currentperiodno) {
        this.currentperiodno = currentperiodno;
    }

    public String getDefaultdueday() {
        return defaultdueday;
    }

    public void setDefaultdueday(String defaultdueday) {
        this.defaultdueday = defaultdueday;
    }

    public Date getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(Date updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    public Integer getRenewaltimes() {
        return renewaltimes;
    }

    public void setRenewaltimes(Integer renewaltimes) {
        this.renewaltimes = renewaltimes;
    }

    public Integer getGranceperiod() {
        return granceperiod;
    }

    public void setGranceperiod(Integer granceperiod) {
        this.granceperiod = granceperiod;
    }

    public BigDecimal getAfinerate2() {
        return afinerate2;
    }

    public void setAfinerate2(BigDecimal afinerate2) {
        this.afinerate2 = afinerate2;
    }

    public String getProductcategory() {
        return productcategory;
    }

    public void setProductcategory(String productcategory) {
        this.productcategory = productcategory;
    }

    public Byte getSuspend() {
        return suspend;
    }

    public void setSuspend(Byte suspend) {
        this.suspend = suspend;
    }

    public String getWithdrawstate() {
        return withdrawstate;
    }

    public void setWithdrawstate(String withdrawstate) {
        this.withdrawstate = withdrawstate;
    }

    public String getFundchannel() {
        return fundchannel;
    }

    public void setFundchannel(String fundchannel) {
        this.fundchannel = fundchannel;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public String getOrderchannel() {
        return orderchannel;
    }

    public void setOrderchannel(String orderchannel) {
        this.orderchannel = orderchannel;
    }

    public String getExternalorderno() {
        return externalorderno;
    }

    public void setExternalorderno(String externalorderno) {
        this.externalorderno = externalorderno;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AcctLoan other = (AcctLoan) that;
        return (this.getSerialno() == null ? other.getSerialno() == null : this.getSerialno().equals(other.getSerialno()))
            && (this.getAccountno() == null ? other.getAccountno() == null : this.getAccountno().equals(other.getAccountno()))
            && (this.getContractserialno() == null ? other.getContractserialno() == null : this.getContractserialno().equals(other.getContractserialno()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getBusinesstype() == null ? other.getBusinesstype() == null : this.getBusinesstype().equals(other.getBusinesstype()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getSpecificid() == null ? other.getSpecificid() == null : this.getSpecificid().equals(other.getSpecificid()))
            && (this.getVersionid() == null ? other.getVersionid() == null : this.getVersionid().equals(other.getVersionid()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getBusinesssum() == null ? other.getBusinesssum() == null : this.getBusinesssum().equals(other.getBusinesssum()))
            && (this.getPutoutdate() == null ? other.getPutoutdate() == null : this.getPutoutdate().equals(other.getPutoutdate()))
            && (this.getMaturitydate() == null ? other.getMaturitydate() == null : this.getMaturitydate().equals(other.getMaturitydate()))
            && (this.getOriginalmaturitydate() == null ? other.getOriginalmaturitydate() == null : this.getOriginalmaturitydate().equals(other.getOriginalmaturitydate()))
            && (this.getOperateorgid() == null ? other.getOperateorgid() == null : this.getOperateorgid().equals(other.getOperateorgid()))
            && (this.getAccountingorgid() == null ? other.getAccountingorgid() == null : this.getAccountingorgid().equals(other.getAccountingorgid()))
            && (this.getLoanstatus() == null ? other.getLoanstatus() == null : this.getLoanstatus().equals(other.getLoanstatus()))
            && (this.getFinishdate() == null ? other.getFinishdate() == null : this.getFinishdate().equals(other.getFinishdate()))
            && (this.getBusinessdate() == null ? other.getBusinessdate() == null : this.getBusinessdate().equals(other.getBusinessdate()))
            && (this.getLockflag() == null ? other.getLockflag() == null : this.getLockflag().equals(other.getLockflag()))
            && (this.getOverduedays() == null ? other.getOverduedays() == null : this.getOverduedays().equals(other.getOverduedays()))
            && (this.getClassifyresult() == null ? other.getClassifyresult() == null : this.getClassifyresult().equals(other.getClassifyresult()))
            && (this.getPutoutserialno() == null ? other.getPutoutserialno() == null : this.getPutoutserialno().equals(other.getPutoutserialno()))
            && (this.getApproveserialno() == null ? other.getApproveserialno() == null : this.getApproveserialno().equals(other.getApproveserialno()))
            && (this.getApplyserialno() == null ? other.getApplyserialno() == null : this.getApplyserialno().equals(other.getApplyserialno()))
            && (this.getBusinessstatus() == null ? other.getBusinessstatus() == null : this.getBusinessstatus().equals(other.getBusinessstatus()))
            && (this.getMonthrate() == null ? other.getMonthrate() == null : this.getMonthrate().equals(other.getMonthrate()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getArate() == null ? other.getArate() == null : this.getArate().equals(other.getArate()))
            && (this.getBrate() == null ? other.getBrate() == null : this.getBrate().equals(other.getBrate()))
            && (this.getCrate() == null ? other.getCrate() == null : this.getCrate().equals(other.getCrate()))
            && (this.getDrate() == null ? other.getDrate() == null : this.getDrate().equals(other.getDrate()))
            && (this.getReserverate() == null ? other.getReserverate() == null : this.getReserverate().equals(other.getReserverate()))
            && (this.getTerm() == null ? other.getTerm() == null : this.getTerm().equals(other.getTerm()))
            && (this.getMerchantsno() == null ? other.getMerchantsno() == null : this.getMerchantsno().equals(other.getMerchantsno()))
            && (this.getSano() == null ? other.getSano() == null : this.getSano().equals(other.getSano()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getRepayuser() == null ? other.getRepayuser() == null : this.getRepayuser().equals(other.getRepayuser()))
            && (this.getMerchantsname() == null ? other.getMerchantsname() == null : this.getMerchantsname().equals(other.getMerchantsname()))
            && (this.getReturnpolicy() == null ? other.getReturnpolicy() == null : this.getReturnpolicy().equals(other.getReturnpolicy()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getInputuserid() == null ? other.getInputuserid() == null : this.getInputuserid().equals(other.getInputuserid()))
            && (this.getInputorgid() == null ? other.getInputorgid() == null : this.getInputorgid().equals(other.getInputorgid()))
            && (this.getInputdate() == null ? other.getInputdate() == null : this.getInputdate().equals(other.getInputdate()))
            && (this.getTermmonth() == null ? other.getTermmonth() == null : this.getTermmonth().equals(other.getTermmonth()))
            && (this.getScrutinyorgid() == null ? other.getScrutinyorgid() == null : this.getScrutinyorgid().equals(other.getScrutinyorgid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getTeamid() == null ? other.getTeamid() == null : this.getTeamid().equals(other.getTeamid()))
            && (this.getSucessuserid() == null ? other.getSucessuserid() == null : this.getSucessuserid().equals(other.getSucessuserid()))
            && (this.getHpputoutdate() == null ? other.getHpputoutdate() == null : this.getHpputoutdate().equals(other.getHpputoutdate()))
            && (this.getHpmaturity() == null ? other.getHpmaturity() == null : this.getHpmaturity().equals(other.getHpmaturity()))
            && (this.getActualpayterm() == null ? other.getActualpayterm() == null : this.getActualpayterm().equals(other.getActualpayterm()))
            && (this.getMonthpay() == null ? other.getMonthpay() == null : this.getMonthpay().equals(other.getMonthpay()))
            && (this.getUnpaybalance() == null ? other.getUnpaybalance() == null : this.getUnpaybalance().equals(other.getUnpaybalance()))
            && (this.getCurrentpayamt() == null ? other.getCurrentpayamt() == null : this.getCurrentpayamt().equals(other.getCurrentpayamt()))
            && (this.getLoanserialno() == null ? other.getLoanserialno() == null : this.getLoanserialno().equals(other.getLoanserialno()))
            && (this.getFirstdate() == null ? other.getFirstdate() == null : this.getFirstdate().equals(other.getFirstdate()))
            && (this.getBatchno() == null ? other.getBatchno() == null : this.getBatchno().equals(other.getBatchno()))
            && (this.getCancellationperiod() == null ? other.getCancellationperiod() == null : this.getCancellationperiod().equals(other.getCancellationperiod()))
            && (this.getAfinerate() == null ? other.getAfinerate() == null : this.getAfinerate().equals(other.getAfinerate()))
            && (this.getLenderinfo() == null ? other.getLenderinfo() == null : this.getLenderinfo().equals(other.getLenderinfo()))
            && (this.getOverduebalance() == null ? other.getOverduebalance() == null : this.getOverduebalance().equals(other.getOverduebalance()))
            && (this.getTermmonthstatus() == null ? other.getTermmonthstatus() == null : this.getTermmonthstatus().equals(other.getTermmonthstatus()))
            && (this.getResidualprincipal() == null ? other.getResidualprincipal() == null : this.getResidualprincipal().equals(other.getResidualprincipal()))
            && (this.getAheadallbalance() == null ? other.getAheadallbalance() == null : this.getAheadallbalance().equals(other.getAheadallbalance()))
            && (this.getAheadscale() == null ? other.getAheadscale() == null : this.getAheadscale().equals(other.getAheadscale()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getTotalfeeamount() == null ? other.getTotalfeeamount() == null : this.getTotalfeeamount().equals(other.getTotalfeeamount()))
            && (this.getCurrentinterestamt1() == null ? other.getCurrentinterestamt1() == null : this.getCurrentinterestamt1().equals(other.getCurrentinterestamt1()))
            && (this.getNextinstalmentamt() == null ? other.getNextinstalmentamt() == null : this.getNextinstalmentamt().equals(other.getNextinstalmentamt()))
            && (this.getNextduedate() == null ? other.getNextduedate() == null : this.getNextduedate().equals(other.getNextduedate()))
            && (this.getCurrentperiodno() == null ? other.getCurrentperiodno() == null : this.getCurrentperiodno().equals(other.getCurrentperiodno()))
            && (this.getDefaultdueday() == null ? other.getDefaultdueday() == null : this.getDefaultdueday().equals(other.getDefaultdueday()))
            && (this.getUpdatetimestamp() == null ? other.getUpdatetimestamp() == null : this.getUpdatetimestamp().equals(other.getUpdatetimestamp()))
            && (this.getRenewaltimes() == null ? other.getRenewaltimes() == null : this.getRenewaltimes().equals(other.getRenewaltimes()))
            && (this.getGranceperiod() == null ? other.getGranceperiod() == null : this.getGranceperiod().equals(other.getGranceperiod()))
            && (this.getAfinerate2() == null ? other.getAfinerate2() == null : this.getAfinerate2().equals(other.getAfinerate2()))
            && (this.getProductcategory() == null ? other.getProductcategory() == null : this.getProductcategory().equals(other.getProductcategory()))
            && (this.getSuspend() == null ? other.getSuspend() == null : this.getSuspend().equals(other.getSuspend()))
            && (this.getWithdrawstate() == null ? other.getWithdrawstate() == null : this.getWithdrawstate().equals(other.getWithdrawstate()))
            && (this.getFundchannel() == null ? other.getFundchannel() == null : this.getFundchannel().equals(other.getFundchannel()))
            && (this.getFollower() == null ? other.getFollower() == null : this.getFollower().equals(other.getFollower()))
            && (this.getOrderchannel() == null ? other.getOrderchannel() == null : this.getOrderchannel().equals(other.getOrderchannel()))
            && (this.getExternalorderno() == null ? other.getExternalorderno() == null : this.getExternalorderno().equals(other.getExternalorderno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSerialno() == null) ? 0 : getSerialno().hashCode());
        result = prime * result + ((getAccountno() == null) ? 0 : getAccountno().hashCode());
        result = prime * result + ((getContractserialno() == null) ? 0 : getContractserialno().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getBusinesstype() == null) ? 0 : getBusinesstype().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getSpecificid() == null) ? 0 : getSpecificid().hashCode());
        result = prime * result + ((getVersionid() == null) ? 0 : getVersionid().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getBusinesssum() == null) ? 0 : getBusinesssum().hashCode());
        result = prime * result + ((getPutoutdate() == null) ? 0 : getPutoutdate().hashCode());
        result = prime * result + ((getMaturitydate() == null) ? 0 : getMaturitydate().hashCode());
        result = prime * result + ((getOriginalmaturitydate() == null) ? 0 : getOriginalmaturitydate().hashCode());
        result = prime * result + ((getOperateorgid() == null) ? 0 : getOperateorgid().hashCode());
        result = prime * result + ((getAccountingorgid() == null) ? 0 : getAccountingorgid().hashCode());
        result = prime * result + ((getLoanstatus() == null) ? 0 : getLoanstatus().hashCode());
        result = prime * result + ((getFinishdate() == null) ? 0 : getFinishdate().hashCode());
        result = prime * result + ((getBusinessdate() == null) ? 0 : getBusinessdate().hashCode());
        result = prime * result + ((getLockflag() == null) ? 0 : getLockflag().hashCode());
        result = prime * result + ((getOverduedays() == null) ? 0 : getOverduedays().hashCode());
        result = prime * result + ((getClassifyresult() == null) ? 0 : getClassifyresult().hashCode());
        result = prime * result + ((getPutoutserialno() == null) ? 0 : getPutoutserialno().hashCode());
        result = prime * result + ((getApproveserialno() == null) ? 0 : getApproveserialno().hashCode());
        result = prime * result + ((getApplyserialno() == null) ? 0 : getApplyserialno().hashCode());
        result = prime * result + ((getBusinessstatus() == null) ? 0 : getBusinessstatus().hashCode());
        result = prime * result + ((getMonthrate() == null) ? 0 : getMonthrate().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getArate() == null) ? 0 : getArate().hashCode());
        result = prime * result + ((getBrate() == null) ? 0 : getBrate().hashCode());
        result = prime * result + ((getCrate() == null) ? 0 : getCrate().hashCode());
        result = prime * result + ((getDrate() == null) ? 0 : getDrate().hashCode());
        result = prime * result + ((getReserverate() == null) ? 0 : getReserverate().hashCode());
        result = prime * result + ((getTerm() == null) ? 0 : getTerm().hashCode());
        result = prime * result + ((getMerchantsno() == null) ? 0 : getMerchantsno().hashCode());
        result = prime * result + ((getSano() == null) ? 0 : getSano().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getRepayuser() == null) ? 0 : getRepayuser().hashCode());
        result = prime * result + ((getMerchantsname() == null) ? 0 : getMerchantsname().hashCode());
        result = prime * result + ((getReturnpolicy() == null) ? 0 : getReturnpolicy().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getInputuserid() == null) ? 0 : getInputuserid().hashCode());
        result = prime * result + ((getInputorgid() == null) ? 0 : getInputorgid().hashCode());
        result = prime * result + ((getInputdate() == null) ? 0 : getInputdate().hashCode());
        result = prime * result + ((getTermmonth() == null) ? 0 : getTermmonth().hashCode());
        result = prime * result + ((getScrutinyorgid() == null) ? 0 : getScrutinyorgid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getTeamid() == null) ? 0 : getTeamid().hashCode());
        result = prime * result + ((getSucessuserid() == null) ? 0 : getSucessuserid().hashCode());
        result = prime * result + ((getHpputoutdate() == null) ? 0 : getHpputoutdate().hashCode());
        result = prime * result + ((getHpmaturity() == null) ? 0 : getHpmaturity().hashCode());
        result = prime * result + ((getActualpayterm() == null) ? 0 : getActualpayterm().hashCode());
        result = prime * result + ((getMonthpay() == null) ? 0 : getMonthpay().hashCode());
        result = prime * result + ((getUnpaybalance() == null) ? 0 : getUnpaybalance().hashCode());
        result = prime * result + ((getCurrentpayamt() == null) ? 0 : getCurrentpayamt().hashCode());
        result = prime * result + ((getLoanserialno() == null) ? 0 : getLoanserialno().hashCode());
        result = prime * result + ((getFirstdate() == null) ? 0 : getFirstdate().hashCode());
        result = prime * result + ((getBatchno() == null) ? 0 : getBatchno().hashCode());
        result = prime * result + ((getCancellationperiod() == null) ? 0 : getCancellationperiod().hashCode());
        result = prime * result + ((getAfinerate() == null) ? 0 : getAfinerate().hashCode());
        result = prime * result + ((getLenderinfo() == null) ? 0 : getLenderinfo().hashCode());
        result = prime * result + ((getOverduebalance() == null) ? 0 : getOverduebalance().hashCode());
        result = prime * result + ((getTermmonthstatus() == null) ? 0 : getTermmonthstatus().hashCode());
        result = prime * result + ((getResidualprincipal() == null) ? 0 : getResidualprincipal().hashCode());
        result = prime * result + ((getAheadallbalance() == null) ? 0 : getAheadallbalance().hashCode());
        result = prime * result + ((getAheadscale() == null) ? 0 : getAheadscale().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getTotalfeeamount() == null) ? 0 : getTotalfeeamount().hashCode());
        result = prime * result + ((getCurrentinterestamt1() == null) ? 0 : getCurrentinterestamt1().hashCode());
        result = prime * result + ((getNextinstalmentamt() == null) ? 0 : getNextinstalmentamt().hashCode());
        result = prime * result + ((getNextduedate() == null) ? 0 : getNextduedate().hashCode());
        result = prime * result + ((getCurrentperiodno() == null) ? 0 : getCurrentperiodno().hashCode());
        result = prime * result + ((getDefaultdueday() == null) ? 0 : getDefaultdueday().hashCode());
        result = prime * result + ((getUpdatetimestamp() == null) ? 0 : getUpdatetimestamp().hashCode());
        result = prime * result + ((getRenewaltimes() == null) ? 0 : getRenewaltimes().hashCode());
        result = prime * result + ((getGranceperiod() == null) ? 0 : getGranceperiod().hashCode());
        result = prime * result + ((getAfinerate2() == null) ? 0 : getAfinerate2().hashCode());
        result = prime * result + ((getProductcategory() == null) ? 0 : getProductcategory().hashCode());
        result = prime * result + ((getSuspend() == null) ? 0 : getSuspend().hashCode());
        result = prime * result + ((getWithdrawstate() == null) ? 0 : getWithdrawstate().hashCode());
        result = prime * result + ((getFundchannel() == null) ? 0 : getFundchannel().hashCode());
        result = prime * result + ((getFollower() == null) ? 0 : getFollower().hashCode());
        result = prime * result + ((getOrderchannel() == null) ? 0 : getOrderchannel().hashCode());
        result = prime * result + ((getExternalorderno() == null) ? 0 : getExternalorderno().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialno=").append(serialno);
        sb.append(", accountno=").append(accountno);
        sb.append(", contractserialno=").append(contractserialno);
        sb.append(", customerid=").append(customerid);
        sb.append(", customername=").append(customername);
        sb.append(", businesstype=").append(businesstype);
        sb.append(", productid=").append(productid);
        sb.append(", specificid=").append(specificid);
        sb.append(", versionid=").append(versionid);
        sb.append(", currency=").append(currency);
        sb.append(", businesssum=").append(businesssum);
        sb.append(", putoutdate=").append(putoutdate);
        sb.append(", maturitydate=").append(maturitydate);
        sb.append(", originalmaturitydate=").append(originalmaturitydate);
        sb.append(", operateorgid=").append(operateorgid);
        sb.append(", accountingorgid=").append(accountingorgid);
        sb.append(", loanstatus=").append(loanstatus);
        sb.append(", finishdate=").append(finishdate);
        sb.append(", businessdate=").append(businessdate);
        sb.append(", lockflag=").append(lockflag);
        sb.append(", overduedays=").append(overduedays);
        sb.append(", classifyresult=").append(classifyresult);
        sb.append(", putoutserialno=").append(putoutserialno);
        sb.append(", approveserialno=").append(approveserialno);
        sb.append(", applyserialno=").append(applyserialno);
        sb.append(", businessstatus=").append(businessstatus);
        sb.append(", monthrate=").append(monthrate);
        sb.append(", rate=").append(rate);
        sb.append(", arate=").append(arate);
        sb.append(", brate=").append(brate);
        sb.append(", crate=").append(crate);
        sb.append(", drate=").append(drate);
        sb.append(", reserverate=").append(reserverate);
        sb.append(", term=").append(term);
        sb.append(", merchantsno=").append(merchantsno);
        sb.append(", sano=").append(sano);
        sb.append(", phone=").append(phone);
        sb.append(", repayuser=").append(repayuser);
        sb.append(", merchantsname=").append(merchantsname);
        sb.append(", returnpolicy=").append(returnpolicy);
        sb.append(", status=").append(status);
        sb.append(", inputuserid=").append(inputuserid);
        sb.append(", inputorgid=").append(inputorgid);
        sb.append(", inputdate=").append(inputdate);
        sb.append(", termmonth=").append(termmonth);
        sb.append(", scrutinyorgid=").append(scrutinyorgid);
        sb.append(", groupid=").append(groupid);
        sb.append(", teamid=").append(teamid);
        sb.append(", sucessuserid=").append(sucessuserid);
        sb.append(", hpputoutdate=").append(hpputoutdate);
        sb.append(", hpmaturity=").append(hpmaturity);
        sb.append(", actualpayterm=").append(actualpayterm);
        sb.append(", monthpay=").append(monthpay);
        sb.append(", unpaybalance=").append(unpaybalance);
        sb.append(", currentpayamt=").append(currentpayamt);
        sb.append(", loanserialno=").append(loanserialno);
        sb.append(", firstdate=").append(firstdate);
        sb.append(", batchno=").append(batchno);
        sb.append(", cancellationperiod=").append(cancellationperiod);
        sb.append(", afinerate=").append(afinerate);
        sb.append(", lenderinfo=").append(lenderinfo);
        sb.append(", overduebalance=").append(overduebalance);
        sb.append(", termmonthstatus=").append(termmonthstatus);
        sb.append(", residualprincipal=").append(residualprincipal);
        sb.append(", aheadallbalance=").append(aheadallbalance);
        sb.append(", aheadscale=").append(aheadscale);
        sb.append(", amount=").append(amount);
        sb.append(", totalfeeamount=").append(totalfeeamount);
        sb.append(", currentinterestamt1=").append(currentinterestamt1);
        sb.append(", nextinstalmentamt=").append(nextinstalmentamt);
        sb.append(", nextduedate=").append(nextduedate);
        sb.append(", currentperiodno=").append(currentperiodno);
        sb.append(", defaultdueday=").append(defaultdueday);
        sb.append(", updatetimestamp=").append(updatetimestamp);
        sb.append(", renewaltimes=").append(renewaltimes);
        sb.append(", granceperiod=").append(granceperiod);
        sb.append(", afinerate2=").append(afinerate2);
        sb.append(", productcategory=").append(productcategory);
        sb.append(", suspend=").append(suspend);
        sb.append(", withdrawstate=").append(withdrawstate);
        sb.append(", fundchannel=").append(fundchannel);
        sb.append(", follower=").append(follower);
        sb.append(", orderchannel=").append(orderchannel);
        sb.append(", externalorderno=").append(externalorderno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}