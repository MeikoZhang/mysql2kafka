package com.sixku.mysql2kafka.dao.als7db.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusinessContractExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSerialnoIsNull() {
            addCriterion("SERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNotNull() {
            addCriterion("SERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnoEqualTo(String value) {
            addCriterion("SERIALNO =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(String value) {
            addCriterion("SERIALNO <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(String value) {
            addCriterion("SERIALNO >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(String value) {
            addCriterion("SERIALNO >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(String value) {
            addCriterion("SERIALNO <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(String value) {
            addCriterion("SERIALNO <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLike(String value) {
            addCriterion("SERIALNO like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotLike(String value) {
            addCriterion("SERIALNO not like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<String> values) {
            addCriterion("SERIALNO in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<String> values) {
            addCriterion("SERIALNO not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(String value1, String value2) {
            addCriterion("SERIALNO between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(String value1, String value2) {
            addCriterion("SERIALNO not between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("CUSTOMERID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CUSTOMERID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("CUSTOMERID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("CUSTOMERID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("CUSTOMERID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("CUSTOMERID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("CUSTOMERID like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("CUSTOMERID not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("CUSTOMERID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("CUSTOMERID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("CUSTOMERID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("BUSINESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("BUSINESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("BUSINESSTYPE =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("BUSINESSTYPE <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("BUSINESSTYPE >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("BUSINESSTYPE <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("BUSINESSTYPE like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("BUSINESSTYPE not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("BUSINESSTYPE in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("BUSINESSTYPE not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNull() {
            addCriterion("BANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNotNull() {
            addCriterion("BANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankcodeEqualTo(String value) {
            addCriterion("BANKCODE =", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotEqualTo(String value) {
            addCriterion("BANKCODE <>", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThan(String value) {
            addCriterion("BANKCODE >", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCODE >=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThan(String value) {
            addCriterion("BANKCODE <", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThanOrEqualTo(String value) {
            addCriterion("BANKCODE <=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLike(String value) {
            addCriterion("BANKCODE like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotLike(String value) {
            addCriterion("BANKCODE not like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeIn(List<String> values) {
            addCriterion("BANKCODE in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotIn(List<String> values) {
            addCriterion("BANKCODE not in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeBetween(String value1, String value2) {
            addCriterion("BANKCODE between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotBetween(String value1, String value2) {
            addCriterion("BANKCODE not between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNull() {
            addCriterion("BANKCARD is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNotNull() {
            addCriterion("BANKCARD is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardEqualTo(String value) {
            addCriterion("BANKCARD =", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotEqualTo(String value) {
            addCriterion("BANKCARD <>", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThan(String value) {
            addCriterion("BANKCARD >", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCARD >=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThan(String value) {
            addCriterion("BANKCARD <", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThanOrEqualTo(String value) {
            addCriterion("BANKCARD <=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLike(String value) {
            addCriterion("BANKCARD like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotLike(String value) {
            addCriterion("BANKCARD not like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardIn(List<String> values) {
            addCriterion("BANKCARD in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotIn(List<String> values) {
            addCriterion("BANKCARD not in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardBetween(String value1, String value2) {
            addCriterion("BANKCARD between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotBetween(String value1, String value2) {
            addCriterion("BANKCARD not between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneIsNull() {
            addCriterion("BANKCARDPHONE is null");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneIsNotNull() {
            addCriterion("BANKCARDPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneEqualTo(String value) {
            addCriterion("BANKCARDPHONE =", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneNotEqualTo(String value) {
            addCriterion("BANKCARDPHONE <>", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneGreaterThan(String value) {
            addCriterion("BANKCARDPHONE >", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCARDPHONE >=", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneLessThan(String value) {
            addCriterion("BANKCARDPHONE <", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneLessThanOrEqualTo(String value) {
            addCriterion("BANKCARDPHONE <=", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneLike(String value) {
            addCriterion("BANKCARDPHONE like", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneNotLike(String value) {
            addCriterion("BANKCARDPHONE not like", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneIn(List<String> values) {
            addCriterion("BANKCARDPHONE in", values, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneNotIn(List<String> values) {
            addCriterion("BANKCARDPHONE not in", values, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneBetween(String value1, String value2) {
            addCriterion("BANKCARDPHONE between", value1, value2, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneNotBetween(String value1, String value2) {
            addCriterion("BANKCARDPHONE not between", value1, value2, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andShopsnIsNull() {
            addCriterion("SHOPSN is null");
            return (Criteria) this;
        }

        public Criteria andShopsnIsNotNull() {
            addCriterion("SHOPSN is not null");
            return (Criteria) this;
        }

        public Criteria andShopsnEqualTo(String value) {
            addCriterion("SHOPSN =", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnNotEqualTo(String value) {
            addCriterion("SHOPSN <>", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnGreaterThan(String value) {
            addCriterion("SHOPSN >", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnGreaterThanOrEqualTo(String value) {
            addCriterion("SHOPSN >=", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnLessThan(String value) {
            addCriterion("SHOPSN <", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnLessThanOrEqualTo(String value) {
            addCriterion("SHOPSN <=", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnLike(String value) {
            addCriterion("SHOPSN like", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnNotLike(String value) {
            addCriterion("SHOPSN not like", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnIn(List<String> values) {
            addCriterion("SHOPSN in", values, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnNotIn(List<String> values) {
            addCriterion("SHOPSN not in", values, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnBetween(String value1, String value2) {
            addCriterion("SHOPSN between", value1, value2, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnNotBetween(String value1, String value2) {
            addCriterion("SHOPSN not between", value1, value2, "shopsn");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceIsNull() {
            addCriterion("CUSTOMERSERVICE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceIsNotNull() {
            addCriterion("CUSTOMERSERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceEqualTo(String value) {
            addCriterion("CUSTOMERSERVICE =", value, "customerservice");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceNotEqualTo(String value) {
            addCriterion("CUSTOMERSERVICE <>", value, "customerservice");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceGreaterThan(String value) {
            addCriterion("CUSTOMERSERVICE >", value, "customerservice");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSERVICE >=", value, "customerservice");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceLessThan(String value) {
            addCriterion("CUSTOMERSERVICE <", value, "customerservice");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSERVICE <=", value, "customerservice");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceLike(String value) {
            addCriterion("CUSTOMERSERVICE like", value, "customerservice");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceNotLike(String value) {
            addCriterion("CUSTOMERSERVICE not like", value, "customerservice");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceIn(List<String> values) {
            addCriterion("CUSTOMERSERVICE in", values, "customerservice");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceNotIn(List<String> values) {
            addCriterion("CUSTOMERSERVICE not in", values, "customerservice");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceBetween(String value1, String value2) {
            addCriterion("CUSTOMERSERVICE between", value1, value2, "customerservice");
            return (Criteria) this;
        }

        public Criteria andCustomerserviceNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERSERVICE not between", value1, value2, "customerservice");
            return (Criteria) this;
        }

        public Criteria andSalersnIsNull() {
            addCriterion("SALERSN is null");
            return (Criteria) this;
        }

        public Criteria andSalersnIsNotNull() {
            addCriterion("SALERSN is not null");
            return (Criteria) this;
        }

        public Criteria andSalersnEqualTo(String value) {
            addCriterion("SALERSN =", value, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalersnNotEqualTo(String value) {
            addCriterion("SALERSN <>", value, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalersnGreaterThan(String value) {
            addCriterion("SALERSN >", value, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalersnGreaterThanOrEqualTo(String value) {
            addCriterion("SALERSN >=", value, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalersnLessThan(String value) {
            addCriterion("SALERSN <", value, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalersnLessThanOrEqualTo(String value) {
            addCriterion("SALERSN <=", value, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalersnLike(String value) {
            addCriterion("SALERSN like", value, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalersnNotLike(String value) {
            addCriterion("SALERSN not like", value, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalersnIn(List<String> values) {
            addCriterion("SALERSN in", values, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalersnNotIn(List<String> values) {
            addCriterion("SALERSN not in", values, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalersnBetween(String value1, String value2) {
            addCriterion("SALERSN between", value1, value2, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalersnNotBetween(String value1, String value2) {
            addCriterion("SALERSN not between", value1, value2, "salersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnIsNull() {
            addCriterion("SALECENTERSN is null");
            return (Criteria) this;
        }

        public Criteria andSalecentersnIsNotNull() {
            addCriterion("SALECENTERSN is not null");
            return (Criteria) this;
        }

        public Criteria andSalecentersnEqualTo(String value) {
            addCriterion("SALECENTERSN =", value, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnNotEqualTo(String value) {
            addCriterion("SALECENTERSN <>", value, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnGreaterThan(String value) {
            addCriterion("SALECENTERSN >", value, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnGreaterThanOrEqualTo(String value) {
            addCriterion("SALECENTERSN >=", value, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnLessThan(String value) {
            addCriterion("SALECENTERSN <", value, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnLessThanOrEqualTo(String value) {
            addCriterion("SALECENTERSN <=", value, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnLike(String value) {
            addCriterion("SALECENTERSN like", value, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnNotLike(String value) {
            addCriterion("SALECENTERSN not like", value, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnIn(List<String> values) {
            addCriterion("SALECENTERSN in", values, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnNotIn(List<String> values) {
            addCriterion("SALECENTERSN not in", values, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnBetween(String value1, String value2) {
            addCriterion("SALECENTERSN between", value1, value2, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andSalecentersnNotBetween(String value1, String value2) {
            addCriterion("SALECENTERSN not between", value1, value2, "salecentersn");
            return (Criteria) this;
        }

        public Criteria andApplytermIsNull() {
            addCriterion("APPLYTERM is null");
            return (Criteria) this;
        }

        public Criteria andApplytermIsNotNull() {
            addCriterion("APPLYTERM is not null");
            return (Criteria) this;
        }

        public Criteria andApplytermEqualTo(String value) {
            addCriterion("APPLYTERM =", value, "applyterm");
            return (Criteria) this;
        }

        public Criteria andApplytermNotEqualTo(String value) {
            addCriterion("APPLYTERM <>", value, "applyterm");
            return (Criteria) this;
        }

        public Criteria andApplytermGreaterThan(String value) {
            addCriterion("APPLYTERM >", value, "applyterm");
            return (Criteria) this;
        }

        public Criteria andApplytermGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYTERM >=", value, "applyterm");
            return (Criteria) this;
        }

        public Criteria andApplytermLessThan(String value) {
            addCriterion("APPLYTERM <", value, "applyterm");
            return (Criteria) this;
        }

        public Criteria andApplytermLessThanOrEqualTo(String value) {
            addCriterion("APPLYTERM <=", value, "applyterm");
            return (Criteria) this;
        }

        public Criteria andApplytermLike(String value) {
            addCriterion("APPLYTERM like", value, "applyterm");
            return (Criteria) this;
        }

        public Criteria andApplytermNotLike(String value) {
            addCriterion("APPLYTERM not like", value, "applyterm");
            return (Criteria) this;
        }

        public Criteria andApplytermIn(List<String> values) {
            addCriterion("APPLYTERM in", values, "applyterm");
            return (Criteria) this;
        }

        public Criteria andApplytermNotIn(List<String> values) {
            addCriterion("APPLYTERM not in", values, "applyterm");
            return (Criteria) this;
        }

        public Criteria andApplytermBetween(String value1, String value2) {
            addCriterion("APPLYTERM between", value1, value2, "applyterm");
            return (Criteria) this;
        }

        public Criteria andApplytermNotBetween(String value1, String value2) {
            addCriterion("APPLYTERM not between", value1, value2, "applyterm");
            return (Criteria) this;
        }

        public Criteria andMonthrepayIsNull() {
            addCriterion("MONTHREPAY is null");
            return (Criteria) this;
        }

        public Criteria andMonthrepayIsNotNull() {
            addCriterion("MONTHREPAY is not null");
            return (Criteria) this;
        }

        public Criteria andMonthrepayEqualTo(BigDecimal value) {
            addCriterion("MONTHREPAY =", value, "monthrepay");
            return (Criteria) this;
        }

        public Criteria andMonthrepayNotEqualTo(BigDecimal value) {
            addCriterion("MONTHREPAY <>", value, "monthrepay");
            return (Criteria) this;
        }

        public Criteria andMonthrepayGreaterThan(BigDecimal value) {
            addCriterion("MONTHREPAY >", value, "monthrepay");
            return (Criteria) this;
        }

        public Criteria andMonthrepayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHREPAY >=", value, "monthrepay");
            return (Criteria) this;
        }

        public Criteria andMonthrepayLessThan(BigDecimal value) {
            addCriterion("MONTHREPAY <", value, "monthrepay");
            return (Criteria) this;
        }

        public Criteria andMonthrepayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHREPAY <=", value, "monthrepay");
            return (Criteria) this;
        }

        public Criteria andMonthrepayIn(List<BigDecimal> values) {
            addCriterion("MONTHREPAY in", values, "monthrepay");
            return (Criteria) this;
        }

        public Criteria andMonthrepayNotIn(List<BigDecimal> values) {
            addCriterion("MONTHREPAY not in", values, "monthrepay");
            return (Criteria) this;
        }

        public Criteria andMonthrepayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHREPAY between", value1, value2, "monthrepay");
            return (Criteria) this;
        }

        public Criteria andMonthrepayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHREPAY not between", value1, value2, "monthrepay");
            return (Criteria) this;
        }

        public Criteria andBusinesssumIsNull() {
            addCriterion("BUSINESSSUM is null");
            return (Criteria) this;
        }

        public Criteria andBusinesssumIsNotNull() {
            addCriterion("BUSINESSSUM is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesssumEqualTo(BigDecimal value) {
            addCriterion("BUSINESSSUM =", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumNotEqualTo(BigDecimal value) {
            addCriterion("BUSINESSSUM <>", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumGreaterThan(BigDecimal value) {
            addCriterion("BUSINESSSUM >", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESSSUM >=", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumLessThan(BigDecimal value) {
            addCriterion("BUSINESSSUM <", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESSSUM <=", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumIn(List<BigDecimal> values) {
            addCriterion("BUSINESSSUM in", values, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumNotIn(List<BigDecimal> values) {
            addCriterion("BUSINESSSUM not in", values, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESSSUM between", value1, value2, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESSSUM not between", value1, value2, "businesssum");
            return (Criteria) this;
        }

        public Criteria andImsiIsNull() {
            addCriterion("IMSI is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("IMSI is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("IMSI =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("IMSI <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("IMSI >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("IMSI >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("IMSI <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("IMSI <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("IMSI like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("IMSI not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("IMSI in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("IMSI not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("IMSI between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("IMSI not between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andPhoneosIsNull() {
            addCriterion("PHONEOS is null");
            return (Criteria) this;
        }

        public Criteria andPhoneosIsNotNull() {
            addCriterion("PHONEOS is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneosEqualTo(String value) {
            addCriterion("PHONEOS =", value, "phoneos");
            return (Criteria) this;
        }

        public Criteria andPhoneosNotEqualTo(String value) {
            addCriterion("PHONEOS <>", value, "phoneos");
            return (Criteria) this;
        }

        public Criteria andPhoneosGreaterThan(String value) {
            addCriterion("PHONEOS >", value, "phoneos");
            return (Criteria) this;
        }

        public Criteria andPhoneosGreaterThanOrEqualTo(String value) {
            addCriterion("PHONEOS >=", value, "phoneos");
            return (Criteria) this;
        }

        public Criteria andPhoneosLessThan(String value) {
            addCriterion("PHONEOS <", value, "phoneos");
            return (Criteria) this;
        }

        public Criteria andPhoneosLessThanOrEqualTo(String value) {
            addCriterion("PHONEOS <=", value, "phoneos");
            return (Criteria) this;
        }

        public Criteria andPhoneosLike(String value) {
            addCriterion("PHONEOS like", value, "phoneos");
            return (Criteria) this;
        }

        public Criteria andPhoneosNotLike(String value) {
            addCriterion("PHONEOS not like", value, "phoneos");
            return (Criteria) this;
        }

        public Criteria andPhoneosIn(List<String> values) {
            addCriterion("PHONEOS in", values, "phoneos");
            return (Criteria) this;
        }

        public Criteria andPhoneosNotIn(List<String> values) {
            addCriterion("PHONEOS not in", values, "phoneos");
            return (Criteria) this;
        }

        public Criteria andPhoneosBetween(String value1, String value2) {
            addCriterion("PHONEOS between", value1, value2, "phoneos");
            return (Criteria) this;
        }

        public Criteria andPhoneosNotBetween(String value1, String value2) {
            addCriterion("PHONEOS not between", value1, value2, "phoneos");
            return (Criteria) this;
        }

        public Criteria andGpslocationIsNull() {
            addCriterion("GPSLOCATION is null");
            return (Criteria) this;
        }

        public Criteria andGpslocationIsNotNull() {
            addCriterion("GPSLOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andGpslocationEqualTo(String value) {
            addCriterion("GPSLOCATION =", value, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andGpslocationNotEqualTo(String value) {
            addCriterion("GPSLOCATION <>", value, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andGpslocationGreaterThan(String value) {
            addCriterion("GPSLOCATION >", value, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andGpslocationGreaterThanOrEqualTo(String value) {
            addCriterion("GPSLOCATION >=", value, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andGpslocationLessThan(String value) {
            addCriterion("GPSLOCATION <", value, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andGpslocationLessThanOrEqualTo(String value) {
            addCriterion("GPSLOCATION <=", value, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andGpslocationLike(String value) {
            addCriterion("GPSLOCATION like", value, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andGpslocationNotLike(String value) {
            addCriterion("GPSLOCATION not like", value, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andGpslocationIn(List<String> values) {
            addCriterion("GPSLOCATION in", values, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andGpslocationNotIn(List<String> values) {
            addCriterion("GPSLOCATION not in", values, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andGpslocationBetween(String value1, String value2) {
            addCriterion("GPSLOCATION between", value1, value2, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andGpslocationNotBetween(String value1, String value2) {
            addCriterion("GPSLOCATION not between", value1, value2, "gpslocation");
            return (Criteria) this;
        }

        public Criteria andOrdersnIsNull() {
            addCriterion("ORDERSN is null");
            return (Criteria) this;
        }

        public Criteria andOrdersnIsNotNull() {
            addCriterion("ORDERSN is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersnEqualTo(String value) {
            addCriterion("ORDERSN =", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotEqualTo(String value) {
            addCriterion("ORDERSN <>", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnGreaterThan(String value) {
            addCriterion("ORDERSN >", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERSN >=", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnLessThan(String value) {
            addCriterion("ORDERSN <", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnLessThanOrEqualTo(String value) {
            addCriterion("ORDERSN <=", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnLike(String value) {
            addCriterion("ORDERSN like", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotLike(String value) {
            addCriterion("ORDERSN not like", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnIn(List<String> values) {
            addCriterion("ORDERSN in", values, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotIn(List<String> values) {
            addCriterion("ORDERSN not in", values, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnBetween(String value1, String value2) {
            addCriterion("ORDERSN between", value1, value2, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotBetween(String value1, String value2) {
            addCriterion("ORDERSN not between", value1, value2, "ordersn");
            return (Criteria) this;
        }

        public Criteria andApprovetermIsNull() {
            addCriterion("APPROVETERM is null");
            return (Criteria) this;
        }

        public Criteria andApprovetermIsNotNull() {
            addCriterion("APPROVETERM is not null");
            return (Criteria) this;
        }

        public Criteria andApprovetermEqualTo(String value) {
            addCriterion("APPROVETERM =", value, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApprovetermNotEqualTo(String value) {
            addCriterion("APPROVETERM <>", value, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApprovetermGreaterThan(String value) {
            addCriterion("APPROVETERM >", value, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApprovetermGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVETERM >=", value, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApprovetermLessThan(String value) {
            addCriterion("APPROVETERM <", value, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApprovetermLessThanOrEqualTo(String value) {
            addCriterion("APPROVETERM <=", value, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApprovetermLike(String value) {
            addCriterion("APPROVETERM like", value, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApprovetermNotLike(String value) {
            addCriterion("APPROVETERM not like", value, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApprovetermIn(List<String> values) {
            addCriterion("APPROVETERM in", values, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApprovetermNotIn(List<String> values) {
            addCriterion("APPROVETERM not in", values, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApprovetermBetween(String value1, String value2) {
            addCriterion("APPROVETERM between", value1, value2, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApprovetermNotBetween(String value1, String value2) {
            addCriterion("APPROVETERM not between", value1, value2, "approveterm");
            return (Criteria) this;
        }

        public Criteria andApplysumIsNull() {
            addCriterion("APPLYSUM is null");
            return (Criteria) this;
        }

        public Criteria andApplysumIsNotNull() {
            addCriterion("APPLYSUM is not null");
            return (Criteria) this;
        }

        public Criteria andApplysumEqualTo(BigDecimal value) {
            addCriterion("APPLYSUM =", value, "applysum");
            return (Criteria) this;
        }

        public Criteria andApplysumNotEqualTo(BigDecimal value) {
            addCriterion("APPLYSUM <>", value, "applysum");
            return (Criteria) this;
        }

        public Criteria andApplysumGreaterThan(BigDecimal value) {
            addCriterion("APPLYSUM >", value, "applysum");
            return (Criteria) this;
        }

        public Criteria andApplysumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLYSUM >=", value, "applysum");
            return (Criteria) this;
        }

        public Criteria andApplysumLessThan(BigDecimal value) {
            addCriterion("APPLYSUM <", value, "applysum");
            return (Criteria) this;
        }

        public Criteria andApplysumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLYSUM <=", value, "applysum");
            return (Criteria) this;
        }

        public Criteria andApplysumIn(List<BigDecimal> values) {
            addCriterion("APPLYSUM in", values, "applysum");
            return (Criteria) this;
        }

        public Criteria andApplysumNotIn(List<BigDecimal> values) {
            addCriterion("APPLYSUM not in", values, "applysum");
            return (Criteria) this;
        }

        public Criteria andApplysumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLYSUM between", value1, value2, "applysum");
            return (Criteria) this;
        }

        public Criteria andApplysumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLYSUM not between", value1, value2, "applysum");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIsNull() {
            addCriterion("APPROVETIME is null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIsNotNull() {
            addCriterion("APPROVETIME is not null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeEqualTo(String value) {
            addCriterion("APPROVETIME =", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotEqualTo(String value) {
            addCriterion("APPROVETIME <>", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThan(String value) {
            addCriterion("APPROVETIME >", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVETIME >=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThan(String value) {
            addCriterion("APPROVETIME <", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThanOrEqualTo(String value) {
            addCriterion("APPROVETIME <=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLike(String value) {
            addCriterion("APPROVETIME like", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotLike(String value) {
            addCriterion("APPROVETIME not like", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIn(List<String> values) {
            addCriterion("APPROVETIME in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotIn(List<String> values) {
            addCriterion("APPROVETIME not in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeBetween(String value1, String value2) {
            addCriterion("APPROVETIME between", value1, value2, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotBetween(String value1, String value2) {
            addCriterion("APPROVETIME not between", value1, value2, "approvetime");
            return (Criteria) this;
        }

        public Criteria andContractdateIsNull() {
            addCriterion("CONTRACTDATE is null");
            return (Criteria) this;
        }

        public Criteria andContractdateIsNotNull() {
            addCriterion("CONTRACTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractdateEqualTo(String value) {
            addCriterion("CONTRACTDATE =", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateNotEqualTo(String value) {
            addCriterion("CONTRACTDATE <>", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateGreaterThan(String value) {
            addCriterion("CONTRACTDATE >", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTDATE >=", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateLessThan(String value) {
            addCriterion("CONTRACTDATE <", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTDATE <=", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateLike(String value) {
            addCriterion("CONTRACTDATE like", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateNotLike(String value) {
            addCriterion("CONTRACTDATE not like", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateIn(List<String> values) {
            addCriterion("CONTRACTDATE in", values, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateNotIn(List<String> values) {
            addCriterion("CONTRACTDATE not in", values, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateBetween(String value1, String value2) {
            addCriterion("CONTRACTDATE between", value1, value2, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateNotBetween(String value1, String value2) {
            addCriterion("CONTRACTDATE not between", value1, value2, "contractdate");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeIsNull() {
            addCriterion("CONFIRMTIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeIsNotNull() {
            addCriterion("CONFIRMTIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeEqualTo(String value) {
            addCriterion("CONFIRMTIME =", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeNotEqualTo(String value) {
            addCriterion("CONFIRMTIME <>", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeGreaterThan(String value) {
            addCriterion("CONFIRMTIME >", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMTIME >=", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeLessThan(String value) {
            addCriterion("CONFIRMTIME <", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMTIME <=", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeLike(String value) {
            addCriterion("CONFIRMTIME like", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeNotLike(String value) {
            addCriterion("CONFIRMTIME not like", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeIn(List<String> values) {
            addCriterion("CONFIRMTIME in", values, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeNotIn(List<String> values) {
            addCriterion("CONFIRMTIME not in", values, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeBetween(String value1, String value2) {
            addCriterion("CONFIRMTIME between", value1, value2, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeNotBetween(String value1, String value2) {
            addCriterion("CONFIRMTIME not between", value1, value2, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNull() {
            addCriterion("PAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("PAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(String value) {
            addCriterion("PAYDATE =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(String value) {
            addCriterion("PAYDATE <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(String value) {
            addCriterion("PAYDATE >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(String value) {
            addCriterion("PAYDATE >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(String value) {
            addCriterion("PAYDATE <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(String value) {
            addCriterion("PAYDATE <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLike(String value) {
            addCriterion("PAYDATE like", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotLike(String value) {
            addCriterion("PAYDATE not like", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<String> values) {
            addCriterion("PAYDATE in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<String> values) {
            addCriterion("PAYDATE not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(String value1, String value2) {
            addCriterion("PAYDATE between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(String value1, String value2) {
            addCriterion("PAYDATE not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andReturntypeIsNull() {
            addCriterion("RETURNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andReturntypeIsNotNull() {
            addCriterion("RETURNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReturntypeEqualTo(String value) {
            addCriterion("RETURNTYPE =", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotEqualTo(String value) {
            addCriterion("RETURNTYPE <>", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThan(String value) {
            addCriterion("RETURNTYPE >", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNTYPE >=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThan(String value) {
            addCriterion("RETURNTYPE <", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThanOrEqualTo(String value) {
            addCriterion("RETURNTYPE <=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLike(String value) {
            addCriterion("RETURNTYPE like", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotLike(String value) {
            addCriterion("RETURNTYPE not like", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeIn(List<String> values) {
            addCriterion("RETURNTYPE in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotIn(List<String> values) {
            addCriterion("RETURNTYPE not in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeBetween(String value1, String value2) {
            addCriterion("RETURNTYPE between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotBetween(String value1, String value2) {
            addCriterion("RETURNTYPE not between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andContractstatusIsNull() {
            addCriterion("contractstatus is null");
            return (Criteria) this;
        }

        public Criteria andContractstatusIsNotNull() {
            addCriterion("contractstatus is not null");
            return (Criteria) this;
        }

        public Criteria andContractstatusEqualTo(String value) {
            addCriterion("contractstatus =", value, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andContractstatusNotEqualTo(String value) {
            addCriterion("contractstatus <>", value, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andContractstatusGreaterThan(String value) {
            addCriterion("contractstatus >", value, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andContractstatusGreaterThanOrEqualTo(String value) {
            addCriterion("contractstatus >=", value, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andContractstatusLessThan(String value) {
            addCriterion("contractstatus <", value, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andContractstatusLessThanOrEqualTo(String value) {
            addCriterion("contractstatus <=", value, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andContractstatusLike(String value) {
            addCriterion("contractstatus like", value, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andContractstatusNotLike(String value) {
            addCriterion("contractstatus not like", value, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andContractstatusIn(List<String> values) {
            addCriterion("contractstatus in", values, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andContractstatusNotIn(List<String> values) {
            addCriterion("contractstatus not in", values, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andContractstatusBetween(String value1, String value2) {
            addCriterion("contractstatus between", value1, value2, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andContractstatusNotBetween(String value1, String value2) {
            addCriterion("contractstatus not between", value1, value2, "contractstatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNull() {
            addCriterion("applystatus is null");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNotNull() {
            addCriterion("applystatus is not null");
            return (Criteria) this;
        }

        public Criteria andApplystatusEqualTo(String value) {
            addCriterion("applystatus =", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotEqualTo(String value) {
            addCriterion("applystatus <>", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThan(String value) {
            addCriterion("applystatus >", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThanOrEqualTo(String value) {
            addCriterion("applystatus >=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThan(String value) {
            addCriterion("applystatus <", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThanOrEqualTo(String value) {
            addCriterion("applystatus <=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLike(String value) {
            addCriterion("applystatus like", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotLike(String value) {
            addCriterion("applystatus not like", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusIn(List<String> values) {
            addCriterion("applystatus in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotIn(List<String> values) {
            addCriterion("applystatus not in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusBetween(String value1, String value2) {
            addCriterion("applystatus between", value1, value2, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotBetween(String value1, String value2) {
            addCriterion("applystatus not between", value1, value2, "applystatus");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeIsNull() {
            addCriterion("orderBeginTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeIsNotNull() {
            addCriterion("orderBeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeEqualTo(String value) {
            addCriterion("orderBeginTime =", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeNotEqualTo(String value) {
            addCriterion("orderBeginTime <>", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeGreaterThan(String value) {
            addCriterion("orderBeginTime >", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("orderBeginTime >=", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeLessThan(String value) {
            addCriterion("orderBeginTime <", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeLessThanOrEqualTo(String value) {
            addCriterion("orderBeginTime <=", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeLike(String value) {
            addCriterion("orderBeginTime like", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeNotLike(String value) {
            addCriterion("orderBeginTime not like", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeIn(List<String> values) {
            addCriterion("orderBeginTime in", values, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeNotIn(List<String> values) {
            addCriterion("orderBeginTime not in", values, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeBetween(String value1, String value2) {
            addCriterion("orderBeginTime between", value1, value2, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeNotBetween(String value1, String value2) {
            addCriterion("orderBeginTime not between", value1, value2, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeIsNull() {
            addCriterion("orderEndTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeIsNotNull() {
            addCriterion("orderEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeEqualTo(String value) {
            addCriterion("orderEndTime =", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeNotEqualTo(String value) {
            addCriterion("orderEndTime <>", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeGreaterThan(String value) {
            addCriterion("orderEndTime >", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("orderEndTime >=", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeLessThan(String value) {
            addCriterion("orderEndTime <", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeLessThanOrEqualTo(String value) {
            addCriterion("orderEndTime <=", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeLike(String value) {
            addCriterion("orderEndTime like", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeNotLike(String value) {
            addCriterion("orderEndTime not like", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeIn(List<String> values) {
            addCriterion("orderEndTime in", values, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeNotIn(List<String> values) {
            addCriterion("orderEndTime not in", values, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeBetween(String value1, String value2) {
            addCriterion("orderEndTime between", value1, value2, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeNotBetween(String value1, String value2) {
            addCriterion("orderEndTime not between", value1, value2, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andApprovedateIsNull() {
            addCriterion("approvedate is null");
            return (Criteria) this;
        }

        public Criteria andApprovedateIsNotNull() {
            addCriterion("approvedate is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedateEqualTo(String value) {
            addCriterion("approvedate =", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotEqualTo(String value) {
            addCriterion("approvedate <>", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateGreaterThan(String value) {
            addCriterion("approvedate >", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateGreaterThanOrEqualTo(String value) {
            addCriterion("approvedate >=", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateLessThan(String value) {
            addCriterion("approvedate <", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateLessThanOrEqualTo(String value) {
            addCriterion("approvedate <=", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateLike(String value) {
            addCriterion("approvedate like", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotLike(String value) {
            addCriterion("approvedate not like", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateIn(List<String> values) {
            addCriterion("approvedate in", values, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotIn(List<String> values) {
            addCriterion("approvedate not in", values, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateBetween(String value1, String value2) {
            addCriterion("approvedate between", value1, value2, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotBetween(String value1, String value2) {
            addCriterion("approvedate not between", value1, value2, "approvedate");
            return (Criteria) this;
        }

        public Criteria andFinishdateIsNull() {
            addCriterion("finishdate is null");
            return (Criteria) this;
        }

        public Criteria andFinishdateIsNotNull() {
            addCriterion("finishdate is not null");
            return (Criteria) this;
        }

        public Criteria andFinishdateEqualTo(String value) {
            addCriterion("finishdate =", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotEqualTo(String value) {
            addCriterion("finishdate <>", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateGreaterThan(String value) {
            addCriterion("finishdate >", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateGreaterThanOrEqualTo(String value) {
            addCriterion("finishdate >=", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateLessThan(String value) {
            addCriterion("finishdate <", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateLessThanOrEqualTo(String value) {
            addCriterion("finishdate <=", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateLike(String value) {
            addCriterion("finishdate like", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotLike(String value) {
            addCriterion("finishdate not like", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateIn(List<String> values) {
            addCriterion("finishdate in", values, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotIn(List<String> values) {
            addCriterion("finishdate not in", values, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateBetween(String value1, String value2) {
            addCriterion("finishdate between", value1, value2, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotBetween(String value1, String value2) {
            addCriterion("finishdate not between", value1, value2, "finishdate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateIsNull() {
            addCriterion("businessrate is null");
            return (Criteria) this;
        }

        public Criteria andBusinessrateIsNotNull() {
            addCriterion("businessrate is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessrateEqualTo(BigDecimal value) {
            addCriterion("businessrate =", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateNotEqualTo(BigDecimal value) {
            addCriterion("businessrate <>", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateGreaterThan(BigDecimal value) {
            addCriterion("businessrate >", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("businessrate >=", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateLessThan(BigDecimal value) {
            addCriterion("businessrate <", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("businessrate <=", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateIn(List<BigDecimal> values) {
            addCriterion("businessrate in", values, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateNotIn(List<BigDecimal> values) {
            addCriterion("businessrate not in", values, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("businessrate between", value1, value2, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("businessrate not between", value1, value2, "businessrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateIsNull() {
            addCriterion("TOTALRATE is null");
            return (Criteria) this;
        }

        public Criteria andTotalrateIsNotNull() {
            addCriterion("TOTALRATE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalrateEqualTo(BigDecimal value) {
            addCriterion("TOTALRATE =", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateNotEqualTo(BigDecimal value) {
            addCriterion("TOTALRATE <>", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateGreaterThan(BigDecimal value) {
            addCriterion("TOTALRATE >", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALRATE >=", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateLessThan(BigDecimal value) {
            addCriterion("TOTALRATE <", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALRATE <=", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateIn(List<BigDecimal> values) {
            addCriterion("TOTALRATE in", values, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateNotIn(List<BigDecimal> values) {
            addCriterion("TOTALRATE not in", values, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALRATE between", value1, value2, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALRATE not between", value1, value2, "totalrate");
            return (Criteria) this;
        }

        public Criteria andFinerateIsNull() {
            addCriterion("finerate is null");
            return (Criteria) this;
        }

        public Criteria andFinerateIsNotNull() {
            addCriterion("finerate is not null");
            return (Criteria) this;
        }

        public Criteria andFinerateEqualTo(BigDecimal value) {
            addCriterion("finerate =", value, "finerate");
            return (Criteria) this;
        }

        public Criteria andFinerateNotEqualTo(BigDecimal value) {
            addCriterion("finerate <>", value, "finerate");
            return (Criteria) this;
        }

        public Criteria andFinerateGreaterThan(BigDecimal value) {
            addCriterion("finerate >", value, "finerate");
            return (Criteria) this;
        }

        public Criteria andFinerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finerate >=", value, "finerate");
            return (Criteria) this;
        }

        public Criteria andFinerateLessThan(BigDecimal value) {
            addCriterion("finerate <", value, "finerate");
            return (Criteria) this;
        }

        public Criteria andFinerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finerate <=", value, "finerate");
            return (Criteria) this;
        }

        public Criteria andFinerateIn(List<BigDecimal> values) {
            addCriterion("finerate in", values, "finerate");
            return (Criteria) this;
        }

        public Criteria andFinerateNotIn(List<BigDecimal> values) {
            addCriterion("finerate not in", values, "finerate");
            return (Criteria) this;
        }

        public Criteria andFinerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finerate between", value1, value2, "finerate");
            return (Criteria) this;
        }

        public Criteria andFinerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finerate not between", value1, value2, "finerate");
            return (Criteria) this;
        }

        public Criteria andAheadscaleIsNull() {
            addCriterion("aheadscale is null");
            return (Criteria) this;
        }

        public Criteria andAheadscaleIsNotNull() {
            addCriterion("aheadscale is not null");
            return (Criteria) this;
        }

        public Criteria andAheadscaleEqualTo(BigDecimal value) {
            addCriterion("aheadscale =", value, "aheadscale");
            return (Criteria) this;
        }

        public Criteria andAheadscaleNotEqualTo(BigDecimal value) {
            addCriterion("aheadscale <>", value, "aheadscale");
            return (Criteria) this;
        }

        public Criteria andAheadscaleGreaterThan(BigDecimal value) {
            addCriterion("aheadscale >", value, "aheadscale");
            return (Criteria) this;
        }

        public Criteria andAheadscaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aheadscale >=", value, "aheadscale");
            return (Criteria) this;
        }

        public Criteria andAheadscaleLessThan(BigDecimal value) {
            addCriterion("aheadscale <", value, "aheadscale");
            return (Criteria) this;
        }

        public Criteria andAheadscaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("aheadscale <=", value, "aheadscale");
            return (Criteria) this;
        }

        public Criteria andAheadscaleIn(List<BigDecimal> values) {
            addCriterion("aheadscale in", values, "aheadscale");
            return (Criteria) this;
        }

        public Criteria andAheadscaleNotIn(List<BigDecimal> values) {
            addCriterion("aheadscale not in", values, "aheadscale");
            return (Criteria) this;
        }

        public Criteria andAheadscaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aheadscale between", value1, value2, "aheadscale");
            return (Criteria) this;
        }

        public Criteria andAheadscaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aheadscale not between", value1, value2, "aheadscale");
            return (Criteria) this;
        }

        public Criteria andTargetstatusIsNull() {
            addCriterion("targetstatus is null");
            return (Criteria) this;
        }

        public Criteria andTargetstatusIsNotNull() {
            addCriterion("targetstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTargetstatusEqualTo(String value) {
            addCriterion("targetstatus =", value, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andTargetstatusNotEqualTo(String value) {
            addCriterion("targetstatus <>", value, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andTargetstatusGreaterThan(String value) {
            addCriterion("targetstatus >", value, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andTargetstatusGreaterThanOrEqualTo(String value) {
            addCriterion("targetstatus >=", value, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andTargetstatusLessThan(String value) {
            addCriterion("targetstatus <", value, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andTargetstatusLessThanOrEqualTo(String value) {
            addCriterion("targetstatus <=", value, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andTargetstatusLike(String value) {
            addCriterion("targetstatus like", value, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andTargetstatusNotLike(String value) {
            addCriterion("targetstatus not like", value, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andTargetstatusIn(List<String> values) {
            addCriterion("targetstatus in", values, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andTargetstatusNotIn(List<String> values) {
            addCriterion("targetstatus not in", values, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andTargetstatusBetween(String value1, String value2) {
            addCriterion("targetstatus between", value1, value2, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andTargetstatusNotBetween(String value1, String value2) {
            addCriterion("targetstatus not between", value1, value2, "targetstatus");
            return (Criteria) this;
        }

        public Criteria andApprovesumIsNull() {
            addCriterion("APPROVESUM is null");
            return (Criteria) this;
        }

        public Criteria andApprovesumIsNotNull() {
            addCriterion("APPROVESUM is not null");
            return (Criteria) this;
        }

        public Criteria andApprovesumEqualTo(BigDecimal value) {
            addCriterion("APPROVESUM =", value, "approvesum");
            return (Criteria) this;
        }

        public Criteria andApprovesumNotEqualTo(BigDecimal value) {
            addCriterion("APPROVESUM <>", value, "approvesum");
            return (Criteria) this;
        }

        public Criteria andApprovesumGreaterThan(BigDecimal value) {
            addCriterion("APPROVESUM >", value, "approvesum");
            return (Criteria) this;
        }

        public Criteria andApprovesumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPROVESUM >=", value, "approvesum");
            return (Criteria) this;
        }

        public Criteria andApprovesumLessThan(BigDecimal value) {
            addCriterion("APPROVESUM <", value, "approvesum");
            return (Criteria) this;
        }

        public Criteria andApprovesumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPROVESUM <=", value, "approvesum");
            return (Criteria) this;
        }

        public Criteria andApprovesumIn(List<BigDecimal> values) {
            addCriterion("APPROVESUM in", values, "approvesum");
            return (Criteria) this;
        }

        public Criteria andApprovesumNotIn(List<BigDecimal> values) {
            addCriterion("APPROVESUM not in", values, "approvesum");
            return (Criteria) this;
        }

        public Criteria andApprovesumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPROVESUM between", value1, value2, "approvesum");
            return (Criteria) this;
        }

        public Criteria andApprovesumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPROVESUM not between", value1, value2, "approvesum");
            return (Criteria) this;
        }

        public Criteria andPutoutdateIsNull() {
            addCriterion("PUTOUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPutoutdateIsNotNull() {
            addCriterion("PUTOUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPutoutdateEqualTo(String value) {
            addCriterion("PUTOUTDATE =", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateNotEqualTo(String value) {
            addCriterion("PUTOUTDATE <>", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateGreaterThan(String value) {
            addCriterion("PUTOUTDATE >", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateGreaterThanOrEqualTo(String value) {
            addCriterion("PUTOUTDATE >=", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateLessThan(String value) {
            addCriterion("PUTOUTDATE <", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateLessThanOrEqualTo(String value) {
            addCriterion("PUTOUTDATE <=", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateLike(String value) {
            addCriterion("PUTOUTDATE like", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateNotLike(String value) {
            addCriterion("PUTOUTDATE not like", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateIn(List<String> values) {
            addCriterion("PUTOUTDATE in", values, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateNotIn(List<String> values) {
            addCriterion("PUTOUTDATE not in", values, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateBetween(String value1, String value2) {
            addCriterion("PUTOUTDATE between", value1, value2, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateNotBetween(String value1, String value2) {
            addCriterion("PUTOUTDATE not between", value1, value2, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateIsNull() {
            addCriterion("MATURITYDATE is null");
            return (Criteria) this;
        }

        public Criteria andMaturitydateIsNotNull() {
            addCriterion("MATURITYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMaturitydateEqualTo(String value) {
            addCriterion("MATURITYDATE =", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateNotEqualTo(String value) {
            addCriterion("MATURITYDATE <>", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateGreaterThan(String value) {
            addCriterion("MATURITYDATE >", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateGreaterThanOrEqualTo(String value) {
            addCriterion("MATURITYDATE >=", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateLessThan(String value) {
            addCriterion("MATURITYDATE <", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateLessThanOrEqualTo(String value) {
            addCriterion("MATURITYDATE <=", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateLike(String value) {
            addCriterion("MATURITYDATE like", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateNotLike(String value) {
            addCriterion("MATURITYDATE not like", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateIn(List<String> values) {
            addCriterion("MATURITYDATE in", values, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateNotIn(List<String> values) {
            addCriterion("MATURITYDATE not in", values, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateBetween(String value1, String value2) {
            addCriterion("MATURITYDATE between", value1, value2, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateNotBetween(String value1, String value2) {
            addCriterion("MATURITYDATE not between", value1, value2, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andAhendrateIsNull() {
            addCriterion("AHENDRATE is null");
            return (Criteria) this;
        }

        public Criteria andAhendrateIsNotNull() {
            addCriterion("AHENDRATE is not null");
            return (Criteria) this;
        }

        public Criteria andAhendrateEqualTo(String value) {
            addCriterion("AHENDRATE =", value, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andAhendrateNotEqualTo(String value) {
            addCriterion("AHENDRATE <>", value, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andAhendrateGreaterThan(String value) {
            addCriterion("AHENDRATE >", value, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andAhendrateGreaterThanOrEqualTo(String value) {
            addCriterion("AHENDRATE >=", value, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andAhendrateLessThan(String value) {
            addCriterion("AHENDRATE <", value, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andAhendrateLessThanOrEqualTo(String value) {
            addCriterion("AHENDRATE <=", value, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andAhendrateLike(String value) {
            addCriterion("AHENDRATE like", value, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andAhendrateNotLike(String value) {
            addCriterion("AHENDRATE not like", value, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andAhendrateIn(List<String> values) {
            addCriterion("AHENDRATE in", values, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andAhendrateNotIn(List<String> values) {
            addCriterion("AHENDRATE not in", values, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andAhendrateBetween(String value1, String value2) {
            addCriterion("AHENDRATE between", value1, value2, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andAhendrateNotBetween(String value1, String value2) {
            addCriterion("AHENDRATE not between", value1, value2, "ahendrate");
            return (Criteria) this;
        }

        public Criteria andIsputoutIsNull() {
            addCriterion("isPutOut is null");
            return (Criteria) this;
        }

        public Criteria andIsputoutIsNotNull() {
            addCriterion("isPutOut is not null");
            return (Criteria) this;
        }

        public Criteria andIsputoutEqualTo(String value) {
            addCriterion("isPutOut =", value, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsputoutNotEqualTo(String value) {
            addCriterion("isPutOut <>", value, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsputoutGreaterThan(String value) {
            addCriterion("isPutOut >", value, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsputoutGreaterThanOrEqualTo(String value) {
            addCriterion("isPutOut >=", value, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsputoutLessThan(String value) {
            addCriterion("isPutOut <", value, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsputoutLessThanOrEqualTo(String value) {
            addCriterion("isPutOut <=", value, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsputoutLike(String value) {
            addCriterion("isPutOut like", value, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsputoutNotLike(String value) {
            addCriterion("isPutOut not like", value, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsputoutIn(List<String> values) {
            addCriterion("isPutOut in", values, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsputoutNotIn(List<String> values) {
            addCriterion("isPutOut not in", values, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsputoutBetween(String value1, String value2) {
            addCriterion("isPutOut between", value1, value2, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsputoutNotBetween(String value1, String value2) {
            addCriterion("isPutOut not between", value1, value2, "isputout");
            return (Criteria) this;
        }

        public Criteria andIsfulldealIsNull() {
            addCriterion("isFullDeal is null");
            return (Criteria) this;
        }

        public Criteria andIsfulldealIsNotNull() {
            addCriterion("isFullDeal is not null");
            return (Criteria) this;
        }

        public Criteria andIsfulldealEqualTo(String value) {
            addCriterion("isFullDeal =", value, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andIsfulldealNotEqualTo(String value) {
            addCriterion("isFullDeal <>", value, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andIsfulldealGreaterThan(String value) {
            addCriterion("isFullDeal >", value, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andIsfulldealGreaterThanOrEqualTo(String value) {
            addCriterion("isFullDeal >=", value, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andIsfulldealLessThan(String value) {
            addCriterion("isFullDeal <", value, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andIsfulldealLessThanOrEqualTo(String value) {
            addCriterion("isFullDeal <=", value, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andIsfulldealLike(String value) {
            addCriterion("isFullDeal like", value, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andIsfulldealNotLike(String value) {
            addCriterion("isFullDeal not like", value, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andIsfulldealIn(List<String> values) {
            addCriterion("isFullDeal in", values, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andIsfulldealNotIn(List<String> values) {
            addCriterion("isFullDeal not in", values, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andIsfulldealBetween(String value1, String value2) {
            addCriterion("isFullDeal between", value1, value2, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andIsfulldealNotBetween(String value1, String value2) {
            addCriterion("isFullDeal not between", value1, value2, "isfulldeal");
            return (Criteria) this;
        }

        public Criteria andApprovenumberIsNull() {
            addCriterion("approvenumber is null");
            return (Criteria) this;
        }

        public Criteria andApprovenumberIsNotNull() {
            addCriterion("approvenumber is not null");
            return (Criteria) this;
        }

        public Criteria andApprovenumberEqualTo(String value) {
            addCriterion("approvenumber =", value, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApprovenumberNotEqualTo(String value) {
            addCriterion("approvenumber <>", value, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApprovenumberGreaterThan(String value) {
            addCriterion("approvenumber >", value, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApprovenumberGreaterThanOrEqualTo(String value) {
            addCriterion("approvenumber >=", value, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApprovenumberLessThan(String value) {
            addCriterion("approvenumber <", value, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApprovenumberLessThanOrEqualTo(String value) {
            addCriterion("approvenumber <=", value, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApprovenumberLike(String value) {
            addCriterion("approvenumber like", value, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApprovenumberNotLike(String value) {
            addCriterion("approvenumber not like", value, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApprovenumberIn(List<String> values) {
            addCriterion("approvenumber in", values, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApprovenumberNotIn(List<String> values) {
            addCriterion("approvenumber not in", values, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApprovenumberBetween(String value1, String value2) {
            addCriterion("approvenumber between", value1, value2, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApprovenumberNotBetween(String value1, String value2) {
            addCriterion("approvenumber not between", value1, value2, "approvenumber");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayIsNull() {
            addCriterion("applymonthrepay is null");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayIsNotNull() {
            addCriterion("applymonthrepay is not null");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayEqualTo(BigDecimal value) {
            addCriterion("applymonthrepay =", value, "applymonthrepay");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayNotEqualTo(BigDecimal value) {
            addCriterion("applymonthrepay <>", value, "applymonthrepay");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayGreaterThan(BigDecimal value) {
            addCriterion("applymonthrepay >", value, "applymonthrepay");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("applymonthrepay >=", value, "applymonthrepay");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayLessThan(BigDecimal value) {
            addCriterion("applymonthrepay <", value, "applymonthrepay");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("applymonthrepay <=", value, "applymonthrepay");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayIn(List<BigDecimal> values) {
            addCriterion("applymonthrepay in", values, "applymonthrepay");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayNotIn(List<BigDecimal> values) {
            addCriterion("applymonthrepay not in", values, "applymonthrepay");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("applymonthrepay between", value1, value2, "applymonthrepay");
            return (Criteria) this;
        }

        public Criteria andApplymonthrepayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("applymonthrepay not between", value1, value2, "applymonthrepay");
            return (Criteria) this;
        }

        public Criteria andSkuidIsNull() {
            addCriterion("skuId is null");
            return (Criteria) this;
        }

        public Criteria andSkuidIsNotNull() {
            addCriterion("skuId is not null");
            return (Criteria) this;
        }

        public Criteria andSkuidEqualTo(String value) {
            addCriterion("skuId =", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotEqualTo(String value) {
            addCriterion("skuId <>", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThan(String value) {
            addCriterion("skuId >", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThanOrEqualTo(String value) {
            addCriterion("skuId >=", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThan(String value) {
            addCriterion("skuId <", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThanOrEqualTo(String value) {
            addCriterion("skuId <=", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLike(String value) {
            addCriterion("skuId like", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotLike(String value) {
            addCriterion("skuId not like", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidIn(List<String> values) {
            addCriterion("skuId in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotIn(List<String> values) {
            addCriterion("skuId not in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidBetween(String value1, String value2) {
            addCriterion("skuId between", value1, value2, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotBetween(String value1, String value2) {
            addCriterion("skuId not between", value1, value2, "skuid");
            return (Criteria) this;
        }

        public Criteria andLoanuseIsNull() {
            addCriterion("loanuse is null");
            return (Criteria) this;
        }

        public Criteria andLoanuseIsNotNull() {
            addCriterion("loanuse is not null");
            return (Criteria) this;
        }

        public Criteria andLoanuseEqualTo(String value) {
            addCriterion("loanuse =", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseNotEqualTo(String value) {
            addCriterion("loanuse <>", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseGreaterThan(String value) {
            addCriterion("loanuse >", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseGreaterThanOrEqualTo(String value) {
            addCriterion("loanuse >=", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseLessThan(String value) {
            addCriterion("loanuse <", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseLessThanOrEqualTo(String value) {
            addCriterion("loanuse <=", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseLike(String value) {
            addCriterion("loanuse like", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseNotLike(String value) {
            addCriterion("loanuse not like", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseIn(List<String> values) {
            addCriterion("loanuse in", values, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseNotIn(List<String> values) {
            addCriterion("loanuse not in", values, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseBetween(String value1, String value2) {
            addCriterion("loanuse between", value1, value2, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseNotBetween(String value1, String value2) {
            addCriterion("loanuse not between", value1, value2, "loanuse");
            return (Criteria) this;
        }

        public Criteria andFundchannelIsNull() {
            addCriterion("FUNDCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andFundchannelIsNotNull() {
            addCriterion("FUNDCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andFundchannelEqualTo(String value) {
            addCriterion("FUNDCHANNEL =", value, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andFundchannelNotEqualTo(String value) {
            addCriterion("FUNDCHANNEL <>", value, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andFundchannelGreaterThan(String value) {
            addCriterion("FUNDCHANNEL >", value, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andFundchannelGreaterThanOrEqualTo(String value) {
            addCriterion("FUNDCHANNEL >=", value, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andFundchannelLessThan(String value) {
            addCriterion("FUNDCHANNEL <", value, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andFundchannelLessThanOrEqualTo(String value) {
            addCriterion("FUNDCHANNEL <=", value, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andFundchannelLike(String value) {
            addCriterion("FUNDCHANNEL like", value, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andFundchannelNotLike(String value) {
            addCriterion("FUNDCHANNEL not like", value, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andFundchannelIn(List<String> values) {
            addCriterion("FUNDCHANNEL in", values, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andFundchannelNotIn(List<String> values) {
            addCriterion("FUNDCHANNEL not in", values, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andFundchannelBetween(String value1, String value2) {
            addCriterion("FUNDCHANNEL between", value1, value2, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andFundchannelNotBetween(String value1, String value2) {
            addCriterion("FUNDCHANNEL not between", value1, value2, "fundchannel");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("accountno is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("accountno is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("accountno =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("accountno <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("accountno >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("accountno >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("accountno <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("accountno <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("accountno like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("accountno not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("accountno in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("accountno not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("accountno between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("accountno not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountbankIsNull() {
            addCriterion("accountbank is null");
            return (Criteria) this;
        }

        public Criteria andAccountbankIsNotNull() {
            addCriterion("accountbank is not null");
            return (Criteria) this;
        }

        public Criteria andAccountbankEqualTo(String value) {
            addCriterion("accountbank =", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankNotEqualTo(String value) {
            addCriterion("accountbank <>", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankGreaterThan(String value) {
            addCriterion("accountbank >", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankGreaterThanOrEqualTo(String value) {
            addCriterion("accountbank >=", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankLessThan(String value) {
            addCriterion("accountbank <", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankLessThanOrEqualTo(String value) {
            addCriterion("accountbank <=", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankLike(String value) {
            addCriterion("accountbank like", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankNotLike(String value) {
            addCriterion("accountbank not like", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankIn(List<String> values) {
            addCriterion("accountbank in", values, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankNotIn(List<String> values) {
            addCriterion("accountbank not in", values, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankBetween(String value1, String value2) {
            addCriterion("accountbank between", value1, value2, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankNotBetween(String value1, String value2) {
            addCriterion("accountbank not between", value1, value2, "accountbank");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("bank_id like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("bank_id not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoIsNull() {
            addCriterion("relevancebankno is null");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoIsNotNull() {
            addCriterion("relevancebankno is not null");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoEqualTo(String value) {
            addCriterion("relevancebankno =", value, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoNotEqualTo(String value) {
            addCriterion("relevancebankno <>", value, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoGreaterThan(String value) {
            addCriterion("relevancebankno >", value, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoGreaterThanOrEqualTo(String value) {
            addCriterion("relevancebankno >=", value, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoLessThan(String value) {
            addCriterion("relevancebankno <", value, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoLessThanOrEqualTo(String value) {
            addCriterion("relevancebankno <=", value, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoLike(String value) {
            addCriterion("relevancebankno like", value, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoNotLike(String value) {
            addCriterion("relevancebankno not like", value, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoIn(List<String> values) {
            addCriterion("relevancebankno in", values, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoNotIn(List<String> values) {
            addCriterion("relevancebankno not in", values, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoBetween(String value1, String value2) {
            addCriterion("relevancebankno between", value1, value2, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andRelevancebanknoNotBetween(String value1, String value2) {
            addCriterion("relevancebankno not between", value1, value2, "relevancebankno");
            return (Criteria) this;
        }

        public Criteria andAccountaddressIsNull() {
            addCriterion("accountaddress is null");
            return (Criteria) this;
        }

        public Criteria andAccountaddressIsNotNull() {
            addCriterion("accountaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAccountaddressEqualTo(String value) {
            addCriterion("accountaddress =", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressNotEqualTo(String value) {
            addCriterion("accountaddress <>", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressGreaterThan(String value) {
            addCriterion("accountaddress >", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressGreaterThanOrEqualTo(String value) {
            addCriterion("accountaddress >=", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressLessThan(String value) {
            addCriterion("accountaddress <", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressLessThanOrEqualTo(String value) {
            addCriterion("accountaddress <=", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressLike(String value) {
            addCriterion("accountaddress like", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressNotLike(String value) {
            addCriterion("accountaddress not like", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressIn(List<String> values) {
            addCriterion("accountaddress in", values, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressNotIn(List<String> values) {
            addCriterion("accountaddress not in", values, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressBetween(String value1, String value2) {
            addCriterion("accountaddress between", value1, value2, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressNotBetween(String value1, String value2) {
            addCriterion("accountaddress not between", value1, value2, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountnetIsNull() {
            addCriterion("accountnet is null");
            return (Criteria) this;
        }

        public Criteria andAccountnetIsNotNull() {
            addCriterion("accountnet is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnetEqualTo(String value) {
            addCriterion("accountnet =", value, "accountnet");
            return (Criteria) this;
        }

        public Criteria andAccountnetNotEqualTo(String value) {
            addCriterion("accountnet <>", value, "accountnet");
            return (Criteria) this;
        }

        public Criteria andAccountnetGreaterThan(String value) {
            addCriterion("accountnet >", value, "accountnet");
            return (Criteria) this;
        }

        public Criteria andAccountnetGreaterThanOrEqualTo(String value) {
            addCriterion("accountnet >=", value, "accountnet");
            return (Criteria) this;
        }

        public Criteria andAccountnetLessThan(String value) {
            addCriterion("accountnet <", value, "accountnet");
            return (Criteria) this;
        }

        public Criteria andAccountnetLessThanOrEqualTo(String value) {
            addCriterion("accountnet <=", value, "accountnet");
            return (Criteria) this;
        }

        public Criteria andAccountnetLike(String value) {
            addCriterion("accountnet like", value, "accountnet");
            return (Criteria) this;
        }

        public Criteria andAccountnetNotLike(String value) {
            addCriterion("accountnet not like", value, "accountnet");
            return (Criteria) this;
        }

        public Criteria andAccountnetIn(List<String> values) {
            addCriterion("accountnet in", values, "accountnet");
            return (Criteria) this;
        }

        public Criteria andAccountnetNotIn(List<String> values) {
            addCriterion("accountnet not in", values, "accountnet");
            return (Criteria) this;
        }

        public Criteria andAccountnetBetween(String value1, String value2) {
            addCriterion("accountnet between", value1, value2, "accountnet");
            return (Criteria) this;
        }

        public Criteria andAccountnetNotBetween(String value1, String value2) {
            addCriterion("accountnet not between", value1, value2, "accountnet");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountIsNull() {
            addCriterion("fuyouaccount is null");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountIsNotNull() {
            addCriterion("fuyouaccount is not null");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountEqualTo(String value) {
            addCriterion("fuyouaccount =", value, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountNotEqualTo(String value) {
            addCriterion("fuyouaccount <>", value, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountGreaterThan(String value) {
            addCriterion("fuyouaccount >", value, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountGreaterThanOrEqualTo(String value) {
            addCriterion("fuyouaccount >=", value, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountLessThan(String value) {
            addCriterion("fuyouaccount <", value, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountLessThanOrEqualTo(String value) {
            addCriterion("fuyouaccount <=", value, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountLike(String value) {
            addCriterion("fuyouaccount like", value, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountNotLike(String value) {
            addCriterion("fuyouaccount not like", value, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountIn(List<String> values) {
            addCriterion("fuyouaccount in", values, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountNotIn(List<String> values) {
            addCriterion("fuyouaccount not in", values, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountBetween(String value1, String value2) {
            addCriterion("fuyouaccount between", value1, value2, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andFuyouaccountNotBetween(String value1, String value2) {
            addCriterion("fuyouaccount not between", value1, value2, "fuyouaccount");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("payway is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("payway is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("payway =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("payway <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("payway >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("payway >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("payway <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("payway <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("payway like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("payway not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("payway in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("payway not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("payway between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("payway not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andIsfamilyIsNull() {
            addCriterion("isFamily is null");
            return (Criteria) this;
        }

        public Criteria andIsfamilyIsNotNull() {
            addCriterion("isFamily is not null");
            return (Criteria) this;
        }

        public Criteria andIsfamilyEqualTo(String value) {
            addCriterion("isFamily =", value, "isfamily");
            return (Criteria) this;
        }

        public Criteria andIsfamilyNotEqualTo(String value) {
            addCriterion("isFamily <>", value, "isfamily");
            return (Criteria) this;
        }

        public Criteria andIsfamilyGreaterThan(String value) {
            addCriterion("isFamily >", value, "isfamily");
            return (Criteria) this;
        }

        public Criteria andIsfamilyGreaterThanOrEqualTo(String value) {
            addCriterion("isFamily >=", value, "isfamily");
            return (Criteria) this;
        }

        public Criteria andIsfamilyLessThan(String value) {
            addCriterion("isFamily <", value, "isfamily");
            return (Criteria) this;
        }

        public Criteria andIsfamilyLessThanOrEqualTo(String value) {
            addCriterion("isFamily <=", value, "isfamily");
            return (Criteria) this;
        }

        public Criteria andIsfamilyLike(String value) {
            addCriterion("isFamily like", value, "isfamily");
            return (Criteria) this;
        }

        public Criteria andIsfamilyNotLike(String value) {
            addCriterion("isFamily not like", value, "isfamily");
            return (Criteria) this;
        }

        public Criteria andIsfamilyIn(List<String> values) {
            addCriterion("isFamily in", values, "isfamily");
            return (Criteria) this;
        }

        public Criteria andIsfamilyNotIn(List<String> values) {
            addCriterion("isFamily not in", values, "isfamily");
            return (Criteria) this;
        }

        public Criteria andIsfamilyBetween(String value1, String value2) {
            addCriterion("isFamily between", value1, value2, "isfamily");
            return (Criteria) this;
        }

        public Criteria andIsfamilyNotBetween(String value1, String value2) {
            addCriterion("isFamily not between", value1, value2, "isfamily");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andLoanusedescIsNull() {
            addCriterion("loanusedesc is null");
            return (Criteria) this;
        }

        public Criteria andLoanusedescIsNotNull() {
            addCriterion("loanusedesc is not null");
            return (Criteria) this;
        }

        public Criteria andLoanusedescEqualTo(String value) {
            addCriterion("loanusedesc =", value, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andLoanusedescNotEqualTo(String value) {
            addCriterion("loanusedesc <>", value, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andLoanusedescGreaterThan(String value) {
            addCriterion("loanusedesc >", value, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andLoanusedescGreaterThanOrEqualTo(String value) {
            addCriterion("loanusedesc >=", value, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andLoanusedescLessThan(String value) {
            addCriterion("loanusedesc <", value, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andLoanusedescLessThanOrEqualTo(String value) {
            addCriterion("loanusedesc <=", value, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andLoanusedescLike(String value) {
            addCriterion("loanusedesc like", value, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andLoanusedescNotLike(String value) {
            addCriterion("loanusedesc not like", value, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andLoanusedescIn(List<String> values) {
            addCriterion("loanusedesc in", values, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andLoanusedescNotIn(List<String> values) {
            addCriterion("loanusedesc not in", values, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andLoanusedescBetween(String value1, String value2) {
            addCriterion("loanusedesc between", value1, value2, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andLoanusedescNotBetween(String value1, String value2) {
            addCriterion("loanusedesc not between", value1, value2, "loanusedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescIsNull() {
            addCriterion("sourcedesc is null");
            return (Criteria) this;
        }

        public Criteria andSourcedescIsNotNull() {
            addCriterion("sourcedesc is not null");
            return (Criteria) this;
        }

        public Criteria andSourcedescEqualTo(String value) {
            addCriterion("sourcedesc =", value, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescNotEqualTo(String value) {
            addCriterion("sourcedesc <>", value, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescGreaterThan(String value) {
            addCriterion("sourcedesc >", value, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescGreaterThanOrEqualTo(String value) {
            addCriterion("sourcedesc >=", value, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescLessThan(String value) {
            addCriterion("sourcedesc <", value, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescLessThanOrEqualTo(String value) {
            addCriterion("sourcedesc <=", value, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescLike(String value) {
            addCriterion("sourcedesc like", value, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescNotLike(String value) {
            addCriterion("sourcedesc not like", value, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescIn(List<String> values) {
            addCriterion("sourcedesc in", values, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescNotIn(List<String> values) {
            addCriterion("sourcedesc not in", values, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescBetween(String value1, String value2) {
            addCriterion("sourcedesc between", value1, value2, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andSourcedescNotBetween(String value1, String value2) {
            addCriterion("sourcedesc not between", value1, value2, "sourcedesc");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("citycode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("citycode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("citycode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("citycode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("citycode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("citycode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("citycode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("citycode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("citycode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("citycode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("citycode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("citycode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("citycode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("citycode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("areacode is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("areacode is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("areacode =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("areacode <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("areacode >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("areacode >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("areacode <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("areacode <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("areacode like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("areacode not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("areacode in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("areacode not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("areacode between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("areacode not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andBankkindIsNull() {
            addCriterion("bankkind is null");
            return (Criteria) this;
        }

        public Criteria andBankkindIsNotNull() {
            addCriterion("bankkind is not null");
            return (Criteria) this;
        }

        public Criteria andBankkindEqualTo(String value) {
            addCriterion("bankkind =", value, "bankkind");
            return (Criteria) this;
        }

        public Criteria andBankkindNotEqualTo(String value) {
            addCriterion("bankkind <>", value, "bankkind");
            return (Criteria) this;
        }

        public Criteria andBankkindGreaterThan(String value) {
            addCriterion("bankkind >", value, "bankkind");
            return (Criteria) this;
        }

        public Criteria andBankkindGreaterThanOrEqualTo(String value) {
            addCriterion("bankkind >=", value, "bankkind");
            return (Criteria) this;
        }

        public Criteria andBankkindLessThan(String value) {
            addCriterion("bankkind <", value, "bankkind");
            return (Criteria) this;
        }

        public Criteria andBankkindLessThanOrEqualTo(String value) {
            addCriterion("bankkind <=", value, "bankkind");
            return (Criteria) this;
        }

        public Criteria andBankkindLike(String value) {
            addCriterion("bankkind like", value, "bankkind");
            return (Criteria) this;
        }

        public Criteria andBankkindNotLike(String value) {
            addCriterion("bankkind not like", value, "bankkind");
            return (Criteria) this;
        }

        public Criteria andBankkindIn(List<String> values) {
            addCriterion("bankkind in", values, "bankkind");
            return (Criteria) this;
        }

        public Criteria andBankkindNotIn(List<String> values) {
            addCriterion("bankkind not in", values, "bankkind");
            return (Criteria) this;
        }

        public Criteria andBankkindBetween(String value1, String value2) {
            addCriterion("bankkind between", value1, value2, "bankkind");
            return (Criteria) this;
        }

        public Criteria andBankkindNotBetween(String value1, String value2) {
            addCriterion("bankkind not between", value1, value2, "bankkind");
            return (Criteria) this;
        }

        public Criteria andManagerateIsNull() {
            addCriterion("MANAGERATE is null");
            return (Criteria) this;
        }

        public Criteria andManagerateIsNotNull() {
            addCriterion("MANAGERATE is not null");
            return (Criteria) this;
        }

        public Criteria andManagerateEqualTo(BigDecimal value) {
            addCriterion("MANAGERATE =", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateNotEqualTo(BigDecimal value) {
            addCriterion("MANAGERATE <>", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateGreaterThan(BigDecimal value) {
            addCriterion("MANAGERATE >", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MANAGERATE >=", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateLessThan(BigDecimal value) {
            addCriterion("MANAGERATE <", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MANAGERATE <=", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateIn(List<BigDecimal> values) {
            addCriterion("MANAGERATE in", values, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateNotIn(List<BigDecimal> values) {
            addCriterion("MANAGERATE not in", values, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANAGERATE between", value1, value2, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANAGERATE not between", value1, value2, "managerate");
            return (Criteria) this;
        }

        public Criteria andServerrateIsNull() {
            addCriterion("SERVERRATE is null");
            return (Criteria) this;
        }

        public Criteria andServerrateIsNotNull() {
            addCriterion("SERVERRATE is not null");
            return (Criteria) this;
        }

        public Criteria andServerrateEqualTo(BigDecimal value) {
            addCriterion("SERVERRATE =", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateNotEqualTo(BigDecimal value) {
            addCriterion("SERVERRATE <>", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateGreaterThan(BigDecimal value) {
            addCriterion("SERVERRATE >", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVERRATE >=", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateLessThan(BigDecimal value) {
            addCriterion("SERVERRATE <", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVERRATE <=", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateIn(List<BigDecimal> values) {
            addCriterion("SERVERRATE in", values, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateNotIn(List<BigDecimal> values) {
            addCriterion("SERVERRATE not in", values, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVERRATE between", value1, value2, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVERRATE not between", value1, value2, "serverrate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateIsNull() {
            addCriterion("INSURANCERATE is null");
            return (Criteria) this;
        }

        public Criteria andInsurancerateIsNotNull() {
            addCriterion("INSURANCERATE is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancerateEqualTo(BigDecimal value) {
            addCriterion("INSURANCERATE =", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateNotEqualTo(BigDecimal value) {
            addCriterion("INSURANCERATE <>", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateGreaterThan(BigDecimal value) {
            addCriterion("INSURANCERATE >", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCERATE >=", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateLessThan(BigDecimal value) {
            addCriterion("INSURANCERATE <", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCERATE <=", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateIn(List<BigDecimal> values) {
            addCriterion("INSURANCERATE in", values, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateNotIn(List<BigDecimal> values) {
            addCriterion("INSURANCERATE not in", values, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCERATE between", value1, value2, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCERATE not between", value1, value2, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andServerfeeIsNull() {
            addCriterion("SERVERFEE is null");
            return (Criteria) this;
        }

        public Criteria andServerfeeIsNotNull() {
            addCriterion("SERVERFEE is not null");
            return (Criteria) this;
        }

        public Criteria andServerfeeEqualTo(BigDecimal value) {
            addCriterion("SERVERFEE =", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeNotEqualTo(BigDecimal value) {
            addCriterion("SERVERFEE <>", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeGreaterThan(BigDecimal value) {
            addCriterion("SERVERFEE >", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVERFEE >=", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeLessThan(BigDecimal value) {
            addCriterion("SERVERFEE <", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVERFEE <=", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeIn(List<BigDecimal> values) {
            addCriterion("SERVERFEE in", values, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeNotIn(List<BigDecimal> values) {
            addCriterion("SERVERFEE not in", values, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVERFEE between", value1, value2, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVERFEE not between", value1, value2, "serverfee");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateIsNull() {
            addCriterion("loanfeerate is null");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateIsNotNull() {
            addCriterion("loanfeerate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateEqualTo(BigDecimal value) {
            addCriterion("loanfeerate =", value, "loanfeerate");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateNotEqualTo(BigDecimal value) {
            addCriterion("loanfeerate <>", value, "loanfeerate");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateGreaterThan(BigDecimal value) {
            addCriterion("loanfeerate >", value, "loanfeerate");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loanfeerate >=", value, "loanfeerate");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateLessThan(BigDecimal value) {
            addCriterion("loanfeerate <", value, "loanfeerate");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loanfeerate <=", value, "loanfeerate");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateIn(List<BigDecimal> values) {
            addCriterion("loanfeerate in", values, "loanfeerate");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateNotIn(List<BigDecimal> values) {
            addCriterion("loanfeerate not in", values, "loanfeerate");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loanfeerate between", value1, value2, "loanfeerate");
            return (Criteria) this;
        }

        public Criteria andLoanfeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loanfeerate not between", value1, value2, "loanfeerate");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateIsNull() {
            addCriterion("consultfeerate is null");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateIsNotNull() {
            addCriterion("consultfeerate is not null");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateEqualTo(BigDecimal value) {
            addCriterion("consultfeerate =", value, "consultfeerate");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateNotEqualTo(BigDecimal value) {
            addCriterion("consultfeerate <>", value, "consultfeerate");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateGreaterThan(BigDecimal value) {
            addCriterion("consultfeerate >", value, "consultfeerate");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consultfeerate >=", value, "consultfeerate");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateLessThan(BigDecimal value) {
            addCriterion("consultfeerate <", value, "consultfeerate");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consultfeerate <=", value, "consultfeerate");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateIn(List<BigDecimal> values) {
            addCriterion("consultfeerate in", values, "consultfeerate");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateNotIn(List<BigDecimal> values) {
            addCriterion("consultfeerate not in", values, "consultfeerate");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consultfeerate between", value1, value2, "consultfeerate");
            return (Criteria) this;
        }

        public Criteria andConsultfeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consultfeerate not between", value1, value2, "consultfeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateIsNull() {
            addCriterion("guaranteefeerate is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateIsNotNull() {
            addCriterion("guaranteefeerate is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateEqualTo(BigDecimal value) {
            addCriterion("guaranteefeerate =", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateNotEqualTo(BigDecimal value) {
            addCriterion("guaranteefeerate <>", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateGreaterThan(BigDecimal value) {
            addCriterion("guaranteefeerate >", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("guaranteefeerate >=", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateLessThan(BigDecimal value) {
            addCriterion("guaranteefeerate <", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("guaranteefeerate <=", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateIn(List<BigDecimal> values) {
            addCriterion("guaranteefeerate in", values, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateNotIn(List<BigDecimal> values) {
            addCriterion("guaranteefeerate not in", values, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guaranteefeerate between", value1, value2, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guaranteefeerate not between", value1, value2, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andPayfeerateIsNull() {
            addCriterion("payfeerate is null");
            return (Criteria) this;
        }

        public Criteria andPayfeerateIsNotNull() {
            addCriterion("payfeerate is not null");
            return (Criteria) this;
        }

        public Criteria andPayfeerateEqualTo(BigDecimal value) {
            addCriterion("payfeerate =", value, "payfeerate");
            return (Criteria) this;
        }

        public Criteria andPayfeerateNotEqualTo(BigDecimal value) {
            addCriterion("payfeerate <>", value, "payfeerate");
            return (Criteria) this;
        }

        public Criteria andPayfeerateGreaterThan(BigDecimal value) {
            addCriterion("payfeerate >", value, "payfeerate");
            return (Criteria) this;
        }

        public Criteria andPayfeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payfeerate >=", value, "payfeerate");
            return (Criteria) this;
        }

        public Criteria andPayfeerateLessThan(BigDecimal value) {
            addCriterion("payfeerate <", value, "payfeerate");
            return (Criteria) this;
        }

        public Criteria andPayfeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payfeerate <=", value, "payfeerate");
            return (Criteria) this;
        }

        public Criteria andPayfeerateIn(List<BigDecimal> values) {
            addCriterion("payfeerate in", values, "payfeerate");
            return (Criteria) this;
        }

        public Criteria andPayfeerateNotIn(List<BigDecimal> values) {
            addCriterion("payfeerate not in", values, "payfeerate");
            return (Criteria) this;
        }

        public Criteria andPayfeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payfeerate between", value1, value2, "payfeerate");
            return (Criteria) this;
        }

        public Criteria andPayfeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payfeerate not between", value1, value2, "payfeerate");
            return (Criteria) this;
        }

        public Criteria andConsultrateIsNull() {
            addCriterion("CONSULTRATE is null");
            return (Criteria) this;
        }

        public Criteria andConsultrateIsNotNull() {
            addCriterion("CONSULTRATE is not null");
            return (Criteria) this;
        }

        public Criteria andConsultrateEqualTo(BigDecimal value) {
            addCriterion("CONSULTRATE =", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateNotEqualTo(BigDecimal value) {
            addCriterion("CONSULTRATE <>", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateGreaterThan(BigDecimal value) {
            addCriterion("CONSULTRATE >", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONSULTRATE >=", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateLessThan(BigDecimal value) {
            addCriterion("CONSULTRATE <", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONSULTRATE <=", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateIn(List<BigDecimal> values) {
            addCriterion("CONSULTRATE in", values, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateNotIn(List<BigDecimal> values) {
            addCriterion("CONSULTRATE not in", values, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONSULTRATE between", value1, value2, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONSULTRATE not between", value1, value2, "consultrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateIsNull() {
            addCriterion("CHECKRATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckrateIsNotNull() {
            addCriterion("CHECKRATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckrateEqualTo(BigDecimal value) {
            addCriterion("CHECKRATE =", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateNotEqualTo(BigDecimal value) {
            addCriterion("CHECKRATE <>", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateGreaterThan(BigDecimal value) {
            addCriterion("CHECKRATE >", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKRATE >=", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateLessThan(BigDecimal value) {
            addCriterion("CHECKRATE <", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKRATE <=", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateIn(List<BigDecimal> values) {
            addCriterion("CHECKRATE in", values, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateNotIn(List<BigDecimal> values) {
            addCriterion("CHECKRATE not in", values, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKRATE between", value1, value2, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKRATE not between", value1, value2, "checkrate");
            return (Criteria) this;
        }

        public Criteria andAhendtermIsNull() {
            addCriterion("AHENDTERM is null");
            return (Criteria) this;
        }

        public Criteria andAhendtermIsNotNull() {
            addCriterion("AHENDTERM is not null");
            return (Criteria) this;
        }

        public Criteria andAhendtermEqualTo(String value) {
            addCriterion("AHENDTERM =", value, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andAhendtermNotEqualTo(String value) {
            addCriterion("AHENDTERM <>", value, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andAhendtermGreaterThan(String value) {
            addCriterion("AHENDTERM >", value, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andAhendtermGreaterThanOrEqualTo(String value) {
            addCriterion("AHENDTERM >=", value, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andAhendtermLessThan(String value) {
            addCriterion("AHENDTERM <", value, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andAhendtermLessThanOrEqualTo(String value) {
            addCriterion("AHENDTERM <=", value, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andAhendtermLike(String value) {
            addCriterion("AHENDTERM like", value, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andAhendtermNotLike(String value) {
            addCriterion("AHENDTERM not like", value, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andAhendtermIn(List<String> values) {
            addCriterion("AHENDTERM in", values, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andAhendtermNotIn(List<String> values) {
            addCriterion("AHENDTERM not in", values, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andAhendtermBetween(String value1, String value2) {
            addCriterion("AHENDTERM between", value1, value2, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andAhendtermNotBetween(String value1, String value2) {
            addCriterion("AHENDTERM not between", value1, value2, "ahendterm");
            return (Criteria) this;
        }

        public Criteria andPutoutsumIsNull() {
            addCriterion("putoutsum is null");
            return (Criteria) this;
        }

        public Criteria andPutoutsumIsNotNull() {
            addCriterion("putoutsum is not null");
            return (Criteria) this;
        }

        public Criteria andPutoutsumEqualTo(BigDecimal value) {
            addCriterion("putoutsum =", value, "putoutsum");
            return (Criteria) this;
        }

        public Criteria andPutoutsumNotEqualTo(BigDecimal value) {
            addCriterion("putoutsum <>", value, "putoutsum");
            return (Criteria) this;
        }

        public Criteria andPutoutsumGreaterThan(BigDecimal value) {
            addCriterion("putoutsum >", value, "putoutsum");
            return (Criteria) this;
        }

        public Criteria andPutoutsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("putoutsum >=", value, "putoutsum");
            return (Criteria) this;
        }

        public Criteria andPutoutsumLessThan(BigDecimal value) {
            addCriterion("putoutsum <", value, "putoutsum");
            return (Criteria) this;
        }

        public Criteria andPutoutsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("putoutsum <=", value, "putoutsum");
            return (Criteria) this;
        }

        public Criteria andPutoutsumIn(List<BigDecimal> values) {
            addCriterion("putoutsum in", values, "putoutsum");
            return (Criteria) this;
        }

        public Criteria andPutoutsumNotIn(List<BigDecimal> values) {
            addCriterion("putoutsum not in", values, "putoutsum");
            return (Criteria) this;
        }

        public Criteria andPutoutsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("putoutsum between", value1, value2, "putoutsum");
            return (Criteria) this;
        }

        public Criteria andPutoutsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("putoutsum not between", value1, value2, "putoutsum");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andDealidIsNull() {
            addCriterion("dealid is null");
            return (Criteria) this;
        }

        public Criteria andDealidIsNotNull() {
            addCriterion("dealid is not null");
            return (Criteria) this;
        }

        public Criteria andDealidEqualTo(String value) {
            addCriterion("dealid =", value, "dealid");
            return (Criteria) this;
        }

        public Criteria andDealidNotEqualTo(String value) {
            addCriterion("dealid <>", value, "dealid");
            return (Criteria) this;
        }

        public Criteria andDealidGreaterThan(String value) {
            addCriterion("dealid >", value, "dealid");
            return (Criteria) this;
        }

        public Criteria andDealidGreaterThanOrEqualTo(String value) {
            addCriterion("dealid >=", value, "dealid");
            return (Criteria) this;
        }

        public Criteria andDealidLessThan(String value) {
            addCriterion("dealid <", value, "dealid");
            return (Criteria) this;
        }

        public Criteria andDealidLessThanOrEqualTo(String value) {
            addCriterion("dealid <=", value, "dealid");
            return (Criteria) this;
        }

        public Criteria andDealidLike(String value) {
            addCriterion("dealid like", value, "dealid");
            return (Criteria) this;
        }

        public Criteria andDealidNotLike(String value) {
            addCriterion("dealid not like", value, "dealid");
            return (Criteria) this;
        }

        public Criteria andDealidIn(List<String> values) {
            addCriterion("dealid in", values, "dealid");
            return (Criteria) this;
        }

        public Criteria andDealidNotIn(List<String> values) {
            addCriterion("dealid not in", values, "dealid");
            return (Criteria) this;
        }

        public Criteria andDealidBetween(String value1, String value2) {
            addCriterion("dealid between", value1, value2, "dealid");
            return (Criteria) this;
        }

        public Criteria andDealidNotBetween(String value1, String value2) {
            addCriterion("dealid not between", value1, value2, "dealid");
            return (Criteria) this;
        }

        public Criteria andTeamleaderIsNull() {
            addCriterion("TEAMLEADER is null");
            return (Criteria) this;
        }

        public Criteria andTeamleaderIsNotNull() {
            addCriterion("TEAMLEADER is not null");
            return (Criteria) this;
        }

        public Criteria andTeamleaderEqualTo(String value) {
            addCriterion("TEAMLEADER =", value, "teamleader");
            return (Criteria) this;
        }

        public Criteria andTeamleaderNotEqualTo(String value) {
            addCriterion("TEAMLEADER <>", value, "teamleader");
            return (Criteria) this;
        }

        public Criteria andTeamleaderGreaterThan(String value) {
            addCriterion("TEAMLEADER >", value, "teamleader");
            return (Criteria) this;
        }

        public Criteria andTeamleaderGreaterThanOrEqualTo(String value) {
            addCriterion("TEAMLEADER >=", value, "teamleader");
            return (Criteria) this;
        }

        public Criteria andTeamleaderLessThan(String value) {
            addCriterion("TEAMLEADER <", value, "teamleader");
            return (Criteria) this;
        }

        public Criteria andTeamleaderLessThanOrEqualTo(String value) {
            addCriterion("TEAMLEADER <=", value, "teamleader");
            return (Criteria) this;
        }

        public Criteria andTeamleaderLike(String value) {
            addCriterion("TEAMLEADER like", value, "teamleader");
            return (Criteria) this;
        }

        public Criteria andTeamleaderNotLike(String value) {
            addCriterion("TEAMLEADER not like", value, "teamleader");
            return (Criteria) this;
        }

        public Criteria andTeamleaderIn(List<String> values) {
            addCriterion("TEAMLEADER in", values, "teamleader");
            return (Criteria) this;
        }

        public Criteria andTeamleaderNotIn(List<String> values) {
            addCriterion("TEAMLEADER not in", values, "teamleader");
            return (Criteria) this;
        }

        public Criteria andTeamleaderBetween(String value1, String value2) {
            addCriterion("TEAMLEADER between", value1, value2, "teamleader");
            return (Criteria) this;
        }

        public Criteria andTeamleaderNotBetween(String value1, String value2) {
            addCriterion("TEAMLEADER not between", value1, value2, "teamleader");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltIsNull() {
            addCriterion("OUTDATARESUELT is null");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltIsNotNull() {
            addCriterion("OUTDATARESUELT is not null");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltEqualTo(String value) {
            addCriterion("OUTDATARESUELT =", value, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltNotEqualTo(String value) {
            addCriterion("OUTDATARESUELT <>", value, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltGreaterThan(String value) {
            addCriterion("OUTDATARESUELT >", value, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltGreaterThanOrEqualTo(String value) {
            addCriterion("OUTDATARESUELT >=", value, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltLessThan(String value) {
            addCriterion("OUTDATARESUELT <", value, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltLessThanOrEqualTo(String value) {
            addCriterion("OUTDATARESUELT <=", value, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltLike(String value) {
            addCriterion("OUTDATARESUELT like", value, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltNotLike(String value) {
            addCriterion("OUTDATARESUELT not like", value, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltIn(List<String> values) {
            addCriterion("OUTDATARESUELT in", values, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltNotIn(List<String> values) {
            addCriterion("OUTDATARESUELT not in", values, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltBetween(String value1, String value2) {
            addCriterion("OUTDATARESUELT between", value1, value2, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andOutdataresueltNotBetween(String value1, String value2) {
            addCriterion("OUTDATARESUELT not between", value1, value2, "outdataresuelt");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonIsNull() {
            addCriterion("REFUSEMAINRESON is null");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonIsNotNull() {
            addCriterion("REFUSEMAINRESON is not null");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonEqualTo(String value) {
            addCriterion("REFUSEMAINRESON =", value, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonNotEqualTo(String value) {
            addCriterion("REFUSEMAINRESON <>", value, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonGreaterThan(String value) {
            addCriterion("REFUSEMAINRESON >", value, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonGreaterThanOrEqualTo(String value) {
            addCriterion("REFUSEMAINRESON >=", value, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonLessThan(String value) {
            addCriterion("REFUSEMAINRESON <", value, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonLessThanOrEqualTo(String value) {
            addCriterion("REFUSEMAINRESON <=", value, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonLike(String value) {
            addCriterion("REFUSEMAINRESON like", value, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonNotLike(String value) {
            addCriterion("REFUSEMAINRESON not like", value, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonIn(List<String> values) {
            addCriterion("REFUSEMAINRESON in", values, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonNotIn(List<String> values) {
            addCriterion("REFUSEMAINRESON not in", values, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonBetween(String value1, String value2) {
            addCriterion("REFUSEMAINRESON between", value1, value2, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andRefusemainresonNotBetween(String value1, String value2) {
            addCriterion("REFUSEMAINRESON not between", value1, value2, "refusemainreson");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderIsNull() {
            addCriterion("team_leader is null");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderIsNotNull() {
            addCriterion("team_leader is not null");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderEqualTo(String value) {
            addCriterion("team_leader =", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotEqualTo(String value) {
            addCriterion("team_leader <>", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderGreaterThan(String value) {
            addCriterion("team_leader >", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("team_leader >=", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderLessThan(String value) {
            addCriterion("team_leader <", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderLessThanOrEqualTo(String value) {
            addCriterion("team_leader <=", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderLike(String value) {
            addCriterion("team_leader like", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotLike(String value) {
            addCriterion("team_leader not like", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderIn(List<String> values) {
            addCriterion("team_leader in", values, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotIn(List<String> values) {
            addCriterion("team_leader not in", values, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderBetween(String value1, String value2) {
            addCriterion("team_leader between", value1, value2, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotBetween(String value1, String value2) {
            addCriterion("team_leader not between", value1, value2, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeIsNull() {
            addCriterion("send_target_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeIsNotNull() {
            addCriterion("send_target_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeEqualTo(String value) {
            addCriterion("send_target_time =", value, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeNotEqualTo(String value) {
            addCriterion("send_target_time <>", value, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeGreaterThan(String value) {
            addCriterion("send_target_time >", value, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeGreaterThanOrEqualTo(String value) {
            addCriterion("send_target_time >=", value, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeLessThan(String value) {
            addCriterion("send_target_time <", value, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeLessThanOrEqualTo(String value) {
            addCriterion("send_target_time <=", value, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeLike(String value) {
            addCriterion("send_target_time like", value, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeNotLike(String value) {
            addCriterion("send_target_time not like", value, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeIn(List<String> values) {
            addCriterion("send_target_time in", values, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeNotIn(List<String> values) {
            addCriterion("send_target_time not in", values, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeBetween(String value1, String value2) {
            addCriterion("send_target_time between", value1, value2, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSendTargetTimeNotBetween(String value1, String value2) {
            addCriterion("send_target_time not between", value1, value2, "sendTargetTime");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeIsNull() {
            addCriterion("SUMSERVICEFEE is null");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeIsNotNull() {
            addCriterion("SUMSERVICEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeEqualTo(BigDecimal value) {
            addCriterion("SUMSERVICEFEE =", value, "sumservicefee");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeNotEqualTo(BigDecimal value) {
            addCriterion("SUMSERVICEFEE <>", value, "sumservicefee");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeGreaterThan(BigDecimal value) {
            addCriterion("SUMSERVICEFEE >", value, "sumservicefee");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMSERVICEFEE >=", value, "sumservicefee");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeLessThan(BigDecimal value) {
            addCriterion("SUMSERVICEFEE <", value, "sumservicefee");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMSERVICEFEE <=", value, "sumservicefee");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeIn(List<BigDecimal> values) {
            addCriterion("SUMSERVICEFEE in", values, "sumservicefee");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeNotIn(List<BigDecimal> values) {
            addCriterion("SUMSERVICEFEE not in", values, "sumservicefee");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMSERVICEFEE between", value1, value2, "sumservicefee");
            return (Criteria) this;
        }

        public Criteria andSumservicefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMSERVICEFEE not between", value1, value2, "sumservicefee");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeIsNull() {
            addCriterion("SUMCERTIDMANAGEFEE is null");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeIsNotNull() {
            addCriterion("SUMCERTIDMANAGEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeEqualTo(BigDecimal value) {
            addCriterion("SUMCERTIDMANAGEFEE =", value, "sumcertidmanagefee");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeNotEqualTo(BigDecimal value) {
            addCriterion("SUMCERTIDMANAGEFEE <>", value, "sumcertidmanagefee");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeGreaterThan(BigDecimal value) {
            addCriterion("SUMCERTIDMANAGEFEE >", value, "sumcertidmanagefee");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMCERTIDMANAGEFEE >=", value, "sumcertidmanagefee");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeLessThan(BigDecimal value) {
            addCriterion("SUMCERTIDMANAGEFEE <", value, "sumcertidmanagefee");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMCERTIDMANAGEFEE <=", value, "sumcertidmanagefee");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeIn(List<BigDecimal> values) {
            addCriterion("SUMCERTIDMANAGEFEE in", values, "sumcertidmanagefee");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeNotIn(List<BigDecimal> values) {
            addCriterion("SUMCERTIDMANAGEFEE not in", values, "sumcertidmanagefee");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMCERTIDMANAGEFEE between", value1, value2, "sumcertidmanagefee");
            return (Criteria) this;
        }

        public Criteria andSumcertidmanagefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMCERTIDMANAGEFEE not between", value1, value2, "sumcertidmanagefee");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdIsNull() {
            addCriterion("pbc_report_id is null");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdIsNotNull() {
            addCriterion("pbc_report_id is not null");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdEqualTo(Integer value) {
            addCriterion("pbc_report_id =", value, "pbcReportId");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdNotEqualTo(Integer value) {
            addCriterion("pbc_report_id <>", value, "pbcReportId");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdGreaterThan(Integer value) {
            addCriterion("pbc_report_id >", value, "pbcReportId");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbc_report_id >=", value, "pbcReportId");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdLessThan(Integer value) {
            addCriterion("pbc_report_id <", value, "pbcReportId");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdLessThanOrEqualTo(Integer value) {
            addCriterion("pbc_report_id <=", value, "pbcReportId");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdIn(List<Integer> values) {
            addCriterion("pbc_report_id in", values, "pbcReportId");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdNotIn(List<Integer> values) {
            addCriterion("pbc_report_id not in", values, "pbcReportId");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdBetween(Integer value1, Integer value2) {
            addCriterion("pbc_report_id between", value1, value2, "pbcReportId");
            return (Criteria) this;
        }

        public Criteria andPbcReportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pbc_report_id not between", value1, value2, "pbcReportId");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeIsNull() {
            addCriterion("pbc_report_time is null");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeIsNotNull() {
            addCriterion("pbc_report_time is not null");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeEqualTo(String value) {
            addCriterion("pbc_report_time =", value, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeNotEqualTo(String value) {
            addCriterion("pbc_report_time <>", value, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeGreaterThan(String value) {
            addCriterion("pbc_report_time >", value, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_report_time >=", value, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeLessThan(String value) {
            addCriterion("pbc_report_time <", value, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeLessThanOrEqualTo(String value) {
            addCriterion("pbc_report_time <=", value, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeLike(String value) {
            addCriterion("pbc_report_time like", value, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeNotLike(String value) {
            addCriterion("pbc_report_time not like", value, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeIn(List<String> values) {
            addCriterion("pbc_report_time in", values, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeNotIn(List<String> values) {
            addCriterion("pbc_report_time not in", values, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeBetween(String value1, String value2) {
            addCriterion("pbc_report_time between", value1, value2, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andPbcReportTimeNotBetween(String value1, String value2) {
            addCriterion("pbc_report_time not between", value1, value2, "pbcReportTime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampIsNull() {
            addCriterion("updatetimestamp is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampIsNotNull() {
            addCriterion("updatetimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampEqualTo(Date value) {
            addCriterion("updatetimestamp =", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampNotEqualTo(Date value) {
            addCriterion("updatetimestamp <>", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampGreaterThan(Date value) {
            addCriterion("updatetimestamp >", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetimestamp >=", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampLessThan(Date value) {
            addCriterion("updatetimestamp <", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampLessThanOrEqualTo(Date value) {
            addCriterion("updatetimestamp <=", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampIn(List<Date> values) {
            addCriterion("updatetimestamp in", values, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampNotIn(List<Date> values) {
            addCriterion("updatetimestamp not in", values, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampBetween(Date value1, Date value2) {
            addCriterion("updatetimestamp between", value1, value2, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampNotBetween(Date value1, Date value2) {
            addCriterion("updatetimestamp not between", value1, value2, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserIsNull() {
            addCriterion("send_target_user is null");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserIsNotNull() {
            addCriterion("send_target_user is not null");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserEqualTo(String value) {
            addCriterion("send_target_user =", value, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserNotEqualTo(String value) {
            addCriterion("send_target_user <>", value, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserGreaterThan(String value) {
            addCriterion("send_target_user >", value, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserGreaterThanOrEqualTo(String value) {
            addCriterion("send_target_user >=", value, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserLessThan(String value) {
            addCriterion("send_target_user <", value, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserLessThanOrEqualTo(String value) {
            addCriterion("send_target_user <=", value, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserLike(String value) {
            addCriterion("send_target_user like", value, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserNotLike(String value) {
            addCriterion("send_target_user not like", value, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserIn(List<String> values) {
            addCriterion("send_target_user in", values, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserNotIn(List<String> values) {
            addCriterion("send_target_user not in", values, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserBetween(String value1, String value2) {
            addCriterion("send_target_user between", value1, value2, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUserNotBetween(String value1, String value2) {
            addCriterion("send_target_user not between", value1, value2, "sendTargetUser");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameIsNull() {
            addCriterion("send_target_username is null");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameIsNotNull() {
            addCriterion("send_target_username is not null");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameEqualTo(String value) {
            addCriterion("send_target_username =", value, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameNotEqualTo(String value) {
            addCriterion("send_target_username <>", value, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameGreaterThan(String value) {
            addCriterion("send_target_username >", value, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("send_target_username >=", value, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameLessThan(String value) {
            addCriterion("send_target_username <", value, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameLessThanOrEqualTo(String value) {
            addCriterion("send_target_username <=", value, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameLike(String value) {
            addCriterion("send_target_username like", value, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameNotLike(String value) {
            addCriterion("send_target_username not like", value, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameIn(List<String> values) {
            addCriterion("send_target_username in", values, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameNotIn(List<String> values) {
            addCriterion("send_target_username not in", values, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameBetween(String value1, String value2) {
            addCriterion("send_target_username between", value1, value2, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andSendTargetUsernameNotBetween(String value1, String value2) {
            addCriterion("send_target_username not between", value1, value2, "sendTargetUsername");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNull() {
            addCriterion("credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNotNull() {
            addCriterion("credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountEqualTo(BigDecimal value) {
            addCriterion("credit_amount =", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotEqualTo(BigDecimal value) {
            addCriterion("credit_amount <>", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThan(BigDecimal value) {
            addCriterion("credit_amount >", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_amount >=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThan(BigDecimal value) {
            addCriterion("credit_amount <", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_amount <=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIn(List<BigDecimal> values) {
            addCriterion("credit_amount in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotIn(List<BigDecimal> values) {
            addCriterion("credit_amount not in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_amount between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_amount not between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditPointIsNull() {
            addCriterion("credit_point is null");
            return (Criteria) this;
        }

        public Criteria andCreditPointIsNotNull() {
            addCriterion("credit_point is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPointEqualTo(String value) {
            addCriterion("credit_point =", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointNotEqualTo(String value) {
            addCriterion("credit_point <>", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointGreaterThan(String value) {
            addCriterion("credit_point >", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointGreaterThanOrEqualTo(String value) {
            addCriterion("credit_point >=", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointLessThan(String value) {
            addCriterion("credit_point <", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointLessThanOrEqualTo(String value) {
            addCriterion("credit_point <=", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointLike(String value) {
            addCriterion("credit_point like", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointNotLike(String value) {
            addCriterion("credit_point not like", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointIn(List<String> values) {
            addCriterion("credit_point in", values, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointNotIn(List<String> values) {
            addCriterion("credit_point not in", values, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointBetween(String value1, String value2) {
            addCriterion("credit_point between", value1, value2, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointNotBetween(String value1, String value2) {
            addCriterion("credit_point not between", value1, value2, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionIsNull() {
            addCriterion("INNERDESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionIsNotNull() {
            addCriterion("INNERDESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionEqualTo(String value) {
            addCriterion("INNERDESCRIPTION =", value, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionNotEqualTo(String value) {
            addCriterion("INNERDESCRIPTION <>", value, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionGreaterThan(String value) {
            addCriterion("INNERDESCRIPTION >", value, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("INNERDESCRIPTION >=", value, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionLessThan(String value) {
            addCriterion("INNERDESCRIPTION <", value, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionLessThanOrEqualTo(String value) {
            addCriterion("INNERDESCRIPTION <=", value, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionLike(String value) {
            addCriterion("INNERDESCRIPTION like", value, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionNotLike(String value) {
            addCriterion("INNERDESCRIPTION not like", value, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionIn(List<String> values) {
            addCriterion("INNERDESCRIPTION in", values, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionNotIn(List<String> values) {
            addCriterion("INNERDESCRIPTION not in", values, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionBetween(String value1, String value2) {
            addCriterion("INNERDESCRIPTION between", value1, value2, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andInnerdescriptionNotBetween(String value1, String value2) {
            addCriterion("INNERDESCRIPTION not between", value1, value2, "innerdescription");
            return (Criteria) this;
        }

        public Criteria andAfineRate2IsNull() {
            addCriterion("afine_rate2 is null");
            return (Criteria) this;
        }

        public Criteria andAfineRate2IsNotNull() {
            addCriterion("afine_rate2 is not null");
            return (Criteria) this;
        }

        public Criteria andAfineRate2EqualTo(BigDecimal value) {
            addCriterion("afine_rate2 =", value, "afineRate2");
            return (Criteria) this;
        }

        public Criteria andAfineRate2NotEqualTo(BigDecimal value) {
            addCriterion("afine_rate2 <>", value, "afineRate2");
            return (Criteria) this;
        }

        public Criteria andAfineRate2GreaterThan(BigDecimal value) {
            addCriterion("afine_rate2 >", value, "afineRate2");
            return (Criteria) this;
        }

        public Criteria andAfineRate2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("afine_rate2 >=", value, "afineRate2");
            return (Criteria) this;
        }

        public Criteria andAfineRate2LessThan(BigDecimal value) {
            addCriterion("afine_rate2 <", value, "afineRate2");
            return (Criteria) this;
        }

        public Criteria andAfineRate2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("afine_rate2 <=", value, "afineRate2");
            return (Criteria) this;
        }

        public Criteria andAfineRate2In(List<BigDecimal> values) {
            addCriterion("afine_rate2 in", values, "afineRate2");
            return (Criteria) this;
        }

        public Criteria andAfineRate2NotIn(List<BigDecimal> values) {
            addCriterion("afine_rate2 not in", values, "afineRate2");
            return (Criteria) this;
        }

        public Criteria andAfineRate2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("afine_rate2 between", value1, value2, "afineRate2");
            return (Criteria) this;
        }

        public Criteria andAfineRate2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("afine_rate2 not between", value1, value2, "afineRate2");
            return (Criteria) this;
        }

        public Criteria andResourceDesIsNull() {
            addCriterion("RESOURCE_DES is null");
            return (Criteria) this;
        }

        public Criteria andResourceDesIsNotNull() {
            addCriterion("RESOURCE_DES is not null");
            return (Criteria) this;
        }

        public Criteria andResourceDesEqualTo(String value) {
            addCriterion("RESOURCE_DES =", value, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andResourceDesNotEqualTo(String value) {
            addCriterion("RESOURCE_DES <>", value, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andResourceDesGreaterThan(String value) {
            addCriterion("RESOURCE_DES >", value, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andResourceDesGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_DES >=", value, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andResourceDesLessThan(String value) {
            addCriterion("RESOURCE_DES <", value, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andResourceDesLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_DES <=", value, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andResourceDesLike(String value) {
            addCriterion("RESOURCE_DES like", value, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andResourceDesNotLike(String value) {
            addCriterion("RESOURCE_DES not like", value, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andResourceDesIn(List<String> values) {
            addCriterion("RESOURCE_DES in", values, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andResourceDesNotIn(List<String> values) {
            addCriterion("RESOURCE_DES not in", values, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andResourceDesBetween(String value1, String value2) {
            addCriterion("RESOURCE_DES between", value1, value2, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andResourceDesNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_DES not between", value1, value2, "resourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesIsNull() {
            addCriterion("EXTERNAL_RESOURCE_DES is null");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesIsNotNull() {
            addCriterion("EXTERNAL_RESOURCE_DES is not null");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesEqualTo(String value) {
            addCriterion("EXTERNAL_RESOURCE_DES =", value, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesNotEqualTo(String value) {
            addCriterion("EXTERNAL_RESOURCE_DES <>", value, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesGreaterThan(String value) {
            addCriterion("EXTERNAL_RESOURCE_DES >", value, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesGreaterThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_RESOURCE_DES >=", value, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesLessThan(String value) {
            addCriterion("EXTERNAL_RESOURCE_DES <", value, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesLessThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_RESOURCE_DES <=", value, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesLike(String value) {
            addCriterion("EXTERNAL_RESOURCE_DES like", value, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesNotLike(String value) {
            addCriterion("EXTERNAL_RESOURCE_DES not like", value, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesIn(List<String> values) {
            addCriterion("EXTERNAL_RESOURCE_DES in", values, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesNotIn(List<String> values) {
            addCriterion("EXTERNAL_RESOURCE_DES not in", values, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesBetween(String value1, String value2) {
            addCriterion("EXTERNAL_RESOURCE_DES between", value1, value2, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andExternalResourceDesNotBetween(String value1, String value2) {
            addCriterion("EXTERNAL_RESOURCE_DES not between", value1, value2, "externalResourceDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesIsNull() {
            addCriterion("MATCH_DES is null");
            return (Criteria) this;
        }

        public Criteria andMatchDesIsNotNull() {
            addCriterion("MATCH_DES is not null");
            return (Criteria) this;
        }

        public Criteria andMatchDesEqualTo(String value) {
            addCriterion("MATCH_DES =", value, "matchDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesNotEqualTo(String value) {
            addCriterion("MATCH_DES <>", value, "matchDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesGreaterThan(String value) {
            addCriterion("MATCH_DES >", value, "matchDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_DES >=", value, "matchDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesLessThan(String value) {
            addCriterion("MATCH_DES <", value, "matchDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesLessThanOrEqualTo(String value) {
            addCriterion("MATCH_DES <=", value, "matchDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesLike(String value) {
            addCriterion("MATCH_DES like", value, "matchDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesNotLike(String value) {
            addCriterion("MATCH_DES not like", value, "matchDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesIn(List<String> values) {
            addCriterion("MATCH_DES in", values, "matchDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesNotIn(List<String> values) {
            addCriterion("MATCH_DES not in", values, "matchDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesBetween(String value1, String value2) {
            addCriterion("MATCH_DES between", value1, value2, "matchDes");
            return (Criteria) this;
        }

        public Criteria andMatchDesNotBetween(String value1, String value2) {
            addCriterion("MATCH_DES not between", value1, value2, "matchDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesIsNull() {
            addCriterion("income_transaction_des is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesIsNotNull() {
            addCriterion("income_transaction_des is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesEqualTo(String value) {
            addCriterion("income_transaction_des =", value, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesNotEqualTo(String value) {
            addCriterion("income_transaction_des <>", value, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesGreaterThan(String value) {
            addCriterion("income_transaction_des >", value, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesGreaterThanOrEqualTo(String value) {
            addCriterion("income_transaction_des >=", value, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesLessThan(String value) {
            addCriterion("income_transaction_des <", value, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesLessThanOrEqualTo(String value) {
            addCriterion("income_transaction_des <=", value, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesLike(String value) {
            addCriterion("income_transaction_des like", value, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesNotLike(String value) {
            addCriterion("income_transaction_des not like", value, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesIn(List<String> values) {
            addCriterion("income_transaction_des in", values, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesNotIn(List<String> values) {
            addCriterion("income_transaction_des not in", values, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesBetween(String value1, String value2) {
            addCriterion("income_transaction_des between", value1, value2, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andIncomeTransactionDesNotBetween(String value1, String value2) {
            addCriterion("income_transaction_des not between", value1, value2, "incomeTransactionDes");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIsNull() {
            addCriterion("productcategory is null");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIsNotNull() {
            addCriterion("productcategory is not null");
            return (Criteria) this;
        }

        public Criteria andProductcategoryEqualTo(String value) {
            addCriterion("productcategory =", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryNotEqualTo(String value) {
            addCriterion("productcategory <>", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryGreaterThan(String value) {
            addCriterion("productcategory >", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("productcategory >=", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryLessThan(String value) {
            addCriterion("productcategory <", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryLessThanOrEqualTo(String value) {
            addCriterion("productcategory <=", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryLike(String value) {
            addCriterion("productcategory like", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryNotLike(String value) {
            addCriterion("productcategory not like", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIn(List<String> values) {
            addCriterion("productcategory in", values, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryNotIn(List<String> values) {
            addCriterion("productcategory not in", values, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryBetween(String value1, String value2) {
            addCriterion("productcategory between", value1, value2, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryNotBetween(String value1, String value2) {
            addCriterion("productcategory not between", value1, value2, "productcategory");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeIsNull() {
            addCriterion("platformfee is null");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeIsNotNull() {
            addCriterion("platformfee is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeEqualTo(BigDecimal value) {
            addCriterion("platformfee =", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeNotEqualTo(BigDecimal value) {
            addCriterion("platformfee <>", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeGreaterThan(BigDecimal value) {
            addCriterion("platformfee >", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platformfee >=", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeLessThan(BigDecimal value) {
            addCriterion("platformfee <", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platformfee <=", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeIn(List<BigDecimal> values) {
            addCriterion("platformfee in", values, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeNotIn(List<BigDecimal> values) {
            addCriterion("platformfee not in", values, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platformfee between", value1, value2, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platformfee not between", value1, value2, "platformfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeIsNull() {
            addCriterion("totalfee is null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeIsNotNull() {
            addCriterion("totalfee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeEqualTo(BigDecimal value) {
            addCriterion("totalfee =", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotEqualTo(BigDecimal value) {
            addCriterion("totalfee <>", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeGreaterThan(BigDecimal value) {
            addCriterion("totalfee >", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalfee >=", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeLessThan(BigDecimal value) {
            addCriterion("totalfee <", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalfee <=", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeIn(List<BigDecimal> values) {
            addCriterion("totalfee in", values, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotIn(List<BigDecimal> values) {
            addCriterion("totalfee not in", values, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalfee between", value1, value2, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalfee not between", value1, value2, "totalfee");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeIsNull() {
            addCriterion("paymentfee is null");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeIsNotNull() {
            addCriterion("paymentfee is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeEqualTo(BigDecimal value) {
            addCriterion("paymentfee =", value, "paymentfee");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeNotEqualTo(BigDecimal value) {
            addCriterion("paymentfee <>", value, "paymentfee");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeGreaterThan(BigDecimal value) {
            addCriterion("paymentfee >", value, "paymentfee");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paymentfee >=", value, "paymentfee");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeLessThan(BigDecimal value) {
            addCriterion("paymentfee <", value, "paymentfee");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paymentfee <=", value, "paymentfee");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeIn(List<BigDecimal> values) {
            addCriterion("paymentfee in", values, "paymentfee");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeNotIn(List<BigDecimal> values) {
            addCriterion("paymentfee not in", values, "paymentfee");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paymentfee between", value1, value2, "paymentfee");
            return (Criteria) this;
        }

        public Criteria andPaymentfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paymentfee not between", value1, value2, "paymentfee");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeIsNull() {
            addCriterion("consultservicefee is null");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeIsNotNull() {
            addCriterion("consultservicefee is not null");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeEqualTo(BigDecimal value) {
            addCriterion("consultservicefee =", value, "consultservicefee");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeNotEqualTo(BigDecimal value) {
            addCriterion("consultservicefee <>", value, "consultservicefee");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeGreaterThan(BigDecimal value) {
            addCriterion("consultservicefee >", value, "consultservicefee");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consultservicefee >=", value, "consultservicefee");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeLessThan(BigDecimal value) {
            addCriterion("consultservicefee <", value, "consultservicefee");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consultservicefee <=", value, "consultservicefee");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeIn(List<BigDecimal> values) {
            addCriterion("consultservicefee in", values, "consultservicefee");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeNotIn(List<BigDecimal> values) {
            addCriterion("consultservicefee not in", values, "consultservicefee");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consultservicefee between", value1, value2, "consultservicefee");
            return (Criteria) this;
        }

        public Criteria andConsultservicefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consultservicefee not between", value1, value2, "consultservicefee");
            return (Criteria) this;
        }

        public Criteria andIssendingIsNull() {
            addCriterion("issending is null");
            return (Criteria) this;
        }

        public Criteria andIssendingIsNotNull() {
            addCriterion("issending is not null");
            return (Criteria) this;
        }

        public Criteria andIssendingEqualTo(String value) {
            addCriterion("issending =", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingNotEqualTo(String value) {
            addCriterion("issending <>", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingGreaterThan(String value) {
            addCriterion("issending >", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingGreaterThanOrEqualTo(String value) {
            addCriterion("issending >=", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingLessThan(String value) {
            addCriterion("issending <", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingLessThanOrEqualTo(String value) {
            addCriterion("issending <=", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingLike(String value) {
            addCriterion("issending like", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingNotLike(String value) {
            addCriterion("issending not like", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingIn(List<String> values) {
            addCriterion("issending in", values, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingNotIn(List<String> values) {
            addCriterion("issending not in", values, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingBetween(String value1, String value2) {
            addCriterion("issending between", value1, value2, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingNotBetween(String value1, String value2) {
            addCriterion("issending not between", value1, value2, "issending");
            return (Criteria) this;
        }

        public Criteria andFinerate2IsNull() {
            addCriterion("finerate2 is null");
            return (Criteria) this;
        }

        public Criteria andFinerate2IsNotNull() {
            addCriterion("finerate2 is not null");
            return (Criteria) this;
        }

        public Criteria andFinerate2EqualTo(BigDecimal value) {
            addCriterion("finerate2 =", value, "finerate2");
            return (Criteria) this;
        }

        public Criteria andFinerate2NotEqualTo(BigDecimal value) {
            addCriterion("finerate2 <>", value, "finerate2");
            return (Criteria) this;
        }

        public Criteria andFinerate2GreaterThan(BigDecimal value) {
            addCriterion("finerate2 >", value, "finerate2");
            return (Criteria) this;
        }

        public Criteria andFinerate2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finerate2 >=", value, "finerate2");
            return (Criteria) this;
        }

        public Criteria andFinerate2LessThan(BigDecimal value) {
            addCriterion("finerate2 <", value, "finerate2");
            return (Criteria) this;
        }

        public Criteria andFinerate2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("finerate2 <=", value, "finerate2");
            return (Criteria) this;
        }

        public Criteria andFinerate2In(List<BigDecimal> values) {
            addCriterion("finerate2 in", values, "finerate2");
            return (Criteria) this;
        }

        public Criteria andFinerate2NotIn(List<BigDecimal> values) {
            addCriterion("finerate2 not in", values, "finerate2");
            return (Criteria) this;
        }

        public Criteria andFinerate2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("finerate2 between", value1, value2, "finerate2");
            return (Criteria) this;
        }

        public Criteria andFinerate2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finerate2 not between", value1, value2, "finerate2");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeIsNull() {
            addCriterion("union_consultation_fee is null");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeIsNotNull() {
            addCriterion("union_consultation_fee is not null");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeEqualTo(BigDecimal value) {
            addCriterion("union_consultation_fee =", value, "unionConsultationFee");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeNotEqualTo(BigDecimal value) {
            addCriterion("union_consultation_fee <>", value, "unionConsultationFee");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeGreaterThan(BigDecimal value) {
            addCriterion("union_consultation_fee >", value, "unionConsultationFee");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("union_consultation_fee >=", value, "unionConsultationFee");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeLessThan(BigDecimal value) {
            addCriterion("union_consultation_fee <", value, "unionConsultationFee");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("union_consultation_fee <=", value, "unionConsultationFee");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeIn(List<BigDecimal> values) {
            addCriterion("union_consultation_fee in", values, "unionConsultationFee");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeNotIn(List<BigDecimal> values) {
            addCriterion("union_consultation_fee not in", values, "unionConsultationFee");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("union_consultation_fee between", value1, value2, "unionConsultationFee");
            return (Criteria) this;
        }

        public Criteria andUnionConsultationFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("union_consultation_fee not between", value1, value2, "unionConsultationFee");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelIsNull() {
            addCriterion("customer_source_channel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelIsNotNull() {
            addCriterion("customer_source_channel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelEqualTo(String value) {
            addCriterion("customer_source_channel =", value, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelNotEqualTo(String value) {
            addCriterion("customer_source_channel <>", value, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelGreaterThan(String value) {
            addCriterion("customer_source_channel >", value, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_source_channel >=", value, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelLessThan(String value) {
            addCriterion("customer_source_channel <", value, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelLessThanOrEqualTo(String value) {
            addCriterion("customer_source_channel <=", value, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelLike(String value) {
            addCriterion("customer_source_channel like", value, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelNotLike(String value) {
            addCriterion("customer_source_channel not like", value, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelIn(List<String> values) {
            addCriterion("customer_source_channel in", values, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelNotIn(List<String> values) {
            addCriterion("customer_source_channel not in", values, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelBetween(String value1, String value2) {
            addCriterion("customer_source_channel between", value1, value2, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceChannelNotBetween(String value1, String value2) {
            addCriterion("customer_source_channel not between", value1, value2, "customerSourceChannel");
            return (Criteria) this;
        }

        public Criteria andPhonescoreIsNull() {
            addCriterion("phonescore is null");
            return (Criteria) this;
        }

        public Criteria andPhonescoreIsNotNull() {
            addCriterion("phonescore is not null");
            return (Criteria) this;
        }

        public Criteria andPhonescoreEqualTo(String value) {
            addCriterion("phonescore =", value, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescoreNotEqualTo(String value) {
            addCriterion("phonescore <>", value, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescoreGreaterThan(String value) {
            addCriterion("phonescore >", value, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescoreGreaterThanOrEqualTo(String value) {
            addCriterion("phonescore >=", value, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescoreLessThan(String value) {
            addCriterion("phonescore <", value, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescoreLessThanOrEqualTo(String value) {
            addCriterion("phonescore <=", value, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescoreLike(String value) {
            addCriterion("phonescore like", value, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescoreNotLike(String value) {
            addCriterion("phonescore not like", value, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescoreIn(List<String> values) {
            addCriterion("phonescore in", values, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescoreNotIn(List<String> values) {
            addCriterion("phonescore not in", values, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescoreBetween(String value1, String value2) {
            addCriterion("phonescore between", value1, value2, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescoreNotBetween(String value1, String value2) {
            addCriterion("phonescore not between", value1, value2, "phonescore");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelIsNull() {
            addCriterion("phonescorelevel is null");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelIsNotNull() {
            addCriterion("phonescorelevel is not null");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelEqualTo(String value) {
            addCriterion("phonescorelevel =", value, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelNotEqualTo(String value) {
            addCriterion("phonescorelevel <>", value, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelGreaterThan(String value) {
            addCriterion("phonescorelevel >", value, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelGreaterThanOrEqualTo(String value) {
            addCriterion("phonescorelevel >=", value, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelLessThan(String value) {
            addCriterion("phonescorelevel <", value, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelLessThanOrEqualTo(String value) {
            addCriterion("phonescorelevel <=", value, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelLike(String value) {
            addCriterion("phonescorelevel like", value, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelNotLike(String value) {
            addCriterion("phonescorelevel not like", value, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelIn(List<String> values) {
            addCriterion("phonescorelevel in", values, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelNotIn(List<String> values) {
            addCriterion("phonescorelevel not in", values, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelBetween(String value1, String value2) {
            addCriterion("phonescorelevel between", value1, value2, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andPhonescorelevelNotBetween(String value1, String value2) {
            addCriterion("phonescorelevel not between", value1, value2, "phonescorelevel");
            return (Criteria) this;
        }

        public Criteria andTermUnitIsNull() {
            addCriterion("term_unit is null");
            return (Criteria) this;
        }

        public Criteria andTermUnitIsNotNull() {
            addCriterion("term_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTermUnitEqualTo(String value) {
            addCriterion("term_unit =", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitNotEqualTo(String value) {
            addCriterion("term_unit <>", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitGreaterThan(String value) {
            addCriterion("term_unit >", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitGreaterThanOrEqualTo(String value) {
            addCriterion("term_unit >=", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitLessThan(String value) {
            addCriterion("term_unit <", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitLessThanOrEqualTo(String value) {
            addCriterion("term_unit <=", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitLike(String value) {
            addCriterion("term_unit like", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitNotLike(String value) {
            addCriterion("term_unit not like", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitIn(List<String> values) {
            addCriterion("term_unit in", values, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitNotIn(List<String> values) {
            addCriterion("term_unit not in", values, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitBetween(String value1, String value2) {
            addCriterion("term_unit between", value1, value2, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitNotBetween(String value1, String value2) {
            addCriterion("term_unit not between", value1, value2, "termUnit");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneIsNull() {
            addCriterion("platform_rate_one is null");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneIsNotNull() {
            addCriterion("platform_rate_one is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneEqualTo(BigDecimal value) {
            addCriterion("platform_rate_one =", value, "platformRateOne");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneNotEqualTo(BigDecimal value) {
            addCriterion("platform_rate_one <>", value, "platformRateOne");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneGreaterThan(BigDecimal value) {
            addCriterion("platform_rate_one >", value, "platformRateOne");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_rate_one >=", value, "platformRateOne");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneLessThan(BigDecimal value) {
            addCriterion("platform_rate_one <", value, "platformRateOne");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_rate_one <=", value, "platformRateOne");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneIn(List<BigDecimal> values) {
            addCriterion("platform_rate_one in", values, "platformRateOne");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneNotIn(List<BigDecimal> values) {
            addCriterion("platform_rate_one not in", values, "platformRateOne");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_rate_one between", value1, value2, "platformRateOne");
            return (Criteria) this;
        }

        public Criteria andPlatformRateOneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_rate_one not between", value1, value2, "platformRateOne");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoIsNull() {
            addCriterion("platform_rate_two is null");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoIsNotNull() {
            addCriterion("platform_rate_two is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoEqualTo(BigDecimal value) {
            addCriterion("platform_rate_two =", value, "platformRateTwo");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoNotEqualTo(BigDecimal value) {
            addCriterion("platform_rate_two <>", value, "platformRateTwo");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoGreaterThan(BigDecimal value) {
            addCriterion("platform_rate_two >", value, "platformRateTwo");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_rate_two >=", value, "platformRateTwo");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoLessThan(BigDecimal value) {
            addCriterion("platform_rate_two <", value, "platformRateTwo");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_rate_two <=", value, "platformRateTwo");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoIn(List<BigDecimal> values) {
            addCriterion("platform_rate_two in", values, "platformRateTwo");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoNotIn(List<BigDecimal> values) {
            addCriterion("platform_rate_two not in", values, "platformRateTwo");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_rate_two between", value1, value2, "platformRateTwo");
            return (Criteria) this;
        }

        public Criteria andPlatformRateTwoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_rate_two not between", value1, value2, "platformRateTwo");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andFallbackIsNull() {
            addCriterion("fallback is null");
            return (Criteria) this;
        }

        public Criteria andFallbackIsNotNull() {
            addCriterion("fallback is not null");
            return (Criteria) this;
        }

        public Criteria andFallbackEqualTo(String value) {
            addCriterion("fallback =", value, "fallback");
            return (Criteria) this;
        }

        public Criteria andFallbackNotEqualTo(String value) {
            addCriterion("fallback <>", value, "fallback");
            return (Criteria) this;
        }

        public Criteria andFallbackGreaterThan(String value) {
            addCriterion("fallback >", value, "fallback");
            return (Criteria) this;
        }

        public Criteria andFallbackGreaterThanOrEqualTo(String value) {
            addCriterion("fallback >=", value, "fallback");
            return (Criteria) this;
        }

        public Criteria andFallbackLessThan(String value) {
            addCriterion("fallback <", value, "fallback");
            return (Criteria) this;
        }

        public Criteria andFallbackLessThanOrEqualTo(String value) {
            addCriterion("fallback <=", value, "fallback");
            return (Criteria) this;
        }

        public Criteria andFallbackLike(String value) {
            addCriterion("fallback like", value, "fallback");
            return (Criteria) this;
        }

        public Criteria andFallbackNotLike(String value) {
            addCriterion("fallback not like", value, "fallback");
            return (Criteria) this;
        }

        public Criteria andFallbackIn(List<String> values) {
            addCriterion("fallback in", values, "fallback");
            return (Criteria) this;
        }

        public Criteria andFallbackNotIn(List<String> values) {
            addCriterion("fallback not in", values, "fallback");
            return (Criteria) this;
        }

        public Criteria andFallbackBetween(String value1, String value2) {
            addCriterion("fallback between", value1, value2, "fallback");
            return (Criteria) this;
        }

        public Criteria andFallbackNotBetween(String value1, String value2) {
            addCriterion("fallback not between", value1, value2, "fallback");
            return (Criteria) this;
        }

        public Criteria andAutoFinishIsNull() {
            addCriterion("auto_finish is null");
            return (Criteria) this;
        }

        public Criteria andAutoFinishIsNotNull() {
            addCriterion("auto_finish is not null");
            return (Criteria) this;
        }

        public Criteria andAutoFinishEqualTo(String value) {
            addCriterion("auto_finish =", value, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andAutoFinishNotEqualTo(String value) {
            addCriterion("auto_finish <>", value, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andAutoFinishGreaterThan(String value) {
            addCriterion("auto_finish >", value, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andAutoFinishGreaterThanOrEqualTo(String value) {
            addCriterion("auto_finish >=", value, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andAutoFinishLessThan(String value) {
            addCriterion("auto_finish <", value, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andAutoFinishLessThanOrEqualTo(String value) {
            addCriterion("auto_finish <=", value, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andAutoFinishLike(String value) {
            addCriterion("auto_finish like", value, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andAutoFinishNotLike(String value) {
            addCriterion("auto_finish not like", value, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andAutoFinishIn(List<String> values) {
            addCriterion("auto_finish in", values, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andAutoFinishNotIn(List<String> values) {
            addCriterion("auto_finish not in", values, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andAutoFinishBetween(String value1, String value2) {
            addCriterion("auto_finish between", value1, value2, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andAutoFinishNotBetween(String value1, String value2) {
            addCriterion("auto_finish not between", value1, value2, "autoFinish");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeIsNull() {
            addCriterion("bind_card_time is null");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeIsNotNull() {
            addCriterion("bind_card_time is not null");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeEqualTo(String value) {
            addCriterion("bind_card_time =", value, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeNotEqualTo(String value) {
            addCriterion("bind_card_time <>", value, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeGreaterThan(String value) {
            addCriterion("bind_card_time >", value, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeGreaterThanOrEqualTo(String value) {
            addCriterion("bind_card_time >=", value, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeLessThan(String value) {
            addCriterion("bind_card_time <", value, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeLessThanOrEqualTo(String value) {
            addCriterion("bind_card_time <=", value, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeLike(String value) {
            addCriterion("bind_card_time like", value, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeNotLike(String value) {
            addCriterion("bind_card_time not like", value, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeIn(List<String> values) {
            addCriterion("bind_card_time in", values, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeNotIn(List<String> values) {
            addCriterion("bind_card_time not in", values, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeBetween(String value1, String value2) {
            addCriterion("bind_card_time between", value1, value2, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andBindCardTimeNotBetween(String value1, String value2) {
            addCriterion("bind_card_time not between", value1, value2, "bindCardTime");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionIsNull() {
            addCriterion("face_recognition is null");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionIsNotNull() {
            addCriterion("face_recognition is not null");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionEqualTo(String value) {
            addCriterion("face_recognition =", value, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionNotEqualTo(String value) {
            addCriterion("face_recognition <>", value, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionGreaterThan(String value) {
            addCriterion("face_recognition >", value, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionGreaterThanOrEqualTo(String value) {
            addCriterion("face_recognition >=", value, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionLessThan(String value) {
            addCriterion("face_recognition <", value, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionLessThanOrEqualTo(String value) {
            addCriterion("face_recognition <=", value, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionLike(String value) {
            addCriterion("face_recognition like", value, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionNotLike(String value) {
            addCriterion("face_recognition not like", value, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionIn(List<String> values) {
            addCriterion("face_recognition in", values, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionNotIn(List<String> values) {
            addCriterion("face_recognition not in", values, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionBetween(String value1, String value2) {
            addCriterion("face_recognition between", value1, value2, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andFaceRecognitionNotBetween(String value1, String value2) {
            addCriterion("face_recognition not between", value1, value2, "faceRecognition");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorIsNull() {
            addCriterion("carrieroperator is null");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorIsNotNull() {
            addCriterion("carrieroperator is not null");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorEqualTo(Integer value) {
            addCriterion("carrieroperator =", value, "carrieroperator");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorNotEqualTo(Integer value) {
            addCriterion("carrieroperator <>", value, "carrieroperator");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorGreaterThan(Integer value) {
            addCriterion("carrieroperator >", value, "carrieroperator");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("carrieroperator >=", value, "carrieroperator");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorLessThan(Integer value) {
            addCriterion("carrieroperator <", value, "carrieroperator");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorLessThanOrEqualTo(Integer value) {
            addCriterion("carrieroperator <=", value, "carrieroperator");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorIn(List<Integer> values) {
            addCriterion("carrieroperator in", values, "carrieroperator");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorNotIn(List<Integer> values) {
            addCriterion("carrieroperator not in", values, "carrieroperator");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorBetween(Integer value1, Integer value2) {
            addCriterion("carrieroperator between", value1, value2, "carrieroperator");
            return (Criteria) this;
        }

        public Criteria andCarrieroperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("carrieroperator not between", value1, value2, "carrieroperator");
            return (Criteria) this;
        }

        public Criteria andScorpioIsNull() {
            addCriterion("scorpio is null");
            return (Criteria) this;
        }

        public Criteria andScorpioIsNotNull() {
            addCriterion("scorpio is not null");
            return (Criteria) this;
        }

        public Criteria andScorpioEqualTo(String value) {
            addCriterion("scorpio =", value, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpioNotEqualTo(String value) {
            addCriterion("scorpio <>", value, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpioGreaterThan(String value) {
            addCriterion("scorpio >", value, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpioGreaterThanOrEqualTo(String value) {
            addCriterion("scorpio >=", value, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpioLessThan(String value) {
            addCriterion("scorpio <", value, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpioLessThanOrEqualTo(String value) {
            addCriterion("scorpio <=", value, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpioLike(String value) {
            addCriterion("scorpio like", value, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpioNotLike(String value) {
            addCriterion("scorpio not like", value, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpioIn(List<String> values) {
            addCriterion("scorpio in", values, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpioNotIn(List<String> values) {
            addCriterion("scorpio not in", values, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpioBetween(String value1, String value2) {
            addCriterion("scorpio between", value1, value2, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpioNotBetween(String value1, String value2) {
            addCriterion("scorpio not between", value1, value2, "scorpio");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidIsNull() {
            addCriterion("scorpioTaskId is null");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidIsNotNull() {
            addCriterion("scorpioTaskId is not null");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidEqualTo(String value) {
            addCriterion("scorpioTaskId =", value, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidNotEqualTo(String value) {
            addCriterion("scorpioTaskId <>", value, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidGreaterThan(String value) {
            addCriterion("scorpioTaskId >", value, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidGreaterThanOrEqualTo(String value) {
            addCriterion("scorpioTaskId >=", value, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidLessThan(String value) {
            addCriterion("scorpioTaskId <", value, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidLessThanOrEqualTo(String value) {
            addCriterion("scorpioTaskId <=", value, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidLike(String value) {
            addCriterion("scorpioTaskId like", value, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidNotLike(String value) {
            addCriterion("scorpioTaskId not like", value, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidIn(List<String> values) {
            addCriterion("scorpioTaskId in", values, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidNotIn(List<String> values) {
            addCriterion("scorpioTaskId not in", values, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidBetween(String value1, String value2) {
            addCriterion("scorpioTaskId between", value1, value2, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andScorpiotaskidNotBetween(String value1, String value2) {
            addCriterion("scorpioTaskId not between", value1, value2, "scorpiotaskid");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineIsNull() {
            addCriterion("putout_offline is null");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineIsNotNull() {
            addCriterion("putout_offline is not null");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineEqualTo(Integer value) {
            addCriterion("putout_offline =", value, "putoutOffline");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineNotEqualTo(Integer value) {
            addCriterion("putout_offline <>", value, "putoutOffline");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineGreaterThan(Integer value) {
            addCriterion("putout_offline >", value, "putoutOffline");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineGreaterThanOrEqualTo(Integer value) {
            addCriterion("putout_offline >=", value, "putoutOffline");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineLessThan(Integer value) {
            addCriterion("putout_offline <", value, "putoutOffline");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineLessThanOrEqualTo(Integer value) {
            addCriterion("putout_offline <=", value, "putoutOffline");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineIn(List<Integer> values) {
            addCriterion("putout_offline in", values, "putoutOffline");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineNotIn(List<Integer> values) {
            addCriterion("putout_offline not in", values, "putoutOffline");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineBetween(Integer value1, Integer value2) {
            addCriterion("putout_offline between", value1, value2, "putoutOffline");
            return (Criteria) this;
        }

        public Criteria andPutoutOfflineNotBetween(Integer value1, Integer value2) {
            addCriterion("putout_offline not between", value1, value2, "putoutOffline");
            return (Criteria) this;
        }

        public Criteria andCouponIdsIsNull() {
            addCriterion("coupon_ids is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdsIsNotNull() {
            addCriterion("coupon_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdsEqualTo(String value) {
            addCriterion("coupon_ids =", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsNotEqualTo(String value) {
            addCriterion("coupon_ids <>", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsGreaterThan(String value) {
            addCriterion("coupon_ids >", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_ids >=", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsLessThan(String value) {
            addCriterion("coupon_ids <", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsLessThanOrEqualTo(String value) {
            addCriterion("coupon_ids <=", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsLike(String value) {
            addCriterion("coupon_ids like", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsNotLike(String value) {
            addCriterion("coupon_ids not like", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsIn(List<String> values) {
            addCriterion("coupon_ids in", values, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsNotIn(List<String> values) {
            addCriterion("coupon_ids not in", values, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsBetween(String value1, String value2) {
            addCriterion("coupon_ids between", value1, value2, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsNotBetween(String value1, String value2) {
            addCriterion("coupon_ids not between", value1, value2, "couponIds");
            return (Criteria) this;
        }

        public Criteria andIntentionIdIsNull() {
            addCriterion("intention_id is null");
            return (Criteria) this;
        }

        public Criteria andIntentionIdIsNotNull() {
            addCriterion("intention_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionIdEqualTo(String value) {
            addCriterion("intention_id =", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdNotEqualTo(String value) {
            addCriterion("intention_id <>", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdGreaterThan(String value) {
            addCriterion("intention_id >", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdGreaterThanOrEqualTo(String value) {
            addCriterion("intention_id >=", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdLessThan(String value) {
            addCriterion("intention_id <", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdLessThanOrEqualTo(String value) {
            addCriterion("intention_id <=", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdLike(String value) {
            addCriterion("intention_id like", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdNotLike(String value) {
            addCriterion("intention_id not like", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdIn(List<String> values) {
            addCriterion("intention_id in", values, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdNotIn(List<String> values) {
            addCriterion("intention_id not in", values, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdBetween(String value1, String value2) {
            addCriterion("intention_id between", value1, value2, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdNotBetween(String value1, String value2) {
            addCriterion("intention_id not between", value1, value2, "intentionId");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoIsNull() {
            addCriterion("salesman_no is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoIsNotNull() {
            addCriterion("salesman_no is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoEqualTo(String value) {
            addCriterion("salesman_no =", value, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoNotEqualTo(String value) {
            addCriterion("salesman_no <>", value, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoGreaterThan(String value) {
            addCriterion("salesman_no >", value, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoGreaterThanOrEqualTo(String value) {
            addCriterion("salesman_no >=", value, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoLessThan(String value) {
            addCriterion("salesman_no <", value, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoLessThanOrEqualTo(String value) {
            addCriterion("salesman_no <=", value, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoLike(String value) {
            addCriterion("salesman_no like", value, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoNotLike(String value) {
            addCriterion("salesman_no not like", value, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoIn(List<String> values) {
            addCriterion("salesman_no in", values, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoNotIn(List<String> values) {
            addCriterion("salesman_no not in", values, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoBetween(String value1, String value2) {
            addCriterion("salesman_no between", value1, value2, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNoNotBetween(String value1, String value2) {
            addCriterion("salesman_no not between", value1, value2, "salesmanNo");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameIsNull() {
            addCriterion("salesman_name is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameIsNotNull() {
            addCriterion("salesman_name is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameEqualTo(String value) {
            addCriterion("salesman_name =", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotEqualTo(String value) {
            addCriterion("salesman_name <>", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameGreaterThan(String value) {
            addCriterion("salesman_name >", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("salesman_name >=", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameLessThan(String value) {
            addCriterion("salesman_name <", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameLessThanOrEqualTo(String value) {
            addCriterion("salesman_name <=", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameLike(String value) {
            addCriterion("salesman_name like", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotLike(String value) {
            addCriterion("salesman_name not like", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameIn(List<String> values) {
            addCriterion("salesman_name in", values, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotIn(List<String> values) {
            addCriterion("salesman_name not in", values, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameBetween(String value1, String value2) {
            addCriterion("salesman_name between", value1, value2, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotBetween(String value1, String value2) {
            addCriterion("salesman_name not between", value1, value2, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionIsNull() {
            addCriterion("putout_version is null");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionIsNotNull() {
            addCriterion("putout_version is not null");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionEqualTo(String value) {
            addCriterion("putout_version =", value, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionNotEqualTo(String value) {
            addCriterion("putout_version <>", value, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionGreaterThan(String value) {
            addCriterion("putout_version >", value, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionGreaterThanOrEqualTo(String value) {
            addCriterion("putout_version >=", value, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionLessThan(String value) {
            addCriterion("putout_version <", value, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionLessThanOrEqualTo(String value) {
            addCriterion("putout_version <=", value, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionLike(String value) {
            addCriterion("putout_version like", value, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionNotLike(String value) {
            addCriterion("putout_version not like", value, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionIn(List<String> values) {
            addCriterion("putout_version in", values, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionNotIn(List<String> values) {
            addCriterion("putout_version not in", values, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionBetween(String value1, String value2) {
            addCriterion("putout_version between", value1, value2, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andPutoutVersionNotBetween(String value1, String value2) {
            addCriterion("putout_version not between", value1, value2, "putoutVersion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionIsNull() {
            addCriterion("is_record_completion is null");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionIsNotNull() {
            addCriterion("is_record_completion is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionEqualTo(String value) {
            addCriterion("is_record_completion =", value, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionNotEqualTo(String value) {
            addCriterion("is_record_completion <>", value, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionGreaterThan(String value) {
            addCriterion("is_record_completion >", value, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionGreaterThanOrEqualTo(String value) {
            addCriterion("is_record_completion >=", value, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionLessThan(String value) {
            addCriterion("is_record_completion <", value, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionLessThanOrEqualTo(String value) {
            addCriterion("is_record_completion <=", value, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionLike(String value) {
            addCriterion("is_record_completion like", value, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionNotLike(String value) {
            addCriterion("is_record_completion not like", value, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionIn(List<String> values) {
            addCriterion("is_record_completion in", values, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionNotIn(List<String> values) {
            addCriterion("is_record_completion not in", values, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionBetween(String value1, String value2) {
            addCriterion("is_record_completion between", value1, value2, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andIsRecordCompletionNotBetween(String value1, String value2) {
            addCriterion("is_record_completion not between", value1, value2, "isRecordCompletion");
            return (Criteria) this;
        }

        public Criteria andVideoFlagIsNull() {
            addCriterion("video_flag is null");
            return (Criteria) this;
        }

        public Criteria andVideoFlagIsNotNull() {
            addCriterion("video_flag is not null");
            return (Criteria) this;
        }

        public Criteria andVideoFlagEqualTo(String value) {
            addCriterion("video_flag =", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagNotEqualTo(String value) {
            addCriterion("video_flag <>", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagGreaterThan(String value) {
            addCriterion("video_flag >", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagGreaterThanOrEqualTo(String value) {
            addCriterion("video_flag >=", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagLessThan(String value) {
            addCriterion("video_flag <", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagLessThanOrEqualTo(String value) {
            addCriterion("video_flag <=", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagLike(String value) {
            addCriterion("video_flag like", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagNotLike(String value) {
            addCriterion("video_flag not like", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagIn(List<String> values) {
            addCriterion("video_flag in", values, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagNotIn(List<String> values) {
            addCriterion("video_flag not in", values, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagBetween(String value1, String value2) {
            addCriterion("video_flag between", value1, value2, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagNotBetween(String value1, String value2) {
            addCriterion("video_flag not between", value1, value2, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1IsNull() {
            addCriterion("video_flag1 is null");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1IsNotNull() {
            addCriterion("video_flag1 is not null");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1EqualTo(String value) {
            addCriterion("video_flag1 =", value, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1NotEqualTo(String value) {
            addCriterion("video_flag1 <>", value, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1GreaterThan(String value) {
            addCriterion("video_flag1 >", value, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1GreaterThanOrEqualTo(String value) {
            addCriterion("video_flag1 >=", value, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1LessThan(String value) {
            addCriterion("video_flag1 <", value, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1LessThanOrEqualTo(String value) {
            addCriterion("video_flag1 <=", value, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1Like(String value) {
            addCriterion("video_flag1 like", value, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1NotLike(String value) {
            addCriterion("video_flag1 not like", value, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1In(List<String> values) {
            addCriterion("video_flag1 in", values, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1NotIn(List<String> values) {
            addCriterion("video_flag1 not in", values, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1Between(String value1, String value2) {
            addCriterion("video_flag1 between", value1, value2, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andVideoFlag1NotBetween(String value1, String value2) {
            addCriterion("video_flag1 not between", value1, value2, "videoFlag1");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNull() {
            addCriterion("credit_score is null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNotNull() {
            addCriterion("credit_score is not null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreEqualTo(String value) {
            addCriterion("credit_score =", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotEqualTo(String value) {
            addCriterion("credit_score <>", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThan(String value) {
            addCriterion("credit_score >", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThanOrEqualTo(String value) {
            addCriterion("credit_score >=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThan(String value) {
            addCriterion("credit_score <", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThanOrEqualTo(String value) {
            addCriterion("credit_score <=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLike(String value) {
            addCriterion("credit_score like", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotLike(String value) {
            addCriterion("credit_score not like", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIn(List<String> values) {
            addCriterion("credit_score in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotIn(List<String> values) {
            addCriterion("credit_score not in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreBetween(String value1, String value2) {
            addCriterion("credit_score between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotBetween(String value1, String value2) {
            addCriterion("credit_score not between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlIsNull() {
            addCriterion("is_open_url is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlIsNotNull() {
            addCriterion("is_open_url is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlEqualTo(String value) {
            addCriterion("is_open_url =", value, "isOpenUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlNotEqualTo(String value) {
            addCriterion("is_open_url <>", value, "isOpenUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlGreaterThan(String value) {
            addCriterion("is_open_url >", value, "isOpenUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlGreaterThanOrEqualTo(String value) {
            addCriterion("is_open_url >=", value, "isOpenUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlLessThan(String value) {
            addCriterion("is_open_url <", value, "isOpenUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlLessThanOrEqualTo(String value) {
            addCriterion("is_open_url <=", value, "isOpenUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlLike(String value) {
            addCriterion("is_open_url like", value, "isOpenUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlNotLike(String value) {
            addCriterion("is_open_url not like", value, "isOpenUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlIn(List<String> values) {
            addCriterion("is_open_url in", values, "isOpenUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlNotIn(List<String> values) {
            addCriterion("is_open_url not in", values, "isOpenUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlBetween(String value1, String value2) {
            addCriterion("is_open_url between", value1, value2, "isOpenUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenUrlNotBetween(String value1, String value2) {
            addCriterion("is_open_url not between", value1, value2, "isOpenUrl");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}