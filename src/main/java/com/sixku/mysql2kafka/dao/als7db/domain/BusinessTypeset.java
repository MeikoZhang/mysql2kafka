package com.sixku.mysql2kafka.dao.als7db.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class BusinessTypeset implements Serializable {
    /**
     * 编号
     */
    private String termno;

    /**
     * 期限
     */
    private Integer term;

    /**
     * 期数单位
     */
    private String termunit;

    /**
     * 期限利率/名义利率
     */
    private String termrate;

    /**
     * 状态
     */
    private String status;

    /**
     * 提前还款锁定期
     */
    private String ahendterm;

    /**
     * 提前还款违约金比例
     */
    private String ahendrate;

    /**
     * 罚息违约金比例
     */
    private String overrate;

    /**
     * 咨询费率
     */
    private String consultrate;

    /**
     * 审核费率
     */
    private String checkrate;

    /**
     * 总费率
     */
    private String totalrate;

    /**
     * 产品编号
     */
    private String typeno;

    private String managerate;

    private String serverrate;

    private String insurancerate;

    private String serverfee;

    private String aheadfee;

    /**
     * 保证金率
     */
    private String bondrate;

    /**
     * 服务费率
     */
    private String serrate;

    private String getcheckrate;

    private BigDecimal consultRate;

    /**
     * 年化第三方支付费
     */
    private BigDecimal payfeerate;

    /**
     * 年化平台费
     */
    private BigDecimal loanfeerate;

    /**
     * 年化咨询费
     */
    private BigDecimal servicefeerate;

    /**
     * 投资人收益率
     */
    private BigDecimal businessrate;

    /**
     * 更新时间
     */
    private Date updatetimestamp;

    /**
     * 最小购买份额
     */
    private Integer minSaleShare;

    /**
     * 最大购买份额
     */
    private Integer maxSaleShare;

    /**
     * 递增购买份额
     */
    private Integer incShare;

    /**
     * 平台费率1（闪信贷凤凰平台费率）
     */
    private BigDecimal platformRateOne;

    /**
     * 平台费率2（闪信贷大众平台费率）
     */
    private BigDecimal platformRateTwo;

    /**
     * 资金渠道1网信2自有3工场
     */
    private Integer fundChannel;

    /**
     * 逾期费率1
     */
    private BigDecimal overdueRateOne;

    /**
     * 逾期费率2
     */
    private BigDecimal overdueRateTwo;

    /**
     * 还款类型RPT01 一次性还本付息 RPT02    按月等额本息 RPT03    按月等额本金 RPT04    按月付息到期还本
     */
    private String repaymentType;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 展示类型，0-标准类型，1-续借类型
     */
    private Integer showType;

    /**
     * 容时期
     */
    private Integer capacityPeriod;

    /**
     * 是否可续借,0-否,1-是
     */
    private Integer canBeRenew;

    /**
     * 可续借次数
     */
    private Integer renewTimes;

    /**
     * 可续借期限
     */
    private String renewPeriod;

    /**
     * 续借手续费
     */
    private BigDecimal renewFee;

    /**
     * 信审费
     */
    private BigDecimal creditAuditFee;

    /**
     * 咨询费
     */
    private BigDecimal consultingFee;

    /**
     * 借款金额
     */
    private BigDecimal loanAmount;

    /**
     * 到账金额
     */
    private BigDecimal arrivalAmount;

    /**
     * 产品编号
     */
    private String productNumber;

    /**
     * 费率组编号
     */
    private String rateGroupNumber;

    private static final long serialVersionUID = 1L;

    public String getTermno() {
        return termno;
    }

    public void setTermno(String termno) {
        this.termno = termno;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getTermunit() {
        return termunit;
    }

    public void setTermunit(String termunit) {
        this.termunit = termunit;
    }

    public String getTermrate() {
        return termrate;
    }

    public void setTermrate(String termrate) {
        this.termrate = termrate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAhendterm() {
        return ahendterm;
    }

    public void setAhendterm(String ahendterm) {
        this.ahendterm = ahendterm;
    }

    public String getAhendrate() {
        return ahendrate;
    }

    public void setAhendrate(String ahendrate) {
        this.ahendrate = ahendrate;
    }

    public String getOverrate() {
        return overrate;
    }

    public void setOverrate(String overrate) {
        this.overrate = overrate;
    }

    public String getConsultrate() {
        return consultrate;
    }

    public void setConsultrate(String consultrate) {
        this.consultrate = consultrate;
    }

    public String getCheckrate() {
        return checkrate;
    }

    public void setCheckrate(String checkrate) {
        this.checkrate = checkrate;
    }

    public String getTotalrate() {
        return totalrate;
    }

    public void setTotalrate(String totalrate) {
        this.totalrate = totalrate;
    }

    public String getTypeno() {
        return typeno;
    }

    public void setTypeno(String typeno) {
        this.typeno = typeno;
    }

    public String getManagerate() {
        return managerate;
    }

    public void setManagerate(String managerate) {
        this.managerate = managerate;
    }

    public String getServerrate() {
        return serverrate;
    }

    public void setServerrate(String serverrate) {
        this.serverrate = serverrate;
    }

    public String getInsurancerate() {
        return insurancerate;
    }

    public void setInsurancerate(String insurancerate) {
        this.insurancerate = insurancerate;
    }

    public String getServerfee() {
        return serverfee;
    }

    public void setServerfee(String serverfee) {
        this.serverfee = serverfee;
    }

    public String getAheadfee() {
        return aheadfee;
    }

    public void setAheadfee(String aheadfee) {
        this.aheadfee = aheadfee;
    }

    public String getBondrate() {
        return bondrate;
    }

    public void setBondrate(String bondrate) {
        this.bondrate = bondrate;
    }

    public String getSerrate() {
        return serrate;
    }

    public void setSerrate(String serrate) {
        this.serrate = serrate;
    }

    public String getGetcheckrate() {
        return getcheckrate;
    }

    public void setGetcheckrate(String getcheckrate) {
        this.getcheckrate = getcheckrate;
    }

    public BigDecimal getConsultRate() {
        return consultRate;
    }

    public void setConsultRate(BigDecimal consultRate) {
        this.consultRate = consultRate;
    }

    public BigDecimal getPayfeerate() {
        return payfeerate;
    }

    public void setPayfeerate(BigDecimal payfeerate) {
        this.payfeerate = payfeerate;
    }

    public BigDecimal getLoanfeerate() {
        return loanfeerate;
    }

    public void setLoanfeerate(BigDecimal loanfeerate) {
        this.loanfeerate = loanfeerate;
    }

    public BigDecimal getServicefeerate() {
        return servicefeerate;
    }

    public void setServicefeerate(BigDecimal servicefeerate) {
        this.servicefeerate = servicefeerate;
    }

    public BigDecimal getBusinessrate() {
        return businessrate;
    }

    public void setBusinessrate(BigDecimal businessrate) {
        this.businessrate = businessrate;
    }

    public Date getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(Date updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    public Integer getMinSaleShare() {
        return minSaleShare;
    }

    public void setMinSaleShare(Integer minSaleShare) {
        this.minSaleShare = minSaleShare;
    }

    public Integer getMaxSaleShare() {
        return maxSaleShare;
    }

    public void setMaxSaleShare(Integer maxSaleShare) {
        this.maxSaleShare = maxSaleShare;
    }

    public Integer getIncShare() {
        return incShare;
    }

    public void setIncShare(Integer incShare) {
        this.incShare = incShare;
    }

    public BigDecimal getPlatformRateOne() {
        return platformRateOne;
    }

    public void setPlatformRateOne(BigDecimal platformRateOne) {
        this.platformRateOne = platformRateOne;
    }

    public BigDecimal getPlatformRateTwo() {
        return platformRateTwo;
    }

    public void setPlatformRateTwo(BigDecimal platformRateTwo) {
        this.platformRateTwo = platformRateTwo;
    }

    public Integer getFundChannel() {
        return fundChannel;
    }

    public void setFundChannel(Integer fundChannel) {
        this.fundChannel = fundChannel;
    }

    public BigDecimal getOverdueRateOne() {
        return overdueRateOne;
    }

    public void setOverdueRateOne(BigDecimal overdueRateOne) {
        this.overdueRateOne = overdueRateOne;
    }

    public BigDecimal getOverdueRateTwo() {
        return overdueRateTwo;
    }

    public void setOverdueRateTwo(BigDecimal overdueRateTwo) {
        this.overdueRateTwo = overdueRateTwo;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    public Integer getCapacityPeriod() {
        return capacityPeriod;
    }

    public void setCapacityPeriod(Integer capacityPeriod) {
        this.capacityPeriod = capacityPeriod;
    }

    public Integer getCanBeRenew() {
        return canBeRenew;
    }

    public void setCanBeRenew(Integer canBeRenew) {
        this.canBeRenew = canBeRenew;
    }

    public Integer getRenewTimes() {
        return renewTimes;
    }

    public void setRenewTimes(Integer renewTimes) {
        this.renewTimes = renewTimes;
    }

    public String getRenewPeriod() {
        return renewPeriod;
    }

    public void setRenewPeriod(String renewPeriod) {
        this.renewPeriod = renewPeriod;
    }

    public BigDecimal getRenewFee() {
        return renewFee;
    }

    public void setRenewFee(BigDecimal renewFee) {
        this.renewFee = renewFee;
    }

    public BigDecimal getCreditAuditFee() {
        return creditAuditFee;
    }

    public void setCreditAuditFee(BigDecimal creditAuditFee) {
        this.creditAuditFee = creditAuditFee;
    }

    public BigDecimal getConsultingFee() {
        return consultingFee;
    }

    public void setConsultingFee(BigDecimal consultingFee) {
        this.consultingFee = consultingFee;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getArrivalAmount() {
        return arrivalAmount;
    }

    public void setArrivalAmount(BigDecimal arrivalAmount) {
        this.arrivalAmount = arrivalAmount;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getRateGroupNumber() {
        return rateGroupNumber;
    }

    public void setRateGroupNumber(String rateGroupNumber) {
        this.rateGroupNumber = rateGroupNumber;
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
        BusinessTypeset other = (BusinessTypeset) that;
        return (this.getTermno() == null ? other.getTermno() == null : this.getTermno().equals(other.getTermno()))
            && (this.getTerm() == null ? other.getTerm() == null : this.getTerm().equals(other.getTerm()))
            && (this.getTermunit() == null ? other.getTermunit() == null : this.getTermunit().equals(other.getTermunit()))
            && (this.getTermrate() == null ? other.getTermrate() == null : this.getTermrate().equals(other.getTermrate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAhendterm() == null ? other.getAhendterm() == null : this.getAhendterm().equals(other.getAhendterm()))
            && (this.getAhendrate() == null ? other.getAhendrate() == null : this.getAhendrate().equals(other.getAhendrate()))
            && (this.getOverrate() == null ? other.getOverrate() == null : this.getOverrate().equals(other.getOverrate()))
            && (this.getConsultrate() == null ? other.getConsultrate() == null : this.getConsultrate().equals(other.getConsultrate()))
            && (this.getCheckrate() == null ? other.getCheckrate() == null : this.getCheckrate().equals(other.getCheckrate()))
            && (this.getTotalrate() == null ? other.getTotalrate() == null : this.getTotalrate().equals(other.getTotalrate()))
            && (this.getTypeno() == null ? other.getTypeno() == null : this.getTypeno().equals(other.getTypeno()))
            && (this.getManagerate() == null ? other.getManagerate() == null : this.getManagerate().equals(other.getManagerate()))
            && (this.getServerrate() == null ? other.getServerrate() == null : this.getServerrate().equals(other.getServerrate()))
            && (this.getInsurancerate() == null ? other.getInsurancerate() == null : this.getInsurancerate().equals(other.getInsurancerate()))
            && (this.getServerfee() == null ? other.getServerfee() == null : this.getServerfee().equals(other.getServerfee()))
            && (this.getAheadfee() == null ? other.getAheadfee() == null : this.getAheadfee().equals(other.getAheadfee()))
            && (this.getBondrate() == null ? other.getBondrate() == null : this.getBondrate().equals(other.getBondrate()))
            && (this.getSerrate() == null ? other.getSerrate() == null : this.getSerrate().equals(other.getSerrate()))
            && (this.getGetcheckrate() == null ? other.getGetcheckrate() == null : this.getGetcheckrate().equals(other.getGetcheckrate()))
            && (this.getConsultRate() == null ? other.getConsultRate() == null : this.getConsultRate().equals(other.getConsultRate()))
            && (this.getPayfeerate() == null ? other.getPayfeerate() == null : this.getPayfeerate().equals(other.getPayfeerate()))
            && (this.getLoanfeerate() == null ? other.getLoanfeerate() == null : this.getLoanfeerate().equals(other.getLoanfeerate()))
            && (this.getServicefeerate() == null ? other.getServicefeerate() == null : this.getServicefeerate().equals(other.getServicefeerate()))
            && (this.getBusinessrate() == null ? other.getBusinessrate() == null : this.getBusinessrate().equals(other.getBusinessrate()))
            && (this.getUpdatetimestamp() == null ? other.getUpdatetimestamp() == null : this.getUpdatetimestamp().equals(other.getUpdatetimestamp()))
            && (this.getMinSaleShare() == null ? other.getMinSaleShare() == null : this.getMinSaleShare().equals(other.getMinSaleShare()))
            && (this.getMaxSaleShare() == null ? other.getMaxSaleShare() == null : this.getMaxSaleShare().equals(other.getMaxSaleShare()))
            && (this.getIncShare() == null ? other.getIncShare() == null : this.getIncShare().equals(other.getIncShare()))
            && (this.getPlatformRateOne() == null ? other.getPlatformRateOne() == null : this.getPlatformRateOne().equals(other.getPlatformRateOne()))
            && (this.getPlatformRateTwo() == null ? other.getPlatformRateTwo() == null : this.getPlatformRateTwo().equals(other.getPlatformRateTwo()))
            && (this.getFundChannel() == null ? other.getFundChannel() == null : this.getFundChannel().equals(other.getFundChannel()))
            && (this.getOverdueRateOne() == null ? other.getOverdueRateOne() == null : this.getOverdueRateOne().equals(other.getOverdueRateOne()))
            && (this.getOverdueRateTwo() == null ? other.getOverdueRateTwo() == null : this.getOverdueRateTwo().equals(other.getOverdueRateTwo()))
            && (this.getRepaymentType() == null ? other.getRepaymentType() == null : this.getRepaymentType().equals(other.getRepaymentType()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getShowType() == null ? other.getShowType() == null : this.getShowType().equals(other.getShowType()))
            && (this.getCapacityPeriod() == null ? other.getCapacityPeriod() == null : this.getCapacityPeriod().equals(other.getCapacityPeriod()))
            && (this.getCanBeRenew() == null ? other.getCanBeRenew() == null : this.getCanBeRenew().equals(other.getCanBeRenew()))
            && (this.getRenewTimes() == null ? other.getRenewTimes() == null : this.getRenewTimes().equals(other.getRenewTimes()))
            && (this.getRenewPeriod() == null ? other.getRenewPeriod() == null : this.getRenewPeriod().equals(other.getRenewPeriod()))
            && (this.getRenewFee() == null ? other.getRenewFee() == null : this.getRenewFee().equals(other.getRenewFee()))
            && (this.getCreditAuditFee() == null ? other.getCreditAuditFee() == null : this.getCreditAuditFee().equals(other.getCreditAuditFee()))
            && (this.getConsultingFee() == null ? other.getConsultingFee() == null : this.getConsultingFee().equals(other.getConsultingFee()))
            && (this.getLoanAmount() == null ? other.getLoanAmount() == null : this.getLoanAmount().equals(other.getLoanAmount()))
            && (this.getArrivalAmount() == null ? other.getArrivalAmount() == null : this.getArrivalAmount().equals(other.getArrivalAmount()))
            && (this.getProductNumber() == null ? other.getProductNumber() == null : this.getProductNumber().equals(other.getProductNumber()))
            && (this.getRateGroupNumber() == null ? other.getRateGroupNumber() == null : this.getRateGroupNumber().equals(other.getRateGroupNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTermno() == null) ? 0 : getTermno().hashCode());
        result = prime * result + ((getTerm() == null) ? 0 : getTerm().hashCode());
        result = prime * result + ((getTermunit() == null) ? 0 : getTermunit().hashCode());
        result = prime * result + ((getTermrate() == null) ? 0 : getTermrate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAhendterm() == null) ? 0 : getAhendterm().hashCode());
        result = prime * result + ((getAhendrate() == null) ? 0 : getAhendrate().hashCode());
        result = prime * result + ((getOverrate() == null) ? 0 : getOverrate().hashCode());
        result = prime * result + ((getConsultrate() == null) ? 0 : getConsultrate().hashCode());
        result = prime * result + ((getCheckrate() == null) ? 0 : getCheckrate().hashCode());
        result = prime * result + ((getTotalrate() == null) ? 0 : getTotalrate().hashCode());
        result = prime * result + ((getTypeno() == null) ? 0 : getTypeno().hashCode());
        result = prime * result + ((getManagerate() == null) ? 0 : getManagerate().hashCode());
        result = prime * result + ((getServerrate() == null) ? 0 : getServerrate().hashCode());
        result = prime * result + ((getInsurancerate() == null) ? 0 : getInsurancerate().hashCode());
        result = prime * result + ((getServerfee() == null) ? 0 : getServerfee().hashCode());
        result = prime * result + ((getAheadfee() == null) ? 0 : getAheadfee().hashCode());
        result = prime * result + ((getBondrate() == null) ? 0 : getBondrate().hashCode());
        result = prime * result + ((getSerrate() == null) ? 0 : getSerrate().hashCode());
        result = prime * result + ((getGetcheckrate() == null) ? 0 : getGetcheckrate().hashCode());
        result = prime * result + ((getConsultRate() == null) ? 0 : getConsultRate().hashCode());
        result = prime * result + ((getPayfeerate() == null) ? 0 : getPayfeerate().hashCode());
        result = prime * result + ((getLoanfeerate() == null) ? 0 : getLoanfeerate().hashCode());
        result = prime * result + ((getServicefeerate() == null) ? 0 : getServicefeerate().hashCode());
        result = prime * result + ((getBusinessrate() == null) ? 0 : getBusinessrate().hashCode());
        result = prime * result + ((getUpdatetimestamp() == null) ? 0 : getUpdatetimestamp().hashCode());
        result = prime * result + ((getMinSaleShare() == null) ? 0 : getMinSaleShare().hashCode());
        result = prime * result + ((getMaxSaleShare() == null) ? 0 : getMaxSaleShare().hashCode());
        result = prime * result + ((getIncShare() == null) ? 0 : getIncShare().hashCode());
        result = prime * result + ((getPlatformRateOne() == null) ? 0 : getPlatformRateOne().hashCode());
        result = prime * result + ((getPlatformRateTwo() == null) ? 0 : getPlatformRateTwo().hashCode());
        result = prime * result + ((getFundChannel() == null) ? 0 : getFundChannel().hashCode());
        result = prime * result + ((getOverdueRateOne() == null) ? 0 : getOverdueRateOne().hashCode());
        result = prime * result + ((getOverdueRateTwo() == null) ? 0 : getOverdueRateTwo().hashCode());
        result = prime * result + ((getRepaymentType() == null) ? 0 : getRepaymentType().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getShowType() == null) ? 0 : getShowType().hashCode());
        result = prime * result + ((getCapacityPeriod() == null) ? 0 : getCapacityPeriod().hashCode());
        result = prime * result + ((getCanBeRenew() == null) ? 0 : getCanBeRenew().hashCode());
        result = prime * result + ((getRenewTimes() == null) ? 0 : getRenewTimes().hashCode());
        result = prime * result + ((getRenewPeriod() == null) ? 0 : getRenewPeriod().hashCode());
        result = prime * result + ((getRenewFee() == null) ? 0 : getRenewFee().hashCode());
        result = prime * result + ((getCreditAuditFee() == null) ? 0 : getCreditAuditFee().hashCode());
        result = prime * result + ((getConsultingFee() == null) ? 0 : getConsultingFee().hashCode());
        result = prime * result + ((getLoanAmount() == null) ? 0 : getLoanAmount().hashCode());
        result = prime * result + ((getArrivalAmount() == null) ? 0 : getArrivalAmount().hashCode());
        result = prime * result + ((getProductNumber() == null) ? 0 : getProductNumber().hashCode());
        result = prime * result + ((getRateGroupNumber() == null) ? 0 : getRateGroupNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", termno=").append(termno);
        sb.append(", term=").append(term);
        sb.append(", termunit=").append(termunit);
        sb.append(", termrate=").append(termrate);
        sb.append(", status=").append(status);
        sb.append(", ahendterm=").append(ahendterm);
        sb.append(", ahendrate=").append(ahendrate);
        sb.append(", overrate=").append(overrate);
        sb.append(", consultrate=").append(consultrate);
        sb.append(", checkrate=").append(checkrate);
        sb.append(", totalrate=").append(totalrate);
        sb.append(", typeno=").append(typeno);
        sb.append(", managerate=").append(managerate);
        sb.append(", serverrate=").append(serverrate);
        sb.append(", insurancerate=").append(insurancerate);
        sb.append(", serverfee=").append(serverfee);
        sb.append(", aheadfee=").append(aheadfee);
        sb.append(", bondrate=").append(bondrate);
        sb.append(", serrate=").append(serrate);
        sb.append(", getcheckrate=").append(getcheckrate);
        sb.append(", consultRate=").append(consultRate);
        sb.append(", payfeerate=").append(payfeerate);
        sb.append(", loanfeerate=").append(loanfeerate);
        sb.append(", servicefeerate=").append(servicefeerate);
        sb.append(", businessrate=").append(businessrate);
        sb.append(", updatetimestamp=").append(updatetimestamp);
        sb.append(", minSaleShare=").append(minSaleShare);
        sb.append(", maxSaleShare=").append(maxSaleShare);
        sb.append(", incShare=").append(incShare);
        sb.append(", platformRateOne=").append(platformRateOne);
        sb.append(", platformRateTwo=").append(platformRateTwo);
        sb.append(", fundChannel=").append(fundChannel);
        sb.append(", overdueRateOne=").append(overdueRateOne);
        sb.append(", overdueRateTwo=").append(overdueRateTwo);
        sb.append(", repaymentType=").append(repaymentType);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", showType=").append(showType);
        sb.append(", capacityPeriod=").append(capacityPeriod);
        sb.append(", canBeRenew=").append(canBeRenew);
        sb.append(", renewTimes=").append(renewTimes);
        sb.append(", renewPeriod=").append(renewPeriod);
        sb.append(", renewFee=").append(renewFee);
        sb.append(", creditAuditFee=").append(creditAuditFee);
        sb.append(", consultingFee=").append(consultingFee);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", arrivalAmount=").append(arrivalAmount);
        sb.append(", productNumber=").append(productNumber);
        sb.append(", rateGroupNumber=").append(rateGroupNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}