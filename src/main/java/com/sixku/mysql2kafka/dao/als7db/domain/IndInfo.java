package com.sixku.mysql2kafka.dao.als7db.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class IndInfo implements Serializable {
    /**
     * 客户编号
     */
    private String customerid;

    /**
     * 姓名
     */
    private String fullname;

    /**
     * 性别(代码:Sex)
     */
    private String sex;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 证件类型(代码:CertType)
     */
    private String certtype;

    /**
     * 证件号码(18位)
     */
    private String certid;

    /**
     * 社会保险号
     */
    private String sino;

    /**
     * 国籍(代码:CountryCode)
     */
    private String country;

    /**
     * 民族(代码:Nationality)
     */
    private String nationality;

    /**
     * 籍贯
     */
    private String nativeplace;

    /**
     * 政治面貌(代码:PoliticalFace)
     */
    private String politicalface;

    /**
     * 婚姻状况(代码:Marriage)
     */
    private String marriage;

    /**
     * 联系方式
     */
    private String relativetype;

    /**
     * 家庭住址
     */
    private String familyadd;

    /**
     * 邮政编码
     */
    private String familyzip;

    /**
     * 电子邮件地址
     */
    private String emailadd;

    /**
     * 住宅电话
     */
    private String familytel;

    private String familytel1;

    private String familytel2;

    /**
     * 手机号码1
     */
    private String phone;

    /**
     * 手机号码2
     */
    private String phone1;

    private String phone2;

    /**
     * 单位所属行业(代码:UnitKind)
     */
    private String unitkind;

    /**
     * 工作单位
     */
    private String workcorp;

    /**
     * 工作地址
     */
    private String workadd;

    /**
     * 工作电话
     */
    private String worktel;

    /**
     * 职业(代码:Occupation)
     */
    private String occupation;

    /**
     * 职称(代码:TechPost)
     */
    private String position;

    /**
     * 工作履历
     */
    private String employrecord;

    /**
     * 最高学历(代码:EducationExperience)
     */
    private String eduexperience;

    /**
     * 学位(代码:EducationDegree)
     */
    private String edudegree;

    /**
     * 毕业年份
     */
    private String graduateyear;

    /**
     * 本行评估即期信用等级
     */
    private String creditlevel;

    /**
     * 本行评估日期
     */
    private String evaluatedate;

    /**
     * 个人资产与负债详情
     */
    private String balancesheet;

    /**
     * 个人情况简介
     */
    private String intro;

    /**
     * 个人月收入
     */
    private BigDecimal selfmonthincome;

    /**
     * 家庭月收入
     */
    private BigDecimal familymonthincome;

    /**
     * 主要收入来源
     */
    private String incomesource;

    /**
     * 家庭人口数
     */
    private BigDecimal population;

    /**
     * 农户分类
     */
    private String farmersort;

    /**
     * 所属行政区域(代码:AreaCode)
     */
    private String regionalism;

    /**
     * 是否本行员工(代码:YesNo)
     */
    private String staff;

    /**
     * 是否信用农户(代码:YesNo)
     */
    private String creditfarmer;

    /**
     * 登记机构
     */
    private String inputorgid;

    /**
     * 登记人
     */
    private String inputuserid;

    /**
     * 登记日期
     */
    private String inputdate;

    /**
     * 更新日期
     */
    private String updatedate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 更新机构
     */
    private String updateorgid;

    /**
     * 更新人
     */
    private String updateuserid;

    /**
     * 通讯地址
     */
    private String commadd;

    /**
     * 通讯地址邮政编码
     */
    private String commzip;

    /**
     * 户籍地址
     */
    private String nativeadd;

    /**
     * 单位地址邮政编码
     */
    private String workzip;

    /**
     * 职务名称
     */
    private String headship;

    /**
     * 从业起始年份
     */
    private String workbegindate;

    /**
     * 年收入
     */
    private BigDecimal yearincome;

    /**
     * 居住状况(代码:FamilyStatus)
     */
    private String familystatus;

    /**
     * 暂存标志
     */
    private String tempsaveflag;

    /**
     * 英文名称
     */
    private String engname;

    /**
     * 居住地区
     */
    private String regioncode;

    /**
     * 单位性质(代码:WorkNature)
     */
    private String worknature;

    /**
     * 有无子女(代码:YesNo)
     */
    private String childflag;

    /**
     * 本地居住年限
     */
    private String localyear;

    /**
     * 职务级别(代码:PosionLevel)
     */
    private String posionlevel;

    /**
     * 电话首选(代码:FirstTel)
     */
    private String firsttel;

    /**
     * 邮寄首选(代码:FirstEmail)
     */
    private String firstemail;

    /**
     * 个人税后月收入
     */
    private BigDecimal monthincome;

    /**
     * 单位电话:国家区号
     */
    private String corpzone;

    /**
     * 单位电话:地区号
     */
    private String corparea;

    /**
     * 单位电话:分机号
     */
    private String corpextension;

    /**
     * 住宅电话:国家区号
     */
    private String housezone;

    /**
     * 住宅电话:地区号
     */
    private String housearea;

    /**
     * 单位性质
     */
    private String companynature;

    /**
     * qq号码
     */
    private String qqcode;

    private String whilomname;

    private String drivinglicence;

    /**
     * 是否自雇类
     */
    private String isown;

    private String channeltype;

    private String channelgroupnum;

    private String housingarea;

    private String mascriptionadss;

    private String getbusytime;

    private String worktime;

    private String dimissiontime;

    private String subsistpamount;

    private String isborrower;

    private String iswarrantor;

    /**
     * 证件到日期 
     */
    private String certmaturitydate;

    /**
     * 发证机关
     */
    private String sendcardorgan;

    /**
     * 年龄
     */
    private String age;

    /**
     * 职业类型 （EmpType）
     */
    private String emptype;

    /**
     * 客户风险类型（CusLevelType）
     */
    private String cusleveltype;

    /**
     * 本地常驻类型 （LocalType）
     */
    private String localtype;

    private String certid18;

    /**
     * 房产套数
     */
    private BigDecimal homesum;

    /**
     * 家庭主要收入来源
     */
    private String familysumroot;

    /**
     * 家庭月均收入
     */
    private BigDecimal familypincome;

    /**
     * 房贷余额
     */
    private BigDecimal homeloanblance;

    /**
     * 房贷月还款额
     */
    private BigDecimal homeloanmonthsum;

    /**
     * 车贷余额
     */
    private BigDecimal carloanblance;

    /**
     * 车贷月还款额
     */
    private BigDecimal carloanmonthsum;

    /**
     * 其他贷款余额
     */
    private BigDecimal otherloanblance;

    /**
     * 其他贷款月还款额
     */
    private BigDecimal otherloanmonthsum;

    /**
     * 借款人平台注册账号
     */
    private String userid;

    /**
     * 开户行
     */
    private String bankname;

    /**
     * 银行卡号
     */
    private String bankcard;

    /**
     * 银行代码
     */
    private String bankcode;

    /**
     * 银行卡预留手机号
     */
    private String bankcardphone;

    /**
     * 是否有社保
     */
    private String sidflag;

    private String edurecord;

    private String verifytype;

    /**
     * 家庭供养人数
     */
    private String housenumber;

    /**
     * 户口地宅电
     */
    private String nativeplacetel;

    /**
     * 住宅电话所属
     */
    private String familytelbelong;

    /**
     * 起始居住时间
     */
    private String familybegintime;

    /**
     * 是否与父母同住
     */
    private String isparent;

    /**
     * 房产类型
     */
    private String housetype;

    /**
     * 购买价格
     */
    private BigDecimal houseprice;

    /**
     * 房屋面积
     */
    private BigDecimal housesize;

    /**
     * 房屋月供
     */
    private BigDecimal housemonth;

    /**
     * 购买时间
     */
    private String housetime;

    /**
     * 所在城市
     */
    private String provence;

    /**
     * 省份
     */
    private String provencename;

    /**
     * 所在城市编号
     */
    private String city;

    /**
     * 区（镇）名称
     */
    private String cityname;

    /**
     * 区(镇)编号
     */
    private String area;

    /**
     * 区镇名称
     */
    private String areaname;

    /**
     * 房产地址
     */
    private String houseadd;

    /**
     * 邮政编码
     */
    private String housezip;

    /**
     * 入职时间
     */
    private String entrytime;

    /**
     * 所在部门
     */
    private String department;

    /**
     * 单位电话2
     */
    private String worktel2;

    /**
     * 每月固定发薪日
     */
    private String monthpayday;

    /**
     * 每月奖金提成等其他收入
     */
    private BigDecimal bonusincome;

    /**
     * 工资发放形式
     */
    private String issueform;

    /**
     * 主要收入来源
     */
    private String sourceincome;

    /**
     * 三年内工作变更次数
     */
    private String changenumber;

    /**
     * 前单位名称
     */
    private String workcorp1;

    /**
     * 单位电话1
     */
    private String worktel1;

    /**
     * 前单位工龄
     */
    private String workage1;

    /**
     * 前单位地址
     */
    private String workadd1;

    /**
     * 前工作单位邮政编码
     */
    private String workzip1;

    /**
     * 户口所在地邮编
     */
    private String nativezip;

    /**
     * 租金
     */
    private BigDecimal rent;

    /**
     * 当前房产市值
     */
    private BigDecimal marketvalue;

    /**
     * 房贷借款期数
     */
    private String homeloanmonth;

    /**
     * 保险公司
     */
    private String insurancecompany;

    /**
     * 投保地点
     */
    private String insuredlocation;

    /**
     * 生效日期
     */
    private String effectivedate;

    /**
     * 需缴费年数
     */
    private String payyear;

    /**
     * 保单号
     */
    private String insuranceno;

    /**
     * 缴费类别
     */
    private String paytype;

    /**
     * 期缴保费
     */
    private BigDecimal regularpremium;

    /**
     * 总保额
     */
    private BigDecimal insurancesum;

    /**
     * 险种类型
     */
    private String insurancetype;

    /**
     * 被保险人姓名
     */
    private String insuredname;

    /**
     * 联系电话
     */
    private String insurancetel;

    /**
     * 保险公司1
     */
    private String insurancecompany1;

    /**
     * 投保地点1
     */
    private String insuredlocation1;

    /**
     * 生效日期1
     */
    private String effectivedate1;

    /**
     * 需缴费年数1
     */
    private String payyear1;

    /**
     * 保单号1
     */
    private String insuranceno1;

    /**
     * 缴费类别1
     */
    private String paytype1;

    /**
     * 期缴保费1
     */
    private BigDecimal regularpremium1;

    /**
     * 总保额1
     */
    private BigDecimal insurancesum1;

    /**
     * 险种类型1
     */
    private String insurancetype1;

    /**
     * 被保险人姓名1
     */
    private String insuredname1;

    /**
     * 联系电话1
     */
    private String insurancetel1;

    /**
     * 公司规模
     */
    private String companysize;

    /**
     * 公积金首次缴存时间
     */
    private String firsttime;

    /**
     * 现单位缴存时间
     */
    private String nowcomtime;

    /**
     * 月缴存额
     */
    private BigDecimal monthsum;

    private String housennmber;

    /**
     * 更新时间
     */
    private Date updatetimestamp;

    /**
     * 工场开户状态0未开户1已开户
     */
    private Integer finFactoryStatus;

    private Integer indType;

    private String joinWorkTime;

    /**
     * 身份证有效期起始时间
     */
    private String cardBeginTime;

    /**
     * 身份证有效期到期时间
     */
    private String cardEndTime;

    /**
     * 更新用户
     */
    private String updateUser;

    /**
     * 职业id
     */
    private String occupationId;

    /**
     * 个体工商户营业执照
     */
    private String businessLicense;

    /**
     * c端登录手机号
     */
    private String loginPhone;

    /**
     * 绑定时间
     */
    private Date bindTime;

    /**
     * 零售系统中用户openid
     */
    private String openId;

    /**
     * 来源描述
     */
    private String rootreame;

    private static final long serialVersionUID = 1L;

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCerttype() {
        return certtype;
    }

    public void setCerttype(String certtype) {
        this.certtype = certtype;
    }

    public String getCertid() {
        return certid;
    }

    public void setCertid(String certid) {
        this.certid = certid;
    }

    public String getSino() {
        return sino;
    }

    public void setSino(String sino) {
        this.sino = sino;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getPoliticalface() {
        return politicalface;
    }

    public void setPoliticalface(String politicalface) {
        this.politicalface = politicalface;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getRelativetype() {
        return relativetype;
    }

    public void setRelativetype(String relativetype) {
        this.relativetype = relativetype;
    }

    public String getFamilyadd() {
        return familyadd;
    }

    public void setFamilyadd(String familyadd) {
        this.familyadd = familyadd;
    }

    public String getFamilyzip() {
        return familyzip;
    }

    public void setFamilyzip(String familyzip) {
        this.familyzip = familyzip;
    }

    public String getEmailadd() {
        return emailadd;
    }

    public void setEmailadd(String emailadd) {
        this.emailadd = emailadd;
    }

    public String getFamilytel() {
        return familytel;
    }

    public void setFamilytel(String familytel) {
        this.familytel = familytel;
    }

    public String getFamilytel1() {
        return familytel1;
    }

    public void setFamilytel1(String familytel1) {
        this.familytel1 = familytel1;
    }

    public String getFamilytel2() {
        return familytel2;
    }

    public void setFamilytel2(String familytel2) {
        this.familytel2 = familytel2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getUnitkind() {
        return unitkind;
    }

    public void setUnitkind(String unitkind) {
        this.unitkind = unitkind;
    }

    public String getWorkcorp() {
        return workcorp;
    }

    public void setWorkcorp(String workcorp) {
        this.workcorp = workcorp;
    }

    public String getWorkadd() {
        return workadd;
    }

    public void setWorkadd(String workadd) {
        this.workadd = workadd;
    }

    public String getWorktel() {
        return worktel;
    }

    public void setWorktel(String worktel) {
        this.worktel = worktel;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployrecord() {
        return employrecord;
    }

    public void setEmployrecord(String employrecord) {
        this.employrecord = employrecord;
    }

    public String getEduexperience() {
        return eduexperience;
    }

    public void setEduexperience(String eduexperience) {
        this.eduexperience = eduexperience;
    }

    public String getEdudegree() {
        return edudegree;
    }

    public void setEdudegree(String edudegree) {
        this.edudegree = edudegree;
    }

    public String getGraduateyear() {
        return graduateyear;
    }

    public void setGraduateyear(String graduateyear) {
        this.graduateyear = graduateyear;
    }

    public String getCreditlevel() {
        return creditlevel;
    }

    public void setCreditlevel(String creditlevel) {
        this.creditlevel = creditlevel;
    }

    public String getEvaluatedate() {
        return evaluatedate;
    }

    public void setEvaluatedate(String evaluatedate) {
        this.evaluatedate = evaluatedate;
    }

    public String getBalancesheet() {
        return balancesheet;
    }

    public void setBalancesheet(String balancesheet) {
        this.balancesheet = balancesheet;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public BigDecimal getSelfmonthincome() {
        return selfmonthincome;
    }

    public void setSelfmonthincome(BigDecimal selfmonthincome) {
        this.selfmonthincome = selfmonthincome;
    }

    public BigDecimal getFamilymonthincome() {
        return familymonthincome;
    }

    public void setFamilymonthincome(BigDecimal familymonthincome) {
        this.familymonthincome = familymonthincome;
    }

    public String getIncomesource() {
        return incomesource;
    }

    public void setIncomesource(String incomesource) {
        this.incomesource = incomesource;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    public void setPopulation(BigDecimal population) {
        this.population = population;
    }

    public String getFarmersort() {
        return farmersort;
    }

    public void setFarmersort(String farmersort) {
        this.farmersort = farmersort;
    }

    public String getRegionalism() {
        return regionalism;
    }

    public void setRegionalism(String regionalism) {
        this.regionalism = regionalism;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getCreditfarmer() {
        return creditfarmer;
    }

    public void setCreditfarmer(String creditfarmer) {
        this.creditfarmer = creditfarmer;
    }

    public String getInputorgid() {
        return inputorgid;
    }

    public void setInputorgid(String inputorgid) {
        this.inputorgid = inputorgid;
    }

    public String getInputuserid() {
        return inputuserid;
    }

    public void setInputuserid(String inputuserid) {
        this.inputuserid = inputuserid;
    }

    public String getInputdate() {
        return inputdate;
    }

    public void setInputdate(String inputdate) {
        this.inputdate = inputdate;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUpdateorgid() {
        return updateorgid;
    }

    public void setUpdateorgid(String updateorgid) {
        this.updateorgid = updateorgid;
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid;
    }

    public String getCommadd() {
        return commadd;
    }

    public void setCommadd(String commadd) {
        this.commadd = commadd;
    }

    public String getCommzip() {
        return commzip;
    }

    public void setCommzip(String commzip) {
        this.commzip = commzip;
    }

    public String getNativeadd() {
        return nativeadd;
    }

    public void setNativeadd(String nativeadd) {
        this.nativeadd = nativeadd;
    }

    public String getWorkzip() {
        return workzip;
    }

    public void setWorkzip(String workzip) {
        this.workzip = workzip;
    }

    public String getHeadship() {
        return headship;
    }

    public void setHeadship(String headship) {
        this.headship = headship;
    }

    public String getWorkbegindate() {
        return workbegindate;
    }

    public void setWorkbegindate(String workbegindate) {
        this.workbegindate = workbegindate;
    }

    public BigDecimal getYearincome() {
        return yearincome;
    }

    public void setYearincome(BigDecimal yearincome) {
        this.yearincome = yearincome;
    }

    public String getFamilystatus() {
        return familystatus;
    }

    public void setFamilystatus(String familystatus) {
        this.familystatus = familystatus;
    }

    public String getTempsaveflag() {
        return tempsaveflag;
    }

    public void setTempsaveflag(String tempsaveflag) {
        this.tempsaveflag = tempsaveflag;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public String getRegioncode() {
        return regioncode;
    }

    public void setRegioncode(String regioncode) {
        this.regioncode = regioncode;
    }

    public String getWorknature() {
        return worknature;
    }

    public void setWorknature(String worknature) {
        this.worknature = worknature;
    }

    public String getChildflag() {
        return childflag;
    }

    public void setChildflag(String childflag) {
        this.childflag = childflag;
    }

    public String getLocalyear() {
        return localyear;
    }

    public void setLocalyear(String localyear) {
        this.localyear = localyear;
    }

    public String getPosionlevel() {
        return posionlevel;
    }

    public void setPosionlevel(String posionlevel) {
        this.posionlevel = posionlevel;
    }

    public String getFirsttel() {
        return firsttel;
    }

    public void setFirsttel(String firsttel) {
        this.firsttel = firsttel;
    }

    public String getFirstemail() {
        return firstemail;
    }

    public void setFirstemail(String firstemail) {
        this.firstemail = firstemail;
    }

    public BigDecimal getMonthincome() {
        return monthincome;
    }

    public void setMonthincome(BigDecimal monthincome) {
        this.monthincome = monthincome;
    }

    public String getCorpzone() {
        return corpzone;
    }

    public void setCorpzone(String corpzone) {
        this.corpzone = corpzone;
    }

    public String getCorparea() {
        return corparea;
    }

    public void setCorparea(String corparea) {
        this.corparea = corparea;
    }

    public String getCorpextension() {
        return corpextension;
    }

    public void setCorpextension(String corpextension) {
        this.corpextension = corpextension;
    }

    public String getHousezone() {
        return housezone;
    }

    public void setHousezone(String housezone) {
        this.housezone = housezone;
    }

    public String getHousearea() {
        return housearea;
    }

    public void setHousearea(String housearea) {
        this.housearea = housearea;
    }

    public String getCompanynature() {
        return companynature;
    }

    public void setCompanynature(String companynature) {
        this.companynature = companynature;
    }

    public String getQqcode() {
        return qqcode;
    }

    public void setQqcode(String qqcode) {
        this.qqcode = qqcode;
    }

    public String getWhilomname() {
        return whilomname;
    }

    public void setWhilomname(String whilomname) {
        this.whilomname = whilomname;
    }

    public String getDrivinglicence() {
        return drivinglicence;
    }

    public void setDrivinglicence(String drivinglicence) {
        this.drivinglicence = drivinglicence;
    }

    public String getIsown() {
        return isown;
    }

    public void setIsown(String isown) {
        this.isown = isown;
    }

    public String getChanneltype() {
        return channeltype;
    }

    public void setChanneltype(String channeltype) {
        this.channeltype = channeltype;
    }

    public String getChannelgroupnum() {
        return channelgroupnum;
    }

    public void setChannelgroupnum(String channelgroupnum) {
        this.channelgroupnum = channelgroupnum;
    }

    public String getHousingarea() {
        return housingarea;
    }

    public void setHousingarea(String housingarea) {
        this.housingarea = housingarea;
    }

    public String getMascriptionadss() {
        return mascriptionadss;
    }

    public void setMascriptionadss(String mascriptionadss) {
        this.mascriptionadss = mascriptionadss;
    }

    public String getGetbusytime() {
        return getbusytime;
    }

    public void setGetbusytime(String getbusytime) {
        this.getbusytime = getbusytime;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getDimissiontime() {
        return dimissiontime;
    }

    public void setDimissiontime(String dimissiontime) {
        this.dimissiontime = dimissiontime;
    }

    public String getSubsistpamount() {
        return subsistpamount;
    }

    public void setSubsistpamount(String subsistpamount) {
        this.subsistpamount = subsistpamount;
    }

    public String getIsborrower() {
        return isborrower;
    }

    public void setIsborrower(String isborrower) {
        this.isborrower = isborrower;
    }

    public String getIswarrantor() {
        return iswarrantor;
    }

    public void setIswarrantor(String iswarrantor) {
        this.iswarrantor = iswarrantor;
    }

    public String getCertmaturitydate() {
        return certmaturitydate;
    }

    public void setCertmaturitydate(String certmaturitydate) {
        this.certmaturitydate = certmaturitydate;
    }

    public String getSendcardorgan() {
        return sendcardorgan;
    }

    public void setSendcardorgan(String sendcardorgan) {
        this.sendcardorgan = sendcardorgan;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmptype() {
        return emptype;
    }

    public void setEmptype(String emptype) {
        this.emptype = emptype;
    }

    public String getCusleveltype() {
        return cusleveltype;
    }

    public void setCusleveltype(String cusleveltype) {
        this.cusleveltype = cusleveltype;
    }

    public String getLocaltype() {
        return localtype;
    }

    public void setLocaltype(String localtype) {
        this.localtype = localtype;
    }

    public String getCertid18() {
        return certid18;
    }

    public void setCertid18(String certid18) {
        this.certid18 = certid18;
    }

    public BigDecimal getHomesum() {
        return homesum;
    }

    public void setHomesum(BigDecimal homesum) {
        this.homesum = homesum;
    }

    public String getFamilysumroot() {
        return familysumroot;
    }

    public void setFamilysumroot(String familysumroot) {
        this.familysumroot = familysumroot;
    }

    public BigDecimal getFamilypincome() {
        return familypincome;
    }

    public void setFamilypincome(BigDecimal familypincome) {
        this.familypincome = familypincome;
    }

    public BigDecimal getHomeloanblance() {
        return homeloanblance;
    }

    public void setHomeloanblance(BigDecimal homeloanblance) {
        this.homeloanblance = homeloanblance;
    }

    public BigDecimal getHomeloanmonthsum() {
        return homeloanmonthsum;
    }

    public void setHomeloanmonthsum(BigDecimal homeloanmonthsum) {
        this.homeloanmonthsum = homeloanmonthsum;
    }

    public BigDecimal getCarloanblance() {
        return carloanblance;
    }

    public void setCarloanblance(BigDecimal carloanblance) {
        this.carloanblance = carloanblance;
    }

    public BigDecimal getCarloanmonthsum() {
        return carloanmonthsum;
    }

    public void setCarloanmonthsum(BigDecimal carloanmonthsum) {
        this.carloanmonthsum = carloanmonthsum;
    }

    public BigDecimal getOtherloanblance() {
        return otherloanblance;
    }

    public void setOtherloanblance(BigDecimal otherloanblance) {
        this.otherloanblance = otherloanblance;
    }

    public BigDecimal getOtherloanmonthsum() {
        return otherloanmonthsum;
    }

    public void setOtherloanmonthsum(BigDecimal otherloanmonthsum) {
        this.otherloanmonthsum = otherloanmonthsum;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public String getBankcardphone() {
        return bankcardphone;
    }

    public void setBankcardphone(String bankcardphone) {
        this.bankcardphone = bankcardphone;
    }

    public String getSidflag() {
        return sidflag;
    }

    public void setSidflag(String sidflag) {
        this.sidflag = sidflag;
    }

    public String getEdurecord() {
        return edurecord;
    }

    public void setEdurecord(String edurecord) {
        this.edurecord = edurecord;
    }

    public String getVerifytype() {
        return verifytype;
    }

    public void setVerifytype(String verifytype) {
        this.verifytype = verifytype;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getNativeplacetel() {
        return nativeplacetel;
    }

    public void setNativeplacetel(String nativeplacetel) {
        this.nativeplacetel = nativeplacetel;
    }

    public String getFamilytelbelong() {
        return familytelbelong;
    }

    public void setFamilytelbelong(String familytelbelong) {
        this.familytelbelong = familytelbelong;
    }

    public String getFamilybegintime() {
        return familybegintime;
    }

    public void setFamilybegintime(String familybegintime) {
        this.familybegintime = familybegintime;
    }

    public String getIsparent() {
        return isparent;
    }

    public void setIsparent(String isparent) {
        this.isparent = isparent;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public BigDecimal getHouseprice() {
        return houseprice;
    }

    public void setHouseprice(BigDecimal houseprice) {
        this.houseprice = houseprice;
    }

    public BigDecimal getHousesize() {
        return housesize;
    }

    public void setHousesize(BigDecimal housesize) {
        this.housesize = housesize;
    }

    public BigDecimal getHousemonth() {
        return housemonth;
    }

    public void setHousemonth(BigDecimal housemonth) {
        this.housemonth = housemonth;
    }

    public String getHousetime() {
        return housetime;
    }

    public void setHousetime(String housetime) {
        this.housetime = housetime;
    }

    public String getProvence() {
        return provence;
    }

    public void setProvence(String provence) {
        this.provence = provence;
    }

    public String getProvencename() {
        return provencename;
    }

    public void setProvencename(String provencename) {
        this.provencename = provencename;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getHouseadd() {
        return houseadd;
    }

    public void setHouseadd(String houseadd) {
        this.houseadd = houseadd;
    }

    public String getHousezip() {
        return housezip;
    }

    public void setHousezip(String housezip) {
        this.housezip = housezip;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorktel2() {
        return worktel2;
    }

    public void setWorktel2(String worktel2) {
        this.worktel2 = worktel2;
    }

    public String getMonthpayday() {
        return monthpayday;
    }

    public void setMonthpayday(String monthpayday) {
        this.monthpayday = monthpayday;
    }

    public BigDecimal getBonusincome() {
        return bonusincome;
    }

    public void setBonusincome(BigDecimal bonusincome) {
        this.bonusincome = bonusincome;
    }

    public String getIssueform() {
        return issueform;
    }

    public void setIssueform(String issueform) {
        this.issueform = issueform;
    }

    public String getSourceincome() {
        return sourceincome;
    }

    public void setSourceincome(String sourceincome) {
        this.sourceincome = sourceincome;
    }

    public String getChangenumber() {
        return changenumber;
    }

    public void setChangenumber(String changenumber) {
        this.changenumber = changenumber;
    }

    public String getWorkcorp1() {
        return workcorp1;
    }

    public void setWorkcorp1(String workcorp1) {
        this.workcorp1 = workcorp1;
    }

    public String getWorktel1() {
        return worktel1;
    }

    public void setWorktel1(String worktel1) {
        this.worktel1 = worktel1;
    }

    public String getWorkage1() {
        return workage1;
    }

    public void setWorkage1(String workage1) {
        this.workage1 = workage1;
    }

    public String getWorkadd1() {
        return workadd1;
    }

    public void setWorkadd1(String workadd1) {
        this.workadd1 = workadd1;
    }

    public String getWorkzip1() {
        return workzip1;
    }

    public void setWorkzip1(String workzip1) {
        this.workzip1 = workzip1;
    }

    public String getNativezip() {
        return nativezip;
    }

    public void setNativezip(String nativezip) {
        this.nativezip = nativezip;
    }

    public BigDecimal getRent() {
        return rent;
    }

    public void setRent(BigDecimal rent) {
        this.rent = rent;
    }

    public BigDecimal getMarketvalue() {
        return marketvalue;
    }

    public void setMarketvalue(BigDecimal marketvalue) {
        this.marketvalue = marketvalue;
    }

    public String getHomeloanmonth() {
        return homeloanmonth;
    }

    public void setHomeloanmonth(String homeloanmonth) {
        this.homeloanmonth = homeloanmonth;
    }

    public String getInsurancecompany() {
        return insurancecompany;
    }

    public void setInsurancecompany(String insurancecompany) {
        this.insurancecompany = insurancecompany;
    }

    public String getInsuredlocation() {
        return insuredlocation;
    }

    public void setInsuredlocation(String insuredlocation) {
        this.insuredlocation = insuredlocation;
    }

    public String getEffectivedate() {
        return effectivedate;
    }

    public void setEffectivedate(String effectivedate) {
        this.effectivedate = effectivedate;
    }

    public String getPayyear() {
        return payyear;
    }

    public void setPayyear(String payyear) {
        this.payyear = payyear;
    }

    public String getInsuranceno() {
        return insuranceno;
    }

    public void setInsuranceno(String insuranceno) {
        this.insuranceno = insuranceno;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public BigDecimal getRegularpremium() {
        return regularpremium;
    }

    public void setRegularpremium(BigDecimal regularpremium) {
        this.regularpremium = regularpremium;
    }

    public BigDecimal getInsurancesum() {
        return insurancesum;
    }

    public void setInsurancesum(BigDecimal insurancesum) {
        this.insurancesum = insurancesum;
    }

    public String getInsurancetype() {
        return insurancetype;
    }

    public void setInsurancetype(String insurancetype) {
        this.insurancetype = insurancetype;
    }

    public String getInsuredname() {
        return insuredname;
    }

    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    public String getInsurancetel() {
        return insurancetel;
    }

    public void setInsurancetel(String insurancetel) {
        this.insurancetel = insurancetel;
    }

    public String getInsurancecompany1() {
        return insurancecompany1;
    }

    public void setInsurancecompany1(String insurancecompany1) {
        this.insurancecompany1 = insurancecompany1;
    }

    public String getInsuredlocation1() {
        return insuredlocation1;
    }

    public void setInsuredlocation1(String insuredlocation1) {
        this.insuredlocation1 = insuredlocation1;
    }

    public String getEffectivedate1() {
        return effectivedate1;
    }

    public void setEffectivedate1(String effectivedate1) {
        this.effectivedate1 = effectivedate1;
    }

    public String getPayyear1() {
        return payyear1;
    }

    public void setPayyear1(String payyear1) {
        this.payyear1 = payyear1;
    }

    public String getInsuranceno1() {
        return insuranceno1;
    }

    public void setInsuranceno1(String insuranceno1) {
        this.insuranceno1 = insuranceno1;
    }

    public String getPaytype1() {
        return paytype1;
    }

    public void setPaytype1(String paytype1) {
        this.paytype1 = paytype1;
    }

    public BigDecimal getRegularpremium1() {
        return regularpremium1;
    }

    public void setRegularpremium1(BigDecimal regularpremium1) {
        this.regularpremium1 = regularpremium1;
    }

    public BigDecimal getInsurancesum1() {
        return insurancesum1;
    }

    public void setInsurancesum1(BigDecimal insurancesum1) {
        this.insurancesum1 = insurancesum1;
    }

    public String getInsurancetype1() {
        return insurancetype1;
    }

    public void setInsurancetype1(String insurancetype1) {
        this.insurancetype1 = insurancetype1;
    }

    public String getInsuredname1() {
        return insuredname1;
    }

    public void setInsuredname1(String insuredname1) {
        this.insuredname1 = insuredname1;
    }

    public String getInsurancetel1() {
        return insurancetel1;
    }

    public void setInsurancetel1(String insurancetel1) {
        this.insurancetel1 = insurancetel1;
    }

    public String getCompanysize() {
        return companysize;
    }

    public void setCompanysize(String companysize) {
        this.companysize = companysize;
    }

    public String getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(String firsttime) {
        this.firsttime = firsttime;
    }

    public String getNowcomtime() {
        return nowcomtime;
    }

    public void setNowcomtime(String nowcomtime) {
        this.nowcomtime = nowcomtime;
    }

    public BigDecimal getMonthsum() {
        return monthsum;
    }

    public void setMonthsum(BigDecimal monthsum) {
        this.monthsum = monthsum;
    }

    public String getHousennmber() {
        return housennmber;
    }

    public void setHousennmber(String housennmber) {
        this.housennmber = housennmber;
    }

    public Date getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(Date updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    public Integer getFinFactoryStatus() {
        return finFactoryStatus;
    }

    public void setFinFactoryStatus(Integer finFactoryStatus) {
        this.finFactoryStatus = finFactoryStatus;
    }

    public Integer getIndType() {
        return indType;
    }

    public void setIndType(Integer indType) {
        this.indType = indType;
    }

    public String getJoinWorkTime() {
        return joinWorkTime;
    }

    public void setJoinWorkTime(String joinWorkTime) {
        this.joinWorkTime = joinWorkTime;
    }

    public String getCardBeginTime() {
        return cardBeginTime;
    }

    public void setCardBeginTime(String cardBeginTime) {
        this.cardBeginTime = cardBeginTime;
    }

    public String getCardEndTime() {
        return cardEndTime;
    }

    public void setCardEndTime(String cardEndTime) {
        this.cardEndTime = cardEndTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(String occupationId) {
        this.occupationId = occupationId;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getLoginPhone() {
        return loginPhone;
    }

    public void setLoginPhone(String loginPhone) {
        this.loginPhone = loginPhone;
    }

    public Date getBindTime() {
        return bindTime;
    }

    public void setBindTime(Date bindTime) {
        this.bindTime = bindTime;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getRootreame() {
        return rootreame;
    }

    public void setRootreame(String rootreame) {
        this.rootreame = rootreame;
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
        IndInfo other = (IndInfo) that;
        return (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getFullname() == null ? other.getFullname() == null : this.getFullname().equals(other.getFullname()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getCerttype() == null ? other.getCerttype() == null : this.getCerttype().equals(other.getCerttype()))
            && (this.getCertid() == null ? other.getCertid() == null : this.getCertid().equals(other.getCertid()))
            && (this.getSino() == null ? other.getSino() == null : this.getSino().equals(other.getSino()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getNativeplace() == null ? other.getNativeplace() == null : this.getNativeplace().equals(other.getNativeplace()))
            && (this.getPoliticalface() == null ? other.getPoliticalface() == null : this.getPoliticalface().equals(other.getPoliticalface()))
            && (this.getMarriage() == null ? other.getMarriage() == null : this.getMarriage().equals(other.getMarriage()))
            && (this.getRelativetype() == null ? other.getRelativetype() == null : this.getRelativetype().equals(other.getRelativetype()))
            && (this.getFamilyadd() == null ? other.getFamilyadd() == null : this.getFamilyadd().equals(other.getFamilyadd()))
            && (this.getFamilyzip() == null ? other.getFamilyzip() == null : this.getFamilyzip().equals(other.getFamilyzip()))
            && (this.getEmailadd() == null ? other.getEmailadd() == null : this.getEmailadd().equals(other.getEmailadd()))
            && (this.getFamilytel() == null ? other.getFamilytel() == null : this.getFamilytel().equals(other.getFamilytel()))
            && (this.getFamilytel1() == null ? other.getFamilytel1() == null : this.getFamilytel1().equals(other.getFamilytel1()))
            && (this.getFamilytel2() == null ? other.getFamilytel2() == null : this.getFamilytel2().equals(other.getFamilytel2()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getPhone1() == null ? other.getPhone1() == null : this.getPhone1().equals(other.getPhone1()))
            && (this.getPhone2() == null ? other.getPhone2() == null : this.getPhone2().equals(other.getPhone2()))
            && (this.getUnitkind() == null ? other.getUnitkind() == null : this.getUnitkind().equals(other.getUnitkind()))
            && (this.getWorkcorp() == null ? other.getWorkcorp() == null : this.getWorkcorp().equals(other.getWorkcorp()))
            && (this.getWorkadd() == null ? other.getWorkadd() == null : this.getWorkadd().equals(other.getWorkadd()))
            && (this.getWorktel() == null ? other.getWorktel() == null : this.getWorktel().equals(other.getWorktel()))
            && (this.getOccupation() == null ? other.getOccupation() == null : this.getOccupation().equals(other.getOccupation()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getEmployrecord() == null ? other.getEmployrecord() == null : this.getEmployrecord().equals(other.getEmployrecord()))
            && (this.getEduexperience() == null ? other.getEduexperience() == null : this.getEduexperience().equals(other.getEduexperience()))
            && (this.getEdudegree() == null ? other.getEdudegree() == null : this.getEdudegree().equals(other.getEdudegree()))
            && (this.getGraduateyear() == null ? other.getGraduateyear() == null : this.getGraduateyear().equals(other.getGraduateyear()))
            && (this.getCreditlevel() == null ? other.getCreditlevel() == null : this.getCreditlevel().equals(other.getCreditlevel()))
            && (this.getEvaluatedate() == null ? other.getEvaluatedate() == null : this.getEvaluatedate().equals(other.getEvaluatedate()))
            && (this.getBalancesheet() == null ? other.getBalancesheet() == null : this.getBalancesheet().equals(other.getBalancesheet()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getSelfmonthincome() == null ? other.getSelfmonthincome() == null : this.getSelfmonthincome().equals(other.getSelfmonthincome()))
            && (this.getFamilymonthincome() == null ? other.getFamilymonthincome() == null : this.getFamilymonthincome().equals(other.getFamilymonthincome()))
            && (this.getIncomesource() == null ? other.getIncomesource() == null : this.getIncomesource().equals(other.getIncomesource()))
            && (this.getPopulation() == null ? other.getPopulation() == null : this.getPopulation().equals(other.getPopulation()))
            && (this.getFarmersort() == null ? other.getFarmersort() == null : this.getFarmersort().equals(other.getFarmersort()))
            && (this.getRegionalism() == null ? other.getRegionalism() == null : this.getRegionalism().equals(other.getRegionalism()))
            && (this.getStaff() == null ? other.getStaff() == null : this.getStaff().equals(other.getStaff()))
            && (this.getCreditfarmer() == null ? other.getCreditfarmer() == null : this.getCreditfarmer().equals(other.getCreditfarmer()))
            && (this.getInputorgid() == null ? other.getInputorgid() == null : this.getInputorgid().equals(other.getInputorgid()))
            && (this.getInputuserid() == null ? other.getInputuserid() == null : this.getInputuserid().equals(other.getInputuserid()))
            && (this.getInputdate() == null ? other.getInputdate() == null : this.getInputdate().equals(other.getInputdate()))
            && (this.getUpdatedate() == null ? other.getUpdatedate() == null : this.getUpdatedate().equals(other.getUpdatedate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getUpdateorgid() == null ? other.getUpdateorgid() == null : this.getUpdateorgid().equals(other.getUpdateorgid()))
            && (this.getUpdateuserid() == null ? other.getUpdateuserid() == null : this.getUpdateuserid().equals(other.getUpdateuserid()))
            && (this.getCommadd() == null ? other.getCommadd() == null : this.getCommadd().equals(other.getCommadd()))
            && (this.getCommzip() == null ? other.getCommzip() == null : this.getCommzip().equals(other.getCommzip()))
            && (this.getNativeadd() == null ? other.getNativeadd() == null : this.getNativeadd().equals(other.getNativeadd()))
            && (this.getWorkzip() == null ? other.getWorkzip() == null : this.getWorkzip().equals(other.getWorkzip()))
            && (this.getHeadship() == null ? other.getHeadship() == null : this.getHeadship().equals(other.getHeadship()))
            && (this.getWorkbegindate() == null ? other.getWorkbegindate() == null : this.getWorkbegindate().equals(other.getWorkbegindate()))
            && (this.getYearincome() == null ? other.getYearincome() == null : this.getYearincome().equals(other.getYearincome()))
            && (this.getFamilystatus() == null ? other.getFamilystatus() == null : this.getFamilystatus().equals(other.getFamilystatus()))
            && (this.getTempsaveflag() == null ? other.getTempsaveflag() == null : this.getTempsaveflag().equals(other.getTempsaveflag()))
            && (this.getEngname() == null ? other.getEngname() == null : this.getEngname().equals(other.getEngname()))
            && (this.getRegioncode() == null ? other.getRegioncode() == null : this.getRegioncode().equals(other.getRegioncode()))
            && (this.getWorknature() == null ? other.getWorknature() == null : this.getWorknature().equals(other.getWorknature()))
            && (this.getChildflag() == null ? other.getChildflag() == null : this.getChildflag().equals(other.getChildflag()))
            && (this.getLocalyear() == null ? other.getLocalyear() == null : this.getLocalyear().equals(other.getLocalyear()))
            && (this.getPosionlevel() == null ? other.getPosionlevel() == null : this.getPosionlevel().equals(other.getPosionlevel()))
            && (this.getFirsttel() == null ? other.getFirsttel() == null : this.getFirsttel().equals(other.getFirsttel()))
            && (this.getFirstemail() == null ? other.getFirstemail() == null : this.getFirstemail().equals(other.getFirstemail()))
            && (this.getMonthincome() == null ? other.getMonthincome() == null : this.getMonthincome().equals(other.getMonthincome()))
            && (this.getCorpzone() == null ? other.getCorpzone() == null : this.getCorpzone().equals(other.getCorpzone()))
            && (this.getCorparea() == null ? other.getCorparea() == null : this.getCorparea().equals(other.getCorparea()))
            && (this.getCorpextension() == null ? other.getCorpextension() == null : this.getCorpextension().equals(other.getCorpextension()))
            && (this.getHousezone() == null ? other.getHousezone() == null : this.getHousezone().equals(other.getHousezone()))
            && (this.getHousearea() == null ? other.getHousearea() == null : this.getHousearea().equals(other.getHousearea()))
            && (this.getCompanynature() == null ? other.getCompanynature() == null : this.getCompanynature().equals(other.getCompanynature()))
            && (this.getQqcode() == null ? other.getQqcode() == null : this.getQqcode().equals(other.getQqcode()))
            && (this.getWhilomname() == null ? other.getWhilomname() == null : this.getWhilomname().equals(other.getWhilomname()))
            && (this.getDrivinglicence() == null ? other.getDrivinglicence() == null : this.getDrivinglicence().equals(other.getDrivinglicence()))
            && (this.getIsown() == null ? other.getIsown() == null : this.getIsown().equals(other.getIsown()))
            && (this.getChanneltype() == null ? other.getChanneltype() == null : this.getChanneltype().equals(other.getChanneltype()))
            && (this.getChannelgroupnum() == null ? other.getChannelgroupnum() == null : this.getChannelgroupnum().equals(other.getChannelgroupnum()))
            && (this.getHousingarea() == null ? other.getHousingarea() == null : this.getHousingarea().equals(other.getHousingarea()))
            && (this.getMascriptionadss() == null ? other.getMascriptionadss() == null : this.getMascriptionadss().equals(other.getMascriptionadss()))
            && (this.getGetbusytime() == null ? other.getGetbusytime() == null : this.getGetbusytime().equals(other.getGetbusytime()))
            && (this.getWorktime() == null ? other.getWorktime() == null : this.getWorktime().equals(other.getWorktime()))
            && (this.getDimissiontime() == null ? other.getDimissiontime() == null : this.getDimissiontime().equals(other.getDimissiontime()))
            && (this.getSubsistpamount() == null ? other.getSubsistpamount() == null : this.getSubsistpamount().equals(other.getSubsistpamount()))
            && (this.getIsborrower() == null ? other.getIsborrower() == null : this.getIsborrower().equals(other.getIsborrower()))
            && (this.getIswarrantor() == null ? other.getIswarrantor() == null : this.getIswarrantor().equals(other.getIswarrantor()))
            && (this.getCertmaturitydate() == null ? other.getCertmaturitydate() == null : this.getCertmaturitydate().equals(other.getCertmaturitydate()))
            && (this.getSendcardorgan() == null ? other.getSendcardorgan() == null : this.getSendcardorgan().equals(other.getSendcardorgan()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getEmptype() == null ? other.getEmptype() == null : this.getEmptype().equals(other.getEmptype()))
            && (this.getCusleveltype() == null ? other.getCusleveltype() == null : this.getCusleveltype().equals(other.getCusleveltype()))
            && (this.getLocaltype() == null ? other.getLocaltype() == null : this.getLocaltype().equals(other.getLocaltype()))
            && (this.getCertid18() == null ? other.getCertid18() == null : this.getCertid18().equals(other.getCertid18()))
            && (this.getHomesum() == null ? other.getHomesum() == null : this.getHomesum().equals(other.getHomesum()))
            && (this.getFamilysumroot() == null ? other.getFamilysumroot() == null : this.getFamilysumroot().equals(other.getFamilysumroot()))
            && (this.getFamilypincome() == null ? other.getFamilypincome() == null : this.getFamilypincome().equals(other.getFamilypincome()))
            && (this.getHomeloanblance() == null ? other.getHomeloanblance() == null : this.getHomeloanblance().equals(other.getHomeloanblance()))
            && (this.getHomeloanmonthsum() == null ? other.getHomeloanmonthsum() == null : this.getHomeloanmonthsum().equals(other.getHomeloanmonthsum()))
            && (this.getCarloanblance() == null ? other.getCarloanblance() == null : this.getCarloanblance().equals(other.getCarloanblance()))
            && (this.getCarloanmonthsum() == null ? other.getCarloanmonthsum() == null : this.getCarloanmonthsum().equals(other.getCarloanmonthsum()))
            && (this.getOtherloanblance() == null ? other.getOtherloanblance() == null : this.getOtherloanblance().equals(other.getOtherloanblance()))
            && (this.getOtherloanmonthsum() == null ? other.getOtherloanmonthsum() == null : this.getOtherloanmonthsum().equals(other.getOtherloanmonthsum()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getBankname() == null ? other.getBankname() == null : this.getBankname().equals(other.getBankname()))
            && (this.getBankcard() == null ? other.getBankcard() == null : this.getBankcard().equals(other.getBankcard()))
            && (this.getBankcode() == null ? other.getBankcode() == null : this.getBankcode().equals(other.getBankcode()))
            && (this.getBankcardphone() == null ? other.getBankcardphone() == null : this.getBankcardphone().equals(other.getBankcardphone()))
            && (this.getSidflag() == null ? other.getSidflag() == null : this.getSidflag().equals(other.getSidflag()))
            && (this.getEdurecord() == null ? other.getEdurecord() == null : this.getEdurecord().equals(other.getEdurecord()))
            && (this.getVerifytype() == null ? other.getVerifytype() == null : this.getVerifytype().equals(other.getVerifytype()))
            && (this.getHousenumber() == null ? other.getHousenumber() == null : this.getHousenumber().equals(other.getHousenumber()))
            && (this.getNativeplacetel() == null ? other.getNativeplacetel() == null : this.getNativeplacetel().equals(other.getNativeplacetel()))
            && (this.getFamilytelbelong() == null ? other.getFamilytelbelong() == null : this.getFamilytelbelong().equals(other.getFamilytelbelong()))
            && (this.getFamilybegintime() == null ? other.getFamilybegintime() == null : this.getFamilybegintime().equals(other.getFamilybegintime()))
            && (this.getIsparent() == null ? other.getIsparent() == null : this.getIsparent().equals(other.getIsparent()))
            && (this.getHousetype() == null ? other.getHousetype() == null : this.getHousetype().equals(other.getHousetype()))
            && (this.getHouseprice() == null ? other.getHouseprice() == null : this.getHouseprice().equals(other.getHouseprice()))
            && (this.getHousesize() == null ? other.getHousesize() == null : this.getHousesize().equals(other.getHousesize()))
            && (this.getHousemonth() == null ? other.getHousemonth() == null : this.getHousemonth().equals(other.getHousemonth()))
            && (this.getHousetime() == null ? other.getHousetime() == null : this.getHousetime().equals(other.getHousetime()))
            && (this.getProvence() == null ? other.getProvence() == null : this.getProvence().equals(other.getProvence()))
            && (this.getProvencename() == null ? other.getProvencename() == null : this.getProvencename().equals(other.getProvencename()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCityname() == null ? other.getCityname() == null : this.getCityname().equals(other.getCityname()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAreaname() == null ? other.getAreaname() == null : this.getAreaname().equals(other.getAreaname()))
            && (this.getHouseadd() == null ? other.getHouseadd() == null : this.getHouseadd().equals(other.getHouseadd()))
            && (this.getHousezip() == null ? other.getHousezip() == null : this.getHousezip().equals(other.getHousezip()))
            && (this.getEntrytime() == null ? other.getEntrytime() == null : this.getEntrytime().equals(other.getEntrytime()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getWorktel2() == null ? other.getWorktel2() == null : this.getWorktel2().equals(other.getWorktel2()))
            && (this.getMonthpayday() == null ? other.getMonthpayday() == null : this.getMonthpayday().equals(other.getMonthpayday()))
            && (this.getBonusincome() == null ? other.getBonusincome() == null : this.getBonusincome().equals(other.getBonusincome()))
            && (this.getIssueform() == null ? other.getIssueform() == null : this.getIssueform().equals(other.getIssueform()))
            && (this.getSourceincome() == null ? other.getSourceincome() == null : this.getSourceincome().equals(other.getSourceincome()))
            && (this.getChangenumber() == null ? other.getChangenumber() == null : this.getChangenumber().equals(other.getChangenumber()))
            && (this.getWorkcorp1() == null ? other.getWorkcorp1() == null : this.getWorkcorp1().equals(other.getWorkcorp1()))
            && (this.getWorktel1() == null ? other.getWorktel1() == null : this.getWorktel1().equals(other.getWorktel1()))
            && (this.getWorkage1() == null ? other.getWorkage1() == null : this.getWorkage1().equals(other.getWorkage1()))
            && (this.getWorkadd1() == null ? other.getWorkadd1() == null : this.getWorkadd1().equals(other.getWorkadd1()))
            && (this.getWorkzip1() == null ? other.getWorkzip1() == null : this.getWorkzip1().equals(other.getWorkzip1()))
            && (this.getNativezip() == null ? other.getNativezip() == null : this.getNativezip().equals(other.getNativezip()))
            && (this.getRent() == null ? other.getRent() == null : this.getRent().equals(other.getRent()))
            && (this.getMarketvalue() == null ? other.getMarketvalue() == null : this.getMarketvalue().equals(other.getMarketvalue()))
            && (this.getHomeloanmonth() == null ? other.getHomeloanmonth() == null : this.getHomeloanmonth().equals(other.getHomeloanmonth()))
            && (this.getInsurancecompany() == null ? other.getInsurancecompany() == null : this.getInsurancecompany().equals(other.getInsurancecompany()))
            && (this.getInsuredlocation() == null ? other.getInsuredlocation() == null : this.getInsuredlocation().equals(other.getInsuredlocation()))
            && (this.getEffectivedate() == null ? other.getEffectivedate() == null : this.getEffectivedate().equals(other.getEffectivedate()))
            && (this.getPayyear() == null ? other.getPayyear() == null : this.getPayyear().equals(other.getPayyear()))
            && (this.getInsuranceno() == null ? other.getInsuranceno() == null : this.getInsuranceno().equals(other.getInsuranceno()))
            && (this.getPaytype() == null ? other.getPaytype() == null : this.getPaytype().equals(other.getPaytype()))
            && (this.getRegularpremium() == null ? other.getRegularpremium() == null : this.getRegularpremium().equals(other.getRegularpremium()))
            && (this.getInsurancesum() == null ? other.getInsurancesum() == null : this.getInsurancesum().equals(other.getInsurancesum()))
            && (this.getInsurancetype() == null ? other.getInsurancetype() == null : this.getInsurancetype().equals(other.getInsurancetype()))
            && (this.getInsuredname() == null ? other.getInsuredname() == null : this.getInsuredname().equals(other.getInsuredname()))
            && (this.getInsurancetel() == null ? other.getInsurancetel() == null : this.getInsurancetel().equals(other.getInsurancetel()))
            && (this.getInsurancecompany1() == null ? other.getInsurancecompany1() == null : this.getInsurancecompany1().equals(other.getInsurancecompany1()))
            && (this.getInsuredlocation1() == null ? other.getInsuredlocation1() == null : this.getInsuredlocation1().equals(other.getInsuredlocation1()))
            && (this.getEffectivedate1() == null ? other.getEffectivedate1() == null : this.getEffectivedate1().equals(other.getEffectivedate1()))
            && (this.getPayyear1() == null ? other.getPayyear1() == null : this.getPayyear1().equals(other.getPayyear1()))
            && (this.getInsuranceno1() == null ? other.getInsuranceno1() == null : this.getInsuranceno1().equals(other.getInsuranceno1()))
            && (this.getPaytype1() == null ? other.getPaytype1() == null : this.getPaytype1().equals(other.getPaytype1()))
            && (this.getRegularpremium1() == null ? other.getRegularpremium1() == null : this.getRegularpremium1().equals(other.getRegularpremium1()))
            && (this.getInsurancesum1() == null ? other.getInsurancesum1() == null : this.getInsurancesum1().equals(other.getInsurancesum1()))
            && (this.getInsurancetype1() == null ? other.getInsurancetype1() == null : this.getInsurancetype1().equals(other.getInsurancetype1()))
            && (this.getInsuredname1() == null ? other.getInsuredname1() == null : this.getInsuredname1().equals(other.getInsuredname1()))
            && (this.getInsurancetel1() == null ? other.getInsurancetel1() == null : this.getInsurancetel1().equals(other.getInsurancetel1()))
            && (this.getCompanysize() == null ? other.getCompanysize() == null : this.getCompanysize().equals(other.getCompanysize()))
            && (this.getFirsttime() == null ? other.getFirsttime() == null : this.getFirsttime().equals(other.getFirsttime()))
            && (this.getNowcomtime() == null ? other.getNowcomtime() == null : this.getNowcomtime().equals(other.getNowcomtime()))
            && (this.getMonthsum() == null ? other.getMonthsum() == null : this.getMonthsum().equals(other.getMonthsum()))
            && (this.getHousennmber() == null ? other.getHousennmber() == null : this.getHousennmber().equals(other.getHousennmber()))
            && (this.getUpdatetimestamp() == null ? other.getUpdatetimestamp() == null : this.getUpdatetimestamp().equals(other.getUpdatetimestamp()))
            && (this.getFinFactoryStatus() == null ? other.getFinFactoryStatus() == null : this.getFinFactoryStatus().equals(other.getFinFactoryStatus()))
            && (this.getIndType() == null ? other.getIndType() == null : this.getIndType().equals(other.getIndType()))
            && (this.getJoinWorkTime() == null ? other.getJoinWorkTime() == null : this.getJoinWorkTime().equals(other.getJoinWorkTime()))
            && (this.getCardBeginTime() == null ? other.getCardBeginTime() == null : this.getCardBeginTime().equals(other.getCardBeginTime()))
            && (this.getCardEndTime() == null ? other.getCardEndTime() == null : this.getCardEndTime().equals(other.getCardEndTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getOccupationId() == null ? other.getOccupationId() == null : this.getOccupationId().equals(other.getOccupationId()))
            && (this.getBusinessLicense() == null ? other.getBusinessLicense() == null : this.getBusinessLicense().equals(other.getBusinessLicense()))
            && (this.getLoginPhone() == null ? other.getLoginPhone() == null : this.getLoginPhone().equals(other.getLoginPhone()))
            && (this.getBindTime() == null ? other.getBindTime() == null : this.getBindTime().equals(other.getBindTime()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getRootreame() == null ? other.getRootreame() == null : this.getRootreame().equals(other.getRootreame()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getFullname() == null) ? 0 : getFullname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getCerttype() == null) ? 0 : getCerttype().hashCode());
        result = prime * result + ((getCertid() == null) ? 0 : getCertid().hashCode());
        result = prime * result + ((getSino() == null) ? 0 : getSino().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getNativeplace() == null) ? 0 : getNativeplace().hashCode());
        result = prime * result + ((getPoliticalface() == null) ? 0 : getPoliticalface().hashCode());
        result = prime * result + ((getMarriage() == null) ? 0 : getMarriage().hashCode());
        result = prime * result + ((getRelativetype() == null) ? 0 : getRelativetype().hashCode());
        result = prime * result + ((getFamilyadd() == null) ? 0 : getFamilyadd().hashCode());
        result = prime * result + ((getFamilyzip() == null) ? 0 : getFamilyzip().hashCode());
        result = prime * result + ((getEmailadd() == null) ? 0 : getEmailadd().hashCode());
        result = prime * result + ((getFamilytel() == null) ? 0 : getFamilytel().hashCode());
        result = prime * result + ((getFamilytel1() == null) ? 0 : getFamilytel1().hashCode());
        result = prime * result + ((getFamilytel2() == null) ? 0 : getFamilytel2().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getPhone1() == null) ? 0 : getPhone1().hashCode());
        result = prime * result + ((getPhone2() == null) ? 0 : getPhone2().hashCode());
        result = prime * result + ((getUnitkind() == null) ? 0 : getUnitkind().hashCode());
        result = prime * result + ((getWorkcorp() == null) ? 0 : getWorkcorp().hashCode());
        result = prime * result + ((getWorkadd() == null) ? 0 : getWorkadd().hashCode());
        result = prime * result + ((getWorktel() == null) ? 0 : getWorktel().hashCode());
        result = prime * result + ((getOccupation() == null) ? 0 : getOccupation().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getEmployrecord() == null) ? 0 : getEmployrecord().hashCode());
        result = prime * result + ((getEduexperience() == null) ? 0 : getEduexperience().hashCode());
        result = prime * result + ((getEdudegree() == null) ? 0 : getEdudegree().hashCode());
        result = prime * result + ((getGraduateyear() == null) ? 0 : getGraduateyear().hashCode());
        result = prime * result + ((getCreditlevel() == null) ? 0 : getCreditlevel().hashCode());
        result = prime * result + ((getEvaluatedate() == null) ? 0 : getEvaluatedate().hashCode());
        result = prime * result + ((getBalancesheet() == null) ? 0 : getBalancesheet().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getSelfmonthincome() == null) ? 0 : getSelfmonthincome().hashCode());
        result = prime * result + ((getFamilymonthincome() == null) ? 0 : getFamilymonthincome().hashCode());
        result = prime * result + ((getIncomesource() == null) ? 0 : getIncomesource().hashCode());
        result = prime * result + ((getPopulation() == null) ? 0 : getPopulation().hashCode());
        result = prime * result + ((getFarmersort() == null) ? 0 : getFarmersort().hashCode());
        result = prime * result + ((getRegionalism() == null) ? 0 : getRegionalism().hashCode());
        result = prime * result + ((getStaff() == null) ? 0 : getStaff().hashCode());
        result = prime * result + ((getCreditfarmer() == null) ? 0 : getCreditfarmer().hashCode());
        result = prime * result + ((getInputorgid() == null) ? 0 : getInputorgid().hashCode());
        result = prime * result + ((getInputuserid() == null) ? 0 : getInputuserid().hashCode());
        result = prime * result + ((getInputdate() == null) ? 0 : getInputdate().hashCode());
        result = prime * result + ((getUpdatedate() == null) ? 0 : getUpdatedate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getUpdateorgid() == null) ? 0 : getUpdateorgid().hashCode());
        result = prime * result + ((getUpdateuserid() == null) ? 0 : getUpdateuserid().hashCode());
        result = prime * result + ((getCommadd() == null) ? 0 : getCommadd().hashCode());
        result = prime * result + ((getCommzip() == null) ? 0 : getCommzip().hashCode());
        result = prime * result + ((getNativeadd() == null) ? 0 : getNativeadd().hashCode());
        result = prime * result + ((getWorkzip() == null) ? 0 : getWorkzip().hashCode());
        result = prime * result + ((getHeadship() == null) ? 0 : getHeadship().hashCode());
        result = prime * result + ((getWorkbegindate() == null) ? 0 : getWorkbegindate().hashCode());
        result = prime * result + ((getYearincome() == null) ? 0 : getYearincome().hashCode());
        result = prime * result + ((getFamilystatus() == null) ? 0 : getFamilystatus().hashCode());
        result = prime * result + ((getTempsaveflag() == null) ? 0 : getTempsaveflag().hashCode());
        result = prime * result + ((getEngname() == null) ? 0 : getEngname().hashCode());
        result = prime * result + ((getRegioncode() == null) ? 0 : getRegioncode().hashCode());
        result = prime * result + ((getWorknature() == null) ? 0 : getWorknature().hashCode());
        result = prime * result + ((getChildflag() == null) ? 0 : getChildflag().hashCode());
        result = prime * result + ((getLocalyear() == null) ? 0 : getLocalyear().hashCode());
        result = prime * result + ((getPosionlevel() == null) ? 0 : getPosionlevel().hashCode());
        result = prime * result + ((getFirsttel() == null) ? 0 : getFirsttel().hashCode());
        result = prime * result + ((getFirstemail() == null) ? 0 : getFirstemail().hashCode());
        result = prime * result + ((getMonthincome() == null) ? 0 : getMonthincome().hashCode());
        result = prime * result + ((getCorpzone() == null) ? 0 : getCorpzone().hashCode());
        result = prime * result + ((getCorparea() == null) ? 0 : getCorparea().hashCode());
        result = prime * result + ((getCorpextension() == null) ? 0 : getCorpextension().hashCode());
        result = prime * result + ((getHousezone() == null) ? 0 : getHousezone().hashCode());
        result = prime * result + ((getHousearea() == null) ? 0 : getHousearea().hashCode());
        result = prime * result + ((getCompanynature() == null) ? 0 : getCompanynature().hashCode());
        result = prime * result + ((getQqcode() == null) ? 0 : getQqcode().hashCode());
        result = prime * result + ((getWhilomname() == null) ? 0 : getWhilomname().hashCode());
        result = prime * result + ((getDrivinglicence() == null) ? 0 : getDrivinglicence().hashCode());
        result = prime * result + ((getIsown() == null) ? 0 : getIsown().hashCode());
        result = prime * result + ((getChanneltype() == null) ? 0 : getChanneltype().hashCode());
        result = prime * result + ((getChannelgroupnum() == null) ? 0 : getChannelgroupnum().hashCode());
        result = prime * result + ((getHousingarea() == null) ? 0 : getHousingarea().hashCode());
        result = prime * result + ((getMascriptionadss() == null) ? 0 : getMascriptionadss().hashCode());
        result = prime * result + ((getGetbusytime() == null) ? 0 : getGetbusytime().hashCode());
        result = prime * result + ((getWorktime() == null) ? 0 : getWorktime().hashCode());
        result = prime * result + ((getDimissiontime() == null) ? 0 : getDimissiontime().hashCode());
        result = prime * result + ((getSubsistpamount() == null) ? 0 : getSubsistpamount().hashCode());
        result = prime * result + ((getIsborrower() == null) ? 0 : getIsborrower().hashCode());
        result = prime * result + ((getIswarrantor() == null) ? 0 : getIswarrantor().hashCode());
        result = prime * result + ((getCertmaturitydate() == null) ? 0 : getCertmaturitydate().hashCode());
        result = prime * result + ((getSendcardorgan() == null) ? 0 : getSendcardorgan().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getEmptype() == null) ? 0 : getEmptype().hashCode());
        result = prime * result + ((getCusleveltype() == null) ? 0 : getCusleveltype().hashCode());
        result = prime * result + ((getLocaltype() == null) ? 0 : getLocaltype().hashCode());
        result = prime * result + ((getCertid18() == null) ? 0 : getCertid18().hashCode());
        result = prime * result + ((getHomesum() == null) ? 0 : getHomesum().hashCode());
        result = prime * result + ((getFamilysumroot() == null) ? 0 : getFamilysumroot().hashCode());
        result = prime * result + ((getFamilypincome() == null) ? 0 : getFamilypincome().hashCode());
        result = prime * result + ((getHomeloanblance() == null) ? 0 : getHomeloanblance().hashCode());
        result = prime * result + ((getHomeloanmonthsum() == null) ? 0 : getHomeloanmonthsum().hashCode());
        result = prime * result + ((getCarloanblance() == null) ? 0 : getCarloanblance().hashCode());
        result = prime * result + ((getCarloanmonthsum() == null) ? 0 : getCarloanmonthsum().hashCode());
        result = prime * result + ((getOtherloanblance() == null) ? 0 : getOtherloanblance().hashCode());
        result = prime * result + ((getOtherloanmonthsum() == null) ? 0 : getOtherloanmonthsum().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getBankname() == null) ? 0 : getBankname().hashCode());
        result = prime * result + ((getBankcard() == null) ? 0 : getBankcard().hashCode());
        result = prime * result + ((getBankcode() == null) ? 0 : getBankcode().hashCode());
        result = prime * result + ((getBankcardphone() == null) ? 0 : getBankcardphone().hashCode());
        result = prime * result + ((getSidflag() == null) ? 0 : getSidflag().hashCode());
        result = prime * result + ((getEdurecord() == null) ? 0 : getEdurecord().hashCode());
        result = prime * result + ((getVerifytype() == null) ? 0 : getVerifytype().hashCode());
        result = prime * result + ((getHousenumber() == null) ? 0 : getHousenumber().hashCode());
        result = prime * result + ((getNativeplacetel() == null) ? 0 : getNativeplacetel().hashCode());
        result = prime * result + ((getFamilytelbelong() == null) ? 0 : getFamilytelbelong().hashCode());
        result = prime * result + ((getFamilybegintime() == null) ? 0 : getFamilybegintime().hashCode());
        result = prime * result + ((getIsparent() == null) ? 0 : getIsparent().hashCode());
        result = prime * result + ((getHousetype() == null) ? 0 : getHousetype().hashCode());
        result = prime * result + ((getHouseprice() == null) ? 0 : getHouseprice().hashCode());
        result = prime * result + ((getHousesize() == null) ? 0 : getHousesize().hashCode());
        result = prime * result + ((getHousemonth() == null) ? 0 : getHousemonth().hashCode());
        result = prime * result + ((getHousetime() == null) ? 0 : getHousetime().hashCode());
        result = prime * result + ((getProvence() == null) ? 0 : getProvence().hashCode());
        result = prime * result + ((getProvencename() == null) ? 0 : getProvencename().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCityname() == null) ? 0 : getCityname().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAreaname() == null) ? 0 : getAreaname().hashCode());
        result = prime * result + ((getHouseadd() == null) ? 0 : getHouseadd().hashCode());
        result = prime * result + ((getHousezip() == null) ? 0 : getHousezip().hashCode());
        result = prime * result + ((getEntrytime() == null) ? 0 : getEntrytime().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getWorktel2() == null) ? 0 : getWorktel2().hashCode());
        result = prime * result + ((getMonthpayday() == null) ? 0 : getMonthpayday().hashCode());
        result = prime * result + ((getBonusincome() == null) ? 0 : getBonusincome().hashCode());
        result = prime * result + ((getIssueform() == null) ? 0 : getIssueform().hashCode());
        result = prime * result + ((getSourceincome() == null) ? 0 : getSourceincome().hashCode());
        result = prime * result + ((getChangenumber() == null) ? 0 : getChangenumber().hashCode());
        result = prime * result + ((getWorkcorp1() == null) ? 0 : getWorkcorp1().hashCode());
        result = prime * result + ((getWorktel1() == null) ? 0 : getWorktel1().hashCode());
        result = prime * result + ((getWorkage1() == null) ? 0 : getWorkage1().hashCode());
        result = prime * result + ((getWorkadd1() == null) ? 0 : getWorkadd1().hashCode());
        result = prime * result + ((getWorkzip1() == null) ? 0 : getWorkzip1().hashCode());
        result = prime * result + ((getNativezip() == null) ? 0 : getNativezip().hashCode());
        result = prime * result + ((getRent() == null) ? 0 : getRent().hashCode());
        result = prime * result + ((getMarketvalue() == null) ? 0 : getMarketvalue().hashCode());
        result = prime * result + ((getHomeloanmonth() == null) ? 0 : getHomeloanmonth().hashCode());
        result = prime * result + ((getInsurancecompany() == null) ? 0 : getInsurancecompany().hashCode());
        result = prime * result + ((getInsuredlocation() == null) ? 0 : getInsuredlocation().hashCode());
        result = prime * result + ((getEffectivedate() == null) ? 0 : getEffectivedate().hashCode());
        result = prime * result + ((getPayyear() == null) ? 0 : getPayyear().hashCode());
        result = prime * result + ((getInsuranceno() == null) ? 0 : getInsuranceno().hashCode());
        result = prime * result + ((getPaytype() == null) ? 0 : getPaytype().hashCode());
        result = prime * result + ((getRegularpremium() == null) ? 0 : getRegularpremium().hashCode());
        result = prime * result + ((getInsurancesum() == null) ? 0 : getInsurancesum().hashCode());
        result = prime * result + ((getInsurancetype() == null) ? 0 : getInsurancetype().hashCode());
        result = prime * result + ((getInsuredname() == null) ? 0 : getInsuredname().hashCode());
        result = prime * result + ((getInsurancetel() == null) ? 0 : getInsurancetel().hashCode());
        result = prime * result + ((getInsurancecompany1() == null) ? 0 : getInsurancecompany1().hashCode());
        result = prime * result + ((getInsuredlocation1() == null) ? 0 : getInsuredlocation1().hashCode());
        result = prime * result + ((getEffectivedate1() == null) ? 0 : getEffectivedate1().hashCode());
        result = prime * result + ((getPayyear1() == null) ? 0 : getPayyear1().hashCode());
        result = prime * result + ((getInsuranceno1() == null) ? 0 : getInsuranceno1().hashCode());
        result = prime * result + ((getPaytype1() == null) ? 0 : getPaytype1().hashCode());
        result = prime * result + ((getRegularpremium1() == null) ? 0 : getRegularpremium1().hashCode());
        result = prime * result + ((getInsurancesum1() == null) ? 0 : getInsurancesum1().hashCode());
        result = prime * result + ((getInsurancetype1() == null) ? 0 : getInsurancetype1().hashCode());
        result = prime * result + ((getInsuredname1() == null) ? 0 : getInsuredname1().hashCode());
        result = prime * result + ((getInsurancetel1() == null) ? 0 : getInsurancetel1().hashCode());
        result = prime * result + ((getCompanysize() == null) ? 0 : getCompanysize().hashCode());
        result = prime * result + ((getFirsttime() == null) ? 0 : getFirsttime().hashCode());
        result = prime * result + ((getNowcomtime() == null) ? 0 : getNowcomtime().hashCode());
        result = prime * result + ((getMonthsum() == null) ? 0 : getMonthsum().hashCode());
        result = prime * result + ((getHousennmber() == null) ? 0 : getHousennmber().hashCode());
        result = prime * result + ((getUpdatetimestamp() == null) ? 0 : getUpdatetimestamp().hashCode());
        result = prime * result + ((getFinFactoryStatus() == null) ? 0 : getFinFactoryStatus().hashCode());
        result = prime * result + ((getIndType() == null) ? 0 : getIndType().hashCode());
        result = prime * result + ((getJoinWorkTime() == null) ? 0 : getJoinWorkTime().hashCode());
        result = prime * result + ((getCardBeginTime() == null) ? 0 : getCardBeginTime().hashCode());
        result = prime * result + ((getCardEndTime() == null) ? 0 : getCardEndTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getOccupationId() == null) ? 0 : getOccupationId().hashCode());
        result = prime * result + ((getBusinessLicense() == null) ? 0 : getBusinessLicense().hashCode());
        result = prime * result + ((getLoginPhone() == null) ? 0 : getLoginPhone().hashCode());
        result = prime * result + ((getBindTime() == null) ? 0 : getBindTime().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getRootreame() == null) ? 0 : getRootreame().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerid=").append(customerid);
        sb.append(", fullname=").append(fullname);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", certtype=").append(certtype);
        sb.append(", certid=").append(certid);
        sb.append(", sino=").append(sino);
        sb.append(", country=").append(country);
        sb.append(", nationality=").append(nationality);
        sb.append(", nativeplace=").append(nativeplace);
        sb.append(", politicalface=").append(politicalface);
        sb.append(", marriage=").append(marriage);
        sb.append(", relativetype=").append(relativetype);
        sb.append(", familyadd=").append(familyadd);
        sb.append(", familyzip=").append(familyzip);
        sb.append(", emailadd=").append(emailadd);
        sb.append(", familytel=").append(familytel);
        sb.append(", familytel1=").append(familytel1);
        sb.append(", familytel2=").append(familytel2);
        sb.append(", phone=").append(phone);
        sb.append(", phone1=").append(phone1);
        sb.append(", phone2=").append(phone2);
        sb.append(", unitkind=").append(unitkind);
        sb.append(", workcorp=").append(workcorp);
        sb.append(", workadd=").append(workadd);
        sb.append(", worktel=").append(worktel);
        sb.append(", occupation=").append(occupation);
        sb.append(", position=").append(position);
        sb.append(", employrecord=").append(employrecord);
        sb.append(", eduexperience=").append(eduexperience);
        sb.append(", edudegree=").append(edudegree);
        sb.append(", graduateyear=").append(graduateyear);
        sb.append(", creditlevel=").append(creditlevel);
        sb.append(", evaluatedate=").append(evaluatedate);
        sb.append(", balancesheet=").append(balancesheet);
        sb.append(", intro=").append(intro);
        sb.append(", selfmonthincome=").append(selfmonthincome);
        sb.append(", familymonthincome=").append(familymonthincome);
        sb.append(", incomesource=").append(incomesource);
        sb.append(", population=").append(population);
        sb.append(", farmersort=").append(farmersort);
        sb.append(", regionalism=").append(regionalism);
        sb.append(", staff=").append(staff);
        sb.append(", creditfarmer=").append(creditfarmer);
        sb.append(", inputorgid=").append(inputorgid);
        sb.append(", inputuserid=").append(inputuserid);
        sb.append(", inputdate=").append(inputdate);
        sb.append(", updatedate=").append(updatedate);
        sb.append(", remark=").append(remark);
        sb.append(", updateorgid=").append(updateorgid);
        sb.append(", updateuserid=").append(updateuserid);
        sb.append(", commadd=").append(commadd);
        sb.append(", commzip=").append(commzip);
        sb.append(", nativeadd=").append(nativeadd);
        sb.append(", workzip=").append(workzip);
        sb.append(", headship=").append(headship);
        sb.append(", workbegindate=").append(workbegindate);
        sb.append(", yearincome=").append(yearincome);
        sb.append(", familystatus=").append(familystatus);
        sb.append(", tempsaveflag=").append(tempsaveflag);
        sb.append(", engname=").append(engname);
        sb.append(", regioncode=").append(regioncode);
        sb.append(", worknature=").append(worknature);
        sb.append(", childflag=").append(childflag);
        sb.append(", localyear=").append(localyear);
        sb.append(", posionlevel=").append(posionlevel);
        sb.append(", firsttel=").append(firsttel);
        sb.append(", firstemail=").append(firstemail);
        sb.append(", monthincome=").append(monthincome);
        sb.append(", corpzone=").append(corpzone);
        sb.append(", corparea=").append(corparea);
        sb.append(", corpextension=").append(corpextension);
        sb.append(", housezone=").append(housezone);
        sb.append(", housearea=").append(housearea);
        sb.append(", companynature=").append(companynature);
        sb.append(", qqcode=").append(qqcode);
        sb.append(", whilomname=").append(whilomname);
        sb.append(", drivinglicence=").append(drivinglicence);
        sb.append(", isown=").append(isown);
        sb.append(", channeltype=").append(channeltype);
        sb.append(", channelgroupnum=").append(channelgroupnum);
        sb.append(", housingarea=").append(housingarea);
        sb.append(", mascriptionadss=").append(mascriptionadss);
        sb.append(", getbusytime=").append(getbusytime);
        sb.append(", worktime=").append(worktime);
        sb.append(", dimissiontime=").append(dimissiontime);
        sb.append(", subsistpamount=").append(subsistpamount);
        sb.append(", isborrower=").append(isborrower);
        sb.append(", iswarrantor=").append(iswarrantor);
        sb.append(", certmaturitydate=").append(certmaturitydate);
        sb.append(", sendcardorgan=").append(sendcardorgan);
        sb.append(", age=").append(age);
        sb.append(", emptype=").append(emptype);
        sb.append(", cusleveltype=").append(cusleveltype);
        sb.append(", localtype=").append(localtype);
        sb.append(", certid18=").append(certid18);
        sb.append(", homesum=").append(homesum);
        sb.append(", familysumroot=").append(familysumroot);
        sb.append(", familypincome=").append(familypincome);
        sb.append(", homeloanblance=").append(homeloanblance);
        sb.append(", homeloanmonthsum=").append(homeloanmonthsum);
        sb.append(", carloanblance=").append(carloanblance);
        sb.append(", carloanmonthsum=").append(carloanmonthsum);
        sb.append(", otherloanblance=").append(otherloanblance);
        sb.append(", otherloanmonthsum=").append(otherloanmonthsum);
        sb.append(", userid=").append(userid);
        sb.append(", bankname=").append(bankname);
        sb.append(", bankcard=").append(bankcard);
        sb.append(", bankcode=").append(bankcode);
        sb.append(", bankcardphone=").append(bankcardphone);
        sb.append(", sidflag=").append(sidflag);
        sb.append(", edurecord=").append(edurecord);
        sb.append(", verifytype=").append(verifytype);
        sb.append(", housenumber=").append(housenumber);
        sb.append(", nativeplacetel=").append(nativeplacetel);
        sb.append(", familytelbelong=").append(familytelbelong);
        sb.append(", familybegintime=").append(familybegintime);
        sb.append(", isparent=").append(isparent);
        sb.append(", housetype=").append(housetype);
        sb.append(", houseprice=").append(houseprice);
        sb.append(", housesize=").append(housesize);
        sb.append(", housemonth=").append(housemonth);
        sb.append(", housetime=").append(housetime);
        sb.append(", provence=").append(provence);
        sb.append(", provencename=").append(provencename);
        sb.append(", city=").append(city);
        sb.append(", cityname=").append(cityname);
        sb.append(", area=").append(area);
        sb.append(", areaname=").append(areaname);
        sb.append(", houseadd=").append(houseadd);
        sb.append(", housezip=").append(housezip);
        sb.append(", entrytime=").append(entrytime);
        sb.append(", department=").append(department);
        sb.append(", worktel2=").append(worktel2);
        sb.append(", monthpayday=").append(monthpayday);
        sb.append(", bonusincome=").append(bonusincome);
        sb.append(", issueform=").append(issueform);
        sb.append(", sourceincome=").append(sourceincome);
        sb.append(", changenumber=").append(changenumber);
        sb.append(", workcorp1=").append(workcorp1);
        sb.append(", worktel1=").append(worktel1);
        sb.append(", workage1=").append(workage1);
        sb.append(", workadd1=").append(workadd1);
        sb.append(", workzip1=").append(workzip1);
        sb.append(", nativezip=").append(nativezip);
        sb.append(", rent=").append(rent);
        sb.append(", marketvalue=").append(marketvalue);
        sb.append(", homeloanmonth=").append(homeloanmonth);
        sb.append(", insurancecompany=").append(insurancecompany);
        sb.append(", insuredlocation=").append(insuredlocation);
        sb.append(", effectivedate=").append(effectivedate);
        sb.append(", payyear=").append(payyear);
        sb.append(", insuranceno=").append(insuranceno);
        sb.append(", paytype=").append(paytype);
        sb.append(", regularpremium=").append(regularpremium);
        sb.append(", insurancesum=").append(insurancesum);
        sb.append(", insurancetype=").append(insurancetype);
        sb.append(", insuredname=").append(insuredname);
        sb.append(", insurancetel=").append(insurancetel);
        sb.append(", insurancecompany1=").append(insurancecompany1);
        sb.append(", insuredlocation1=").append(insuredlocation1);
        sb.append(", effectivedate1=").append(effectivedate1);
        sb.append(", payyear1=").append(payyear1);
        sb.append(", insuranceno1=").append(insuranceno1);
        sb.append(", paytype1=").append(paytype1);
        sb.append(", regularpremium1=").append(regularpremium1);
        sb.append(", insurancesum1=").append(insurancesum1);
        sb.append(", insurancetype1=").append(insurancetype1);
        sb.append(", insuredname1=").append(insuredname1);
        sb.append(", insurancetel1=").append(insurancetel1);
        sb.append(", companysize=").append(companysize);
        sb.append(", firsttime=").append(firsttime);
        sb.append(", nowcomtime=").append(nowcomtime);
        sb.append(", monthsum=").append(monthsum);
        sb.append(", housennmber=").append(housennmber);
        sb.append(", updatetimestamp=").append(updatetimestamp);
        sb.append(", finFactoryStatus=").append(finFactoryStatus);
        sb.append(", indType=").append(indType);
        sb.append(", joinWorkTime=").append(joinWorkTime);
        sb.append(", cardBeginTime=").append(cardBeginTime);
        sb.append(", cardEndTime=").append(cardEndTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", occupationId=").append(occupationId);
        sb.append(", businessLicense=").append(businessLicense);
        sb.append(", loginPhone=").append(loginPhone);
        sb.append(", bindTime=").append(bindTime);
        sb.append(", openId=").append(openId);
        sb.append(", rootreame=").append(rootreame);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}