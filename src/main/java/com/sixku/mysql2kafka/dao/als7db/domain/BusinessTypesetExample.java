package com.sixku.mysql2kafka.dao.als7db.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessTypesetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusinessTypesetExample() {
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

        public Criteria andTermnoIsNull() {
            addCriterion("TERMNO is null");
            return (Criteria) this;
        }

        public Criteria andTermnoIsNotNull() {
            addCriterion("TERMNO is not null");
            return (Criteria) this;
        }

        public Criteria andTermnoEqualTo(String value) {
            addCriterion("TERMNO =", value, "termno");
            return (Criteria) this;
        }

        public Criteria andTermnoNotEqualTo(String value) {
            addCriterion("TERMNO <>", value, "termno");
            return (Criteria) this;
        }

        public Criteria andTermnoGreaterThan(String value) {
            addCriterion("TERMNO >", value, "termno");
            return (Criteria) this;
        }

        public Criteria andTermnoGreaterThanOrEqualTo(String value) {
            addCriterion("TERMNO >=", value, "termno");
            return (Criteria) this;
        }

        public Criteria andTermnoLessThan(String value) {
            addCriterion("TERMNO <", value, "termno");
            return (Criteria) this;
        }

        public Criteria andTermnoLessThanOrEqualTo(String value) {
            addCriterion("TERMNO <=", value, "termno");
            return (Criteria) this;
        }

        public Criteria andTermnoLike(String value) {
            addCriterion("TERMNO like", value, "termno");
            return (Criteria) this;
        }

        public Criteria andTermnoNotLike(String value) {
            addCriterion("TERMNO not like", value, "termno");
            return (Criteria) this;
        }

        public Criteria andTermnoIn(List<String> values) {
            addCriterion("TERMNO in", values, "termno");
            return (Criteria) this;
        }

        public Criteria andTermnoNotIn(List<String> values) {
            addCriterion("TERMNO not in", values, "termno");
            return (Criteria) this;
        }

        public Criteria andTermnoBetween(String value1, String value2) {
            addCriterion("TERMNO between", value1, value2, "termno");
            return (Criteria) this;
        }

        public Criteria andTermnoNotBetween(String value1, String value2) {
            addCriterion("TERMNO not between", value1, value2, "termno");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("TERM is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("TERM is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(Integer value) {
            addCriterion("TERM =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(Integer value) {
            addCriterion("TERM <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(Integer value) {
            addCriterion("TERM >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("TERM >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(Integer value) {
            addCriterion("TERM <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(Integer value) {
            addCriterion("TERM <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<Integer> values) {
            addCriterion("TERM in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<Integer> values) {
            addCriterion("TERM not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(Integer value1, Integer value2) {
            addCriterion("TERM between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(Integer value1, Integer value2) {
            addCriterion("TERM not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermunitIsNull() {
            addCriterion("TERMUNIT is null");
            return (Criteria) this;
        }

        public Criteria andTermunitIsNotNull() {
            addCriterion("TERMUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andTermunitEqualTo(String value) {
            addCriterion("TERMUNIT =", value, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermunitNotEqualTo(String value) {
            addCriterion("TERMUNIT <>", value, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermunitGreaterThan(String value) {
            addCriterion("TERMUNIT >", value, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermunitGreaterThanOrEqualTo(String value) {
            addCriterion("TERMUNIT >=", value, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermunitLessThan(String value) {
            addCriterion("TERMUNIT <", value, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermunitLessThanOrEqualTo(String value) {
            addCriterion("TERMUNIT <=", value, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermunitLike(String value) {
            addCriterion("TERMUNIT like", value, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermunitNotLike(String value) {
            addCriterion("TERMUNIT not like", value, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermunitIn(List<String> values) {
            addCriterion("TERMUNIT in", values, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermunitNotIn(List<String> values) {
            addCriterion("TERMUNIT not in", values, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermunitBetween(String value1, String value2) {
            addCriterion("TERMUNIT between", value1, value2, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermunitNotBetween(String value1, String value2) {
            addCriterion("TERMUNIT not between", value1, value2, "termunit");
            return (Criteria) this;
        }

        public Criteria andTermrateIsNull() {
            addCriterion("TERMRATE is null");
            return (Criteria) this;
        }

        public Criteria andTermrateIsNotNull() {
            addCriterion("TERMRATE is not null");
            return (Criteria) this;
        }

        public Criteria andTermrateEqualTo(String value) {
            addCriterion("TERMRATE =", value, "termrate");
            return (Criteria) this;
        }

        public Criteria andTermrateNotEqualTo(String value) {
            addCriterion("TERMRATE <>", value, "termrate");
            return (Criteria) this;
        }

        public Criteria andTermrateGreaterThan(String value) {
            addCriterion("TERMRATE >", value, "termrate");
            return (Criteria) this;
        }

        public Criteria andTermrateGreaterThanOrEqualTo(String value) {
            addCriterion("TERMRATE >=", value, "termrate");
            return (Criteria) this;
        }

        public Criteria andTermrateLessThan(String value) {
            addCriterion("TERMRATE <", value, "termrate");
            return (Criteria) this;
        }

        public Criteria andTermrateLessThanOrEqualTo(String value) {
            addCriterion("TERMRATE <=", value, "termrate");
            return (Criteria) this;
        }

        public Criteria andTermrateLike(String value) {
            addCriterion("TERMRATE like", value, "termrate");
            return (Criteria) this;
        }

        public Criteria andTermrateNotLike(String value) {
            addCriterion("TERMRATE not like", value, "termrate");
            return (Criteria) this;
        }

        public Criteria andTermrateIn(List<String> values) {
            addCriterion("TERMRATE in", values, "termrate");
            return (Criteria) this;
        }

        public Criteria andTermrateNotIn(List<String> values) {
            addCriterion("TERMRATE not in", values, "termrate");
            return (Criteria) this;
        }

        public Criteria andTermrateBetween(String value1, String value2) {
            addCriterion("TERMRATE between", value1, value2, "termrate");
            return (Criteria) this;
        }

        public Criteria andTermrateNotBetween(String value1, String value2) {
            addCriterion("TERMRATE not between", value1, value2, "termrate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andOverrateIsNull() {
            addCriterion("OVERRATE is null");
            return (Criteria) this;
        }

        public Criteria andOverrateIsNotNull() {
            addCriterion("OVERRATE is not null");
            return (Criteria) this;
        }

        public Criteria andOverrateEqualTo(String value) {
            addCriterion("OVERRATE =", value, "overrate");
            return (Criteria) this;
        }

        public Criteria andOverrateNotEqualTo(String value) {
            addCriterion("OVERRATE <>", value, "overrate");
            return (Criteria) this;
        }

        public Criteria andOverrateGreaterThan(String value) {
            addCriterion("OVERRATE >", value, "overrate");
            return (Criteria) this;
        }

        public Criteria andOverrateGreaterThanOrEqualTo(String value) {
            addCriterion("OVERRATE >=", value, "overrate");
            return (Criteria) this;
        }

        public Criteria andOverrateLessThan(String value) {
            addCriterion("OVERRATE <", value, "overrate");
            return (Criteria) this;
        }

        public Criteria andOverrateLessThanOrEqualTo(String value) {
            addCriterion("OVERRATE <=", value, "overrate");
            return (Criteria) this;
        }

        public Criteria andOverrateLike(String value) {
            addCriterion("OVERRATE like", value, "overrate");
            return (Criteria) this;
        }

        public Criteria andOverrateNotLike(String value) {
            addCriterion("OVERRATE not like", value, "overrate");
            return (Criteria) this;
        }

        public Criteria andOverrateIn(List<String> values) {
            addCriterion("OVERRATE in", values, "overrate");
            return (Criteria) this;
        }

        public Criteria andOverrateNotIn(List<String> values) {
            addCriterion("OVERRATE not in", values, "overrate");
            return (Criteria) this;
        }

        public Criteria andOverrateBetween(String value1, String value2) {
            addCriterion("OVERRATE between", value1, value2, "overrate");
            return (Criteria) this;
        }

        public Criteria andOverrateNotBetween(String value1, String value2) {
            addCriterion("OVERRATE not between", value1, value2, "overrate");
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

        public Criteria andConsultrateEqualTo(String value) {
            addCriterion("CONSULTRATE =", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateNotEqualTo(String value) {
            addCriterion("CONSULTRATE <>", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateGreaterThan(String value) {
            addCriterion("CONSULTRATE >", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULTRATE >=", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateLessThan(String value) {
            addCriterion("CONSULTRATE <", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateLessThanOrEqualTo(String value) {
            addCriterion("CONSULTRATE <=", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateLike(String value) {
            addCriterion("CONSULTRATE like", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateNotLike(String value) {
            addCriterion("CONSULTRATE not like", value, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateIn(List<String> values) {
            addCriterion("CONSULTRATE in", values, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateNotIn(List<String> values) {
            addCriterion("CONSULTRATE not in", values, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateBetween(String value1, String value2) {
            addCriterion("CONSULTRATE between", value1, value2, "consultrate");
            return (Criteria) this;
        }

        public Criteria andConsultrateNotBetween(String value1, String value2) {
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

        public Criteria andCheckrateEqualTo(String value) {
            addCriterion("CHECKRATE =", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateNotEqualTo(String value) {
            addCriterion("CHECKRATE <>", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateGreaterThan(String value) {
            addCriterion("CHECKRATE >", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKRATE >=", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateLessThan(String value) {
            addCriterion("CHECKRATE <", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateLessThanOrEqualTo(String value) {
            addCriterion("CHECKRATE <=", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateLike(String value) {
            addCriterion("CHECKRATE like", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateNotLike(String value) {
            addCriterion("CHECKRATE not like", value, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateIn(List<String> values) {
            addCriterion("CHECKRATE in", values, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateNotIn(List<String> values) {
            addCriterion("CHECKRATE not in", values, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateBetween(String value1, String value2) {
            addCriterion("CHECKRATE between", value1, value2, "checkrate");
            return (Criteria) this;
        }

        public Criteria andCheckrateNotBetween(String value1, String value2) {
            addCriterion("CHECKRATE not between", value1, value2, "checkrate");
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

        public Criteria andTotalrateEqualTo(String value) {
            addCriterion("TOTALRATE =", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateNotEqualTo(String value) {
            addCriterion("TOTALRATE <>", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateGreaterThan(String value) {
            addCriterion("TOTALRATE >", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALRATE >=", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateLessThan(String value) {
            addCriterion("TOTALRATE <", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateLessThanOrEqualTo(String value) {
            addCriterion("TOTALRATE <=", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateLike(String value) {
            addCriterion("TOTALRATE like", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateNotLike(String value) {
            addCriterion("TOTALRATE not like", value, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateIn(List<String> values) {
            addCriterion("TOTALRATE in", values, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateNotIn(List<String> values) {
            addCriterion("TOTALRATE not in", values, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateBetween(String value1, String value2) {
            addCriterion("TOTALRATE between", value1, value2, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTotalrateNotBetween(String value1, String value2) {
            addCriterion("TOTALRATE not between", value1, value2, "totalrate");
            return (Criteria) this;
        }

        public Criteria andTypenoIsNull() {
            addCriterion("TYPENO is null");
            return (Criteria) this;
        }

        public Criteria andTypenoIsNotNull() {
            addCriterion("TYPENO is not null");
            return (Criteria) this;
        }

        public Criteria andTypenoEqualTo(String value) {
            addCriterion("TYPENO =", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotEqualTo(String value) {
            addCriterion("TYPENO <>", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoGreaterThan(String value) {
            addCriterion("TYPENO >", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoGreaterThanOrEqualTo(String value) {
            addCriterion("TYPENO >=", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLessThan(String value) {
            addCriterion("TYPENO <", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLessThanOrEqualTo(String value) {
            addCriterion("TYPENO <=", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLike(String value) {
            addCriterion("TYPENO like", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotLike(String value) {
            addCriterion("TYPENO not like", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoIn(List<String> values) {
            addCriterion("TYPENO in", values, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotIn(List<String> values) {
            addCriterion("TYPENO not in", values, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoBetween(String value1, String value2) {
            addCriterion("TYPENO between", value1, value2, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotBetween(String value1, String value2) {
            addCriterion("TYPENO not between", value1, value2, "typeno");
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

        public Criteria andManagerateEqualTo(String value) {
            addCriterion("MANAGERATE =", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateNotEqualTo(String value) {
            addCriterion("MANAGERATE <>", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateGreaterThan(String value) {
            addCriterion("MANAGERATE >", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGERATE >=", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateLessThan(String value) {
            addCriterion("MANAGERATE <", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateLessThanOrEqualTo(String value) {
            addCriterion("MANAGERATE <=", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateLike(String value) {
            addCriterion("MANAGERATE like", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateNotLike(String value) {
            addCriterion("MANAGERATE not like", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateIn(List<String> values) {
            addCriterion("MANAGERATE in", values, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateNotIn(List<String> values) {
            addCriterion("MANAGERATE not in", values, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateBetween(String value1, String value2) {
            addCriterion("MANAGERATE between", value1, value2, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateNotBetween(String value1, String value2) {
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

        public Criteria andServerrateEqualTo(String value) {
            addCriterion("SERVERRATE =", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateNotEqualTo(String value) {
            addCriterion("SERVERRATE <>", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateGreaterThan(String value) {
            addCriterion("SERVERRATE >", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateGreaterThanOrEqualTo(String value) {
            addCriterion("SERVERRATE >=", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateLessThan(String value) {
            addCriterion("SERVERRATE <", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateLessThanOrEqualTo(String value) {
            addCriterion("SERVERRATE <=", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateLike(String value) {
            addCriterion("SERVERRATE like", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateNotLike(String value) {
            addCriterion("SERVERRATE not like", value, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateIn(List<String> values) {
            addCriterion("SERVERRATE in", values, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateNotIn(List<String> values) {
            addCriterion("SERVERRATE not in", values, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateBetween(String value1, String value2) {
            addCriterion("SERVERRATE between", value1, value2, "serverrate");
            return (Criteria) this;
        }

        public Criteria andServerrateNotBetween(String value1, String value2) {
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

        public Criteria andInsurancerateEqualTo(String value) {
            addCriterion("INSURANCERATE =", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateNotEqualTo(String value) {
            addCriterion("INSURANCERATE <>", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateGreaterThan(String value) {
            addCriterion("INSURANCERATE >", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCERATE >=", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateLessThan(String value) {
            addCriterion("INSURANCERATE <", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateLessThanOrEqualTo(String value) {
            addCriterion("INSURANCERATE <=", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateLike(String value) {
            addCriterion("INSURANCERATE like", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateNotLike(String value) {
            addCriterion("INSURANCERATE not like", value, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateIn(List<String> values) {
            addCriterion("INSURANCERATE in", values, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateNotIn(List<String> values) {
            addCriterion("INSURANCERATE not in", values, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateBetween(String value1, String value2) {
            addCriterion("INSURANCERATE between", value1, value2, "insurancerate");
            return (Criteria) this;
        }

        public Criteria andInsurancerateNotBetween(String value1, String value2) {
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

        public Criteria andServerfeeEqualTo(String value) {
            addCriterion("SERVERFEE =", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeNotEqualTo(String value) {
            addCriterion("SERVERFEE <>", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeGreaterThan(String value) {
            addCriterion("SERVERFEE >", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVERFEE >=", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeLessThan(String value) {
            addCriterion("SERVERFEE <", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeLessThanOrEqualTo(String value) {
            addCriterion("SERVERFEE <=", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeLike(String value) {
            addCriterion("SERVERFEE like", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeNotLike(String value) {
            addCriterion("SERVERFEE not like", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeIn(List<String> values) {
            addCriterion("SERVERFEE in", values, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeNotIn(List<String> values) {
            addCriterion("SERVERFEE not in", values, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeBetween(String value1, String value2) {
            addCriterion("SERVERFEE between", value1, value2, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeNotBetween(String value1, String value2) {
            addCriterion("SERVERFEE not between", value1, value2, "serverfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeIsNull() {
            addCriterion("AHEADFEE is null");
            return (Criteria) this;
        }

        public Criteria andAheadfeeIsNotNull() {
            addCriterion("AHEADFEE is not null");
            return (Criteria) this;
        }

        public Criteria andAheadfeeEqualTo(String value) {
            addCriterion("AHEADFEE =", value, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeNotEqualTo(String value) {
            addCriterion("AHEADFEE <>", value, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeGreaterThan(String value) {
            addCriterion("AHEADFEE >", value, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeGreaterThanOrEqualTo(String value) {
            addCriterion("AHEADFEE >=", value, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeLessThan(String value) {
            addCriterion("AHEADFEE <", value, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeLessThanOrEqualTo(String value) {
            addCriterion("AHEADFEE <=", value, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeLike(String value) {
            addCriterion("AHEADFEE like", value, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeNotLike(String value) {
            addCriterion("AHEADFEE not like", value, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeIn(List<String> values) {
            addCriterion("AHEADFEE in", values, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeNotIn(List<String> values) {
            addCriterion("AHEADFEE not in", values, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeBetween(String value1, String value2) {
            addCriterion("AHEADFEE between", value1, value2, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andAheadfeeNotBetween(String value1, String value2) {
            addCriterion("AHEADFEE not between", value1, value2, "aheadfee");
            return (Criteria) this;
        }

        public Criteria andBondrateIsNull() {
            addCriterion("BONDRATE is null");
            return (Criteria) this;
        }

        public Criteria andBondrateIsNotNull() {
            addCriterion("BONDRATE is not null");
            return (Criteria) this;
        }

        public Criteria andBondrateEqualTo(String value) {
            addCriterion("BONDRATE =", value, "bondrate");
            return (Criteria) this;
        }

        public Criteria andBondrateNotEqualTo(String value) {
            addCriterion("BONDRATE <>", value, "bondrate");
            return (Criteria) this;
        }

        public Criteria andBondrateGreaterThan(String value) {
            addCriterion("BONDRATE >", value, "bondrate");
            return (Criteria) this;
        }

        public Criteria andBondrateGreaterThanOrEqualTo(String value) {
            addCriterion("BONDRATE >=", value, "bondrate");
            return (Criteria) this;
        }

        public Criteria andBondrateLessThan(String value) {
            addCriterion("BONDRATE <", value, "bondrate");
            return (Criteria) this;
        }

        public Criteria andBondrateLessThanOrEqualTo(String value) {
            addCriterion("BONDRATE <=", value, "bondrate");
            return (Criteria) this;
        }

        public Criteria andBondrateLike(String value) {
            addCriterion("BONDRATE like", value, "bondrate");
            return (Criteria) this;
        }

        public Criteria andBondrateNotLike(String value) {
            addCriterion("BONDRATE not like", value, "bondrate");
            return (Criteria) this;
        }

        public Criteria andBondrateIn(List<String> values) {
            addCriterion("BONDRATE in", values, "bondrate");
            return (Criteria) this;
        }

        public Criteria andBondrateNotIn(List<String> values) {
            addCriterion("BONDRATE not in", values, "bondrate");
            return (Criteria) this;
        }

        public Criteria andBondrateBetween(String value1, String value2) {
            addCriterion("BONDRATE between", value1, value2, "bondrate");
            return (Criteria) this;
        }

        public Criteria andBondrateNotBetween(String value1, String value2) {
            addCriterion("BONDRATE not between", value1, value2, "bondrate");
            return (Criteria) this;
        }

        public Criteria andSerrateIsNull() {
            addCriterion("SERRATE is null");
            return (Criteria) this;
        }

        public Criteria andSerrateIsNotNull() {
            addCriterion("SERRATE is not null");
            return (Criteria) this;
        }

        public Criteria andSerrateEqualTo(String value) {
            addCriterion("SERRATE =", value, "serrate");
            return (Criteria) this;
        }

        public Criteria andSerrateNotEqualTo(String value) {
            addCriterion("SERRATE <>", value, "serrate");
            return (Criteria) this;
        }

        public Criteria andSerrateGreaterThan(String value) {
            addCriterion("SERRATE >", value, "serrate");
            return (Criteria) this;
        }

        public Criteria andSerrateGreaterThanOrEqualTo(String value) {
            addCriterion("SERRATE >=", value, "serrate");
            return (Criteria) this;
        }

        public Criteria andSerrateLessThan(String value) {
            addCriterion("SERRATE <", value, "serrate");
            return (Criteria) this;
        }

        public Criteria andSerrateLessThanOrEqualTo(String value) {
            addCriterion("SERRATE <=", value, "serrate");
            return (Criteria) this;
        }

        public Criteria andSerrateLike(String value) {
            addCriterion("SERRATE like", value, "serrate");
            return (Criteria) this;
        }

        public Criteria andSerrateNotLike(String value) {
            addCriterion("SERRATE not like", value, "serrate");
            return (Criteria) this;
        }

        public Criteria andSerrateIn(List<String> values) {
            addCriterion("SERRATE in", values, "serrate");
            return (Criteria) this;
        }

        public Criteria andSerrateNotIn(List<String> values) {
            addCriterion("SERRATE not in", values, "serrate");
            return (Criteria) this;
        }

        public Criteria andSerrateBetween(String value1, String value2) {
            addCriterion("SERRATE between", value1, value2, "serrate");
            return (Criteria) this;
        }

        public Criteria andSerrateNotBetween(String value1, String value2) {
            addCriterion("SERRATE not between", value1, value2, "serrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateIsNull() {
            addCriterion("getcheckrate is null");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateIsNotNull() {
            addCriterion("getcheckrate is not null");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateEqualTo(String value) {
            addCriterion("getcheckrate =", value, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateNotEqualTo(String value) {
            addCriterion("getcheckrate <>", value, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateGreaterThan(String value) {
            addCriterion("getcheckrate >", value, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateGreaterThanOrEqualTo(String value) {
            addCriterion("getcheckrate >=", value, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateLessThan(String value) {
            addCriterion("getcheckrate <", value, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateLessThanOrEqualTo(String value) {
            addCriterion("getcheckrate <=", value, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateLike(String value) {
            addCriterion("getcheckrate like", value, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateNotLike(String value) {
            addCriterion("getcheckrate not like", value, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateIn(List<String> values) {
            addCriterion("getcheckrate in", values, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateNotIn(List<String> values) {
            addCriterion("getcheckrate not in", values, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateBetween(String value1, String value2) {
            addCriterion("getcheckrate between", value1, value2, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andGetcheckrateNotBetween(String value1, String value2) {
            addCriterion("getcheckrate not between", value1, value2, "getcheckrate");
            return (Criteria) this;
        }

        public Criteria andConsultRateIsNull() {
            addCriterion("consult_rate is null");
            return (Criteria) this;
        }

        public Criteria andConsultRateIsNotNull() {
            addCriterion("consult_rate is not null");
            return (Criteria) this;
        }

        public Criteria andConsultRateEqualTo(BigDecimal value) {
            addCriterion("consult_rate =", value, "consultRate");
            return (Criteria) this;
        }

        public Criteria andConsultRateNotEqualTo(BigDecimal value) {
            addCriterion("consult_rate <>", value, "consultRate");
            return (Criteria) this;
        }

        public Criteria andConsultRateGreaterThan(BigDecimal value) {
            addCriterion("consult_rate >", value, "consultRate");
            return (Criteria) this;
        }

        public Criteria andConsultRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consult_rate >=", value, "consultRate");
            return (Criteria) this;
        }

        public Criteria andConsultRateLessThan(BigDecimal value) {
            addCriterion("consult_rate <", value, "consultRate");
            return (Criteria) this;
        }

        public Criteria andConsultRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consult_rate <=", value, "consultRate");
            return (Criteria) this;
        }

        public Criteria andConsultRateIn(List<BigDecimal> values) {
            addCriterion("consult_rate in", values, "consultRate");
            return (Criteria) this;
        }

        public Criteria andConsultRateNotIn(List<BigDecimal> values) {
            addCriterion("consult_rate not in", values, "consultRate");
            return (Criteria) this;
        }

        public Criteria andConsultRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consult_rate between", value1, value2, "consultRate");
            return (Criteria) this;
        }

        public Criteria andConsultRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consult_rate not between", value1, value2, "consultRate");
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

        public Criteria andServicefeerateIsNull() {
            addCriterion("servicefeerate is null");
            return (Criteria) this;
        }

        public Criteria andServicefeerateIsNotNull() {
            addCriterion("servicefeerate is not null");
            return (Criteria) this;
        }

        public Criteria andServicefeerateEqualTo(BigDecimal value) {
            addCriterion("servicefeerate =", value, "servicefeerate");
            return (Criteria) this;
        }

        public Criteria andServicefeerateNotEqualTo(BigDecimal value) {
            addCriterion("servicefeerate <>", value, "servicefeerate");
            return (Criteria) this;
        }

        public Criteria andServicefeerateGreaterThan(BigDecimal value) {
            addCriterion("servicefeerate >", value, "servicefeerate");
            return (Criteria) this;
        }

        public Criteria andServicefeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("servicefeerate >=", value, "servicefeerate");
            return (Criteria) this;
        }

        public Criteria andServicefeerateLessThan(BigDecimal value) {
            addCriterion("servicefeerate <", value, "servicefeerate");
            return (Criteria) this;
        }

        public Criteria andServicefeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("servicefeerate <=", value, "servicefeerate");
            return (Criteria) this;
        }

        public Criteria andServicefeerateIn(List<BigDecimal> values) {
            addCriterion("servicefeerate in", values, "servicefeerate");
            return (Criteria) this;
        }

        public Criteria andServicefeerateNotIn(List<BigDecimal> values) {
            addCriterion("servicefeerate not in", values, "servicefeerate");
            return (Criteria) this;
        }

        public Criteria andServicefeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("servicefeerate between", value1, value2, "servicefeerate");
            return (Criteria) this;
        }

        public Criteria andServicefeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("servicefeerate not between", value1, value2, "servicefeerate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateIsNull() {
            addCriterion("businessRate is null");
            return (Criteria) this;
        }

        public Criteria andBusinessrateIsNotNull() {
            addCriterion("businessRate is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessrateEqualTo(BigDecimal value) {
            addCriterion("businessRate =", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateNotEqualTo(BigDecimal value) {
            addCriterion("businessRate <>", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateGreaterThan(BigDecimal value) {
            addCriterion("businessRate >", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("businessRate >=", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateLessThan(BigDecimal value) {
            addCriterion("businessRate <", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("businessRate <=", value, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateIn(List<BigDecimal> values) {
            addCriterion("businessRate in", values, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateNotIn(List<BigDecimal> values) {
            addCriterion("businessRate not in", values, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("businessRate between", value1, value2, "businessrate");
            return (Criteria) this;
        }

        public Criteria andBusinessrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("businessRate not between", value1, value2, "businessrate");
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

        public Criteria andMinSaleShareIsNull() {
            addCriterion("min_sale_share is null");
            return (Criteria) this;
        }

        public Criteria andMinSaleShareIsNotNull() {
            addCriterion("min_sale_share is not null");
            return (Criteria) this;
        }

        public Criteria andMinSaleShareEqualTo(Integer value) {
            addCriterion("min_sale_share =", value, "minSaleShare");
            return (Criteria) this;
        }

        public Criteria andMinSaleShareNotEqualTo(Integer value) {
            addCriterion("min_sale_share <>", value, "minSaleShare");
            return (Criteria) this;
        }

        public Criteria andMinSaleShareGreaterThan(Integer value) {
            addCriterion("min_sale_share >", value, "minSaleShare");
            return (Criteria) this;
        }

        public Criteria andMinSaleShareGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_sale_share >=", value, "minSaleShare");
            return (Criteria) this;
        }

        public Criteria andMinSaleShareLessThan(Integer value) {
            addCriterion("min_sale_share <", value, "minSaleShare");
            return (Criteria) this;
        }

        public Criteria andMinSaleShareLessThanOrEqualTo(Integer value) {
            addCriterion("min_sale_share <=", value, "minSaleShare");
            return (Criteria) this;
        }

        public Criteria andMinSaleShareIn(List<Integer> values) {
            addCriterion("min_sale_share in", values, "minSaleShare");
            return (Criteria) this;
        }

        public Criteria andMinSaleShareNotIn(List<Integer> values) {
            addCriterion("min_sale_share not in", values, "minSaleShare");
            return (Criteria) this;
        }

        public Criteria andMinSaleShareBetween(Integer value1, Integer value2) {
            addCriterion("min_sale_share between", value1, value2, "minSaleShare");
            return (Criteria) this;
        }

        public Criteria andMinSaleShareNotBetween(Integer value1, Integer value2) {
            addCriterion("min_sale_share not between", value1, value2, "minSaleShare");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareIsNull() {
            addCriterion("max_sale_share is null");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareIsNotNull() {
            addCriterion("max_sale_share is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareEqualTo(Integer value) {
            addCriterion("max_sale_share =", value, "maxSaleShare");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareNotEqualTo(Integer value) {
            addCriterion("max_sale_share <>", value, "maxSaleShare");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareGreaterThan(Integer value) {
            addCriterion("max_sale_share >", value, "maxSaleShare");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_sale_share >=", value, "maxSaleShare");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareLessThan(Integer value) {
            addCriterion("max_sale_share <", value, "maxSaleShare");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareLessThanOrEqualTo(Integer value) {
            addCriterion("max_sale_share <=", value, "maxSaleShare");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareIn(List<Integer> values) {
            addCriterion("max_sale_share in", values, "maxSaleShare");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareNotIn(List<Integer> values) {
            addCriterion("max_sale_share not in", values, "maxSaleShare");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareBetween(Integer value1, Integer value2) {
            addCriterion("max_sale_share between", value1, value2, "maxSaleShare");
            return (Criteria) this;
        }

        public Criteria andMaxSaleShareNotBetween(Integer value1, Integer value2) {
            addCriterion("max_sale_share not between", value1, value2, "maxSaleShare");
            return (Criteria) this;
        }

        public Criteria andIncShareIsNull() {
            addCriterion("inc_share is null");
            return (Criteria) this;
        }

        public Criteria andIncShareIsNotNull() {
            addCriterion("inc_share is not null");
            return (Criteria) this;
        }

        public Criteria andIncShareEqualTo(Integer value) {
            addCriterion("inc_share =", value, "incShare");
            return (Criteria) this;
        }

        public Criteria andIncShareNotEqualTo(Integer value) {
            addCriterion("inc_share <>", value, "incShare");
            return (Criteria) this;
        }

        public Criteria andIncShareGreaterThan(Integer value) {
            addCriterion("inc_share >", value, "incShare");
            return (Criteria) this;
        }

        public Criteria andIncShareGreaterThanOrEqualTo(Integer value) {
            addCriterion("inc_share >=", value, "incShare");
            return (Criteria) this;
        }

        public Criteria andIncShareLessThan(Integer value) {
            addCriterion("inc_share <", value, "incShare");
            return (Criteria) this;
        }

        public Criteria andIncShareLessThanOrEqualTo(Integer value) {
            addCriterion("inc_share <=", value, "incShare");
            return (Criteria) this;
        }

        public Criteria andIncShareIn(List<Integer> values) {
            addCriterion("inc_share in", values, "incShare");
            return (Criteria) this;
        }

        public Criteria andIncShareNotIn(List<Integer> values) {
            addCriterion("inc_share not in", values, "incShare");
            return (Criteria) this;
        }

        public Criteria andIncShareBetween(Integer value1, Integer value2) {
            addCriterion("inc_share between", value1, value2, "incShare");
            return (Criteria) this;
        }

        public Criteria andIncShareNotBetween(Integer value1, Integer value2) {
            addCriterion("inc_share not between", value1, value2, "incShare");
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

        public Criteria andFundChannelIsNull() {
            addCriterion("fund_channel is null");
            return (Criteria) this;
        }

        public Criteria andFundChannelIsNotNull() {
            addCriterion("fund_channel is not null");
            return (Criteria) this;
        }

        public Criteria andFundChannelEqualTo(Integer value) {
            addCriterion("fund_channel =", value, "fundChannel");
            return (Criteria) this;
        }

        public Criteria andFundChannelNotEqualTo(Integer value) {
            addCriterion("fund_channel <>", value, "fundChannel");
            return (Criteria) this;
        }

        public Criteria andFundChannelGreaterThan(Integer value) {
            addCriterion("fund_channel >", value, "fundChannel");
            return (Criteria) this;
        }

        public Criteria andFundChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("fund_channel >=", value, "fundChannel");
            return (Criteria) this;
        }

        public Criteria andFundChannelLessThan(Integer value) {
            addCriterion("fund_channel <", value, "fundChannel");
            return (Criteria) this;
        }

        public Criteria andFundChannelLessThanOrEqualTo(Integer value) {
            addCriterion("fund_channel <=", value, "fundChannel");
            return (Criteria) this;
        }

        public Criteria andFundChannelIn(List<Integer> values) {
            addCriterion("fund_channel in", values, "fundChannel");
            return (Criteria) this;
        }

        public Criteria andFundChannelNotIn(List<Integer> values) {
            addCriterion("fund_channel not in", values, "fundChannel");
            return (Criteria) this;
        }

        public Criteria andFundChannelBetween(Integer value1, Integer value2) {
            addCriterion("fund_channel between", value1, value2, "fundChannel");
            return (Criteria) this;
        }

        public Criteria andFundChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("fund_channel not between", value1, value2, "fundChannel");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneIsNull() {
            addCriterion("overdue_rate_one is null");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneIsNotNull() {
            addCriterion("overdue_rate_one is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneEqualTo(BigDecimal value) {
            addCriterion("overdue_rate_one =", value, "overdueRateOne");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneNotEqualTo(BigDecimal value) {
            addCriterion("overdue_rate_one <>", value, "overdueRateOne");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneGreaterThan(BigDecimal value) {
            addCriterion("overdue_rate_one >", value, "overdueRateOne");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_rate_one >=", value, "overdueRateOne");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneLessThan(BigDecimal value) {
            addCriterion("overdue_rate_one <", value, "overdueRateOne");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_rate_one <=", value, "overdueRateOne");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneIn(List<BigDecimal> values) {
            addCriterion("overdue_rate_one in", values, "overdueRateOne");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneNotIn(List<BigDecimal> values) {
            addCriterion("overdue_rate_one not in", values, "overdueRateOne");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_rate_one between", value1, value2, "overdueRateOne");
            return (Criteria) this;
        }

        public Criteria andOverdueRateOneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_rate_one not between", value1, value2, "overdueRateOne");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoIsNull() {
            addCriterion("overdue_rate_two is null");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoIsNotNull() {
            addCriterion("overdue_rate_two is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoEqualTo(BigDecimal value) {
            addCriterion("overdue_rate_two =", value, "overdueRateTwo");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoNotEqualTo(BigDecimal value) {
            addCriterion("overdue_rate_two <>", value, "overdueRateTwo");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoGreaterThan(BigDecimal value) {
            addCriterion("overdue_rate_two >", value, "overdueRateTwo");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_rate_two >=", value, "overdueRateTwo");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoLessThan(BigDecimal value) {
            addCriterion("overdue_rate_two <", value, "overdueRateTwo");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_rate_two <=", value, "overdueRateTwo");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoIn(List<BigDecimal> values) {
            addCriterion("overdue_rate_two in", values, "overdueRateTwo");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoNotIn(List<BigDecimal> values) {
            addCriterion("overdue_rate_two not in", values, "overdueRateTwo");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_rate_two between", value1, value2, "overdueRateTwo");
            return (Criteria) this;
        }

        public Criteria andOverdueRateTwoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_rate_two not between", value1, value2, "overdueRateTwo");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIsNull() {
            addCriterion("repayment_type is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIsNotNull() {
            addCriterion("repayment_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeEqualTo(String value) {
            addCriterion("repayment_type =", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotEqualTo(String value) {
            addCriterion("repayment_type <>", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThan(String value) {
            addCriterion("repayment_type >", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_type >=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThan(String value) {
            addCriterion("repayment_type <", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("repayment_type <=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLike(String value) {
            addCriterion("repayment_type like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotLike(String value) {
            addCriterion("repayment_type not like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIn(List<String> values) {
            addCriterion("repayment_type in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotIn(List<String> values) {
            addCriterion("repayment_type not in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeBetween(String value1, String value2) {
            addCriterion("repayment_type between", value1, value2, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotBetween(String value1, String value2) {
            addCriterion("repayment_type not between", value1, value2, "repaymentType");
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

        public Criteria andShowTypeIsNull() {
            addCriterion("SHOW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNotNull() {
            addCriterion("SHOW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShowTypeEqualTo(Integer value) {
            addCriterion("SHOW_TYPE =", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotEqualTo(Integer value) {
            addCriterion("SHOW_TYPE <>", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThan(Integer value) {
            addCriterion("SHOW_TYPE >", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOW_TYPE >=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThan(Integer value) {
            addCriterion("SHOW_TYPE <", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThanOrEqualTo(Integer value) {
            addCriterion("SHOW_TYPE <=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeIn(List<Integer> values) {
            addCriterion("SHOW_TYPE in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotIn(List<Integer> values) {
            addCriterion("SHOW_TYPE not in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeBetween(Integer value1, Integer value2) {
            addCriterion("SHOW_TYPE between", value1, value2, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOW_TYPE not between", value1, value2, "showType");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodIsNull() {
            addCriterion("CAPACITY_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodIsNotNull() {
            addCriterion("CAPACITY_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodEqualTo(Integer value) {
            addCriterion("CAPACITY_PERIOD =", value, "capacityPeriod");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodNotEqualTo(Integer value) {
            addCriterion("CAPACITY_PERIOD <>", value, "capacityPeriod");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodGreaterThan(Integer value) {
            addCriterion("CAPACITY_PERIOD >", value, "capacityPeriod");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAPACITY_PERIOD >=", value, "capacityPeriod");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodLessThan(Integer value) {
            addCriterion("CAPACITY_PERIOD <", value, "capacityPeriod");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("CAPACITY_PERIOD <=", value, "capacityPeriod");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodIn(List<Integer> values) {
            addCriterion("CAPACITY_PERIOD in", values, "capacityPeriod");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodNotIn(List<Integer> values) {
            addCriterion("CAPACITY_PERIOD not in", values, "capacityPeriod");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodBetween(Integer value1, Integer value2) {
            addCriterion("CAPACITY_PERIOD between", value1, value2, "capacityPeriod");
            return (Criteria) this;
        }

        public Criteria andCapacityPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("CAPACITY_PERIOD not between", value1, value2, "capacityPeriod");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewIsNull() {
            addCriterion("CAN_BE_RENEW is null");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewIsNotNull() {
            addCriterion("CAN_BE_RENEW is not null");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewEqualTo(Integer value) {
            addCriterion("CAN_BE_RENEW =", value, "canBeRenew");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewNotEqualTo(Integer value) {
            addCriterion("CAN_BE_RENEW <>", value, "canBeRenew");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewGreaterThan(Integer value) {
            addCriterion("CAN_BE_RENEW >", value, "canBeRenew");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAN_BE_RENEW >=", value, "canBeRenew");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewLessThan(Integer value) {
            addCriterion("CAN_BE_RENEW <", value, "canBeRenew");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewLessThanOrEqualTo(Integer value) {
            addCriterion("CAN_BE_RENEW <=", value, "canBeRenew");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewIn(List<Integer> values) {
            addCriterion("CAN_BE_RENEW in", values, "canBeRenew");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewNotIn(List<Integer> values) {
            addCriterion("CAN_BE_RENEW not in", values, "canBeRenew");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewBetween(Integer value1, Integer value2) {
            addCriterion("CAN_BE_RENEW between", value1, value2, "canBeRenew");
            return (Criteria) this;
        }

        public Criteria andCanBeRenewNotBetween(Integer value1, Integer value2) {
            addCriterion("CAN_BE_RENEW not between", value1, value2, "canBeRenew");
            return (Criteria) this;
        }

        public Criteria andRenewTimesIsNull() {
            addCriterion("RENEW_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andRenewTimesIsNotNull() {
            addCriterion("RENEW_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andRenewTimesEqualTo(Integer value) {
            addCriterion("RENEW_TIMES =", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesNotEqualTo(Integer value) {
            addCriterion("RENEW_TIMES <>", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesGreaterThan(Integer value) {
            addCriterion("RENEW_TIMES >", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("RENEW_TIMES >=", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesLessThan(Integer value) {
            addCriterion("RENEW_TIMES <", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesLessThanOrEqualTo(Integer value) {
            addCriterion("RENEW_TIMES <=", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesIn(List<Integer> values) {
            addCriterion("RENEW_TIMES in", values, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesNotIn(List<Integer> values) {
            addCriterion("RENEW_TIMES not in", values, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesBetween(Integer value1, Integer value2) {
            addCriterion("RENEW_TIMES between", value1, value2, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("RENEW_TIMES not between", value1, value2, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodIsNull() {
            addCriterion("RENEW_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodIsNotNull() {
            addCriterion("RENEW_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodEqualTo(String value) {
            addCriterion("RENEW_PERIOD =", value, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodNotEqualTo(String value) {
            addCriterion("RENEW_PERIOD <>", value, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodGreaterThan(String value) {
            addCriterion("RENEW_PERIOD >", value, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("RENEW_PERIOD >=", value, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodLessThan(String value) {
            addCriterion("RENEW_PERIOD <", value, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodLessThanOrEqualTo(String value) {
            addCriterion("RENEW_PERIOD <=", value, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodLike(String value) {
            addCriterion("RENEW_PERIOD like", value, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodNotLike(String value) {
            addCriterion("RENEW_PERIOD not like", value, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodIn(List<String> values) {
            addCriterion("RENEW_PERIOD in", values, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodNotIn(List<String> values) {
            addCriterion("RENEW_PERIOD not in", values, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodBetween(String value1, String value2) {
            addCriterion("RENEW_PERIOD between", value1, value2, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewPeriodNotBetween(String value1, String value2) {
            addCriterion("RENEW_PERIOD not between", value1, value2, "renewPeriod");
            return (Criteria) this;
        }

        public Criteria andRenewFeeIsNull() {
            addCriterion("RENEW_FEE is null");
            return (Criteria) this;
        }

        public Criteria andRenewFeeIsNotNull() {
            addCriterion("RENEW_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andRenewFeeEqualTo(BigDecimal value) {
            addCriterion("RENEW_FEE =", value, "renewFee");
            return (Criteria) this;
        }

        public Criteria andRenewFeeNotEqualTo(BigDecimal value) {
            addCriterion("RENEW_FEE <>", value, "renewFee");
            return (Criteria) this;
        }

        public Criteria andRenewFeeGreaterThan(BigDecimal value) {
            addCriterion("RENEW_FEE >", value, "renewFee");
            return (Criteria) this;
        }

        public Criteria andRenewFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENEW_FEE >=", value, "renewFee");
            return (Criteria) this;
        }

        public Criteria andRenewFeeLessThan(BigDecimal value) {
            addCriterion("RENEW_FEE <", value, "renewFee");
            return (Criteria) this;
        }

        public Criteria andRenewFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENEW_FEE <=", value, "renewFee");
            return (Criteria) this;
        }

        public Criteria andRenewFeeIn(List<BigDecimal> values) {
            addCriterion("RENEW_FEE in", values, "renewFee");
            return (Criteria) this;
        }

        public Criteria andRenewFeeNotIn(List<BigDecimal> values) {
            addCriterion("RENEW_FEE not in", values, "renewFee");
            return (Criteria) this;
        }

        public Criteria andRenewFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENEW_FEE between", value1, value2, "renewFee");
            return (Criteria) this;
        }

        public Criteria andRenewFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENEW_FEE not between", value1, value2, "renewFee");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeIsNull() {
            addCriterion("CREDIT_AUDIT_FEE is null");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeIsNotNull() {
            addCriterion("CREDIT_AUDIT_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeEqualTo(BigDecimal value) {
            addCriterion("CREDIT_AUDIT_FEE =", value, "creditAuditFee");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeNotEqualTo(BigDecimal value) {
            addCriterion("CREDIT_AUDIT_FEE <>", value, "creditAuditFee");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeGreaterThan(BigDecimal value) {
            addCriterion("CREDIT_AUDIT_FEE >", value, "creditAuditFee");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDIT_AUDIT_FEE >=", value, "creditAuditFee");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeLessThan(BigDecimal value) {
            addCriterion("CREDIT_AUDIT_FEE <", value, "creditAuditFee");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDIT_AUDIT_FEE <=", value, "creditAuditFee");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeIn(List<BigDecimal> values) {
            addCriterion("CREDIT_AUDIT_FEE in", values, "creditAuditFee");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeNotIn(List<BigDecimal> values) {
            addCriterion("CREDIT_AUDIT_FEE not in", values, "creditAuditFee");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDIT_AUDIT_FEE between", value1, value2, "creditAuditFee");
            return (Criteria) this;
        }

        public Criteria andCreditAuditFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDIT_AUDIT_FEE not between", value1, value2, "creditAuditFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeIsNull() {
            addCriterion("CONSULTING_FEE is null");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeIsNotNull() {
            addCriterion("CONSULTING_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeEqualTo(BigDecimal value) {
            addCriterion("CONSULTING_FEE =", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeNotEqualTo(BigDecimal value) {
            addCriterion("CONSULTING_FEE <>", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeGreaterThan(BigDecimal value) {
            addCriterion("CONSULTING_FEE >", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONSULTING_FEE >=", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeLessThan(BigDecimal value) {
            addCriterion("CONSULTING_FEE <", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONSULTING_FEE <=", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeIn(List<BigDecimal> values) {
            addCriterion("CONSULTING_FEE in", values, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeNotIn(List<BigDecimal> values) {
            addCriterion("CONSULTING_FEE not in", values, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONSULTING_FEE between", value1, value2, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONSULTING_FEE not between", value1, value2, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("LOAN_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("LOAN_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMOUNT =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMOUNT <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("LOAN_AMOUNT >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMOUNT >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(BigDecimal value) {
            addCriterion("LOAN_AMOUNT <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMOUNT <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<BigDecimal> values) {
            addCriterion("LOAN_AMOUNT in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("LOAN_AMOUNT not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_AMOUNT between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_AMOUNT not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountIsNull() {
            addCriterion("ARRIVAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountIsNotNull() {
            addCriterion("ARRIVAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountEqualTo(BigDecimal value) {
            addCriterion("ARRIVAL_AMOUNT =", value, "arrivalAmount");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountNotEqualTo(BigDecimal value) {
            addCriterion("ARRIVAL_AMOUNT <>", value, "arrivalAmount");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountGreaterThan(BigDecimal value) {
            addCriterion("ARRIVAL_AMOUNT >", value, "arrivalAmount");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ARRIVAL_AMOUNT >=", value, "arrivalAmount");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountLessThan(BigDecimal value) {
            addCriterion("ARRIVAL_AMOUNT <", value, "arrivalAmount");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ARRIVAL_AMOUNT <=", value, "arrivalAmount");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountIn(List<BigDecimal> values) {
            addCriterion("ARRIVAL_AMOUNT in", values, "arrivalAmount");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountNotIn(List<BigDecimal> values) {
            addCriterion("ARRIVAL_AMOUNT not in", values, "arrivalAmount");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ARRIVAL_AMOUNT between", value1, value2, "arrivalAmount");
            return (Criteria) this;
        }

        public Criteria andArrivalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ARRIVAL_AMOUNT not between", value1, value2, "arrivalAmount");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNull() {
            addCriterion("PRODUCT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNotNull() {
            addCriterion("PRODUCT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumberEqualTo(String value) {
            addCriterion("PRODUCT_NUMBER =", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotEqualTo(String value) {
            addCriterion("PRODUCT_NUMBER <>", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThan(String value) {
            addCriterion("PRODUCT_NUMBER >", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NUMBER >=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThan(String value) {
            addCriterion("PRODUCT_NUMBER <", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NUMBER <=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLike(String value) {
            addCriterion("PRODUCT_NUMBER like", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotLike(String value) {
            addCriterion("PRODUCT_NUMBER not like", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberIn(List<String> values) {
            addCriterion("PRODUCT_NUMBER in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotIn(List<String> values) {
            addCriterion("PRODUCT_NUMBER not in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberBetween(String value1, String value2) {
            addCriterion("PRODUCT_NUMBER between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NUMBER not between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberIsNull() {
            addCriterion("RATE_GROUP_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberIsNotNull() {
            addCriterion("RATE_GROUP_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberEqualTo(String value) {
            addCriterion("RATE_GROUP_NUMBER =", value, "rateGroupNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberNotEqualTo(String value) {
            addCriterion("RATE_GROUP_NUMBER <>", value, "rateGroupNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberGreaterThan(String value) {
            addCriterion("RATE_GROUP_NUMBER >", value, "rateGroupNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberGreaterThanOrEqualTo(String value) {
            addCriterion("RATE_GROUP_NUMBER >=", value, "rateGroupNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberLessThan(String value) {
            addCriterion("RATE_GROUP_NUMBER <", value, "rateGroupNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberLessThanOrEqualTo(String value) {
            addCriterion("RATE_GROUP_NUMBER <=", value, "rateGroupNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberLike(String value) {
            addCriterion("RATE_GROUP_NUMBER like", value, "rateGroupNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberNotLike(String value) {
            addCriterion("RATE_GROUP_NUMBER not like", value, "rateGroupNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberIn(List<String> values) {
            addCriterion("RATE_GROUP_NUMBER in", values, "rateGroupNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberNotIn(List<String> values) {
            addCriterion("RATE_GROUP_NUMBER not in", values, "rateGroupNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberBetween(String value1, String value2) {
            addCriterion("RATE_GROUP_NUMBER between", value1, value2, "rateGroupNumber");
            return (Criteria) this;
        }

        public Criteria andRateGroupNumberNotBetween(String value1, String value2) {
            addCriterion("RATE_GROUP_NUMBER not between", value1, value2, "rateGroupNumber");
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