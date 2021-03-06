package com.produce.entity;

public class TJournalEvent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_journal_event.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_journal_event.operating_id
     *
     * @mbg.generated
     */
    private Integer operatingId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_journal_event.operating_name
     *
     * @mbg.generated
     */
    private Integer operatingName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_journal_event.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_journal_event.operating_content
     *
     * @mbg.generated
     */
    private String operatingContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_journal_event.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_journal_event.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_journal_event.id
     *
     * @return the value of t_journal_event.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_journal_event.id
     *
     * @param id the value for t_journal_event.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_journal_event.operating_id
     *
     * @return the value of t_journal_event.operating_id
     *
     * @mbg.generated
     */
    public Integer getOperatingId() {
        return operatingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_journal_event.operating_id
     *
     * @param operatingId the value for t_journal_event.operating_id
     *
     * @mbg.generated
     */
    public void setOperatingId(Integer operatingId) {
        this.operatingId = operatingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_journal_event.operating_name
     *
     * @return the value of t_journal_event.operating_name
     *
     * @mbg.generated
     */
    public Integer getOperatingName() {
        return operatingName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_journal_event.operating_name
     *
     * @param operatingName the value for t_journal_event.operating_name
     *
     * @mbg.generated
     */
    public void setOperatingName(Integer operatingName) {
        this.operatingName = operatingName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_journal_event.ip
     *
     * @return the value of t_journal_event.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_journal_event.ip
     *
     * @param ip the value for t_journal_event.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_journal_event.operating_content
     *
     * @return the value of t_journal_event.operating_content
     *
     * @mbg.generated
     */
    public String getOperatingContent() {
        return operatingContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_journal_event.operating_content
     *
     * @param operatingContent the value for t_journal_event.operating_content
     *
     * @mbg.generated
     */
    public void setOperatingContent(String operatingContent) {
        this.operatingContent = operatingContent == null ? null : operatingContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_journal_event.status
     *
     * @return the value of t_journal_event.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_journal_event.status
     *
     * @param status the value for t_journal_event.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_journal_event.create_time
     *
     * @return the value of t_journal_event.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_journal_event.create_time
     *
     * @param createTime the value for t_journal_event.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}