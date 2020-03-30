package com.produce.dao;

import com.produce.dao.sqlProvider.TCardSequenceSqlProvider;
import com.produce.entity.TCardSequence;
import com.produce.entity.TCardSequenceCriteria;
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

public interface TCardSequenceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_sequence
     *
     * @mbg.generated
     */
    @SelectProvider(type= TCardSequenceSqlProvider.class, method="countByExample")
    long countByExample(TCardSequenceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_sequence
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TCardSequenceSqlProvider.class, method="deleteByExample")
    int deleteByExample(TCardSequenceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_sequence
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_card_sequence",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_sequence
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_card_sequence (id, car_owner_id, ",
        "card_id, sequence)",
        "values (#{id,jdbcType=INTEGER}, #{carOwnerId,jdbcType=INTEGER}, ",
        "#{cardId,jdbcType=INTEGER}, #{sequence,jdbcType=INTEGER})"
    })
    int insert(TCardSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_sequence
     *
     * @mbg.generated
     */
    @InsertProvider(type=TCardSequenceSqlProvider.class, method="insertSelective")
    int insertSelective(TCardSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_sequence
     *
     * @mbg.generated
     */
    @SelectProvider(type=TCardSequenceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="car_owner_id", property="carOwnerId", jdbcType=JdbcType.INTEGER),
        @Result(column="card_id", property="cardId", jdbcType=JdbcType.INTEGER),
        @Result(column="sequence", property="sequence", jdbcType=JdbcType.INTEGER)
    })
    List<TCardSequence> selectByExample(TCardSequenceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_sequence
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, car_owner_id, card_id, sequence",
        "from t_card_sequence",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="car_owner_id", property="carOwnerId", jdbcType=JdbcType.INTEGER),
        @Result(column="card_id", property="cardId", jdbcType=JdbcType.INTEGER),
        @Result(column="sequence", property="sequence", jdbcType=JdbcType.INTEGER)
    })
    TCardSequence selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_sequence
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCardSequenceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TCardSequence record, @Param("example") TCardSequenceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_sequence
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCardSequenceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TCardSequence record, @Param("example") TCardSequenceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_sequence
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TCardSequenceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TCardSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_card_sequence
     *
     * @mbg.generated
     */
    @Update({
        "update t_card_sequence",
        "set car_owner_id = #{carOwnerId,jdbcType=INTEGER},",
          "card_id = #{cardId,jdbcType=INTEGER},",
          "sequence = #{sequence,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TCardSequence record);
}