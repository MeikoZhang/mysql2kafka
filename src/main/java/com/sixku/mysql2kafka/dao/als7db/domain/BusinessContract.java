package com.sixku.mysql2kafka.dao.als7db.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class BusinessContract implements Serializable {
    /**
     * 业务受理编号
     */
    private String serialno;

    /**
     * 客户编号
     */
    private String customerid;

    /**
     * 业务品种
     */
    private String businesstype;

    /**
     * 停用
     */
    private String bankcode;

    /**
     * 停用
     */
    private String bankcard;

    /**
     * 停用
     */
    private String bankcardphone;

    /**
     * 门店编号
     */
    private String shopsn;

    /**
     * 客服
     */
    private String customerservice;

    /**
     * 门店销售员
     */
    private String salersn;

    /**
     * 所属销售中心
     */
    private String salecentersn;

    /**
     * 申请期次
     */
    private String applyterm;

    /**
     * 期供
     */
    private BigDecimal monthrepay;

    /**
     * 贷款本金/销售价
     */
    private BigDecimal businesssum;

    /**
     * 手机设备号
     */
    private String imsi;

    /**
     * 操作系统
     */
    private String phoneos;

    /**
     * GPS坐标
     */
    private String gpslocation;

    /**
     * 订单编号
     */
    private String ordersn;

    /**
     * 合同期次
     */
    private String approveterm;

    /**
     * 分期汇价申请金额
     */
    private BigDecimal applysum;

    /**
     * 批复时间
     */
    private String approvetime;

    /**
     * 合同签约日
     */
    private String contractdate;

    /**
     * 确认收货时间
     */
    private String confirmtime;

    /**
     * 还款日期
     */
    private String paydate;

    /**
     * 还款方式
     */
    private String returntype;

    /**
     * 合同状态：10 合同签署完毕 ；20 退货申请；30 退货预审中 35 退货完成； 40 退货拒绝 50 结清
     */
    private String contractstatus;

    /**
     * 申请状态 ：10 申请建立；20 审批中；30 通过 40 否决
     */
    private String applystatus;

    /**
     * 申请开始时间
     */
    private String orderbegintime;

    /**
     * 申请结束时间
     */
    private String orderendtime;

    /**
     * 审批完成日期
     */
    private String approvedate;

    /**
     * 终结日期
     */
    private String finishdate;

    /**
     * 月利率
     */
    private BigDecimal businessrate;

    /**
     * 总费率
     */
    private BigDecimal totalrate;

    /**
     * 罚息日利率
     */
    private BigDecimal finerate;

    /**
     * 提前还款违约金比例
     */
    private BigDecimal aheadscale;

    /**
     * 标的状态  10 未发送 20 已发送  15 发送失败  30 还款中
     */
    private String targetstatus;

    /**
     * 分期汇总价审批金额
     */
    private BigDecimal approvesum;

    /**
     * 起息日
     */
    private String putoutdate;

    /**
     * 贷款到期日
     */
    private String maturitydate;

    /**
     * 提前还款违约金比例
     */
    private String ahendrate;

    /**
     * 是否放款
     */
    private String isputout;

    /**
     * 是否满标
     */
    private String isfulldeal;

    /**
     * 网信理财返回的业务编号
     */
    private String approvenumber;

    /**
     * 申请月供
     */
    private BigDecimal applymonthrepay;

    /**
     * skuId
     */
    private String skuid;

    /**
     * 贷款用途(code:loanuse)
     */
    private String loanuse;

    /**
     * 资金渠道 1网信理财  2自有资金
     */
    private String fundchannel;

    /**
     * 放款账号
     */
    private String accountno;

    /**
     * 放款账号开户行
     */
    private String accountbank;

    /**
     * 放款账号开户行编号
     */
    private String bankId;

    /**
     * 联行号
     */
    private String relevancebankno;

    /**
     * 放款帐号开户行所在地
     */
    private String accountaddress;

    /**
     * 放款帐号开户网点
     */
    private String accountnet;

    /**
     * 富有支付账号
     */
    private String fuyouaccount;

    /**
     * 支付方式
     */
    private String payway;

    /**
     * 家人是否知晓
     */
    private String isfamily;

    /**
     * 客户来源
     */
    private String source;

    /**
     * 贷款用途说明
     */
    private String loanusedesc;

    /**
     * 客户来源说明
     */
    private String sourcedesc;

    private String citycode;

    private String areacode;

    private String bankkind;

    private BigDecimal managerate;

    private BigDecimal serverrate;

    private BigDecimal insurancerate;

    private BigDecimal serverfee;

    private BigDecimal loanfeerate;

    private BigDecimal consultfeerate;

    private BigDecimal guaranteefeerate;

    private BigDecimal payfeerate;

    /**
     * 咨询费率
     */
    private BigDecimal consultrate;

    /**
     * 审核费率
     */
    private BigDecimal checkrate;

    /**
     * 提前还款锁定期
     */
    private String ahendterm;

    /**
     * 签约金额
     */
    private BigDecimal putoutsum;

    /**
     * 投资人收益率
     */
    private BigDecimal rate;

    /**
     * 标的id
     */
    private String dealid;

    /**
     * 团队主任
     */
    private String teamleader;

    private String outdataresuelt;

    private String refusemainreson;

    private String teamLeader;

    /**
     * 发送网信时间
     */
    private String sendTargetTime;

    /**
     * 总咨询服务费
     */
    private BigDecimal sumservicefee;

    /**
     * 总信用管理费
     */
    private BigDecimal sumcertidmanagefee;

    private Integer pbcReportId;

    private String pbcReportTime;

    /**
     * 更新时间
     */
    private Date updatetimestamp;

    /**
     * 上标操作人
     */
    private String sendTargetUser;

    /**
     * 上标操作人姓名
     */
    private String sendTargetUsername;

    /**
     * 授信金额
     */
    private BigDecimal creditAmount;

    /**
     * 信用评分
     */
    private String creditPoint;

    /**
     * 金融工场试算token
     */
    private String token;

    /**
     * 内匹环节注释
     */
    private String innerdescription;

    private BigDecimal afineRate2;

    /**
     * 内部资料备注
     */
    private String resourceDes;

    /**
     * 外部舆情备注
     */
    private String externalResourceDes;

    /**
     * 内匹备注
     */
    private String matchDes;

    /**
     * 工资流水备注
     */
    private String incomeTransactionDes;

    private String productcategory;

    /**
     * 平台费
     */
    private BigDecimal platformfee;

    /**
     * 总费用
     */
    private BigDecimal totalfee;

    /**
     * 支付费
     */
    private BigDecimal paymentfee;

    /**
     * 咨询服务费
     */
    private BigDecimal consultservicefee;

    /**
     * 是否正在发送资金端，Y/N
     */
    private String issending;

    /**
     * 罚息日利率2
     */
    private BigDecimal finerate2;

    private String channel;

    /**
     * 联合咨询费
     */
    private BigDecimal unionConsultationFee;

    /**
     * 客户来源渠道
     */
    private String customerSourceChannel;

    private String phonescore;

    private String phonescorelevel;

    /**
     * 期次单位
     */
    private String termUnit;

    /**
     * 平台费率1
     */
    private BigDecimal platformRateOne;

    /**
     * 平台费率2
     */
    private BigDecimal platformRateTwo;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 添加人
     */
    private String createUser;

    private String createTime;

    private String fallback;

    /**
     * 无需审核代码
     */
    private String autoFinish;

    private String bindCardTime;

    /**
     * 人脸识别，0-未人脸识别，1-人脸识别
     */
    private String faceRecognition;

    /**
     * 运营商：0:贷后邦，1：魔蝎，线下产品只有魔蝎
     */
    private Integer carrieroperator;

    /**
     * 魔蝎数据结果,为空-未采集,不为空-已采集
     */
    private String scorpio;

    /**
     * 魔蝎数据任务id
     */
    private String scorpiotaskid;

    /**
     * 线下放款0线上1线下
     */
    private Integer putoutOffline;

    /**
     * 优惠券ids
     */
    private String couponIds;

    /**
     * 意向id
     */
    private String intentionId;

    /**
     * 业务员编号
     */
    private String salesmanNo;

    /**
     * 业务员名称
     */
    private String salesmanName;

    /**
     * 上标版本
     */
    private String putoutVersion;

    /**
     * 个人信息是否补录完成
     */
    private String isRecordCompletion;

    private String videoFlag;

    private String videoFlag1;

    /**
     * 征信评分
     */
    private String creditScore;

    /**
     * 是否拉起网信页面Y/N
     */
    private String isOpenUrl;

    private static final long serialVersionUID = 1L;

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getBankcardphone() {
        return bankcardphone;
    }

    public void setBankcardphone(String bankcardphone) {
        this.bankcardphone = bankcardphone;
    }

    public String getShopsn() {
        return shopsn;
    }

    public void setShopsn(String shopsn) {
        this.shopsn = shopsn;
    }

    public String getCustomerservice() {
        return customerservice;
    }

    public void setCustomerservice(String customerservice) {
        this.customerservice = customerservice;
    }

    public String getSalersn() {
        return salersn;
    }

    public void setSalersn(String salersn) {
        this.salersn = salersn;
    }

    public String getSalecentersn() {
        return salecentersn;
    }

    public void setSalecentersn(String salecentersn) {
        this.salecentersn = salecentersn;
    }

    public String getApplyterm() {
        return applyterm;
    }

    public void setApplyterm(String applyterm) {
        this.applyterm = applyterm;
    }

    public BigDecimal getMonthrepay() {
        return monthrepay;
    }

    public void setMonthrepay(BigDecimal monthrepay) {
        this.monthrepay = monthrepay;
    }

    public BigDecimal getBusinesssum() {
        return businesssum;
    }

    public void setBusinesssum(BigDecimal businesssum) {
        this.businesssum = businesssum;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getPhoneos() {
        return phoneos;
    }

    public void setPhoneos(String phoneos) {
        this.phoneos = phoneos;
    }

    public String getGpslocation() {
        return gpslocation;
    }

    public void setGpslocation(String gpslocation) {
        this.gpslocation = gpslocation;
    }

    public String getOrdersn() {
        return ordersn;
    }

    public void setOrdersn(String ordersn) {
        this.ordersn = ordersn;
    }

    public String getApproveterm() {
        return approveterm;
    }

    public void setApproveterm(String approveterm) {
        this.approveterm = approveterm;
    }

    public BigDecimal getApplysum() {
        return applysum;
    }

    public void setApplysum(BigDecimal applysum) {
        this.applysum = applysum;
    }

    public String getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(String approvetime) {
        this.approvetime = approvetime;
    }

    public String getContractdate() {
        return contractdate;
    }

    public void setContractdate(String contractdate) {
        this.contractdate = contractdate;
    }

    public String getConfirmtime() {
        return confirmtime;
    }

    public void setConfirmtime(String confirmtime) {
        this.confirmtime = confirmtime;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    public String getReturntype() {
        return returntype;
    }

    public void setReturntype(String returntype) {
        this.returntype = returntype;
    }

    public String getContractstatus() {
        return contractstatus;
    }

    public void setContractstatus(String contractstatus) {
        this.contractstatus = contractstatus;
    }

    public String getApplystatus() {
        return applystatus;
    }

    public void setApplystatus(String applystatus) {
        this.applystatus = applystatus;
    }

    public String getOrderbegintime() {
        return orderbegintime;
    }

    public void setOrderbegintime(String orderbegintime) {
        this.orderbegintime = orderbegintime;
    }

    public String getOrderendtime() {
        return orderendtime;
    }

    public void setOrderendtime(String orderendtime) {
        this.orderendtime = orderendtime;
    }

    public String getApprovedate() {
        return approvedate;
    }

    public void setApprovedate(String approvedate) {
        this.approvedate = approvedate;
    }

    public String getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(String finishdate) {
        this.finishdate = finishdate;
    }

    public BigDecimal getBusinessrate() {
        return businessrate;
    }

    public void setBusinessrate(BigDecimal businessrate) {
        this.businessrate = businessrate;
    }

    public BigDecimal getTotalrate() {
        return totalrate;
    }

    public void setTotalrate(BigDecimal totalrate) {
        this.totalrate = totalrate;
    }

    public BigDecimal getFinerate() {
        return finerate;
    }

    public void setFinerate(BigDecimal finerate) {
        this.finerate = finerate;
    }

    public BigDecimal getAheadscale() {
        return aheadscale;
    }

    public void setAheadscale(BigDecimal aheadscale) {
        this.aheadscale = aheadscale;
    }

    public String getTargetstatus() {
        return targetstatus;
    }

    public void setTargetstatus(String targetstatus) {
        this.targetstatus = targetstatus;
    }

    public BigDecimal getApprovesum() {
        return approvesum;
    }

    public void setApprovesum(BigDecimal approvesum) {
        this.approvesum = approvesum;
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

    public String getAhendrate() {
        return ahendrate;
    }

    public void setAhendrate(String ahendrate) {
        this.ahendrate = ahendrate;
    }

    public String getIsputout() {
        return isputout;
    }

    public void setIsputout(String isputout) {
        this.isputout = isputout;
    }

    public String getIsfulldeal() {
        return isfulldeal;
    }

    public void setIsfulldeal(String isfulldeal) {
        this.isfulldeal = isfulldeal;
    }

    public String getApprovenumber() {
        return approvenumber;
    }

    public void setApprovenumber(String approvenumber) {
        this.approvenumber = approvenumber;
    }

    public BigDecimal getApplymonthrepay() {
        return applymonthrepay;
    }

    public void setApplymonthrepay(BigDecimal applymonthrepay) {
        this.applymonthrepay = applymonthrepay;
    }

    public String getSkuid() {
        return skuid;
    }

    public void setSkuid(String skuid) {
        this.skuid = skuid;
    }

    public String getLoanuse() {
        return loanuse;
    }

    public void setLoanuse(String loanuse) {
        this.loanuse = loanuse;
    }

    public String getFundchannel() {
        return fundchannel;
    }

    public void setFundchannel(String fundchannel) {
        this.fundchannel = fundchannel;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getAccountbank() {
        return accountbank;
    }

    public void setAccountbank(String accountbank) {
        this.accountbank = accountbank;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getRelevancebankno() {
        return relevancebankno;
    }

    public void setRelevancebankno(String relevancebankno) {
        this.relevancebankno = relevancebankno;
    }

    public String getAccountaddress() {
        return accountaddress;
    }

    public void setAccountaddress(String accountaddress) {
        this.accountaddress = accountaddress;
    }

    public String getAccountnet() {
        return accountnet;
    }

    public void setAccountnet(String accountnet) {
        this.accountnet = accountnet;
    }

    public String getFuyouaccount() {
        return fuyouaccount;
    }

    public void setFuyouaccount(String fuyouaccount) {
        this.fuyouaccount = fuyouaccount;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway;
    }

    public String getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(String isfamily) {
        this.isfamily = isfamily;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLoanusedesc() {
        return loanusedesc;
    }

    public void setLoanusedesc(String loanusedesc) {
        this.loanusedesc = loanusedesc;
    }

    public String getSourcedesc() {
        return sourcedesc;
    }

    public void setSourcedesc(String sourcedesc) {
        this.sourcedesc = sourcedesc;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getBankkind() {
        return bankkind;
    }

    public void setBankkind(String bankkind) {
        this.bankkind = bankkind;
    }

    public BigDecimal getManagerate() {
        return managerate;
    }

    public void setManagerate(BigDecimal managerate) {
        this.managerate = managerate;
    }

    public BigDecimal getServerrate() {
        return serverrate;
    }

    public void setServerrate(BigDecimal serverrate) {
        this.serverrate = serverrate;
    }

    public BigDecimal getInsurancerate() {
        return insurancerate;
    }

    public void setInsurancerate(BigDecimal insurancerate) {
        this.insurancerate = insurancerate;
    }

    public BigDecimal getServerfee() {
        return serverfee;
    }

    public void setServerfee(BigDecimal serverfee) {
        this.serverfee = serverfee;
    }

    public BigDecimal getLoanfeerate() {
        return loanfeerate;
    }

    public void setLoanfeerate(BigDecimal loanfeerate) {
        this.loanfeerate = loanfeerate;
    }

    public BigDecimal getConsultfeerate() {
        return consultfeerate;
    }

    public void setConsultfeerate(BigDecimal consultfeerate) {
        this.consultfeerate = consultfeerate;
    }

    public BigDecimal getGuaranteefeerate() {
        return guaranteefeerate;
    }

    public void setGuaranteefeerate(BigDecimal guaranteefeerate) {
        this.guaranteefeerate = guaranteefeerate;
    }

    public BigDecimal getPayfeerate() {
        return payfeerate;
    }

    public void setPayfeerate(BigDecimal payfeerate) {
        this.payfeerate = payfeerate;
    }

    public BigDecimal getConsultrate() {
        return consultrate;
    }

    public void setConsultrate(BigDecimal consultrate) {
        this.consultrate = consultrate;
    }

    public BigDecimal getCheckrate() {
        return checkrate;
    }

    public void setCheckrate(BigDecimal checkrate) {
        this.checkrate = checkrate;
    }

    public String getAhendterm() {
        return ahendterm;
    }

    public void setAhendterm(String ahendterm) {
        this.ahendterm = ahendterm;
    }

    public BigDecimal getPutoutsum() {
        return putoutsum;
    }

    public void setPutoutsum(BigDecimal putoutsum) {
        this.putoutsum = putoutsum;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getDealid() {
        return dealid;
    }

    public void setDealid(String dealid) {
        this.dealid = dealid;
    }

    public String getTeamleader() {
        return teamleader;
    }

    public void setTeamleader(String teamleader) {
        this.teamleader = teamleader;
    }

    public String getOutdataresuelt() {
        return outdataresuelt;
    }

    public void setOutdataresuelt(String outdataresuelt) {
        this.outdataresuelt = outdataresuelt;
    }

    public String getRefusemainreson() {
        return refusemainreson;
    }

    public void setRefusemainreson(String refusemainreson) {
        this.refusemainreson = refusemainreson;
    }

    public String getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(String teamLeader) {
        this.teamLeader = teamLeader;
    }

    public String getSendTargetTime() {
        return sendTargetTime;
    }

    public void setSendTargetTime(String sendTargetTime) {
        this.sendTargetTime = sendTargetTime;
    }

    public BigDecimal getSumservicefee() {
        return sumservicefee;
    }

    public void setSumservicefee(BigDecimal sumservicefee) {
        this.sumservicefee = sumservicefee;
    }

    public BigDecimal getSumcertidmanagefee() {
        return sumcertidmanagefee;
    }

    public void setSumcertidmanagefee(BigDecimal sumcertidmanagefee) {
        this.sumcertidmanagefee = sumcertidmanagefee;
    }

    public Integer getPbcReportId() {
        return pbcReportId;
    }

    public void setPbcReportId(Integer pbcReportId) {
        this.pbcReportId = pbcReportId;
    }

    public String getPbcReportTime() {
        return pbcReportTime;
    }

    public void setPbcReportTime(String pbcReportTime) {
        this.pbcReportTime = pbcReportTime;
    }

    public Date getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(Date updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    public String getSendTargetUser() {
        return sendTargetUser;
    }

    public void setSendTargetUser(String sendTargetUser) {
        this.sendTargetUser = sendTargetUser;
    }

    public String getSendTargetUsername() {
        return sendTargetUsername;
    }

    public void setSendTargetUsername(String sendTargetUsername) {
        this.sendTargetUsername = sendTargetUsername;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCreditPoint() {
        return creditPoint;
    }

    public void setCreditPoint(String creditPoint) {
        this.creditPoint = creditPoint;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getInnerdescription() {
        return innerdescription;
    }

    public void setInnerdescription(String innerdescription) {
        this.innerdescription = innerdescription;
    }

    public BigDecimal getAfineRate2() {
        return afineRate2;
    }

    public void setAfineRate2(BigDecimal afineRate2) {
        this.afineRate2 = afineRate2;
    }

    public String getResourceDes() {
        return resourceDes;
    }

    public void setResourceDes(String resourceDes) {
        this.resourceDes = resourceDes;
    }

    public String getExternalResourceDes() {
        return externalResourceDes;
    }

    public void setExternalResourceDes(String externalResourceDes) {
        this.externalResourceDes = externalResourceDes;
    }

    public String getMatchDes() {
        return matchDes;
    }

    public void setMatchDes(String matchDes) {
        this.matchDes = matchDes;
    }

    public String getIncomeTransactionDes() {
        return incomeTransactionDes;
    }

    public void setIncomeTransactionDes(String incomeTransactionDes) {
        this.incomeTransactionDes = incomeTransactionDes;
    }

    public String getProductcategory() {
        return productcategory;
    }

    public void setProductcategory(String productcategory) {
        this.productcategory = productcategory;
    }

    public BigDecimal getPlatformfee() {
        return platformfee;
    }

    public void setPlatformfee(BigDecimal platformfee) {
        this.platformfee = platformfee;
    }

    public BigDecimal getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(BigDecimal totalfee) {
        this.totalfee = totalfee;
    }

    public BigDecimal getPaymentfee() {
        return paymentfee;
    }

    public void setPaymentfee(BigDecimal paymentfee) {
        this.paymentfee = paymentfee;
    }

    public BigDecimal getConsultservicefee() {
        return consultservicefee;
    }

    public void setConsultservicefee(BigDecimal consultservicefee) {
        this.consultservicefee = consultservicefee;
    }

    public String getIssending() {
        return issending;
    }

    public void setIssending(String issending) {
        this.issending = issending;
    }

    public BigDecimal getFinerate2() {
        return finerate2;
    }

    public void setFinerate2(BigDecimal finerate2) {
        this.finerate2 = finerate2;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public BigDecimal getUnionConsultationFee() {
        return unionConsultationFee;
    }

    public void setUnionConsultationFee(BigDecimal unionConsultationFee) {
        this.unionConsultationFee = unionConsultationFee;
    }

    public String getCustomerSourceChannel() {
        return customerSourceChannel;
    }

    public void setCustomerSourceChannel(String customerSourceChannel) {
        this.customerSourceChannel = customerSourceChannel;
    }

    public String getPhonescore() {
        return phonescore;
    }

    public void setPhonescore(String phonescore) {
        this.phonescore = phonescore;
    }

    public String getPhonescorelevel() {
        return phonescorelevel;
    }

    public void setPhonescorelevel(String phonescorelevel) {
        this.phonescorelevel = phonescorelevel;
    }

    public String getTermUnit() {
        return termUnit;
    }

    public void setTermUnit(String termUnit) {
        this.termUnit = termUnit;
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

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
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

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public String getAutoFinish() {
        return autoFinish;
    }

    public void setAutoFinish(String autoFinish) {
        this.autoFinish = autoFinish;
    }

    public String getBindCardTime() {
        return bindCardTime;
    }

    public void setBindCardTime(String bindCardTime) {
        this.bindCardTime = bindCardTime;
    }

    public String getFaceRecognition() {
        return faceRecognition;
    }

    public void setFaceRecognition(String faceRecognition) {
        this.faceRecognition = faceRecognition;
    }

    public Integer getCarrieroperator() {
        return carrieroperator;
    }

    public void setCarrieroperator(Integer carrieroperator) {
        this.carrieroperator = carrieroperator;
    }

    public String getScorpio() {
        return scorpio;
    }

    public void setScorpio(String scorpio) {
        this.scorpio = scorpio;
    }

    public String getScorpiotaskid() {
        return scorpiotaskid;
    }

    public void setScorpiotaskid(String scorpiotaskid) {
        this.scorpiotaskid = scorpiotaskid;
    }

    public Integer getPutoutOffline() {
        return putoutOffline;
    }

    public void setPutoutOffline(Integer putoutOffline) {
        this.putoutOffline = putoutOffline;
    }

    public String getCouponIds() {
        return couponIds;
    }

    public void setCouponIds(String couponIds) {
        this.couponIds = couponIds;
    }

    public String getIntentionId() {
        return intentionId;
    }

    public void setIntentionId(String intentionId) {
        this.intentionId = intentionId;
    }

    public String getSalesmanNo() {
        return salesmanNo;
    }

    public void setSalesmanNo(String salesmanNo) {
        this.salesmanNo = salesmanNo;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getPutoutVersion() {
        return putoutVersion;
    }

    public void setPutoutVersion(String putoutVersion) {
        this.putoutVersion = putoutVersion;
    }

    public String getIsRecordCompletion() {
        return isRecordCompletion;
    }

    public void setIsRecordCompletion(String isRecordCompletion) {
        this.isRecordCompletion = isRecordCompletion;
    }

    public String getVideoFlag() {
        return videoFlag;
    }

    public void setVideoFlag(String videoFlag) {
        this.videoFlag = videoFlag;
    }

    public String getVideoFlag1() {
        return videoFlag1;
    }

    public void setVideoFlag1(String videoFlag1) {
        this.videoFlag1 = videoFlag1;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public String getIsOpenUrl() {
        return isOpenUrl;
    }

    public void setIsOpenUrl(String isOpenUrl) {
        this.isOpenUrl = isOpenUrl;
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
        BusinessContract other = (BusinessContract) that;
        return (this.getSerialno() == null ? other.getSerialno() == null : this.getSerialno().equals(other.getSerialno()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getBusinesstype() == null ? other.getBusinesstype() == null : this.getBusinesstype().equals(other.getBusinesstype()))
            && (this.getBankcode() == null ? other.getBankcode() == null : this.getBankcode().equals(other.getBankcode()))
            && (this.getBankcard() == null ? other.getBankcard() == null : this.getBankcard().equals(other.getBankcard()))
            && (this.getBankcardphone() == null ? other.getBankcardphone() == null : this.getBankcardphone().equals(other.getBankcardphone()))
            && (this.getShopsn() == null ? other.getShopsn() == null : this.getShopsn().equals(other.getShopsn()))
            && (this.getCustomerservice() == null ? other.getCustomerservice() == null : this.getCustomerservice().equals(other.getCustomerservice()))
            && (this.getSalersn() == null ? other.getSalersn() == null : this.getSalersn().equals(other.getSalersn()))
            && (this.getSalecentersn() == null ? other.getSalecentersn() == null : this.getSalecentersn().equals(other.getSalecentersn()))
            && (this.getApplyterm() == null ? other.getApplyterm() == null : this.getApplyterm().equals(other.getApplyterm()))
            && (this.getMonthrepay() == null ? other.getMonthrepay() == null : this.getMonthrepay().equals(other.getMonthrepay()))
            && (this.getBusinesssum() == null ? other.getBusinesssum() == null : this.getBusinesssum().equals(other.getBusinesssum()))
            && (this.getImsi() == null ? other.getImsi() == null : this.getImsi().equals(other.getImsi()))
            && (this.getPhoneos() == null ? other.getPhoneos() == null : this.getPhoneos().equals(other.getPhoneos()))
            && (this.getGpslocation() == null ? other.getGpslocation() == null : this.getGpslocation().equals(other.getGpslocation()))
            && (this.getOrdersn() == null ? other.getOrdersn() == null : this.getOrdersn().equals(other.getOrdersn()))
            && (this.getApproveterm() == null ? other.getApproveterm() == null : this.getApproveterm().equals(other.getApproveterm()))
            && (this.getApplysum() == null ? other.getApplysum() == null : this.getApplysum().equals(other.getApplysum()))
            && (this.getApprovetime() == null ? other.getApprovetime() == null : this.getApprovetime().equals(other.getApprovetime()))
            && (this.getContractdate() == null ? other.getContractdate() == null : this.getContractdate().equals(other.getContractdate()))
            && (this.getConfirmtime() == null ? other.getConfirmtime() == null : this.getConfirmtime().equals(other.getConfirmtime()))
            && (this.getPaydate() == null ? other.getPaydate() == null : this.getPaydate().equals(other.getPaydate()))
            && (this.getReturntype() == null ? other.getReturntype() == null : this.getReturntype().equals(other.getReturntype()))
            && (this.getContractstatus() == null ? other.getContractstatus() == null : this.getContractstatus().equals(other.getContractstatus()))
            && (this.getApplystatus() == null ? other.getApplystatus() == null : this.getApplystatus().equals(other.getApplystatus()))
            && (this.getOrderbegintime() == null ? other.getOrderbegintime() == null : this.getOrderbegintime().equals(other.getOrderbegintime()))
            && (this.getOrderendtime() == null ? other.getOrderendtime() == null : this.getOrderendtime().equals(other.getOrderendtime()))
            && (this.getApprovedate() == null ? other.getApprovedate() == null : this.getApprovedate().equals(other.getApprovedate()))
            && (this.getFinishdate() == null ? other.getFinishdate() == null : this.getFinishdate().equals(other.getFinishdate()))
            && (this.getBusinessrate() == null ? other.getBusinessrate() == null : this.getBusinessrate().equals(other.getBusinessrate()))
            && (this.getTotalrate() == null ? other.getTotalrate() == null : this.getTotalrate().equals(other.getTotalrate()))
            && (this.getFinerate() == null ? other.getFinerate() == null : this.getFinerate().equals(other.getFinerate()))
            && (this.getAheadscale() == null ? other.getAheadscale() == null : this.getAheadscale().equals(other.getAheadscale()))
            && (this.getTargetstatus() == null ? other.getTargetstatus() == null : this.getTargetstatus().equals(other.getTargetstatus()))
            && (this.getApprovesum() == null ? other.getApprovesum() == null : this.getApprovesum().equals(other.getApprovesum()))
            && (this.getPutoutdate() == null ? other.getPutoutdate() == null : this.getPutoutdate().equals(other.getPutoutdate()))
            && (this.getMaturitydate() == null ? other.getMaturitydate() == null : this.getMaturitydate().equals(other.getMaturitydate()))
            && (this.getAhendrate() == null ? other.getAhendrate() == null : this.getAhendrate().equals(other.getAhendrate()))
            && (this.getIsputout() == null ? other.getIsputout() == null : this.getIsputout().equals(other.getIsputout()))
            && (this.getIsfulldeal() == null ? other.getIsfulldeal() == null : this.getIsfulldeal().equals(other.getIsfulldeal()))
            && (this.getApprovenumber() == null ? other.getApprovenumber() == null : this.getApprovenumber().equals(other.getApprovenumber()))
            && (this.getApplymonthrepay() == null ? other.getApplymonthrepay() == null : this.getApplymonthrepay().equals(other.getApplymonthrepay()))
            && (this.getSkuid() == null ? other.getSkuid() == null : this.getSkuid().equals(other.getSkuid()))
            && (this.getLoanuse() == null ? other.getLoanuse() == null : this.getLoanuse().equals(other.getLoanuse()))
            && (this.getFundchannel() == null ? other.getFundchannel() == null : this.getFundchannel().equals(other.getFundchannel()))
            && (this.getAccountno() == null ? other.getAccountno() == null : this.getAccountno().equals(other.getAccountno()))
            && (this.getAccountbank() == null ? other.getAccountbank() == null : this.getAccountbank().equals(other.getAccountbank()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getRelevancebankno() == null ? other.getRelevancebankno() == null : this.getRelevancebankno().equals(other.getRelevancebankno()))
            && (this.getAccountaddress() == null ? other.getAccountaddress() == null : this.getAccountaddress().equals(other.getAccountaddress()))
            && (this.getAccountnet() == null ? other.getAccountnet() == null : this.getAccountnet().equals(other.getAccountnet()))
            && (this.getFuyouaccount() == null ? other.getFuyouaccount() == null : this.getFuyouaccount().equals(other.getFuyouaccount()))
            && (this.getPayway() == null ? other.getPayway() == null : this.getPayway().equals(other.getPayway()))
            && (this.getIsfamily() == null ? other.getIsfamily() == null : this.getIsfamily().equals(other.getIsfamily()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getLoanusedesc() == null ? other.getLoanusedesc() == null : this.getLoanusedesc().equals(other.getLoanusedesc()))
            && (this.getSourcedesc() == null ? other.getSourcedesc() == null : this.getSourcedesc().equals(other.getSourcedesc()))
            && (this.getCitycode() == null ? other.getCitycode() == null : this.getCitycode().equals(other.getCitycode()))
            && (this.getAreacode() == null ? other.getAreacode() == null : this.getAreacode().equals(other.getAreacode()))
            && (this.getBankkind() == null ? other.getBankkind() == null : this.getBankkind().equals(other.getBankkind()))
            && (this.getManagerate() == null ? other.getManagerate() == null : this.getManagerate().equals(other.getManagerate()))
            && (this.getServerrate() == null ? other.getServerrate() == null : this.getServerrate().equals(other.getServerrate()))
            && (this.getInsurancerate() == null ? other.getInsurancerate() == null : this.getInsurancerate().equals(other.getInsurancerate()))
            && (this.getServerfee() == null ? other.getServerfee() == null : this.getServerfee().equals(other.getServerfee()))
            && (this.getLoanfeerate() == null ? other.getLoanfeerate() == null : this.getLoanfeerate().equals(other.getLoanfeerate()))
            && (this.getConsultfeerate() == null ? other.getConsultfeerate() == null : this.getConsultfeerate().equals(other.getConsultfeerate()))
            && (this.getGuaranteefeerate() == null ? other.getGuaranteefeerate() == null : this.getGuaranteefeerate().equals(other.getGuaranteefeerate()))
            && (this.getPayfeerate() == null ? other.getPayfeerate() == null : this.getPayfeerate().equals(other.getPayfeerate()))
            && (this.getConsultrate() == null ? other.getConsultrate() == null : this.getConsultrate().equals(other.getConsultrate()))
            && (this.getCheckrate() == null ? other.getCheckrate() == null : this.getCheckrate().equals(other.getCheckrate()))
            && (this.getAhendterm() == null ? other.getAhendterm() == null : this.getAhendterm().equals(other.getAhendterm()))
            && (this.getPutoutsum() == null ? other.getPutoutsum() == null : this.getPutoutsum().equals(other.getPutoutsum()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getDealid() == null ? other.getDealid() == null : this.getDealid().equals(other.getDealid()))
            && (this.getTeamleader() == null ? other.getTeamleader() == null : this.getTeamleader().equals(other.getTeamleader()))
            && (this.getOutdataresuelt() == null ? other.getOutdataresuelt() == null : this.getOutdataresuelt().equals(other.getOutdataresuelt()))
            && (this.getRefusemainreson() == null ? other.getRefusemainreson() == null : this.getRefusemainreson().equals(other.getRefusemainreson()))
            && (this.getTeamLeader() == null ? other.getTeamLeader() == null : this.getTeamLeader().equals(other.getTeamLeader()))
            && (this.getSendTargetTime() == null ? other.getSendTargetTime() == null : this.getSendTargetTime().equals(other.getSendTargetTime()))
            && (this.getSumservicefee() == null ? other.getSumservicefee() == null : this.getSumservicefee().equals(other.getSumservicefee()))
            && (this.getSumcertidmanagefee() == null ? other.getSumcertidmanagefee() == null : this.getSumcertidmanagefee().equals(other.getSumcertidmanagefee()))
            && (this.getPbcReportId() == null ? other.getPbcReportId() == null : this.getPbcReportId().equals(other.getPbcReportId()))
            && (this.getPbcReportTime() == null ? other.getPbcReportTime() == null : this.getPbcReportTime().equals(other.getPbcReportTime()))
            && (this.getUpdatetimestamp() == null ? other.getUpdatetimestamp() == null : this.getUpdatetimestamp().equals(other.getUpdatetimestamp()))
            && (this.getSendTargetUser() == null ? other.getSendTargetUser() == null : this.getSendTargetUser().equals(other.getSendTargetUser()))
            && (this.getSendTargetUsername() == null ? other.getSendTargetUsername() == null : this.getSendTargetUsername().equals(other.getSendTargetUsername()))
            && (this.getCreditAmount() == null ? other.getCreditAmount() == null : this.getCreditAmount().equals(other.getCreditAmount()))
            && (this.getCreditPoint() == null ? other.getCreditPoint() == null : this.getCreditPoint().equals(other.getCreditPoint()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getInnerdescription() == null ? other.getInnerdescription() == null : this.getInnerdescription().equals(other.getInnerdescription()))
            && (this.getAfineRate2() == null ? other.getAfineRate2() == null : this.getAfineRate2().equals(other.getAfineRate2()))
            && (this.getResourceDes() == null ? other.getResourceDes() == null : this.getResourceDes().equals(other.getResourceDes()))
            && (this.getExternalResourceDes() == null ? other.getExternalResourceDes() == null : this.getExternalResourceDes().equals(other.getExternalResourceDes()))
            && (this.getMatchDes() == null ? other.getMatchDes() == null : this.getMatchDes().equals(other.getMatchDes()))
            && (this.getIncomeTransactionDes() == null ? other.getIncomeTransactionDes() == null : this.getIncomeTransactionDes().equals(other.getIncomeTransactionDes()))
            && (this.getProductcategory() == null ? other.getProductcategory() == null : this.getProductcategory().equals(other.getProductcategory()))
            && (this.getPlatformfee() == null ? other.getPlatformfee() == null : this.getPlatformfee().equals(other.getPlatformfee()))
            && (this.getTotalfee() == null ? other.getTotalfee() == null : this.getTotalfee().equals(other.getTotalfee()))
            && (this.getPaymentfee() == null ? other.getPaymentfee() == null : this.getPaymentfee().equals(other.getPaymentfee()))
            && (this.getConsultservicefee() == null ? other.getConsultservicefee() == null : this.getConsultservicefee().equals(other.getConsultservicefee()))
            && (this.getIssending() == null ? other.getIssending() == null : this.getIssending().equals(other.getIssending()))
            && (this.getFinerate2() == null ? other.getFinerate2() == null : this.getFinerate2().equals(other.getFinerate2()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getUnionConsultationFee() == null ? other.getUnionConsultationFee() == null : this.getUnionConsultationFee().equals(other.getUnionConsultationFee()))
            && (this.getCustomerSourceChannel() == null ? other.getCustomerSourceChannel() == null : this.getCustomerSourceChannel().equals(other.getCustomerSourceChannel()))
            && (this.getPhonescore() == null ? other.getPhonescore() == null : this.getPhonescore().equals(other.getPhonescore()))
            && (this.getPhonescorelevel() == null ? other.getPhonescorelevel() == null : this.getPhonescorelevel().equals(other.getPhonescorelevel()))
            && (this.getTermUnit() == null ? other.getTermUnit() == null : this.getTermUnit().equals(other.getTermUnit()))
            && (this.getPlatformRateOne() == null ? other.getPlatformRateOne() == null : this.getPlatformRateOne().equals(other.getPlatformRateOne()))
            && (this.getPlatformRateTwo() == null ? other.getPlatformRateTwo() == null : this.getPlatformRateTwo().equals(other.getPlatformRateTwo()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getFallback() == null ? other.getFallback() == null : this.getFallback().equals(other.getFallback()))
            && (this.getAutoFinish() == null ? other.getAutoFinish() == null : this.getAutoFinish().equals(other.getAutoFinish()))
            && (this.getBindCardTime() == null ? other.getBindCardTime() == null : this.getBindCardTime().equals(other.getBindCardTime()))
            && (this.getFaceRecognition() == null ? other.getFaceRecognition() == null : this.getFaceRecognition().equals(other.getFaceRecognition()))
            && (this.getCarrieroperator() == null ? other.getCarrieroperator() == null : this.getCarrieroperator().equals(other.getCarrieroperator()))
            && (this.getScorpio() == null ? other.getScorpio() == null : this.getScorpio().equals(other.getScorpio()))
            && (this.getScorpiotaskid() == null ? other.getScorpiotaskid() == null : this.getScorpiotaskid().equals(other.getScorpiotaskid()))
            && (this.getPutoutOffline() == null ? other.getPutoutOffline() == null : this.getPutoutOffline().equals(other.getPutoutOffline()))
            && (this.getCouponIds() == null ? other.getCouponIds() == null : this.getCouponIds().equals(other.getCouponIds()))
            && (this.getIntentionId() == null ? other.getIntentionId() == null : this.getIntentionId().equals(other.getIntentionId()))
            && (this.getSalesmanNo() == null ? other.getSalesmanNo() == null : this.getSalesmanNo().equals(other.getSalesmanNo()))
            && (this.getSalesmanName() == null ? other.getSalesmanName() == null : this.getSalesmanName().equals(other.getSalesmanName()))
            && (this.getPutoutVersion() == null ? other.getPutoutVersion() == null : this.getPutoutVersion().equals(other.getPutoutVersion()))
            && (this.getIsRecordCompletion() == null ? other.getIsRecordCompletion() == null : this.getIsRecordCompletion().equals(other.getIsRecordCompletion()))
            && (this.getVideoFlag() == null ? other.getVideoFlag() == null : this.getVideoFlag().equals(other.getVideoFlag()))
            && (this.getVideoFlag1() == null ? other.getVideoFlag1() == null : this.getVideoFlag1().equals(other.getVideoFlag1()))
            && (this.getCreditScore() == null ? other.getCreditScore() == null : this.getCreditScore().equals(other.getCreditScore()))
            && (this.getIsOpenUrl() == null ? other.getIsOpenUrl() == null : this.getIsOpenUrl().equals(other.getIsOpenUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSerialno() == null) ? 0 : getSerialno().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getBusinesstype() == null) ? 0 : getBusinesstype().hashCode());
        result = prime * result + ((getBankcode() == null) ? 0 : getBankcode().hashCode());
        result = prime * result + ((getBankcard() == null) ? 0 : getBankcard().hashCode());
        result = prime * result + ((getBankcardphone() == null) ? 0 : getBankcardphone().hashCode());
        result = prime * result + ((getShopsn() == null) ? 0 : getShopsn().hashCode());
        result = prime * result + ((getCustomerservice() == null) ? 0 : getCustomerservice().hashCode());
        result = prime * result + ((getSalersn() == null) ? 0 : getSalersn().hashCode());
        result = prime * result + ((getSalecentersn() == null) ? 0 : getSalecentersn().hashCode());
        result = prime * result + ((getApplyterm() == null) ? 0 : getApplyterm().hashCode());
        result = prime * result + ((getMonthrepay() == null) ? 0 : getMonthrepay().hashCode());
        result = prime * result + ((getBusinesssum() == null) ? 0 : getBusinesssum().hashCode());
        result = prime * result + ((getImsi() == null) ? 0 : getImsi().hashCode());
        result = prime * result + ((getPhoneos() == null) ? 0 : getPhoneos().hashCode());
        result = prime * result + ((getGpslocation() == null) ? 0 : getGpslocation().hashCode());
        result = prime * result + ((getOrdersn() == null) ? 0 : getOrdersn().hashCode());
        result = prime * result + ((getApproveterm() == null) ? 0 : getApproveterm().hashCode());
        result = prime * result + ((getApplysum() == null) ? 0 : getApplysum().hashCode());
        result = prime * result + ((getApprovetime() == null) ? 0 : getApprovetime().hashCode());
        result = prime * result + ((getContractdate() == null) ? 0 : getContractdate().hashCode());
        result = prime * result + ((getConfirmtime() == null) ? 0 : getConfirmtime().hashCode());
        result = prime * result + ((getPaydate() == null) ? 0 : getPaydate().hashCode());
        result = prime * result + ((getReturntype() == null) ? 0 : getReturntype().hashCode());
        result = prime * result + ((getContractstatus() == null) ? 0 : getContractstatus().hashCode());
        result = prime * result + ((getApplystatus() == null) ? 0 : getApplystatus().hashCode());
        result = prime * result + ((getOrderbegintime() == null) ? 0 : getOrderbegintime().hashCode());
        result = prime * result + ((getOrderendtime() == null) ? 0 : getOrderendtime().hashCode());
        result = prime * result + ((getApprovedate() == null) ? 0 : getApprovedate().hashCode());
        result = prime * result + ((getFinishdate() == null) ? 0 : getFinishdate().hashCode());
        result = prime * result + ((getBusinessrate() == null) ? 0 : getBusinessrate().hashCode());
        result = prime * result + ((getTotalrate() == null) ? 0 : getTotalrate().hashCode());
        result = prime * result + ((getFinerate() == null) ? 0 : getFinerate().hashCode());
        result = prime * result + ((getAheadscale() == null) ? 0 : getAheadscale().hashCode());
        result = prime * result + ((getTargetstatus() == null) ? 0 : getTargetstatus().hashCode());
        result = prime * result + ((getApprovesum() == null) ? 0 : getApprovesum().hashCode());
        result = prime * result + ((getPutoutdate() == null) ? 0 : getPutoutdate().hashCode());
        result = prime * result + ((getMaturitydate() == null) ? 0 : getMaturitydate().hashCode());
        result = prime * result + ((getAhendrate() == null) ? 0 : getAhendrate().hashCode());
        result = prime * result + ((getIsputout() == null) ? 0 : getIsputout().hashCode());
        result = prime * result + ((getIsfulldeal() == null) ? 0 : getIsfulldeal().hashCode());
        result = prime * result + ((getApprovenumber() == null) ? 0 : getApprovenumber().hashCode());
        result = prime * result + ((getApplymonthrepay() == null) ? 0 : getApplymonthrepay().hashCode());
        result = prime * result + ((getSkuid() == null) ? 0 : getSkuid().hashCode());
        result = prime * result + ((getLoanuse() == null) ? 0 : getLoanuse().hashCode());
        result = prime * result + ((getFundchannel() == null) ? 0 : getFundchannel().hashCode());
        result = prime * result + ((getAccountno() == null) ? 0 : getAccountno().hashCode());
        result = prime * result + ((getAccountbank() == null) ? 0 : getAccountbank().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getRelevancebankno() == null) ? 0 : getRelevancebankno().hashCode());
        result = prime * result + ((getAccountaddress() == null) ? 0 : getAccountaddress().hashCode());
        result = prime * result + ((getAccountnet() == null) ? 0 : getAccountnet().hashCode());
        result = prime * result + ((getFuyouaccount() == null) ? 0 : getFuyouaccount().hashCode());
        result = prime * result + ((getPayway() == null) ? 0 : getPayway().hashCode());
        result = prime * result + ((getIsfamily() == null) ? 0 : getIsfamily().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getLoanusedesc() == null) ? 0 : getLoanusedesc().hashCode());
        result = prime * result + ((getSourcedesc() == null) ? 0 : getSourcedesc().hashCode());
        result = prime * result + ((getCitycode() == null) ? 0 : getCitycode().hashCode());
        result = prime * result + ((getAreacode() == null) ? 0 : getAreacode().hashCode());
        result = prime * result + ((getBankkind() == null) ? 0 : getBankkind().hashCode());
        result = prime * result + ((getManagerate() == null) ? 0 : getManagerate().hashCode());
        result = prime * result + ((getServerrate() == null) ? 0 : getServerrate().hashCode());
        result = prime * result + ((getInsurancerate() == null) ? 0 : getInsurancerate().hashCode());
        result = prime * result + ((getServerfee() == null) ? 0 : getServerfee().hashCode());
        result = prime * result + ((getLoanfeerate() == null) ? 0 : getLoanfeerate().hashCode());
        result = prime * result + ((getConsultfeerate() == null) ? 0 : getConsultfeerate().hashCode());
        result = prime * result + ((getGuaranteefeerate() == null) ? 0 : getGuaranteefeerate().hashCode());
        result = prime * result + ((getPayfeerate() == null) ? 0 : getPayfeerate().hashCode());
        result = prime * result + ((getConsultrate() == null) ? 0 : getConsultrate().hashCode());
        result = prime * result + ((getCheckrate() == null) ? 0 : getCheckrate().hashCode());
        result = prime * result + ((getAhendterm() == null) ? 0 : getAhendterm().hashCode());
        result = prime * result + ((getPutoutsum() == null) ? 0 : getPutoutsum().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getDealid() == null) ? 0 : getDealid().hashCode());
        result = prime * result + ((getTeamleader() == null) ? 0 : getTeamleader().hashCode());
        result = prime * result + ((getOutdataresuelt() == null) ? 0 : getOutdataresuelt().hashCode());
        result = prime * result + ((getRefusemainreson() == null) ? 0 : getRefusemainreson().hashCode());
        result = prime * result + ((getTeamLeader() == null) ? 0 : getTeamLeader().hashCode());
        result = prime * result + ((getSendTargetTime() == null) ? 0 : getSendTargetTime().hashCode());
        result = prime * result + ((getSumservicefee() == null) ? 0 : getSumservicefee().hashCode());
        result = prime * result + ((getSumcertidmanagefee() == null) ? 0 : getSumcertidmanagefee().hashCode());
        result = prime * result + ((getPbcReportId() == null) ? 0 : getPbcReportId().hashCode());
        result = prime * result + ((getPbcReportTime() == null) ? 0 : getPbcReportTime().hashCode());
        result = prime * result + ((getUpdatetimestamp() == null) ? 0 : getUpdatetimestamp().hashCode());
        result = prime * result + ((getSendTargetUser() == null) ? 0 : getSendTargetUser().hashCode());
        result = prime * result + ((getSendTargetUsername() == null) ? 0 : getSendTargetUsername().hashCode());
        result = prime * result + ((getCreditAmount() == null) ? 0 : getCreditAmount().hashCode());
        result = prime * result + ((getCreditPoint() == null) ? 0 : getCreditPoint().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getInnerdescription() == null) ? 0 : getInnerdescription().hashCode());
        result = prime * result + ((getAfineRate2() == null) ? 0 : getAfineRate2().hashCode());
        result = prime * result + ((getResourceDes() == null) ? 0 : getResourceDes().hashCode());
        result = prime * result + ((getExternalResourceDes() == null) ? 0 : getExternalResourceDes().hashCode());
        result = prime * result + ((getMatchDes() == null) ? 0 : getMatchDes().hashCode());
        result = prime * result + ((getIncomeTransactionDes() == null) ? 0 : getIncomeTransactionDes().hashCode());
        result = prime * result + ((getProductcategory() == null) ? 0 : getProductcategory().hashCode());
        result = prime * result + ((getPlatformfee() == null) ? 0 : getPlatformfee().hashCode());
        result = prime * result + ((getTotalfee() == null) ? 0 : getTotalfee().hashCode());
        result = prime * result + ((getPaymentfee() == null) ? 0 : getPaymentfee().hashCode());
        result = prime * result + ((getConsultservicefee() == null) ? 0 : getConsultservicefee().hashCode());
        result = prime * result + ((getIssending() == null) ? 0 : getIssending().hashCode());
        result = prime * result + ((getFinerate2() == null) ? 0 : getFinerate2().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getUnionConsultationFee() == null) ? 0 : getUnionConsultationFee().hashCode());
        result = prime * result + ((getCustomerSourceChannel() == null) ? 0 : getCustomerSourceChannel().hashCode());
        result = prime * result + ((getPhonescore() == null) ? 0 : getPhonescore().hashCode());
        result = prime * result + ((getPhonescorelevel() == null) ? 0 : getPhonescorelevel().hashCode());
        result = prime * result + ((getTermUnit() == null) ? 0 : getTermUnit().hashCode());
        result = prime * result + ((getPlatformRateOne() == null) ? 0 : getPlatformRateOne().hashCode());
        result = prime * result + ((getPlatformRateTwo() == null) ? 0 : getPlatformRateTwo().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getFallback() == null) ? 0 : getFallback().hashCode());
        result = prime * result + ((getAutoFinish() == null) ? 0 : getAutoFinish().hashCode());
        result = prime * result + ((getBindCardTime() == null) ? 0 : getBindCardTime().hashCode());
        result = prime * result + ((getFaceRecognition() == null) ? 0 : getFaceRecognition().hashCode());
        result = prime * result + ((getCarrieroperator() == null) ? 0 : getCarrieroperator().hashCode());
        result = prime * result + ((getScorpio() == null) ? 0 : getScorpio().hashCode());
        result = prime * result + ((getScorpiotaskid() == null) ? 0 : getScorpiotaskid().hashCode());
        result = prime * result + ((getPutoutOffline() == null) ? 0 : getPutoutOffline().hashCode());
        result = prime * result + ((getCouponIds() == null) ? 0 : getCouponIds().hashCode());
        result = prime * result + ((getIntentionId() == null) ? 0 : getIntentionId().hashCode());
        result = prime * result + ((getSalesmanNo() == null) ? 0 : getSalesmanNo().hashCode());
        result = prime * result + ((getSalesmanName() == null) ? 0 : getSalesmanName().hashCode());
        result = prime * result + ((getPutoutVersion() == null) ? 0 : getPutoutVersion().hashCode());
        result = prime * result + ((getIsRecordCompletion() == null) ? 0 : getIsRecordCompletion().hashCode());
        result = prime * result + ((getVideoFlag() == null) ? 0 : getVideoFlag().hashCode());
        result = prime * result + ((getVideoFlag1() == null) ? 0 : getVideoFlag1().hashCode());
        result = prime * result + ((getCreditScore() == null) ? 0 : getCreditScore().hashCode());
        result = prime * result + ((getIsOpenUrl() == null) ? 0 : getIsOpenUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialno=").append(serialno);
        sb.append(", customerid=").append(customerid);
        sb.append(", businesstype=").append(businesstype);
        sb.append(", bankcode=").append(bankcode);
        sb.append(", bankcard=").append(bankcard);
        sb.append(", bankcardphone=").append(bankcardphone);
        sb.append(", shopsn=").append(shopsn);
        sb.append(", customerservice=").append(customerservice);
        sb.append(", salersn=").append(salersn);
        sb.append(", salecentersn=").append(salecentersn);
        sb.append(", applyterm=").append(applyterm);
        sb.append(", monthrepay=").append(monthrepay);
        sb.append(", businesssum=").append(businesssum);
        sb.append(", imsi=").append(imsi);
        sb.append(", phoneos=").append(phoneos);
        sb.append(", gpslocation=").append(gpslocation);
        sb.append(", ordersn=").append(ordersn);
        sb.append(", approveterm=").append(approveterm);
        sb.append(", applysum=").append(applysum);
        sb.append(", approvetime=").append(approvetime);
        sb.append(", contractdate=").append(contractdate);
        sb.append(", confirmtime=").append(confirmtime);
        sb.append(", paydate=").append(paydate);
        sb.append(", returntype=").append(returntype);
        sb.append(", contractstatus=").append(contractstatus);
        sb.append(", applystatus=").append(applystatus);
        sb.append(", orderbegintime=").append(orderbegintime);
        sb.append(", orderendtime=").append(orderendtime);
        sb.append(", approvedate=").append(approvedate);
        sb.append(", finishdate=").append(finishdate);
        sb.append(", businessrate=").append(businessrate);
        sb.append(", totalrate=").append(totalrate);
        sb.append(", finerate=").append(finerate);
        sb.append(", aheadscale=").append(aheadscale);
        sb.append(", targetstatus=").append(targetstatus);
        sb.append(", approvesum=").append(approvesum);
        sb.append(", putoutdate=").append(putoutdate);
        sb.append(", maturitydate=").append(maturitydate);
        sb.append(", ahendrate=").append(ahendrate);
        sb.append(", isputout=").append(isputout);
        sb.append(", isfulldeal=").append(isfulldeal);
        sb.append(", approvenumber=").append(approvenumber);
        sb.append(", applymonthrepay=").append(applymonthrepay);
        sb.append(", skuid=").append(skuid);
        sb.append(", loanuse=").append(loanuse);
        sb.append(", fundchannel=").append(fundchannel);
        sb.append(", accountno=").append(accountno);
        sb.append(", accountbank=").append(accountbank);
        sb.append(", bankId=").append(bankId);
        sb.append(", relevancebankno=").append(relevancebankno);
        sb.append(", accountaddress=").append(accountaddress);
        sb.append(", accountnet=").append(accountnet);
        sb.append(", fuyouaccount=").append(fuyouaccount);
        sb.append(", payway=").append(payway);
        sb.append(", isfamily=").append(isfamily);
        sb.append(", source=").append(source);
        sb.append(", loanusedesc=").append(loanusedesc);
        sb.append(", sourcedesc=").append(sourcedesc);
        sb.append(", citycode=").append(citycode);
        sb.append(", areacode=").append(areacode);
        sb.append(", bankkind=").append(bankkind);
        sb.append(", managerate=").append(managerate);
        sb.append(", serverrate=").append(serverrate);
        sb.append(", insurancerate=").append(insurancerate);
        sb.append(", serverfee=").append(serverfee);
        sb.append(", loanfeerate=").append(loanfeerate);
        sb.append(", consultfeerate=").append(consultfeerate);
        sb.append(", guaranteefeerate=").append(guaranteefeerate);
        sb.append(", payfeerate=").append(payfeerate);
        sb.append(", consultrate=").append(consultrate);
        sb.append(", checkrate=").append(checkrate);
        sb.append(", ahendterm=").append(ahendterm);
        sb.append(", putoutsum=").append(putoutsum);
        sb.append(", rate=").append(rate);
        sb.append(", dealid=").append(dealid);
        sb.append(", teamleader=").append(teamleader);
        sb.append(", outdataresuelt=").append(outdataresuelt);
        sb.append(", refusemainreson=").append(refusemainreson);
        sb.append(", teamLeader=").append(teamLeader);
        sb.append(", sendTargetTime=").append(sendTargetTime);
        sb.append(", sumservicefee=").append(sumservicefee);
        sb.append(", sumcertidmanagefee=").append(sumcertidmanagefee);
        sb.append(", pbcReportId=").append(pbcReportId);
        sb.append(", pbcReportTime=").append(pbcReportTime);
        sb.append(", updatetimestamp=").append(updatetimestamp);
        sb.append(", sendTargetUser=").append(sendTargetUser);
        sb.append(", sendTargetUsername=").append(sendTargetUsername);
        sb.append(", creditAmount=").append(creditAmount);
        sb.append(", creditPoint=").append(creditPoint);
        sb.append(", token=").append(token);
        sb.append(", innerdescription=").append(innerdescription);
        sb.append(", afineRate2=").append(afineRate2);
        sb.append(", resourceDes=").append(resourceDes);
        sb.append(", externalResourceDes=").append(externalResourceDes);
        sb.append(", matchDes=").append(matchDes);
        sb.append(", incomeTransactionDes=").append(incomeTransactionDes);
        sb.append(", productcategory=").append(productcategory);
        sb.append(", platformfee=").append(platformfee);
        sb.append(", totalfee=").append(totalfee);
        sb.append(", paymentfee=").append(paymentfee);
        sb.append(", consultservicefee=").append(consultservicefee);
        sb.append(", issending=").append(issending);
        sb.append(", finerate2=").append(finerate2);
        sb.append(", channel=").append(channel);
        sb.append(", unionConsultationFee=").append(unionConsultationFee);
        sb.append(", customerSourceChannel=").append(customerSourceChannel);
        sb.append(", phonescore=").append(phonescore);
        sb.append(", phonescorelevel=").append(phonescorelevel);
        sb.append(", termUnit=").append(termUnit);
        sb.append(", platformRateOne=").append(platformRateOne);
        sb.append(", platformRateTwo=").append(platformRateTwo);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", fallback=").append(fallback);
        sb.append(", autoFinish=").append(autoFinish);
        sb.append(", bindCardTime=").append(bindCardTime);
        sb.append(", faceRecognition=").append(faceRecognition);
        sb.append(", carrieroperator=").append(carrieroperator);
        sb.append(", scorpio=").append(scorpio);
        sb.append(", scorpiotaskid=").append(scorpiotaskid);
        sb.append(", putoutOffline=").append(putoutOffline);
        sb.append(", couponIds=").append(couponIds);
        sb.append(", intentionId=").append(intentionId);
        sb.append(", salesmanNo=").append(salesmanNo);
        sb.append(", salesmanName=").append(salesmanName);
        sb.append(", putoutVersion=").append(putoutVersion);
        sb.append(", isRecordCompletion=").append(isRecordCompletion);
        sb.append(", videoFlag=").append(videoFlag);
        sb.append(", videoFlag1=").append(videoFlag1);
        sb.append(", creditScore=").append(creditScore);
        sb.append(", isOpenUrl=").append(isOpenUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}