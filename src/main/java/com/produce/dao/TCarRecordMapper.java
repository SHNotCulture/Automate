package com.produce.dao;

import com.produce.dao.sqlProvider.TCarRecordSqlProvider;
import com.produce.entity.TCarRecord;
import com.produce.entity.TCarRecordCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TCarRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    @SelectProvider(type= TCarRecordSqlProvider.class, method="countByExample")
    long countByExample(TCarRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TCarRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(TCarRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_car_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_car_record (id, car_query, ",
        "car_id, car_plate, ",
        "park_id, order_id, ",
        "need_pay, actual_pay, ",
        "before_pay, coupon_pay, ",
        "in_time, out_time, ",
        "in_time_query, out_time_query)",
        "values (#{id,jdbcType=INTEGER}, #{carQuery,jdbcType=INTEGER}, ",
        "#{carId,jdbcType=INTEGER}, #{carPlate,jdbcType=VARCHAR}, ",
        "#{parkId,jdbcType=INTEGER}, #{orderId,jdbcType=VARCHAR}, ",
        "#{needPay,jdbcType=INTEGER}, #{actualPay,jdbcType=INTEGER}, ",
        "#{beforePay,jdbcType=INTEGER}, #{couponPay,jdbcType=INTEGER}, ",
        "#{inTime,jdbcType=VARCHAR}, #{outTime,jdbcType=VARCHAR}, ",
        "#{inTimeQuery,jdbcType=INTEGER}, #{outTimeQuery,jdbcType=INTEGER})"
    })
    int insert(TCarRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    @InsertProvider(type=TCarRecordSqlProvider.class, method="insertSelective")
    int insertSelective(TCarRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    @SelectProvider(type=TCarRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="car_query", property="carQuery", jdbcType=JdbcType.INTEGER),
        @Result(column="car_id", property="carId", jdbcType=JdbcType.INTEGER),
        @Result(column="car_plate", property="carPlate", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="need_pay", property="needPay", jdbcType=JdbcType.INTEGER),
        @Result(column="actual_pay", property="actualPay", jdbcType=JdbcType.INTEGER),
        @Result(column="before_pay", property="beforePay", jdbcType=JdbcType.INTEGER),
        @Result(column="coupon_pay", property="couponPay", jdbcType=JdbcType.INTEGER),
        @Result(column="in_time", property="inTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="out_time", property="outTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="in_time_query", property="inTimeQuery", jdbcType=JdbcType.INTEGER),
        @Result(column="out_time_query", property="outTimeQuery", jdbcType=JdbcType.INTEGER)
    })
    List<TCarRecord> selectByExample(TCarRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, car_query, car_id, car_plate, park_id, order_id, need_pay, actual_pay, before_pay, ",
        "coupon_pay, in_time, out_time, in_time_query, out_time_query",
        "from t_car_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="car_query", property="carQuery", jdbcType=JdbcType.INTEGER),
        @Result(column="car_id", property="carId", jdbcType=JdbcType.INTEGER),
        @Result(column="car_plate", property="carPlate", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="need_pay", property="needPay", jdbcType=JdbcType.INTEGER),
        @Result(column="actual_pay", property="actualPay", jdbcType=JdbcType.INTEGER),
        @Result(column="before_pay", property="beforePay", jdbcType=JdbcType.INTEGER),
        @Result(column="coupon_pay", property="couponPay", jdbcType=JdbcType.INTEGER),
        @Result(column="in_time", property="inTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="out_time", property="outTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="in_time_query", property="inTimeQuery", jdbcType=JdbcType.INTEGER),
        @Result(column="out_time_query", property="outTimeQuery", jdbcType=JdbcType.INTEGER)
    })
    TCarRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCarRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TCarRecord record, @Param("example") TCarRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCarRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TCarRecord record, @Param("example") TCarRecordCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCarRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TCarRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_record
     *
     * @mbg.generated
     */
    @Update({
        "update t_car_record",
        "set car_query = #{carQuery,jdbcType=INTEGER},",
          "car_id = #{carId,jdbcType=INTEGER},",
          "car_plate = #{carPlate,jdbcType=VARCHAR},",
          "park_id = #{parkId,jdbcType=INTEGER},",
          "order_id = #{orderId,jdbcType=VARCHAR},",
          "need_pay = #{needPay,jdbcType=INTEGER},",
          "actual_pay = #{actualPay,jdbcType=INTEGER},",
          "before_pay = #{beforePay,jdbcType=INTEGER},",
          "coupon_pay = #{couponPay,jdbcType=INTEGER},",
          "in_time = #{inTime,jdbcType=VARCHAR},",
          "out_time = #{outTime,jdbcType=VARCHAR},",
          "in_time_query = #{inTimeQuery,jdbcType=INTEGER},",
          "out_time_query = #{outTimeQuery,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TCarRecord record);
}