package com.sixku.mysql2kafka.dao.als7db.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class IndInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public IndInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andFullnameIsNull() {
            addCriterion("FULLNAME is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("FULLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("FULLNAME =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("FULLNAME <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("FULLNAME >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("FULLNAME >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("FULLNAME <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("FULLNAME <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("FULLNAME like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("FULLNAME not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("FULLNAME in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("FULLNAME not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("FULLNAME between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("FULLNAME not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCerttypeIsNull() {
            addCriterion("CERTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCerttypeIsNotNull() {
            addCriterion("CERTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCerttypeEqualTo(String value) {
            addCriterion("CERTTYPE =", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotEqualTo(String value) {
            addCriterion("CERTTYPE <>", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeGreaterThan(String value) {
            addCriterion("CERTTYPE >", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTTYPE >=", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeLessThan(String value) {
            addCriterion("CERTTYPE <", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeLessThanOrEqualTo(String value) {
            addCriterion("CERTTYPE <=", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeLike(String value) {
            addCriterion("CERTTYPE like", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotLike(String value) {
            addCriterion("CERTTYPE not like", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeIn(List<String> values) {
            addCriterion("CERTTYPE in", values, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotIn(List<String> values) {
            addCriterion("CERTTYPE not in", values, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeBetween(String value1, String value2) {
            addCriterion("CERTTYPE between", value1, value2, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotBetween(String value1, String value2) {
            addCriterion("CERTTYPE not between", value1, value2, "certtype");
            return (Criteria) this;
        }

        public Criteria andCertidIsNull() {
            addCriterion("CERTID is null");
            return (Criteria) this;
        }

        public Criteria andCertidIsNotNull() {
            addCriterion("CERTID is not null");
            return (Criteria) this;
        }

        public Criteria andCertidEqualTo(String value) {
            addCriterion("CERTID =", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotEqualTo(String value) {
            addCriterion("CERTID <>", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidGreaterThan(String value) {
            addCriterion("CERTID >", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidGreaterThanOrEqualTo(String value) {
            addCriterion("CERTID >=", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLessThan(String value) {
            addCriterion("CERTID <", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLessThanOrEqualTo(String value) {
            addCriterion("CERTID <=", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidLike(String value) {
            addCriterion("CERTID like", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotLike(String value) {
            addCriterion("CERTID not like", value, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidIn(List<String> values) {
            addCriterion("CERTID in", values, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotIn(List<String> values) {
            addCriterion("CERTID not in", values, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidBetween(String value1, String value2) {
            addCriterion("CERTID between", value1, value2, "certid");
            return (Criteria) this;
        }

        public Criteria andCertidNotBetween(String value1, String value2) {
            addCriterion("CERTID not between", value1, value2, "certid");
            return (Criteria) this;
        }

        public Criteria andSinoIsNull() {
            addCriterion("SINO is null");
            return (Criteria) this;
        }

        public Criteria andSinoIsNotNull() {
            addCriterion("SINO is not null");
            return (Criteria) this;
        }

        public Criteria andSinoEqualTo(String value) {
            addCriterion("SINO =", value, "sino");
            return (Criteria) this;
        }

        public Criteria andSinoNotEqualTo(String value) {
            addCriterion("SINO <>", value, "sino");
            return (Criteria) this;
        }

        public Criteria andSinoGreaterThan(String value) {
            addCriterion("SINO >", value, "sino");
            return (Criteria) this;
        }

        public Criteria andSinoGreaterThanOrEqualTo(String value) {
            addCriterion("SINO >=", value, "sino");
            return (Criteria) this;
        }

        public Criteria andSinoLessThan(String value) {
            addCriterion("SINO <", value, "sino");
            return (Criteria) this;
        }

        public Criteria andSinoLessThanOrEqualTo(String value) {
            addCriterion("SINO <=", value, "sino");
            return (Criteria) this;
        }

        public Criteria andSinoLike(String value) {
            addCriterion("SINO like", value, "sino");
            return (Criteria) this;
        }

        public Criteria andSinoNotLike(String value) {
            addCriterion("SINO not like", value, "sino");
            return (Criteria) this;
        }

        public Criteria andSinoIn(List<String> values) {
            addCriterion("SINO in", values, "sino");
            return (Criteria) this;
        }

        public Criteria andSinoNotIn(List<String> values) {
            addCriterion("SINO not in", values, "sino");
            return (Criteria) this;
        }

        public Criteria andSinoBetween(String value1, String value2) {
            addCriterion("SINO between", value1, value2, "sino");
            return (Criteria) this;
        }

        public Criteria andSinoNotBetween(String value1, String value2) {
            addCriterion("SINO not between", value1, value2, "sino");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("NATIONALITY is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("NATIONALITY is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("NATIONALITY =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("NATIONALITY <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("NATIONALITY >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONALITY >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("NATIONALITY <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("NATIONALITY <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("NATIONALITY like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("NATIONALITY not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("NATIONALITY in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("NATIONALITY not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("NATIONALITY between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("NATIONALITY not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("NATIVEPLACE is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("NATIVEPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("NATIVEPLACE =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("NATIVEPLACE <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("NATIVEPLACE >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("NATIVEPLACE >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("NATIVEPLACE <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("NATIVEPLACE <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("NATIVEPLACE like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("NATIVEPLACE not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("NATIVEPLACE in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("NATIVEPLACE not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("NATIVEPLACE between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("NATIVEPLACE not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceIsNull() {
            addCriterion("POLITICALFACE is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceIsNotNull() {
            addCriterion("POLITICALFACE is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceEqualTo(String value) {
            addCriterion("POLITICALFACE =", value, "politicalface");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceNotEqualTo(String value) {
            addCriterion("POLITICALFACE <>", value, "politicalface");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceGreaterThan(String value) {
            addCriterion("POLITICALFACE >", value, "politicalface");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICALFACE >=", value, "politicalface");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceLessThan(String value) {
            addCriterion("POLITICALFACE <", value, "politicalface");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceLessThanOrEqualTo(String value) {
            addCriterion("POLITICALFACE <=", value, "politicalface");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceLike(String value) {
            addCriterion("POLITICALFACE like", value, "politicalface");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceNotLike(String value) {
            addCriterion("POLITICALFACE not like", value, "politicalface");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceIn(List<String> values) {
            addCriterion("POLITICALFACE in", values, "politicalface");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceNotIn(List<String> values) {
            addCriterion("POLITICALFACE not in", values, "politicalface");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceBetween(String value1, String value2) {
            addCriterion("POLITICALFACE between", value1, value2, "politicalface");
            return (Criteria) this;
        }

        public Criteria andPoliticalfaceNotBetween(String value1, String value2) {
            addCriterion("POLITICALFACE not between", value1, value2, "politicalface");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("MARRIAGE is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("MARRIAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(String value) {
            addCriterion("MARRIAGE =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(String value) {
            addCriterion("MARRIAGE <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(String value) {
            addCriterion("MARRIAGE >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("MARRIAGE >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(String value) {
            addCriterion("MARRIAGE <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(String value) {
            addCriterion("MARRIAGE <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLike(String value) {
            addCriterion("MARRIAGE like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotLike(String value) {
            addCriterion("MARRIAGE not like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<String> values) {
            addCriterion("MARRIAGE in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<String> values) {
            addCriterion("MARRIAGE not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(String value1, String value2) {
            addCriterion("MARRIAGE between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(String value1, String value2) {
            addCriterion("MARRIAGE not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andRelativetypeIsNull() {
            addCriterion("RELATIVETYPE is null");
            return (Criteria) this;
        }

        public Criteria andRelativetypeIsNotNull() {
            addCriterion("RELATIVETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRelativetypeEqualTo(String value) {
            addCriterion("RELATIVETYPE =", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeNotEqualTo(String value) {
            addCriterion("RELATIVETYPE <>", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeGreaterThan(String value) {
            addCriterion("RELATIVETYPE >", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeGreaterThanOrEqualTo(String value) {
            addCriterion("RELATIVETYPE >=", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeLessThan(String value) {
            addCriterion("RELATIVETYPE <", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeLessThanOrEqualTo(String value) {
            addCriterion("RELATIVETYPE <=", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeLike(String value) {
            addCriterion("RELATIVETYPE like", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeNotLike(String value) {
            addCriterion("RELATIVETYPE not like", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeIn(List<String> values) {
            addCriterion("RELATIVETYPE in", values, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeNotIn(List<String> values) {
            addCriterion("RELATIVETYPE not in", values, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeBetween(String value1, String value2) {
            addCriterion("RELATIVETYPE between", value1, value2, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeNotBetween(String value1, String value2) {
            addCriterion("RELATIVETYPE not between", value1, value2, "relativetype");
            return (Criteria) this;
        }

        public Criteria andFamilyaddIsNull() {
            addCriterion("FAMILYADD is null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddIsNotNull() {
            addCriterion("FAMILYADD is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddEqualTo(String value) {
            addCriterion("FAMILYADD =", value, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyaddNotEqualTo(String value) {
            addCriterion("FAMILYADD <>", value, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyaddGreaterThan(String value) {
            addCriterion("FAMILYADD >", value, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyaddGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYADD >=", value, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyaddLessThan(String value) {
            addCriterion("FAMILYADD <", value, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyaddLessThanOrEqualTo(String value) {
            addCriterion("FAMILYADD <=", value, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyaddLike(String value) {
            addCriterion("FAMILYADD like", value, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyaddNotLike(String value) {
            addCriterion("FAMILYADD not like", value, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyaddIn(List<String> values) {
            addCriterion("FAMILYADD in", values, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyaddNotIn(List<String> values) {
            addCriterion("FAMILYADD not in", values, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyaddBetween(String value1, String value2) {
            addCriterion("FAMILYADD between", value1, value2, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyaddNotBetween(String value1, String value2) {
            addCriterion("FAMILYADD not between", value1, value2, "familyadd");
            return (Criteria) this;
        }

        public Criteria andFamilyzipIsNull() {
            addCriterion("FAMILYZIP is null");
            return (Criteria) this;
        }

        public Criteria andFamilyzipIsNotNull() {
            addCriterion("FAMILYZIP is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyzipEqualTo(String value) {
            addCriterion("FAMILYZIP =", value, "familyzip");
            return (Criteria) this;
        }

        public Criteria andFamilyzipNotEqualTo(String value) {
            addCriterion("FAMILYZIP <>", value, "familyzip");
            return (Criteria) this;
        }

        public Criteria andFamilyzipGreaterThan(String value) {
            addCriterion("FAMILYZIP >", value, "familyzip");
            return (Criteria) this;
        }

        public Criteria andFamilyzipGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYZIP >=", value, "familyzip");
            return (Criteria) this;
        }

        public Criteria andFamilyzipLessThan(String value) {
            addCriterion("FAMILYZIP <", value, "familyzip");
            return (Criteria) this;
        }

        public Criteria andFamilyzipLessThanOrEqualTo(String value) {
            addCriterion("FAMILYZIP <=", value, "familyzip");
            return (Criteria) this;
        }

        public Criteria andFamilyzipLike(String value) {
            addCriterion("FAMILYZIP like", value, "familyzip");
            return (Criteria) this;
        }

        public Criteria andFamilyzipNotLike(String value) {
            addCriterion("FAMILYZIP not like", value, "familyzip");
            return (Criteria) this;
        }

        public Criteria andFamilyzipIn(List<String> values) {
            addCriterion("FAMILYZIP in", values, "familyzip");
            return (Criteria) this;
        }

        public Criteria andFamilyzipNotIn(List<String> values) {
            addCriterion("FAMILYZIP not in", values, "familyzip");
            return (Criteria) this;
        }

        public Criteria andFamilyzipBetween(String value1, String value2) {
            addCriterion("FAMILYZIP between", value1, value2, "familyzip");
            return (Criteria) this;
        }

        public Criteria andFamilyzipNotBetween(String value1, String value2) {
            addCriterion("FAMILYZIP not between", value1, value2, "familyzip");
            return (Criteria) this;
        }

        public Criteria andEmailaddIsNull() {
            addCriterion("EMAILADD is null");
            return (Criteria) this;
        }

        public Criteria andEmailaddIsNotNull() {
            addCriterion("EMAILADD is not null");
            return (Criteria) this;
        }

        public Criteria andEmailaddEqualTo(String value) {
            addCriterion("EMAILADD =", value, "emailadd");
            return (Criteria) this;
        }

        public Criteria andEmailaddNotEqualTo(String value) {
            addCriterion("EMAILADD <>", value, "emailadd");
            return (Criteria) this;
        }

        public Criteria andEmailaddGreaterThan(String value) {
            addCriterion("EMAILADD >", value, "emailadd");
            return (Criteria) this;
        }

        public Criteria andEmailaddGreaterThanOrEqualTo(String value) {
            addCriterion("EMAILADD >=", value, "emailadd");
            return (Criteria) this;
        }

        public Criteria andEmailaddLessThan(String value) {
            addCriterion("EMAILADD <", value, "emailadd");
            return (Criteria) this;
        }

        public Criteria andEmailaddLessThanOrEqualTo(String value) {
            addCriterion("EMAILADD <=", value, "emailadd");
            return (Criteria) this;
        }

        public Criteria andEmailaddLike(String value) {
            addCriterion("EMAILADD like", value, "emailadd");
            return (Criteria) this;
        }

        public Criteria andEmailaddNotLike(String value) {
            addCriterion("EMAILADD not like", value, "emailadd");
            return (Criteria) this;
        }

        public Criteria andEmailaddIn(List<String> values) {
            addCriterion("EMAILADD in", values, "emailadd");
            return (Criteria) this;
        }

        public Criteria andEmailaddNotIn(List<String> values) {
            addCriterion("EMAILADD not in", values, "emailadd");
            return (Criteria) this;
        }

        public Criteria andEmailaddBetween(String value1, String value2) {
            addCriterion("EMAILADD between", value1, value2, "emailadd");
            return (Criteria) this;
        }

        public Criteria andEmailaddNotBetween(String value1, String value2) {
            addCriterion("EMAILADD not between", value1, value2, "emailadd");
            return (Criteria) this;
        }

        public Criteria andFamilytelIsNull() {
            addCriterion("FAMILYTEL is null");
            return (Criteria) this;
        }

        public Criteria andFamilytelIsNotNull() {
            addCriterion("FAMILYTEL is not null");
            return (Criteria) this;
        }

        public Criteria andFamilytelEqualTo(String value) {
            addCriterion("FAMILYTEL =", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelNotEqualTo(String value) {
            addCriterion("FAMILYTEL <>", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelGreaterThan(String value) {
            addCriterion("FAMILYTEL >", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYTEL >=", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelLessThan(String value) {
            addCriterion("FAMILYTEL <", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelLessThanOrEqualTo(String value) {
            addCriterion("FAMILYTEL <=", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelLike(String value) {
            addCriterion("FAMILYTEL like", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelNotLike(String value) {
            addCriterion("FAMILYTEL not like", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelIn(List<String> values) {
            addCriterion("FAMILYTEL in", values, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelNotIn(List<String> values) {
            addCriterion("FAMILYTEL not in", values, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelBetween(String value1, String value2) {
            addCriterion("FAMILYTEL between", value1, value2, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelNotBetween(String value1, String value2) {
            addCriterion("FAMILYTEL not between", value1, value2, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytel1IsNull() {
            addCriterion("FAMILYTEL1 is null");
            return (Criteria) this;
        }

        public Criteria andFamilytel1IsNotNull() {
            addCriterion("FAMILYTEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andFamilytel1EqualTo(String value) {
            addCriterion("FAMILYTEL1 =", value, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel1NotEqualTo(String value) {
            addCriterion("FAMILYTEL1 <>", value, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel1GreaterThan(String value) {
            addCriterion("FAMILYTEL1 >", value, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel1GreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYTEL1 >=", value, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel1LessThan(String value) {
            addCriterion("FAMILYTEL1 <", value, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel1LessThanOrEqualTo(String value) {
            addCriterion("FAMILYTEL1 <=", value, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel1Like(String value) {
            addCriterion("FAMILYTEL1 like", value, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel1NotLike(String value) {
            addCriterion("FAMILYTEL1 not like", value, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel1In(List<String> values) {
            addCriterion("FAMILYTEL1 in", values, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel1NotIn(List<String> values) {
            addCriterion("FAMILYTEL1 not in", values, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel1Between(String value1, String value2) {
            addCriterion("FAMILYTEL1 between", value1, value2, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel1NotBetween(String value1, String value2) {
            addCriterion("FAMILYTEL1 not between", value1, value2, "familytel1");
            return (Criteria) this;
        }

        public Criteria andFamilytel2IsNull() {
            addCriterion("FAMILYTEL2 is null");
            return (Criteria) this;
        }

        public Criteria andFamilytel2IsNotNull() {
            addCriterion("FAMILYTEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andFamilytel2EqualTo(String value) {
            addCriterion("FAMILYTEL2 =", value, "familytel2");
            return (Criteria) this;
        }

        public Criteria andFamilytel2NotEqualTo(String value) {
            addCriterion("FAMILYTEL2 <>", value, "familytel2");
            return (Criteria) this;
        }

        public Criteria andFamilytel2GreaterThan(String value) {
            addCriterion("FAMILYTEL2 >", value, "familytel2");
            return (Criteria) this;
        }

        public Criteria andFamilytel2GreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYTEL2 >=", value, "familytel2");
            return (Criteria) this;
        }

        public Criteria andFamilytel2LessThan(String value) {
            addCriterion("FAMILYTEL2 <", value, "familytel2");
            return (Criteria) this;
        }

        public Criteria andFamilytel2LessThanOrEqualTo(String value) {
            addCriterion("FAMILYTEL2 <=", value, "familytel2");
            return (Criteria) this;
        }

        public Criteria andFamilytel2Like(String value) {
            addCriterion("FAMILYTEL2 like", value, "familytel2");
            return (Criteria) this;
        }

        public Criteria andFamilytel2NotLike(String value) {
            addCriterion("FAMILYTEL2 not like", value, "familytel2");
            return (Criteria) this;
        }

        public Criteria andFamilytel2In(List<String> values) {
            addCriterion("FAMILYTEL2 in", values, "familytel2");
            return (Criteria) this;
        }

        public Criteria andFamilytel2NotIn(List<String> values) {
            addCriterion("FAMILYTEL2 not in", values, "familytel2");
            return (Criteria) this;
        }

        public Criteria andFamilytel2Between(String value1, String value2) {
            addCriterion("FAMILYTEL2 between", value1, value2, "familytel2");
            return (Criteria) this;
        }

        public Criteria andFamilytel2NotBetween(String value1, String value2) {
            addCriterion("FAMILYTEL2 not between", value1, value2, "familytel2");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNull() {
            addCriterion("PHONE1 is null");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNotNull() {
            addCriterion("PHONE1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone1EqualTo(String value) {
            addCriterion("PHONE1 =", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotEqualTo(String value) {
            addCriterion("PHONE1 <>", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThan(String value) {
            addCriterion("PHONE1 >", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("PHONE1 >=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThan(String value) {
            addCriterion("PHONE1 <", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThanOrEqualTo(String value) {
            addCriterion("PHONE1 <=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Like(String value) {
            addCriterion("PHONE1 like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotLike(String value) {
            addCriterion("PHONE1 not like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1In(List<String> values) {
            addCriterion("PHONE1 in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotIn(List<String> values) {
            addCriterion("PHONE1 not in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Between(String value1, String value2) {
            addCriterion("PHONE1 between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotBetween(String value1, String value2) {
            addCriterion("PHONE1 not between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNull() {
            addCriterion("PHONE2 is null");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNotNull() {
            addCriterion("PHONE2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone2EqualTo(String value) {
            addCriterion("PHONE2 =", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotEqualTo(String value) {
            addCriterion("PHONE2 <>", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThan(String value) {
            addCriterion("PHONE2 >", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("PHONE2 >=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThan(String value) {
            addCriterion("PHONE2 <", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThanOrEqualTo(String value) {
            addCriterion("PHONE2 <=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Like(String value) {
            addCriterion("PHONE2 like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotLike(String value) {
            addCriterion("PHONE2 not like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2In(List<String> values) {
            addCriterion("PHONE2 in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotIn(List<String> values) {
            addCriterion("PHONE2 not in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Between(String value1, String value2) {
            addCriterion("PHONE2 between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotBetween(String value1, String value2) {
            addCriterion("PHONE2 not between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andUnitkindIsNull() {
            addCriterion("UNITKIND is null");
            return (Criteria) this;
        }

        public Criteria andUnitkindIsNotNull() {
            addCriterion("UNITKIND is not null");
            return (Criteria) this;
        }

        public Criteria andUnitkindEqualTo(String value) {
            addCriterion("UNITKIND =", value, "unitkind");
            return (Criteria) this;
        }

        public Criteria andUnitkindNotEqualTo(String value) {
            addCriterion("UNITKIND <>", value, "unitkind");
            return (Criteria) this;
        }

        public Criteria andUnitkindGreaterThan(String value) {
            addCriterion("UNITKIND >", value, "unitkind");
            return (Criteria) this;
        }

        public Criteria andUnitkindGreaterThanOrEqualTo(String value) {
            addCriterion("UNITKIND >=", value, "unitkind");
            return (Criteria) this;
        }

        public Criteria andUnitkindLessThan(String value) {
            addCriterion("UNITKIND <", value, "unitkind");
            return (Criteria) this;
        }

        public Criteria andUnitkindLessThanOrEqualTo(String value) {
            addCriterion("UNITKIND <=", value, "unitkind");
            return (Criteria) this;
        }

        public Criteria andUnitkindLike(String value) {
            addCriterion("UNITKIND like", value, "unitkind");
            return (Criteria) this;
        }

        public Criteria andUnitkindNotLike(String value) {
            addCriterion("UNITKIND not like", value, "unitkind");
            return (Criteria) this;
        }

        public Criteria andUnitkindIn(List<String> values) {
            addCriterion("UNITKIND in", values, "unitkind");
            return (Criteria) this;
        }

        public Criteria andUnitkindNotIn(List<String> values) {
            addCriterion("UNITKIND not in", values, "unitkind");
            return (Criteria) this;
        }

        public Criteria andUnitkindBetween(String value1, String value2) {
            addCriterion("UNITKIND between", value1, value2, "unitkind");
            return (Criteria) this;
        }

        public Criteria andUnitkindNotBetween(String value1, String value2) {
            addCriterion("UNITKIND not between", value1, value2, "unitkind");
            return (Criteria) this;
        }

        public Criteria andWorkcorpIsNull() {
            addCriterion("WORKCORP is null");
            return (Criteria) this;
        }

        public Criteria andWorkcorpIsNotNull() {
            addCriterion("WORKCORP is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcorpEqualTo(String value) {
            addCriterion("WORKCORP =", value, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkcorpNotEqualTo(String value) {
            addCriterion("WORKCORP <>", value, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkcorpGreaterThan(String value) {
            addCriterion("WORKCORP >", value, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkcorpGreaterThanOrEqualTo(String value) {
            addCriterion("WORKCORP >=", value, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkcorpLessThan(String value) {
            addCriterion("WORKCORP <", value, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkcorpLessThanOrEqualTo(String value) {
            addCriterion("WORKCORP <=", value, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkcorpLike(String value) {
            addCriterion("WORKCORP like", value, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkcorpNotLike(String value) {
            addCriterion("WORKCORP not like", value, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkcorpIn(List<String> values) {
            addCriterion("WORKCORP in", values, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkcorpNotIn(List<String> values) {
            addCriterion("WORKCORP not in", values, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkcorpBetween(String value1, String value2) {
            addCriterion("WORKCORP between", value1, value2, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkcorpNotBetween(String value1, String value2) {
            addCriterion("WORKCORP not between", value1, value2, "workcorp");
            return (Criteria) this;
        }

        public Criteria andWorkaddIsNull() {
            addCriterion("WORKADD is null");
            return (Criteria) this;
        }

        public Criteria andWorkaddIsNotNull() {
            addCriterion("WORKADD is not null");
            return (Criteria) this;
        }

        public Criteria andWorkaddEqualTo(String value) {
            addCriterion("WORKADD =", value, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorkaddNotEqualTo(String value) {
            addCriterion("WORKADD <>", value, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorkaddGreaterThan(String value) {
            addCriterion("WORKADD >", value, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorkaddGreaterThanOrEqualTo(String value) {
            addCriterion("WORKADD >=", value, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorkaddLessThan(String value) {
            addCriterion("WORKADD <", value, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorkaddLessThanOrEqualTo(String value) {
            addCriterion("WORKADD <=", value, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorkaddLike(String value) {
            addCriterion("WORKADD like", value, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorkaddNotLike(String value) {
            addCriterion("WORKADD not like", value, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorkaddIn(List<String> values) {
            addCriterion("WORKADD in", values, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorkaddNotIn(List<String> values) {
            addCriterion("WORKADD not in", values, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorkaddBetween(String value1, String value2) {
            addCriterion("WORKADD between", value1, value2, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorkaddNotBetween(String value1, String value2) {
            addCriterion("WORKADD not between", value1, value2, "workadd");
            return (Criteria) this;
        }

        public Criteria andWorktelIsNull() {
            addCriterion("WORKTEL is null");
            return (Criteria) this;
        }

        public Criteria andWorktelIsNotNull() {
            addCriterion("WORKTEL is not null");
            return (Criteria) this;
        }

        public Criteria andWorktelEqualTo(String value) {
            addCriterion("WORKTEL =", value, "worktel");
            return (Criteria) this;
        }

        public Criteria andWorktelNotEqualTo(String value) {
            addCriterion("WORKTEL <>", value, "worktel");
            return (Criteria) this;
        }

        public Criteria andWorktelGreaterThan(String value) {
            addCriterion("WORKTEL >", value, "worktel");
            return (Criteria) this;
        }

        public Criteria andWorktelGreaterThanOrEqualTo(String value) {
            addCriterion("WORKTEL >=", value, "worktel");
            return (Criteria) this;
        }

        public Criteria andWorktelLessThan(String value) {
            addCriterion("WORKTEL <", value, "worktel");
            return (Criteria) this;
        }

        public Criteria andWorktelLessThanOrEqualTo(String value) {
            addCriterion("WORKTEL <=", value, "worktel");
            return (Criteria) this;
        }

        public Criteria andWorktelLike(String value) {
            addCriterion("WORKTEL like", value, "worktel");
            return (Criteria) this;
        }

        public Criteria andWorktelNotLike(String value) {
            addCriterion("WORKTEL not like", value, "worktel");
            return (Criteria) this;
        }

        public Criteria andWorktelIn(List<String> values) {
            addCriterion("WORKTEL in", values, "worktel");
            return (Criteria) this;
        }

        public Criteria andWorktelNotIn(List<String> values) {
            addCriterion("WORKTEL not in", values, "worktel");
            return (Criteria) this;
        }

        public Criteria andWorktelBetween(String value1, String value2) {
            addCriterion("WORKTEL between", value1, value2, "worktel");
            return (Criteria) this;
        }

        public Criteria andWorktelNotBetween(String value1, String value2) {
            addCriterion("WORKTEL not between", value1, value2, "worktel");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("OCCUPATION is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("OCCUPATION is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(String value) {
            addCriterion("OCCUPATION =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(String value) {
            addCriterion("OCCUPATION <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(String value) {
            addCriterion("OCCUPATION >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("OCCUPATION >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(String value) {
            addCriterion("OCCUPATION <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(String value) {
            addCriterion("OCCUPATION <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLike(String value) {
            addCriterion("OCCUPATION like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotLike(String value) {
            addCriterion("OCCUPATION not like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<String> values) {
            addCriterion("OCCUPATION in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<String> values) {
            addCriterion("OCCUPATION not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(String value1, String value2) {
            addCriterion("OCCUPATION between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(String value1, String value2) {
            addCriterion("OCCUPATION not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andEmployrecordIsNull() {
            addCriterion("EMPLOYRECORD is null");
            return (Criteria) this;
        }

        public Criteria andEmployrecordIsNotNull() {
            addCriterion("EMPLOYRECORD is not null");
            return (Criteria) this;
        }

        public Criteria andEmployrecordEqualTo(String value) {
            addCriterion("EMPLOYRECORD =", value, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEmployrecordNotEqualTo(String value) {
            addCriterion("EMPLOYRECORD <>", value, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEmployrecordGreaterThan(String value) {
            addCriterion("EMPLOYRECORD >", value, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEmployrecordGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYRECORD >=", value, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEmployrecordLessThan(String value) {
            addCriterion("EMPLOYRECORD <", value, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEmployrecordLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYRECORD <=", value, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEmployrecordLike(String value) {
            addCriterion("EMPLOYRECORD like", value, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEmployrecordNotLike(String value) {
            addCriterion("EMPLOYRECORD not like", value, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEmployrecordIn(List<String> values) {
            addCriterion("EMPLOYRECORD in", values, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEmployrecordNotIn(List<String> values) {
            addCriterion("EMPLOYRECORD not in", values, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEmployrecordBetween(String value1, String value2) {
            addCriterion("EMPLOYRECORD between", value1, value2, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEmployrecordNotBetween(String value1, String value2) {
            addCriterion("EMPLOYRECORD not between", value1, value2, "employrecord");
            return (Criteria) this;
        }

        public Criteria andEduexperienceIsNull() {
            addCriterion("EDUEXPERIENCE is null");
            return (Criteria) this;
        }

        public Criteria andEduexperienceIsNotNull() {
            addCriterion("EDUEXPERIENCE is not null");
            return (Criteria) this;
        }

        public Criteria andEduexperienceEqualTo(String value) {
            addCriterion("EDUEXPERIENCE =", value, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEduexperienceNotEqualTo(String value) {
            addCriterion("EDUEXPERIENCE <>", value, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEduexperienceGreaterThan(String value) {
            addCriterion("EDUEXPERIENCE >", value, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEduexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("EDUEXPERIENCE >=", value, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEduexperienceLessThan(String value) {
            addCriterion("EDUEXPERIENCE <", value, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEduexperienceLessThanOrEqualTo(String value) {
            addCriterion("EDUEXPERIENCE <=", value, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEduexperienceLike(String value) {
            addCriterion("EDUEXPERIENCE like", value, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEduexperienceNotLike(String value) {
            addCriterion("EDUEXPERIENCE not like", value, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEduexperienceIn(List<String> values) {
            addCriterion("EDUEXPERIENCE in", values, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEduexperienceNotIn(List<String> values) {
            addCriterion("EDUEXPERIENCE not in", values, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEduexperienceBetween(String value1, String value2) {
            addCriterion("EDUEXPERIENCE between", value1, value2, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEduexperienceNotBetween(String value1, String value2) {
            addCriterion("EDUEXPERIENCE not between", value1, value2, "eduexperience");
            return (Criteria) this;
        }

        public Criteria andEdudegreeIsNull() {
            addCriterion("EDUDEGREE is null");
            return (Criteria) this;
        }

        public Criteria andEdudegreeIsNotNull() {
            addCriterion("EDUDEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andEdudegreeEqualTo(String value) {
            addCriterion("EDUDEGREE =", value, "edudegree");
            return (Criteria) this;
        }

        public Criteria andEdudegreeNotEqualTo(String value) {
            addCriterion("EDUDEGREE <>", value, "edudegree");
            return (Criteria) this;
        }

        public Criteria andEdudegreeGreaterThan(String value) {
            addCriterion("EDUDEGREE >", value, "edudegree");
            return (Criteria) this;
        }

        public Criteria andEdudegreeGreaterThanOrEqualTo(String value) {
            addCriterion("EDUDEGREE >=", value, "edudegree");
            return (Criteria) this;
        }

        public Criteria andEdudegreeLessThan(String value) {
            addCriterion("EDUDEGREE <", value, "edudegree");
            return (Criteria) this;
        }

        public Criteria andEdudegreeLessThanOrEqualTo(String value) {
            addCriterion("EDUDEGREE <=", value, "edudegree");
            return (Criteria) this;
        }

        public Criteria andEdudegreeLike(String value) {
            addCriterion("EDUDEGREE like", value, "edudegree");
            return (Criteria) this;
        }

        public Criteria andEdudegreeNotLike(String value) {
            addCriterion("EDUDEGREE not like", value, "edudegree");
            return (Criteria) this;
        }

        public Criteria andEdudegreeIn(List<String> values) {
            addCriterion("EDUDEGREE in", values, "edudegree");
            return (Criteria) this;
        }

        public Criteria andEdudegreeNotIn(List<String> values) {
            addCriterion("EDUDEGREE not in", values, "edudegree");
            return (Criteria) this;
        }

        public Criteria andEdudegreeBetween(String value1, String value2) {
            addCriterion("EDUDEGREE between", value1, value2, "edudegree");
            return (Criteria) this;
        }

        public Criteria andEdudegreeNotBetween(String value1, String value2) {
            addCriterion("EDUDEGREE not between", value1, value2, "edudegree");
            return (Criteria) this;
        }

        public Criteria andGraduateyearIsNull() {
            addCriterion("GRADUATEYEAR is null");
            return (Criteria) this;
        }

        public Criteria andGraduateyearIsNotNull() {
            addCriterion("GRADUATEYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateyearEqualTo(String value) {
            addCriterion("GRADUATEYEAR =", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearNotEqualTo(String value) {
            addCriterion("GRADUATEYEAR <>", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearGreaterThan(String value) {
            addCriterion("GRADUATEYEAR >", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATEYEAR >=", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearLessThan(String value) {
            addCriterion("GRADUATEYEAR <", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearLessThanOrEqualTo(String value) {
            addCriterion("GRADUATEYEAR <=", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearLike(String value) {
            addCriterion("GRADUATEYEAR like", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearNotLike(String value) {
            addCriterion("GRADUATEYEAR not like", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearIn(List<String> values) {
            addCriterion("GRADUATEYEAR in", values, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearNotIn(List<String> values) {
            addCriterion("GRADUATEYEAR not in", values, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearBetween(String value1, String value2) {
            addCriterion("GRADUATEYEAR between", value1, value2, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearNotBetween(String value1, String value2) {
            addCriterion("GRADUATEYEAR not between", value1, value2, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIsNull() {
            addCriterion("CREDITLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIsNotNull() {
            addCriterion("CREDITLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCreditlevelEqualTo(String value) {
            addCriterion("CREDITLEVEL =", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotEqualTo(String value) {
            addCriterion("CREDITLEVEL <>", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelGreaterThan(String value) {
            addCriterion("CREDITLEVEL >", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITLEVEL >=", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLessThan(String value) {
            addCriterion("CREDITLEVEL <", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLessThanOrEqualTo(String value) {
            addCriterion("CREDITLEVEL <=", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLike(String value) {
            addCriterion("CREDITLEVEL like", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotLike(String value) {
            addCriterion("CREDITLEVEL not like", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIn(List<String> values) {
            addCriterion("CREDITLEVEL in", values, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotIn(List<String> values) {
            addCriterion("CREDITLEVEL not in", values, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelBetween(String value1, String value2) {
            addCriterion("CREDITLEVEL between", value1, value2, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotBetween(String value1, String value2) {
            addCriterion("CREDITLEVEL not between", value1, value2, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateIsNull() {
            addCriterion("EVALUATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateIsNotNull() {
            addCriterion("EVALUATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateEqualTo(String value) {
            addCriterion("EVALUATEDATE =", value, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateNotEqualTo(String value) {
            addCriterion("EVALUATEDATE <>", value, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateGreaterThan(String value) {
            addCriterion("EVALUATEDATE >", value, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATEDATE >=", value, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateLessThan(String value) {
            addCriterion("EVALUATEDATE <", value, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateLessThanOrEqualTo(String value) {
            addCriterion("EVALUATEDATE <=", value, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateLike(String value) {
            addCriterion("EVALUATEDATE like", value, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateNotLike(String value) {
            addCriterion("EVALUATEDATE not like", value, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateIn(List<String> values) {
            addCriterion("EVALUATEDATE in", values, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateNotIn(List<String> values) {
            addCriterion("EVALUATEDATE not in", values, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateBetween(String value1, String value2) {
            addCriterion("EVALUATEDATE between", value1, value2, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andEvaluatedateNotBetween(String value1, String value2) {
            addCriterion("EVALUATEDATE not between", value1, value2, "evaluatedate");
            return (Criteria) this;
        }

        public Criteria andBalancesheetIsNull() {
            addCriterion("BALANCESHEET is null");
            return (Criteria) this;
        }

        public Criteria andBalancesheetIsNotNull() {
            addCriterion("BALANCESHEET is not null");
            return (Criteria) this;
        }

        public Criteria andBalancesheetEqualTo(String value) {
            addCriterion("BALANCESHEET =", value, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andBalancesheetNotEqualTo(String value) {
            addCriterion("BALANCESHEET <>", value, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andBalancesheetGreaterThan(String value) {
            addCriterion("BALANCESHEET >", value, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andBalancesheetGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCESHEET >=", value, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andBalancesheetLessThan(String value) {
            addCriterion("BALANCESHEET <", value, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andBalancesheetLessThanOrEqualTo(String value) {
            addCriterion("BALANCESHEET <=", value, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andBalancesheetLike(String value) {
            addCriterion("BALANCESHEET like", value, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andBalancesheetNotLike(String value) {
            addCriterion("BALANCESHEET not like", value, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andBalancesheetIn(List<String> values) {
            addCriterion("BALANCESHEET in", values, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andBalancesheetNotIn(List<String> values) {
            addCriterion("BALANCESHEET not in", values, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andBalancesheetBetween(String value1, String value2) {
            addCriterion("BALANCESHEET between", value1, value2, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andBalancesheetNotBetween(String value1, String value2) {
            addCriterion("BALANCESHEET not between", value1, value2, "balancesheet");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("INTRO is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("INTRO is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("INTRO =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("INTRO <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("INTRO >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("INTRO >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("INTRO <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("INTRO <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("INTRO like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("INTRO not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("INTRO in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("INTRO not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("INTRO between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("INTRO not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeIsNull() {
            addCriterion("SELFMONTHINCOME is null");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeIsNotNull() {
            addCriterion("SELFMONTHINCOME is not null");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeEqualTo(BigDecimal value) {
            addCriterion("SELFMONTHINCOME =", value, "selfmonthincome");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeNotEqualTo(BigDecimal value) {
            addCriterion("SELFMONTHINCOME <>", value, "selfmonthincome");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeGreaterThan(BigDecimal value) {
            addCriterion("SELFMONTHINCOME >", value, "selfmonthincome");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SELFMONTHINCOME >=", value, "selfmonthincome");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeLessThan(BigDecimal value) {
            addCriterion("SELFMONTHINCOME <", value, "selfmonthincome");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SELFMONTHINCOME <=", value, "selfmonthincome");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeIn(List<BigDecimal> values) {
            addCriterion("SELFMONTHINCOME in", values, "selfmonthincome");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeNotIn(List<BigDecimal> values) {
            addCriterion("SELFMONTHINCOME not in", values, "selfmonthincome");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELFMONTHINCOME between", value1, value2, "selfmonthincome");
            return (Criteria) this;
        }

        public Criteria andSelfmonthincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELFMONTHINCOME not between", value1, value2, "selfmonthincome");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeIsNull() {
            addCriterion("FAMILYMONTHINCOME is null");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeIsNotNull() {
            addCriterion("FAMILYMONTHINCOME is not null");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeEqualTo(BigDecimal value) {
            addCriterion("FAMILYMONTHINCOME =", value, "familymonthincome");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeNotEqualTo(BigDecimal value) {
            addCriterion("FAMILYMONTHINCOME <>", value, "familymonthincome");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeGreaterThan(BigDecimal value) {
            addCriterion("FAMILYMONTHINCOME >", value, "familymonthincome");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAMILYMONTHINCOME >=", value, "familymonthincome");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeLessThan(BigDecimal value) {
            addCriterion("FAMILYMONTHINCOME <", value, "familymonthincome");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAMILYMONTHINCOME <=", value, "familymonthincome");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeIn(List<BigDecimal> values) {
            addCriterion("FAMILYMONTHINCOME in", values, "familymonthincome");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeNotIn(List<BigDecimal> values) {
            addCriterion("FAMILYMONTHINCOME not in", values, "familymonthincome");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAMILYMONTHINCOME between", value1, value2, "familymonthincome");
            return (Criteria) this;
        }

        public Criteria andFamilymonthincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAMILYMONTHINCOME not between", value1, value2, "familymonthincome");
            return (Criteria) this;
        }

        public Criteria andIncomesourceIsNull() {
            addCriterion("INCOMESOURCE is null");
            return (Criteria) this;
        }

        public Criteria andIncomesourceIsNotNull() {
            addCriterion("INCOMESOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andIncomesourceEqualTo(String value) {
            addCriterion("INCOMESOURCE =", value, "incomesource");
            return (Criteria) this;
        }

        public Criteria andIncomesourceNotEqualTo(String value) {
            addCriterion("INCOMESOURCE <>", value, "incomesource");
            return (Criteria) this;
        }

        public Criteria andIncomesourceGreaterThan(String value) {
            addCriterion("INCOMESOURCE >", value, "incomesource");
            return (Criteria) this;
        }

        public Criteria andIncomesourceGreaterThanOrEqualTo(String value) {
            addCriterion("INCOMESOURCE >=", value, "incomesource");
            return (Criteria) this;
        }

        public Criteria andIncomesourceLessThan(String value) {
            addCriterion("INCOMESOURCE <", value, "incomesource");
            return (Criteria) this;
        }

        public Criteria andIncomesourceLessThanOrEqualTo(String value) {
            addCriterion("INCOMESOURCE <=", value, "incomesource");
            return (Criteria) this;
        }

        public Criteria andIncomesourceLike(String value) {
            addCriterion("INCOMESOURCE like", value, "incomesource");
            return (Criteria) this;
        }

        public Criteria andIncomesourceNotLike(String value) {
            addCriterion("INCOMESOURCE not like", value, "incomesource");
            return (Criteria) this;
        }

        public Criteria andIncomesourceIn(List<String> values) {
            addCriterion("INCOMESOURCE in", values, "incomesource");
            return (Criteria) this;
        }

        public Criteria andIncomesourceNotIn(List<String> values) {
            addCriterion("INCOMESOURCE not in", values, "incomesource");
            return (Criteria) this;
        }

        public Criteria andIncomesourceBetween(String value1, String value2) {
            addCriterion("INCOMESOURCE between", value1, value2, "incomesource");
            return (Criteria) this;
        }

        public Criteria andIncomesourceNotBetween(String value1, String value2) {
            addCriterion("INCOMESOURCE not between", value1, value2, "incomesource");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNull() {
            addCriterion("POPULATION is null");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNotNull() {
            addCriterion("POPULATION is not null");
            return (Criteria) this;
        }

        public Criteria andPopulationEqualTo(BigDecimal value) {
            addCriterion("POPULATION =", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotEqualTo(BigDecimal value) {
            addCriterion("POPULATION <>", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThan(BigDecimal value) {
            addCriterion("POPULATION >", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POPULATION >=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThan(BigDecimal value) {
            addCriterion("POPULATION <", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POPULATION <=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationIn(List<BigDecimal> values) {
            addCriterion("POPULATION in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotIn(List<BigDecimal> values) {
            addCriterion("POPULATION not in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POPULATION between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POPULATION not between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andFarmersortIsNull() {
            addCriterion("FARMERSORT is null");
            return (Criteria) this;
        }

        public Criteria andFarmersortIsNotNull() {
            addCriterion("FARMERSORT is not null");
            return (Criteria) this;
        }

        public Criteria andFarmersortEqualTo(String value) {
            addCriterion("FARMERSORT =", value, "farmersort");
            return (Criteria) this;
        }

        public Criteria andFarmersortNotEqualTo(String value) {
            addCriterion("FARMERSORT <>", value, "farmersort");
            return (Criteria) this;
        }

        public Criteria andFarmersortGreaterThan(String value) {
            addCriterion("FARMERSORT >", value, "farmersort");
            return (Criteria) this;
        }

        public Criteria andFarmersortGreaterThanOrEqualTo(String value) {
            addCriterion("FARMERSORT >=", value, "farmersort");
            return (Criteria) this;
        }

        public Criteria andFarmersortLessThan(String value) {
            addCriterion("FARMERSORT <", value, "farmersort");
            return (Criteria) this;
        }

        public Criteria andFarmersortLessThanOrEqualTo(String value) {
            addCriterion("FARMERSORT <=", value, "farmersort");
            return (Criteria) this;
        }

        public Criteria andFarmersortLike(String value) {
            addCriterion("FARMERSORT like", value, "farmersort");
            return (Criteria) this;
        }

        public Criteria andFarmersortNotLike(String value) {
            addCriterion("FARMERSORT not like", value, "farmersort");
            return (Criteria) this;
        }

        public Criteria andFarmersortIn(List<String> values) {
            addCriterion("FARMERSORT in", values, "farmersort");
            return (Criteria) this;
        }

        public Criteria andFarmersortNotIn(List<String> values) {
            addCriterion("FARMERSORT not in", values, "farmersort");
            return (Criteria) this;
        }

        public Criteria andFarmersortBetween(String value1, String value2) {
            addCriterion("FARMERSORT between", value1, value2, "farmersort");
            return (Criteria) this;
        }

        public Criteria andFarmersortNotBetween(String value1, String value2) {
            addCriterion("FARMERSORT not between", value1, value2, "farmersort");
            return (Criteria) this;
        }

        public Criteria andRegionalismIsNull() {
            addCriterion("REGIONALISM is null");
            return (Criteria) this;
        }

        public Criteria andRegionalismIsNotNull() {
            addCriterion("REGIONALISM is not null");
            return (Criteria) this;
        }

        public Criteria andRegionalismEqualTo(String value) {
            addCriterion("REGIONALISM =", value, "regionalism");
            return (Criteria) this;
        }

        public Criteria andRegionalismNotEqualTo(String value) {
            addCriterion("REGIONALISM <>", value, "regionalism");
            return (Criteria) this;
        }

        public Criteria andRegionalismGreaterThan(String value) {
            addCriterion("REGIONALISM >", value, "regionalism");
            return (Criteria) this;
        }

        public Criteria andRegionalismGreaterThanOrEqualTo(String value) {
            addCriterion("REGIONALISM >=", value, "regionalism");
            return (Criteria) this;
        }

        public Criteria andRegionalismLessThan(String value) {
            addCriterion("REGIONALISM <", value, "regionalism");
            return (Criteria) this;
        }

        public Criteria andRegionalismLessThanOrEqualTo(String value) {
            addCriterion("REGIONALISM <=", value, "regionalism");
            return (Criteria) this;
        }

        public Criteria andRegionalismLike(String value) {
            addCriterion("REGIONALISM like", value, "regionalism");
            return (Criteria) this;
        }

        public Criteria andRegionalismNotLike(String value) {
            addCriterion("REGIONALISM not like", value, "regionalism");
            return (Criteria) this;
        }

        public Criteria andRegionalismIn(List<String> values) {
            addCriterion("REGIONALISM in", values, "regionalism");
            return (Criteria) this;
        }

        public Criteria andRegionalismNotIn(List<String> values) {
            addCriterion("REGIONALISM not in", values, "regionalism");
            return (Criteria) this;
        }

        public Criteria andRegionalismBetween(String value1, String value2) {
            addCriterion("REGIONALISM between", value1, value2, "regionalism");
            return (Criteria) this;
        }

        public Criteria andRegionalismNotBetween(String value1, String value2) {
            addCriterion("REGIONALISM not between", value1, value2, "regionalism");
            return (Criteria) this;
        }

        public Criteria andStaffIsNull() {
            addCriterion("STAFF is null");
            return (Criteria) this;
        }

        public Criteria andStaffIsNotNull() {
            addCriterion("STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEqualTo(String value) {
            addCriterion("STAFF =", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotEqualTo(String value) {
            addCriterion("STAFF <>", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffGreaterThan(String value) {
            addCriterion("STAFF >", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF >=", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffLessThan(String value) {
            addCriterion("STAFF <", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffLessThanOrEqualTo(String value) {
            addCriterion("STAFF <=", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffLike(String value) {
            addCriterion("STAFF like", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotLike(String value) {
            addCriterion("STAFF not like", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffIn(List<String> values) {
            addCriterion("STAFF in", values, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotIn(List<String> values) {
            addCriterion("STAFF not in", values, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffBetween(String value1, String value2) {
            addCriterion("STAFF between", value1, value2, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotBetween(String value1, String value2) {
            addCriterion("STAFF not between", value1, value2, "staff");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerIsNull() {
            addCriterion("CREDITFARMER is null");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerIsNotNull() {
            addCriterion("CREDITFARMER is not null");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerEqualTo(String value) {
            addCriterion("CREDITFARMER =", value, "creditfarmer");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerNotEqualTo(String value) {
            addCriterion("CREDITFARMER <>", value, "creditfarmer");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerGreaterThan(String value) {
            addCriterion("CREDITFARMER >", value, "creditfarmer");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITFARMER >=", value, "creditfarmer");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerLessThan(String value) {
            addCriterion("CREDITFARMER <", value, "creditfarmer");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerLessThanOrEqualTo(String value) {
            addCriterion("CREDITFARMER <=", value, "creditfarmer");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerLike(String value) {
            addCriterion("CREDITFARMER like", value, "creditfarmer");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerNotLike(String value) {
            addCriterion("CREDITFARMER not like", value, "creditfarmer");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerIn(List<String> values) {
            addCriterion("CREDITFARMER in", values, "creditfarmer");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerNotIn(List<String> values) {
            addCriterion("CREDITFARMER not in", values, "creditfarmer");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerBetween(String value1, String value2) {
            addCriterion("CREDITFARMER between", value1, value2, "creditfarmer");
            return (Criteria) this;
        }

        public Criteria andCreditfarmerNotBetween(String value1, String value2) {
            addCriterion("CREDITFARMER not between", value1, value2, "creditfarmer");
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

        public Criteria andUpdatedateIsNull() {
            addCriterion("UPDATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UPDATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(String value) {
            addCriterion("UPDATEDATE =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(String value) {
            addCriterion("UPDATEDATE <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(String value) {
            addCriterion("UPDATEDATE >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEDATE >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(String value) {
            addCriterion("UPDATEDATE <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(String value) {
            addCriterion("UPDATEDATE <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLike(String value) {
            addCriterion("UPDATEDATE like", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotLike(String value) {
            addCriterion("UPDATEDATE not like", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<String> values) {
            addCriterion("UPDATEDATE in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<String> values) {
            addCriterion("UPDATEDATE not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(String value1, String value2) {
            addCriterion("UPDATEDATE between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(String value1, String value2) {
            addCriterion("UPDATEDATE not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidIsNull() {
            addCriterion("UPDATEORGID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidIsNotNull() {
            addCriterion("UPDATEORGID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidEqualTo(String value) {
            addCriterion("UPDATEORGID =", value, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidNotEqualTo(String value) {
            addCriterion("UPDATEORGID <>", value, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidGreaterThan(String value) {
            addCriterion("UPDATEORGID >", value, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEORGID >=", value, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidLessThan(String value) {
            addCriterion("UPDATEORGID <", value, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidLessThanOrEqualTo(String value) {
            addCriterion("UPDATEORGID <=", value, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidLike(String value) {
            addCriterion("UPDATEORGID like", value, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidNotLike(String value) {
            addCriterion("UPDATEORGID not like", value, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidIn(List<String> values) {
            addCriterion("UPDATEORGID in", values, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidNotIn(List<String> values) {
            addCriterion("UPDATEORGID not in", values, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidBetween(String value1, String value2) {
            addCriterion("UPDATEORGID between", value1, value2, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateorgidNotBetween(String value1, String value2) {
            addCriterion("UPDATEORGID not between", value1, value2, "updateorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNull() {
            addCriterion("UPDATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("UPDATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(String value) {
            addCriterion("UPDATEUSERID =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(String value) {
            addCriterion("UPDATEUSERID <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(String value) {
            addCriterion("UPDATEUSERID >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEUSERID >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(String value) {
            addCriterion("UPDATEUSERID <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(String value) {
            addCriterion("UPDATEUSERID <=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLike(String value) {
            addCriterion("UPDATEUSERID like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotLike(String value) {
            addCriterion("UPDATEUSERID not like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIn(List<String> values) {
            addCriterion("UPDATEUSERID in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<String> values) {
            addCriterion("UPDATEUSERID not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(String value1, String value2) {
            addCriterion("UPDATEUSERID between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(String value1, String value2) {
            addCriterion("UPDATEUSERID not between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andCommaddIsNull() {
            addCriterion("COMMADD is null");
            return (Criteria) this;
        }

        public Criteria andCommaddIsNotNull() {
            addCriterion("COMMADD is not null");
            return (Criteria) this;
        }

        public Criteria andCommaddEqualTo(String value) {
            addCriterion("COMMADD =", value, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommaddNotEqualTo(String value) {
            addCriterion("COMMADD <>", value, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommaddGreaterThan(String value) {
            addCriterion("COMMADD >", value, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommaddGreaterThanOrEqualTo(String value) {
            addCriterion("COMMADD >=", value, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommaddLessThan(String value) {
            addCriterion("COMMADD <", value, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommaddLessThanOrEqualTo(String value) {
            addCriterion("COMMADD <=", value, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommaddLike(String value) {
            addCriterion("COMMADD like", value, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommaddNotLike(String value) {
            addCriterion("COMMADD not like", value, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommaddIn(List<String> values) {
            addCriterion("COMMADD in", values, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommaddNotIn(List<String> values) {
            addCriterion("COMMADD not in", values, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommaddBetween(String value1, String value2) {
            addCriterion("COMMADD between", value1, value2, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommaddNotBetween(String value1, String value2) {
            addCriterion("COMMADD not between", value1, value2, "commadd");
            return (Criteria) this;
        }

        public Criteria andCommzipIsNull() {
            addCriterion("COMMZIP is null");
            return (Criteria) this;
        }

        public Criteria andCommzipIsNotNull() {
            addCriterion("COMMZIP is not null");
            return (Criteria) this;
        }

        public Criteria andCommzipEqualTo(String value) {
            addCriterion("COMMZIP =", value, "commzip");
            return (Criteria) this;
        }

        public Criteria andCommzipNotEqualTo(String value) {
            addCriterion("COMMZIP <>", value, "commzip");
            return (Criteria) this;
        }

        public Criteria andCommzipGreaterThan(String value) {
            addCriterion("COMMZIP >", value, "commzip");
            return (Criteria) this;
        }

        public Criteria andCommzipGreaterThanOrEqualTo(String value) {
            addCriterion("COMMZIP >=", value, "commzip");
            return (Criteria) this;
        }

        public Criteria andCommzipLessThan(String value) {
            addCriterion("COMMZIP <", value, "commzip");
            return (Criteria) this;
        }

        public Criteria andCommzipLessThanOrEqualTo(String value) {
            addCriterion("COMMZIP <=", value, "commzip");
            return (Criteria) this;
        }

        public Criteria andCommzipLike(String value) {
            addCriterion("COMMZIP like", value, "commzip");
            return (Criteria) this;
        }

        public Criteria andCommzipNotLike(String value) {
            addCriterion("COMMZIP not like", value, "commzip");
            return (Criteria) this;
        }

        public Criteria andCommzipIn(List<String> values) {
            addCriterion("COMMZIP in", values, "commzip");
            return (Criteria) this;
        }

        public Criteria andCommzipNotIn(List<String> values) {
            addCriterion("COMMZIP not in", values, "commzip");
            return (Criteria) this;
        }

        public Criteria andCommzipBetween(String value1, String value2) {
            addCriterion("COMMZIP between", value1, value2, "commzip");
            return (Criteria) this;
        }

        public Criteria andCommzipNotBetween(String value1, String value2) {
            addCriterion("COMMZIP not between", value1, value2, "commzip");
            return (Criteria) this;
        }

        public Criteria andNativeaddIsNull() {
            addCriterion("NATIVEADD is null");
            return (Criteria) this;
        }

        public Criteria andNativeaddIsNotNull() {
            addCriterion("NATIVEADD is not null");
            return (Criteria) this;
        }

        public Criteria andNativeaddEqualTo(String value) {
            addCriterion("NATIVEADD =", value, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andNativeaddNotEqualTo(String value) {
            addCriterion("NATIVEADD <>", value, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andNativeaddGreaterThan(String value) {
            addCriterion("NATIVEADD >", value, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andNativeaddGreaterThanOrEqualTo(String value) {
            addCriterion("NATIVEADD >=", value, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andNativeaddLessThan(String value) {
            addCriterion("NATIVEADD <", value, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andNativeaddLessThanOrEqualTo(String value) {
            addCriterion("NATIVEADD <=", value, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andNativeaddLike(String value) {
            addCriterion("NATIVEADD like", value, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andNativeaddNotLike(String value) {
            addCriterion("NATIVEADD not like", value, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andNativeaddIn(List<String> values) {
            addCriterion("NATIVEADD in", values, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andNativeaddNotIn(List<String> values) {
            addCriterion("NATIVEADD not in", values, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andNativeaddBetween(String value1, String value2) {
            addCriterion("NATIVEADD between", value1, value2, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andNativeaddNotBetween(String value1, String value2) {
            addCriterion("NATIVEADD not between", value1, value2, "nativeadd");
            return (Criteria) this;
        }

        public Criteria andWorkzipIsNull() {
            addCriterion("WORKZIP is null");
            return (Criteria) this;
        }

        public Criteria andWorkzipIsNotNull() {
            addCriterion("WORKZIP is not null");
            return (Criteria) this;
        }

        public Criteria andWorkzipEqualTo(String value) {
            addCriterion("WORKZIP =", value, "workzip");
            return (Criteria) this;
        }

        public Criteria andWorkzipNotEqualTo(String value) {
            addCriterion("WORKZIP <>", value, "workzip");
            return (Criteria) this;
        }

        public Criteria andWorkzipGreaterThan(String value) {
            addCriterion("WORKZIP >", value, "workzip");
            return (Criteria) this;
        }

        public Criteria andWorkzipGreaterThanOrEqualTo(String value) {
            addCriterion("WORKZIP >=", value, "workzip");
            return (Criteria) this;
        }

        public Criteria andWorkzipLessThan(String value) {
            addCriterion("WORKZIP <", value, "workzip");
            return (Criteria) this;
        }

        public Criteria andWorkzipLessThanOrEqualTo(String value) {
            addCriterion("WORKZIP <=", value, "workzip");
            return (Criteria) this;
        }

        public Criteria andWorkzipLike(String value) {
            addCriterion("WORKZIP like", value, "workzip");
            return (Criteria) this;
        }

        public Criteria andWorkzipNotLike(String value) {
            addCriterion("WORKZIP not like", value, "workzip");
            return (Criteria) this;
        }

        public Criteria andWorkzipIn(List<String> values) {
            addCriterion("WORKZIP in", values, "workzip");
            return (Criteria) this;
        }

        public Criteria andWorkzipNotIn(List<String> values) {
            addCriterion("WORKZIP not in", values, "workzip");
            return (Criteria) this;
        }

        public Criteria andWorkzipBetween(String value1, String value2) {
            addCriterion("WORKZIP between", value1, value2, "workzip");
            return (Criteria) this;
        }

        public Criteria andWorkzipNotBetween(String value1, String value2) {
            addCriterion("WORKZIP not between", value1, value2, "workzip");
            return (Criteria) this;
        }

        public Criteria andHeadshipIsNull() {
            addCriterion("HEADSHIP is null");
            return (Criteria) this;
        }

        public Criteria andHeadshipIsNotNull() {
            addCriterion("HEADSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andHeadshipEqualTo(String value) {
            addCriterion("HEADSHIP =", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipNotEqualTo(String value) {
            addCriterion("HEADSHIP <>", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipGreaterThan(String value) {
            addCriterion("HEADSHIP >", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipGreaterThanOrEqualTo(String value) {
            addCriterion("HEADSHIP >=", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipLessThan(String value) {
            addCriterion("HEADSHIP <", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipLessThanOrEqualTo(String value) {
            addCriterion("HEADSHIP <=", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipLike(String value) {
            addCriterion("HEADSHIP like", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipNotLike(String value) {
            addCriterion("HEADSHIP not like", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipIn(List<String> values) {
            addCriterion("HEADSHIP in", values, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipNotIn(List<String> values) {
            addCriterion("HEADSHIP not in", values, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipBetween(String value1, String value2) {
            addCriterion("HEADSHIP between", value1, value2, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipNotBetween(String value1, String value2) {
            addCriterion("HEADSHIP not between", value1, value2, "headship");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateIsNull() {
            addCriterion("WORKBEGINDATE is null");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateIsNotNull() {
            addCriterion("WORKBEGINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateEqualTo(String value) {
            addCriterion("WORKBEGINDATE =", value, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateNotEqualTo(String value) {
            addCriterion("WORKBEGINDATE <>", value, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateGreaterThan(String value) {
            addCriterion("WORKBEGINDATE >", value, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateGreaterThanOrEqualTo(String value) {
            addCriterion("WORKBEGINDATE >=", value, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateLessThan(String value) {
            addCriterion("WORKBEGINDATE <", value, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateLessThanOrEqualTo(String value) {
            addCriterion("WORKBEGINDATE <=", value, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateLike(String value) {
            addCriterion("WORKBEGINDATE like", value, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateNotLike(String value) {
            addCriterion("WORKBEGINDATE not like", value, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateIn(List<String> values) {
            addCriterion("WORKBEGINDATE in", values, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateNotIn(List<String> values) {
            addCriterion("WORKBEGINDATE not in", values, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateBetween(String value1, String value2) {
            addCriterion("WORKBEGINDATE between", value1, value2, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andWorkbegindateNotBetween(String value1, String value2) {
            addCriterion("WORKBEGINDATE not between", value1, value2, "workbegindate");
            return (Criteria) this;
        }

        public Criteria andYearincomeIsNull() {
            addCriterion("YEARINCOME is null");
            return (Criteria) this;
        }

        public Criteria andYearincomeIsNotNull() {
            addCriterion("YEARINCOME is not null");
            return (Criteria) this;
        }

        public Criteria andYearincomeEqualTo(BigDecimal value) {
            addCriterion("YEARINCOME =", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeNotEqualTo(BigDecimal value) {
            addCriterion("YEARINCOME <>", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeGreaterThan(BigDecimal value) {
            addCriterion("YEARINCOME >", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEARINCOME >=", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeLessThan(BigDecimal value) {
            addCriterion("YEARINCOME <", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEARINCOME <=", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeIn(List<BigDecimal> values) {
            addCriterion("YEARINCOME in", values, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeNotIn(List<BigDecimal> values) {
            addCriterion("YEARINCOME not in", values, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEARINCOME between", value1, value2, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEARINCOME not between", value1, value2, "yearincome");
            return (Criteria) this;
        }

        public Criteria andFamilystatusIsNull() {
            addCriterion("FAMILYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andFamilystatusIsNotNull() {
            addCriterion("FAMILYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFamilystatusEqualTo(String value) {
            addCriterion("FAMILYSTATUS =", value, "familystatus");
            return (Criteria) this;
        }

        public Criteria andFamilystatusNotEqualTo(String value) {
            addCriterion("FAMILYSTATUS <>", value, "familystatus");
            return (Criteria) this;
        }

        public Criteria andFamilystatusGreaterThan(String value) {
            addCriterion("FAMILYSTATUS >", value, "familystatus");
            return (Criteria) this;
        }

        public Criteria andFamilystatusGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYSTATUS >=", value, "familystatus");
            return (Criteria) this;
        }

        public Criteria andFamilystatusLessThan(String value) {
            addCriterion("FAMILYSTATUS <", value, "familystatus");
            return (Criteria) this;
        }

        public Criteria andFamilystatusLessThanOrEqualTo(String value) {
            addCriterion("FAMILYSTATUS <=", value, "familystatus");
            return (Criteria) this;
        }

        public Criteria andFamilystatusLike(String value) {
            addCriterion("FAMILYSTATUS like", value, "familystatus");
            return (Criteria) this;
        }

        public Criteria andFamilystatusNotLike(String value) {
            addCriterion("FAMILYSTATUS not like", value, "familystatus");
            return (Criteria) this;
        }

        public Criteria andFamilystatusIn(List<String> values) {
            addCriterion("FAMILYSTATUS in", values, "familystatus");
            return (Criteria) this;
        }

        public Criteria andFamilystatusNotIn(List<String> values) {
            addCriterion("FAMILYSTATUS not in", values, "familystatus");
            return (Criteria) this;
        }

        public Criteria andFamilystatusBetween(String value1, String value2) {
            addCriterion("FAMILYSTATUS between", value1, value2, "familystatus");
            return (Criteria) this;
        }

        public Criteria andFamilystatusNotBetween(String value1, String value2) {
            addCriterion("FAMILYSTATUS not between", value1, value2, "familystatus");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagIsNull() {
            addCriterion("TEMPSAVEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagIsNotNull() {
            addCriterion("TEMPSAVEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagEqualTo(String value) {
            addCriterion("TEMPSAVEFLAG =", value, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagNotEqualTo(String value) {
            addCriterion("TEMPSAVEFLAG <>", value, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagGreaterThan(String value) {
            addCriterion("TEMPSAVEFLAG >", value, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPSAVEFLAG >=", value, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagLessThan(String value) {
            addCriterion("TEMPSAVEFLAG <", value, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagLessThanOrEqualTo(String value) {
            addCriterion("TEMPSAVEFLAG <=", value, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagLike(String value) {
            addCriterion("TEMPSAVEFLAG like", value, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagNotLike(String value) {
            addCriterion("TEMPSAVEFLAG not like", value, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagIn(List<String> values) {
            addCriterion("TEMPSAVEFLAG in", values, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagNotIn(List<String> values) {
            addCriterion("TEMPSAVEFLAG not in", values, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagBetween(String value1, String value2) {
            addCriterion("TEMPSAVEFLAG between", value1, value2, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andTempsaveflagNotBetween(String value1, String value2) {
            addCriterion("TEMPSAVEFLAG not between", value1, value2, "tempsaveflag");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNull() {
            addCriterion("ENGNAME is null");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNotNull() {
            addCriterion("ENGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEngnameEqualTo(String value) {
            addCriterion("ENGNAME =", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotEqualTo(String value) {
            addCriterion("ENGNAME <>", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThan(String value) {
            addCriterion("ENGNAME >", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENGNAME >=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThan(String value) {
            addCriterion("ENGNAME <", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThanOrEqualTo(String value) {
            addCriterion("ENGNAME <=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLike(String value) {
            addCriterion("ENGNAME like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotLike(String value) {
            addCriterion("ENGNAME not like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameIn(List<String> values) {
            addCriterion("ENGNAME in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotIn(List<String> values) {
            addCriterion("ENGNAME not in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameBetween(String value1, String value2) {
            addCriterion("ENGNAME between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotBetween(String value1, String value2) {
            addCriterion("ENGNAME not between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andRegioncodeIsNull() {
            addCriterion("REGIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andRegioncodeIsNotNull() {
            addCriterion("REGIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegioncodeEqualTo(String value) {
            addCriterion("REGIONCODE =", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeNotEqualTo(String value) {
            addCriterion("REGIONCODE <>", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeGreaterThan(String value) {
            addCriterion("REGIONCODE >", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGIONCODE >=", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeLessThan(String value) {
            addCriterion("REGIONCODE <", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeLessThanOrEqualTo(String value) {
            addCriterion("REGIONCODE <=", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeLike(String value) {
            addCriterion("REGIONCODE like", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeNotLike(String value) {
            addCriterion("REGIONCODE not like", value, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeIn(List<String> values) {
            addCriterion("REGIONCODE in", values, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeNotIn(List<String> values) {
            addCriterion("REGIONCODE not in", values, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeBetween(String value1, String value2) {
            addCriterion("REGIONCODE between", value1, value2, "regioncode");
            return (Criteria) this;
        }

        public Criteria andRegioncodeNotBetween(String value1, String value2) {
            addCriterion("REGIONCODE not between", value1, value2, "regioncode");
            return (Criteria) this;
        }

        public Criteria andWorknatureIsNull() {
            addCriterion("WORKNATURE is null");
            return (Criteria) this;
        }

        public Criteria andWorknatureIsNotNull() {
            addCriterion("WORKNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andWorknatureEqualTo(String value) {
            addCriterion("WORKNATURE =", value, "worknature");
            return (Criteria) this;
        }

        public Criteria andWorknatureNotEqualTo(String value) {
            addCriterion("WORKNATURE <>", value, "worknature");
            return (Criteria) this;
        }

        public Criteria andWorknatureGreaterThan(String value) {
            addCriterion("WORKNATURE >", value, "worknature");
            return (Criteria) this;
        }

        public Criteria andWorknatureGreaterThanOrEqualTo(String value) {
            addCriterion("WORKNATURE >=", value, "worknature");
            return (Criteria) this;
        }

        public Criteria andWorknatureLessThan(String value) {
            addCriterion("WORKNATURE <", value, "worknature");
            return (Criteria) this;
        }

        public Criteria andWorknatureLessThanOrEqualTo(String value) {
            addCriterion("WORKNATURE <=", value, "worknature");
            return (Criteria) this;
        }

        public Criteria andWorknatureLike(String value) {
            addCriterion("WORKNATURE like", value, "worknature");
            return (Criteria) this;
        }

        public Criteria andWorknatureNotLike(String value) {
            addCriterion("WORKNATURE not like", value, "worknature");
            return (Criteria) this;
        }

        public Criteria andWorknatureIn(List<String> values) {
            addCriterion("WORKNATURE in", values, "worknature");
            return (Criteria) this;
        }

        public Criteria andWorknatureNotIn(List<String> values) {
            addCriterion("WORKNATURE not in", values, "worknature");
            return (Criteria) this;
        }

        public Criteria andWorknatureBetween(String value1, String value2) {
            addCriterion("WORKNATURE between", value1, value2, "worknature");
            return (Criteria) this;
        }

        public Criteria andWorknatureNotBetween(String value1, String value2) {
            addCriterion("WORKNATURE not between", value1, value2, "worknature");
            return (Criteria) this;
        }

        public Criteria andChildflagIsNull() {
            addCriterion("CHILDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andChildflagIsNotNull() {
            addCriterion("CHILDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andChildflagEqualTo(String value) {
            addCriterion("CHILDFLAG =", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagNotEqualTo(String value) {
            addCriterion("CHILDFLAG <>", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagGreaterThan(String value) {
            addCriterion("CHILDFLAG >", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagGreaterThanOrEqualTo(String value) {
            addCriterion("CHILDFLAG >=", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagLessThan(String value) {
            addCriterion("CHILDFLAG <", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagLessThanOrEqualTo(String value) {
            addCriterion("CHILDFLAG <=", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagLike(String value) {
            addCriterion("CHILDFLAG like", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagNotLike(String value) {
            addCriterion("CHILDFLAG not like", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagIn(List<String> values) {
            addCriterion("CHILDFLAG in", values, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagNotIn(List<String> values) {
            addCriterion("CHILDFLAG not in", values, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagBetween(String value1, String value2) {
            addCriterion("CHILDFLAG between", value1, value2, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagNotBetween(String value1, String value2) {
            addCriterion("CHILDFLAG not between", value1, value2, "childflag");
            return (Criteria) this;
        }

        public Criteria andLocalyearIsNull() {
            addCriterion("LOCALYEAR is null");
            return (Criteria) this;
        }

        public Criteria andLocalyearIsNotNull() {
            addCriterion("LOCALYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andLocalyearEqualTo(String value) {
            addCriterion("LOCALYEAR =", value, "localyear");
            return (Criteria) this;
        }

        public Criteria andLocalyearNotEqualTo(String value) {
            addCriterion("LOCALYEAR <>", value, "localyear");
            return (Criteria) this;
        }

        public Criteria andLocalyearGreaterThan(String value) {
            addCriterion("LOCALYEAR >", value, "localyear");
            return (Criteria) this;
        }

        public Criteria andLocalyearGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALYEAR >=", value, "localyear");
            return (Criteria) this;
        }

        public Criteria andLocalyearLessThan(String value) {
            addCriterion("LOCALYEAR <", value, "localyear");
            return (Criteria) this;
        }

        public Criteria andLocalyearLessThanOrEqualTo(String value) {
            addCriterion("LOCALYEAR <=", value, "localyear");
            return (Criteria) this;
        }

        public Criteria andLocalyearLike(String value) {
            addCriterion("LOCALYEAR like", value, "localyear");
            return (Criteria) this;
        }

        public Criteria andLocalyearNotLike(String value) {
            addCriterion("LOCALYEAR not like", value, "localyear");
            return (Criteria) this;
        }

        public Criteria andLocalyearIn(List<String> values) {
            addCriterion("LOCALYEAR in", values, "localyear");
            return (Criteria) this;
        }

        public Criteria andLocalyearNotIn(List<String> values) {
            addCriterion("LOCALYEAR not in", values, "localyear");
            return (Criteria) this;
        }

        public Criteria andLocalyearBetween(String value1, String value2) {
            addCriterion("LOCALYEAR between", value1, value2, "localyear");
            return (Criteria) this;
        }

        public Criteria andLocalyearNotBetween(String value1, String value2) {
            addCriterion("LOCALYEAR not between", value1, value2, "localyear");
            return (Criteria) this;
        }

        public Criteria andPosionlevelIsNull() {
            addCriterion("POSIONLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andPosionlevelIsNotNull() {
            addCriterion("POSIONLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andPosionlevelEqualTo(String value) {
            addCriterion("POSIONLEVEL =", value, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andPosionlevelNotEqualTo(String value) {
            addCriterion("POSIONLEVEL <>", value, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andPosionlevelGreaterThan(String value) {
            addCriterion("POSIONLEVEL >", value, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andPosionlevelGreaterThanOrEqualTo(String value) {
            addCriterion("POSIONLEVEL >=", value, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andPosionlevelLessThan(String value) {
            addCriterion("POSIONLEVEL <", value, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andPosionlevelLessThanOrEqualTo(String value) {
            addCriterion("POSIONLEVEL <=", value, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andPosionlevelLike(String value) {
            addCriterion("POSIONLEVEL like", value, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andPosionlevelNotLike(String value) {
            addCriterion("POSIONLEVEL not like", value, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andPosionlevelIn(List<String> values) {
            addCriterion("POSIONLEVEL in", values, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andPosionlevelNotIn(List<String> values) {
            addCriterion("POSIONLEVEL not in", values, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andPosionlevelBetween(String value1, String value2) {
            addCriterion("POSIONLEVEL between", value1, value2, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andPosionlevelNotBetween(String value1, String value2) {
            addCriterion("POSIONLEVEL not between", value1, value2, "posionlevel");
            return (Criteria) this;
        }

        public Criteria andFirsttelIsNull() {
            addCriterion("FIRSTTEL is null");
            return (Criteria) this;
        }

        public Criteria andFirsttelIsNotNull() {
            addCriterion("FIRSTTEL is not null");
            return (Criteria) this;
        }

        public Criteria andFirsttelEqualTo(String value) {
            addCriterion("FIRSTTEL =", value, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirsttelNotEqualTo(String value) {
            addCriterion("FIRSTTEL <>", value, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirsttelGreaterThan(String value) {
            addCriterion("FIRSTTEL >", value, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirsttelGreaterThanOrEqualTo(String value) {
            addCriterion("FIRSTTEL >=", value, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirsttelLessThan(String value) {
            addCriterion("FIRSTTEL <", value, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirsttelLessThanOrEqualTo(String value) {
            addCriterion("FIRSTTEL <=", value, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirsttelLike(String value) {
            addCriterion("FIRSTTEL like", value, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirsttelNotLike(String value) {
            addCriterion("FIRSTTEL not like", value, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirsttelIn(List<String> values) {
            addCriterion("FIRSTTEL in", values, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirsttelNotIn(List<String> values) {
            addCriterion("FIRSTTEL not in", values, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirsttelBetween(String value1, String value2) {
            addCriterion("FIRSTTEL between", value1, value2, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirsttelNotBetween(String value1, String value2) {
            addCriterion("FIRSTTEL not between", value1, value2, "firsttel");
            return (Criteria) this;
        }

        public Criteria andFirstemailIsNull() {
            addCriterion("FIRSTEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andFirstemailIsNotNull() {
            addCriterion("FIRSTEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andFirstemailEqualTo(String value) {
            addCriterion("FIRSTEMAIL =", value, "firstemail");
            return (Criteria) this;
        }

        public Criteria andFirstemailNotEqualTo(String value) {
            addCriterion("FIRSTEMAIL <>", value, "firstemail");
            return (Criteria) this;
        }

        public Criteria andFirstemailGreaterThan(String value) {
            addCriterion("FIRSTEMAIL >", value, "firstemail");
            return (Criteria) this;
        }

        public Criteria andFirstemailGreaterThanOrEqualTo(String value) {
            addCriterion("FIRSTEMAIL >=", value, "firstemail");
            return (Criteria) this;
        }

        public Criteria andFirstemailLessThan(String value) {
            addCriterion("FIRSTEMAIL <", value, "firstemail");
            return (Criteria) this;
        }

        public Criteria andFirstemailLessThanOrEqualTo(String value) {
            addCriterion("FIRSTEMAIL <=", value, "firstemail");
            return (Criteria) this;
        }

        public Criteria andFirstemailLike(String value) {
            addCriterion("FIRSTEMAIL like", value, "firstemail");
            return (Criteria) this;
        }

        public Criteria andFirstemailNotLike(String value) {
            addCriterion("FIRSTEMAIL not like", value, "firstemail");
            return (Criteria) this;
        }

        public Criteria andFirstemailIn(List<String> values) {
            addCriterion("FIRSTEMAIL in", values, "firstemail");
            return (Criteria) this;
        }

        public Criteria andFirstemailNotIn(List<String> values) {
            addCriterion("FIRSTEMAIL not in", values, "firstemail");
            return (Criteria) this;
        }

        public Criteria andFirstemailBetween(String value1, String value2) {
            addCriterion("FIRSTEMAIL between", value1, value2, "firstemail");
            return (Criteria) this;
        }

        public Criteria andFirstemailNotBetween(String value1, String value2) {
            addCriterion("FIRSTEMAIL not between", value1, value2, "firstemail");
            return (Criteria) this;
        }

        public Criteria andMonthincomeIsNull() {
            addCriterion("MONTHINCOME is null");
            return (Criteria) this;
        }

        public Criteria andMonthincomeIsNotNull() {
            addCriterion("MONTHINCOME is not null");
            return (Criteria) this;
        }

        public Criteria andMonthincomeEqualTo(BigDecimal value) {
            addCriterion("MONTHINCOME =", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeNotEqualTo(BigDecimal value) {
            addCriterion("MONTHINCOME <>", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeGreaterThan(BigDecimal value) {
            addCriterion("MONTHINCOME >", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHINCOME >=", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeLessThan(BigDecimal value) {
            addCriterion("MONTHINCOME <", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHINCOME <=", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeIn(List<BigDecimal> values) {
            addCriterion("MONTHINCOME in", values, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeNotIn(List<BigDecimal> values) {
            addCriterion("MONTHINCOME not in", values, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHINCOME between", value1, value2, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHINCOME not between", value1, value2, "monthincome");
            return (Criteria) this;
        }

        public Criteria andCorpzoneIsNull() {
            addCriterion("CORPZONE is null");
            return (Criteria) this;
        }

        public Criteria andCorpzoneIsNotNull() {
            addCriterion("CORPZONE is not null");
            return (Criteria) this;
        }

        public Criteria andCorpzoneEqualTo(String value) {
            addCriterion("CORPZONE =", value, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpzoneNotEqualTo(String value) {
            addCriterion("CORPZONE <>", value, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpzoneGreaterThan(String value) {
            addCriterion("CORPZONE >", value, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpzoneGreaterThanOrEqualTo(String value) {
            addCriterion("CORPZONE >=", value, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpzoneLessThan(String value) {
            addCriterion("CORPZONE <", value, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpzoneLessThanOrEqualTo(String value) {
            addCriterion("CORPZONE <=", value, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpzoneLike(String value) {
            addCriterion("CORPZONE like", value, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpzoneNotLike(String value) {
            addCriterion("CORPZONE not like", value, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpzoneIn(List<String> values) {
            addCriterion("CORPZONE in", values, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpzoneNotIn(List<String> values) {
            addCriterion("CORPZONE not in", values, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpzoneBetween(String value1, String value2) {
            addCriterion("CORPZONE between", value1, value2, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpzoneNotBetween(String value1, String value2) {
            addCriterion("CORPZONE not between", value1, value2, "corpzone");
            return (Criteria) this;
        }

        public Criteria andCorpareaIsNull() {
            addCriterion("CORPAREA is null");
            return (Criteria) this;
        }

        public Criteria andCorpareaIsNotNull() {
            addCriterion("CORPAREA is not null");
            return (Criteria) this;
        }

        public Criteria andCorpareaEqualTo(String value) {
            addCriterion("CORPAREA =", value, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpareaNotEqualTo(String value) {
            addCriterion("CORPAREA <>", value, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpareaGreaterThan(String value) {
            addCriterion("CORPAREA >", value, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpareaGreaterThanOrEqualTo(String value) {
            addCriterion("CORPAREA >=", value, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpareaLessThan(String value) {
            addCriterion("CORPAREA <", value, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpareaLessThanOrEqualTo(String value) {
            addCriterion("CORPAREA <=", value, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpareaLike(String value) {
            addCriterion("CORPAREA like", value, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpareaNotLike(String value) {
            addCriterion("CORPAREA not like", value, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpareaIn(List<String> values) {
            addCriterion("CORPAREA in", values, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpareaNotIn(List<String> values) {
            addCriterion("CORPAREA not in", values, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpareaBetween(String value1, String value2) {
            addCriterion("CORPAREA between", value1, value2, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpareaNotBetween(String value1, String value2) {
            addCriterion("CORPAREA not between", value1, value2, "corparea");
            return (Criteria) this;
        }

        public Criteria andCorpextensionIsNull() {
            addCriterion("CORPEXTENSION is null");
            return (Criteria) this;
        }

        public Criteria andCorpextensionIsNotNull() {
            addCriterion("CORPEXTENSION is not null");
            return (Criteria) this;
        }

        public Criteria andCorpextensionEqualTo(String value) {
            addCriterion("CORPEXTENSION =", value, "corpextension");
            return (Criteria) this;
        }

        public Criteria andCorpextensionNotEqualTo(String value) {
            addCriterion("CORPEXTENSION <>", value, "corpextension");
            return (Criteria) this;
        }

        public Criteria andCorpextensionGreaterThan(String value) {
            addCriterion("CORPEXTENSION >", value, "corpextension");
            return (Criteria) this;
        }

        public Criteria andCorpextensionGreaterThanOrEqualTo(String value) {
            addCriterion("CORPEXTENSION >=", value, "corpextension");
            return (Criteria) this;
        }

        public Criteria andCorpextensionLessThan(String value) {
            addCriterion("CORPEXTENSION <", value, "corpextension");
            return (Criteria) this;
        }

        public Criteria andCorpextensionLessThanOrEqualTo(String value) {
            addCriterion("CORPEXTENSION <=", value, "corpextension");
            return (Criteria) this;
        }

        public Criteria andCorpextensionLike(String value) {
            addCriterion("CORPEXTENSION like", value, "corpextension");
            return (Criteria) this;
        }

        public Criteria andCorpextensionNotLike(String value) {
            addCriterion("CORPEXTENSION not like", value, "corpextension");
            return (Criteria) this;
        }

        public Criteria andCorpextensionIn(List<String> values) {
            addCriterion("CORPEXTENSION in", values, "corpextension");
            return (Criteria) this;
        }

        public Criteria andCorpextensionNotIn(List<String> values) {
            addCriterion("CORPEXTENSION not in", values, "corpextension");
            return (Criteria) this;
        }

        public Criteria andCorpextensionBetween(String value1, String value2) {
            addCriterion("CORPEXTENSION between", value1, value2, "corpextension");
            return (Criteria) this;
        }

        public Criteria andCorpextensionNotBetween(String value1, String value2) {
            addCriterion("CORPEXTENSION not between", value1, value2, "corpextension");
            return (Criteria) this;
        }

        public Criteria andHousezoneIsNull() {
            addCriterion("HOUSEZONE is null");
            return (Criteria) this;
        }

        public Criteria andHousezoneIsNotNull() {
            addCriterion("HOUSEZONE is not null");
            return (Criteria) this;
        }

        public Criteria andHousezoneEqualTo(String value) {
            addCriterion("HOUSEZONE =", value, "housezone");
            return (Criteria) this;
        }

        public Criteria andHousezoneNotEqualTo(String value) {
            addCriterion("HOUSEZONE <>", value, "housezone");
            return (Criteria) this;
        }

        public Criteria andHousezoneGreaterThan(String value) {
            addCriterion("HOUSEZONE >", value, "housezone");
            return (Criteria) this;
        }

        public Criteria andHousezoneGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSEZONE >=", value, "housezone");
            return (Criteria) this;
        }

        public Criteria andHousezoneLessThan(String value) {
            addCriterion("HOUSEZONE <", value, "housezone");
            return (Criteria) this;
        }

        public Criteria andHousezoneLessThanOrEqualTo(String value) {
            addCriterion("HOUSEZONE <=", value, "housezone");
            return (Criteria) this;
        }

        public Criteria andHousezoneLike(String value) {
            addCriterion("HOUSEZONE like", value, "housezone");
            return (Criteria) this;
        }

        public Criteria andHousezoneNotLike(String value) {
            addCriterion("HOUSEZONE not like", value, "housezone");
            return (Criteria) this;
        }

        public Criteria andHousezoneIn(List<String> values) {
            addCriterion("HOUSEZONE in", values, "housezone");
            return (Criteria) this;
        }

        public Criteria andHousezoneNotIn(List<String> values) {
            addCriterion("HOUSEZONE not in", values, "housezone");
            return (Criteria) this;
        }

        public Criteria andHousezoneBetween(String value1, String value2) {
            addCriterion("HOUSEZONE between", value1, value2, "housezone");
            return (Criteria) this;
        }

        public Criteria andHousezoneNotBetween(String value1, String value2) {
            addCriterion("HOUSEZONE not between", value1, value2, "housezone");
            return (Criteria) this;
        }

        public Criteria andHouseareaIsNull() {
            addCriterion("HOUSEAREA is null");
            return (Criteria) this;
        }

        public Criteria andHouseareaIsNotNull() {
            addCriterion("HOUSEAREA is not null");
            return (Criteria) this;
        }

        public Criteria andHouseareaEqualTo(String value) {
            addCriterion("HOUSEAREA =", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotEqualTo(String value) {
            addCriterion("HOUSEAREA <>", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaGreaterThan(String value) {
            addCriterion("HOUSEAREA >", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSEAREA >=", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaLessThan(String value) {
            addCriterion("HOUSEAREA <", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaLessThanOrEqualTo(String value) {
            addCriterion("HOUSEAREA <=", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaLike(String value) {
            addCriterion("HOUSEAREA like", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotLike(String value) {
            addCriterion("HOUSEAREA not like", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaIn(List<String> values) {
            addCriterion("HOUSEAREA in", values, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotIn(List<String> values) {
            addCriterion("HOUSEAREA not in", values, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaBetween(String value1, String value2) {
            addCriterion("HOUSEAREA between", value1, value2, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotBetween(String value1, String value2) {
            addCriterion("HOUSEAREA not between", value1, value2, "housearea");
            return (Criteria) this;
        }

        public Criteria andCompanynatureIsNull() {
            addCriterion("COMPANYNATURE is null");
            return (Criteria) this;
        }

        public Criteria andCompanynatureIsNotNull() {
            addCriterion("COMPANYNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynatureEqualTo(String value) {
            addCriterion("COMPANYNATURE =", value, "companynature");
            return (Criteria) this;
        }

        public Criteria andCompanynatureNotEqualTo(String value) {
            addCriterion("COMPANYNATURE <>", value, "companynature");
            return (Criteria) this;
        }

        public Criteria andCompanynatureGreaterThan(String value) {
            addCriterion("COMPANYNATURE >", value, "companynature");
            return (Criteria) this;
        }

        public Criteria andCompanynatureGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYNATURE >=", value, "companynature");
            return (Criteria) this;
        }

        public Criteria andCompanynatureLessThan(String value) {
            addCriterion("COMPANYNATURE <", value, "companynature");
            return (Criteria) this;
        }

        public Criteria andCompanynatureLessThanOrEqualTo(String value) {
            addCriterion("COMPANYNATURE <=", value, "companynature");
            return (Criteria) this;
        }

        public Criteria andCompanynatureLike(String value) {
            addCriterion("COMPANYNATURE like", value, "companynature");
            return (Criteria) this;
        }

        public Criteria andCompanynatureNotLike(String value) {
            addCriterion("COMPANYNATURE not like", value, "companynature");
            return (Criteria) this;
        }

        public Criteria andCompanynatureIn(List<String> values) {
            addCriterion("COMPANYNATURE in", values, "companynature");
            return (Criteria) this;
        }

        public Criteria andCompanynatureNotIn(List<String> values) {
            addCriterion("COMPANYNATURE not in", values, "companynature");
            return (Criteria) this;
        }

        public Criteria andCompanynatureBetween(String value1, String value2) {
            addCriterion("COMPANYNATURE between", value1, value2, "companynature");
            return (Criteria) this;
        }

        public Criteria andCompanynatureNotBetween(String value1, String value2) {
            addCriterion("COMPANYNATURE not between", value1, value2, "companynature");
            return (Criteria) this;
        }

        public Criteria andQqcodeIsNull() {
            addCriterion("QQCODE is null");
            return (Criteria) this;
        }

        public Criteria andQqcodeIsNotNull() {
            addCriterion("QQCODE is not null");
            return (Criteria) this;
        }

        public Criteria andQqcodeEqualTo(String value) {
            addCriterion("QQCODE =", value, "qqcode");
            return (Criteria) this;
        }

        public Criteria andQqcodeNotEqualTo(String value) {
            addCriterion("QQCODE <>", value, "qqcode");
            return (Criteria) this;
        }

        public Criteria andQqcodeGreaterThan(String value) {
            addCriterion("QQCODE >", value, "qqcode");
            return (Criteria) this;
        }

        public Criteria andQqcodeGreaterThanOrEqualTo(String value) {
            addCriterion("QQCODE >=", value, "qqcode");
            return (Criteria) this;
        }

        public Criteria andQqcodeLessThan(String value) {
            addCriterion("QQCODE <", value, "qqcode");
            return (Criteria) this;
        }

        public Criteria andQqcodeLessThanOrEqualTo(String value) {
            addCriterion("QQCODE <=", value, "qqcode");
            return (Criteria) this;
        }

        public Criteria andQqcodeLike(String value) {
            addCriterion("QQCODE like", value, "qqcode");
            return (Criteria) this;
        }

        public Criteria andQqcodeNotLike(String value) {
            addCriterion("QQCODE not like", value, "qqcode");
            return (Criteria) this;
        }

        public Criteria andQqcodeIn(List<String> values) {
            addCriterion("QQCODE in", values, "qqcode");
            return (Criteria) this;
        }

        public Criteria andQqcodeNotIn(List<String> values) {
            addCriterion("QQCODE not in", values, "qqcode");
            return (Criteria) this;
        }

        public Criteria andQqcodeBetween(String value1, String value2) {
            addCriterion("QQCODE between", value1, value2, "qqcode");
            return (Criteria) this;
        }

        public Criteria andQqcodeNotBetween(String value1, String value2) {
            addCriterion("QQCODE not between", value1, value2, "qqcode");
            return (Criteria) this;
        }

        public Criteria andWhilomnameIsNull() {
            addCriterion("WHILOMNAME is null");
            return (Criteria) this;
        }

        public Criteria andWhilomnameIsNotNull() {
            addCriterion("WHILOMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andWhilomnameEqualTo(String value) {
            addCriterion("WHILOMNAME =", value, "whilomname");
            return (Criteria) this;
        }

        public Criteria andWhilomnameNotEqualTo(String value) {
            addCriterion("WHILOMNAME <>", value, "whilomname");
            return (Criteria) this;
        }

        public Criteria andWhilomnameGreaterThan(String value) {
            addCriterion("WHILOMNAME >", value, "whilomname");
            return (Criteria) this;
        }

        public Criteria andWhilomnameGreaterThanOrEqualTo(String value) {
            addCriterion("WHILOMNAME >=", value, "whilomname");
            return (Criteria) this;
        }

        public Criteria andWhilomnameLessThan(String value) {
            addCriterion("WHILOMNAME <", value, "whilomname");
            return (Criteria) this;
        }

        public Criteria andWhilomnameLessThanOrEqualTo(String value) {
            addCriterion("WHILOMNAME <=", value, "whilomname");
            return (Criteria) this;
        }

        public Criteria andWhilomnameLike(String value) {
            addCriterion("WHILOMNAME like", value, "whilomname");
            return (Criteria) this;
        }

        public Criteria andWhilomnameNotLike(String value) {
            addCriterion("WHILOMNAME not like", value, "whilomname");
            return (Criteria) this;
        }

        public Criteria andWhilomnameIn(List<String> values) {
            addCriterion("WHILOMNAME in", values, "whilomname");
            return (Criteria) this;
        }

        public Criteria andWhilomnameNotIn(List<String> values) {
            addCriterion("WHILOMNAME not in", values, "whilomname");
            return (Criteria) this;
        }

        public Criteria andWhilomnameBetween(String value1, String value2) {
            addCriterion("WHILOMNAME between", value1, value2, "whilomname");
            return (Criteria) this;
        }

        public Criteria andWhilomnameNotBetween(String value1, String value2) {
            addCriterion("WHILOMNAME not between", value1, value2, "whilomname");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceIsNull() {
            addCriterion("DRIVINGLICENCE is null");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceIsNotNull() {
            addCriterion("DRIVINGLICENCE is not null");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceEqualTo(String value) {
            addCriterion("DRIVINGLICENCE =", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceNotEqualTo(String value) {
            addCriterion("DRIVINGLICENCE <>", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceGreaterThan(String value) {
            addCriterion("DRIVINGLICENCE >", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVINGLICENCE >=", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceLessThan(String value) {
            addCriterion("DRIVINGLICENCE <", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceLessThanOrEqualTo(String value) {
            addCriterion("DRIVINGLICENCE <=", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceLike(String value) {
            addCriterion("DRIVINGLICENCE like", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceNotLike(String value) {
            addCriterion("DRIVINGLICENCE not like", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceIn(List<String> values) {
            addCriterion("DRIVINGLICENCE in", values, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceNotIn(List<String> values) {
            addCriterion("DRIVINGLICENCE not in", values, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceBetween(String value1, String value2) {
            addCriterion("DRIVINGLICENCE between", value1, value2, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceNotBetween(String value1, String value2) {
            addCriterion("DRIVINGLICENCE not between", value1, value2, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andIsownIsNull() {
            addCriterion("ISOWN is null");
            return (Criteria) this;
        }

        public Criteria andIsownIsNotNull() {
            addCriterion("ISOWN is not null");
            return (Criteria) this;
        }

        public Criteria andIsownEqualTo(String value) {
            addCriterion("ISOWN =", value, "isown");
            return (Criteria) this;
        }

        public Criteria andIsownNotEqualTo(String value) {
            addCriterion("ISOWN <>", value, "isown");
            return (Criteria) this;
        }

        public Criteria andIsownGreaterThan(String value) {
            addCriterion("ISOWN >", value, "isown");
            return (Criteria) this;
        }

        public Criteria andIsownGreaterThanOrEqualTo(String value) {
            addCriterion("ISOWN >=", value, "isown");
            return (Criteria) this;
        }

        public Criteria andIsownLessThan(String value) {
            addCriterion("ISOWN <", value, "isown");
            return (Criteria) this;
        }

        public Criteria andIsownLessThanOrEqualTo(String value) {
            addCriterion("ISOWN <=", value, "isown");
            return (Criteria) this;
        }

        public Criteria andIsownLike(String value) {
            addCriterion("ISOWN like", value, "isown");
            return (Criteria) this;
        }

        public Criteria andIsownNotLike(String value) {
            addCriterion("ISOWN not like", value, "isown");
            return (Criteria) this;
        }

        public Criteria andIsownIn(List<String> values) {
            addCriterion("ISOWN in", values, "isown");
            return (Criteria) this;
        }

        public Criteria andIsownNotIn(List<String> values) {
            addCriterion("ISOWN not in", values, "isown");
            return (Criteria) this;
        }

        public Criteria andIsownBetween(String value1, String value2) {
            addCriterion("ISOWN between", value1, value2, "isown");
            return (Criteria) this;
        }

        public Criteria andIsownNotBetween(String value1, String value2) {
            addCriterion("ISOWN not between", value1, value2, "isown");
            return (Criteria) this;
        }

        public Criteria andChanneltypeIsNull() {
            addCriterion("CHANNELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChanneltypeIsNotNull() {
            addCriterion("CHANNELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChanneltypeEqualTo(String value) {
            addCriterion("CHANNELTYPE =", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeNotEqualTo(String value) {
            addCriterion("CHANNELTYPE <>", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeGreaterThan(String value) {
            addCriterion("CHANNELTYPE >", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNELTYPE >=", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeLessThan(String value) {
            addCriterion("CHANNELTYPE <", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeLessThanOrEqualTo(String value) {
            addCriterion("CHANNELTYPE <=", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeLike(String value) {
            addCriterion("CHANNELTYPE like", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeNotLike(String value) {
            addCriterion("CHANNELTYPE not like", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeIn(List<String> values) {
            addCriterion("CHANNELTYPE in", values, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeNotIn(List<String> values) {
            addCriterion("CHANNELTYPE not in", values, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeBetween(String value1, String value2) {
            addCriterion("CHANNELTYPE between", value1, value2, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeNotBetween(String value1, String value2) {
            addCriterion("CHANNELTYPE not between", value1, value2, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumIsNull() {
            addCriterion("CHANNELGROUPNUM is null");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumIsNotNull() {
            addCriterion("CHANNELGROUPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumEqualTo(String value) {
            addCriterion("CHANNELGROUPNUM =", value, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumNotEqualTo(String value) {
            addCriterion("CHANNELGROUPNUM <>", value, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumGreaterThan(String value) {
            addCriterion("CHANNELGROUPNUM >", value, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNELGROUPNUM >=", value, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumLessThan(String value) {
            addCriterion("CHANNELGROUPNUM <", value, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumLessThanOrEqualTo(String value) {
            addCriterion("CHANNELGROUPNUM <=", value, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumLike(String value) {
            addCriterion("CHANNELGROUPNUM like", value, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumNotLike(String value) {
            addCriterion("CHANNELGROUPNUM not like", value, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumIn(List<String> values) {
            addCriterion("CHANNELGROUPNUM in", values, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumNotIn(List<String> values) {
            addCriterion("CHANNELGROUPNUM not in", values, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumBetween(String value1, String value2) {
            addCriterion("CHANNELGROUPNUM between", value1, value2, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andChannelgroupnumNotBetween(String value1, String value2) {
            addCriterion("CHANNELGROUPNUM not between", value1, value2, "channelgroupnum");
            return (Criteria) this;
        }

        public Criteria andHousingareaIsNull() {
            addCriterion("HOUSINGAREA is null");
            return (Criteria) this;
        }

        public Criteria andHousingareaIsNotNull() {
            addCriterion("HOUSINGAREA is not null");
            return (Criteria) this;
        }

        public Criteria andHousingareaEqualTo(String value) {
            addCriterion("HOUSINGAREA =", value, "housingarea");
            return (Criteria) this;
        }

        public Criteria andHousingareaNotEqualTo(String value) {
            addCriterion("HOUSINGAREA <>", value, "housingarea");
            return (Criteria) this;
        }

        public Criteria andHousingareaGreaterThan(String value) {
            addCriterion("HOUSINGAREA >", value, "housingarea");
            return (Criteria) this;
        }

        public Criteria andHousingareaGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSINGAREA >=", value, "housingarea");
            return (Criteria) this;
        }

        public Criteria andHousingareaLessThan(String value) {
            addCriterion("HOUSINGAREA <", value, "housingarea");
            return (Criteria) this;
        }

        public Criteria andHousingareaLessThanOrEqualTo(String value) {
            addCriterion("HOUSINGAREA <=", value, "housingarea");
            return (Criteria) this;
        }

        public Criteria andHousingareaLike(String value) {
            addCriterion("HOUSINGAREA like", value, "housingarea");
            return (Criteria) this;
        }

        public Criteria andHousingareaNotLike(String value) {
            addCriterion("HOUSINGAREA not like", value, "housingarea");
            return (Criteria) this;
        }

        public Criteria andHousingareaIn(List<String> values) {
            addCriterion("HOUSINGAREA in", values, "housingarea");
            return (Criteria) this;
        }

        public Criteria andHousingareaNotIn(List<String> values) {
            addCriterion("HOUSINGAREA not in", values, "housingarea");
            return (Criteria) this;
        }

        public Criteria andHousingareaBetween(String value1, String value2) {
            addCriterion("HOUSINGAREA between", value1, value2, "housingarea");
            return (Criteria) this;
        }

        public Criteria andHousingareaNotBetween(String value1, String value2) {
            addCriterion("HOUSINGAREA not between", value1, value2, "housingarea");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssIsNull() {
            addCriterion("MASCRIPTIONADSS is null");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssIsNotNull() {
            addCriterion("MASCRIPTIONADSS is not null");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssEqualTo(String value) {
            addCriterion("MASCRIPTIONADSS =", value, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssNotEqualTo(String value) {
            addCriterion("MASCRIPTIONADSS <>", value, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssGreaterThan(String value) {
            addCriterion("MASCRIPTIONADSS >", value, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssGreaterThanOrEqualTo(String value) {
            addCriterion("MASCRIPTIONADSS >=", value, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssLessThan(String value) {
            addCriterion("MASCRIPTIONADSS <", value, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssLessThanOrEqualTo(String value) {
            addCriterion("MASCRIPTIONADSS <=", value, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssLike(String value) {
            addCriterion("MASCRIPTIONADSS like", value, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssNotLike(String value) {
            addCriterion("MASCRIPTIONADSS not like", value, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssIn(List<String> values) {
            addCriterion("MASCRIPTIONADSS in", values, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssNotIn(List<String> values) {
            addCriterion("MASCRIPTIONADSS not in", values, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssBetween(String value1, String value2) {
            addCriterion("MASCRIPTIONADSS between", value1, value2, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andMascriptionadssNotBetween(String value1, String value2) {
            addCriterion("MASCRIPTIONADSS not between", value1, value2, "mascriptionadss");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeIsNull() {
            addCriterion("GETBUSYTIME is null");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeIsNotNull() {
            addCriterion("GETBUSYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeEqualTo(String value) {
            addCriterion("GETBUSYTIME =", value, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeNotEqualTo(String value) {
            addCriterion("GETBUSYTIME <>", value, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeGreaterThan(String value) {
            addCriterion("GETBUSYTIME >", value, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeGreaterThanOrEqualTo(String value) {
            addCriterion("GETBUSYTIME >=", value, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeLessThan(String value) {
            addCriterion("GETBUSYTIME <", value, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeLessThanOrEqualTo(String value) {
            addCriterion("GETBUSYTIME <=", value, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeLike(String value) {
            addCriterion("GETBUSYTIME like", value, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeNotLike(String value) {
            addCriterion("GETBUSYTIME not like", value, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeIn(List<String> values) {
            addCriterion("GETBUSYTIME in", values, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeNotIn(List<String> values) {
            addCriterion("GETBUSYTIME not in", values, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeBetween(String value1, String value2) {
            addCriterion("GETBUSYTIME between", value1, value2, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andGetbusytimeNotBetween(String value1, String value2) {
            addCriterion("GETBUSYTIME not between", value1, value2, "getbusytime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("WORKTIME is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("WORKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(String value) {
            addCriterion("WORKTIME =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(String value) {
            addCriterion("WORKTIME <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(String value) {
            addCriterion("WORKTIME >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKTIME >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(String value) {
            addCriterion("WORKTIME <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(String value) {
            addCriterion("WORKTIME <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLike(String value) {
            addCriterion("WORKTIME like", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotLike(String value) {
            addCriterion("WORKTIME not like", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<String> values) {
            addCriterion("WORKTIME in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<String> values) {
            addCriterion("WORKTIME not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(String value1, String value2) {
            addCriterion("WORKTIME between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(String value1, String value2) {
            addCriterion("WORKTIME not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeIsNull() {
            addCriterion("DIMISSIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeIsNotNull() {
            addCriterion("DIMISSIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeEqualTo(String value) {
            addCriterion("DIMISSIONTIME =", value, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeNotEqualTo(String value) {
            addCriterion("DIMISSIONTIME <>", value, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeGreaterThan(String value) {
            addCriterion("DIMISSIONTIME >", value, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeGreaterThanOrEqualTo(String value) {
            addCriterion("DIMISSIONTIME >=", value, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeLessThan(String value) {
            addCriterion("DIMISSIONTIME <", value, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeLessThanOrEqualTo(String value) {
            addCriterion("DIMISSIONTIME <=", value, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeLike(String value) {
            addCriterion("DIMISSIONTIME like", value, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeNotLike(String value) {
            addCriterion("DIMISSIONTIME not like", value, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeIn(List<String> values) {
            addCriterion("DIMISSIONTIME in", values, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeNotIn(List<String> values) {
            addCriterion("DIMISSIONTIME not in", values, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeBetween(String value1, String value2) {
            addCriterion("DIMISSIONTIME between", value1, value2, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andDimissiontimeNotBetween(String value1, String value2) {
            addCriterion("DIMISSIONTIME not between", value1, value2, "dimissiontime");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountIsNull() {
            addCriterion("SUBSISTPAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountIsNotNull() {
            addCriterion("SUBSISTPAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountEqualTo(String value) {
            addCriterion("SUBSISTPAMOUNT =", value, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountNotEqualTo(String value) {
            addCriterion("SUBSISTPAMOUNT <>", value, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountGreaterThan(String value) {
            addCriterion("SUBSISTPAMOUNT >", value, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSISTPAMOUNT >=", value, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountLessThan(String value) {
            addCriterion("SUBSISTPAMOUNT <", value, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountLessThanOrEqualTo(String value) {
            addCriterion("SUBSISTPAMOUNT <=", value, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountLike(String value) {
            addCriterion("SUBSISTPAMOUNT like", value, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountNotLike(String value) {
            addCriterion("SUBSISTPAMOUNT not like", value, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountIn(List<String> values) {
            addCriterion("SUBSISTPAMOUNT in", values, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountNotIn(List<String> values) {
            addCriterion("SUBSISTPAMOUNT not in", values, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountBetween(String value1, String value2) {
            addCriterion("SUBSISTPAMOUNT between", value1, value2, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andSubsistpamountNotBetween(String value1, String value2) {
            addCriterion("SUBSISTPAMOUNT not between", value1, value2, "subsistpamount");
            return (Criteria) this;
        }

        public Criteria andIsborrowerIsNull() {
            addCriterion("ISBORROWER is null");
            return (Criteria) this;
        }

        public Criteria andIsborrowerIsNotNull() {
            addCriterion("ISBORROWER is not null");
            return (Criteria) this;
        }

        public Criteria andIsborrowerEqualTo(String value) {
            addCriterion("ISBORROWER =", value, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIsborrowerNotEqualTo(String value) {
            addCriterion("ISBORROWER <>", value, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIsborrowerGreaterThan(String value) {
            addCriterion("ISBORROWER >", value, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIsborrowerGreaterThanOrEqualTo(String value) {
            addCriterion("ISBORROWER >=", value, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIsborrowerLessThan(String value) {
            addCriterion("ISBORROWER <", value, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIsborrowerLessThanOrEqualTo(String value) {
            addCriterion("ISBORROWER <=", value, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIsborrowerLike(String value) {
            addCriterion("ISBORROWER like", value, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIsborrowerNotLike(String value) {
            addCriterion("ISBORROWER not like", value, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIsborrowerIn(List<String> values) {
            addCriterion("ISBORROWER in", values, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIsborrowerNotIn(List<String> values) {
            addCriterion("ISBORROWER not in", values, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIsborrowerBetween(String value1, String value2) {
            addCriterion("ISBORROWER between", value1, value2, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIsborrowerNotBetween(String value1, String value2) {
            addCriterion("ISBORROWER not between", value1, value2, "isborrower");
            return (Criteria) this;
        }

        public Criteria andIswarrantorIsNull() {
            addCriterion("ISWARRANTOR is null");
            return (Criteria) this;
        }

        public Criteria andIswarrantorIsNotNull() {
            addCriterion("ISWARRANTOR is not null");
            return (Criteria) this;
        }

        public Criteria andIswarrantorEqualTo(String value) {
            addCriterion("ISWARRANTOR =", value, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andIswarrantorNotEqualTo(String value) {
            addCriterion("ISWARRANTOR <>", value, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andIswarrantorGreaterThan(String value) {
            addCriterion("ISWARRANTOR >", value, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andIswarrantorGreaterThanOrEqualTo(String value) {
            addCriterion("ISWARRANTOR >=", value, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andIswarrantorLessThan(String value) {
            addCriterion("ISWARRANTOR <", value, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andIswarrantorLessThanOrEqualTo(String value) {
            addCriterion("ISWARRANTOR <=", value, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andIswarrantorLike(String value) {
            addCriterion("ISWARRANTOR like", value, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andIswarrantorNotLike(String value) {
            addCriterion("ISWARRANTOR not like", value, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andIswarrantorIn(List<String> values) {
            addCriterion("ISWARRANTOR in", values, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andIswarrantorNotIn(List<String> values) {
            addCriterion("ISWARRANTOR not in", values, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andIswarrantorBetween(String value1, String value2) {
            addCriterion("ISWARRANTOR between", value1, value2, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andIswarrantorNotBetween(String value1, String value2) {
            addCriterion("ISWARRANTOR not between", value1, value2, "iswarrantor");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateIsNull() {
            addCriterion("CERTMATURITYDATE is null");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateIsNotNull() {
            addCriterion("CERTMATURITYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateEqualTo(String value) {
            addCriterion("CERTMATURITYDATE =", value, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateNotEqualTo(String value) {
            addCriterion("CERTMATURITYDATE <>", value, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateGreaterThan(String value) {
            addCriterion("CERTMATURITYDATE >", value, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateGreaterThanOrEqualTo(String value) {
            addCriterion("CERTMATURITYDATE >=", value, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateLessThan(String value) {
            addCriterion("CERTMATURITYDATE <", value, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateLessThanOrEqualTo(String value) {
            addCriterion("CERTMATURITYDATE <=", value, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateLike(String value) {
            addCriterion("CERTMATURITYDATE like", value, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateNotLike(String value) {
            addCriterion("CERTMATURITYDATE not like", value, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateIn(List<String> values) {
            addCriterion("CERTMATURITYDATE in", values, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateNotIn(List<String> values) {
            addCriterion("CERTMATURITYDATE not in", values, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateBetween(String value1, String value2) {
            addCriterion("CERTMATURITYDATE between", value1, value2, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andCertmaturitydateNotBetween(String value1, String value2) {
            addCriterion("CERTMATURITYDATE not between", value1, value2, "certmaturitydate");
            return (Criteria) this;
        }

        public Criteria andSendcardorganIsNull() {
            addCriterion("SENDCARDORGAN is null");
            return (Criteria) this;
        }

        public Criteria andSendcardorganIsNotNull() {
            addCriterion("SENDCARDORGAN is not null");
            return (Criteria) this;
        }

        public Criteria andSendcardorganEqualTo(String value) {
            addCriterion("SENDCARDORGAN =", value, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andSendcardorganNotEqualTo(String value) {
            addCriterion("SENDCARDORGAN <>", value, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andSendcardorganGreaterThan(String value) {
            addCriterion("SENDCARDORGAN >", value, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andSendcardorganGreaterThanOrEqualTo(String value) {
            addCriterion("SENDCARDORGAN >=", value, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andSendcardorganLessThan(String value) {
            addCriterion("SENDCARDORGAN <", value, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andSendcardorganLessThanOrEqualTo(String value) {
            addCriterion("SENDCARDORGAN <=", value, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andSendcardorganLike(String value) {
            addCriterion("SENDCARDORGAN like", value, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andSendcardorganNotLike(String value) {
            addCriterion("SENDCARDORGAN not like", value, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andSendcardorganIn(List<String> values) {
            addCriterion("SENDCARDORGAN in", values, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andSendcardorganNotIn(List<String> values) {
            addCriterion("SENDCARDORGAN not in", values, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andSendcardorganBetween(String value1, String value2) {
            addCriterion("SENDCARDORGAN between", value1, value2, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andSendcardorganNotBetween(String value1, String value2) {
            addCriterion("SENDCARDORGAN not between", value1, value2, "sendcardorgan");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("AGE like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("AGE not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andEmptypeIsNull() {
            addCriterion("EMPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEmptypeIsNotNull() {
            addCriterion("EMPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEmptypeEqualTo(String value) {
            addCriterion("EMPTYPE =", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeNotEqualTo(String value) {
            addCriterion("EMPTYPE <>", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeGreaterThan(String value) {
            addCriterion("EMPTYPE >", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeGreaterThanOrEqualTo(String value) {
            addCriterion("EMPTYPE >=", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeLessThan(String value) {
            addCriterion("EMPTYPE <", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeLessThanOrEqualTo(String value) {
            addCriterion("EMPTYPE <=", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeLike(String value) {
            addCriterion("EMPTYPE like", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeNotLike(String value) {
            addCriterion("EMPTYPE not like", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeIn(List<String> values) {
            addCriterion("EMPTYPE in", values, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeNotIn(List<String> values) {
            addCriterion("EMPTYPE not in", values, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeBetween(String value1, String value2) {
            addCriterion("EMPTYPE between", value1, value2, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeNotBetween(String value1, String value2) {
            addCriterion("EMPTYPE not between", value1, value2, "emptype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeIsNull() {
            addCriterion("CUSLEVELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeIsNotNull() {
            addCriterion("CUSLEVELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeEqualTo(String value) {
            addCriterion("CUSLEVELTYPE =", value, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeNotEqualTo(String value) {
            addCriterion("CUSLEVELTYPE <>", value, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeGreaterThan(String value) {
            addCriterion("CUSLEVELTYPE >", value, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSLEVELTYPE >=", value, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeLessThan(String value) {
            addCriterion("CUSLEVELTYPE <", value, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeLessThanOrEqualTo(String value) {
            addCriterion("CUSLEVELTYPE <=", value, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeLike(String value) {
            addCriterion("CUSLEVELTYPE like", value, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeNotLike(String value) {
            addCriterion("CUSLEVELTYPE not like", value, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeIn(List<String> values) {
            addCriterion("CUSLEVELTYPE in", values, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeNotIn(List<String> values) {
            addCriterion("CUSLEVELTYPE not in", values, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeBetween(String value1, String value2) {
            addCriterion("CUSLEVELTYPE between", value1, value2, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andCusleveltypeNotBetween(String value1, String value2) {
            addCriterion("CUSLEVELTYPE not between", value1, value2, "cusleveltype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeIsNull() {
            addCriterion("LOCALTYPE is null");
            return (Criteria) this;
        }

        public Criteria andLocaltypeIsNotNull() {
            addCriterion("LOCALTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLocaltypeEqualTo(String value) {
            addCriterion("LOCALTYPE =", value, "localtype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeNotEqualTo(String value) {
            addCriterion("LOCALTYPE <>", value, "localtype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeGreaterThan(String value) {
            addCriterion("LOCALTYPE >", value, "localtype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALTYPE >=", value, "localtype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeLessThan(String value) {
            addCriterion("LOCALTYPE <", value, "localtype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeLessThanOrEqualTo(String value) {
            addCriterion("LOCALTYPE <=", value, "localtype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeLike(String value) {
            addCriterion("LOCALTYPE like", value, "localtype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeNotLike(String value) {
            addCriterion("LOCALTYPE not like", value, "localtype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeIn(List<String> values) {
            addCriterion("LOCALTYPE in", values, "localtype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeNotIn(List<String> values) {
            addCriterion("LOCALTYPE not in", values, "localtype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeBetween(String value1, String value2) {
            addCriterion("LOCALTYPE between", value1, value2, "localtype");
            return (Criteria) this;
        }

        public Criteria andLocaltypeNotBetween(String value1, String value2) {
            addCriterion("LOCALTYPE not between", value1, value2, "localtype");
            return (Criteria) this;
        }

        public Criteria andCertid18IsNull() {
            addCriterion("CERTID18 is null");
            return (Criteria) this;
        }

        public Criteria andCertid18IsNotNull() {
            addCriterion("CERTID18 is not null");
            return (Criteria) this;
        }

        public Criteria andCertid18EqualTo(String value) {
            addCriterion("CERTID18 =", value, "certid18");
            return (Criteria) this;
        }

        public Criteria andCertid18NotEqualTo(String value) {
            addCriterion("CERTID18 <>", value, "certid18");
            return (Criteria) this;
        }

        public Criteria andCertid18GreaterThan(String value) {
            addCriterion("CERTID18 >", value, "certid18");
            return (Criteria) this;
        }

        public Criteria andCertid18GreaterThanOrEqualTo(String value) {
            addCriterion("CERTID18 >=", value, "certid18");
            return (Criteria) this;
        }

        public Criteria andCertid18LessThan(String value) {
            addCriterion("CERTID18 <", value, "certid18");
            return (Criteria) this;
        }

        public Criteria andCertid18LessThanOrEqualTo(String value) {
            addCriterion("CERTID18 <=", value, "certid18");
            return (Criteria) this;
        }

        public Criteria andCertid18Like(String value) {
            addCriterion("CERTID18 like", value, "certid18");
            return (Criteria) this;
        }

        public Criteria andCertid18NotLike(String value) {
            addCriterion("CERTID18 not like", value, "certid18");
            return (Criteria) this;
        }

        public Criteria andCertid18In(List<String> values) {
            addCriterion("CERTID18 in", values, "certid18");
            return (Criteria) this;
        }

        public Criteria andCertid18NotIn(List<String> values) {
            addCriterion("CERTID18 not in", values, "certid18");
            return (Criteria) this;
        }

        public Criteria andCertid18Between(String value1, String value2) {
            addCriterion("CERTID18 between", value1, value2, "certid18");
            return (Criteria) this;
        }

        public Criteria andCertid18NotBetween(String value1, String value2) {
            addCriterion("CERTID18 not between", value1, value2, "certid18");
            return (Criteria) this;
        }

        public Criteria andHomesumIsNull() {
            addCriterion("HOMESUM is null");
            return (Criteria) this;
        }

        public Criteria andHomesumIsNotNull() {
            addCriterion("HOMESUM is not null");
            return (Criteria) this;
        }

        public Criteria andHomesumEqualTo(BigDecimal value) {
            addCriterion("HOMESUM =", value, "homesum");
            return (Criteria) this;
        }

        public Criteria andHomesumNotEqualTo(BigDecimal value) {
            addCriterion("HOMESUM <>", value, "homesum");
            return (Criteria) this;
        }

        public Criteria andHomesumGreaterThan(BigDecimal value) {
            addCriterion("HOMESUM >", value, "homesum");
            return (Criteria) this;
        }

        public Criteria andHomesumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOMESUM >=", value, "homesum");
            return (Criteria) this;
        }

        public Criteria andHomesumLessThan(BigDecimal value) {
            addCriterion("HOMESUM <", value, "homesum");
            return (Criteria) this;
        }

        public Criteria andHomesumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOMESUM <=", value, "homesum");
            return (Criteria) this;
        }

        public Criteria andHomesumIn(List<BigDecimal> values) {
            addCriterion("HOMESUM in", values, "homesum");
            return (Criteria) this;
        }

        public Criteria andHomesumNotIn(List<BigDecimal> values) {
            addCriterion("HOMESUM not in", values, "homesum");
            return (Criteria) this;
        }

        public Criteria andHomesumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOMESUM between", value1, value2, "homesum");
            return (Criteria) this;
        }

        public Criteria andHomesumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOMESUM not between", value1, value2, "homesum");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootIsNull() {
            addCriterion("FAMILYSUMROOT is null");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootIsNotNull() {
            addCriterion("FAMILYSUMROOT is not null");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootEqualTo(String value) {
            addCriterion("FAMILYSUMROOT =", value, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootNotEqualTo(String value) {
            addCriterion("FAMILYSUMROOT <>", value, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootGreaterThan(String value) {
            addCriterion("FAMILYSUMROOT >", value, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYSUMROOT >=", value, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootLessThan(String value) {
            addCriterion("FAMILYSUMROOT <", value, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootLessThanOrEqualTo(String value) {
            addCriterion("FAMILYSUMROOT <=", value, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootLike(String value) {
            addCriterion("FAMILYSUMROOT like", value, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootNotLike(String value) {
            addCriterion("FAMILYSUMROOT not like", value, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootIn(List<String> values) {
            addCriterion("FAMILYSUMROOT in", values, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootNotIn(List<String> values) {
            addCriterion("FAMILYSUMROOT not in", values, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootBetween(String value1, String value2) {
            addCriterion("FAMILYSUMROOT between", value1, value2, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilysumrootNotBetween(String value1, String value2) {
            addCriterion("FAMILYSUMROOT not between", value1, value2, "familysumroot");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeIsNull() {
            addCriterion("FAMILYPINCOME is null");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeIsNotNull() {
            addCriterion("FAMILYPINCOME is not null");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeEqualTo(BigDecimal value) {
            addCriterion("FAMILYPINCOME =", value, "familypincome");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeNotEqualTo(BigDecimal value) {
            addCriterion("FAMILYPINCOME <>", value, "familypincome");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeGreaterThan(BigDecimal value) {
            addCriterion("FAMILYPINCOME >", value, "familypincome");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAMILYPINCOME >=", value, "familypincome");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeLessThan(BigDecimal value) {
            addCriterion("FAMILYPINCOME <", value, "familypincome");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAMILYPINCOME <=", value, "familypincome");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeIn(List<BigDecimal> values) {
            addCriterion("FAMILYPINCOME in", values, "familypincome");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeNotIn(List<BigDecimal> values) {
            addCriterion("FAMILYPINCOME not in", values, "familypincome");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAMILYPINCOME between", value1, value2, "familypincome");
            return (Criteria) this;
        }

        public Criteria andFamilypincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAMILYPINCOME not between", value1, value2, "familypincome");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceIsNull() {
            addCriterion("HOMELOANBLANCE is null");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceIsNotNull() {
            addCriterion("HOMELOANBLANCE is not null");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceEqualTo(BigDecimal value) {
            addCriterion("HOMELOANBLANCE =", value, "homeloanblance");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceNotEqualTo(BigDecimal value) {
            addCriterion("HOMELOANBLANCE <>", value, "homeloanblance");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceGreaterThan(BigDecimal value) {
            addCriterion("HOMELOANBLANCE >", value, "homeloanblance");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOMELOANBLANCE >=", value, "homeloanblance");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceLessThan(BigDecimal value) {
            addCriterion("HOMELOANBLANCE <", value, "homeloanblance");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOMELOANBLANCE <=", value, "homeloanblance");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceIn(List<BigDecimal> values) {
            addCriterion("HOMELOANBLANCE in", values, "homeloanblance");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceNotIn(List<BigDecimal> values) {
            addCriterion("HOMELOANBLANCE not in", values, "homeloanblance");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOMELOANBLANCE between", value1, value2, "homeloanblance");
            return (Criteria) this;
        }

        public Criteria andHomeloanblanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOMELOANBLANCE not between", value1, value2, "homeloanblance");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumIsNull() {
            addCriterion("HOMELOANMONTHSUM is null");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumIsNotNull() {
            addCriterion("HOMELOANMONTHSUM is not null");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumEqualTo(BigDecimal value) {
            addCriterion("HOMELOANMONTHSUM =", value, "homeloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumNotEqualTo(BigDecimal value) {
            addCriterion("HOMELOANMONTHSUM <>", value, "homeloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumGreaterThan(BigDecimal value) {
            addCriterion("HOMELOANMONTHSUM >", value, "homeloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOMELOANMONTHSUM >=", value, "homeloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumLessThan(BigDecimal value) {
            addCriterion("HOMELOANMONTHSUM <", value, "homeloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOMELOANMONTHSUM <=", value, "homeloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumIn(List<BigDecimal> values) {
            addCriterion("HOMELOANMONTHSUM in", values, "homeloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumNotIn(List<BigDecimal> values) {
            addCriterion("HOMELOANMONTHSUM not in", values, "homeloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOMELOANMONTHSUM between", value1, value2, "homeloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOMELOANMONTHSUM not between", value1, value2, "homeloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceIsNull() {
            addCriterion("CARLOANBLANCE is null");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceIsNotNull() {
            addCriterion("CARLOANBLANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceEqualTo(BigDecimal value) {
            addCriterion("CARLOANBLANCE =", value, "carloanblance");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceNotEqualTo(BigDecimal value) {
            addCriterion("CARLOANBLANCE <>", value, "carloanblance");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceGreaterThan(BigDecimal value) {
            addCriterion("CARLOANBLANCE >", value, "carloanblance");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARLOANBLANCE >=", value, "carloanblance");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceLessThan(BigDecimal value) {
            addCriterion("CARLOANBLANCE <", value, "carloanblance");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARLOANBLANCE <=", value, "carloanblance");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceIn(List<BigDecimal> values) {
            addCriterion("CARLOANBLANCE in", values, "carloanblance");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceNotIn(List<BigDecimal> values) {
            addCriterion("CARLOANBLANCE not in", values, "carloanblance");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARLOANBLANCE between", value1, value2, "carloanblance");
            return (Criteria) this;
        }

        public Criteria andCarloanblanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARLOANBLANCE not between", value1, value2, "carloanblance");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumIsNull() {
            addCriterion("CARLOANMONTHSUM is null");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumIsNotNull() {
            addCriterion("CARLOANMONTHSUM is not null");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumEqualTo(BigDecimal value) {
            addCriterion("CARLOANMONTHSUM =", value, "carloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumNotEqualTo(BigDecimal value) {
            addCriterion("CARLOANMONTHSUM <>", value, "carloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumGreaterThan(BigDecimal value) {
            addCriterion("CARLOANMONTHSUM >", value, "carloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARLOANMONTHSUM >=", value, "carloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumLessThan(BigDecimal value) {
            addCriterion("CARLOANMONTHSUM <", value, "carloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARLOANMONTHSUM <=", value, "carloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumIn(List<BigDecimal> values) {
            addCriterion("CARLOANMONTHSUM in", values, "carloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumNotIn(List<BigDecimal> values) {
            addCriterion("CARLOANMONTHSUM not in", values, "carloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARLOANMONTHSUM between", value1, value2, "carloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andCarloanmonthsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARLOANMONTHSUM not between", value1, value2, "carloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceIsNull() {
            addCriterion("OTHERLOANBLANCE is null");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceIsNotNull() {
            addCriterion("OTHERLOANBLANCE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceEqualTo(BigDecimal value) {
            addCriterion("OTHERLOANBLANCE =", value, "otherloanblance");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceNotEqualTo(BigDecimal value) {
            addCriterion("OTHERLOANBLANCE <>", value, "otherloanblance");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceGreaterThan(BigDecimal value) {
            addCriterion("OTHERLOANBLANCE >", value, "otherloanblance");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERLOANBLANCE >=", value, "otherloanblance");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceLessThan(BigDecimal value) {
            addCriterion("OTHERLOANBLANCE <", value, "otherloanblance");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERLOANBLANCE <=", value, "otherloanblance");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceIn(List<BigDecimal> values) {
            addCriterion("OTHERLOANBLANCE in", values, "otherloanblance");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceNotIn(List<BigDecimal> values) {
            addCriterion("OTHERLOANBLANCE not in", values, "otherloanblance");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERLOANBLANCE between", value1, value2, "otherloanblance");
            return (Criteria) this;
        }

        public Criteria andOtherloanblanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERLOANBLANCE not between", value1, value2, "otherloanblance");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumIsNull() {
            addCriterion("OTHERLOANMONTHSUM is null");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumIsNotNull() {
            addCriterion("OTHERLOANMONTHSUM is not null");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumEqualTo(BigDecimal value) {
            addCriterion("OTHERLOANMONTHSUM =", value, "otherloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumNotEqualTo(BigDecimal value) {
            addCriterion("OTHERLOANMONTHSUM <>", value, "otherloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumGreaterThan(BigDecimal value) {
            addCriterion("OTHERLOANMONTHSUM >", value, "otherloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERLOANMONTHSUM >=", value, "otherloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumLessThan(BigDecimal value) {
            addCriterion("OTHERLOANMONTHSUM <", value, "otherloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERLOANMONTHSUM <=", value, "otherloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumIn(List<BigDecimal> values) {
            addCriterion("OTHERLOANMONTHSUM in", values, "otherloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumNotIn(List<BigDecimal> values) {
            addCriterion("OTHERLOANMONTHSUM not in", values, "otherloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERLOANMONTHSUM between", value1, value2, "otherloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andOtherloanmonthsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERLOANMONTHSUM not between", value1, value2, "otherloanmonthsum");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BankName is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BankName is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BankName =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BankName <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BankName >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BankName >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BankName <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BankName <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BankName like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BankName not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BankName in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BankName not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BankName between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BankName not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNull() {
            addCriterion("BankCARD is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNotNull() {
            addCriterion("BankCARD is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardEqualTo(String value) {
            addCriterion("BankCARD =", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotEqualTo(String value) {
            addCriterion("BankCARD <>", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThan(String value) {
            addCriterion("BankCARD >", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("BankCARD >=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThan(String value) {
            addCriterion("BankCARD <", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThanOrEqualTo(String value) {
            addCriterion("BankCARD <=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLike(String value) {
            addCriterion("BankCARD like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotLike(String value) {
            addCriterion("BankCARD not like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardIn(List<String> values) {
            addCriterion("BankCARD in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotIn(List<String> values) {
            addCriterion("BankCARD not in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardBetween(String value1, String value2) {
            addCriterion("BankCARD between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotBetween(String value1, String value2) {
            addCriterion("BankCARD not between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNull() {
            addCriterion("bankCode is null");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNotNull() {
            addCriterion("bankCode is not null");
            return (Criteria) this;
        }

        public Criteria andBankcodeEqualTo(String value) {
            addCriterion("bankCode =", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotEqualTo(String value) {
            addCriterion("bankCode <>", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThan(String value) {
            addCriterion("bankCode >", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bankCode >=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThan(String value) {
            addCriterion("bankCode <", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThanOrEqualTo(String value) {
            addCriterion("bankCode <=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLike(String value) {
            addCriterion("bankCode like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotLike(String value) {
            addCriterion("bankCode not like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeIn(List<String> values) {
            addCriterion("bankCode in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotIn(List<String> values) {
            addCriterion("bankCode not in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeBetween(String value1, String value2) {
            addCriterion("bankCode between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotBetween(String value1, String value2) {
            addCriterion("bankCode not between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneIsNull() {
            addCriterion("bankCardPhone is null");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneIsNotNull() {
            addCriterion("bankCardPhone is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneEqualTo(String value) {
            addCriterion("bankCardPhone =", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneNotEqualTo(String value) {
            addCriterion("bankCardPhone <>", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneGreaterThan(String value) {
            addCriterion("bankCardPhone >", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneGreaterThanOrEqualTo(String value) {
            addCriterion("bankCardPhone >=", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneLessThan(String value) {
            addCriterion("bankCardPhone <", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneLessThanOrEqualTo(String value) {
            addCriterion("bankCardPhone <=", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneLike(String value) {
            addCriterion("bankCardPhone like", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneNotLike(String value) {
            addCriterion("bankCardPhone not like", value, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneIn(List<String> values) {
            addCriterion("bankCardPhone in", values, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneNotIn(List<String> values) {
            addCriterion("bankCardPhone not in", values, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneBetween(String value1, String value2) {
            addCriterion("bankCardPhone between", value1, value2, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andBankcardphoneNotBetween(String value1, String value2) {
            addCriterion("bankCardPhone not between", value1, value2, "bankcardphone");
            return (Criteria) this;
        }

        public Criteria andSidflagIsNull() {
            addCriterion("sidflag is null");
            return (Criteria) this;
        }

        public Criteria andSidflagIsNotNull() {
            addCriterion("sidflag is not null");
            return (Criteria) this;
        }

        public Criteria andSidflagEqualTo(String value) {
            addCriterion("sidflag =", value, "sidflag");
            return (Criteria) this;
        }

        public Criteria andSidflagNotEqualTo(String value) {
            addCriterion("sidflag <>", value, "sidflag");
            return (Criteria) this;
        }

        public Criteria andSidflagGreaterThan(String value) {
            addCriterion("sidflag >", value, "sidflag");
            return (Criteria) this;
        }

        public Criteria andSidflagGreaterThanOrEqualTo(String value) {
            addCriterion("sidflag >=", value, "sidflag");
            return (Criteria) this;
        }

        public Criteria andSidflagLessThan(String value) {
            addCriterion("sidflag <", value, "sidflag");
            return (Criteria) this;
        }

        public Criteria andSidflagLessThanOrEqualTo(String value) {
            addCriterion("sidflag <=", value, "sidflag");
            return (Criteria) this;
        }

        public Criteria andSidflagLike(String value) {
            addCriterion("sidflag like", value, "sidflag");
            return (Criteria) this;
        }

        public Criteria andSidflagNotLike(String value) {
            addCriterion("sidflag not like", value, "sidflag");
            return (Criteria) this;
        }

        public Criteria andSidflagIn(List<String> values) {
            addCriterion("sidflag in", values, "sidflag");
            return (Criteria) this;
        }

        public Criteria andSidflagNotIn(List<String> values) {
            addCriterion("sidflag not in", values, "sidflag");
            return (Criteria) this;
        }

        public Criteria andSidflagBetween(String value1, String value2) {
            addCriterion("sidflag between", value1, value2, "sidflag");
            return (Criteria) this;
        }

        public Criteria andSidflagNotBetween(String value1, String value2) {
            addCriterion("sidflag not between", value1, value2, "sidflag");
            return (Criteria) this;
        }

        public Criteria andEdurecordIsNull() {
            addCriterion("edurecord is null");
            return (Criteria) this;
        }

        public Criteria andEdurecordIsNotNull() {
            addCriterion("edurecord is not null");
            return (Criteria) this;
        }

        public Criteria andEdurecordEqualTo(String value) {
            addCriterion("edurecord =", value, "edurecord");
            return (Criteria) this;
        }

        public Criteria andEdurecordNotEqualTo(String value) {
            addCriterion("edurecord <>", value, "edurecord");
            return (Criteria) this;
        }

        public Criteria andEdurecordGreaterThan(String value) {
            addCriterion("edurecord >", value, "edurecord");
            return (Criteria) this;
        }

        public Criteria andEdurecordGreaterThanOrEqualTo(String value) {
            addCriterion("edurecord >=", value, "edurecord");
            return (Criteria) this;
        }

        public Criteria andEdurecordLessThan(String value) {
            addCriterion("edurecord <", value, "edurecord");
            return (Criteria) this;
        }

        public Criteria andEdurecordLessThanOrEqualTo(String value) {
            addCriterion("edurecord <=", value, "edurecord");
            return (Criteria) this;
        }

        public Criteria andEdurecordLike(String value) {
            addCriterion("edurecord like", value, "edurecord");
            return (Criteria) this;
        }

        public Criteria andEdurecordNotLike(String value) {
            addCriterion("edurecord not like", value, "edurecord");
            return (Criteria) this;
        }

        public Criteria andEdurecordIn(List<String> values) {
            addCriterion("edurecord in", values, "edurecord");
            return (Criteria) this;
        }

        public Criteria andEdurecordNotIn(List<String> values) {
            addCriterion("edurecord not in", values, "edurecord");
            return (Criteria) this;
        }

        public Criteria andEdurecordBetween(String value1, String value2) {
            addCriterion("edurecord between", value1, value2, "edurecord");
            return (Criteria) this;
        }

        public Criteria andEdurecordNotBetween(String value1, String value2) {
            addCriterion("edurecord not between", value1, value2, "edurecord");
            return (Criteria) this;
        }

        public Criteria andVerifytypeIsNull() {
            addCriterion("verifyType is null");
            return (Criteria) this;
        }

        public Criteria andVerifytypeIsNotNull() {
            addCriterion("verifyType is not null");
            return (Criteria) this;
        }

        public Criteria andVerifytypeEqualTo(String value) {
            addCriterion("verifyType =", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeNotEqualTo(String value) {
            addCriterion("verifyType <>", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeGreaterThan(String value) {
            addCriterion("verifyType >", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeGreaterThanOrEqualTo(String value) {
            addCriterion("verifyType >=", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeLessThan(String value) {
            addCriterion("verifyType <", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeLessThanOrEqualTo(String value) {
            addCriterion("verifyType <=", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeLike(String value) {
            addCriterion("verifyType like", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeNotLike(String value) {
            addCriterion("verifyType not like", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeIn(List<String> values) {
            addCriterion("verifyType in", values, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeNotIn(List<String> values) {
            addCriterion("verifyType not in", values, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeBetween(String value1, String value2) {
            addCriterion("verifyType between", value1, value2, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeNotBetween(String value1, String value2) {
            addCriterion("verifyType not between", value1, value2, "verifytype");
            return (Criteria) this;
        }

        public Criteria andHousenumberIsNull() {
            addCriterion("housenumber is null");
            return (Criteria) this;
        }

        public Criteria andHousenumberIsNotNull() {
            addCriterion("housenumber is not null");
            return (Criteria) this;
        }

        public Criteria andHousenumberEqualTo(String value) {
            addCriterion("housenumber =", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberNotEqualTo(String value) {
            addCriterion("housenumber <>", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberGreaterThan(String value) {
            addCriterion("housenumber >", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberGreaterThanOrEqualTo(String value) {
            addCriterion("housenumber >=", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberLessThan(String value) {
            addCriterion("housenumber <", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberLessThanOrEqualTo(String value) {
            addCriterion("housenumber <=", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberLike(String value) {
            addCriterion("housenumber like", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberNotLike(String value) {
            addCriterion("housenumber not like", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberIn(List<String> values) {
            addCriterion("housenumber in", values, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberNotIn(List<String> values) {
            addCriterion("housenumber not in", values, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberBetween(String value1, String value2) {
            addCriterion("housenumber between", value1, value2, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberNotBetween(String value1, String value2) {
            addCriterion("housenumber not between", value1, value2, "housenumber");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelIsNull() {
            addCriterion("NativePlaceTel is null");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelIsNotNull() {
            addCriterion("NativePlaceTel is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelEqualTo(String value) {
            addCriterion("NativePlaceTel =", value, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelNotEqualTo(String value) {
            addCriterion("NativePlaceTel <>", value, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelGreaterThan(String value) {
            addCriterion("NativePlaceTel >", value, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelGreaterThanOrEqualTo(String value) {
            addCriterion("NativePlaceTel >=", value, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelLessThan(String value) {
            addCriterion("NativePlaceTel <", value, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelLessThanOrEqualTo(String value) {
            addCriterion("NativePlaceTel <=", value, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelLike(String value) {
            addCriterion("NativePlaceTel like", value, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelNotLike(String value) {
            addCriterion("NativePlaceTel not like", value, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelIn(List<String> values) {
            addCriterion("NativePlaceTel in", values, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelNotIn(List<String> values) {
            addCriterion("NativePlaceTel not in", values, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelBetween(String value1, String value2) {
            addCriterion("NativePlaceTel between", value1, value2, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andNativeplacetelNotBetween(String value1, String value2) {
            addCriterion("NativePlaceTel not between", value1, value2, "nativeplacetel");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongIsNull() {
            addCriterion("FamilyTelBelong is null");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongIsNotNull() {
            addCriterion("FamilyTelBelong is not null");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongEqualTo(String value) {
            addCriterion("FamilyTelBelong =", value, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongNotEqualTo(String value) {
            addCriterion("FamilyTelBelong <>", value, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongGreaterThan(String value) {
            addCriterion("FamilyTelBelong >", value, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongGreaterThanOrEqualTo(String value) {
            addCriterion("FamilyTelBelong >=", value, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongLessThan(String value) {
            addCriterion("FamilyTelBelong <", value, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongLessThanOrEqualTo(String value) {
            addCriterion("FamilyTelBelong <=", value, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongLike(String value) {
            addCriterion("FamilyTelBelong like", value, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongNotLike(String value) {
            addCriterion("FamilyTelBelong not like", value, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongIn(List<String> values) {
            addCriterion("FamilyTelBelong in", values, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongNotIn(List<String> values) {
            addCriterion("FamilyTelBelong not in", values, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongBetween(String value1, String value2) {
            addCriterion("FamilyTelBelong between", value1, value2, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilytelbelongNotBetween(String value1, String value2) {
            addCriterion("FamilyTelBelong not between", value1, value2, "familytelbelong");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeIsNull() {
            addCriterion("FamilyBeginTime is null");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeIsNotNull() {
            addCriterion("FamilyBeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeEqualTo(String value) {
            addCriterion("FamilyBeginTime =", value, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeNotEqualTo(String value) {
            addCriterion("FamilyBeginTime <>", value, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeGreaterThan(String value) {
            addCriterion("FamilyBeginTime >", value, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("FamilyBeginTime >=", value, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeLessThan(String value) {
            addCriterion("FamilyBeginTime <", value, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeLessThanOrEqualTo(String value) {
            addCriterion("FamilyBeginTime <=", value, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeLike(String value) {
            addCriterion("FamilyBeginTime like", value, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeNotLike(String value) {
            addCriterion("FamilyBeginTime not like", value, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeIn(List<String> values) {
            addCriterion("FamilyBeginTime in", values, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeNotIn(List<String> values) {
            addCriterion("FamilyBeginTime not in", values, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeBetween(String value1, String value2) {
            addCriterion("FamilyBeginTime between", value1, value2, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andFamilybegintimeNotBetween(String value1, String value2) {
            addCriterion("FamilyBeginTime not between", value1, value2, "familybegintime");
            return (Criteria) this;
        }

        public Criteria andIsparentIsNull() {
            addCriterion("isparent is null");
            return (Criteria) this;
        }

        public Criteria andIsparentIsNotNull() {
            addCriterion("isparent is not null");
            return (Criteria) this;
        }

        public Criteria andIsparentEqualTo(String value) {
            addCriterion("isparent =", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentNotEqualTo(String value) {
            addCriterion("isparent <>", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentGreaterThan(String value) {
            addCriterion("isparent >", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentGreaterThanOrEqualTo(String value) {
            addCriterion("isparent >=", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentLessThan(String value) {
            addCriterion("isparent <", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentLessThanOrEqualTo(String value) {
            addCriterion("isparent <=", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentLike(String value) {
            addCriterion("isparent like", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentNotLike(String value) {
            addCriterion("isparent not like", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentIn(List<String> values) {
            addCriterion("isparent in", values, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentNotIn(List<String> values) {
            addCriterion("isparent not in", values, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentBetween(String value1, String value2) {
            addCriterion("isparent between", value1, value2, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentNotBetween(String value1, String value2) {
            addCriterion("isparent not between", value1, value2, "isparent");
            return (Criteria) this;
        }

        public Criteria andHousetypeIsNull() {
            addCriterion("housetype is null");
            return (Criteria) this;
        }

        public Criteria andHousetypeIsNotNull() {
            addCriterion("housetype is not null");
            return (Criteria) this;
        }

        public Criteria andHousetypeEqualTo(String value) {
            addCriterion("housetype =", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotEqualTo(String value) {
            addCriterion("housetype <>", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeGreaterThan(String value) {
            addCriterion("housetype >", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeGreaterThanOrEqualTo(String value) {
            addCriterion("housetype >=", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLessThan(String value) {
            addCriterion("housetype <", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLessThanOrEqualTo(String value) {
            addCriterion("housetype <=", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLike(String value) {
            addCriterion("housetype like", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotLike(String value) {
            addCriterion("housetype not like", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeIn(List<String> values) {
            addCriterion("housetype in", values, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotIn(List<String> values) {
            addCriterion("housetype not in", values, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeBetween(String value1, String value2) {
            addCriterion("housetype between", value1, value2, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotBetween(String value1, String value2) {
            addCriterion("housetype not between", value1, value2, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousepriceIsNull() {
            addCriterion("houseprice is null");
            return (Criteria) this;
        }

        public Criteria andHousepriceIsNotNull() {
            addCriterion("houseprice is not null");
            return (Criteria) this;
        }

        public Criteria andHousepriceEqualTo(BigDecimal value) {
            addCriterion("houseprice =", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotEqualTo(BigDecimal value) {
            addCriterion("houseprice <>", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceGreaterThan(BigDecimal value) {
            addCriterion("houseprice >", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("houseprice >=", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceLessThan(BigDecimal value) {
            addCriterion("houseprice <", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("houseprice <=", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceIn(List<BigDecimal> values) {
            addCriterion("houseprice in", values, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotIn(List<BigDecimal> values) {
            addCriterion("houseprice not in", values, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("houseprice between", value1, value2, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("houseprice not between", value1, value2, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousesizeIsNull() {
            addCriterion("housesize is null");
            return (Criteria) this;
        }

        public Criteria andHousesizeIsNotNull() {
            addCriterion("housesize is not null");
            return (Criteria) this;
        }

        public Criteria andHousesizeEqualTo(BigDecimal value) {
            addCriterion("housesize =", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeNotEqualTo(BigDecimal value) {
            addCriterion("housesize <>", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeGreaterThan(BigDecimal value) {
            addCriterion("housesize >", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("housesize >=", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeLessThan(BigDecimal value) {
            addCriterion("housesize <", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("housesize <=", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeIn(List<BigDecimal> values) {
            addCriterion("housesize in", values, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeNotIn(List<BigDecimal> values) {
            addCriterion("housesize not in", values, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housesize between", value1, value2, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housesize not between", value1, value2, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousemonthIsNull() {
            addCriterion("housemonth is null");
            return (Criteria) this;
        }

        public Criteria andHousemonthIsNotNull() {
            addCriterion("housemonth is not null");
            return (Criteria) this;
        }

        public Criteria andHousemonthEqualTo(BigDecimal value) {
            addCriterion("housemonth =", value, "housemonth");
            return (Criteria) this;
        }

        public Criteria andHousemonthNotEqualTo(BigDecimal value) {
            addCriterion("housemonth <>", value, "housemonth");
            return (Criteria) this;
        }

        public Criteria andHousemonthGreaterThan(BigDecimal value) {
            addCriterion("housemonth >", value, "housemonth");
            return (Criteria) this;
        }

        public Criteria andHousemonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("housemonth >=", value, "housemonth");
            return (Criteria) this;
        }

        public Criteria andHousemonthLessThan(BigDecimal value) {
            addCriterion("housemonth <", value, "housemonth");
            return (Criteria) this;
        }

        public Criteria andHousemonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("housemonth <=", value, "housemonth");
            return (Criteria) this;
        }

        public Criteria andHousemonthIn(List<BigDecimal> values) {
            addCriterion("housemonth in", values, "housemonth");
            return (Criteria) this;
        }

        public Criteria andHousemonthNotIn(List<BigDecimal> values) {
            addCriterion("housemonth not in", values, "housemonth");
            return (Criteria) this;
        }

        public Criteria andHousemonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housemonth between", value1, value2, "housemonth");
            return (Criteria) this;
        }

        public Criteria andHousemonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housemonth not between", value1, value2, "housemonth");
            return (Criteria) this;
        }

        public Criteria andHousetimeIsNull() {
            addCriterion("housetime is null");
            return (Criteria) this;
        }

        public Criteria andHousetimeIsNotNull() {
            addCriterion("housetime is not null");
            return (Criteria) this;
        }

        public Criteria andHousetimeEqualTo(String value) {
            addCriterion("housetime =", value, "housetime");
            return (Criteria) this;
        }

        public Criteria andHousetimeNotEqualTo(String value) {
            addCriterion("housetime <>", value, "housetime");
            return (Criteria) this;
        }

        public Criteria andHousetimeGreaterThan(String value) {
            addCriterion("housetime >", value, "housetime");
            return (Criteria) this;
        }

        public Criteria andHousetimeGreaterThanOrEqualTo(String value) {
            addCriterion("housetime >=", value, "housetime");
            return (Criteria) this;
        }

        public Criteria andHousetimeLessThan(String value) {
            addCriterion("housetime <", value, "housetime");
            return (Criteria) this;
        }

        public Criteria andHousetimeLessThanOrEqualTo(String value) {
            addCriterion("housetime <=", value, "housetime");
            return (Criteria) this;
        }

        public Criteria andHousetimeLike(String value) {
            addCriterion("housetime like", value, "housetime");
            return (Criteria) this;
        }

        public Criteria andHousetimeNotLike(String value) {
            addCriterion("housetime not like", value, "housetime");
            return (Criteria) this;
        }

        public Criteria andHousetimeIn(List<String> values) {
            addCriterion("housetime in", values, "housetime");
            return (Criteria) this;
        }

        public Criteria andHousetimeNotIn(List<String> values) {
            addCriterion("housetime not in", values, "housetime");
            return (Criteria) this;
        }

        public Criteria andHousetimeBetween(String value1, String value2) {
            addCriterion("housetime between", value1, value2, "housetime");
            return (Criteria) this;
        }

        public Criteria andHousetimeNotBetween(String value1, String value2) {
            addCriterion("housetime not between", value1, value2, "housetime");
            return (Criteria) this;
        }

        public Criteria andProvenceIsNull() {
            addCriterion("provence is null");
            return (Criteria) this;
        }

        public Criteria andProvenceIsNotNull() {
            addCriterion("provence is not null");
            return (Criteria) this;
        }

        public Criteria andProvenceEqualTo(String value) {
            addCriterion("provence =", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotEqualTo(String value) {
            addCriterion("provence <>", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceGreaterThan(String value) {
            addCriterion("provence >", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceGreaterThanOrEqualTo(String value) {
            addCriterion("provence >=", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceLessThan(String value) {
            addCriterion("provence <", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceLessThanOrEqualTo(String value) {
            addCriterion("provence <=", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceLike(String value) {
            addCriterion("provence like", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotLike(String value) {
            addCriterion("provence not like", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceIn(List<String> values) {
            addCriterion("provence in", values, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotIn(List<String> values) {
            addCriterion("provence not in", values, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceBetween(String value1, String value2) {
            addCriterion("provence between", value1, value2, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotBetween(String value1, String value2) {
            addCriterion("provence not between", value1, value2, "provence");
            return (Criteria) this;
        }

        public Criteria andProvencenameIsNull() {
            addCriterion("provenceName is null");
            return (Criteria) this;
        }

        public Criteria andProvencenameIsNotNull() {
            addCriterion("provenceName is not null");
            return (Criteria) this;
        }

        public Criteria andProvencenameEqualTo(String value) {
            addCriterion("provenceName =", value, "provencename");
            return (Criteria) this;
        }

        public Criteria andProvencenameNotEqualTo(String value) {
            addCriterion("provenceName <>", value, "provencename");
            return (Criteria) this;
        }

        public Criteria andProvencenameGreaterThan(String value) {
            addCriterion("provenceName >", value, "provencename");
            return (Criteria) this;
        }

        public Criteria andProvencenameGreaterThanOrEqualTo(String value) {
            addCriterion("provenceName >=", value, "provencename");
            return (Criteria) this;
        }

        public Criteria andProvencenameLessThan(String value) {
            addCriterion("provenceName <", value, "provencename");
            return (Criteria) this;
        }

        public Criteria andProvencenameLessThanOrEqualTo(String value) {
            addCriterion("provenceName <=", value, "provencename");
            return (Criteria) this;
        }

        public Criteria andProvencenameLike(String value) {
            addCriterion("provenceName like", value, "provencename");
            return (Criteria) this;
        }

        public Criteria andProvencenameNotLike(String value) {
            addCriterion("provenceName not like", value, "provencename");
            return (Criteria) this;
        }

        public Criteria andProvencenameIn(List<String> values) {
            addCriterion("provenceName in", values, "provencename");
            return (Criteria) this;
        }

        public Criteria andProvencenameNotIn(List<String> values) {
            addCriterion("provenceName not in", values, "provencename");
            return (Criteria) this;
        }

        public Criteria andProvencenameBetween(String value1, String value2) {
            addCriterion("provenceName between", value1, value2, "provencename");
            return (Criteria) this;
        }

        public Criteria andProvencenameNotBetween(String value1, String value2) {
            addCriterion("provenceName not between", value1, value2, "provencename");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("cityname is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("cityname is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("cityname =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("cityname <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("cityname >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("cityname >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("cityname <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("cityname <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("cityname like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("cityname not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("cityname in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("cityname not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("cityname between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("cityname not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("areaName is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("areaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("areaName =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("areaName <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("areaName >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("areaName >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("areaName <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("areaName <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("areaName like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("areaName not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("areaName in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("areaName not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("areaName between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("areaName not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andHouseaddIsNull() {
            addCriterion("houseadd is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddIsNotNull() {
            addCriterion("houseadd is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddEqualTo(String value) {
            addCriterion("houseadd =", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotEqualTo(String value) {
            addCriterion("houseadd <>", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddGreaterThan(String value) {
            addCriterion("houseadd >", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddGreaterThanOrEqualTo(String value) {
            addCriterion("houseadd >=", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddLessThan(String value) {
            addCriterion("houseadd <", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddLessThanOrEqualTo(String value) {
            addCriterion("houseadd <=", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddLike(String value) {
            addCriterion("houseadd like", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotLike(String value) {
            addCriterion("houseadd not like", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddIn(List<String> values) {
            addCriterion("houseadd in", values, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotIn(List<String> values) {
            addCriterion("houseadd not in", values, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddBetween(String value1, String value2) {
            addCriterion("houseadd between", value1, value2, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotBetween(String value1, String value2) {
            addCriterion("houseadd not between", value1, value2, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHousezipIsNull() {
            addCriterion("housezip is null");
            return (Criteria) this;
        }

        public Criteria andHousezipIsNotNull() {
            addCriterion("housezip is not null");
            return (Criteria) this;
        }

        public Criteria andHousezipEqualTo(String value) {
            addCriterion("housezip =", value, "housezip");
            return (Criteria) this;
        }

        public Criteria andHousezipNotEqualTo(String value) {
            addCriterion("housezip <>", value, "housezip");
            return (Criteria) this;
        }

        public Criteria andHousezipGreaterThan(String value) {
            addCriterion("housezip >", value, "housezip");
            return (Criteria) this;
        }

        public Criteria andHousezipGreaterThanOrEqualTo(String value) {
            addCriterion("housezip >=", value, "housezip");
            return (Criteria) this;
        }

        public Criteria andHousezipLessThan(String value) {
            addCriterion("housezip <", value, "housezip");
            return (Criteria) this;
        }

        public Criteria andHousezipLessThanOrEqualTo(String value) {
            addCriterion("housezip <=", value, "housezip");
            return (Criteria) this;
        }

        public Criteria andHousezipLike(String value) {
            addCriterion("housezip like", value, "housezip");
            return (Criteria) this;
        }

        public Criteria andHousezipNotLike(String value) {
            addCriterion("housezip not like", value, "housezip");
            return (Criteria) this;
        }

        public Criteria andHousezipIn(List<String> values) {
            addCriterion("housezip in", values, "housezip");
            return (Criteria) this;
        }

        public Criteria andHousezipNotIn(List<String> values) {
            addCriterion("housezip not in", values, "housezip");
            return (Criteria) this;
        }

        public Criteria andHousezipBetween(String value1, String value2) {
            addCriterion("housezip between", value1, value2, "housezip");
            return (Criteria) this;
        }

        public Criteria andHousezipNotBetween(String value1, String value2) {
            addCriterion("housezip not between", value1, value2, "housezip");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIsNull() {
            addCriterion("entrytime is null");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIsNotNull() {
            addCriterion("entrytime is not null");
            return (Criteria) this;
        }

        public Criteria andEntrytimeEqualTo(String value) {
            addCriterion("entrytime =", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotEqualTo(String value) {
            addCriterion("entrytime <>", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeGreaterThan(String value) {
            addCriterion("entrytime >", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeGreaterThanOrEqualTo(String value) {
            addCriterion("entrytime >=", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeLessThan(String value) {
            addCriterion("entrytime <", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeLessThanOrEqualTo(String value) {
            addCriterion("entrytime <=", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeLike(String value) {
            addCriterion("entrytime like", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotLike(String value) {
            addCriterion("entrytime not like", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIn(List<String> values) {
            addCriterion("entrytime in", values, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotIn(List<String> values) {
            addCriterion("entrytime not in", values, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeBetween(String value1, String value2) {
            addCriterion("entrytime between", value1, value2, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotBetween(String value1, String value2) {
            addCriterion("entrytime not between", value1, value2, "entrytime");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andWorktel2IsNull() {
            addCriterion("WorkTel2 is null");
            return (Criteria) this;
        }

        public Criteria andWorktel2IsNotNull() {
            addCriterion("WorkTel2 is not null");
            return (Criteria) this;
        }

        public Criteria andWorktel2EqualTo(String value) {
            addCriterion("WorkTel2 =", value, "worktel2");
            return (Criteria) this;
        }

        public Criteria andWorktel2NotEqualTo(String value) {
            addCriterion("WorkTel2 <>", value, "worktel2");
            return (Criteria) this;
        }

        public Criteria andWorktel2GreaterThan(String value) {
            addCriterion("WorkTel2 >", value, "worktel2");
            return (Criteria) this;
        }

        public Criteria andWorktel2GreaterThanOrEqualTo(String value) {
            addCriterion("WorkTel2 >=", value, "worktel2");
            return (Criteria) this;
        }

        public Criteria andWorktel2LessThan(String value) {
            addCriterion("WorkTel2 <", value, "worktel2");
            return (Criteria) this;
        }

        public Criteria andWorktel2LessThanOrEqualTo(String value) {
            addCriterion("WorkTel2 <=", value, "worktel2");
            return (Criteria) this;
        }

        public Criteria andWorktel2Like(String value) {
            addCriterion("WorkTel2 like", value, "worktel2");
            return (Criteria) this;
        }

        public Criteria andWorktel2NotLike(String value) {
            addCriterion("WorkTel2 not like", value, "worktel2");
            return (Criteria) this;
        }

        public Criteria andWorktel2In(List<String> values) {
            addCriterion("WorkTel2 in", values, "worktel2");
            return (Criteria) this;
        }

        public Criteria andWorktel2NotIn(List<String> values) {
            addCriterion("WorkTel2 not in", values, "worktel2");
            return (Criteria) this;
        }

        public Criteria andWorktel2Between(String value1, String value2) {
            addCriterion("WorkTel2 between", value1, value2, "worktel2");
            return (Criteria) this;
        }

        public Criteria andWorktel2NotBetween(String value1, String value2) {
            addCriterion("WorkTel2 not between", value1, value2, "worktel2");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayIsNull() {
            addCriterion("monthpayday is null");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayIsNotNull() {
            addCriterion("monthpayday is not null");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayEqualTo(String value) {
            addCriterion("monthpayday =", value, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayNotEqualTo(String value) {
            addCriterion("monthpayday <>", value, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayGreaterThan(String value) {
            addCriterion("monthpayday >", value, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayGreaterThanOrEqualTo(String value) {
            addCriterion("monthpayday >=", value, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayLessThan(String value) {
            addCriterion("monthpayday <", value, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayLessThanOrEqualTo(String value) {
            addCriterion("monthpayday <=", value, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayLike(String value) {
            addCriterion("monthpayday like", value, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayNotLike(String value) {
            addCriterion("monthpayday not like", value, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayIn(List<String> values) {
            addCriterion("monthpayday in", values, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayNotIn(List<String> values) {
            addCriterion("monthpayday not in", values, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayBetween(String value1, String value2) {
            addCriterion("monthpayday between", value1, value2, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andMonthpaydayNotBetween(String value1, String value2) {
            addCriterion("monthpayday not between", value1, value2, "monthpayday");
            return (Criteria) this;
        }

        public Criteria andBonusincomeIsNull() {
            addCriterion("bonusincome is null");
            return (Criteria) this;
        }

        public Criteria andBonusincomeIsNotNull() {
            addCriterion("bonusincome is not null");
            return (Criteria) this;
        }

        public Criteria andBonusincomeEqualTo(BigDecimal value) {
            addCriterion("bonusincome =", value, "bonusincome");
            return (Criteria) this;
        }

        public Criteria andBonusincomeNotEqualTo(BigDecimal value) {
            addCriterion("bonusincome <>", value, "bonusincome");
            return (Criteria) this;
        }

        public Criteria andBonusincomeGreaterThan(BigDecimal value) {
            addCriterion("bonusincome >", value, "bonusincome");
            return (Criteria) this;
        }

        public Criteria andBonusincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bonusincome >=", value, "bonusincome");
            return (Criteria) this;
        }

        public Criteria andBonusincomeLessThan(BigDecimal value) {
            addCriterion("bonusincome <", value, "bonusincome");
            return (Criteria) this;
        }

        public Criteria andBonusincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bonusincome <=", value, "bonusincome");
            return (Criteria) this;
        }

        public Criteria andBonusincomeIn(List<BigDecimal> values) {
            addCriterion("bonusincome in", values, "bonusincome");
            return (Criteria) this;
        }

        public Criteria andBonusincomeNotIn(List<BigDecimal> values) {
            addCriterion("bonusincome not in", values, "bonusincome");
            return (Criteria) this;
        }

        public Criteria andBonusincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonusincome between", value1, value2, "bonusincome");
            return (Criteria) this;
        }

        public Criteria andBonusincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonusincome not between", value1, value2, "bonusincome");
            return (Criteria) this;
        }

        public Criteria andIssueformIsNull() {
            addCriterion("issueform is null");
            return (Criteria) this;
        }

        public Criteria andIssueformIsNotNull() {
            addCriterion("issueform is not null");
            return (Criteria) this;
        }

        public Criteria andIssueformEqualTo(String value) {
            addCriterion("issueform =", value, "issueform");
            return (Criteria) this;
        }

        public Criteria andIssueformNotEqualTo(String value) {
            addCriterion("issueform <>", value, "issueform");
            return (Criteria) this;
        }

        public Criteria andIssueformGreaterThan(String value) {
            addCriterion("issueform >", value, "issueform");
            return (Criteria) this;
        }

        public Criteria andIssueformGreaterThanOrEqualTo(String value) {
            addCriterion("issueform >=", value, "issueform");
            return (Criteria) this;
        }

        public Criteria andIssueformLessThan(String value) {
            addCriterion("issueform <", value, "issueform");
            return (Criteria) this;
        }

        public Criteria andIssueformLessThanOrEqualTo(String value) {
            addCriterion("issueform <=", value, "issueform");
            return (Criteria) this;
        }

        public Criteria andIssueformLike(String value) {
            addCriterion("issueform like", value, "issueform");
            return (Criteria) this;
        }

        public Criteria andIssueformNotLike(String value) {
            addCriterion("issueform not like", value, "issueform");
            return (Criteria) this;
        }

        public Criteria andIssueformIn(List<String> values) {
            addCriterion("issueform in", values, "issueform");
            return (Criteria) this;
        }

        public Criteria andIssueformNotIn(List<String> values) {
            addCriterion("issueform not in", values, "issueform");
            return (Criteria) this;
        }

        public Criteria andIssueformBetween(String value1, String value2) {
            addCriterion("issueform between", value1, value2, "issueform");
            return (Criteria) this;
        }

        public Criteria andIssueformNotBetween(String value1, String value2) {
            addCriterion("issueform not between", value1, value2, "issueform");
            return (Criteria) this;
        }

        public Criteria andSourceincomeIsNull() {
            addCriterion("sourceincome is null");
            return (Criteria) this;
        }

        public Criteria andSourceincomeIsNotNull() {
            addCriterion("sourceincome is not null");
            return (Criteria) this;
        }

        public Criteria andSourceincomeEqualTo(String value) {
            addCriterion("sourceincome =", value, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andSourceincomeNotEqualTo(String value) {
            addCriterion("sourceincome <>", value, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andSourceincomeGreaterThan(String value) {
            addCriterion("sourceincome >", value, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andSourceincomeGreaterThanOrEqualTo(String value) {
            addCriterion("sourceincome >=", value, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andSourceincomeLessThan(String value) {
            addCriterion("sourceincome <", value, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andSourceincomeLessThanOrEqualTo(String value) {
            addCriterion("sourceincome <=", value, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andSourceincomeLike(String value) {
            addCriterion("sourceincome like", value, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andSourceincomeNotLike(String value) {
            addCriterion("sourceincome not like", value, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andSourceincomeIn(List<String> values) {
            addCriterion("sourceincome in", values, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andSourceincomeNotIn(List<String> values) {
            addCriterion("sourceincome not in", values, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andSourceincomeBetween(String value1, String value2) {
            addCriterion("sourceincome between", value1, value2, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andSourceincomeNotBetween(String value1, String value2) {
            addCriterion("sourceincome not between", value1, value2, "sourceincome");
            return (Criteria) this;
        }

        public Criteria andChangenumberIsNull() {
            addCriterion("changenumber is null");
            return (Criteria) this;
        }

        public Criteria andChangenumberIsNotNull() {
            addCriterion("changenumber is not null");
            return (Criteria) this;
        }

        public Criteria andChangenumberEqualTo(String value) {
            addCriterion("changenumber =", value, "changenumber");
            return (Criteria) this;
        }

        public Criteria andChangenumberNotEqualTo(String value) {
            addCriterion("changenumber <>", value, "changenumber");
            return (Criteria) this;
        }

        public Criteria andChangenumberGreaterThan(String value) {
            addCriterion("changenumber >", value, "changenumber");
            return (Criteria) this;
        }

        public Criteria andChangenumberGreaterThanOrEqualTo(String value) {
            addCriterion("changenumber >=", value, "changenumber");
            return (Criteria) this;
        }

        public Criteria andChangenumberLessThan(String value) {
            addCriterion("changenumber <", value, "changenumber");
            return (Criteria) this;
        }

        public Criteria andChangenumberLessThanOrEqualTo(String value) {
            addCriterion("changenumber <=", value, "changenumber");
            return (Criteria) this;
        }

        public Criteria andChangenumberLike(String value) {
            addCriterion("changenumber like", value, "changenumber");
            return (Criteria) this;
        }

        public Criteria andChangenumberNotLike(String value) {
            addCriterion("changenumber not like", value, "changenumber");
            return (Criteria) this;
        }

        public Criteria andChangenumberIn(List<String> values) {
            addCriterion("changenumber in", values, "changenumber");
            return (Criteria) this;
        }

        public Criteria andChangenumberNotIn(List<String> values) {
            addCriterion("changenumber not in", values, "changenumber");
            return (Criteria) this;
        }

        public Criteria andChangenumberBetween(String value1, String value2) {
            addCriterion("changenumber between", value1, value2, "changenumber");
            return (Criteria) this;
        }

        public Criteria andChangenumberNotBetween(String value1, String value2) {
            addCriterion("changenumber not between", value1, value2, "changenumber");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1IsNull() {
            addCriterion("WORKCORP1 is null");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1IsNotNull() {
            addCriterion("WORKCORP1 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1EqualTo(String value) {
            addCriterion("WORKCORP1 =", value, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1NotEqualTo(String value) {
            addCriterion("WORKCORP1 <>", value, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1GreaterThan(String value) {
            addCriterion("WORKCORP1 >", value, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1GreaterThanOrEqualTo(String value) {
            addCriterion("WORKCORP1 >=", value, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1LessThan(String value) {
            addCriterion("WORKCORP1 <", value, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1LessThanOrEqualTo(String value) {
            addCriterion("WORKCORP1 <=", value, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1Like(String value) {
            addCriterion("WORKCORP1 like", value, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1NotLike(String value) {
            addCriterion("WORKCORP1 not like", value, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1In(List<String> values) {
            addCriterion("WORKCORP1 in", values, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1NotIn(List<String> values) {
            addCriterion("WORKCORP1 not in", values, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1Between(String value1, String value2) {
            addCriterion("WORKCORP1 between", value1, value2, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorkcorp1NotBetween(String value1, String value2) {
            addCriterion("WORKCORP1 not between", value1, value2, "workcorp1");
            return (Criteria) this;
        }

        public Criteria andWorktel1IsNull() {
            addCriterion("WORKTEL1 is null");
            return (Criteria) this;
        }

        public Criteria andWorktel1IsNotNull() {
            addCriterion("WORKTEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andWorktel1EqualTo(String value) {
            addCriterion("WORKTEL1 =", value, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorktel1NotEqualTo(String value) {
            addCriterion("WORKTEL1 <>", value, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorktel1GreaterThan(String value) {
            addCriterion("WORKTEL1 >", value, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorktel1GreaterThanOrEqualTo(String value) {
            addCriterion("WORKTEL1 >=", value, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorktel1LessThan(String value) {
            addCriterion("WORKTEL1 <", value, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorktel1LessThanOrEqualTo(String value) {
            addCriterion("WORKTEL1 <=", value, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorktel1Like(String value) {
            addCriterion("WORKTEL1 like", value, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorktel1NotLike(String value) {
            addCriterion("WORKTEL1 not like", value, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorktel1In(List<String> values) {
            addCriterion("WORKTEL1 in", values, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorktel1NotIn(List<String> values) {
            addCriterion("WORKTEL1 not in", values, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorktel1Between(String value1, String value2) {
            addCriterion("WORKTEL1 between", value1, value2, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorktel1NotBetween(String value1, String value2) {
            addCriterion("WORKTEL1 not between", value1, value2, "worktel1");
            return (Criteria) this;
        }

        public Criteria andWorkage1IsNull() {
            addCriterion("WORKAGE1 is null");
            return (Criteria) this;
        }

        public Criteria andWorkage1IsNotNull() {
            addCriterion("WORKAGE1 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkage1EqualTo(String value) {
            addCriterion("WORKAGE1 =", value, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkage1NotEqualTo(String value) {
            addCriterion("WORKAGE1 <>", value, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkage1GreaterThan(String value) {
            addCriterion("WORKAGE1 >", value, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkage1GreaterThanOrEqualTo(String value) {
            addCriterion("WORKAGE1 >=", value, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkage1LessThan(String value) {
            addCriterion("WORKAGE1 <", value, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkage1LessThanOrEqualTo(String value) {
            addCriterion("WORKAGE1 <=", value, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkage1Like(String value) {
            addCriterion("WORKAGE1 like", value, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkage1NotLike(String value) {
            addCriterion("WORKAGE1 not like", value, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkage1In(List<String> values) {
            addCriterion("WORKAGE1 in", values, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkage1NotIn(List<String> values) {
            addCriterion("WORKAGE1 not in", values, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkage1Between(String value1, String value2) {
            addCriterion("WORKAGE1 between", value1, value2, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkage1NotBetween(String value1, String value2) {
            addCriterion("WORKAGE1 not between", value1, value2, "workage1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1IsNull() {
            addCriterion("WORKADD1 is null");
            return (Criteria) this;
        }

        public Criteria andWorkadd1IsNotNull() {
            addCriterion("WORKADD1 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkadd1EqualTo(String value) {
            addCriterion("WORKADD1 =", value, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1NotEqualTo(String value) {
            addCriterion("WORKADD1 <>", value, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1GreaterThan(String value) {
            addCriterion("WORKADD1 >", value, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1GreaterThanOrEqualTo(String value) {
            addCriterion("WORKADD1 >=", value, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1LessThan(String value) {
            addCriterion("WORKADD1 <", value, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1LessThanOrEqualTo(String value) {
            addCriterion("WORKADD1 <=", value, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1Like(String value) {
            addCriterion("WORKADD1 like", value, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1NotLike(String value) {
            addCriterion("WORKADD1 not like", value, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1In(List<String> values) {
            addCriterion("WORKADD1 in", values, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1NotIn(List<String> values) {
            addCriterion("WORKADD1 not in", values, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1Between(String value1, String value2) {
            addCriterion("WORKADD1 between", value1, value2, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkadd1NotBetween(String value1, String value2) {
            addCriterion("WORKADD1 not between", value1, value2, "workadd1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1IsNull() {
            addCriterion("WORKZIP1 is null");
            return (Criteria) this;
        }

        public Criteria andWorkzip1IsNotNull() {
            addCriterion("WORKZIP1 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkzip1EqualTo(String value) {
            addCriterion("WORKZIP1 =", value, "workzip1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1NotEqualTo(String value) {
            addCriterion("WORKZIP1 <>", value, "workzip1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1GreaterThan(String value) {
            addCriterion("WORKZIP1 >", value, "workzip1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1GreaterThanOrEqualTo(String value) {
            addCriterion("WORKZIP1 >=", value, "workzip1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1LessThan(String value) {
            addCriterion("WORKZIP1 <", value, "workzip1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1LessThanOrEqualTo(String value) {
            addCriterion("WORKZIP1 <=", value, "workzip1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1Like(String value) {
            addCriterion("WORKZIP1 like", value, "workzip1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1NotLike(String value) {
            addCriterion("WORKZIP1 not like", value, "workzip1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1In(List<String> values) {
            addCriterion("WORKZIP1 in", values, "workzip1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1NotIn(List<String> values) {
            addCriterion("WORKZIP1 not in", values, "workzip1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1Between(String value1, String value2) {
            addCriterion("WORKZIP1 between", value1, value2, "workzip1");
            return (Criteria) this;
        }

        public Criteria andWorkzip1NotBetween(String value1, String value2) {
            addCriterion("WORKZIP1 not between", value1, value2, "workzip1");
            return (Criteria) this;
        }

        public Criteria andNativezipIsNull() {
            addCriterion("NATIVEZIP is null");
            return (Criteria) this;
        }

        public Criteria andNativezipIsNotNull() {
            addCriterion("NATIVEZIP is not null");
            return (Criteria) this;
        }

        public Criteria andNativezipEqualTo(String value) {
            addCriterion("NATIVEZIP =", value, "nativezip");
            return (Criteria) this;
        }

        public Criteria andNativezipNotEqualTo(String value) {
            addCriterion("NATIVEZIP <>", value, "nativezip");
            return (Criteria) this;
        }

        public Criteria andNativezipGreaterThan(String value) {
            addCriterion("NATIVEZIP >", value, "nativezip");
            return (Criteria) this;
        }

        public Criteria andNativezipGreaterThanOrEqualTo(String value) {
            addCriterion("NATIVEZIP >=", value, "nativezip");
            return (Criteria) this;
        }

        public Criteria andNativezipLessThan(String value) {
            addCriterion("NATIVEZIP <", value, "nativezip");
            return (Criteria) this;
        }

        public Criteria andNativezipLessThanOrEqualTo(String value) {
            addCriterion("NATIVEZIP <=", value, "nativezip");
            return (Criteria) this;
        }

        public Criteria andNativezipLike(String value) {
            addCriterion("NATIVEZIP like", value, "nativezip");
            return (Criteria) this;
        }

        public Criteria andNativezipNotLike(String value) {
            addCriterion("NATIVEZIP not like", value, "nativezip");
            return (Criteria) this;
        }

        public Criteria andNativezipIn(List<String> values) {
            addCriterion("NATIVEZIP in", values, "nativezip");
            return (Criteria) this;
        }

        public Criteria andNativezipNotIn(List<String> values) {
            addCriterion("NATIVEZIP not in", values, "nativezip");
            return (Criteria) this;
        }

        public Criteria andNativezipBetween(String value1, String value2) {
            addCriterion("NATIVEZIP between", value1, value2, "nativezip");
            return (Criteria) this;
        }

        public Criteria andNativezipNotBetween(String value1, String value2) {
            addCriterion("NATIVEZIP not between", value1, value2, "nativezip");
            return (Criteria) this;
        }

        public Criteria andRentIsNull() {
            addCriterion("RENT is null");
            return (Criteria) this;
        }

        public Criteria andRentIsNotNull() {
            addCriterion("RENT is not null");
            return (Criteria) this;
        }

        public Criteria andRentEqualTo(BigDecimal value) {
            addCriterion("RENT =", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotEqualTo(BigDecimal value) {
            addCriterion("RENT <>", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThan(BigDecimal value) {
            addCriterion("RENT >", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENT >=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThan(BigDecimal value) {
            addCriterion("RENT <", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENT <=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentIn(List<BigDecimal> values) {
            addCriterion("RENT in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotIn(List<BigDecimal> values) {
            addCriterion("RENT not in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENT between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENT not between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andMarketvalueIsNull() {
            addCriterion("MARKETVALUE is null");
            return (Criteria) this;
        }

        public Criteria andMarketvalueIsNotNull() {
            addCriterion("MARKETVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMarketvalueEqualTo(BigDecimal value) {
            addCriterion("MARKETVALUE =", value, "marketvalue");
            return (Criteria) this;
        }

        public Criteria andMarketvalueNotEqualTo(BigDecimal value) {
            addCriterion("MARKETVALUE <>", value, "marketvalue");
            return (Criteria) this;
        }

        public Criteria andMarketvalueGreaterThan(BigDecimal value) {
            addCriterion("MARKETVALUE >", value, "marketvalue");
            return (Criteria) this;
        }

        public Criteria andMarketvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MARKETVALUE >=", value, "marketvalue");
            return (Criteria) this;
        }

        public Criteria andMarketvalueLessThan(BigDecimal value) {
            addCriterion("MARKETVALUE <", value, "marketvalue");
            return (Criteria) this;
        }

        public Criteria andMarketvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MARKETVALUE <=", value, "marketvalue");
            return (Criteria) this;
        }

        public Criteria andMarketvalueIn(List<BigDecimal> values) {
            addCriterion("MARKETVALUE in", values, "marketvalue");
            return (Criteria) this;
        }

        public Criteria andMarketvalueNotIn(List<BigDecimal> values) {
            addCriterion("MARKETVALUE not in", values, "marketvalue");
            return (Criteria) this;
        }

        public Criteria andMarketvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARKETVALUE between", value1, value2, "marketvalue");
            return (Criteria) this;
        }

        public Criteria andMarketvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARKETVALUE not between", value1, value2, "marketvalue");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthIsNull() {
            addCriterion("HOMELOANMONTH is null");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthIsNotNull() {
            addCriterion("HOMELOANMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthEqualTo(String value) {
            addCriterion("HOMELOANMONTH =", value, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthNotEqualTo(String value) {
            addCriterion("HOMELOANMONTH <>", value, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthGreaterThan(String value) {
            addCriterion("HOMELOANMONTH >", value, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthGreaterThanOrEqualTo(String value) {
            addCriterion("HOMELOANMONTH >=", value, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthLessThan(String value) {
            addCriterion("HOMELOANMONTH <", value, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthLessThanOrEqualTo(String value) {
            addCriterion("HOMELOANMONTH <=", value, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthLike(String value) {
            addCriterion("HOMELOANMONTH like", value, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthNotLike(String value) {
            addCriterion("HOMELOANMONTH not like", value, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthIn(List<String> values) {
            addCriterion("HOMELOANMONTH in", values, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthNotIn(List<String> values) {
            addCriterion("HOMELOANMONTH not in", values, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthBetween(String value1, String value2) {
            addCriterion("HOMELOANMONTH between", value1, value2, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andHomeloanmonthNotBetween(String value1, String value2) {
            addCriterion("HOMELOANMONTH not between", value1, value2, "homeloanmonth");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyIsNull() {
            addCriterion("INSURANCECOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyIsNotNull() {
            addCriterion("INSURANCECOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyEqualTo(String value) {
            addCriterion("INSURANCECOMPANY =", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyNotEqualTo(String value) {
            addCriterion("INSURANCECOMPANY <>", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyGreaterThan(String value) {
            addCriterion("INSURANCECOMPANY >", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCECOMPANY >=", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyLessThan(String value) {
            addCriterion("INSURANCECOMPANY <", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyLessThanOrEqualTo(String value) {
            addCriterion("INSURANCECOMPANY <=", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyLike(String value) {
            addCriterion("INSURANCECOMPANY like", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyNotLike(String value) {
            addCriterion("INSURANCECOMPANY not like", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyIn(List<String> values) {
            addCriterion("INSURANCECOMPANY in", values, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyNotIn(List<String> values) {
            addCriterion("INSURANCECOMPANY not in", values, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyBetween(String value1, String value2) {
            addCriterion("INSURANCECOMPANY between", value1, value2, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyNotBetween(String value1, String value2) {
            addCriterion("INSURANCECOMPANY not between", value1, value2, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationIsNull() {
            addCriterion("INSUREDLOCATION is null");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationIsNotNull() {
            addCriterion("INSUREDLOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationEqualTo(String value) {
            addCriterion("INSUREDLOCATION =", value, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationNotEqualTo(String value) {
            addCriterion("INSUREDLOCATION <>", value, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationGreaterThan(String value) {
            addCriterion("INSUREDLOCATION >", value, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDLOCATION >=", value, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationLessThan(String value) {
            addCriterion("INSUREDLOCATION <", value, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationLessThanOrEqualTo(String value) {
            addCriterion("INSUREDLOCATION <=", value, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationLike(String value) {
            addCriterion("INSUREDLOCATION like", value, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationNotLike(String value) {
            addCriterion("INSUREDLOCATION not like", value, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationIn(List<String> values) {
            addCriterion("INSUREDLOCATION in", values, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationNotIn(List<String> values) {
            addCriterion("INSUREDLOCATION not in", values, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationBetween(String value1, String value2) {
            addCriterion("INSUREDLOCATION between", value1, value2, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andInsuredlocationNotBetween(String value1, String value2) {
            addCriterion("INSUREDLOCATION not between", value1, value2, "insuredlocation");
            return (Criteria) this;
        }

        public Criteria andEffectivedateIsNull() {
            addCriterion("EFFECTIVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectivedateIsNotNull() {
            addCriterion("EFFECTIVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectivedateEqualTo(String value) {
            addCriterion("EFFECTIVEDATE =", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotEqualTo(String value) {
            addCriterion("EFFECTIVEDATE <>", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateGreaterThan(String value) {
            addCriterion("EFFECTIVEDATE >", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateGreaterThanOrEqualTo(String value) {
            addCriterion("EFFECTIVEDATE >=", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateLessThan(String value) {
            addCriterion("EFFECTIVEDATE <", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateLessThanOrEqualTo(String value) {
            addCriterion("EFFECTIVEDATE <=", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateLike(String value) {
            addCriterion("EFFECTIVEDATE like", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotLike(String value) {
            addCriterion("EFFECTIVEDATE not like", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateIn(List<String> values) {
            addCriterion("EFFECTIVEDATE in", values, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotIn(List<String> values) {
            addCriterion("EFFECTIVEDATE not in", values, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateBetween(String value1, String value2) {
            addCriterion("EFFECTIVEDATE between", value1, value2, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotBetween(String value1, String value2) {
            addCriterion("EFFECTIVEDATE not between", value1, value2, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andPayyearIsNull() {
            addCriterion("PAYYEAR is null");
            return (Criteria) this;
        }

        public Criteria andPayyearIsNotNull() {
            addCriterion("PAYYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andPayyearEqualTo(String value) {
            addCriterion("PAYYEAR =", value, "payyear");
            return (Criteria) this;
        }

        public Criteria andPayyearNotEqualTo(String value) {
            addCriterion("PAYYEAR <>", value, "payyear");
            return (Criteria) this;
        }

        public Criteria andPayyearGreaterThan(String value) {
            addCriterion("PAYYEAR >", value, "payyear");
            return (Criteria) this;
        }

        public Criteria andPayyearGreaterThanOrEqualTo(String value) {
            addCriterion("PAYYEAR >=", value, "payyear");
            return (Criteria) this;
        }

        public Criteria andPayyearLessThan(String value) {
            addCriterion("PAYYEAR <", value, "payyear");
            return (Criteria) this;
        }

        public Criteria andPayyearLessThanOrEqualTo(String value) {
            addCriterion("PAYYEAR <=", value, "payyear");
            return (Criteria) this;
        }

        public Criteria andPayyearLike(String value) {
            addCriterion("PAYYEAR like", value, "payyear");
            return (Criteria) this;
        }

        public Criteria andPayyearNotLike(String value) {
            addCriterion("PAYYEAR not like", value, "payyear");
            return (Criteria) this;
        }

        public Criteria andPayyearIn(List<String> values) {
            addCriterion("PAYYEAR in", values, "payyear");
            return (Criteria) this;
        }

        public Criteria andPayyearNotIn(List<String> values) {
            addCriterion("PAYYEAR not in", values, "payyear");
            return (Criteria) this;
        }

        public Criteria andPayyearBetween(String value1, String value2) {
            addCriterion("PAYYEAR between", value1, value2, "payyear");
            return (Criteria) this;
        }

        public Criteria andPayyearNotBetween(String value1, String value2) {
            addCriterion("PAYYEAR not between", value1, value2, "payyear");
            return (Criteria) this;
        }

        public Criteria andInsurancenoIsNull() {
            addCriterion("INSURANCENO is null");
            return (Criteria) this;
        }

        public Criteria andInsurancenoIsNotNull() {
            addCriterion("INSURANCENO is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancenoEqualTo(String value) {
            addCriterion("INSURANCENO =", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoNotEqualTo(String value) {
            addCriterion("INSURANCENO <>", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoGreaterThan(String value) {
            addCriterion("INSURANCENO >", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCENO >=", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoLessThan(String value) {
            addCriterion("INSURANCENO <", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoLessThanOrEqualTo(String value) {
            addCriterion("INSURANCENO <=", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoLike(String value) {
            addCriterion("INSURANCENO like", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoNotLike(String value) {
            addCriterion("INSURANCENO not like", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoIn(List<String> values) {
            addCriterion("INSURANCENO in", values, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoNotIn(List<String> values) {
            addCriterion("INSURANCENO not in", values, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoBetween(String value1, String value2) {
            addCriterion("INSURANCENO between", value1, value2, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoNotBetween(String value1, String value2) {
            addCriterion("INSURANCENO not between", value1, value2, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("PAYTYPE =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("PAYTYPE <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("PAYTYPE >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTYPE >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("PAYTYPE <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("PAYTYPE <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("PAYTYPE like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("PAYTYPE not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("PAYTYPE in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("PAYTYPE not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("PAYTYPE between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("PAYTYPE not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumIsNull() {
            addCriterion("REGULARPREMIUM is null");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumIsNotNull() {
            addCriterion("REGULARPREMIUM is not null");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumEqualTo(BigDecimal value) {
            addCriterion("REGULARPREMIUM =", value, "regularpremium");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumNotEqualTo(BigDecimal value) {
            addCriterion("REGULARPREMIUM <>", value, "regularpremium");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumGreaterThan(BigDecimal value) {
            addCriterion("REGULARPREMIUM >", value, "regularpremium");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULARPREMIUM >=", value, "regularpremium");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumLessThan(BigDecimal value) {
            addCriterion("REGULARPREMIUM <", value, "regularpremium");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULARPREMIUM <=", value, "regularpremium");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumIn(List<BigDecimal> values) {
            addCriterion("REGULARPREMIUM in", values, "regularpremium");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumNotIn(List<BigDecimal> values) {
            addCriterion("REGULARPREMIUM not in", values, "regularpremium");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULARPREMIUM between", value1, value2, "regularpremium");
            return (Criteria) this;
        }

        public Criteria andRegularpremiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULARPREMIUM not between", value1, value2, "regularpremium");
            return (Criteria) this;
        }

        public Criteria andInsurancesumIsNull() {
            addCriterion("INSURANCESUM is null");
            return (Criteria) this;
        }

        public Criteria andInsurancesumIsNotNull() {
            addCriterion("INSURANCESUM is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancesumEqualTo(BigDecimal value) {
            addCriterion("INSURANCESUM =", value, "insurancesum");
            return (Criteria) this;
        }

        public Criteria andInsurancesumNotEqualTo(BigDecimal value) {
            addCriterion("INSURANCESUM <>", value, "insurancesum");
            return (Criteria) this;
        }

        public Criteria andInsurancesumGreaterThan(BigDecimal value) {
            addCriterion("INSURANCESUM >", value, "insurancesum");
            return (Criteria) this;
        }

        public Criteria andInsurancesumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCESUM >=", value, "insurancesum");
            return (Criteria) this;
        }

        public Criteria andInsurancesumLessThan(BigDecimal value) {
            addCriterion("INSURANCESUM <", value, "insurancesum");
            return (Criteria) this;
        }

        public Criteria andInsurancesumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCESUM <=", value, "insurancesum");
            return (Criteria) this;
        }

        public Criteria andInsurancesumIn(List<BigDecimal> values) {
            addCriterion("INSURANCESUM in", values, "insurancesum");
            return (Criteria) this;
        }

        public Criteria andInsurancesumNotIn(List<BigDecimal> values) {
            addCriterion("INSURANCESUM not in", values, "insurancesum");
            return (Criteria) this;
        }

        public Criteria andInsurancesumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCESUM between", value1, value2, "insurancesum");
            return (Criteria) this;
        }

        public Criteria andInsurancesumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCESUM not between", value1, value2, "insurancesum");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeIsNull() {
            addCriterion("INSURANCETYPE is null");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeIsNotNull() {
            addCriterion("INSURANCETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeEqualTo(String value) {
            addCriterion("INSURANCETYPE =", value, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeNotEqualTo(String value) {
            addCriterion("INSURANCETYPE <>", value, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeGreaterThan(String value) {
            addCriterion("INSURANCETYPE >", value, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCETYPE >=", value, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeLessThan(String value) {
            addCriterion("INSURANCETYPE <", value, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeLessThanOrEqualTo(String value) {
            addCriterion("INSURANCETYPE <=", value, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeLike(String value) {
            addCriterion("INSURANCETYPE like", value, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeNotLike(String value) {
            addCriterion("INSURANCETYPE not like", value, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeIn(List<String> values) {
            addCriterion("INSURANCETYPE in", values, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeNotIn(List<String> values) {
            addCriterion("INSURANCETYPE not in", values, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeBetween(String value1, String value2) {
            addCriterion("INSURANCETYPE between", value1, value2, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurancetypeNotBetween(String value1, String value2) {
            addCriterion("INSURANCETYPE not between", value1, value2, "insurancetype");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNull() {
            addCriterion("INSUREDNAME is null");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNotNull() {
            addCriterion("INSUREDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsurednameEqualTo(String value) {
            addCriterion("INSUREDNAME =", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotEqualTo(String value) {
            addCriterion("INSUREDNAME <>", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThan(String value) {
            addCriterion("INSUREDNAME >", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME >=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThan(String value) {
            addCriterion("INSUREDNAME <", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME <=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLike(String value) {
            addCriterion("INSUREDNAME like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotLike(String value) {
            addCriterion("INSUREDNAME not like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameIn(List<String> values) {
            addCriterion("INSUREDNAME in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotIn(List<String> values) {
            addCriterion("INSUREDNAME not in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameBetween(String value1, String value2) {
            addCriterion("INSUREDNAME between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotBetween(String value1, String value2) {
            addCriterion("INSUREDNAME not between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurancetelIsNull() {
            addCriterion("INSURANCETEL is null");
            return (Criteria) this;
        }

        public Criteria andInsurancetelIsNotNull() {
            addCriterion("INSURANCETEL is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancetelEqualTo(String value) {
            addCriterion("INSURANCETEL =", value, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancetelNotEqualTo(String value) {
            addCriterion("INSURANCETEL <>", value, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancetelGreaterThan(String value) {
            addCriterion("INSURANCETEL >", value, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancetelGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCETEL >=", value, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancetelLessThan(String value) {
            addCriterion("INSURANCETEL <", value, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancetelLessThanOrEqualTo(String value) {
            addCriterion("INSURANCETEL <=", value, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancetelLike(String value) {
            addCriterion("INSURANCETEL like", value, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancetelNotLike(String value) {
            addCriterion("INSURANCETEL not like", value, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancetelIn(List<String> values) {
            addCriterion("INSURANCETEL in", values, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancetelNotIn(List<String> values) {
            addCriterion("INSURANCETEL not in", values, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancetelBetween(String value1, String value2) {
            addCriterion("INSURANCETEL between", value1, value2, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancetelNotBetween(String value1, String value2) {
            addCriterion("INSURANCETEL not between", value1, value2, "insurancetel");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1IsNull() {
            addCriterion("INSURANCECOMPANY1 is null");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1IsNotNull() {
            addCriterion("INSURANCECOMPANY1 is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1EqualTo(String value) {
            addCriterion("INSURANCECOMPANY1 =", value, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1NotEqualTo(String value) {
            addCriterion("INSURANCECOMPANY1 <>", value, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1GreaterThan(String value) {
            addCriterion("INSURANCECOMPANY1 >", value, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1GreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCECOMPANY1 >=", value, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1LessThan(String value) {
            addCriterion("INSURANCECOMPANY1 <", value, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1LessThanOrEqualTo(String value) {
            addCriterion("INSURANCECOMPANY1 <=", value, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1Like(String value) {
            addCriterion("INSURANCECOMPANY1 like", value, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1NotLike(String value) {
            addCriterion("INSURANCECOMPANY1 not like", value, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1In(List<String> values) {
            addCriterion("INSURANCECOMPANY1 in", values, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1NotIn(List<String> values) {
            addCriterion("INSURANCECOMPANY1 not in", values, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1Between(String value1, String value2) {
            addCriterion("INSURANCECOMPANY1 between", value1, value2, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsurancecompany1NotBetween(String value1, String value2) {
            addCriterion("INSURANCECOMPANY1 not between", value1, value2, "insurancecompany1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1IsNull() {
            addCriterion("INSUREDLOCATION1 is null");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1IsNotNull() {
            addCriterion("INSUREDLOCATION1 is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1EqualTo(String value) {
            addCriterion("INSUREDLOCATION1 =", value, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1NotEqualTo(String value) {
            addCriterion("INSUREDLOCATION1 <>", value, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1GreaterThan(String value) {
            addCriterion("INSUREDLOCATION1 >", value, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1GreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDLOCATION1 >=", value, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1LessThan(String value) {
            addCriterion("INSUREDLOCATION1 <", value, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1LessThanOrEqualTo(String value) {
            addCriterion("INSUREDLOCATION1 <=", value, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1Like(String value) {
            addCriterion("INSUREDLOCATION1 like", value, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1NotLike(String value) {
            addCriterion("INSUREDLOCATION1 not like", value, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1In(List<String> values) {
            addCriterion("INSUREDLOCATION1 in", values, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1NotIn(List<String> values) {
            addCriterion("INSUREDLOCATION1 not in", values, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1Between(String value1, String value2) {
            addCriterion("INSUREDLOCATION1 between", value1, value2, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andInsuredlocation1NotBetween(String value1, String value2) {
            addCriterion("INSUREDLOCATION1 not between", value1, value2, "insuredlocation1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1IsNull() {
            addCriterion("EFFECTIVEDATE1 is null");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1IsNotNull() {
            addCriterion("EFFECTIVEDATE1 is not null");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1EqualTo(String value) {
            addCriterion("EFFECTIVEDATE1 =", value, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1NotEqualTo(String value) {
            addCriterion("EFFECTIVEDATE1 <>", value, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1GreaterThan(String value) {
            addCriterion("EFFECTIVEDATE1 >", value, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1GreaterThanOrEqualTo(String value) {
            addCriterion("EFFECTIVEDATE1 >=", value, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1LessThan(String value) {
            addCriterion("EFFECTIVEDATE1 <", value, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1LessThanOrEqualTo(String value) {
            addCriterion("EFFECTIVEDATE1 <=", value, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1Like(String value) {
            addCriterion("EFFECTIVEDATE1 like", value, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1NotLike(String value) {
            addCriterion("EFFECTIVEDATE1 not like", value, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1In(List<String> values) {
            addCriterion("EFFECTIVEDATE1 in", values, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1NotIn(List<String> values) {
            addCriterion("EFFECTIVEDATE1 not in", values, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1Between(String value1, String value2) {
            addCriterion("EFFECTIVEDATE1 between", value1, value2, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andEffectivedate1NotBetween(String value1, String value2) {
            addCriterion("EFFECTIVEDATE1 not between", value1, value2, "effectivedate1");
            return (Criteria) this;
        }

        public Criteria andPayyear1IsNull() {
            addCriterion("PAYYEAR1 is null");
            return (Criteria) this;
        }

        public Criteria andPayyear1IsNotNull() {
            addCriterion("PAYYEAR1 is not null");
            return (Criteria) this;
        }

        public Criteria andPayyear1EqualTo(String value) {
            addCriterion("PAYYEAR1 =", value, "payyear1");
            return (Criteria) this;
        }

        public Criteria andPayyear1NotEqualTo(String value) {
            addCriterion("PAYYEAR1 <>", value, "payyear1");
            return (Criteria) this;
        }

        public Criteria andPayyear1GreaterThan(String value) {
            addCriterion("PAYYEAR1 >", value, "payyear1");
            return (Criteria) this;
        }

        public Criteria andPayyear1GreaterThanOrEqualTo(String value) {
            addCriterion("PAYYEAR1 >=", value, "payyear1");
            return (Criteria) this;
        }

        public Criteria andPayyear1LessThan(String value) {
            addCriterion("PAYYEAR1 <", value, "payyear1");
            return (Criteria) this;
        }

        public Criteria andPayyear1LessThanOrEqualTo(String value) {
            addCriterion("PAYYEAR1 <=", value, "payyear1");
            return (Criteria) this;
        }

        public Criteria andPayyear1Like(String value) {
            addCriterion("PAYYEAR1 like", value, "payyear1");
            return (Criteria) this;
        }

        public Criteria andPayyear1NotLike(String value) {
            addCriterion("PAYYEAR1 not like", value, "payyear1");
            return (Criteria) this;
        }

        public Criteria andPayyear1In(List<String> values) {
            addCriterion("PAYYEAR1 in", values, "payyear1");
            return (Criteria) this;
        }

        public Criteria andPayyear1NotIn(List<String> values) {
            addCriterion("PAYYEAR1 not in", values, "payyear1");
            return (Criteria) this;
        }

        public Criteria andPayyear1Between(String value1, String value2) {
            addCriterion("PAYYEAR1 between", value1, value2, "payyear1");
            return (Criteria) this;
        }

        public Criteria andPayyear1NotBetween(String value1, String value2) {
            addCriterion("PAYYEAR1 not between", value1, value2, "payyear1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1IsNull() {
            addCriterion("INSURANCENO1 is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1IsNotNull() {
            addCriterion("INSURANCENO1 is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1EqualTo(String value) {
            addCriterion("INSURANCENO1 =", value, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1NotEqualTo(String value) {
            addCriterion("INSURANCENO1 <>", value, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1GreaterThan(String value) {
            addCriterion("INSURANCENO1 >", value, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1GreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCENO1 >=", value, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1LessThan(String value) {
            addCriterion("INSURANCENO1 <", value, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1LessThanOrEqualTo(String value) {
            addCriterion("INSURANCENO1 <=", value, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1Like(String value) {
            addCriterion("INSURANCENO1 like", value, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1NotLike(String value) {
            addCriterion("INSURANCENO1 not like", value, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1In(List<String> values) {
            addCriterion("INSURANCENO1 in", values, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1NotIn(List<String> values) {
            addCriterion("INSURANCENO1 not in", values, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1Between(String value1, String value2) {
            addCriterion("INSURANCENO1 between", value1, value2, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andInsuranceno1NotBetween(String value1, String value2) {
            addCriterion("INSURANCENO1 not between", value1, value2, "insuranceno1");
            return (Criteria) this;
        }

        public Criteria andPaytype1IsNull() {
            addCriterion("PAYTYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andPaytype1IsNotNull() {
            addCriterion("PAYTYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andPaytype1EqualTo(String value) {
            addCriterion("PAYTYPE1 =", value, "paytype1");
            return (Criteria) this;
        }

        public Criteria andPaytype1NotEqualTo(String value) {
            addCriterion("PAYTYPE1 <>", value, "paytype1");
            return (Criteria) this;
        }

        public Criteria andPaytype1GreaterThan(String value) {
            addCriterion("PAYTYPE1 >", value, "paytype1");
            return (Criteria) this;
        }

        public Criteria andPaytype1GreaterThanOrEqualTo(String value) {
            addCriterion("PAYTYPE1 >=", value, "paytype1");
            return (Criteria) this;
        }

        public Criteria andPaytype1LessThan(String value) {
            addCriterion("PAYTYPE1 <", value, "paytype1");
            return (Criteria) this;
        }

        public Criteria andPaytype1LessThanOrEqualTo(String value) {
            addCriterion("PAYTYPE1 <=", value, "paytype1");
            return (Criteria) this;
        }

        public Criteria andPaytype1Like(String value) {
            addCriterion("PAYTYPE1 like", value, "paytype1");
            return (Criteria) this;
        }

        public Criteria andPaytype1NotLike(String value) {
            addCriterion("PAYTYPE1 not like", value, "paytype1");
            return (Criteria) this;
        }

        public Criteria andPaytype1In(List<String> values) {
            addCriterion("PAYTYPE1 in", values, "paytype1");
            return (Criteria) this;
        }

        public Criteria andPaytype1NotIn(List<String> values) {
            addCriterion("PAYTYPE1 not in", values, "paytype1");
            return (Criteria) this;
        }

        public Criteria andPaytype1Between(String value1, String value2) {
            addCriterion("PAYTYPE1 between", value1, value2, "paytype1");
            return (Criteria) this;
        }

        public Criteria andPaytype1NotBetween(String value1, String value2) {
            addCriterion("PAYTYPE1 not between", value1, value2, "paytype1");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1IsNull() {
            addCriterion("REGULARPREMIUM1 is null");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1IsNotNull() {
            addCriterion("REGULARPREMIUM1 is not null");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1EqualTo(BigDecimal value) {
            addCriterion("REGULARPREMIUM1 =", value, "regularpremium1");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1NotEqualTo(BigDecimal value) {
            addCriterion("REGULARPREMIUM1 <>", value, "regularpremium1");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1GreaterThan(BigDecimal value) {
            addCriterion("REGULARPREMIUM1 >", value, "regularpremium1");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULARPREMIUM1 >=", value, "regularpremium1");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1LessThan(BigDecimal value) {
            addCriterion("REGULARPREMIUM1 <", value, "regularpremium1");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGULARPREMIUM1 <=", value, "regularpremium1");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1In(List<BigDecimal> values) {
            addCriterion("REGULARPREMIUM1 in", values, "regularpremium1");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1NotIn(List<BigDecimal> values) {
            addCriterion("REGULARPREMIUM1 not in", values, "regularpremium1");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULARPREMIUM1 between", value1, value2, "regularpremium1");
            return (Criteria) this;
        }

        public Criteria andRegularpremium1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGULARPREMIUM1 not between", value1, value2, "regularpremium1");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1IsNull() {
            addCriterion("INSURANCESUM1 is null");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1IsNotNull() {
            addCriterion("INSURANCESUM1 is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1EqualTo(BigDecimal value) {
            addCriterion("INSURANCESUM1 =", value, "insurancesum1");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1NotEqualTo(BigDecimal value) {
            addCriterion("INSURANCESUM1 <>", value, "insurancesum1");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1GreaterThan(BigDecimal value) {
            addCriterion("INSURANCESUM1 >", value, "insurancesum1");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCESUM1 >=", value, "insurancesum1");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1LessThan(BigDecimal value) {
            addCriterion("INSURANCESUM1 <", value, "insurancesum1");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCESUM1 <=", value, "insurancesum1");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1In(List<BigDecimal> values) {
            addCriterion("INSURANCESUM1 in", values, "insurancesum1");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1NotIn(List<BigDecimal> values) {
            addCriterion("INSURANCESUM1 not in", values, "insurancesum1");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCESUM1 between", value1, value2, "insurancesum1");
            return (Criteria) this;
        }

        public Criteria andInsurancesum1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCESUM1 not between", value1, value2, "insurancesum1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1IsNull() {
            addCriterion("INSURANCETYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1IsNotNull() {
            addCriterion("INSURANCETYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1EqualTo(String value) {
            addCriterion("INSURANCETYPE1 =", value, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1NotEqualTo(String value) {
            addCriterion("INSURANCETYPE1 <>", value, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1GreaterThan(String value) {
            addCriterion("INSURANCETYPE1 >", value, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1GreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCETYPE1 >=", value, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1LessThan(String value) {
            addCriterion("INSURANCETYPE1 <", value, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1LessThanOrEqualTo(String value) {
            addCriterion("INSURANCETYPE1 <=", value, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1Like(String value) {
            addCriterion("INSURANCETYPE1 like", value, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1NotLike(String value) {
            addCriterion("INSURANCETYPE1 not like", value, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1In(List<String> values) {
            addCriterion("INSURANCETYPE1 in", values, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1NotIn(List<String> values) {
            addCriterion("INSURANCETYPE1 not in", values, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1Between(String value1, String value2) {
            addCriterion("INSURANCETYPE1 between", value1, value2, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsurancetype1NotBetween(String value1, String value2) {
            addCriterion("INSURANCETYPE1 not between", value1, value2, "insurancetype1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1IsNull() {
            addCriterion("INSUREDNAME1 is null");
            return (Criteria) this;
        }

        public Criteria andInsuredname1IsNotNull() {
            addCriterion("INSUREDNAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredname1EqualTo(String value) {
            addCriterion("INSUREDNAME1 =", value, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1NotEqualTo(String value) {
            addCriterion("INSUREDNAME1 <>", value, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1GreaterThan(String value) {
            addCriterion("INSUREDNAME1 >", value, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1GreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME1 >=", value, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1LessThan(String value) {
            addCriterion("INSUREDNAME1 <", value, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1LessThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME1 <=", value, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1Like(String value) {
            addCriterion("INSUREDNAME1 like", value, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1NotLike(String value) {
            addCriterion("INSUREDNAME1 not like", value, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1In(List<String> values) {
            addCriterion("INSUREDNAME1 in", values, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1NotIn(List<String> values) {
            addCriterion("INSUREDNAME1 not in", values, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1Between(String value1, String value2) {
            addCriterion("INSUREDNAME1 between", value1, value2, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsuredname1NotBetween(String value1, String value2) {
            addCriterion("INSUREDNAME1 not between", value1, value2, "insuredname1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1IsNull() {
            addCriterion("INSURANCETEL1 is null");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1IsNotNull() {
            addCriterion("INSURANCETEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1EqualTo(String value) {
            addCriterion("INSURANCETEL1 =", value, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1NotEqualTo(String value) {
            addCriterion("INSURANCETEL1 <>", value, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1GreaterThan(String value) {
            addCriterion("INSURANCETEL1 >", value, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1GreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCETEL1 >=", value, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1LessThan(String value) {
            addCriterion("INSURANCETEL1 <", value, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1LessThanOrEqualTo(String value) {
            addCriterion("INSURANCETEL1 <=", value, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1Like(String value) {
            addCriterion("INSURANCETEL1 like", value, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1NotLike(String value) {
            addCriterion("INSURANCETEL1 not like", value, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1In(List<String> values) {
            addCriterion("INSURANCETEL1 in", values, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1NotIn(List<String> values) {
            addCriterion("INSURANCETEL1 not in", values, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1Between(String value1, String value2) {
            addCriterion("INSURANCETEL1 between", value1, value2, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andInsurancetel1NotBetween(String value1, String value2) {
            addCriterion("INSURANCETEL1 not between", value1, value2, "insurancetel1");
            return (Criteria) this;
        }

        public Criteria andCompanysizeIsNull() {
            addCriterion("COMPANYSIZE is null");
            return (Criteria) this;
        }

        public Criteria andCompanysizeIsNotNull() {
            addCriterion("COMPANYSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanysizeEqualTo(String value) {
            addCriterion("COMPANYSIZE =", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotEqualTo(String value) {
            addCriterion("COMPANYSIZE <>", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeGreaterThan(String value) {
            addCriterion("COMPANYSIZE >", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYSIZE >=", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeLessThan(String value) {
            addCriterion("COMPANYSIZE <", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeLessThanOrEqualTo(String value) {
            addCriterion("COMPANYSIZE <=", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeLike(String value) {
            addCriterion("COMPANYSIZE like", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotLike(String value) {
            addCriterion("COMPANYSIZE not like", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeIn(List<String> values) {
            addCriterion("COMPANYSIZE in", values, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotIn(List<String> values) {
            addCriterion("COMPANYSIZE not in", values, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeBetween(String value1, String value2) {
            addCriterion("COMPANYSIZE between", value1, value2, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotBetween(String value1, String value2) {
            addCriterion("COMPANYSIZE not between", value1, value2, "companysize");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIsNull() {
            addCriterion("FIRSTTIME is null");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIsNotNull() {
            addCriterion("FIRSTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirsttimeEqualTo(String value) {
            addCriterion("FIRSTTIME =", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotEqualTo(String value) {
            addCriterion("FIRSTTIME <>", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeGreaterThan(String value) {
            addCriterion("FIRSTTIME >", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeGreaterThanOrEqualTo(String value) {
            addCriterion("FIRSTTIME >=", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLessThan(String value) {
            addCriterion("FIRSTTIME <", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLessThanOrEqualTo(String value) {
            addCriterion("FIRSTTIME <=", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLike(String value) {
            addCriterion("FIRSTTIME like", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotLike(String value) {
            addCriterion("FIRSTTIME not like", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIn(List<String> values) {
            addCriterion("FIRSTTIME in", values, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotIn(List<String> values) {
            addCriterion("FIRSTTIME not in", values, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeBetween(String value1, String value2) {
            addCriterion("FIRSTTIME between", value1, value2, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotBetween(String value1, String value2) {
            addCriterion("FIRSTTIME not between", value1, value2, "firsttime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeIsNull() {
            addCriterion("NOWCOMTIME is null");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeIsNotNull() {
            addCriterion("NOWCOMTIME is not null");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeEqualTo(String value) {
            addCriterion("NOWCOMTIME =", value, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeNotEqualTo(String value) {
            addCriterion("NOWCOMTIME <>", value, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeGreaterThan(String value) {
            addCriterion("NOWCOMTIME >", value, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeGreaterThanOrEqualTo(String value) {
            addCriterion("NOWCOMTIME >=", value, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeLessThan(String value) {
            addCriterion("NOWCOMTIME <", value, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeLessThanOrEqualTo(String value) {
            addCriterion("NOWCOMTIME <=", value, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeLike(String value) {
            addCriterion("NOWCOMTIME like", value, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeNotLike(String value) {
            addCriterion("NOWCOMTIME not like", value, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeIn(List<String> values) {
            addCriterion("NOWCOMTIME in", values, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeNotIn(List<String> values) {
            addCriterion("NOWCOMTIME not in", values, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeBetween(String value1, String value2) {
            addCriterion("NOWCOMTIME between", value1, value2, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andNowcomtimeNotBetween(String value1, String value2) {
            addCriterion("NOWCOMTIME not between", value1, value2, "nowcomtime");
            return (Criteria) this;
        }

        public Criteria andMonthsumIsNull() {
            addCriterion("MONTHSUM is null");
            return (Criteria) this;
        }

        public Criteria andMonthsumIsNotNull() {
            addCriterion("MONTHSUM is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsumEqualTo(BigDecimal value) {
            addCriterion("MONTHSUM =", value, "monthsum");
            return (Criteria) this;
        }

        public Criteria andMonthsumNotEqualTo(BigDecimal value) {
            addCriterion("MONTHSUM <>", value, "monthsum");
            return (Criteria) this;
        }

        public Criteria andMonthsumGreaterThan(BigDecimal value) {
            addCriterion("MONTHSUM >", value, "monthsum");
            return (Criteria) this;
        }

        public Criteria andMonthsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHSUM >=", value, "monthsum");
            return (Criteria) this;
        }

        public Criteria andMonthsumLessThan(BigDecimal value) {
            addCriterion("MONTHSUM <", value, "monthsum");
            return (Criteria) this;
        }

        public Criteria andMonthsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHSUM <=", value, "monthsum");
            return (Criteria) this;
        }

        public Criteria andMonthsumIn(List<BigDecimal> values) {
            addCriterion("MONTHSUM in", values, "monthsum");
            return (Criteria) this;
        }

        public Criteria andMonthsumNotIn(List<BigDecimal> values) {
            addCriterion("MONTHSUM not in", values, "monthsum");
            return (Criteria) this;
        }

        public Criteria andMonthsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHSUM between", value1, value2, "monthsum");
            return (Criteria) this;
        }

        public Criteria andMonthsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHSUM not between", value1, value2, "monthsum");
            return (Criteria) this;
        }

        public Criteria andHousennmberIsNull() {
            addCriterion("housennmber is null");
            return (Criteria) this;
        }

        public Criteria andHousennmberIsNotNull() {
            addCriterion("housennmber is not null");
            return (Criteria) this;
        }

        public Criteria andHousennmberEqualTo(String value) {
            addCriterion("housennmber =", value, "housennmber");
            return (Criteria) this;
        }

        public Criteria andHousennmberNotEqualTo(String value) {
            addCriterion("housennmber <>", value, "housennmber");
            return (Criteria) this;
        }

        public Criteria andHousennmberGreaterThan(String value) {
            addCriterion("housennmber >", value, "housennmber");
            return (Criteria) this;
        }

        public Criteria andHousennmberGreaterThanOrEqualTo(String value) {
            addCriterion("housennmber >=", value, "housennmber");
            return (Criteria) this;
        }

        public Criteria andHousennmberLessThan(String value) {
            addCriterion("housennmber <", value, "housennmber");
            return (Criteria) this;
        }

        public Criteria andHousennmberLessThanOrEqualTo(String value) {
            addCriterion("housennmber <=", value, "housennmber");
            return (Criteria) this;
        }

        public Criteria andHousennmberLike(String value) {
            addCriterion("housennmber like", value, "housennmber");
            return (Criteria) this;
        }

        public Criteria andHousennmberNotLike(String value) {
            addCriterion("housennmber not like", value, "housennmber");
            return (Criteria) this;
        }

        public Criteria andHousennmberIn(List<String> values) {
            addCriterion("housennmber in", values, "housennmber");
            return (Criteria) this;
        }

        public Criteria andHousennmberNotIn(List<String> values) {
            addCriterion("housennmber not in", values, "housennmber");
            return (Criteria) this;
        }

        public Criteria andHousennmberBetween(String value1, String value2) {
            addCriterion("housennmber between", value1, value2, "housennmber");
            return (Criteria) this;
        }

        public Criteria andHousennmberNotBetween(String value1, String value2) {
            addCriterion("housennmber not between", value1, value2, "housennmber");
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

        public Criteria andFinFactoryStatusIsNull() {
            addCriterion("fin_factory_status is null");
            return (Criteria) this;
        }

        public Criteria andFinFactoryStatusIsNotNull() {
            addCriterion("fin_factory_status is not null");
            return (Criteria) this;
        }

        public Criteria andFinFactoryStatusEqualTo(Integer value) {
            addCriterion("fin_factory_status =", value, "finFactoryStatus");
            return (Criteria) this;
        }

        public Criteria andFinFactoryStatusNotEqualTo(Integer value) {
            addCriterion("fin_factory_status <>", value, "finFactoryStatus");
            return (Criteria) this;
        }

        public Criteria andFinFactoryStatusGreaterThan(Integer value) {
            addCriterion("fin_factory_status >", value, "finFactoryStatus");
            return (Criteria) this;
        }

        public Criteria andFinFactoryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("fin_factory_status >=", value, "finFactoryStatus");
            return (Criteria) this;
        }

        public Criteria andFinFactoryStatusLessThan(Integer value) {
            addCriterion("fin_factory_status <", value, "finFactoryStatus");
            return (Criteria) this;
        }

        public Criteria andFinFactoryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("fin_factory_status <=", value, "finFactoryStatus");
            return (Criteria) this;
        }

        public Criteria andFinFactoryStatusIn(List<Integer> values) {
            addCriterion("fin_factory_status in", values, "finFactoryStatus");
            return (Criteria) this;
        }

        public Criteria andFinFactoryStatusNotIn(List<Integer> values) {
            addCriterion("fin_factory_status not in", values, "finFactoryStatus");
            return (Criteria) this;
        }

        public Criteria andFinFactoryStatusBetween(Integer value1, Integer value2) {
            addCriterion("fin_factory_status between", value1, value2, "finFactoryStatus");
            return (Criteria) this;
        }

        public Criteria andFinFactoryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("fin_factory_status not between", value1, value2, "finFactoryStatus");
            return (Criteria) this;
        }

        public Criteria andIndTypeIsNull() {
            addCriterion("ind_type is null");
            return (Criteria) this;
        }

        public Criteria andIndTypeIsNotNull() {
            addCriterion("ind_type is not null");
            return (Criteria) this;
        }

        public Criteria andIndTypeEqualTo(Integer value) {
            addCriterion("ind_type =", value, "indType");
            return (Criteria) this;
        }

        public Criteria andIndTypeNotEqualTo(Integer value) {
            addCriterion("ind_type <>", value, "indType");
            return (Criteria) this;
        }

        public Criteria andIndTypeGreaterThan(Integer value) {
            addCriterion("ind_type >", value, "indType");
            return (Criteria) this;
        }

        public Criteria andIndTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ind_type >=", value, "indType");
            return (Criteria) this;
        }

        public Criteria andIndTypeLessThan(Integer value) {
            addCriterion("ind_type <", value, "indType");
            return (Criteria) this;
        }

        public Criteria andIndTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ind_type <=", value, "indType");
            return (Criteria) this;
        }

        public Criteria andIndTypeIn(List<Integer> values) {
            addCriterion("ind_type in", values, "indType");
            return (Criteria) this;
        }

        public Criteria andIndTypeNotIn(List<Integer> values) {
            addCriterion("ind_type not in", values, "indType");
            return (Criteria) this;
        }

        public Criteria andIndTypeBetween(Integer value1, Integer value2) {
            addCriterion("ind_type between", value1, value2, "indType");
            return (Criteria) this;
        }

        public Criteria andIndTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ind_type not between", value1, value2, "indType");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeIsNull() {
            addCriterion("join_work_time is null");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeIsNotNull() {
            addCriterion("join_work_time is not null");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeEqualTo(String value) {
            addCriterion("join_work_time =", value, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeNotEqualTo(String value) {
            addCriterion("join_work_time <>", value, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeGreaterThan(String value) {
            addCriterion("join_work_time >", value, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("join_work_time >=", value, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeLessThan(String value) {
            addCriterion("join_work_time <", value, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("join_work_time <=", value, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeLike(String value) {
            addCriterion("join_work_time like", value, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeNotLike(String value) {
            addCriterion("join_work_time not like", value, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeIn(List<String> values) {
            addCriterion("join_work_time in", values, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeNotIn(List<String> values) {
            addCriterion("join_work_time not in", values, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeBetween(String value1, String value2) {
            addCriterion("join_work_time between", value1, value2, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andJoinWorkTimeNotBetween(String value1, String value2) {
            addCriterion("join_work_time not between", value1, value2, "joinWorkTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeIsNull() {
            addCriterion("card_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeIsNotNull() {
            addCriterion("card_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeEqualTo(String value) {
            addCriterion("card_begin_time =", value, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeNotEqualTo(String value) {
            addCriterion("card_begin_time <>", value, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeGreaterThan(String value) {
            addCriterion("card_begin_time >", value, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("card_begin_time >=", value, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeLessThan(String value) {
            addCriterion("card_begin_time <", value, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeLessThanOrEqualTo(String value) {
            addCriterion("card_begin_time <=", value, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeLike(String value) {
            addCriterion("card_begin_time like", value, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeNotLike(String value) {
            addCriterion("card_begin_time not like", value, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeIn(List<String> values) {
            addCriterion("card_begin_time in", values, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeNotIn(List<String> values) {
            addCriterion("card_begin_time not in", values, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeBetween(String value1, String value2) {
            addCriterion("card_begin_time between", value1, value2, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardBeginTimeNotBetween(String value1, String value2) {
            addCriterion("card_begin_time not between", value1, value2, "cardBeginTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeIsNull() {
            addCriterion("card_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeIsNotNull() {
            addCriterion("card_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeEqualTo(String value) {
            addCriterion("card_end_time =", value, "cardEndTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeNotEqualTo(String value) {
            addCriterion("card_end_time <>", value, "cardEndTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeGreaterThan(String value) {
            addCriterion("card_end_time >", value, "cardEndTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("card_end_time >=", value, "cardEndTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeLessThan(String value) {
            addCriterion("card_end_time <", value, "cardEndTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeLessThanOrEqualTo(String value) {
            addCriterion("card_end_time <=", value, "cardEndTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeLike(String value) {
            addCriterion("card_end_time like", value, "cardEndTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeNotLike(String value) {
            addCriterion("card_end_time not like", value, "cardEndTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeIn(List<String> values) {
            addCriterion("card_end_time in", values, "cardEndTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeNotIn(List<String> values) {
            addCriterion("card_end_time not in", values, "cardEndTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeBetween(String value1, String value2) {
            addCriterion("card_end_time between", value1, value2, "cardEndTime");
            return (Criteria) this;
        }

        public Criteria andCardEndTimeNotBetween(String value1, String value2) {
            addCriterion("card_end_time not between", value1, value2, "cardEndTime");
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

        public Criteria andOccupationIdIsNull() {
            addCriterion("occupation_id is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIdIsNotNull() {
            addCriterion("occupation_id is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationIdEqualTo(String value) {
            addCriterion("occupation_id =", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotEqualTo(String value) {
            addCriterion("occupation_id <>", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdGreaterThan(String value) {
            addCriterion("occupation_id >", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdGreaterThanOrEqualTo(String value) {
            addCriterion("occupation_id >=", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdLessThan(String value) {
            addCriterion("occupation_id <", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdLessThanOrEqualTo(String value) {
            addCriterion("occupation_id <=", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdLike(String value) {
            addCriterion("occupation_id like", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotLike(String value) {
            addCriterion("occupation_id not like", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdIn(List<String> values) {
            addCriterion("occupation_id in", values, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotIn(List<String> values) {
            addCriterion("occupation_id not in", values, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdBetween(String value1, String value2) {
            addCriterion("occupation_id between", value1, value2, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotBetween(String value1, String value2) {
            addCriterion("occupation_id not between", value1, value2, "occupationId");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("Business_License is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("Business_License is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("Business_License =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("Business_License <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("Business_License >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("Business_License >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("Business_License <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("Business_License <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("Business_License like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("Business_License not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("Business_License in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("Business_License not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("Business_License between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("Business_License not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneIsNull() {
            addCriterion("login_phone is null");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneIsNotNull() {
            addCriterion("login_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneEqualTo(String value) {
            addCriterion("login_phone =", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNotEqualTo(String value) {
            addCriterion("login_phone <>", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneGreaterThan(String value) {
            addCriterion("login_phone >", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("login_phone >=", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneLessThan(String value) {
            addCriterion("login_phone <", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneLessThanOrEqualTo(String value) {
            addCriterion("login_phone <=", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneLike(String value) {
            addCriterion("login_phone like", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNotLike(String value) {
            addCriterion("login_phone not like", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneIn(List<String> values) {
            addCriterion("login_phone in", values, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNotIn(List<String> values) {
            addCriterion("login_phone not in", values, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneBetween(String value1, String value2) {
            addCriterion("login_phone between", value1, value2, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNotBetween(String value1, String value2) {
            addCriterion("login_phone not between", value1, value2, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNull() {
            addCriterion("bind_time is null");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNotNull() {
            addCriterion("bind_time is not null");
            return (Criteria) this;
        }

        public Criteria andBindTimeEqualTo(Date value) {
            addCriterionForJDBCDate("bind_time =", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("bind_time <>", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("bind_time >", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bind_time >=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThan(Date value) {
            addCriterionForJDBCDate("bind_time <", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bind_time <=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeIn(List<Date> values) {
            addCriterionForJDBCDate("bind_time in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("bind_time not in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bind_time between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bind_time not between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
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