package com.sixku.mysql2kafka.dao.als7db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusinessTypeExample() {
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

        public Criteria andSortnoIsNull() {
            addCriterion("SORTNO is null");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("SORTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSortnoEqualTo(String value) {
            addCriterion("SORTNO =", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotEqualTo(String value) {
            addCriterion("SORTNO <>", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThan(String value) {
            addCriterion("SORTNO >", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(String value) {
            addCriterion("SORTNO >=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThan(String value) {
            addCriterion("SORTNO <", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThanOrEqualTo(String value) {
            addCriterion("SORTNO <=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLike(String value) {
            addCriterion("SORTNO like", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotLike(String value) {
            addCriterion("SORTNO not like", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoIn(List<String> values) {
            addCriterion("SORTNO in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotIn(List<String> values) {
            addCriterion("SORTNO not in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoBetween(String value1, String value2) {
            addCriterion("SORTNO between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotBetween(String value1, String value2) {
            addCriterion("SORTNO not between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andMinmoneyIsNull() {
            addCriterion("MINMONEY is null");
            return (Criteria) this;
        }

        public Criteria andMinmoneyIsNotNull() {
            addCriterion("MINMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMinmoneyEqualTo(String value) {
            addCriterion("MINMONEY =", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyNotEqualTo(String value) {
            addCriterion("MINMONEY <>", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyGreaterThan(String value) {
            addCriterion("MINMONEY >", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("MINMONEY >=", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyLessThan(String value) {
            addCriterion("MINMONEY <", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyLessThanOrEqualTo(String value) {
            addCriterion("MINMONEY <=", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyLike(String value) {
            addCriterion("MINMONEY like", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyNotLike(String value) {
            addCriterion("MINMONEY not like", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyIn(List<String> values) {
            addCriterion("MINMONEY in", values, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyNotIn(List<String> values) {
            addCriterion("MINMONEY not in", values, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyBetween(String value1, String value2) {
            addCriterion("MINMONEY between", value1, value2, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyNotBetween(String value1, String value2) {
            addCriterion("MINMONEY not between", value1, value2, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNull() {
            addCriterion("MAXMONEY is null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNotNull() {
            addCriterion("MAXMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyEqualTo(String value) {
            addCriterion("MAXMONEY =", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotEqualTo(String value) {
            addCriterion("MAXMONEY <>", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThan(String value) {
            addCriterion("MAXMONEY >", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("MAXMONEY >=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThan(String value) {
            addCriterion("MAXMONEY <", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThanOrEqualTo(String value) {
            addCriterion("MAXMONEY <=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLike(String value) {
            addCriterion("MAXMONEY like", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotLike(String value) {
            addCriterion("MAXMONEY not like", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIn(List<String> values) {
            addCriterion("MAXMONEY in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotIn(List<String> values) {
            addCriterion("MAXMONEY not in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyBetween(String value1, String value2) {
            addCriterion("MAXMONEY between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotBetween(String value1, String value2) {
            addCriterion("MAXMONEY not between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMinageIsNull() {
            addCriterion("MINAGE is null");
            return (Criteria) this;
        }

        public Criteria andMinageIsNotNull() {
            addCriterion("MINAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMinageEqualTo(String value) {
            addCriterion("MINAGE =", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageNotEqualTo(String value) {
            addCriterion("MINAGE <>", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageGreaterThan(String value) {
            addCriterion("MINAGE >", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageGreaterThanOrEqualTo(String value) {
            addCriterion("MINAGE >=", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageLessThan(String value) {
            addCriterion("MINAGE <", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageLessThanOrEqualTo(String value) {
            addCriterion("MINAGE <=", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageLike(String value) {
            addCriterion("MINAGE like", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageNotLike(String value) {
            addCriterion("MINAGE not like", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageIn(List<String> values) {
            addCriterion("MINAGE in", values, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageNotIn(List<String> values) {
            addCriterion("MINAGE not in", values, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageBetween(String value1, String value2) {
            addCriterion("MINAGE between", value1, value2, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageNotBetween(String value1, String value2) {
            addCriterion("MINAGE not between", value1, value2, "minage");
            return (Criteria) this;
        }

        public Criteria andMaxageIsNull() {
            addCriterion("MAXAGE is null");
            return (Criteria) this;
        }

        public Criteria andMaxageIsNotNull() {
            addCriterion("MAXAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxageEqualTo(String value) {
            addCriterion("MAXAGE =", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageNotEqualTo(String value) {
            addCriterion("MAXAGE <>", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageGreaterThan(String value) {
            addCriterion("MAXAGE >", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageGreaterThanOrEqualTo(String value) {
            addCriterion("MAXAGE >=", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageLessThan(String value) {
            addCriterion("MAXAGE <", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageLessThanOrEqualTo(String value) {
            addCriterion("MAXAGE <=", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageLike(String value) {
            addCriterion("MAXAGE like", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageNotLike(String value) {
            addCriterion("MAXAGE not like", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageIn(List<String> values) {
            addCriterion("MAXAGE in", values, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageNotIn(List<String> values) {
            addCriterion("MAXAGE not in", values, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageBetween(String value1, String value2) {
            addCriterion("MAXAGE between", value1, value2, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageNotBetween(String value1, String value2) {
            addCriterion("MAXAGE not between", value1, value2, "maxage");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("TYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("TYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("TYPENAME =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("TYPENAME <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("TYPENAME >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("TYPENAME >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("TYPENAME <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("TYPENAME <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("TYPENAME like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("TYPENAME not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("TYPENAME in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("TYPENAME not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("TYPENAME between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("TYPENAME not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypesortnoIsNull() {
            addCriterion("TYPESORTNO is null");
            return (Criteria) this;
        }

        public Criteria andTypesortnoIsNotNull() {
            addCriterion("TYPESORTNO is not null");
            return (Criteria) this;
        }

        public Criteria andTypesortnoEqualTo(String value) {
            addCriterion("TYPESORTNO =", value, "typesortno");
            return (Criteria) this;
        }

        public Criteria andTypesortnoNotEqualTo(String value) {
            addCriterion("TYPESORTNO <>", value, "typesortno");
            return (Criteria) this;
        }

        public Criteria andTypesortnoGreaterThan(String value) {
            addCriterion("TYPESORTNO >", value, "typesortno");
            return (Criteria) this;
        }

        public Criteria andTypesortnoGreaterThanOrEqualTo(String value) {
            addCriterion("TYPESORTNO >=", value, "typesortno");
            return (Criteria) this;
        }

        public Criteria andTypesortnoLessThan(String value) {
            addCriterion("TYPESORTNO <", value, "typesortno");
            return (Criteria) this;
        }

        public Criteria andTypesortnoLessThanOrEqualTo(String value) {
            addCriterion("TYPESORTNO <=", value, "typesortno");
            return (Criteria) this;
        }

        public Criteria andTypesortnoLike(String value) {
            addCriterion("TYPESORTNO like", value, "typesortno");
            return (Criteria) this;
        }

        public Criteria andTypesortnoNotLike(String value) {
            addCriterion("TYPESORTNO not like", value, "typesortno");
            return (Criteria) this;
        }

        public Criteria andTypesortnoIn(List<String> values) {
            addCriterion("TYPESORTNO in", values, "typesortno");
            return (Criteria) this;
        }

        public Criteria andTypesortnoNotIn(List<String> values) {
            addCriterion("TYPESORTNO not in", values, "typesortno");
            return (Criteria) this;
        }

        public Criteria andTypesortnoBetween(String value1, String value2) {
            addCriterion("TYPESORTNO between", value1, value2, "typesortno");
            return (Criteria) this;
        }

        public Criteria andTypesortnoNotBetween(String value1, String value2) {
            addCriterion("TYPESORTNO not between", value1, value2, "typesortno");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeIsNull() {
            addCriterion("SUBTYPECODE is null");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeIsNotNull() {
            addCriterion("SUBTYPECODE is not null");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeEqualTo(String value) {
            addCriterion("SUBTYPECODE =", value, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeNotEqualTo(String value) {
            addCriterion("SUBTYPECODE <>", value, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeGreaterThan(String value) {
            addCriterion("SUBTYPECODE >", value, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBTYPECODE >=", value, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeLessThan(String value) {
            addCriterion("SUBTYPECODE <", value, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeLessThanOrEqualTo(String value) {
            addCriterion("SUBTYPECODE <=", value, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeLike(String value) {
            addCriterion("SUBTYPECODE like", value, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeNotLike(String value) {
            addCriterion("SUBTYPECODE not like", value, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeIn(List<String> values) {
            addCriterion("SUBTYPECODE in", values, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeNotIn(List<String> values) {
            addCriterion("SUBTYPECODE not in", values, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeBetween(String value1, String value2) {
            addCriterion("SUBTYPECODE between", value1, value2, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andSubtypecodeNotBetween(String value1, String value2) {
            addCriterion("SUBTYPECODE not between", value1, value2, "subtypecode");
            return (Criteria) this;
        }

        public Criteria andInfosetIsNull() {
            addCriterion("INFOSET is null");
            return (Criteria) this;
        }

        public Criteria andInfosetIsNotNull() {
            addCriterion("INFOSET is not null");
            return (Criteria) this;
        }

        public Criteria andInfosetEqualTo(String value) {
            addCriterion("INFOSET =", value, "infoset");
            return (Criteria) this;
        }

        public Criteria andInfosetNotEqualTo(String value) {
            addCriterion("INFOSET <>", value, "infoset");
            return (Criteria) this;
        }

        public Criteria andInfosetGreaterThan(String value) {
            addCriterion("INFOSET >", value, "infoset");
            return (Criteria) this;
        }

        public Criteria andInfosetGreaterThanOrEqualTo(String value) {
            addCriterion("INFOSET >=", value, "infoset");
            return (Criteria) this;
        }

        public Criteria andInfosetLessThan(String value) {
            addCriterion("INFOSET <", value, "infoset");
            return (Criteria) this;
        }

        public Criteria andInfosetLessThanOrEqualTo(String value) {
            addCriterion("INFOSET <=", value, "infoset");
            return (Criteria) this;
        }

        public Criteria andInfosetLike(String value) {
            addCriterion("INFOSET like", value, "infoset");
            return (Criteria) this;
        }

        public Criteria andInfosetNotLike(String value) {
            addCriterion("INFOSET not like", value, "infoset");
            return (Criteria) this;
        }

        public Criteria andInfosetIn(List<String> values) {
            addCriterion("INFOSET in", values, "infoset");
            return (Criteria) this;
        }

        public Criteria andInfosetNotIn(List<String> values) {
            addCriterion("INFOSET not in", values, "infoset");
            return (Criteria) this;
        }

        public Criteria andInfosetBetween(String value1, String value2) {
            addCriterion("INFOSET between", value1, value2, "infoset");
            return (Criteria) this;
        }

        public Criteria andInfosetNotBetween(String value1, String value2) {
            addCriterion("INFOSET not between", value1, value2, "infoset");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletIsNull() {
            addCriterion("DISPLAYTEMPLET is null");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletIsNotNull() {
            addCriterion("DISPLAYTEMPLET is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletEqualTo(String value) {
            addCriterion("DISPLAYTEMPLET =", value, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletNotEqualTo(String value) {
            addCriterion("DISPLAYTEMPLET <>", value, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletGreaterThan(String value) {
            addCriterion("DISPLAYTEMPLET >", value, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAYTEMPLET >=", value, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletLessThan(String value) {
            addCriterion("DISPLAYTEMPLET <", value, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletLessThanOrEqualTo(String value) {
            addCriterion("DISPLAYTEMPLET <=", value, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletLike(String value) {
            addCriterion("DISPLAYTEMPLET like", value, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletNotLike(String value) {
            addCriterion("DISPLAYTEMPLET not like", value, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletIn(List<String> values) {
            addCriterion("DISPLAYTEMPLET in", values, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletNotIn(List<String> values) {
            addCriterion("DISPLAYTEMPLET not in", values, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletBetween(String value1, String value2) {
            addCriterion("DISPLAYTEMPLET between", value1, value2, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andDisplaytempletNotBetween(String value1, String value2) {
            addCriterion("DISPLAYTEMPLET not between", value1, value2, "displaytemplet");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNull() {
            addCriterion("ATTRIBUTE1 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNotNull() {
            addCriterion("ATTRIBUTE1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute1EqualTo(String value) {
            addCriterion("ATTRIBUTE1 =", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotEqualTo(String value) {
            addCriterion("ATTRIBUTE1 <>", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThan(String value) {
            addCriterion("ATTRIBUTE1 >", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE1 >=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThan(String value) {
            addCriterion("ATTRIBUTE1 <", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE1 <=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Like(String value) {
            addCriterion("ATTRIBUTE1 like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotLike(String value) {
            addCriterion("ATTRIBUTE1 not like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1In(List<String> values) {
            addCriterion("ATTRIBUTE1 in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotIn(List<String> values) {
            addCriterion("ATTRIBUTE1 not in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Between(String value1, String value2) {
            addCriterion("ATTRIBUTE1 between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE1 not between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNull() {
            addCriterion("ATTRIBUTE2 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNotNull() {
            addCriterion("ATTRIBUTE2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute2EqualTo(String value) {
            addCriterion("ATTRIBUTE2 =", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotEqualTo(String value) {
            addCriterion("ATTRIBUTE2 <>", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThan(String value) {
            addCriterion("ATTRIBUTE2 >", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE2 >=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThan(String value) {
            addCriterion("ATTRIBUTE2 <", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE2 <=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Like(String value) {
            addCriterion("ATTRIBUTE2 like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotLike(String value) {
            addCriterion("ATTRIBUTE2 not like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2In(List<String> values) {
            addCriterion("ATTRIBUTE2 in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotIn(List<String> values) {
            addCriterion("ATTRIBUTE2 not in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Between(String value1, String value2) {
            addCriterion("ATTRIBUTE2 between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE2 not between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNull() {
            addCriterion("ATTRIBUTE3 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNotNull() {
            addCriterion("ATTRIBUTE3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute3EqualTo(String value) {
            addCriterion("ATTRIBUTE3 =", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <>", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThan(String value) {
            addCriterion("ATTRIBUTE3 >", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 >=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThan(String value) {
            addCriterion("ATTRIBUTE3 <", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Like(String value) {
            addCriterion("ATTRIBUTE3 like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotLike(String value) {
            addCriterion("ATTRIBUTE3 not like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3In(List<String> values) {
            addCriterion("ATTRIBUTE3 in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotIn(List<String> values) {
            addCriterion("ATTRIBUTE3 not in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Between(String value1, String value2) {
            addCriterion("ATTRIBUTE3 between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE3 not between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNull() {
            addCriterion("ATTRIBUTE4 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNotNull() {
            addCriterion("ATTRIBUTE4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute4EqualTo(String value) {
            addCriterion("ATTRIBUTE4 =", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotEqualTo(String value) {
            addCriterion("ATTRIBUTE4 <>", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThan(String value) {
            addCriterion("ATTRIBUTE4 >", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE4 >=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThan(String value) {
            addCriterion("ATTRIBUTE4 <", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE4 <=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Like(String value) {
            addCriterion("ATTRIBUTE4 like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotLike(String value) {
            addCriterion("ATTRIBUTE4 not like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4In(List<String> values) {
            addCriterion("ATTRIBUTE4 in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotIn(List<String> values) {
            addCriterion("ATTRIBUTE4 not in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Between(String value1, String value2) {
            addCriterion("ATTRIBUTE4 between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE4 not between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNull() {
            addCriterion("ATTRIBUTE5 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNotNull() {
            addCriterion("ATTRIBUTE5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute5EqualTo(String value) {
            addCriterion("ATTRIBUTE5 =", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotEqualTo(String value) {
            addCriterion("ATTRIBUTE5 <>", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThan(String value) {
            addCriterion("ATTRIBUTE5 >", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE5 >=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThan(String value) {
            addCriterion("ATTRIBUTE5 <", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE5 <=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Like(String value) {
            addCriterion("ATTRIBUTE5 like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotLike(String value) {
            addCriterion("ATTRIBUTE5 not like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5In(List<String> values) {
            addCriterion("ATTRIBUTE5 in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotIn(List<String> values) {
            addCriterion("ATTRIBUTE5 not in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Between(String value1, String value2) {
            addCriterion("ATTRIBUTE5 between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE5 not between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute6IsNull() {
            addCriterion("ATTRIBUTE6 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute6IsNotNull() {
            addCriterion("ATTRIBUTE6 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute6EqualTo(String value) {
            addCriterion("ATTRIBUTE6 =", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotEqualTo(String value) {
            addCriterion("ATTRIBUTE6 <>", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6GreaterThan(String value) {
            addCriterion("ATTRIBUTE6 >", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE6 >=", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6LessThan(String value) {
            addCriterion("ATTRIBUTE6 <", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE6 <=", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6Like(String value) {
            addCriterion("ATTRIBUTE6 like", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotLike(String value) {
            addCriterion("ATTRIBUTE6 not like", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6In(List<String> values) {
            addCriterion("ATTRIBUTE6 in", values, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotIn(List<String> values) {
            addCriterion("ATTRIBUTE6 not in", values, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6Between(String value1, String value2) {
            addCriterion("ATTRIBUTE6 between", value1, value2, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE6 not between", value1, value2, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute7IsNull() {
            addCriterion("ATTRIBUTE7 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute7IsNotNull() {
            addCriterion("ATTRIBUTE7 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute7EqualTo(String value) {
            addCriterion("ATTRIBUTE7 =", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotEqualTo(String value) {
            addCriterion("ATTRIBUTE7 <>", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7GreaterThan(String value) {
            addCriterion("ATTRIBUTE7 >", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE7 >=", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7LessThan(String value) {
            addCriterion("ATTRIBUTE7 <", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE7 <=", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7Like(String value) {
            addCriterion("ATTRIBUTE7 like", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotLike(String value) {
            addCriterion("ATTRIBUTE7 not like", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7In(List<String> values) {
            addCriterion("ATTRIBUTE7 in", values, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotIn(List<String> values) {
            addCriterion("ATTRIBUTE7 not in", values, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7Between(String value1, String value2) {
            addCriterion("ATTRIBUTE7 between", value1, value2, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE7 not between", value1, value2, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute8IsNull() {
            addCriterion("ATTRIBUTE8 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute8IsNotNull() {
            addCriterion("ATTRIBUTE8 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute8EqualTo(String value) {
            addCriterion("ATTRIBUTE8 =", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotEqualTo(String value) {
            addCriterion("ATTRIBUTE8 <>", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8GreaterThan(String value) {
            addCriterion("ATTRIBUTE8 >", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE8 >=", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8LessThan(String value) {
            addCriterion("ATTRIBUTE8 <", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE8 <=", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8Like(String value) {
            addCriterion("ATTRIBUTE8 like", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotLike(String value) {
            addCriterion("ATTRIBUTE8 not like", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8In(List<String> values) {
            addCriterion("ATTRIBUTE8 in", values, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotIn(List<String> values) {
            addCriterion("ATTRIBUTE8 not in", values, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8Between(String value1, String value2) {
            addCriterion("ATTRIBUTE8 between", value1, value2, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE8 not between", value1, value2, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute9IsNull() {
            addCriterion("ATTRIBUTE9 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute9IsNotNull() {
            addCriterion("ATTRIBUTE9 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute9EqualTo(String value) {
            addCriterion("ATTRIBUTE9 =", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotEqualTo(String value) {
            addCriterion("ATTRIBUTE9 <>", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThan(String value) {
            addCriterion("ATTRIBUTE9 >", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE9 >=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThan(String value) {
            addCriterion("ATTRIBUTE9 <", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE9 <=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9Like(String value) {
            addCriterion("ATTRIBUTE9 like", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotLike(String value) {
            addCriterion("ATTRIBUTE9 not like", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9In(List<String> values) {
            addCriterion("ATTRIBUTE9 in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotIn(List<String> values) {
            addCriterion("ATTRIBUTE9 not in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9Between(String value1, String value2) {
            addCriterion("ATTRIBUTE9 between", value1, value2, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE9 not between", value1, value2, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute10IsNull() {
            addCriterion("ATTRIBUTE10 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute10IsNotNull() {
            addCriterion("ATTRIBUTE10 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute10EqualTo(String value) {
            addCriterion("ATTRIBUTE10 =", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotEqualTo(String value) {
            addCriterion("ATTRIBUTE10 <>", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThan(String value) {
            addCriterion("ATTRIBUTE10 >", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE10 >=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThan(String value) {
            addCriterion("ATTRIBUTE10 <", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE10 <=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10Like(String value) {
            addCriterion("ATTRIBUTE10 like", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotLike(String value) {
            addCriterion("ATTRIBUTE10 not like", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10In(List<String> values) {
            addCriterion("ATTRIBUTE10 in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotIn(List<String> values) {
            addCriterion("ATTRIBUTE10 not in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10Between(String value1, String value2) {
            addCriterion("ATTRIBUTE10 between", value1, value2, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE10 not between", value1, value2, "attribute10");
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

        public Criteria andApplydetailnoIsNull() {
            addCriterion("APPLYDETAILNO is null");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoIsNotNull() {
            addCriterion("APPLYDETAILNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoEqualTo(String value) {
            addCriterion("APPLYDETAILNO =", value, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoNotEqualTo(String value) {
            addCriterion("APPLYDETAILNO <>", value, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoGreaterThan(String value) {
            addCriterion("APPLYDETAILNO >", value, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYDETAILNO >=", value, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoLessThan(String value) {
            addCriterion("APPLYDETAILNO <", value, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoLessThanOrEqualTo(String value) {
            addCriterion("APPLYDETAILNO <=", value, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoLike(String value) {
            addCriterion("APPLYDETAILNO like", value, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoNotLike(String value) {
            addCriterion("APPLYDETAILNO not like", value, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoIn(List<String> values) {
            addCriterion("APPLYDETAILNO in", values, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoNotIn(List<String> values) {
            addCriterion("APPLYDETAILNO not in", values, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoBetween(String value1, String value2) {
            addCriterion("APPLYDETAILNO between", value1, value2, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApplydetailnoNotBetween(String value1, String value2) {
            addCriterion("APPLYDETAILNO not between", value1, value2, "applydetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoIsNull() {
            addCriterion("APPROVEDETAILNO is null");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoIsNotNull() {
            addCriterion("APPROVEDETAILNO is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoEqualTo(String value) {
            addCriterion("APPROVEDETAILNO =", value, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoNotEqualTo(String value) {
            addCriterion("APPROVEDETAILNO <>", value, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoGreaterThan(String value) {
            addCriterion("APPROVEDETAILNO >", value, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVEDETAILNO >=", value, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoLessThan(String value) {
            addCriterion("APPROVEDETAILNO <", value, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoLessThanOrEqualTo(String value) {
            addCriterion("APPROVEDETAILNO <=", value, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoLike(String value) {
            addCriterion("APPROVEDETAILNO like", value, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoNotLike(String value) {
            addCriterion("APPROVEDETAILNO not like", value, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoIn(List<String> values) {
            addCriterion("APPROVEDETAILNO in", values, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoNotIn(List<String> values) {
            addCriterion("APPROVEDETAILNO not in", values, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoBetween(String value1, String value2) {
            addCriterion("APPROVEDETAILNO between", value1, value2, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andApprovedetailnoNotBetween(String value1, String value2) {
            addCriterion("APPROVEDETAILNO not between", value1, value2, "approvedetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoIsNull() {
            addCriterion("CONTRACTDETAILNO is null");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoIsNotNull() {
            addCriterion("CONTRACTDETAILNO is not null");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoEqualTo(String value) {
            addCriterion("CONTRACTDETAILNO =", value, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoNotEqualTo(String value) {
            addCriterion("CONTRACTDETAILNO <>", value, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoGreaterThan(String value) {
            addCriterion("CONTRACTDETAILNO >", value, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTDETAILNO >=", value, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoLessThan(String value) {
            addCriterion("CONTRACTDETAILNO <", value, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTDETAILNO <=", value, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoLike(String value) {
            addCriterion("CONTRACTDETAILNO like", value, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoNotLike(String value) {
            addCriterion("CONTRACTDETAILNO not like", value, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoIn(List<String> values) {
            addCriterion("CONTRACTDETAILNO in", values, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoNotIn(List<String> values) {
            addCriterion("CONTRACTDETAILNO not in", values, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoBetween(String value1, String value2) {
            addCriterion("CONTRACTDETAILNO between", value1, value2, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andContractdetailnoNotBetween(String value1, String value2) {
            addCriterion("CONTRACTDETAILNO not between", value1, value2, "contractdetailno");
            return (Criteria) this;
        }

        public Criteria andInputuserIsNull() {
            addCriterion("INPUTUSER is null");
            return (Criteria) this;
        }

        public Criteria andInputuserIsNotNull() {
            addCriterion("INPUTUSER is not null");
            return (Criteria) this;
        }

        public Criteria andInputuserEqualTo(String value) {
            addCriterion("INPUTUSER =", value, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputuserNotEqualTo(String value) {
            addCriterion("INPUTUSER <>", value, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputuserGreaterThan(String value) {
            addCriterion("INPUTUSER >", value, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputuserGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTUSER >=", value, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputuserLessThan(String value) {
            addCriterion("INPUTUSER <", value, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputuserLessThanOrEqualTo(String value) {
            addCriterion("INPUTUSER <=", value, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputuserLike(String value) {
            addCriterion("INPUTUSER like", value, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputuserNotLike(String value) {
            addCriterion("INPUTUSER not like", value, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputuserIn(List<String> values) {
            addCriterion("INPUTUSER in", values, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputuserNotIn(List<String> values) {
            addCriterion("INPUTUSER not in", values, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputuserBetween(String value1, String value2) {
            addCriterion("INPUTUSER between", value1, value2, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputuserNotBetween(String value1, String value2) {
            addCriterion("INPUTUSER not between", value1, value2, "inputuser");
            return (Criteria) this;
        }

        public Criteria andInputorgIsNull() {
            addCriterion("INPUTORG is null");
            return (Criteria) this;
        }

        public Criteria andInputorgIsNotNull() {
            addCriterion("INPUTORG is not null");
            return (Criteria) this;
        }

        public Criteria andInputorgEqualTo(String value) {
            addCriterion("INPUTORG =", value, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputorgNotEqualTo(String value) {
            addCriterion("INPUTORG <>", value, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputorgGreaterThan(String value) {
            addCriterion("INPUTORG >", value, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputorgGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTORG >=", value, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputorgLessThan(String value) {
            addCriterion("INPUTORG <", value, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputorgLessThanOrEqualTo(String value) {
            addCriterion("INPUTORG <=", value, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputorgLike(String value) {
            addCriterion("INPUTORG like", value, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputorgNotLike(String value) {
            addCriterion("INPUTORG not like", value, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputorgIn(List<String> values) {
            addCriterion("INPUTORG in", values, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputorgNotIn(List<String> values) {
            addCriterion("INPUTORG not in", values, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputorgBetween(String value1, String value2) {
            addCriterion("INPUTORG between", value1, value2, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputorgNotBetween(String value1, String value2) {
            addCriterion("INPUTORG not between", value1, value2, "inputorg");
            return (Criteria) this;
        }

        public Criteria andInputtimeIsNull() {
            addCriterion("INPUTTIME is null");
            return (Criteria) this;
        }

        public Criteria andInputtimeIsNotNull() {
            addCriterion("INPUTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInputtimeEqualTo(String value) {
            addCriterion("INPUTTIME =", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotEqualTo(String value) {
            addCriterion("INPUTTIME <>", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeGreaterThan(String value) {
            addCriterion("INPUTTIME >", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTTIME >=", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLessThan(String value) {
            addCriterion("INPUTTIME <", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLessThanOrEqualTo(String value) {
            addCriterion("INPUTTIME <=", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLike(String value) {
            addCriterion("INPUTTIME like", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotLike(String value) {
            addCriterion("INPUTTIME not like", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeIn(List<String> values) {
            addCriterion("INPUTTIME in", values, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotIn(List<String> values) {
            addCriterion("INPUTTIME not in", values, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeBetween(String value1, String value2) {
            addCriterion("INPUTTIME between", value1, value2, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotBetween(String value1, String value2) {
            addCriterion("INPUTTIME not between", value1, value2, "inputtime");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNull() {
            addCriterion("UPDATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("UPDATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("UPDATEUSER =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("UPDATEUSER <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("UPDATEUSER >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("UPDATEUSER <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("UPDATEUSER like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("UPDATEUSER not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("UPDATEUSER in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("UPDATEUSER not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("UPDATEUSER between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("UPDATEUSER not between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("UPDATETIME like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("UPDATETIME not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andAttribute11IsNull() {
            addCriterion("ATTRIBUTE11 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute11IsNotNull() {
            addCriterion("ATTRIBUTE11 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute11EqualTo(String value) {
            addCriterion("ATTRIBUTE11 =", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotEqualTo(String value) {
            addCriterion("ATTRIBUTE11 <>", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11GreaterThan(String value) {
            addCriterion("ATTRIBUTE11 >", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE11 >=", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11LessThan(String value) {
            addCriterion("ATTRIBUTE11 <", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE11 <=", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11Like(String value) {
            addCriterion("ATTRIBUTE11 like", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotLike(String value) {
            addCriterion("ATTRIBUTE11 not like", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11In(List<String> values) {
            addCriterion("ATTRIBUTE11 in", values, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotIn(List<String> values) {
            addCriterion("ATTRIBUTE11 not in", values, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11Between(String value1, String value2) {
            addCriterion("ATTRIBUTE11 between", value1, value2, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE11 not between", value1, value2, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute12IsNull() {
            addCriterion("ATTRIBUTE12 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute12IsNotNull() {
            addCriterion("ATTRIBUTE12 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute12EqualTo(String value) {
            addCriterion("ATTRIBUTE12 =", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12NotEqualTo(String value) {
            addCriterion("ATTRIBUTE12 <>", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12GreaterThan(String value) {
            addCriterion("ATTRIBUTE12 >", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE12 >=", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12LessThan(String value) {
            addCriterion("ATTRIBUTE12 <", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE12 <=", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12Like(String value) {
            addCriterion("ATTRIBUTE12 like", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12NotLike(String value) {
            addCriterion("ATTRIBUTE12 not like", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12In(List<String> values) {
            addCriterion("ATTRIBUTE12 in", values, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12NotIn(List<String> values) {
            addCriterion("ATTRIBUTE12 not in", values, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12Between(String value1, String value2) {
            addCriterion("ATTRIBUTE12 between", value1, value2, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE12 not between", value1, value2, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute13IsNull() {
            addCriterion("ATTRIBUTE13 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute13IsNotNull() {
            addCriterion("ATTRIBUTE13 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute13EqualTo(String value) {
            addCriterion("ATTRIBUTE13 =", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13NotEqualTo(String value) {
            addCriterion("ATTRIBUTE13 <>", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13GreaterThan(String value) {
            addCriterion("ATTRIBUTE13 >", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE13 >=", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13LessThan(String value) {
            addCriterion("ATTRIBUTE13 <", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE13 <=", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13Like(String value) {
            addCriterion("ATTRIBUTE13 like", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13NotLike(String value) {
            addCriterion("ATTRIBUTE13 not like", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13In(List<String> values) {
            addCriterion("ATTRIBUTE13 in", values, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13NotIn(List<String> values) {
            addCriterion("ATTRIBUTE13 not in", values, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13Between(String value1, String value2) {
            addCriterion("ATTRIBUTE13 between", value1, value2, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE13 not between", value1, value2, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute14IsNull() {
            addCriterion("ATTRIBUTE14 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute14IsNotNull() {
            addCriterion("ATTRIBUTE14 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute14EqualTo(String value) {
            addCriterion("ATTRIBUTE14 =", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotEqualTo(String value) {
            addCriterion("ATTRIBUTE14 <>", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14GreaterThan(String value) {
            addCriterion("ATTRIBUTE14 >", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE14 >=", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14LessThan(String value) {
            addCriterion("ATTRIBUTE14 <", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE14 <=", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14Like(String value) {
            addCriterion("ATTRIBUTE14 like", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotLike(String value) {
            addCriterion("ATTRIBUTE14 not like", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14In(List<String> values) {
            addCriterion("ATTRIBUTE14 in", values, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotIn(List<String> values) {
            addCriterion("ATTRIBUTE14 not in", values, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14Between(String value1, String value2) {
            addCriterion("ATTRIBUTE14 between", value1, value2, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE14 not between", value1, value2, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute15IsNull() {
            addCriterion("ATTRIBUTE15 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute15IsNotNull() {
            addCriterion("ATTRIBUTE15 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute15EqualTo(String value) {
            addCriterion("ATTRIBUTE15 =", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotEqualTo(String value) {
            addCriterion("ATTRIBUTE15 <>", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15GreaterThan(String value) {
            addCriterion("ATTRIBUTE15 >", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE15 >=", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15LessThan(String value) {
            addCriterion("ATTRIBUTE15 <", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE15 <=", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15Like(String value) {
            addCriterion("ATTRIBUTE15 like", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotLike(String value) {
            addCriterion("ATTRIBUTE15 not like", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15In(List<String> values) {
            addCriterion("ATTRIBUTE15 in", values, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotIn(List<String> values) {
            addCriterion("ATTRIBUTE15 not in", values, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15Between(String value1, String value2) {
            addCriterion("ATTRIBUTE15 between", value1, value2, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE15 not between", value1, value2, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute16IsNull() {
            addCriterion("ATTRIBUTE16 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute16IsNotNull() {
            addCriterion("ATTRIBUTE16 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute16EqualTo(String value) {
            addCriterion("ATTRIBUTE16 =", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16NotEqualTo(String value) {
            addCriterion("ATTRIBUTE16 <>", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16GreaterThan(String value) {
            addCriterion("ATTRIBUTE16 >", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE16 >=", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16LessThan(String value) {
            addCriterion("ATTRIBUTE16 <", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE16 <=", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16Like(String value) {
            addCriterion("ATTRIBUTE16 like", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16NotLike(String value) {
            addCriterion("ATTRIBUTE16 not like", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16In(List<String> values) {
            addCriterion("ATTRIBUTE16 in", values, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16NotIn(List<String> values) {
            addCriterion("ATTRIBUTE16 not in", values, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16Between(String value1, String value2) {
            addCriterion("ATTRIBUTE16 between", value1, value2, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE16 not between", value1, value2, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute17IsNull() {
            addCriterion("ATTRIBUTE17 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute17IsNotNull() {
            addCriterion("ATTRIBUTE17 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute17EqualTo(String value) {
            addCriterion("ATTRIBUTE17 =", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17NotEqualTo(String value) {
            addCriterion("ATTRIBUTE17 <>", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17GreaterThan(String value) {
            addCriterion("ATTRIBUTE17 >", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE17 >=", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17LessThan(String value) {
            addCriterion("ATTRIBUTE17 <", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE17 <=", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17Like(String value) {
            addCriterion("ATTRIBUTE17 like", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17NotLike(String value) {
            addCriterion("ATTRIBUTE17 not like", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17In(List<String> values) {
            addCriterion("ATTRIBUTE17 in", values, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17NotIn(List<String> values) {
            addCriterion("ATTRIBUTE17 not in", values, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17Between(String value1, String value2) {
            addCriterion("ATTRIBUTE17 between", value1, value2, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE17 not between", value1, value2, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute18IsNull() {
            addCriterion("ATTRIBUTE18 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute18IsNotNull() {
            addCriterion("ATTRIBUTE18 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute18EqualTo(String value) {
            addCriterion("ATTRIBUTE18 =", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18NotEqualTo(String value) {
            addCriterion("ATTRIBUTE18 <>", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18GreaterThan(String value) {
            addCriterion("ATTRIBUTE18 >", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE18 >=", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18LessThan(String value) {
            addCriterion("ATTRIBUTE18 <", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE18 <=", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18Like(String value) {
            addCriterion("ATTRIBUTE18 like", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18NotLike(String value) {
            addCriterion("ATTRIBUTE18 not like", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18In(List<String> values) {
            addCriterion("ATTRIBUTE18 in", values, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18NotIn(List<String> values) {
            addCriterion("ATTRIBUTE18 not in", values, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18Between(String value1, String value2) {
            addCriterion("ATTRIBUTE18 between", value1, value2, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE18 not between", value1, value2, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute19IsNull() {
            addCriterion("ATTRIBUTE19 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute19IsNotNull() {
            addCriterion("ATTRIBUTE19 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute19EqualTo(String value) {
            addCriterion("ATTRIBUTE19 =", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19NotEqualTo(String value) {
            addCriterion("ATTRIBUTE19 <>", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19GreaterThan(String value) {
            addCriterion("ATTRIBUTE19 >", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE19 >=", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19LessThan(String value) {
            addCriterion("ATTRIBUTE19 <", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE19 <=", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19Like(String value) {
            addCriterion("ATTRIBUTE19 like", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19NotLike(String value) {
            addCriterion("ATTRIBUTE19 not like", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19In(List<String> values) {
            addCriterion("ATTRIBUTE19 in", values, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19NotIn(List<String> values) {
            addCriterion("ATTRIBUTE19 not in", values, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19Between(String value1, String value2) {
            addCriterion("ATTRIBUTE19 between", value1, value2, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE19 not between", value1, value2, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute20IsNull() {
            addCriterion("ATTRIBUTE20 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute20IsNotNull() {
            addCriterion("ATTRIBUTE20 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute20EqualTo(String value) {
            addCriterion("ATTRIBUTE20 =", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20NotEqualTo(String value) {
            addCriterion("ATTRIBUTE20 <>", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20GreaterThan(String value) {
            addCriterion("ATTRIBUTE20 >", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE20 >=", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20LessThan(String value) {
            addCriterion("ATTRIBUTE20 <", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE20 <=", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20Like(String value) {
            addCriterion("ATTRIBUTE20 like", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20NotLike(String value) {
            addCriterion("ATTRIBUTE20 not like", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20In(List<String> values) {
            addCriterion("ATTRIBUTE20 in", values, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20NotIn(List<String> values) {
            addCriterion("ATTRIBUTE20 not in", values, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20Between(String value1, String value2) {
            addCriterion("ATTRIBUTE20 between", value1, value2, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE20 not between", value1, value2, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute21IsNull() {
            addCriterion("ATTRIBUTE21 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute21IsNotNull() {
            addCriterion("ATTRIBUTE21 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute21EqualTo(String value) {
            addCriterion("ATTRIBUTE21 =", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21NotEqualTo(String value) {
            addCriterion("ATTRIBUTE21 <>", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21GreaterThan(String value) {
            addCriterion("ATTRIBUTE21 >", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE21 >=", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21LessThan(String value) {
            addCriterion("ATTRIBUTE21 <", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE21 <=", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21Like(String value) {
            addCriterion("ATTRIBUTE21 like", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21NotLike(String value) {
            addCriterion("ATTRIBUTE21 not like", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21In(List<String> values) {
            addCriterion("ATTRIBUTE21 in", values, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21NotIn(List<String> values) {
            addCriterion("ATTRIBUTE21 not in", values, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21Between(String value1, String value2) {
            addCriterion("ATTRIBUTE21 between", value1, value2, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE21 not between", value1, value2, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute22IsNull() {
            addCriterion("ATTRIBUTE22 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute22IsNotNull() {
            addCriterion("ATTRIBUTE22 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute22EqualTo(String value) {
            addCriterion("ATTRIBUTE22 =", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22NotEqualTo(String value) {
            addCriterion("ATTRIBUTE22 <>", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22GreaterThan(String value) {
            addCriterion("ATTRIBUTE22 >", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE22 >=", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22LessThan(String value) {
            addCriterion("ATTRIBUTE22 <", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE22 <=", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22Like(String value) {
            addCriterion("ATTRIBUTE22 like", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22NotLike(String value) {
            addCriterion("ATTRIBUTE22 not like", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22In(List<String> values) {
            addCriterion("ATTRIBUTE22 in", values, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22NotIn(List<String> values) {
            addCriterion("ATTRIBUTE22 not in", values, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22Between(String value1, String value2) {
            addCriterion("ATTRIBUTE22 between", value1, value2, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE22 not between", value1, value2, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute23IsNull() {
            addCriterion("ATTRIBUTE23 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute23IsNotNull() {
            addCriterion("ATTRIBUTE23 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute23EqualTo(String value) {
            addCriterion("ATTRIBUTE23 =", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23NotEqualTo(String value) {
            addCriterion("ATTRIBUTE23 <>", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23GreaterThan(String value) {
            addCriterion("ATTRIBUTE23 >", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE23 >=", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23LessThan(String value) {
            addCriterion("ATTRIBUTE23 <", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE23 <=", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23Like(String value) {
            addCriterion("ATTRIBUTE23 like", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23NotLike(String value) {
            addCriterion("ATTRIBUTE23 not like", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23In(List<String> values) {
            addCriterion("ATTRIBUTE23 in", values, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23NotIn(List<String> values) {
            addCriterion("ATTRIBUTE23 not in", values, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23Between(String value1, String value2) {
            addCriterion("ATTRIBUTE23 between", value1, value2, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE23 not between", value1, value2, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute24IsNull() {
            addCriterion("ATTRIBUTE24 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute24IsNotNull() {
            addCriterion("ATTRIBUTE24 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute24EqualTo(String value) {
            addCriterion("ATTRIBUTE24 =", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24NotEqualTo(String value) {
            addCriterion("ATTRIBUTE24 <>", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24GreaterThan(String value) {
            addCriterion("ATTRIBUTE24 >", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE24 >=", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24LessThan(String value) {
            addCriterion("ATTRIBUTE24 <", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE24 <=", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24Like(String value) {
            addCriterion("ATTRIBUTE24 like", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24NotLike(String value) {
            addCriterion("ATTRIBUTE24 not like", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24In(List<String> values) {
            addCriterion("ATTRIBUTE24 in", values, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24NotIn(List<String> values) {
            addCriterion("ATTRIBUTE24 not in", values, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24Between(String value1, String value2) {
            addCriterion("ATTRIBUTE24 between", value1, value2, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE24 not between", value1, value2, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute25IsNull() {
            addCriterion("ATTRIBUTE25 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute25IsNotNull() {
            addCriterion("ATTRIBUTE25 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute25EqualTo(String value) {
            addCriterion("ATTRIBUTE25 =", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25NotEqualTo(String value) {
            addCriterion("ATTRIBUTE25 <>", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25GreaterThan(String value) {
            addCriterion("ATTRIBUTE25 >", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE25 >=", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25LessThan(String value) {
            addCriterion("ATTRIBUTE25 <", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE25 <=", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25Like(String value) {
            addCriterion("ATTRIBUTE25 like", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25NotLike(String value) {
            addCriterion("ATTRIBUTE25 not like", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25In(List<String> values) {
            addCriterion("ATTRIBUTE25 in", values, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25NotIn(List<String> values) {
            addCriterion("ATTRIBUTE25 not in", values, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25Between(String value1, String value2) {
            addCriterion("ATTRIBUTE25 between", value1, value2, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE25 not between", value1, value2, "attribute25");
            return (Criteria) this;
        }

        public Criteria andIsinuseIsNull() {
            addCriterion("ISINUSE is null");
            return (Criteria) this;
        }

        public Criteria andIsinuseIsNotNull() {
            addCriterion("ISINUSE is not null");
            return (Criteria) this;
        }

        public Criteria andIsinuseEqualTo(String value) {
            addCriterion("ISINUSE =", value, "isinuse");
            return (Criteria) this;
        }

        public Criteria andIsinuseNotEqualTo(String value) {
            addCriterion("ISINUSE <>", value, "isinuse");
            return (Criteria) this;
        }

        public Criteria andIsinuseGreaterThan(String value) {
            addCriterion("ISINUSE >", value, "isinuse");
            return (Criteria) this;
        }

        public Criteria andIsinuseGreaterThanOrEqualTo(String value) {
            addCriterion("ISINUSE >=", value, "isinuse");
            return (Criteria) this;
        }

        public Criteria andIsinuseLessThan(String value) {
            addCriterion("ISINUSE <", value, "isinuse");
            return (Criteria) this;
        }

        public Criteria andIsinuseLessThanOrEqualTo(String value) {
            addCriterion("ISINUSE <=", value, "isinuse");
            return (Criteria) this;
        }

        public Criteria andIsinuseLike(String value) {
            addCriterion("ISINUSE like", value, "isinuse");
            return (Criteria) this;
        }

        public Criteria andIsinuseNotLike(String value) {
            addCriterion("ISINUSE not like", value, "isinuse");
            return (Criteria) this;
        }

        public Criteria andIsinuseIn(List<String> values) {
            addCriterion("ISINUSE in", values, "isinuse");
            return (Criteria) this;
        }

        public Criteria andIsinuseNotIn(List<String> values) {
            addCriterion("ISINUSE not in", values, "isinuse");
            return (Criteria) this;
        }

        public Criteria andIsinuseBetween(String value1, String value2) {
            addCriterion("ISINUSE between", value1, value2, "isinuse");
            return (Criteria) this;
        }

        public Criteria andIsinuseNotBetween(String value1, String value2) {
            addCriterion("ISINUSE not between", value1, value2, "isinuse");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagIsNull() {
            addCriterion("OFFSHEETFLAG is null");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagIsNotNull() {
            addCriterion("OFFSHEETFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagEqualTo(String value) {
            addCriterion("OFFSHEETFLAG =", value, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagNotEqualTo(String value) {
            addCriterion("OFFSHEETFLAG <>", value, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagGreaterThan(String value) {
            addCriterion("OFFSHEETFLAG >", value, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagGreaterThanOrEqualTo(String value) {
            addCriterion("OFFSHEETFLAG >=", value, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagLessThan(String value) {
            addCriterion("OFFSHEETFLAG <", value, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagLessThanOrEqualTo(String value) {
            addCriterion("OFFSHEETFLAG <=", value, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagLike(String value) {
            addCriterion("OFFSHEETFLAG like", value, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagNotLike(String value) {
            addCriterion("OFFSHEETFLAG not like", value, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagIn(List<String> values) {
            addCriterion("OFFSHEETFLAG in", values, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagNotIn(List<String> values) {
            addCriterion("OFFSHEETFLAG not in", values, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagBetween(String value1, String value2) {
            addCriterion("OFFSHEETFLAG between", value1, value2, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andOffsheetflagNotBetween(String value1, String value2) {
            addCriterion("OFFSHEETFLAG not between", value1, value2, "offsheetflag");
            return (Criteria) this;
        }

        public Criteria andIsaheadIsNull() {
            addCriterion("ISAHEAD is null");
            return (Criteria) this;
        }

        public Criteria andIsaheadIsNotNull() {
            addCriterion("ISAHEAD is not null");
            return (Criteria) this;
        }

        public Criteria andIsaheadEqualTo(String value) {
            addCriterion("ISAHEAD =", value, "isahead");
            return (Criteria) this;
        }

        public Criteria andIsaheadNotEqualTo(String value) {
            addCriterion("ISAHEAD <>", value, "isahead");
            return (Criteria) this;
        }

        public Criteria andIsaheadGreaterThan(String value) {
            addCriterion("ISAHEAD >", value, "isahead");
            return (Criteria) this;
        }

        public Criteria andIsaheadGreaterThanOrEqualTo(String value) {
            addCriterion("ISAHEAD >=", value, "isahead");
            return (Criteria) this;
        }

        public Criteria andIsaheadLessThan(String value) {
            addCriterion("ISAHEAD <", value, "isahead");
            return (Criteria) this;
        }

        public Criteria andIsaheadLessThanOrEqualTo(String value) {
            addCriterion("ISAHEAD <=", value, "isahead");
            return (Criteria) this;
        }

        public Criteria andIsaheadLike(String value) {
            addCriterion("ISAHEAD like", value, "isahead");
            return (Criteria) this;
        }

        public Criteria andIsaheadNotLike(String value) {
            addCriterion("ISAHEAD not like", value, "isahead");
            return (Criteria) this;
        }

        public Criteria andIsaheadIn(List<String> values) {
            addCriterion("ISAHEAD in", values, "isahead");
            return (Criteria) this;
        }

        public Criteria andIsaheadNotIn(List<String> values) {
            addCriterion("ISAHEAD not in", values, "isahead");
            return (Criteria) this;
        }

        public Criteria andIsaheadBetween(String value1, String value2) {
            addCriterion("ISAHEAD between", value1, value2, "isahead");
            return (Criteria) this;
        }

        public Criteria andIsaheadNotBetween(String value1, String value2) {
            addCriterion("ISAHEAD not between", value1, value2, "isahead");
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

        public Criteria andChannelFgIsNull() {
            addCriterion("channel_fg is null");
            return (Criteria) this;
        }

        public Criteria andChannelFgIsNotNull() {
            addCriterion("channel_fg is not null");
            return (Criteria) this;
        }

        public Criteria andChannelFgEqualTo(String value) {
            addCriterion("channel_fg =", value, "channelFg");
            return (Criteria) this;
        }

        public Criteria andChannelFgNotEqualTo(String value) {
            addCriterion("channel_fg <>", value, "channelFg");
            return (Criteria) this;
        }

        public Criteria andChannelFgGreaterThan(String value) {
            addCriterion("channel_fg >", value, "channelFg");
            return (Criteria) this;
        }

        public Criteria andChannelFgGreaterThanOrEqualTo(String value) {
            addCriterion("channel_fg >=", value, "channelFg");
            return (Criteria) this;
        }

        public Criteria andChannelFgLessThan(String value) {
            addCriterion("channel_fg <", value, "channelFg");
            return (Criteria) this;
        }

        public Criteria andChannelFgLessThanOrEqualTo(String value) {
            addCriterion("channel_fg <=", value, "channelFg");
            return (Criteria) this;
        }

        public Criteria andChannelFgLike(String value) {
            addCriterion("channel_fg like", value, "channelFg");
            return (Criteria) this;
        }

        public Criteria andChannelFgNotLike(String value) {
            addCriterion("channel_fg not like", value, "channelFg");
            return (Criteria) this;
        }

        public Criteria andChannelFgIn(List<String> values) {
            addCriterion("channel_fg in", values, "channelFg");
            return (Criteria) this;
        }

        public Criteria andChannelFgNotIn(List<String> values) {
            addCriterion("channel_fg not in", values, "channelFg");
            return (Criteria) this;
        }

        public Criteria andChannelFgBetween(String value1, String value2) {
            addCriterion("channel_fg between", value1, value2, "channelFg");
            return (Criteria) this;
        }

        public Criteria andChannelFgNotBetween(String value1, String value2) {
            addCriterion("channel_fg not between", value1, value2, "channelFg");
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

        public Criteria andProductPropertyIsNull() {
            addCriterion("product_property is null");
            return (Criteria) this;
        }

        public Criteria andProductPropertyIsNotNull() {
            addCriterion("product_property is not null");
            return (Criteria) this;
        }

        public Criteria andProductPropertyEqualTo(String value) {
            addCriterion("product_property =", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyNotEqualTo(String value) {
            addCriterion("product_property <>", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyGreaterThan(String value) {
            addCriterion("product_property >", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("product_property >=", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyLessThan(String value) {
            addCriterion("product_property <", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyLessThanOrEqualTo(String value) {
            addCriterion("product_property <=", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyLike(String value) {
            addCriterion("product_property like", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyNotLike(String value) {
            addCriterion("product_property not like", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyIn(List<String> values) {
            addCriterion("product_property in", values, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyNotIn(List<String> values) {
            addCriterion("product_property not in", values, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyBetween(String value1, String value2) {
            addCriterion("product_property between", value1, value2, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyNotBetween(String value1, String value2) {
            addCriterion("product_property not between", value1, value2, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andSysNoIsNull() {
            addCriterion("sys_no is null");
            return (Criteria) this;
        }

        public Criteria andSysNoIsNotNull() {
            addCriterion("sys_no is not null");
            return (Criteria) this;
        }

        public Criteria andSysNoEqualTo(String value) {
            addCriterion("sys_no =", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotEqualTo(String value) {
            addCriterion("sys_no <>", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoGreaterThan(String value) {
            addCriterion("sys_no >", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoGreaterThanOrEqualTo(String value) {
            addCriterion("sys_no >=", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoLessThan(String value) {
            addCriterion("sys_no <", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoLessThanOrEqualTo(String value) {
            addCriterion("sys_no <=", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoLike(String value) {
            addCriterion("sys_no like", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotLike(String value) {
            addCriterion("sys_no not like", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoIn(List<String> values) {
            addCriterion("sys_no in", values, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotIn(List<String> values) {
            addCriterion("sys_no not in", values, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoBetween(String value1, String value2) {
            addCriterion("sys_no between", value1, value2, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotBetween(String value1, String value2) {
            addCriterion("sys_no not between", value1, value2, "sysNo");
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