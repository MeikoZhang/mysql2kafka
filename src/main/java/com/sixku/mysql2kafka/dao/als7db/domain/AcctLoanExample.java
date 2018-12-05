package com.sixku.mysql2kafka.dao.als7db.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctLoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AcctLoanExample() {
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
            addCriterion("serialno is null");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNotNull() {
            addCriterion("serialno is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnoEqualTo(String value) {
            addCriterion("serialno =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(String value) {
            addCriterion("serialno <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(String value) {
            addCriterion("serialno >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(String value) {
            addCriterion("serialno >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(String value) {
            addCriterion("serialno <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(String value) {
            addCriterion("serialno <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLike(String value) {
            addCriterion("serialno like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotLike(String value) {
            addCriterion("serialno not like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<String> values) {
            addCriterion("serialno in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<String> values) {
            addCriterion("serialno not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(String value1, String value2) {
            addCriterion("serialno between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(String value1, String value2) {
            addCriterion("serialno not between", value1, value2, "serialno");
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

        public Criteria andContractserialnoIsNull() {
            addCriterion("contractserialno is null");
            return (Criteria) this;
        }

        public Criteria andContractserialnoIsNotNull() {
            addCriterion("contractserialno is not null");
            return (Criteria) this;
        }

        public Criteria andContractserialnoEqualTo(String value) {
            addCriterion("contractserialno =", value, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andContractserialnoNotEqualTo(String value) {
            addCriterion("contractserialno <>", value, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andContractserialnoGreaterThan(String value) {
            addCriterion("contractserialno >", value, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andContractserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("contractserialno >=", value, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andContractserialnoLessThan(String value) {
            addCriterion("contractserialno <", value, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andContractserialnoLessThanOrEqualTo(String value) {
            addCriterion("contractserialno <=", value, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andContractserialnoLike(String value) {
            addCriterion("contractserialno like", value, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andContractserialnoNotLike(String value) {
            addCriterion("contractserialno not like", value, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andContractserialnoIn(List<String> values) {
            addCriterion("contractserialno in", values, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andContractserialnoNotIn(List<String> values) {
            addCriterion("contractserialno not in", values, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andContractserialnoBetween(String value1, String value2) {
            addCriterion("contractserialno between", value1, value2, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andContractserialnoNotBetween(String value1, String value2) {
            addCriterion("contractserialno not between", value1, value2, "contractserialno");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("customerid like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("customerid not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("customername is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customername is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customername =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customername <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customername >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customername >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customername <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customername <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customername like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customername not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customername in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customername not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customername between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customername not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("businesstype is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("businesstype is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("businesstype =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("businesstype <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("businesstype >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("businesstype >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("businesstype <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("businesstype <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("businesstype like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("businesstype not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("businesstype in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("businesstype not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("businesstype between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("businesstype not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productid like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productid not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andSpecificidIsNull() {
            addCriterion("specificid is null");
            return (Criteria) this;
        }

        public Criteria andSpecificidIsNotNull() {
            addCriterion("specificid is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificidEqualTo(String value) {
            addCriterion("specificid =", value, "specificid");
            return (Criteria) this;
        }

        public Criteria andSpecificidNotEqualTo(String value) {
            addCriterion("specificid <>", value, "specificid");
            return (Criteria) this;
        }

        public Criteria andSpecificidGreaterThan(String value) {
            addCriterion("specificid >", value, "specificid");
            return (Criteria) this;
        }

        public Criteria andSpecificidGreaterThanOrEqualTo(String value) {
            addCriterion("specificid >=", value, "specificid");
            return (Criteria) this;
        }

        public Criteria andSpecificidLessThan(String value) {
            addCriterion("specificid <", value, "specificid");
            return (Criteria) this;
        }

        public Criteria andSpecificidLessThanOrEqualTo(String value) {
            addCriterion("specificid <=", value, "specificid");
            return (Criteria) this;
        }

        public Criteria andSpecificidLike(String value) {
            addCriterion("specificid like", value, "specificid");
            return (Criteria) this;
        }

        public Criteria andSpecificidNotLike(String value) {
            addCriterion("specificid not like", value, "specificid");
            return (Criteria) this;
        }

        public Criteria andSpecificidIn(List<String> values) {
            addCriterion("specificid in", values, "specificid");
            return (Criteria) this;
        }

        public Criteria andSpecificidNotIn(List<String> values) {
            addCriterion("specificid not in", values, "specificid");
            return (Criteria) this;
        }

        public Criteria andSpecificidBetween(String value1, String value2) {
            addCriterion("specificid between", value1, value2, "specificid");
            return (Criteria) this;
        }

        public Criteria andSpecificidNotBetween(String value1, String value2) {
            addCriterion("specificid not between", value1, value2, "specificid");
            return (Criteria) this;
        }

        public Criteria andVersionidIsNull() {
            addCriterion("versionid is null");
            return (Criteria) this;
        }

        public Criteria andVersionidIsNotNull() {
            addCriterion("versionid is not null");
            return (Criteria) this;
        }

        public Criteria andVersionidEqualTo(String value) {
            addCriterion("versionid =", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotEqualTo(String value) {
            addCriterion("versionid <>", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidGreaterThan(String value) {
            addCriterion("versionid >", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidGreaterThanOrEqualTo(String value) {
            addCriterion("versionid >=", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidLessThan(String value) {
            addCriterion("versionid <", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidLessThanOrEqualTo(String value) {
            addCriterion("versionid <=", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidLike(String value) {
            addCriterion("versionid like", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotLike(String value) {
            addCriterion("versionid not like", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidIn(List<String> values) {
            addCriterion("versionid in", values, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotIn(List<String> values) {
            addCriterion("versionid not in", values, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidBetween(String value1, String value2) {
            addCriterion("versionid between", value1, value2, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotBetween(String value1, String value2) {
            addCriterion("versionid not between", value1, value2, "versionid");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andBusinesssumIsNull() {
            addCriterion("businesssum is null");
            return (Criteria) this;
        }

        public Criteria andBusinesssumIsNotNull() {
            addCriterion("businesssum is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesssumEqualTo(BigDecimal value) {
            addCriterion("businesssum =", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumNotEqualTo(BigDecimal value) {
            addCriterion("businesssum <>", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumGreaterThan(BigDecimal value) {
            addCriterion("businesssum >", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("businesssum >=", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumLessThan(BigDecimal value) {
            addCriterion("businesssum <", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("businesssum <=", value, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumIn(List<BigDecimal> values) {
            addCriterion("businesssum in", values, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumNotIn(List<BigDecimal> values) {
            addCriterion("businesssum not in", values, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("businesssum between", value1, value2, "businesssum");
            return (Criteria) this;
        }

        public Criteria andBusinesssumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("businesssum not between", value1, value2, "businesssum");
            return (Criteria) this;
        }

        public Criteria andPutoutdateIsNull() {
            addCriterion("putoutdate is null");
            return (Criteria) this;
        }

        public Criteria andPutoutdateIsNotNull() {
            addCriterion("putoutdate is not null");
            return (Criteria) this;
        }

        public Criteria andPutoutdateEqualTo(String value) {
            addCriterion("putoutdate =", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateNotEqualTo(String value) {
            addCriterion("putoutdate <>", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateGreaterThan(String value) {
            addCriterion("putoutdate >", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateGreaterThanOrEqualTo(String value) {
            addCriterion("putoutdate >=", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateLessThan(String value) {
            addCriterion("putoutdate <", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateLessThanOrEqualTo(String value) {
            addCriterion("putoutdate <=", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateLike(String value) {
            addCriterion("putoutdate like", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateNotLike(String value) {
            addCriterion("putoutdate not like", value, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateIn(List<String> values) {
            addCriterion("putoutdate in", values, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateNotIn(List<String> values) {
            addCriterion("putoutdate not in", values, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateBetween(String value1, String value2) {
            addCriterion("putoutdate between", value1, value2, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andPutoutdateNotBetween(String value1, String value2) {
            addCriterion("putoutdate not between", value1, value2, "putoutdate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateIsNull() {
            addCriterion("maturitydate is null");
            return (Criteria) this;
        }

        public Criteria andMaturitydateIsNotNull() {
            addCriterion("maturitydate is not null");
            return (Criteria) this;
        }

        public Criteria andMaturitydateEqualTo(String value) {
            addCriterion("maturitydate =", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateNotEqualTo(String value) {
            addCriterion("maturitydate <>", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateGreaterThan(String value) {
            addCriterion("maturitydate >", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateGreaterThanOrEqualTo(String value) {
            addCriterion("maturitydate >=", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateLessThan(String value) {
            addCriterion("maturitydate <", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateLessThanOrEqualTo(String value) {
            addCriterion("maturitydate <=", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateLike(String value) {
            addCriterion("maturitydate like", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateNotLike(String value) {
            addCriterion("maturitydate not like", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateIn(List<String> values) {
            addCriterion("maturitydate in", values, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateNotIn(List<String> values) {
            addCriterion("maturitydate not in", values, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateBetween(String value1, String value2) {
            addCriterion("maturitydate between", value1, value2, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateNotBetween(String value1, String value2) {
            addCriterion("maturitydate not between", value1, value2, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateIsNull() {
            addCriterion("originalmaturitydate is null");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateIsNotNull() {
            addCriterion("originalmaturitydate is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateEqualTo(String value) {
            addCriterion("originalmaturitydate =", value, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateNotEqualTo(String value) {
            addCriterion("originalmaturitydate <>", value, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateGreaterThan(String value) {
            addCriterion("originalmaturitydate >", value, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateGreaterThanOrEqualTo(String value) {
            addCriterion("originalmaturitydate >=", value, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateLessThan(String value) {
            addCriterion("originalmaturitydate <", value, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateLessThanOrEqualTo(String value) {
            addCriterion("originalmaturitydate <=", value, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateLike(String value) {
            addCriterion("originalmaturitydate like", value, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateNotLike(String value) {
            addCriterion("originalmaturitydate not like", value, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateIn(List<String> values) {
            addCriterion("originalmaturitydate in", values, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateNotIn(List<String> values) {
            addCriterion("originalmaturitydate not in", values, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateBetween(String value1, String value2) {
            addCriterion("originalmaturitydate between", value1, value2, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOriginalmaturitydateNotBetween(String value1, String value2) {
            addCriterion("originalmaturitydate not between", value1, value2, "originalmaturitydate");
            return (Criteria) this;
        }

        public Criteria andOperateorgidIsNull() {
            addCriterion("operateorgid is null");
            return (Criteria) this;
        }

        public Criteria andOperateorgidIsNotNull() {
            addCriterion("operateorgid is not null");
            return (Criteria) this;
        }

        public Criteria andOperateorgidEqualTo(String value) {
            addCriterion("operateorgid =", value, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andOperateorgidNotEqualTo(String value) {
            addCriterion("operateorgid <>", value, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andOperateorgidGreaterThan(String value) {
            addCriterion("operateorgid >", value, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andOperateorgidGreaterThanOrEqualTo(String value) {
            addCriterion("operateorgid >=", value, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andOperateorgidLessThan(String value) {
            addCriterion("operateorgid <", value, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andOperateorgidLessThanOrEqualTo(String value) {
            addCriterion("operateorgid <=", value, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andOperateorgidLike(String value) {
            addCriterion("operateorgid like", value, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andOperateorgidNotLike(String value) {
            addCriterion("operateorgid not like", value, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andOperateorgidIn(List<String> values) {
            addCriterion("operateorgid in", values, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andOperateorgidNotIn(List<String> values) {
            addCriterion("operateorgid not in", values, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andOperateorgidBetween(String value1, String value2) {
            addCriterion("operateorgid between", value1, value2, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andOperateorgidNotBetween(String value1, String value2) {
            addCriterion("operateorgid not between", value1, value2, "operateorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidIsNull() {
            addCriterion("accountingorgid is null");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidIsNotNull() {
            addCriterion("accountingorgid is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidEqualTo(String value) {
            addCriterion("accountingorgid =", value, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidNotEqualTo(String value) {
            addCriterion("accountingorgid <>", value, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidGreaterThan(String value) {
            addCriterion("accountingorgid >", value, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidGreaterThanOrEqualTo(String value) {
            addCriterion("accountingorgid >=", value, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidLessThan(String value) {
            addCriterion("accountingorgid <", value, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidLessThanOrEqualTo(String value) {
            addCriterion("accountingorgid <=", value, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidLike(String value) {
            addCriterion("accountingorgid like", value, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidNotLike(String value) {
            addCriterion("accountingorgid not like", value, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidIn(List<String> values) {
            addCriterion("accountingorgid in", values, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidNotIn(List<String> values) {
            addCriterion("accountingorgid not in", values, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidBetween(String value1, String value2) {
            addCriterion("accountingorgid between", value1, value2, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andAccountingorgidNotBetween(String value1, String value2) {
            addCriterion("accountingorgid not between", value1, value2, "accountingorgid");
            return (Criteria) this;
        }

        public Criteria andLoanstatusIsNull() {
            addCriterion("loanstatus is null");
            return (Criteria) this;
        }

        public Criteria andLoanstatusIsNotNull() {
            addCriterion("loanstatus is not null");
            return (Criteria) this;
        }

        public Criteria andLoanstatusEqualTo(String value) {
            addCriterion("loanstatus =", value, "loanstatus");
            return (Criteria) this;
        }

        public Criteria andLoanstatusNotEqualTo(String value) {
            addCriterion("loanstatus <>", value, "loanstatus");
            return (Criteria) this;
        }

        public Criteria andLoanstatusGreaterThan(String value) {
            addCriterion("loanstatus >", value, "loanstatus");
            return (Criteria) this;
        }

        public Criteria andLoanstatusGreaterThanOrEqualTo(String value) {
            addCriterion("loanstatus >=", value, "loanstatus");
            return (Criteria) this;
        }

        public Criteria andLoanstatusLessThan(String value) {
            addCriterion("loanstatus <", value, "loanstatus");
            return (Criteria) this;
        }

        public Criteria andLoanstatusLessThanOrEqualTo(String value) {
            addCriterion("loanstatus <=", value, "loanstatus");
            return (Criteria) this;
        }

        public Criteria andLoanstatusLike(String value) {
            addCriterion("loanstatus like", value, "loanstatus");
            return (Criteria) this;
        }

        public Criteria andLoanstatusNotLike(String value) {
            addCriterion("loanstatus not like", value, "loanstatus");
            return (Criteria) this;
        }

        public Criteria andLoanstatusIn(List<String> values) {
            addCriterion("loanstatus in", values, "loanstatus");
            return (Criteria) this;
        }

        public Criteria andLoanstatusNotIn(List<String> values) {
            addCriterion("loanstatus not in", values, "loanstatus");
            return (Criteria) this;
        }

        public Criteria andLoanstatusBetween(String value1, String value2) {
            addCriterion("loanstatus between", value1, value2, "loanstatus");
            return (Criteria) this;
        }

        public Criteria andLoanstatusNotBetween(String value1, String value2) {
            addCriterion("loanstatus not between", value1, value2, "loanstatus");
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

        public Criteria andBusinessdateIsNull() {
            addCriterion("businessdate is null");
            return (Criteria) this;
        }

        public Criteria andBusinessdateIsNotNull() {
            addCriterion("businessdate is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessdateEqualTo(String value) {
            addCriterion("businessdate =", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotEqualTo(String value) {
            addCriterion("businessdate <>", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateGreaterThan(String value) {
            addCriterion("businessdate >", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateGreaterThanOrEqualTo(String value) {
            addCriterion("businessdate >=", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateLessThan(String value) {
            addCriterion("businessdate <", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateLessThanOrEqualTo(String value) {
            addCriterion("businessdate <=", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateLike(String value) {
            addCriterion("businessdate like", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotLike(String value) {
            addCriterion("businessdate not like", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateIn(List<String> values) {
            addCriterion("businessdate in", values, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotIn(List<String> values) {
            addCriterion("businessdate not in", values, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateBetween(String value1, String value2) {
            addCriterion("businessdate between", value1, value2, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotBetween(String value1, String value2) {
            addCriterion("businessdate not between", value1, value2, "businessdate");
            return (Criteria) this;
        }

        public Criteria andLockflagIsNull() {
            addCriterion("lockflag is null");
            return (Criteria) this;
        }

        public Criteria andLockflagIsNotNull() {
            addCriterion("lockflag is not null");
            return (Criteria) this;
        }

        public Criteria andLockflagEqualTo(String value) {
            addCriterion("lockflag =", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagNotEqualTo(String value) {
            addCriterion("lockflag <>", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagGreaterThan(String value) {
            addCriterion("lockflag >", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagGreaterThanOrEqualTo(String value) {
            addCriterion("lockflag >=", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagLessThan(String value) {
            addCriterion("lockflag <", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagLessThanOrEqualTo(String value) {
            addCriterion("lockflag <=", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagLike(String value) {
            addCriterion("lockflag like", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagNotLike(String value) {
            addCriterion("lockflag not like", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagIn(List<String> values) {
            addCriterion("lockflag in", values, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagNotIn(List<String> values) {
            addCriterion("lockflag not in", values, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagBetween(String value1, String value2) {
            addCriterion("lockflag between", value1, value2, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagNotBetween(String value1, String value2) {
            addCriterion("lockflag not between", value1, value2, "lockflag");
            return (Criteria) this;
        }

        public Criteria andOverduedaysIsNull() {
            addCriterion("overduedays is null");
            return (Criteria) this;
        }

        public Criteria andOverduedaysIsNotNull() {
            addCriterion("overduedays is not null");
            return (Criteria) this;
        }

        public Criteria andOverduedaysEqualTo(Integer value) {
            addCriterion("overduedays =", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysNotEqualTo(Integer value) {
            addCriterion("overduedays <>", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysGreaterThan(Integer value) {
            addCriterion("overduedays >", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("overduedays >=", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysLessThan(Integer value) {
            addCriterion("overduedays <", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysLessThanOrEqualTo(Integer value) {
            addCriterion("overduedays <=", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysIn(List<Integer> values) {
            addCriterion("overduedays in", values, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysNotIn(List<Integer> values) {
            addCriterion("overduedays not in", values, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysBetween(Integer value1, Integer value2) {
            addCriterion("overduedays between", value1, value2, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysNotBetween(Integer value1, Integer value2) {
            addCriterion("overduedays not between", value1, value2, "overduedays");
            return (Criteria) this;
        }

        public Criteria andClassifyresultIsNull() {
            addCriterion("classifyresult is null");
            return (Criteria) this;
        }

        public Criteria andClassifyresultIsNotNull() {
            addCriterion("classifyresult is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyresultEqualTo(String value) {
            addCriterion("classifyresult =", value, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andClassifyresultNotEqualTo(String value) {
            addCriterion("classifyresult <>", value, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andClassifyresultGreaterThan(String value) {
            addCriterion("classifyresult >", value, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andClassifyresultGreaterThanOrEqualTo(String value) {
            addCriterion("classifyresult >=", value, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andClassifyresultLessThan(String value) {
            addCriterion("classifyresult <", value, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andClassifyresultLessThanOrEqualTo(String value) {
            addCriterion("classifyresult <=", value, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andClassifyresultLike(String value) {
            addCriterion("classifyresult like", value, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andClassifyresultNotLike(String value) {
            addCriterion("classifyresult not like", value, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andClassifyresultIn(List<String> values) {
            addCriterion("classifyresult in", values, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andClassifyresultNotIn(List<String> values) {
            addCriterion("classifyresult not in", values, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andClassifyresultBetween(String value1, String value2) {
            addCriterion("classifyresult between", value1, value2, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andClassifyresultNotBetween(String value1, String value2) {
            addCriterion("classifyresult not between", value1, value2, "classifyresult");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoIsNull() {
            addCriterion("putoutserialno is null");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoIsNotNull() {
            addCriterion("putoutserialno is not null");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoEqualTo(String value) {
            addCriterion("putoutserialno =", value, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoNotEqualTo(String value) {
            addCriterion("putoutserialno <>", value, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoGreaterThan(String value) {
            addCriterion("putoutserialno >", value, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("putoutserialno >=", value, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoLessThan(String value) {
            addCriterion("putoutserialno <", value, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoLessThanOrEqualTo(String value) {
            addCriterion("putoutserialno <=", value, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoLike(String value) {
            addCriterion("putoutserialno like", value, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoNotLike(String value) {
            addCriterion("putoutserialno not like", value, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoIn(List<String> values) {
            addCriterion("putoutserialno in", values, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoNotIn(List<String> values) {
            addCriterion("putoutserialno not in", values, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoBetween(String value1, String value2) {
            addCriterion("putoutserialno between", value1, value2, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andPutoutserialnoNotBetween(String value1, String value2) {
            addCriterion("putoutserialno not between", value1, value2, "putoutserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoIsNull() {
            addCriterion("approveserialno is null");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoIsNotNull() {
            addCriterion("approveserialno is not null");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoEqualTo(String value) {
            addCriterion("approveserialno =", value, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoNotEqualTo(String value) {
            addCriterion("approveserialno <>", value, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoGreaterThan(String value) {
            addCriterion("approveserialno >", value, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("approveserialno >=", value, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoLessThan(String value) {
            addCriterion("approveserialno <", value, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoLessThanOrEqualTo(String value) {
            addCriterion("approveserialno <=", value, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoLike(String value) {
            addCriterion("approveserialno like", value, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoNotLike(String value) {
            addCriterion("approveserialno not like", value, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoIn(List<String> values) {
            addCriterion("approveserialno in", values, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoNotIn(List<String> values) {
            addCriterion("approveserialno not in", values, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoBetween(String value1, String value2) {
            addCriterion("approveserialno between", value1, value2, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApproveserialnoNotBetween(String value1, String value2) {
            addCriterion("approveserialno not between", value1, value2, "approveserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoIsNull() {
            addCriterion("applyserialno is null");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoIsNotNull() {
            addCriterion("applyserialno is not null");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoEqualTo(String value) {
            addCriterion("applyserialno =", value, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoNotEqualTo(String value) {
            addCriterion("applyserialno <>", value, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoGreaterThan(String value) {
            addCriterion("applyserialno >", value, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("applyserialno >=", value, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoLessThan(String value) {
            addCriterion("applyserialno <", value, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoLessThanOrEqualTo(String value) {
            addCriterion("applyserialno <=", value, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoLike(String value) {
            addCriterion("applyserialno like", value, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoNotLike(String value) {
            addCriterion("applyserialno not like", value, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoIn(List<String> values) {
            addCriterion("applyserialno in", values, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoNotIn(List<String> values) {
            addCriterion("applyserialno not in", values, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoBetween(String value1, String value2) {
            addCriterion("applyserialno between", value1, value2, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andApplyserialnoNotBetween(String value1, String value2) {
            addCriterion("applyserialno not between", value1, value2, "applyserialno");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusIsNull() {
            addCriterion("businessstatus is null");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusIsNotNull() {
            addCriterion("businessstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusEqualTo(String value) {
            addCriterion("businessstatus =", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusNotEqualTo(String value) {
            addCriterion("businessstatus <>", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusGreaterThan(String value) {
            addCriterion("businessstatus >", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusGreaterThanOrEqualTo(String value) {
            addCriterion("businessstatus >=", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusLessThan(String value) {
            addCriterion("businessstatus <", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusLessThanOrEqualTo(String value) {
            addCriterion("businessstatus <=", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusLike(String value) {
            addCriterion("businessstatus like", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusNotLike(String value) {
            addCriterion("businessstatus not like", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusIn(List<String> values) {
            addCriterion("businessstatus in", values, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusNotIn(List<String> values) {
            addCriterion("businessstatus not in", values, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusBetween(String value1, String value2) {
            addCriterion("businessstatus between", value1, value2, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusNotBetween(String value1, String value2) {
            addCriterion("businessstatus not between", value1, value2, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andMonthrateIsNull() {
            addCriterion("MonthRate is null");
            return (Criteria) this;
        }

        public Criteria andMonthrateIsNotNull() {
            addCriterion("MonthRate is not null");
            return (Criteria) this;
        }

        public Criteria andMonthrateEqualTo(BigDecimal value) {
            addCriterion("MonthRate =", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateNotEqualTo(BigDecimal value) {
            addCriterion("MonthRate <>", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateGreaterThan(BigDecimal value) {
            addCriterion("MonthRate >", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MonthRate >=", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateLessThan(BigDecimal value) {
            addCriterion("MonthRate <", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MonthRate <=", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateIn(List<BigDecimal> values) {
            addCriterion("MonthRate in", values, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateNotIn(List<BigDecimal> values) {
            addCriterion("MonthRate not in", values, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MonthRate between", value1, value2, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MonthRate not between", value1, value2, "monthrate");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("Rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("Rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("Rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("Rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("Rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("Rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("Rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("Rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andArateIsNull() {
            addCriterion("ARate is null");
            return (Criteria) this;
        }

        public Criteria andArateIsNotNull() {
            addCriterion("ARate is not null");
            return (Criteria) this;
        }

        public Criteria andArateEqualTo(BigDecimal value) {
            addCriterion("ARate =", value, "arate");
            return (Criteria) this;
        }

        public Criteria andArateNotEqualTo(BigDecimal value) {
            addCriterion("ARate <>", value, "arate");
            return (Criteria) this;
        }

        public Criteria andArateGreaterThan(BigDecimal value) {
            addCriterion("ARate >", value, "arate");
            return (Criteria) this;
        }

        public Criteria andArateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ARate >=", value, "arate");
            return (Criteria) this;
        }

        public Criteria andArateLessThan(BigDecimal value) {
            addCriterion("ARate <", value, "arate");
            return (Criteria) this;
        }

        public Criteria andArateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ARate <=", value, "arate");
            return (Criteria) this;
        }

        public Criteria andArateIn(List<BigDecimal> values) {
            addCriterion("ARate in", values, "arate");
            return (Criteria) this;
        }

        public Criteria andArateNotIn(List<BigDecimal> values) {
            addCriterion("ARate not in", values, "arate");
            return (Criteria) this;
        }

        public Criteria andArateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ARate between", value1, value2, "arate");
            return (Criteria) this;
        }

        public Criteria andArateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ARate not between", value1, value2, "arate");
            return (Criteria) this;
        }

        public Criteria andBrateIsNull() {
            addCriterion("BRate is null");
            return (Criteria) this;
        }

        public Criteria andBrateIsNotNull() {
            addCriterion("BRate is not null");
            return (Criteria) this;
        }

        public Criteria andBrateEqualTo(BigDecimal value) {
            addCriterion("BRate =", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateNotEqualTo(BigDecimal value) {
            addCriterion("BRate <>", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateGreaterThan(BigDecimal value) {
            addCriterion("BRate >", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BRate >=", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateLessThan(BigDecimal value) {
            addCriterion("BRate <", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BRate <=", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateIn(List<BigDecimal> values) {
            addCriterion("BRate in", values, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateNotIn(List<BigDecimal> values) {
            addCriterion("BRate not in", values, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BRate between", value1, value2, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BRate not between", value1, value2, "brate");
            return (Criteria) this;
        }

        public Criteria andCrateIsNull() {
            addCriterion("CRate is null");
            return (Criteria) this;
        }

        public Criteria andCrateIsNotNull() {
            addCriterion("CRate is not null");
            return (Criteria) this;
        }

        public Criteria andCrateEqualTo(BigDecimal value) {
            addCriterion("CRate =", value, "crate");
            return (Criteria) this;
        }

        public Criteria andCrateNotEqualTo(BigDecimal value) {
            addCriterion("CRate <>", value, "crate");
            return (Criteria) this;
        }

        public Criteria andCrateGreaterThan(BigDecimal value) {
            addCriterion("CRate >", value, "crate");
            return (Criteria) this;
        }

        public Criteria andCrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CRate >=", value, "crate");
            return (Criteria) this;
        }

        public Criteria andCrateLessThan(BigDecimal value) {
            addCriterion("CRate <", value, "crate");
            return (Criteria) this;
        }

        public Criteria andCrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CRate <=", value, "crate");
            return (Criteria) this;
        }

        public Criteria andCrateIn(List<BigDecimal> values) {
            addCriterion("CRate in", values, "crate");
            return (Criteria) this;
        }

        public Criteria andCrateNotIn(List<BigDecimal> values) {
            addCriterion("CRate not in", values, "crate");
            return (Criteria) this;
        }

        public Criteria andCrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRate between", value1, value2, "crate");
            return (Criteria) this;
        }

        public Criteria andCrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRate not between", value1, value2, "crate");
            return (Criteria) this;
        }

        public Criteria andDrateIsNull() {
            addCriterion("DRate is null");
            return (Criteria) this;
        }

        public Criteria andDrateIsNotNull() {
            addCriterion("DRate is not null");
            return (Criteria) this;
        }

        public Criteria andDrateEqualTo(BigDecimal value) {
            addCriterion("DRate =", value, "drate");
            return (Criteria) this;
        }

        public Criteria andDrateNotEqualTo(BigDecimal value) {
            addCriterion("DRate <>", value, "drate");
            return (Criteria) this;
        }

        public Criteria andDrateGreaterThan(BigDecimal value) {
            addCriterion("DRate >", value, "drate");
            return (Criteria) this;
        }

        public Criteria andDrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DRate >=", value, "drate");
            return (Criteria) this;
        }

        public Criteria andDrateLessThan(BigDecimal value) {
            addCriterion("DRate <", value, "drate");
            return (Criteria) this;
        }

        public Criteria andDrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DRate <=", value, "drate");
            return (Criteria) this;
        }

        public Criteria andDrateIn(List<BigDecimal> values) {
            addCriterion("DRate in", values, "drate");
            return (Criteria) this;
        }

        public Criteria andDrateNotIn(List<BigDecimal> values) {
            addCriterion("DRate not in", values, "drate");
            return (Criteria) this;
        }

        public Criteria andDrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRate between", value1, value2, "drate");
            return (Criteria) this;
        }

        public Criteria andDrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRate not between", value1, value2, "drate");
            return (Criteria) this;
        }

        public Criteria andReserverateIsNull() {
            addCriterion("ReserveRate is null");
            return (Criteria) this;
        }

        public Criteria andReserverateIsNotNull() {
            addCriterion("ReserveRate is not null");
            return (Criteria) this;
        }

        public Criteria andReserverateEqualTo(BigDecimal value) {
            addCriterion("ReserveRate =", value, "reserverate");
            return (Criteria) this;
        }

        public Criteria andReserverateNotEqualTo(BigDecimal value) {
            addCriterion("ReserveRate <>", value, "reserverate");
            return (Criteria) this;
        }

        public Criteria andReserverateGreaterThan(BigDecimal value) {
            addCriterion("ReserveRate >", value, "reserverate");
            return (Criteria) this;
        }

        public Criteria andReserverateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ReserveRate >=", value, "reserverate");
            return (Criteria) this;
        }

        public Criteria andReserverateLessThan(BigDecimal value) {
            addCriterion("ReserveRate <", value, "reserverate");
            return (Criteria) this;
        }

        public Criteria andReserverateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ReserveRate <=", value, "reserverate");
            return (Criteria) this;
        }

        public Criteria andReserverateIn(List<BigDecimal> values) {
            addCriterion("ReserveRate in", values, "reserverate");
            return (Criteria) this;
        }

        public Criteria andReserverateNotIn(List<BigDecimal> values) {
            addCriterion("ReserveRate not in", values, "reserverate");
            return (Criteria) this;
        }

        public Criteria andReserverateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReserveRate between", value1, value2, "reserverate");
            return (Criteria) this;
        }

        public Criteria andReserverateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReserveRate not between", value1, value2, "reserverate");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("Term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("Term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("Term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("Term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("Term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("Term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("Term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("Term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("Term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("Term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("Term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("Term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("Term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("Term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoIsNull() {
            addCriterion("MerchantsNo is null");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoIsNotNull() {
            addCriterion("MerchantsNo is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoEqualTo(String value) {
            addCriterion("MerchantsNo =", value, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoNotEqualTo(String value) {
            addCriterion("MerchantsNo <>", value, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoGreaterThan(String value) {
            addCriterion("MerchantsNo >", value, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantsNo >=", value, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoLessThan(String value) {
            addCriterion("MerchantsNo <", value, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoLessThanOrEqualTo(String value) {
            addCriterion("MerchantsNo <=", value, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoLike(String value) {
            addCriterion("MerchantsNo like", value, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoNotLike(String value) {
            addCriterion("MerchantsNo not like", value, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoIn(List<String> values) {
            addCriterion("MerchantsNo in", values, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoNotIn(List<String> values) {
            addCriterion("MerchantsNo not in", values, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoBetween(String value1, String value2) {
            addCriterion("MerchantsNo between", value1, value2, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andMerchantsnoNotBetween(String value1, String value2) {
            addCriterion("MerchantsNo not between", value1, value2, "merchantsno");
            return (Criteria) this;
        }

        public Criteria andSanoIsNull() {
            addCriterion("SANo is null");
            return (Criteria) this;
        }

        public Criteria andSanoIsNotNull() {
            addCriterion("SANo is not null");
            return (Criteria) this;
        }

        public Criteria andSanoEqualTo(String value) {
            addCriterion("SANo =", value, "sano");
            return (Criteria) this;
        }

        public Criteria andSanoNotEqualTo(String value) {
            addCriterion("SANo <>", value, "sano");
            return (Criteria) this;
        }

        public Criteria andSanoGreaterThan(String value) {
            addCriterion("SANo >", value, "sano");
            return (Criteria) this;
        }

        public Criteria andSanoGreaterThanOrEqualTo(String value) {
            addCriterion("SANo >=", value, "sano");
            return (Criteria) this;
        }

        public Criteria andSanoLessThan(String value) {
            addCriterion("SANo <", value, "sano");
            return (Criteria) this;
        }

        public Criteria andSanoLessThanOrEqualTo(String value) {
            addCriterion("SANo <=", value, "sano");
            return (Criteria) this;
        }

        public Criteria andSanoLike(String value) {
            addCriterion("SANo like", value, "sano");
            return (Criteria) this;
        }

        public Criteria andSanoNotLike(String value) {
            addCriterion("SANo not like", value, "sano");
            return (Criteria) this;
        }

        public Criteria andSanoIn(List<String> values) {
            addCriterion("SANo in", values, "sano");
            return (Criteria) this;
        }

        public Criteria andSanoNotIn(List<String> values) {
            addCriterion("SANo not in", values, "sano");
            return (Criteria) this;
        }

        public Criteria andSanoBetween(String value1, String value2) {
            addCriterion("SANo between", value1, value2, "sano");
            return (Criteria) this;
        }

        public Criteria andSanoNotBetween(String value1, String value2) {
            addCriterion("SANo not between", value1, value2, "sano");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRepayuserIsNull() {
            addCriterion("RepayUser is null");
            return (Criteria) this;
        }

        public Criteria andRepayuserIsNotNull() {
            addCriterion("RepayUser is not null");
            return (Criteria) this;
        }

        public Criteria andRepayuserEqualTo(String value) {
            addCriterion("RepayUser =", value, "repayuser");
            return (Criteria) this;
        }

        public Criteria andRepayuserNotEqualTo(String value) {
            addCriterion("RepayUser <>", value, "repayuser");
            return (Criteria) this;
        }

        public Criteria andRepayuserGreaterThan(String value) {
            addCriterion("RepayUser >", value, "repayuser");
            return (Criteria) this;
        }

        public Criteria andRepayuserGreaterThanOrEqualTo(String value) {
            addCriterion("RepayUser >=", value, "repayuser");
            return (Criteria) this;
        }

        public Criteria andRepayuserLessThan(String value) {
            addCriterion("RepayUser <", value, "repayuser");
            return (Criteria) this;
        }

        public Criteria andRepayuserLessThanOrEqualTo(String value) {
            addCriterion("RepayUser <=", value, "repayuser");
            return (Criteria) this;
        }

        public Criteria andRepayuserLike(String value) {
            addCriterion("RepayUser like", value, "repayuser");
            return (Criteria) this;
        }

        public Criteria andRepayuserNotLike(String value) {
            addCriterion("RepayUser not like", value, "repayuser");
            return (Criteria) this;
        }

        public Criteria andRepayuserIn(List<String> values) {
            addCriterion("RepayUser in", values, "repayuser");
            return (Criteria) this;
        }

        public Criteria andRepayuserNotIn(List<String> values) {
            addCriterion("RepayUser not in", values, "repayuser");
            return (Criteria) this;
        }

        public Criteria andRepayuserBetween(String value1, String value2) {
            addCriterion("RepayUser between", value1, value2, "repayuser");
            return (Criteria) this;
        }

        public Criteria andRepayuserNotBetween(String value1, String value2) {
            addCriterion("RepayUser not between", value1, value2, "repayuser");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameIsNull() {
            addCriterion("MerchantsName is null");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameIsNotNull() {
            addCriterion("MerchantsName is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameEqualTo(String value) {
            addCriterion("MerchantsName =", value, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameNotEqualTo(String value) {
            addCriterion("MerchantsName <>", value, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameGreaterThan(String value) {
            addCriterion("MerchantsName >", value, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantsName >=", value, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameLessThan(String value) {
            addCriterion("MerchantsName <", value, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameLessThanOrEqualTo(String value) {
            addCriterion("MerchantsName <=", value, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameLike(String value) {
            addCriterion("MerchantsName like", value, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameNotLike(String value) {
            addCriterion("MerchantsName not like", value, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameIn(List<String> values) {
            addCriterion("MerchantsName in", values, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameNotIn(List<String> values) {
            addCriterion("MerchantsName not in", values, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameBetween(String value1, String value2) {
            addCriterion("MerchantsName between", value1, value2, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andMerchantsnameNotBetween(String value1, String value2) {
            addCriterion("MerchantsName not between", value1, value2, "merchantsname");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyIsNull() {
            addCriterion("ReturnPolicy is null");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyIsNotNull() {
            addCriterion("ReturnPolicy is not null");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyEqualTo(String value) {
            addCriterion("ReturnPolicy =", value, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyNotEqualTo(String value) {
            addCriterion("ReturnPolicy <>", value, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyGreaterThan(String value) {
            addCriterion("ReturnPolicy >", value, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyGreaterThanOrEqualTo(String value) {
            addCriterion("ReturnPolicy >=", value, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyLessThan(String value) {
            addCriterion("ReturnPolicy <", value, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyLessThanOrEqualTo(String value) {
            addCriterion("ReturnPolicy <=", value, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyLike(String value) {
            addCriterion("ReturnPolicy like", value, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyNotLike(String value) {
            addCriterion("ReturnPolicy not like", value, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyIn(List<String> values) {
            addCriterion("ReturnPolicy in", values, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyNotIn(List<String> values) {
            addCriterion("ReturnPolicy not in", values, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyBetween(String value1, String value2) {
            addCriterion("ReturnPolicy between", value1, value2, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andReturnpolicyNotBetween(String value1, String value2) {
            addCriterion("ReturnPolicy not between", value1, value2, "returnpolicy");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andInputuseridIsNull() {
            addCriterion("INPUTUSERID is null");
            return (Criteria) this;
        }

        public Criteria andInputuseridIsNotNull() {
            addCriterion("INPUTUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andInputuseridEqualTo(String value) {
            addCriterion("INPUTUSERID =", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotEqualTo(String value) {
            addCriterion("INPUTUSERID <>", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridGreaterThan(String value) {
            addCriterion("INPUTUSERID >", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTUSERID >=", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridLessThan(String value) {
            addCriterion("INPUTUSERID <", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridLessThanOrEqualTo(String value) {
            addCriterion("INPUTUSERID <=", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridLike(String value) {
            addCriterion("INPUTUSERID like", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotLike(String value) {
            addCriterion("INPUTUSERID not like", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridIn(List<String> values) {
            addCriterion("INPUTUSERID in", values, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotIn(List<String> values) {
            addCriterion("INPUTUSERID not in", values, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridBetween(String value1, String value2) {
            addCriterion("INPUTUSERID between", value1, value2, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotBetween(String value1, String value2) {
            addCriterion("INPUTUSERID not between", value1, value2, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputorgidIsNull() {
            addCriterion("INPUTORGID is null");
            return (Criteria) this;
        }

        public Criteria andInputorgidIsNotNull() {
            addCriterion("INPUTORGID is not null");
            return (Criteria) this;
        }

        public Criteria andInputorgidEqualTo(String value) {
            addCriterion("INPUTORGID =", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidNotEqualTo(String value) {
            addCriterion("INPUTORGID <>", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidGreaterThan(String value) {
            addCriterion("INPUTORGID >", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTORGID >=", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidLessThan(String value) {
            addCriterion("INPUTORGID <", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidLessThanOrEqualTo(String value) {
            addCriterion("INPUTORGID <=", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidLike(String value) {
            addCriterion("INPUTORGID like", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidNotLike(String value) {
            addCriterion("INPUTORGID not like", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidIn(List<String> values) {
            addCriterion("INPUTORGID in", values, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidNotIn(List<String> values) {
            addCriterion("INPUTORGID not in", values, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidBetween(String value1, String value2) {
            addCriterion("INPUTORGID between", value1, value2, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidNotBetween(String value1, String value2) {
            addCriterion("INPUTORGID not between", value1, value2, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("INPUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("INPUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(String value) {
            addCriterion("INPUTDATE =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(String value) {
            addCriterion("INPUTDATE <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(String value) {
            addCriterion("INPUTDATE >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTDATE >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(String value) {
            addCriterion("INPUTDATE <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(String value) {
            addCriterion("INPUTDATE <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLike(String value) {
            addCriterion("INPUTDATE like", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotLike(String value) {
            addCriterion("INPUTDATE not like", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<String> values) {
            addCriterion("INPUTDATE in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<String> values) {
            addCriterion("INPUTDATE not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(String value1, String value2) {
            addCriterion("INPUTDATE between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(String value1, String value2) {
            addCriterion("INPUTDATE not between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andTermmonthIsNull() {
            addCriterion("TermMonth is null");
            return (Criteria) this;
        }

        public Criteria andTermmonthIsNotNull() {
            addCriterion("TermMonth is not null");
            return (Criteria) this;
        }

        public Criteria andTermmonthEqualTo(Integer value) {
            addCriterion("TermMonth =", value, "termmonth");
            return (Criteria) this;
        }

        public Criteria andTermmonthNotEqualTo(Integer value) {
            addCriterion("TermMonth <>", value, "termmonth");
            return (Criteria) this;
        }

        public Criteria andTermmonthGreaterThan(Integer value) {
            addCriterion("TermMonth >", value, "termmonth");
            return (Criteria) this;
        }

        public Criteria andTermmonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("TermMonth >=", value, "termmonth");
            return (Criteria) this;
        }

        public Criteria andTermmonthLessThan(Integer value) {
            addCriterion("TermMonth <", value, "termmonth");
            return (Criteria) this;
        }

        public Criteria andTermmonthLessThanOrEqualTo(Integer value) {
            addCriterion("TermMonth <=", value, "termmonth");
            return (Criteria) this;
        }

        public Criteria andTermmonthIn(List<Integer> values) {
            addCriterion("TermMonth in", values, "termmonth");
            return (Criteria) this;
        }

        public Criteria andTermmonthNotIn(List<Integer> values) {
            addCriterion("TermMonth not in", values, "termmonth");
            return (Criteria) this;
        }

        public Criteria andTermmonthBetween(Integer value1, Integer value2) {
            addCriterion("TermMonth between", value1, value2, "termmonth");
            return (Criteria) this;
        }

        public Criteria andTermmonthNotBetween(Integer value1, Integer value2) {
            addCriterion("TermMonth not between", value1, value2, "termmonth");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidIsNull() {
            addCriterion("ScrutinyOrgID is null");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidIsNotNull() {
            addCriterion("ScrutinyOrgID is not null");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidEqualTo(String value) {
            addCriterion("ScrutinyOrgID =", value, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidNotEqualTo(String value) {
            addCriterion("ScrutinyOrgID <>", value, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidGreaterThan(String value) {
            addCriterion("ScrutinyOrgID >", value, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidGreaterThanOrEqualTo(String value) {
            addCriterion("ScrutinyOrgID >=", value, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidLessThan(String value) {
            addCriterion("ScrutinyOrgID <", value, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidLessThanOrEqualTo(String value) {
            addCriterion("ScrutinyOrgID <=", value, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidLike(String value) {
            addCriterion("ScrutinyOrgID like", value, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidNotLike(String value) {
            addCriterion("ScrutinyOrgID not like", value, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidIn(List<String> values) {
            addCriterion("ScrutinyOrgID in", values, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidNotIn(List<String> values) {
            addCriterion("ScrutinyOrgID not in", values, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidBetween(String value1, String value2) {
            addCriterion("ScrutinyOrgID between", value1, value2, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andScrutinyorgidNotBetween(String value1, String value2) {
            addCriterion("ScrutinyOrgID not between", value1, value2, "scrutinyorgid");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("GroupID is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("GroupID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("GroupID =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("GroupID <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("GroupID >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("GroupID >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("GroupID <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("GroupID <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("GroupID like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("GroupID not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("GroupID in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("GroupID not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("GroupID between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("GroupID not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNull() {
            addCriterion("TeamID is null");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNotNull() {
            addCriterion("TeamID is not null");
            return (Criteria) this;
        }

        public Criteria andTeamidEqualTo(String value) {
            addCriterion("TeamID =", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotEqualTo(String value) {
            addCriterion("TeamID <>", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThan(String value) {
            addCriterion("TeamID >", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThanOrEqualTo(String value) {
            addCriterion("TeamID >=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThan(String value) {
            addCriterion("TeamID <", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThanOrEqualTo(String value) {
            addCriterion("TeamID <=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLike(String value) {
            addCriterion("TeamID like", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotLike(String value) {
            addCriterion("TeamID not like", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidIn(List<String> values) {
            addCriterion("TeamID in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotIn(List<String> values) {
            addCriterion("TeamID not in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidBetween(String value1, String value2) {
            addCriterion("TeamID between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotBetween(String value1, String value2) {
            addCriterion("TeamID not between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridIsNull() {
            addCriterion("SucessUserID is null");
            return (Criteria) this;
        }

        public Criteria andSucessuseridIsNotNull() {
            addCriterion("SucessUserID is not null");
            return (Criteria) this;
        }

        public Criteria andSucessuseridEqualTo(String value) {
            addCriterion("SucessUserID =", value, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridNotEqualTo(String value) {
            addCriterion("SucessUserID <>", value, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridGreaterThan(String value) {
            addCriterion("SucessUserID >", value, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridGreaterThanOrEqualTo(String value) {
            addCriterion("SucessUserID >=", value, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridLessThan(String value) {
            addCriterion("SucessUserID <", value, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridLessThanOrEqualTo(String value) {
            addCriterion("SucessUserID <=", value, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridLike(String value) {
            addCriterion("SucessUserID like", value, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridNotLike(String value) {
            addCriterion("SucessUserID not like", value, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridIn(List<String> values) {
            addCriterion("SucessUserID in", values, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridNotIn(List<String> values) {
            addCriterion("SucessUserID not in", values, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridBetween(String value1, String value2) {
            addCriterion("SucessUserID between", value1, value2, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andSucessuseridNotBetween(String value1, String value2) {
            addCriterion("SucessUserID not between", value1, value2, "sucessuserid");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateIsNull() {
            addCriterion("HPPutoutDate is null");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateIsNotNull() {
            addCriterion("HPPutoutDate is not null");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateEqualTo(String value) {
            addCriterion("HPPutoutDate =", value, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateNotEqualTo(String value) {
            addCriterion("HPPutoutDate <>", value, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateGreaterThan(String value) {
            addCriterion("HPPutoutDate >", value, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateGreaterThanOrEqualTo(String value) {
            addCriterion("HPPutoutDate >=", value, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateLessThan(String value) {
            addCriterion("HPPutoutDate <", value, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateLessThanOrEqualTo(String value) {
            addCriterion("HPPutoutDate <=", value, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateLike(String value) {
            addCriterion("HPPutoutDate like", value, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateNotLike(String value) {
            addCriterion("HPPutoutDate not like", value, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateIn(List<String> values) {
            addCriterion("HPPutoutDate in", values, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateNotIn(List<String> values) {
            addCriterion("HPPutoutDate not in", values, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateBetween(String value1, String value2) {
            addCriterion("HPPutoutDate between", value1, value2, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpputoutdateNotBetween(String value1, String value2) {
            addCriterion("HPPutoutDate not between", value1, value2, "hpputoutdate");
            return (Criteria) this;
        }

        public Criteria andHpmaturityIsNull() {
            addCriterion("HPMaturity is null");
            return (Criteria) this;
        }

        public Criteria andHpmaturityIsNotNull() {
            addCriterion("HPMaturity is not null");
            return (Criteria) this;
        }

        public Criteria andHpmaturityEqualTo(String value) {
            addCriterion("HPMaturity =", value, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andHpmaturityNotEqualTo(String value) {
            addCriterion("HPMaturity <>", value, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andHpmaturityGreaterThan(String value) {
            addCriterion("HPMaturity >", value, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andHpmaturityGreaterThanOrEqualTo(String value) {
            addCriterion("HPMaturity >=", value, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andHpmaturityLessThan(String value) {
            addCriterion("HPMaturity <", value, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andHpmaturityLessThanOrEqualTo(String value) {
            addCriterion("HPMaturity <=", value, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andHpmaturityLike(String value) {
            addCriterion("HPMaturity like", value, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andHpmaturityNotLike(String value) {
            addCriterion("HPMaturity not like", value, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andHpmaturityIn(List<String> values) {
            addCriterion("HPMaturity in", values, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andHpmaturityNotIn(List<String> values) {
            addCriterion("HPMaturity not in", values, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andHpmaturityBetween(String value1, String value2) {
            addCriterion("HPMaturity between", value1, value2, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andHpmaturityNotBetween(String value1, String value2) {
            addCriterion("HPMaturity not between", value1, value2, "hpmaturity");
            return (Criteria) this;
        }

        public Criteria andActualpaytermIsNull() {
            addCriterion("actualpayterm is null");
            return (Criteria) this;
        }

        public Criteria andActualpaytermIsNotNull() {
            addCriterion("actualpayterm is not null");
            return (Criteria) this;
        }

        public Criteria andActualpaytermEqualTo(Integer value) {
            addCriterion("actualpayterm =", value, "actualpayterm");
            return (Criteria) this;
        }

        public Criteria andActualpaytermNotEqualTo(Integer value) {
            addCriterion("actualpayterm <>", value, "actualpayterm");
            return (Criteria) this;
        }

        public Criteria andActualpaytermGreaterThan(Integer value) {
            addCriterion("actualpayterm >", value, "actualpayterm");
            return (Criteria) this;
        }

        public Criteria andActualpaytermGreaterThanOrEqualTo(Integer value) {
            addCriterion("actualpayterm >=", value, "actualpayterm");
            return (Criteria) this;
        }

        public Criteria andActualpaytermLessThan(Integer value) {
            addCriterion("actualpayterm <", value, "actualpayterm");
            return (Criteria) this;
        }

        public Criteria andActualpaytermLessThanOrEqualTo(Integer value) {
            addCriterion("actualpayterm <=", value, "actualpayterm");
            return (Criteria) this;
        }

        public Criteria andActualpaytermIn(List<Integer> values) {
            addCriterion("actualpayterm in", values, "actualpayterm");
            return (Criteria) this;
        }

        public Criteria andActualpaytermNotIn(List<Integer> values) {
            addCriterion("actualpayterm not in", values, "actualpayterm");
            return (Criteria) this;
        }

        public Criteria andActualpaytermBetween(Integer value1, Integer value2) {
            addCriterion("actualpayterm between", value1, value2, "actualpayterm");
            return (Criteria) this;
        }

        public Criteria andActualpaytermNotBetween(Integer value1, Integer value2) {
            addCriterion("actualpayterm not between", value1, value2, "actualpayterm");
            return (Criteria) this;
        }

        public Criteria andMonthpayIsNull() {
            addCriterion("monthpay is null");
            return (Criteria) this;
        }

        public Criteria andMonthpayIsNotNull() {
            addCriterion("monthpay is not null");
            return (Criteria) this;
        }

        public Criteria andMonthpayEqualTo(BigDecimal value) {
            addCriterion("monthpay =", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayNotEqualTo(BigDecimal value) {
            addCriterion("monthpay <>", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayGreaterThan(BigDecimal value) {
            addCriterion("monthpay >", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monthpay >=", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayLessThan(BigDecimal value) {
            addCriterion("monthpay <", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monthpay <=", value, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayIn(List<BigDecimal> values) {
            addCriterion("monthpay in", values, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayNotIn(List<BigDecimal> values) {
            addCriterion("monthpay not in", values, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthpay between", value1, value2, "monthpay");
            return (Criteria) this;
        }

        public Criteria andMonthpayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthpay not between", value1, value2, "monthpay");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceIsNull() {
            addCriterion("unpayBalance is null");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceIsNotNull() {
            addCriterion("unpayBalance is not null");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceEqualTo(BigDecimal value) {
            addCriterion("unpayBalance =", value, "unpaybalance");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceNotEqualTo(BigDecimal value) {
            addCriterion("unpayBalance <>", value, "unpaybalance");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceGreaterThan(BigDecimal value) {
            addCriterion("unpayBalance >", value, "unpaybalance");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unpayBalance >=", value, "unpaybalance");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceLessThan(BigDecimal value) {
            addCriterion("unpayBalance <", value, "unpaybalance");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unpayBalance <=", value, "unpaybalance");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceIn(List<BigDecimal> values) {
            addCriterion("unpayBalance in", values, "unpaybalance");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceNotIn(List<BigDecimal> values) {
            addCriterion("unpayBalance not in", values, "unpaybalance");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unpayBalance between", value1, value2, "unpaybalance");
            return (Criteria) this;
        }

        public Criteria andUnpaybalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unpayBalance not between", value1, value2, "unpaybalance");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtIsNull() {
            addCriterion("currentPayamt is null");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtIsNotNull() {
            addCriterion("currentPayamt is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtEqualTo(BigDecimal value) {
            addCriterion("currentPayamt =", value, "currentpayamt");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtNotEqualTo(BigDecimal value) {
            addCriterion("currentPayamt <>", value, "currentpayamt");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtGreaterThan(BigDecimal value) {
            addCriterion("currentPayamt >", value, "currentpayamt");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("currentPayamt >=", value, "currentpayamt");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtLessThan(BigDecimal value) {
            addCriterion("currentPayamt <", value, "currentpayamt");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("currentPayamt <=", value, "currentpayamt");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtIn(List<BigDecimal> values) {
            addCriterion("currentPayamt in", values, "currentpayamt");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtNotIn(List<BigDecimal> values) {
            addCriterion("currentPayamt not in", values, "currentpayamt");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currentPayamt between", value1, value2, "currentpayamt");
            return (Criteria) this;
        }

        public Criteria andCurrentpayamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currentPayamt not between", value1, value2, "currentpayamt");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoIsNull() {
            addCriterion("loanserialno is null");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoIsNotNull() {
            addCriterion("loanserialno is not null");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoEqualTo(String value) {
            addCriterion("loanserialno =", value, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoNotEqualTo(String value) {
            addCriterion("loanserialno <>", value, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoGreaterThan(String value) {
            addCriterion("loanserialno >", value, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("loanserialno >=", value, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoLessThan(String value) {
            addCriterion("loanserialno <", value, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoLessThanOrEqualTo(String value) {
            addCriterion("loanserialno <=", value, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoLike(String value) {
            addCriterion("loanserialno like", value, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoNotLike(String value) {
            addCriterion("loanserialno not like", value, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoIn(List<String> values) {
            addCriterion("loanserialno in", values, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoNotIn(List<String> values) {
            addCriterion("loanserialno not in", values, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoBetween(String value1, String value2) {
            addCriterion("loanserialno between", value1, value2, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andLoanserialnoNotBetween(String value1, String value2) {
            addCriterion("loanserialno not between", value1, value2, "loanserialno");
            return (Criteria) this;
        }

        public Criteria andFirstdateIsNull() {
            addCriterion("firstdate is null");
            return (Criteria) this;
        }

        public Criteria andFirstdateIsNotNull() {
            addCriterion("firstdate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdateEqualTo(String value) {
            addCriterion("firstdate =", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateNotEqualTo(String value) {
            addCriterion("firstdate <>", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateGreaterThan(String value) {
            addCriterion("firstdate >", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateGreaterThanOrEqualTo(String value) {
            addCriterion("firstdate >=", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateLessThan(String value) {
            addCriterion("firstdate <", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateLessThanOrEqualTo(String value) {
            addCriterion("firstdate <=", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateLike(String value) {
            addCriterion("firstdate like", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateNotLike(String value) {
            addCriterion("firstdate not like", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateIn(List<String> values) {
            addCriterion("firstdate in", values, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateNotIn(List<String> values) {
            addCriterion("firstdate not in", values, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateBetween(String value1, String value2) {
            addCriterion("firstdate between", value1, value2, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateNotBetween(String value1, String value2) {
            addCriterion("firstdate not between", value1, value2, "firstdate");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNull() {
            addCriterion("BatchNo is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("BatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(String value) {
            addCriterion("BatchNo =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(String value) {
            addCriterion("BatchNo <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(String value) {
            addCriterion("BatchNo >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("BatchNo >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(String value) {
            addCriterion("BatchNo <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(String value) {
            addCriterion("BatchNo <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLike(String value) {
            addCriterion("BatchNo like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotLike(String value) {
            addCriterion("BatchNo not like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<String> values) {
            addCriterion("BatchNo in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<String> values) {
            addCriterion("BatchNo not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(String value1, String value2) {
            addCriterion("BatchNo between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(String value1, String value2) {
            addCriterion("BatchNo not between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodIsNull() {
            addCriterion("Cancellationperiod is null");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodIsNotNull() {
            addCriterion("Cancellationperiod is not null");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodEqualTo(Integer value) {
            addCriterion("Cancellationperiod =", value, "cancellationperiod");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodNotEqualTo(Integer value) {
            addCriterion("Cancellationperiod <>", value, "cancellationperiod");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodGreaterThan(Integer value) {
            addCriterion("Cancellationperiod >", value, "cancellationperiod");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("Cancellationperiod >=", value, "cancellationperiod");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodLessThan(Integer value) {
            addCriterion("Cancellationperiod <", value, "cancellationperiod");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodLessThanOrEqualTo(Integer value) {
            addCriterion("Cancellationperiod <=", value, "cancellationperiod");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodIn(List<Integer> values) {
            addCriterion("Cancellationperiod in", values, "cancellationperiod");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodNotIn(List<Integer> values) {
            addCriterion("Cancellationperiod not in", values, "cancellationperiod");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodBetween(Integer value1, Integer value2) {
            addCriterion("Cancellationperiod between", value1, value2, "cancellationperiod");
            return (Criteria) this;
        }

        public Criteria andCancellationperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("Cancellationperiod not between", value1, value2, "cancellationperiod");
            return (Criteria) this;
        }

        public Criteria andAfinerateIsNull() {
            addCriterion("AFineRate is null");
            return (Criteria) this;
        }

        public Criteria andAfinerateIsNotNull() {
            addCriterion("AFineRate is not null");
            return (Criteria) this;
        }

        public Criteria andAfinerateEqualTo(BigDecimal value) {
            addCriterion("AFineRate =", value, "afinerate");
            return (Criteria) this;
        }

        public Criteria andAfinerateNotEqualTo(BigDecimal value) {
            addCriterion("AFineRate <>", value, "afinerate");
            return (Criteria) this;
        }

        public Criteria andAfinerateGreaterThan(BigDecimal value) {
            addCriterion("AFineRate >", value, "afinerate");
            return (Criteria) this;
        }

        public Criteria andAfinerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AFineRate >=", value, "afinerate");
            return (Criteria) this;
        }

        public Criteria andAfinerateLessThan(BigDecimal value) {
            addCriterion("AFineRate <", value, "afinerate");
            return (Criteria) this;
        }

        public Criteria andAfinerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AFineRate <=", value, "afinerate");
            return (Criteria) this;
        }

        public Criteria andAfinerateIn(List<BigDecimal> values) {
            addCriterion("AFineRate in", values, "afinerate");
            return (Criteria) this;
        }

        public Criteria andAfinerateNotIn(List<BigDecimal> values) {
            addCriterion("AFineRate not in", values, "afinerate");
            return (Criteria) this;
        }

        public Criteria andAfinerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFineRate between", value1, value2, "afinerate");
            return (Criteria) this;
        }

        public Criteria andAfinerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFineRate not between", value1, value2, "afinerate");
            return (Criteria) this;
        }

        public Criteria andLenderinfoIsNull() {
            addCriterion("LenderInfo is null");
            return (Criteria) this;
        }

        public Criteria andLenderinfoIsNotNull() {
            addCriterion("LenderInfo is not null");
            return (Criteria) this;
        }

        public Criteria andLenderinfoEqualTo(String value) {
            addCriterion("LenderInfo =", value, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andLenderinfoNotEqualTo(String value) {
            addCriterion("LenderInfo <>", value, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andLenderinfoGreaterThan(String value) {
            addCriterion("LenderInfo >", value, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andLenderinfoGreaterThanOrEqualTo(String value) {
            addCriterion("LenderInfo >=", value, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andLenderinfoLessThan(String value) {
            addCriterion("LenderInfo <", value, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andLenderinfoLessThanOrEqualTo(String value) {
            addCriterion("LenderInfo <=", value, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andLenderinfoLike(String value) {
            addCriterion("LenderInfo like", value, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andLenderinfoNotLike(String value) {
            addCriterion("LenderInfo not like", value, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andLenderinfoIn(List<String> values) {
            addCriterion("LenderInfo in", values, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andLenderinfoNotIn(List<String> values) {
            addCriterion("LenderInfo not in", values, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andLenderinfoBetween(String value1, String value2) {
            addCriterion("LenderInfo between", value1, value2, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andLenderinfoNotBetween(String value1, String value2) {
            addCriterion("LenderInfo not between", value1, value2, "lenderinfo");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceIsNull() {
            addCriterion("overdueBalance is null");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceIsNotNull() {
            addCriterion("overdueBalance is not null");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceEqualTo(BigDecimal value) {
            addCriterion("overdueBalance =", value, "overduebalance");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceNotEqualTo(BigDecimal value) {
            addCriterion("overdueBalance <>", value, "overduebalance");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceGreaterThan(BigDecimal value) {
            addCriterion("overdueBalance >", value, "overduebalance");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueBalance >=", value, "overduebalance");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceLessThan(BigDecimal value) {
            addCriterion("overdueBalance <", value, "overduebalance");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueBalance <=", value, "overduebalance");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceIn(List<BigDecimal> values) {
            addCriterion("overdueBalance in", values, "overduebalance");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceNotIn(List<BigDecimal> values) {
            addCriterion("overdueBalance not in", values, "overduebalance");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueBalance between", value1, value2, "overduebalance");
            return (Criteria) this;
        }

        public Criteria andOverduebalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueBalance not between", value1, value2, "overduebalance");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusIsNull() {
            addCriterion("TermMonthStatus is null");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusIsNotNull() {
            addCriterion("TermMonthStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusEqualTo(String value) {
            addCriterion("TermMonthStatus =", value, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusNotEqualTo(String value) {
            addCriterion("TermMonthStatus <>", value, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusGreaterThan(String value) {
            addCriterion("TermMonthStatus >", value, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusGreaterThanOrEqualTo(String value) {
            addCriterion("TermMonthStatus >=", value, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusLessThan(String value) {
            addCriterion("TermMonthStatus <", value, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusLessThanOrEqualTo(String value) {
            addCriterion("TermMonthStatus <=", value, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusLike(String value) {
            addCriterion("TermMonthStatus like", value, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusNotLike(String value) {
            addCriterion("TermMonthStatus not like", value, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusIn(List<String> values) {
            addCriterion("TermMonthStatus in", values, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusNotIn(List<String> values) {
            addCriterion("TermMonthStatus not in", values, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusBetween(String value1, String value2) {
            addCriterion("TermMonthStatus between", value1, value2, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andTermmonthstatusNotBetween(String value1, String value2) {
            addCriterion("TermMonthStatus not between", value1, value2, "termmonthstatus");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalIsNull() {
            addCriterion("Residualprincipal is null");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalIsNotNull() {
            addCriterion("Residualprincipal is not null");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalEqualTo(BigDecimal value) {
            addCriterion("Residualprincipal =", value, "residualprincipal");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalNotEqualTo(BigDecimal value) {
            addCriterion("Residualprincipal <>", value, "residualprincipal");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalGreaterThan(BigDecimal value) {
            addCriterion("Residualprincipal >", value, "residualprincipal");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Residualprincipal >=", value, "residualprincipal");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalLessThan(BigDecimal value) {
            addCriterion("Residualprincipal <", value, "residualprincipal");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Residualprincipal <=", value, "residualprincipal");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalIn(List<BigDecimal> values) {
            addCriterion("Residualprincipal in", values, "residualprincipal");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalNotIn(List<BigDecimal> values) {
            addCriterion("Residualprincipal not in", values, "residualprincipal");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Residualprincipal between", value1, value2, "residualprincipal");
            return (Criteria) this;
        }

        public Criteria andResidualprincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Residualprincipal not between", value1, value2, "residualprincipal");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceIsNull() {
            addCriterion("AheadAllBalance is null");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceIsNotNull() {
            addCriterion("AheadAllBalance is not null");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceEqualTo(BigDecimal value) {
            addCriterion("AheadAllBalance =", value, "aheadallbalance");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceNotEqualTo(BigDecimal value) {
            addCriterion("AheadAllBalance <>", value, "aheadallbalance");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceGreaterThan(BigDecimal value) {
            addCriterion("AheadAllBalance >", value, "aheadallbalance");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AheadAllBalance >=", value, "aheadallbalance");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceLessThan(BigDecimal value) {
            addCriterion("AheadAllBalance <", value, "aheadallbalance");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AheadAllBalance <=", value, "aheadallbalance");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceIn(List<BigDecimal> values) {
            addCriterion("AheadAllBalance in", values, "aheadallbalance");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceNotIn(List<BigDecimal> values) {
            addCriterion("AheadAllBalance not in", values, "aheadallbalance");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AheadAllBalance between", value1, value2, "aheadallbalance");
            return (Criteria) this;
        }

        public Criteria andAheadallbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AheadAllBalance not between", value1, value2, "aheadallbalance");
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountIsNull() {
            addCriterion("totalfeeamount is null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountIsNotNull() {
            addCriterion("totalfeeamount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountEqualTo(BigDecimal value) {
            addCriterion("totalfeeamount =", value, "totalfeeamount");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountNotEqualTo(BigDecimal value) {
            addCriterion("totalfeeamount <>", value, "totalfeeamount");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountGreaterThan(BigDecimal value) {
            addCriterion("totalfeeamount >", value, "totalfeeamount");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalfeeamount >=", value, "totalfeeamount");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountLessThan(BigDecimal value) {
            addCriterion("totalfeeamount <", value, "totalfeeamount");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalfeeamount <=", value, "totalfeeamount");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountIn(List<BigDecimal> values) {
            addCriterion("totalfeeamount in", values, "totalfeeamount");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountNotIn(List<BigDecimal> values) {
            addCriterion("totalfeeamount not in", values, "totalfeeamount");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalfeeamount between", value1, value2, "totalfeeamount");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalfeeamount not between", value1, value2, "totalfeeamount");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1IsNull() {
            addCriterion("CurrentInterestAmt_1 is null");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1IsNotNull() {
            addCriterion("CurrentInterestAmt_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1EqualTo(BigDecimal value) {
            addCriterion("CurrentInterestAmt_1 =", value, "currentinterestamt1");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1NotEqualTo(BigDecimal value) {
            addCriterion("CurrentInterestAmt_1 <>", value, "currentinterestamt1");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1GreaterThan(BigDecimal value) {
            addCriterion("CurrentInterestAmt_1 >", value, "currentinterestamt1");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CurrentInterestAmt_1 >=", value, "currentinterestamt1");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1LessThan(BigDecimal value) {
            addCriterion("CurrentInterestAmt_1 <", value, "currentinterestamt1");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CurrentInterestAmt_1 <=", value, "currentinterestamt1");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1In(List<BigDecimal> values) {
            addCriterion("CurrentInterestAmt_1 in", values, "currentinterestamt1");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1NotIn(List<BigDecimal> values) {
            addCriterion("CurrentInterestAmt_1 not in", values, "currentinterestamt1");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CurrentInterestAmt_1 between", value1, value2, "currentinterestamt1");
            return (Criteria) this;
        }

        public Criteria andCurrentinterestamt1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CurrentInterestAmt_1 not between", value1, value2, "currentinterestamt1");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtIsNull() {
            addCriterion("NextInstalmentAmt is null");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtIsNotNull() {
            addCriterion("NextInstalmentAmt is not null");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtEqualTo(BigDecimal value) {
            addCriterion("NextInstalmentAmt =", value, "nextinstalmentamt");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtNotEqualTo(BigDecimal value) {
            addCriterion("NextInstalmentAmt <>", value, "nextinstalmentamt");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtGreaterThan(BigDecimal value) {
            addCriterion("NextInstalmentAmt >", value, "nextinstalmentamt");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NextInstalmentAmt >=", value, "nextinstalmentamt");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtLessThan(BigDecimal value) {
            addCriterion("NextInstalmentAmt <", value, "nextinstalmentamt");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NextInstalmentAmt <=", value, "nextinstalmentamt");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtIn(List<BigDecimal> values) {
            addCriterion("NextInstalmentAmt in", values, "nextinstalmentamt");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtNotIn(List<BigDecimal> values) {
            addCriterion("NextInstalmentAmt not in", values, "nextinstalmentamt");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NextInstalmentAmt between", value1, value2, "nextinstalmentamt");
            return (Criteria) this;
        }

        public Criteria andNextinstalmentamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NextInstalmentAmt not between", value1, value2, "nextinstalmentamt");
            return (Criteria) this;
        }

        public Criteria andNextduedateIsNull() {
            addCriterion("NextDueDate is null");
            return (Criteria) this;
        }

        public Criteria andNextduedateIsNotNull() {
            addCriterion("NextDueDate is not null");
            return (Criteria) this;
        }

        public Criteria andNextduedateEqualTo(String value) {
            addCriterion("NextDueDate =", value, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andNextduedateNotEqualTo(String value) {
            addCriterion("NextDueDate <>", value, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andNextduedateGreaterThan(String value) {
            addCriterion("NextDueDate >", value, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andNextduedateGreaterThanOrEqualTo(String value) {
            addCriterion("NextDueDate >=", value, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andNextduedateLessThan(String value) {
            addCriterion("NextDueDate <", value, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andNextduedateLessThanOrEqualTo(String value) {
            addCriterion("NextDueDate <=", value, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andNextduedateLike(String value) {
            addCriterion("NextDueDate like", value, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andNextduedateNotLike(String value) {
            addCriterion("NextDueDate not like", value, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andNextduedateIn(List<String> values) {
            addCriterion("NextDueDate in", values, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andNextduedateNotIn(List<String> values) {
            addCriterion("NextDueDate not in", values, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andNextduedateBetween(String value1, String value2) {
            addCriterion("NextDueDate between", value1, value2, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andNextduedateNotBetween(String value1, String value2) {
            addCriterion("NextDueDate not between", value1, value2, "nextduedate");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoIsNull() {
            addCriterion("CurrentPeriodNo is null");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoIsNotNull() {
            addCriterion("CurrentPeriodNo is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoEqualTo(Integer value) {
            addCriterion("CurrentPeriodNo =", value, "currentperiodno");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoNotEqualTo(Integer value) {
            addCriterion("CurrentPeriodNo <>", value, "currentperiodno");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoGreaterThan(Integer value) {
            addCriterion("CurrentPeriodNo >", value, "currentperiodno");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CurrentPeriodNo >=", value, "currentperiodno");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoLessThan(Integer value) {
            addCriterion("CurrentPeriodNo <", value, "currentperiodno");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoLessThanOrEqualTo(Integer value) {
            addCriterion("CurrentPeriodNo <=", value, "currentperiodno");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoIn(List<Integer> values) {
            addCriterion("CurrentPeriodNo in", values, "currentperiodno");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoNotIn(List<Integer> values) {
            addCriterion("CurrentPeriodNo not in", values, "currentperiodno");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoBetween(Integer value1, Integer value2) {
            addCriterion("CurrentPeriodNo between", value1, value2, "currentperiodno");
            return (Criteria) this;
        }

        public Criteria andCurrentperiodnoNotBetween(Integer value1, Integer value2) {
            addCriterion("CurrentPeriodNo not between", value1, value2, "currentperiodno");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayIsNull() {
            addCriterion("DefaultDueDay is null");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayIsNotNull() {
            addCriterion("DefaultDueDay is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayEqualTo(String value) {
            addCriterion("DefaultDueDay =", value, "defaultdueday");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayNotEqualTo(String value) {
            addCriterion("DefaultDueDay <>", value, "defaultdueday");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayGreaterThan(String value) {
            addCriterion("DefaultDueDay >", value, "defaultdueday");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayGreaterThanOrEqualTo(String value) {
            addCriterion("DefaultDueDay >=", value, "defaultdueday");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayLessThan(String value) {
            addCriterion("DefaultDueDay <", value, "defaultdueday");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayLessThanOrEqualTo(String value) {
            addCriterion("DefaultDueDay <=", value, "defaultdueday");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayLike(String value) {
            addCriterion("DefaultDueDay like", value, "defaultdueday");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayNotLike(String value) {
            addCriterion("DefaultDueDay not like", value, "defaultdueday");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayIn(List<String> values) {
            addCriterion("DefaultDueDay in", values, "defaultdueday");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayNotIn(List<String> values) {
            addCriterion("DefaultDueDay not in", values, "defaultdueday");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayBetween(String value1, String value2) {
            addCriterion("DefaultDueDay between", value1, value2, "defaultdueday");
            return (Criteria) this;
        }

        public Criteria andDefaultduedayNotBetween(String value1, String value2) {
            addCriterion("DefaultDueDay not between", value1, value2, "defaultdueday");
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

        public Criteria andRenewaltimesIsNull() {
            addCriterion("renewalTimes is null");
            return (Criteria) this;
        }

        public Criteria andRenewaltimesIsNotNull() {
            addCriterion("renewalTimes is not null");
            return (Criteria) this;
        }

        public Criteria andRenewaltimesEqualTo(Integer value) {
            addCriterion("renewalTimes =", value, "renewaltimes");
            return (Criteria) this;
        }

        public Criteria andRenewaltimesNotEqualTo(Integer value) {
            addCriterion("renewalTimes <>", value, "renewaltimes");
            return (Criteria) this;
        }

        public Criteria andRenewaltimesGreaterThan(Integer value) {
            addCriterion("renewalTimes >", value, "renewaltimes");
            return (Criteria) this;
        }

        public Criteria andRenewaltimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("renewalTimes >=", value, "renewaltimes");
            return (Criteria) this;
        }

        public Criteria andRenewaltimesLessThan(Integer value) {
            addCriterion("renewalTimes <", value, "renewaltimes");
            return (Criteria) this;
        }

        public Criteria andRenewaltimesLessThanOrEqualTo(Integer value) {
            addCriterion("renewalTimes <=", value, "renewaltimes");
            return (Criteria) this;
        }

        public Criteria andRenewaltimesIn(List<Integer> values) {
            addCriterion("renewalTimes in", values, "renewaltimes");
            return (Criteria) this;
        }

        public Criteria andRenewaltimesNotIn(List<Integer> values) {
            addCriterion("renewalTimes not in", values, "renewaltimes");
            return (Criteria) this;
        }

        public Criteria andRenewaltimesBetween(Integer value1, Integer value2) {
            addCriterion("renewalTimes between", value1, value2, "renewaltimes");
            return (Criteria) this;
        }

        public Criteria andRenewaltimesNotBetween(Integer value1, Integer value2) {
            addCriterion("renewalTimes not between", value1, value2, "renewaltimes");
            return (Criteria) this;
        }

        public Criteria andGranceperiodIsNull() {
            addCriterion("GrancePeriod is null");
            return (Criteria) this;
        }

        public Criteria andGranceperiodIsNotNull() {
            addCriterion("GrancePeriod is not null");
            return (Criteria) this;
        }

        public Criteria andGranceperiodEqualTo(Integer value) {
            addCriterion("GrancePeriod =", value, "granceperiod");
            return (Criteria) this;
        }

        public Criteria andGranceperiodNotEqualTo(Integer value) {
            addCriterion("GrancePeriod <>", value, "granceperiod");
            return (Criteria) this;
        }

        public Criteria andGranceperiodGreaterThan(Integer value) {
            addCriterion("GrancePeriod >", value, "granceperiod");
            return (Criteria) this;
        }

        public Criteria andGranceperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("GrancePeriod >=", value, "granceperiod");
            return (Criteria) this;
        }

        public Criteria andGranceperiodLessThan(Integer value) {
            addCriterion("GrancePeriod <", value, "granceperiod");
            return (Criteria) this;
        }

        public Criteria andGranceperiodLessThanOrEqualTo(Integer value) {
            addCriterion("GrancePeriod <=", value, "granceperiod");
            return (Criteria) this;
        }

        public Criteria andGranceperiodIn(List<Integer> values) {
            addCriterion("GrancePeriod in", values, "granceperiod");
            return (Criteria) this;
        }

        public Criteria andGranceperiodNotIn(List<Integer> values) {
            addCriterion("GrancePeriod not in", values, "granceperiod");
            return (Criteria) this;
        }

        public Criteria andGranceperiodBetween(Integer value1, Integer value2) {
            addCriterion("GrancePeriod between", value1, value2, "granceperiod");
            return (Criteria) this;
        }

        public Criteria andGranceperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("GrancePeriod not between", value1, value2, "granceperiod");
            return (Criteria) this;
        }

        public Criteria andAfinerate2IsNull() {
            addCriterion("AFineRate2 is null");
            return (Criteria) this;
        }

        public Criteria andAfinerate2IsNotNull() {
            addCriterion("AFineRate2 is not null");
            return (Criteria) this;
        }

        public Criteria andAfinerate2EqualTo(BigDecimal value) {
            addCriterion("AFineRate2 =", value, "afinerate2");
            return (Criteria) this;
        }

        public Criteria andAfinerate2NotEqualTo(BigDecimal value) {
            addCriterion("AFineRate2 <>", value, "afinerate2");
            return (Criteria) this;
        }

        public Criteria andAfinerate2GreaterThan(BigDecimal value) {
            addCriterion("AFineRate2 >", value, "afinerate2");
            return (Criteria) this;
        }

        public Criteria andAfinerate2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AFineRate2 >=", value, "afinerate2");
            return (Criteria) this;
        }

        public Criteria andAfinerate2LessThan(BigDecimal value) {
            addCriterion("AFineRate2 <", value, "afinerate2");
            return (Criteria) this;
        }

        public Criteria andAfinerate2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AFineRate2 <=", value, "afinerate2");
            return (Criteria) this;
        }

        public Criteria andAfinerate2In(List<BigDecimal> values) {
            addCriterion("AFineRate2 in", values, "afinerate2");
            return (Criteria) this;
        }

        public Criteria andAfinerate2NotIn(List<BigDecimal> values) {
            addCriterion("AFineRate2 not in", values, "afinerate2");
            return (Criteria) this;
        }

        public Criteria andAfinerate2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFineRate2 between", value1, value2, "afinerate2");
            return (Criteria) this;
        }

        public Criteria andAfinerate2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFineRate2 not between", value1, value2, "afinerate2");
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

        public Criteria andSuspendIsNull() {
            addCriterion("suspend is null");
            return (Criteria) this;
        }

        public Criteria andSuspendIsNotNull() {
            addCriterion("suspend is not null");
            return (Criteria) this;
        }

        public Criteria andSuspendEqualTo(Byte value) {
            addCriterion("suspend =", value, "suspend");
            return (Criteria) this;
        }

        public Criteria andSuspendNotEqualTo(Byte value) {
            addCriterion("suspend <>", value, "suspend");
            return (Criteria) this;
        }

        public Criteria andSuspendGreaterThan(Byte value) {
            addCriterion("suspend >", value, "suspend");
            return (Criteria) this;
        }

        public Criteria andSuspendGreaterThanOrEqualTo(Byte value) {
            addCriterion("suspend >=", value, "suspend");
            return (Criteria) this;
        }

        public Criteria andSuspendLessThan(Byte value) {
            addCriterion("suspend <", value, "suspend");
            return (Criteria) this;
        }

        public Criteria andSuspendLessThanOrEqualTo(Byte value) {
            addCriterion("suspend <=", value, "suspend");
            return (Criteria) this;
        }

        public Criteria andSuspendIn(List<Byte> values) {
            addCriterion("suspend in", values, "suspend");
            return (Criteria) this;
        }

        public Criteria andSuspendNotIn(List<Byte> values) {
            addCriterion("suspend not in", values, "suspend");
            return (Criteria) this;
        }

        public Criteria andSuspendBetween(Byte value1, Byte value2) {
            addCriterion("suspend between", value1, value2, "suspend");
            return (Criteria) this;
        }

        public Criteria andSuspendNotBetween(Byte value1, Byte value2) {
            addCriterion("suspend not between", value1, value2, "suspend");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateIsNull() {
            addCriterion("WITHDRAWSTATE is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateIsNotNull() {
            addCriterion("WITHDRAWSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateEqualTo(String value) {
            addCriterion("WITHDRAWSTATE =", value, "withdrawstate");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateNotEqualTo(String value) {
            addCriterion("WITHDRAWSTATE <>", value, "withdrawstate");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateGreaterThan(String value) {
            addCriterion("WITHDRAWSTATE >", value, "withdrawstate");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateGreaterThanOrEqualTo(String value) {
            addCriterion("WITHDRAWSTATE >=", value, "withdrawstate");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateLessThan(String value) {
            addCriterion("WITHDRAWSTATE <", value, "withdrawstate");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateLessThanOrEqualTo(String value) {
            addCriterion("WITHDRAWSTATE <=", value, "withdrawstate");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateLike(String value) {
            addCriterion("WITHDRAWSTATE like", value, "withdrawstate");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateNotLike(String value) {
            addCriterion("WITHDRAWSTATE not like", value, "withdrawstate");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateIn(List<String> values) {
            addCriterion("WITHDRAWSTATE in", values, "withdrawstate");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateNotIn(List<String> values) {
            addCriterion("WITHDRAWSTATE not in", values, "withdrawstate");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateBetween(String value1, String value2) {
            addCriterion("WITHDRAWSTATE between", value1, value2, "withdrawstate");
            return (Criteria) this;
        }

        public Criteria andWithdrawstateNotBetween(String value1, String value2) {
            addCriterion("WITHDRAWSTATE not between", value1, value2, "withdrawstate");
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

        public Criteria andFollowerIsNull() {
            addCriterion("follower is null");
            return (Criteria) this;
        }

        public Criteria andFollowerIsNotNull() {
            addCriterion("follower is not null");
            return (Criteria) this;
        }

        public Criteria andFollowerEqualTo(String value) {
            addCriterion("follower =", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotEqualTo(String value) {
            addCriterion("follower <>", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerGreaterThan(String value) {
            addCriterion("follower >", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerGreaterThanOrEqualTo(String value) {
            addCriterion("follower >=", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerLessThan(String value) {
            addCriterion("follower <", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerLessThanOrEqualTo(String value) {
            addCriterion("follower <=", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerLike(String value) {
            addCriterion("follower like", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotLike(String value) {
            addCriterion("follower not like", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerIn(List<String> values) {
            addCriterion("follower in", values, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotIn(List<String> values) {
            addCriterion("follower not in", values, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerBetween(String value1, String value2) {
            addCriterion("follower between", value1, value2, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotBetween(String value1, String value2) {
            addCriterion("follower not between", value1, value2, "follower");
            return (Criteria) this;
        }

        public Criteria andOrderchannelIsNull() {
            addCriterion("orderChannel is null");
            return (Criteria) this;
        }

        public Criteria andOrderchannelIsNotNull() {
            addCriterion("orderChannel is not null");
            return (Criteria) this;
        }

        public Criteria andOrderchannelEqualTo(String value) {
            addCriterion("orderChannel =", value, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andOrderchannelNotEqualTo(String value) {
            addCriterion("orderChannel <>", value, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andOrderchannelGreaterThan(String value) {
            addCriterion("orderChannel >", value, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andOrderchannelGreaterThanOrEqualTo(String value) {
            addCriterion("orderChannel >=", value, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andOrderchannelLessThan(String value) {
            addCriterion("orderChannel <", value, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andOrderchannelLessThanOrEqualTo(String value) {
            addCriterion("orderChannel <=", value, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andOrderchannelLike(String value) {
            addCriterion("orderChannel like", value, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andOrderchannelNotLike(String value) {
            addCriterion("orderChannel not like", value, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andOrderchannelIn(List<String> values) {
            addCriterion("orderChannel in", values, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andOrderchannelNotIn(List<String> values) {
            addCriterion("orderChannel not in", values, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andOrderchannelBetween(String value1, String value2) {
            addCriterion("orderChannel between", value1, value2, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andOrderchannelNotBetween(String value1, String value2) {
            addCriterion("orderChannel not between", value1, value2, "orderchannel");
            return (Criteria) this;
        }

        public Criteria andExternalordernoIsNull() {
            addCriterion("externalOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andExternalordernoIsNotNull() {
            addCriterion("externalOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andExternalordernoEqualTo(String value) {
            addCriterion("externalOrderNo =", value, "externalorderno");
            return (Criteria) this;
        }

        public Criteria andExternalordernoNotEqualTo(String value) {
            addCriterion("externalOrderNo <>", value, "externalorderno");
            return (Criteria) this;
        }

        public Criteria andExternalordernoGreaterThan(String value) {
            addCriterion("externalOrderNo >", value, "externalorderno");
            return (Criteria) this;
        }

        public Criteria andExternalordernoGreaterThanOrEqualTo(String value) {
            addCriterion("externalOrderNo >=", value, "externalorderno");
            return (Criteria) this;
        }

        public Criteria andExternalordernoLessThan(String value) {
            addCriterion("externalOrderNo <", value, "externalorderno");
            return (Criteria) this;
        }

        public Criteria andExternalordernoLessThanOrEqualTo(String value) {
            addCriterion("externalOrderNo <=", value, "externalorderno");
            return (Criteria) this;
        }

        public Criteria andExternalordernoLike(String value) {
            addCriterion("externalOrderNo like", value, "externalorderno");
            return (Criteria) this;
        }

        public Criteria andExternalordernoNotLike(String value) {
            addCriterion("externalOrderNo not like", value, "externalorderno");
            return (Criteria) this;
        }

        public Criteria andExternalordernoIn(List<String> values) {
            addCriterion("externalOrderNo in", values, "externalorderno");
            return (Criteria) this;
        }

        public Criteria andExternalordernoNotIn(List<String> values) {
            addCriterion("externalOrderNo not in", values, "externalorderno");
            return (Criteria) this;
        }

        public Criteria andExternalordernoBetween(String value1, String value2) {
            addCriterion("externalOrderNo between", value1, value2, "externalorderno");
            return (Criteria) this;
        }

        public Criteria andExternalordernoNotBetween(String value1, String value2) {
            addCriterion("externalOrderNo not between", value1, value2, "externalorderno");
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