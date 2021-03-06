package com.produce.dao;

import com.produce.dao.sqlProvider.TCardCouponSqlProvider;
import com.produce.entity.TCardCoupon;
import com.produce.entity.TCardCouponCriteria;
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

public interface TCardCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_coupon
     *
     * @mbg.generated
     */
    @SelectProvider(type= TCardCouponSqlProvider.class, method="countByExample")
    long countByExample(TCardCouponCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_coupon
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TCardCouponSqlProvider.class, method="deleteByExample")
    int deleteByExample(TCardCouponCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_coupon
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_card_coupon",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_coupon
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_card_coupon (id, card_coupon_name, ",
        "card_coupon_type, begin_time, ",
        "end_time, \"card_ issuer\", ",
        "car_plate, park_id, ",
        "car_owner_id)",
        "values (#{id,jdbcType=INTEGER}, #{cardCouponName,jdbcType=VARCHAR}, ",
        "#{cardCouponType,jdbcType=INTEGER}, #{beginTime,jdbcType=VARCHAR}, ",
        "#{endTime,jdbcType=VARCHAR}, #{cardIssuer,jdbcType=VARCHAR}, ",
        "#{carPlate,jdbcType=VARCHAR}, #{parkId,jdbcType=INTEGER}, ",
        "#{carOwnerId,jdbcType=INTEGER})"
    })
    int insert(TCardCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_coupon
     *
     * @mbg.generated
     */
    @InsertProvider(type=TCardCouponSqlProvider.class, method="insertSelective")
    int insertSelective(TCardCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_coupon
     *
     * @mbg.generated
     */
    @SelectProvider(type=TCardCouponSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="card_coupon_name", property="cardCouponName", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_coupon_type", property="cardCouponType", jdbcType=JdbcType.INTEGER),
        @Result(column="begin_time", property="beginTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_ issuer", property="cardIssuer", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_plate", property="carPlate", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="car_owner_id", property="carOwnerId", jdbcType=JdbcType.INTEGER)
    })
    List<TCardCoupon> selectByExample(TCardCouponCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_coupon
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, card_coupon_name, card_coupon_type, begin_time, end_time, \"card_ issuer\", ",
        "car_plate, park_id, car_owner_id",
        "from t_card_coupon",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="card_coupon_name", property="cardCouponName", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_coupon_type", property="cardCouponType", jdbcType=JdbcType.INTEGER),
        @Result(column="begin_time", property="beginTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_ issuer", property="cardIssuer", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_plate", property="carPlate", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="car_owner_id", property="carOwnerId", jdbcType=JdbcType.INTEGER)
    })
    TCardCoupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_coupon
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCardCouponSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TCardCoupon record, @Param("example") TCardCouponCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_coupon
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCardCouponSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TCardCoupon record, @Param("example") TCardCouponCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_coupon
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCardCouponSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TCardCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_coupon
     *
     * @mbg.generated
     */
    @Update({
        "update t_card_coupon",
        "set card_coupon_name = #{cardCouponName,jdbcType=VARCHAR},",
          "card_coupon_type = #{cardCouponType,jdbcType=INTEGER},",
          "begin_time = #{beginTime,jdbcType=VARCHAR},",
          "end_time = #{endTime,jdbcType=VARCHAR},",
          "\"card_ issuer\" = #{cardIssuer,jdbcType=VARCHAR},",
          "car_plate = #{carPlate,jdbcType=VARCHAR},",
          "park_id = #{parkId,jdbcType=INTEGER},",
          "car_owner_id = #{carOwnerId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TCardCoupon record);
}