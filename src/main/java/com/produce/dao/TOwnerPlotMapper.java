package com.produce.dao;

import com.produce.dao.sqlProvider.TOwnerPlotSqlProvider;
import com.produce.entity.TOwnerPlot;
import com.produce.entity.TOwnerPlotCriteria;
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

public interface TOwnerPlotMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_owner_plot
     *
     * @mbg.generated
     */
    @SelectProvider(type= TOwnerPlotSqlProvider.class, method="countByExample")
    long countByExample(TOwnerPlotCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_owner_plot
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TOwnerPlotSqlProvider.class, method="deleteByExample")
    int deleteByExample(TOwnerPlotCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_owner_plot
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_owner_plot",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_owner_plot
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_owner_plot (id, car_owner_id, ",
        "company_id, village_name, ",
        "address, is_review, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{carOwnerId,jdbcType=INTEGER}, ",
        "#{companyId,jdbcType=INTEGER}, #{villageName,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{isReview,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=VARCHAR})"
    })
    int insert(TOwnerPlot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_owner_plot
     *
     * @mbg.generated
     */
    @InsertProvider(type=TOwnerPlotSqlProvider.class, method="insertSelective")
    int insertSelective(TOwnerPlot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_owner_plot
     *
     * @mbg.generated
     */
    @SelectProvider(type=TOwnerPlotSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="car_owner_id", property="carOwnerId", jdbcType=JdbcType.INTEGER),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="village_name", property="villageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_review", property="isReview", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR)
    })
    List<TOwnerPlot> selectByExample(TOwnerPlotCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_owner_plot
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, car_owner_id, company_id, village_name, address, is_review, update_time",
        "from t_owner_plot",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="car_owner_id", property="carOwnerId", jdbcType=JdbcType.INTEGER),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="village_name", property="villageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_review", property="isReview", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR)
    })
    TOwnerPlot selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_owner_plot
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TOwnerPlotSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TOwnerPlot record, @Param("example") TOwnerPlotCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_owner_plot
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TOwnerPlotSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TOwnerPlot record, @Param("example") TOwnerPlotCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_owner_plot
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TOwnerPlotSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TOwnerPlot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_owner_plot
     *
     * @mbg.generated
     */
    @Update({
        "update t_owner_plot",
        "set car_owner_id = #{carOwnerId,jdbcType=INTEGER},",
          "company_id = #{companyId,jdbcType=INTEGER},",
          "village_name = #{villageName,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "is_review = #{isReview,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TOwnerPlot record);
}