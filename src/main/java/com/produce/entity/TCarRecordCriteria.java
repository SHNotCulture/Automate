package com.produce.entity;

import java.util.ArrayList;
import java.util.List;

public class TCarRecordCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    public TCarRecordCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarQueryIsNull() {
            addCriterion("car_query is null");
            return (Criteria) this;
        }

        public Criteria andCarQueryIsNotNull() {
            addCriterion("car_query is not null");
            return (Criteria) this;
        }

        public Criteria andCarQueryEqualTo(Integer value) {
            addCriterion("car_query =", value, "carQuery");
            return (Criteria) this;
        }

        public Criteria andCarQueryNotEqualTo(Integer value) {
            addCriterion("car_query <>", value, "carQuery");
            return (Criteria) this;
        }

        public Criteria andCarQueryGreaterThan(Integer value) {
            addCriterion("car_query >", value, "carQuery");
            return (Criteria) this;
        }

        public Criteria andCarQueryGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_query >=", value, "carQuery");
            return (Criteria) this;
        }

        public Criteria andCarQueryLessThan(Integer value) {
            addCriterion("car_query <", value, "carQuery");
            return (Criteria) this;
        }

        public Criteria andCarQueryLessThanOrEqualTo(Integer value) {
            addCriterion("car_query <=", value, "carQuery");
            return (Criteria) this;
        }

        public Criteria andCarQueryIn(List<Integer> values) {
            addCriterion("car_query in", values, "carQuery");
            return (Criteria) this;
        }

        public Criteria andCarQueryNotIn(List<Integer> values) {
            addCriterion("car_query not in", values, "carQuery");
            return (Criteria) this;
        }

        public Criteria andCarQueryBetween(Integer value1, Integer value2) {
            addCriterion("car_query between", value1, value2, "carQuery");
            return (Criteria) this;
        }

        public Criteria andCarQueryNotBetween(Integer value1, Integer value2) {
            addCriterion("car_query not between", value1, value2, "carQuery");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarPlateIsNull() {
            addCriterion("car_plate is null");
            return (Criteria) this;
        }

        public Criteria andCarPlateIsNotNull() {
            addCriterion("car_plate is not null");
            return (Criteria) this;
        }

        public Criteria andCarPlateEqualTo(String value) {
            addCriterion("car_plate =", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateNotEqualTo(String value) {
            addCriterion("car_plate <>", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateGreaterThan(String value) {
            addCriterion("car_plate >", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateGreaterThanOrEqualTo(String value) {
            addCriterion("car_plate >=", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateLessThan(String value) {
            addCriterion("car_plate <", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateLessThanOrEqualTo(String value) {
            addCriterion("car_plate <=", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateLike(String value) {
            addCriterion("car_plate like", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateNotLike(String value) {
            addCriterion("car_plate not like", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateIn(List<String> values) {
            addCriterion("car_plate in", values, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateNotIn(List<String> values) {
            addCriterion("car_plate not in", values, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateBetween(String value1, String value2) {
            addCriterion("car_plate between", value1, value2, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateNotBetween(String value1, String value2) {
            addCriterion("car_plate not between", value1, value2, "carPlate");
            return (Criteria) this;
        }

        public Criteria andParkIdIsNull() {
            addCriterion("park_id is null");
            return (Criteria) this;
        }

        public Criteria andParkIdIsNotNull() {
            addCriterion("park_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkIdEqualTo(Integer value) {
            addCriterion("park_id =", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotEqualTo(Integer value) {
            addCriterion("park_id <>", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdGreaterThan(Integer value) {
            addCriterion("park_id >", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_id >=", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdLessThan(Integer value) {
            addCriterion("park_id <", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdLessThanOrEqualTo(Integer value) {
            addCriterion("park_id <=", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdIn(List<Integer> values) {
            addCriterion("park_id in", values, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotIn(List<Integer> values) {
            addCriterion("park_id not in", values, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdBetween(Integer value1, Integer value2) {
            addCriterion("park_id between", value1, value2, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("park_id not between", value1, value2, "parkId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andNeedPayIsNull() {
            addCriterion("need_pay is null");
            return (Criteria) this;
        }

        public Criteria andNeedPayIsNotNull() {
            addCriterion("need_pay is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPayEqualTo(Integer value) {
            addCriterion("need_pay =", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayNotEqualTo(Integer value) {
            addCriterion("need_pay <>", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayGreaterThan(Integer value) {
            addCriterion("need_pay >", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_pay >=", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayLessThan(Integer value) {
            addCriterion("need_pay <", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayLessThanOrEqualTo(Integer value) {
            addCriterion("need_pay <=", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayIn(List<Integer> values) {
            addCriterion("need_pay in", values, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayNotIn(List<Integer> values) {
            addCriterion("need_pay not in", values, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayBetween(Integer value1, Integer value2) {
            addCriterion("need_pay between", value1, value2, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayNotBetween(Integer value1, Integer value2) {
            addCriterion("need_pay not between", value1, value2, "needPay");
            return (Criteria) this;
        }

        public Criteria andActualPayIsNull() {
            addCriterion("actual_pay is null");
            return (Criteria) this;
        }

        public Criteria andActualPayIsNotNull() {
            addCriterion("actual_pay is not null");
            return (Criteria) this;
        }

        public Criteria andActualPayEqualTo(Integer value) {
            addCriterion("actual_pay =", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotEqualTo(Integer value) {
            addCriterion("actual_pay <>", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayGreaterThan(Integer value) {
            addCriterion("actual_pay >", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_pay >=", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayLessThan(Integer value) {
            addCriterion("actual_pay <", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayLessThanOrEqualTo(Integer value) {
            addCriterion("actual_pay <=", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayIn(List<Integer> values) {
            addCriterion("actual_pay in", values, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotIn(List<Integer> values) {
            addCriterion("actual_pay not in", values, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayBetween(Integer value1, Integer value2) {
            addCriterion("actual_pay between", value1, value2, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_pay not between", value1, value2, "actualPay");
            return (Criteria) this;
        }

        public Criteria andBeforePayIsNull() {
            addCriterion("before_pay is null");
            return (Criteria) this;
        }

        public Criteria andBeforePayIsNotNull() {
            addCriterion("before_pay is not null");
            return (Criteria) this;
        }

        public Criteria andBeforePayEqualTo(Integer value) {
            addCriterion("before_pay =", value, "beforePay");
            return (Criteria) this;
        }

        public Criteria andBeforePayNotEqualTo(Integer value) {
            addCriterion("before_pay <>", value, "beforePay");
            return (Criteria) this;
        }

        public Criteria andBeforePayGreaterThan(Integer value) {
            addCriterion("before_pay >", value, "beforePay");
            return (Criteria) this;
        }

        public Criteria andBeforePayGreaterThanOrEqualTo(Integer value) {
            addCriterion("before_pay >=", value, "beforePay");
            return (Criteria) this;
        }

        public Criteria andBeforePayLessThan(Integer value) {
            addCriterion("before_pay <", value, "beforePay");
            return (Criteria) this;
        }

        public Criteria andBeforePayLessThanOrEqualTo(Integer value) {
            addCriterion("before_pay <=", value, "beforePay");
            return (Criteria) this;
        }

        public Criteria andBeforePayIn(List<Integer> values) {
            addCriterion("before_pay in", values, "beforePay");
            return (Criteria) this;
        }

        public Criteria andBeforePayNotIn(List<Integer> values) {
            addCriterion("before_pay not in", values, "beforePay");
            return (Criteria) this;
        }

        public Criteria andBeforePayBetween(Integer value1, Integer value2) {
            addCriterion("before_pay between", value1, value2, "beforePay");
            return (Criteria) this;
        }

        public Criteria andBeforePayNotBetween(Integer value1, Integer value2) {
            addCriterion("before_pay not between", value1, value2, "beforePay");
            return (Criteria) this;
        }

        public Criteria andCouponPayIsNull() {
            addCriterion("coupon_pay is null");
            return (Criteria) this;
        }

        public Criteria andCouponPayIsNotNull() {
            addCriterion("coupon_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPayEqualTo(Integer value) {
            addCriterion("coupon_pay =", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayNotEqualTo(Integer value) {
            addCriterion("coupon_pay <>", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayGreaterThan(Integer value) {
            addCriterion("coupon_pay >", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_pay >=", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayLessThan(Integer value) {
            addCriterion("coupon_pay <", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_pay <=", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayIn(List<Integer> values) {
            addCriterion("coupon_pay in", values, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayNotIn(List<Integer> values) {
            addCriterion("coupon_pay not in", values, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayBetween(Integer value1, Integer value2) {
            addCriterion("coupon_pay between", value1, value2, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_pay not between", value1, value2, "couponPay");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNull() {
            addCriterion("in_time is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("in_time is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(String value) {
            addCriterion("in_time =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(String value) {
            addCriterion("in_time <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(String value) {
            addCriterion("in_time >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(String value) {
            addCriterion("in_time >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(String value) {
            addCriterion("in_time <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(String value) {
            addCriterion("in_time <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLike(String value) {
            addCriterion("in_time like", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotLike(String value) {
            addCriterion("in_time not like", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<String> values) {
            addCriterion("in_time in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<String> values) {
            addCriterion("in_time not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(String value1, String value2) {
            addCriterion("in_time between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(String value1, String value2) {
            addCriterion("in_time not between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNull() {
            addCriterion("out_time is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNotNull() {
            addCriterion("out_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeEqualTo(String value) {
            addCriterion("out_time =", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotEqualTo(String value) {
            addCriterion("out_time <>", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThan(String value) {
            addCriterion("out_time >", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThanOrEqualTo(String value) {
            addCriterion("out_time >=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThan(String value) {
            addCriterion("out_time <", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThanOrEqualTo(String value) {
            addCriterion("out_time <=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLike(String value) {
            addCriterion("out_time like", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotLike(String value) {
            addCriterion("out_time not like", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIn(List<String> values) {
            addCriterion("out_time in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotIn(List<String> values) {
            addCriterion("out_time not in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeBetween(String value1, String value2) {
            addCriterion("out_time between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotBetween(String value1, String value2) {
            addCriterion("out_time not between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryIsNull() {
            addCriterion("in_time_query is null");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryIsNotNull() {
            addCriterion("in_time_query is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryEqualTo(Integer value) {
            addCriterion("in_time_query =", value, "inTimeQuery");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryNotEqualTo(Integer value) {
            addCriterion("in_time_query <>", value, "inTimeQuery");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryGreaterThan(Integer value) {
            addCriterion("in_time_query >", value, "inTimeQuery");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_time_query >=", value, "inTimeQuery");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryLessThan(Integer value) {
            addCriterion("in_time_query <", value, "inTimeQuery");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryLessThanOrEqualTo(Integer value) {
            addCriterion("in_time_query <=", value, "inTimeQuery");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryIn(List<Integer> values) {
            addCriterion("in_time_query in", values, "inTimeQuery");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryNotIn(List<Integer> values) {
            addCriterion("in_time_query not in", values, "inTimeQuery");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryBetween(Integer value1, Integer value2) {
            addCriterion("in_time_query between", value1, value2, "inTimeQuery");
            return (Criteria) this;
        }

        public Criteria andInTimeQueryNotBetween(Integer value1, Integer value2) {
            addCriterion("in_time_query not between", value1, value2, "inTimeQuery");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryIsNull() {
            addCriterion("out_time_query is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryIsNotNull() {
            addCriterion("out_time_query is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryEqualTo(Integer value) {
            addCriterion("out_time_query =", value, "outTimeQuery");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryNotEqualTo(Integer value) {
            addCriterion("out_time_query <>", value, "outTimeQuery");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryGreaterThan(Integer value) {
            addCriterion("out_time_query >", value, "outTimeQuery");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_time_query >=", value, "outTimeQuery");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryLessThan(Integer value) {
            addCriterion("out_time_query <", value, "outTimeQuery");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryLessThanOrEqualTo(Integer value) {
            addCriterion("out_time_query <=", value, "outTimeQuery");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryIn(List<Integer> values) {
            addCriterion("out_time_query in", values, "outTimeQuery");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryNotIn(List<Integer> values) {
            addCriterion("out_time_query not in", values, "outTimeQuery");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryBetween(Integer value1, Integer value2) {
            addCriterion("out_time_query between", value1, value2, "outTimeQuery");
            return (Criteria) this;
        }

        public Criteria andOutTimeQueryNotBetween(Integer value1, Integer value2) {
            addCriterion("out_time_query not between", value1, value2, "outTimeQuery");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_car_record
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
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