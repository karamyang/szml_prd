package com.yyx.prd.model.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrdProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrdProductExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductPictrueIsNull() {
            addCriterion("product_pictrue is null");
            return (Criteria) this;
        }

        public Criteria andProductPictrueIsNotNull() {
            addCriterion("product_pictrue is not null");
            return (Criteria) this;
        }

        public Criteria andProductPictrueEqualTo(String value) {
            addCriterion("product_pictrue =", value, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andProductPictrueNotEqualTo(String value) {
            addCriterion("product_pictrue <>", value, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andProductPictrueGreaterThan(String value) {
            addCriterion("product_pictrue >", value, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andProductPictrueGreaterThanOrEqualTo(String value) {
            addCriterion("product_pictrue >=", value, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andProductPictrueLessThan(String value) {
            addCriterion("product_pictrue <", value, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andProductPictrueLessThanOrEqualTo(String value) {
            addCriterion("product_pictrue <=", value, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andProductPictrueLike(String value) {
            addCriterion("product_pictrue like", value, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andProductPictrueNotLike(String value) {
            addCriterion("product_pictrue not like", value, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andProductPictrueIn(List<String> values) {
            addCriterion("product_pictrue in", values, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andProductPictrueNotIn(List<String> values) {
            addCriterion("product_pictrue not in", values, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andProductPictrueBetween(String value1, String value2) {
            addCriterion("product_pictrue between", value1, value2, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andProductPictrueNotBetween(String value1, String value2) {
            addCriterion("product_pictrue not between", value1, value2, "productPictrue");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Long value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Long value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Long value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Long value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Long> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Long> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Long value1, Long value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andPrividerNameIsNull() {
            addCriterion("privider_name is null");
            return (Criteria) this;
        }

        public Criteria andPrividerNameIsNotNull() {
            addCriterion("privider_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrividerNameEqualTo(String value) {
            addCriterion("privider_name =", value, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerNameNotEqualTo(String value) {
            addCriterion("privider_name <>", value, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerNameGreaterThan(String value) {
            addCriterion("privider_name >", value, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerNameGreaterThanOrEqualTo(String value) {
            addCriterion("privider_name >=", value, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerNameLessThan(String value) {
            addCriterion("privider_name <", value, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerNameLessThanOrEqualTo(String value) {
            addCriterion("privider_name <=", value, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerNameLike(String value) {
            addCriterion("privider_name like", value, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerNameNotLike(String value) {
            addCriterion("privider_name not like", value, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerNameIn(List<String> values) {
            addCriterion("privider_name in", values, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerNameNotIn(List<String> values) {
            addCriterion("privider_name not in", values, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerNameBetween(String value1, String value2) {
            addCriterion("privider_name between", value1, value2, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerNameNotBetween(String value1, String value2) {
            addCriterion("privider_name not between", value1, value2, "prividerName");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneIsNull() {
            addCriterion("privider_phone is null");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneIsNotNull() {
            addCriterion("privider_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneEqualTo(String value) {
            addCriterion("privider_phone =", value, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneNotEqualTo(String value) {
            addCriterion("privider_phone <>", value, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneGreaterThan(String value) {
            addCriterion("privider_phone >", value, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("privider_phone >=", value, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneLessThan(String value) {
            addCriterion("privider_phone <", value, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneLessThanOrEqualTo(String value) {
            addCriterion("privider_phone <=", value, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneLike(String value) {
            addCriterion("privider_phone like", value, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneNotLike(String value) {
            addCriterion("privider_phone not like", value, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneIn(List<String> values) {
            addCriterion("privider_phone in", values, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneNotIn(List<String> values) {
            addCriterion("privider_phone not in", values, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneBetween(String value1, String value2) {
            addCriterion("privider_phone between", value1, value2, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andPrividerPhoneNotBetween(String value1, String value2) {
            addCriterion("privider_phone not between", value1, value2, "prividerPhone");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNull() {
            addCriterion("price_type is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNotNull() {
            addCriterion("price_type is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeEqualTo(String value) {
            addCriterion("price_type =", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotEqualTo(String value) {
            addCriterion("price_type <>", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThan(String value) {
            addCriterion("price_type >", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("price_type >=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThan(String value) {
            addCriterion("price_type <", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThanOrEqualTo(String value) {
            addCriterion("price_type <=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLike(String value) {
            addCriterion("price_type like", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotLike(String value) {
            addCriterion("price_type not like", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIn(List<String> values) {
            addCriterion("price_type in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotIn(List<String> values) {
            addCriterion("price_type not in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeBetween(String value1, String value2) {
            addCriterion("price_type between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotBetween(String value1, String value2) {
            addCriterion("price_type not between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPricePointIsNull() {
            addCriterion("price_point is null");
            return (Criteria) this;
        }

        public Criteria andPricePointIsNotNull() {
            addCriterion("price_point is not null");
            return (Criteria) this;
        }

        public Criteria andPricePointEqualTo(String value) {
            addCriterion("price_point =", value, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPricePointNotEqualTo(String value) {
            addCriterion("price_point <>", value, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPricePointGreaterThan(String value) {
            addCriterion("price_point >", value, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPricePointGreaterThanOrEqualTo(String value) {
            addCriterion("price_point >=", value, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPricePointLessThan(String value) {
            addCriterion("price_point <", value, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPricePointLessThanOrEqualTo(String value) {
            addCriterion("price_point <=", value, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPricePointLike(String value) {
            addCriterion("price_point like", value, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPricePointNotLike(String value) {
            addCriterion("price_point not like", value, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPricePointIn(List<String> values) {
            addCriterion("price_point in", values, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPricePointNotIn(List<String> values) {
            addCriterion("price_point not in", values, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPricePointBetween(String value1, String value2) {
            addCriterion("price_point between", value1, value2, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPricePointNotBetween(String value1, String value2) {
            addCriterion("price_point not between", value1, value2, "pricePoint");
            return (Criteria) this;
        }

        public Criteria andPriceCashIsNull() {
            addCriterion("price_cash is null");
            return (Criteria) this;
        }

        public Criteria andPriceCashIsNotNull() {
            addCriterion("price_cash is not null");
            return (Criteria) this;
        }

        public Criteria andPriceCashEqualTo(String value) {
            addCriterion("price_cash =", value, "priceCash");
            return (Criteria) this;
        }

        public Criteria andPriceCashNotEqualTo(String value) {
            addCriterion("price_cash <>", value, "priceCash");
            return (Criteria) this;
        }

        public Criteria andPriceCashGreaterThan(String value) {
            addCriterion("price_cash >", value, "priceCash");
            return (Criteria) this;
        }

        public Criteria andPriceCashGreaterThanOrEqualTo(String value) {
            addCriterion("price_cash >=", value, "priceCash");
            return (Criteria) this;
        }

        public Criteria andPriceCashLessThan(String value) {
            addCriterion("price_cash <", value, "priceCash");
            return (Criteria) this;
        }

        public Criteria andPriceCashLessThanOrEqualTo(String value) {
            addCriterion("price_cash <=", value, "priceCash");
            return (Criteria) this;
        }

        public Criteria andPriceCashLike(String value) {
            addCriterion("price_cash like", value, "priceCash");
            return (Criteria) this;
        }

        public Criteria andPriceCashNotLike(String value) {
            addCriterion("price_cash not like", value, "priceCash");
            return (Criteria) this;
        }

        public Criteria andPriceCashIn(List<String> values) {
            addCriterion("price_cash in", values, "priceCash");
            return (Criteria) this;
        }

        public Criteria andPriceCashNotIn(List<String> values) {
            addCriterion("price_cash not in", values, "priceCash");
            return (Criteria) this;
        }

        public Criteria andPriceCashBetween(String value1, String value2) {
            addCriterion("price_cash between", value1, value2, "priceCash");
            return (Criteria) this;
        }

        public Criteria andPriceCashNotBetween(String value1, String value2) {
            addCriterion("price_cash not between", value1, value2, "priceCash");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitIsNull() {
            addCriterion("exchange_limit is null");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitIsNotNull() {
            addCriterion("exchange_limit is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitEqualTo(String value) {
            addCriterion("exchange_limit =", value, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitNotEqualTo(String value) {
            addCriterion("exchange_limit <>", value, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitGreaterThan(String value) {
            addCriterion("exchange_limit >", value, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_limit >=", value, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitLessThan(String value) {
            addCriterion("exchange_limit <", value, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitLessThanOrEqualTo(String value) {
            addCriterion("exchange_limit <=", value, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitLike(String value) {
            addCriterion("exchange_limit like", value, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitNotLike(String value) {
            addCriterion("exchange_limit not like", value, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitIn(List<String> values) {
            addCriterion("exchange_limit in", values, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitNotIn(List<String> values) {
            addCriterion("exchange_limit not in", values, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitBetween(String value1, String value2) {
            addCriterion("exchange_limit between", value1, value2, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andExchangeLimitNotBetween(String value1, String value2) {
            addCriterion("exchange_limit not between", value1, value2, "exchangeLimit");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNull() {
            addCriterion("product_stock is null");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNotNull() {
            addCriterion("product_stock is not null");
            return (Criteria) this;
        }

        public Criteria andProductStockEqualTo(Long value) {
            addCriterion("product_stock =", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotEqualTo(Long value) {
            addCriterion("product_stock <>", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThan(Long value) {
            addCriterion("product_stock >", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThanOrEqualTo(Long value) {
            addCriterion("product_stock >=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThan(Long value) {
            addCriterion("product_stock <", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThanOrEqualTo(Long value) {
            addCriterion("product_stock <=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockIn(List<Long> values) {
            addCriterion("product_stock in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotIn(List<Long> values) {
            addCriterion("product_stock not in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockBetween(Long value1, Long value2) {
            addCriterion("product_stock between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotBetween(Long value1, Long value2) {
            addCriterion("product_stock not between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStateIsNull() {
            addCriterion("product_state is null");
            return (Criteria) this;
        }

        public Criteria andProductStateIsNotNull() {
            addCriterion("product_state is not null");
            return (Criteria) this;
        }

        public Criteria andProductStateEqualTo(String value) {
            addCriterion("product_state =", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotEqualTo(String value) {
            addCriterion("product_state <>", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateGreaterThan(String value) {
            addCriterion("product_state >", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateGreaterThanOrEqualTo(String value) {
            addCriterion("product_state >=", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLessThan(String value) {
            addCriterion("product_state <", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLessThanOrEqualTo(String value) {
            addCriterion("product_state <=", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLike(String value) {
            addCriterion("product_state like", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotLike(String value) {
            addCriterion("product_state not like", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateIn(List<String> values) {
            addCriterion("product_state in", values, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotIn(List<String> values) {
            addCriterion("product_state not in", values, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateBetween(String value1, String value2) {
            addCriterion("product_state between", value1, value2, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotBetween(String value1, String value2) {
            addCriterion("product_state not between", value1, value2, "productState");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNull() {
            addCriterion("online_time is null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNotNull() {
            addCriterion("online_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeEqualTo(Date value) {
            addCriterion("online_time =", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotEqualTo(Date value) {
            addCriterion("online_time <>", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThan(Date value) {
            addCriterion("online_time >", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("online_time >=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThan(Date value) {
            addCriterion("online_time <", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThanOrEqualTo(Date value) {
            addCriterion("online_time <=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIn(List<Date> values) {
            addCriterion("online_time in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotIn(List<Date> values) {
            addCriterion("online_time not in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeBetween(Date value1, Date value2) {
            addCriterion("online_time between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotBetween(Date value1, Date value2) {
            addCriterion("online_time not between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeIsNull() {
            addCriterion("down_time is null");
            return (Criteria) this;
        }

        public Criteria andDownTimeIsNotNull() {
            addCriterion("down_time is not null");
            return (Criteria) this;
        }

        public Criteria andDownTimeEqualTo(Date value) {
            addCriterion("down_time =", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeNotEqualTo(Date value) {
            addCriterion("down_time <>", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeGreaterThan(Date value) {
            addCriterion("down_time >", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("down_time >=", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeLessThan(Date value) {
            addCriterion("down_time <", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeLessThanOrEqualTo(Date value) {
            addCriterion("down_time <=", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeIn(List<Date> values) {
            addCriterion("down_time in", values, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeNotIn(List<Date> values) {
            addCriterion("down_time not in", values, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeBetween(Date value1, Date value2) {
            addCriterion("down_time between", value1, value2, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeNotBetween(Date value1, Date value2) {
            addCriterion("down_time not between", value1, value2, "downTime");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Long value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Long value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Long value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Long value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Long> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Long> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Long value1, Long value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdIsNull() {
            addCriterion("proxy_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdIsNotNull() {
            addCriterion("proxy_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdEqualTo(Integer value) {
            addCriterion("proxy_admin_id =", value, "proxyAdminId");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdNotEqualTo(Integer value) {
            addCriterion("proxy_admin_id <>", value, "proxyAdminId");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdGreaterThan(Integer value) {
            addCriterion("proxy_admin_id >", value, "proxyAdminId");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proxy_admin_id >=", value, "proxyAdminId");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdLessThan(Integer value) {
            addCriterion("proxy_admin_id <", value, "proxyAdminId");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("proxy_admin_id <=", value, "proxyAdminId");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdIn(List<Integer> values) {
            addCriterion("proxy_admin_id in", values, "proxyAdminId");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdNotIn(List<Integer> values) {
            addCriterion("proxy_admin_id not in", values, "proxyAdminId");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("proxy_admin_id between", value1, value2, "proxyAdminId");
            return (Criteria) this;
        }

        public Criteria andProxyAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proxy_admin_id not between", value1, value2, "proxyAdminId");
            return (Criteria) this;
        }
    }

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