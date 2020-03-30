package com.produce.dao;

import com.produce.dao.sqlProvider.TCarStatusSqlProvider;
import com.produce.entity.TCarStatus;
import com.produce.entity.TCarStatusCriteria;
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

public interface TCarStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_status
     *
     * @mbg.generated
     */
    @SelectProvider(type= TCarStatusSqlProvider.class, method="countByExample")
    long countByExample(TCarStatusCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_status
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TCarStatusSqlProvider.class, method="deleteByExample")
    int deleteByExample(TCarStatusCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_status
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_car_status",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_status
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_car_status (id, car_owner_id, ",
        "car_id, car_plate, ",
        "car_query, park_id, ",
        "order_id, company_id, ",
        "in_time, out_time, ",
        "status, update_time, ",
        "create_time)",
        "values (#{id,jdbcType=INTEGER}, #{carOwnerId,jdbcType=INTEGER}, ",
        "#{carId,jdbcType=INTEGER}, #{carPlate,jdbcType=VARCHAR}, ",
        "#{carQuery,jdbcType=INTEGER}, #{parkId,jdbcType=INTEGER}, ",
        "#{orderId,jdbcType=VARCHAR}, #{companyId,jdbcType=INTEGER}, ",
        "#{inTime,jdbcType=INTEGER}, #{outTime,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{updateTime,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=VARCHAR})"
    })
    int insert(TCarStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_status
     *
     * @mbg.generated
     */
    @InsertProvider(type=TCarStatusSqlProvider.class, method="insertSelective")
    int insertSelective(TCarStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_status
     *
     * @mbg.generated
     */
    @SelectProvider(type=TCarStatusSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="car_owner_id", property="carOwnerId", jdbcType=JdbcType.INTEGER),
        @Result(column="car_id", property="carId", jdbcType=JdbcType.INTEGER),
        @Result(column="car_plate", property="carPlate", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_query", property="carQuery", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="in_time", property="inTime", jdbcType=JdbcType.INTEGER),
        @Result(column="out_time", property="outTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR)
    })
    List<TCarStatus> selectByExample(TCarStatusCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_status
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, car_owner_id, car_id, car_plate, car_query, park_id, order_id, company_id, ",
        "in_time, out_time, status, update_time, create_time",
        "from t_car_status",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="car_owner_id", property="carOwnerId", jdbcType=JdbcType.INTEGER),
        @Result(column="car_id", property="carId", jdbcType=JdbcType.INTEGER),
        @Result(column="car_plate", property="carPlate", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_query", property="carQuery", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="in_time", property="inTime", jdbcType=JdbcType.INTEGER),
        @Result(column="out_time", property="outTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR)
    })
    TCarStatus selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_status
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCarStatusSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TCarStatus record, @Param("example") TCarStatusCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_status
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCarStatusSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TCarStatus record, @Param("example") TCarStatusCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_status
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCarStatusSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TCarStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_status
     *
     * @mbg.generated
     */
    @Update({
        "update t_car_status",
        "set car_owner_id = #{carOwnerId,jdbcType=INTEGER},",
          "car_id = #{carId,jdbcType=INTEGER},",
          "car_plate = #{carPlate,jdbcType=VARCHAR},",
          "car_query = #{carQuery,jdbcType=INTEGER},",
          "park_id = #{parkId,jdbcType=INTEGER},",
          "order_id = #{orderId,jdbcType=VARCHAR},",
          "company_id = #{companyId,jdbcType=INTEGER},",
          "in_time = #{inTime,jdbcType=INTEGER},",
          "out_time = #{outTime,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TCarStatus record);
}