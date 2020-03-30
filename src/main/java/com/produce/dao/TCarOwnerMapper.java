package com.produce.dao;

import com.produce.dao.sqlProvider.TCarOwnerSqlProvider;
import com.produce.entity.TCarOwner;
import com.produce.entity.TCarOwnerCriteria;
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

public interface TCarOwnerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_owner
     *
     * @mbg.generated
     */
    @SelectProvider(type= TCarOwnerSqlProvider.class, method="countByExample")
    long countByExample(TCarOwnerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_owner
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TCarOwnerSqlProvider.class, method="deleteByExample")
    int deleteByExample(TCarOwnerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_owner
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_car_owner",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_owner
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_car_owner (id, name, ",
        "sex, phoneNumber, ",
        "city, notice_ids, ",
        "update_time, create_time)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=INTEGER}, #{phonenumber,jdbcType=VARCHAR}, ",
        "#{city,jdbcType=INTEGER}, #{noticeIds,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=VARCHAR}, #{createTime,jdbcType=VARCHAR})"
    })
    int insert(TCarOwner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_owner
     *
     * @mbg.generated
     */
    @InsertProvider(type=TCarOwnerSqlProvider.class, method="insertSelective")
    int insertSelective(TCarOwner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_owner
     *
     * @mbg.generated
     */
    @SelectProvider(type=TCarOwnerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="phoneNumber", property="phonenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.INTEGER),
        @Result(column="notice_ids", property="noticeIds", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR)
    })
    List<TCarOwner> selectByExample(TCarOwnerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_owner
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, name, sex, phoneNumber, city, notice_ids, update_time, create_time",
        "from t_car_owner",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="phoneNumber", property="phonenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.INTEGER),
        @Result(column="notice_ids", property="noticeIds", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR)
    })
    TCarOwner selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_owner
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCarOwnerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TCarOwner record, @Param("example") TCarOwnerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_owner
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCarOwnerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TCarOwner record, @Param("example") TCarOwnerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_owner
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCarOwnerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TCarOwner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_owner
     *
     * @mbg.generated
     */
    @Update({
        "update t_car_owner",
        "set name = #{name,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=INTEGER},",
          "phoneNumber = #{phonenumber,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=INTEGER},",
          "notice_ids = #{noticeIds,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TCarOwner record);
}