package com.produce.dao;

import com.produce.dao.sqlProvider.TJournalProcessSqlProvider;
import com.produce.entity.TJournalProcess;
import com.produce.entity.TJournalProcessCriteria;
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

public interface TJournalProcessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_journal_process
     *
     * @mbg.generated
     */
    @SelectProvider(type= TJournalProcessSqlProvider.class, method="countByExample")
    long countByExample(TJournalProcessCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_journal_process
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TJournalProcessSqlProvider.class, method="deleteByExample")
    int deleteByExample(TJournalProcessCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_journal_process
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_journal_process",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_journal_process
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_journal_process (id, process_id, ",
        "process_name, process_time, ",
        "park_id, order_id, ",
        "car_plate, project_name, ",
        "request_msg, response_msg, ",
        "create_time)",
        "values (#{id,jdbcType=INTEGER}, #{processId,jdbcType=VARCHAR}, ",
        "#{processName,jdbcType=VARCHAR}, #{processTime,jdbcType=INTEGER}, ",
        "#{parkId,jdbcType=INTEGER}, #{orderId,jdbcType=VARCHAR}, ",
        "#{carPlate,jdbcType=VARCHAR}, #{projectName,jdbcType=VARCHAR}, ",
        "#{requestMsg,jdbcType=VARCHAR}, #{responseMsg,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=VARCHAR})"
    })
    int insert(TJournalProcess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_journal_process
     *
     * @mbg.generated
     */
    @InsertProvider(type=TJournalProcessSqlProvider.class, method="insertSelective")
    int insertSelective(TJournalProcess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_journal_process
     *
     * @mbg.generated
     */
    @SelectProvider(type=TJournalProcessSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="process_id", property="processId", jdbcType=JdbcType.VARCHAR),
        @Result(column="process_name", property="processName", jdbcType=JdbcType.VARCHAR),
        @Result(column="process_time", property="processTime", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_plate", property="carPlate", jdbcType=JdbcType.VARCHAR),
        @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="request_msg", property="requestMsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="response_msg", property="responseMsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR)
    })
    List<TJournalProcess> selectByExample(TJournalProcessCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_journal_process
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, process_id, process_name, process_time, park_id, order_id, car_plate, project_name, ",
        "request_msg, response_msg, create_time",
        "from t_journal_process",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="process_id", property="processId", jdbcType=JdbcType.VARCHAR),
        @Result(column="process_name", property="processName", jdbcType=JdbcType.VARCHAR),
        @Result(column="process_time", property="processTime", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_plate", property="carPlate", jdbcType=JdbcType.VARCHAR),
        @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="request_msg", property="requestMsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="response_msg", property="responseMsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR)
    })
    TJournalProcess selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_journal_process
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TJournalProcessSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TJournalProcess record, @Param("example") TJournalProcessCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_journal_process
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TJournalProcessSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TJournalProcess record, @Param("example") TJournalProcessCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_journal_process
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TJournalProcessSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TJournalProcess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_journal_process
     *
     * @mbg.generated
     */
    @Update({
        "update t_journal_process",
        "set process_id = #{processId,jdbcType=VARCHAR},",
          "process_name = #{processName,jdbcType=VARCHAR},",
          "process_time = #{processTime,jdbcType=INTEGER},",
          "park_id = #{parkId,jdbcType=INTEGER},",
          "order_id = #{orderId,jdbcType=VARCHAR},",
          "car_plate = #{carPlate,jdbcType=VARCHAR},",
          "project_name = #{projectName,jdbcType=VARCHAR},",
          "request_msg = #{requestMsg,jdbcType=VARCHAR},",
          "response_msg = #{responseMsg,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TJournalProcess record);
}