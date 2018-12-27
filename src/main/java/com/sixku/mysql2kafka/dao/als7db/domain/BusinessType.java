package com.sixku.mysql2kafka.dao.als7db.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class BusinessType implements Serializable {
    /**
     * 产品编号
     */
    private String typeno;

    private String sortno;

    /**
     * 最低额
     */
    private String minmoney;

    /**
     * 最高额
     */
    private String maxmoney;

    /**
     * 借款人最小年龄
     */
    private String minage;

    /**
     * 借款人最大年龄
     */
    private String maxage;

    /**
     * 产品名称
     */
    private String typename;

    private String typesortno;

    private String subtypecode;

    private String infoset;

    private String displaytemplet;

    /**
     * 开始日期
     */
    private String attribute1;

    /**
     * 结束日期
     */
    private String attribute2;

    private String attribute3;

    private String attribute4;

    private String attribute5;

    /**
     * 还款类型
     */
    private String attribute6;

    private String attribute7;

    private String attribute8;

    private String attribute9;

    private String attribute10;

    private String remark;

    private String applydetailno;

    private String approvedetailno;

    private String contractdetailno;

    private String inputuser;

    private String inputorg;

    private String inputtime;

    private String updateuser;

    private String updatetime;

    private String attribute11;

    private String attribute12;

    private String attribute13;

    private String attribute14;

    private String attribute15;

    private String attribute16;

    private String attribute17;

    private String attribute18;

    private String attribute19;

    private String attribute20;

    private String attribute21;

    private String attribute22;

    private String attribute23;

    private String attribute24;

    private String attribute25;

    /**
     * 是否在用 1是 2否
     */
    private String isinuse;

    private String offsheetflag;

    /**
     * 0 不可提前结清，1 可提前结清
     */
    private String isahead;

    /**
     * 更新时间
     */
    private Date updatetimestamp;

    /**
     * 产品类别0010：传统产品，0020：闪信贷类产品
     */
    private String productcategory;

    /**
     * 1-线上，2-线下
     */
    private String channelFg;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 产品属性
     */
    private String productProperty;

    /**
     * 产品类型：1055000001表线上，1055000002表线下
     */
    private String productType;

    /**
     * 系统编号
     */
    private String sysNo;

    private static final long serialVersionUID = 1L;

    public String getTypeno() {
        return typeno;
    }

    public void setTypeno(String typeno) {
        this.typeno = typeno;
    }

    public String getSortno() {
        return sortno;
    }

    public void setSortno(String sortno) {
        this.sortno = sortno;
    }

    public String getMinmoney() {
        return minmoney;
    }

    public void setMinmoney(String minmoney) {
        this.minmoney = minmoney;
    }

    public String getMaxmoney() {
        return maxmoney;
    }

    public void setMaxmoney(String maxmoney) {
        this.maxmoney = maxmoney;
    }

    public String getMinage() {
        return minage;
    }

    public void setMinage(String minage) {
        this.minage = minage;
    }

    public String getMaxage() {
        return maxage;
    }

    public void setMaxage(String maxage) {
        this.maxage = maxage;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getTypesortno() {
        return typesortno;
    }

    public void setTypesortno(String typesortno) {
        this.typesortno = typesortno;
    }

    public String getSubtypecode() {
        return subtypecode;
    }

    public void setSubtypecode(String subtypecode) {
        this.subtypecode = subtypecode;
    }

    public String getInfoset() {
        return infoset;
    }

    public void setInfoset(String infoset) {
        this.infoset = infoset;
    }

    public String getDisplaytemplet() {
        return displaytemplet;
    }

    public void setDisplaytemplet(String displaytemplet) {
        this.displaytemplet = displaytemplet;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getApplydetailno() {
        return applydetailno;
    }

    public void setApplydetailno(String applydetailno) {
        this.applydetailno = applydetailno;
    }

    public String getApprovedetailno() {
        return approvedetailno;
    }

    public void setApprovedetailno(String approvedetailno) {
        this.approvedetailno = approvedetailno;
    }

    public String getContractdetailno() {
        return contractdetailno;
    }

    public void setContractdetailno(String contractdetailno) {
        this.contractdetailno = contractdetailno;
    }

    public String getInputuser() {
        return inputuser;
    }

    public void setInputuser(String inputuser) {
        this.inputuser = inputuser;
    }

    public String getInputorg() {
        return inputorg;
    }

    public void setInputorg(String inputorg) {
        this.inputorg = inputorg;
    }

    public String getInputtime() {
        return inputtime;
    }

    public void setInputtime(String inputtime) {
        this.inputtime = inputtime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    public String getAttribute16() {
        return attribute16;
    }

    public void setAttribute16(String attribute16) {
        this.attribute16 = attribute16;
    }

    public String getAttribute17() {
        return attribute17;
    }

    public void setAttribute17(String attribute17) {
        this.attribute17 = attribute17;
    }

    public String getAttribute18() {
        return attribute18;
    }

    public void setAttribute18(String attribute18) {
        this.attribute18 = attribute18;
    }

    public String getAttribute19() {
        return attribute19;
    }

    public void setAttribute19(String attribute19) {
        this.attribute19 = attribute19;
    }

    public String getAttribute20() {
        return attribute20;
    }

    public void setAttribute20(String attribute20) {
        this.attribute20 = attribute20;
    }

    public String getAttribute21() {
        return attribute21;
    }

    public void setAttribute21(String attribute21) {
        this.attribute21 = attribute21;
    }

    public String getAttribute22() {
        return attribute22;
    }

    public void setAttribute22(String attribute22) {
        this.attribute22 = attribute22;
    }

    public String getAttribute23() {
        return attribute23;
    }

    public void setAttribute23(String attribute23) {
        this.attribute23 = attribute23;
    }

    public String getAttribute24() {
        return attribute24;
    }

    public void setAttribute24(String attribute24) {
        this.attribute24 = attribute24;
    }

    public String getAttribute25() {
        return attribute25;
    }

    public void setAttribute25(String attribute25) {
        this.attribute25 = attribute25;
    }

    public String getIsinuse() {
        return isinuse;
    }

    public void setIsinuse(String isinuse) {
        this.isinuse = isinuse;
    }

    public String getOffsheetflag() {
        return offsheetflag;
    }

    public void setOffsheetflag(String offsheetflag) {
        this.offsheetflag = offsheetflag;
    }

    public String getIsahead() {
        return isahead;
    }

    public void setIsahead(String isahead) {
        this.isahead = isahead;
    }

    public Date getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(Date updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    public String getProductcategory() {
        return productcategory;
    }

    public void setProductcategory(String productcategory) {
        this.productcategory = productcategory;
    }

    public String getChannelFg() {
        return channelFg;
    }

    public void setChannelFg(String channelFg) {
        this.channelFg = channelFg;
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

    public String getProductProperty() {
        return productProperty;
    }

    public void setProductProperty(String productProperty) {
        this.productProperty = productProperty;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSysNo() {
        return sysNo;
    }

    public void setSysNo(String sysNo) {
        this.sysNo = sysNo;
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
        BusinessType other = (BusinessType) that;
        return (this.getTypeno() == null ? other.getTypeno() == null : this.getTypeno().equals(other.getTypeno()))
            && (this.getSortno() == null ? other.getSortno() == null : this.getSortno().equals(other.getSortno()))
            && (this.getMinmoney() == null ? other.getMinmoney() == null : this.getMinmoney().equals(other.getMinmoney()))
            && (this.getMaxmoney() == null ? other.getMaxmoney() == null : this.getMaxmoney().equals(other.getMaxmoney()))
            && (this.getMinage() == null ? other.getMinage() == null : this.getMinage().equals(other.getMinage()))
            && (this.getMaxage() == null ? other.getMaxage() == null : this.getMaxage().equals(other.getMaxage()))
            && (this.getTypename() == null ? other.getTypename() == null : this.getTypename().equals(other.getTypename()))
            && (this.getTypesortno() == null ? other.getTypesortno() == null : this.getTypesortno().equals(other.getTypesortno()))
            && (this.getSubtypecode() == null ? other.getSubtypecode() == null : this.getSubtypecode().equals(other.getSubtypecode()))
            && (this.getInfoset() == null ? other.getInfoset() == null : this.getInfoset().equals(other.getInfoset()))
            && (this.getDisplaytemplet() == null ? other.getDisplaytemplet() == null : this.getDisplaytemplet().equals(other.getDisplaytemplet()))
            && (this.getAttribute1() == null ? other.getAttribute1() == null : this.getAttribute1().equals(other.getAttribute1()))
            && (this.getAttribute2() == null ? other.getAttribute2() == null : this.getAttribute2().equals(other.getAttribute2()))
            && (this.getAttribute3() == null ? other.getAttribute3() == null : this.getAttribute3().equals(other.getAttribute3()))
            && (this.getAttribute4() == null ? other.getAttribute4() == null : this.getAttribute4().equals(other.getAttribute4()))
            && (this.getAttribute5() == null ? other.getAttribute5() == null : this.getAttribute5().equals(other.getAttribute5()))
            && (this.getAttribute6() == null ? other.getAttribute6() == null : this.getAttribute6().equals(other.getAttribute6()))
            && (this.getAttribute7() == null ? other.getAttribute7() == null : this.getAttribute7().equals(other.getAttribute7()))
            && (this.getAttribute8() == null ? other.getAttribute8() == null : this.getAttribute8().equals(other.getAttribute8()))
            && (this.getAttribute9() == null ? other.getAttribute9() == null : this.getAttribute9().equals(other.getAttribute9()))
            && (this.getAttribute10() == null ? other.getAttribute10() == null : this.getAttribute10().equals(other.getAttribute10()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getApplydetailno() == null ? other.getApplydetailno() == null : this.getApplydetailno().equals(other.getApplydetailno()))
            && (this.getApprovedetailno() == null ? other.getApprovedetailno() == null : this.getApprovedetailno().equals(other.getApprovedetailno()))
            && (this.getContractdetailno() == null ? other.getContractdetailno() == null : this.getContractdetailno().equals(other.getContractdetailno()))
            && (this.getInputuser() == null ? other.getInputuser() == null : this.getInputuser().equals(other.getInputuser()))
            && (this.getInputorg() == null ? other.getInputorg() == null : this.getInputorg().equals(other.getInputorg()))
            && (this.getInputtime() == null ? other.getInputtime() == null : this.getInputtime().equals(other.getInputtime()))
            && (this.getUpdateuser() == null ? other.getUpdateuser() == null : this.getUpdateuser().equals(other.getUpdateuser()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getAttribute11() == null ? other.getAttribute11() == null : this.getAttribute11().equals(other.getAttribute11()))
            && (this.getAttribute12() == null ? other.getAttribute12() == null : this.getAttribute12().equals(other.getAttribute12()))
            && (this.getAttribute13() == null ? other.getAttribute13() == null : this.getAttribute13().equals(other.getAttribute13()))
            && (this.getAttribute14() == null ? other.getAttribute14() == null : this.getAttribute14().equals(other.getAttribute14()))
            && (this.getAttribute15() == null ? other.getAttribute15() == null : this.getAttribute15().equals(other.getAttribute15()))
            && (this.getAttribute16() == null ? other.getAttribute16() == null : this.getAttribute16().equals(other.getAttribute16()))
            && (this.getAttribute17() == null ? other.getAttribute17() == null : this.getAttribute17().equals(other.getAttribute17()))
            && (this.getAttribute18() == null ? other.getAttribute18() == null : this.getAttribute18().equals(other.getAttribute18()))
            && (this.getAttribute19() == null ? other.getAttribute19() == null : this.getAttribute19().equals(other.getAttribute19()))
            && (this.getAttribute20() == null ? other.getAttribute20() == null : this.getAttribute20().equals(other.getAttribute20()))
            && (this.getAttribute21() == null ? other.getAttribute21() == null : this.getAttribute21().equals(other.getAttribute21()))
            && (this.getAttribute22() == null ? other.getAttribute22() == null : this.getAttribute22().equals(other.getAttribute22()))
            && (this.getAttribute23() == null ? other.getAttribute23() == null : this.getAttribute23().equals(other.getAttribute23()))
            && (this.getAttribute24() == null ? other.getAttribute24() == null : this.getAttribute24().equals(other.getAttribute24()))
            && (this.getAttribute25() == null ? other.getAttribute25() == null : this.getAttribute25().equals(other.getAttribute25()))
            && (this.getIsinuse() == null ? other.getIsinuse() == null : this.getIsinuse().equals(other.getIsinuse()))
            && (this.getOffsheetflag() == null ? other.getOffsheetflag() == null : this.getOffsheetflag().equals(other.getOffsheetflag()))
            && (this.getIsahead() == null ? other.getIsahead() == null : this.getIsahead().equals(other.getIsahead()))
            && (this.getUpdatetimestamp() == null ? other.getUpdatetimestamp() == null : this.getUpdatetimestamp().equals(other.getUpdatetimestamp()))
            && (this.getProductcategory() == null ? other.getProductcategory() == null : this.getProductcategory().equals(other.getProductcategory()))
            && (this.getChannelFg() == null ? other.getChannelFg() == null : this.getChannelFg().equals(other.getChannelFg()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getProductProperty() == null ? other.getProductProperty() == null : this.getProductProperty().equals(other.getProductProperty()))
            && (this.getProductType() == null ? other.getProductType() == null : this.getProductType().equals(other.getProductType()))
            && (this.getSysNo() == null ? other.getSysNo() == null : this.getSysNo().equals(other.getSysNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTypeno() == null) ? 0 : getTypeno().hashCode());
        result = prime * result + ((getSortno() == null) ? 0 : getSortno().hashCode());
        result = prime * result + ((getMinmoney() == null) ? 0 : getMinmoney().hashCode());
        result = prime * result + ((getMaxmoney() == null) ? 0 : getMaxmoney().hashCode());
        result = prime * result + ((getMinage() == null) ? 0 : getMinage().hashCode());
        result = prime * result + ((getMaxage() == null) ? 0 : getMaxage().hashCode());
        result = prime * result + ((getTypename() == null) ? 0 : getTypename().hashCode());
        result = prime * result + ((getTypesortno() == null) ? 0 : getTypesortno().hashCode());
        result = prime * result + ((getSubtypecode() == null) ? 0 : getSubtypecode().hashCode());
        result = prime * result + ((getInfoset() == null) ? 0 : getInfoset().hashCode());
        result = prime * result + ((getDisplaytemplet() == null) ? 0 : getDisplaytemplet().hashCode());
        result = prime * result + ((getAttribute1() == null) ? 0 : getAttribute1().hashCode());
        result = prime * result + ((getAttribute2() == null) ? 0 : getAttribute2().hashCode());
        result = prime * result + ((getAttribute3() == null) ? 0 : getAttribute3().hashCode());
        result = prime * result + ((getAttribute4() == null) ? 0 : getAttribute4().hashCode());
        result = prime * result + ((getAttribute5() == null) ? 0 : getAttribute5().hashCode());
        result = prime * result + ((getAttribute6() == null) ? 0 : getAttribute6().hashCode());
        result = prime * result + ((getAttribute7() == null) ? 0 : getAttribute7().hashCode());
        result = prime * result + ((getAttribute8() == null) ? 0 : getAttribute8().hashCode());
        result = prime * result + ((getAttribute9() == null) ? 0 : getAttribute9().hashCode());
        result = prime * result + ((getAttribute10() == null) ? 0 : getAttribute10().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getApplydetailno() == null) ? 0 : getApplydetailno().hashCode());
        result = prime * result + ((getApprovedetailno() == null) ? 0 : getApprovedetailno().hashCode());
        result = prime * result + ((getContractdetailno() == null) ? 0 : getContractdetailno().hashCode());
        result = prime * result + ((getInputuser() == null) ? 0 : getInputuser().hashCode());
        result = prime * result + ((getInputorg() == null) ? 0 : getInputorg().hashCode());
        result = prime * result + ((getInputtime() == null) ? 0 : getInputtime().hashCode());
        result = prime * result + ((getUpdateuser() == null) ? 0 : getUpdateuser().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getAttribute11() == null) ? 0 : getAttribute11().hashCode());
        result = prime * result + ((getAttribute12() == null) ? 0 : getAttribute12().hashCode());
        result = prime * result + ((getAttribute13() == null) ? 0 : getAttribute13().hashCode());
        result = prime * result + ((getAttribute14() == null) ? 0 : getAttribute14().hashCode());
        result = prime * result + ((getAttribute15() == null) ? 0 : getAttribute15().hashCode());
        result = prime * result + ((getAttribute16() == null) ? 0 : getAttribute16().hashCode());
        result = prime * result + ((getAttribute17() == null) ? 0 : getAttribute17().hashCode());
        result = prime * result + ((getAttribute18() == null) ? 0 : getAttribute18().hashCode());
        result = prime * result + ((getAttribute19() == null) ? 0 : getAttribute19().hashCode());
        result = prime * result + ((getAttribute20() == null) ? 0 : getAttribute20().hashCode());
        result = prime * result + ((getAttribute21() == null) ? 0 : getAttribute21().hashCode());
        result = prime * result + ((getAttribute22() == null) ? 0 : getAttribute22().hashCode());
        result = prime * result + ((getAttribute23() == null) ? 0 : getAttribute23().hashCode());
        result = prime * result + ((getAttribute24() == null) ? 0 : getAttribute24().hashCode());
        result = prime * result + ((getAttribute25() == null) ? 0 : getAttribute25().hashCode());
        result = prime * result + ((getIsinuse() == null) ? 0 : getIsinuse().hashCode());
        result = prime * result + ((getOffsheetflag() == null) ? 0 : getOffsheetflag().hashCode());
        result = prime * result + ((getIsahead() == null) ? 0 : getIsahead().hashCode());
        result = prime * result + ((getUpdatetimestamp() == null) ? 0 : getUpdatetimestamp().hashCode());
        result = prime * result + ((getProductcategory() == null) ? 0 : getProductcategory().hashCode());
        result = prime * result + ((getChannelFg() == null) ? 0 : getChannelFg().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getProductProperty() == null) ? 0 : getProductProperty().hashCode());
        result = prime * result + ((getProductType() == null) ? 0 : getProductType().hashCode());
        result = prime * result + ((getSysNo() == null) ? 0 : getSysNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeno=").append(typeno);
        sb.append(", sortno=").append(sortno);
        sb.append(", minmoney=").append(minmoney);
        sb.append(", maxmoney=").append(maxmoney);
        sb.append(", minage=").append(minage);
        sb.append(", maxage=").append(maxage);
        sb.append(", typename=").append(typename);
        sb.append(", typesortno=").append(typesortno);
        sb.append(", subtypecode=").append(subtypecode);
        sb.append(", infoset=").append(infoset);
        sb.append(", displaytemplet=").append(displaytemplet);
        sb.append(", attribute1=").append(attribute1);
        sb.append(", attribute2=").append(attribute2);
        sb.append(", attribute3=").append(attribute3);
        sb.append(", attribute4=").append(attribute4);
        sb.append(", attribute5=").append(attribute5);
        sb.append(", attribute6=").append(attribute6);
        sb.append(", attribute7=").append(attribute7);
        sb.append(", attribute8=").append(attribute8);
        sb.append(", attribute9=").append(attribute9);
        sb.append(", attribute10=").append(attribute10);
        sb.append(", remark=").append(remark);
        sb.append(", applydetailno=").append(applydetailno);
        sb.append(", approvedetailno=").append(approvedetailno);
        sb.append(", contractdetailno=").append(contractdetailno);
        sb.append(", inputuser=").append(inputuser);
        sb.append(", inputorg=").append(inputorg);
        sb.append(", inputtime=").append(inputtime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", attribute11=").append(attribute11);
        sb.append(", attribute12=").append(attribute12);
        sb.append(", attribute13=").append(attribute13);
        sb.append(", attribute14=").append(attribute14);
        sb.append(", attribute15=").append(attribute15);
        sb.append(", attribute16=").append(attribute16);
        sb.append(", attribute17=").append(attribute17);
        sb.append(", attribute18=").append(attribute18);
        sb.append(", attribute19=").append(attribute19);
        sb.append(", attribute20=").append(attribute20);
        sb.append(", attribute21=").append(attribute21);
        sb.append(", attribute22=").append(attribute22);
        sb.append(", attribute23=").append(attribute23);
        sb.append(", attribute24=").append(attribute24);
        sb.append(", attribute25=").append(attribute25);
        sb.append(", isinuse=").append(isinuse);
        sb.append(", offsheetflag=").append(offsheetflag);
        sb.append(", isahead=").append(isahead);
        sb.append(", updatetimestamp=").append(updatetimestamp);
        sb.append(", productcategory=").append(productcategory);
        sb.append(", channelFg=").append(channelFg);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", productProperty=").append(productProperty);
        sb.append(", productType=").append(productType);
        sb.append(", sysNo=").append(sysNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}