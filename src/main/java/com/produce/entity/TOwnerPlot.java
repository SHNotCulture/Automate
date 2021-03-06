package com.produce.entity;

public class TOwnerPlot {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_owner_plot.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_owner_plot.car_owner_id
     *
     * @mbg.generated
     */
    private Integer carOwnerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_owner_plot.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_owner_plot.village_name
     *
     * @mbg.generated
     */
    private String villageName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_owner_plot.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_owner_plot.is_review
     *
     * @mbg.generated
     */
    private Integer isReview;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_owner_plot.update_time
     *
     * @mbg.generated
     */
    private String updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_owner_plot.id
     *
     * @return the value of t_owner_plot.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_owner_plot.id
     *
     * @param id the value for t_owner_plot.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_owner_plot.car_owner_id
     *
     * @return the value of t_owner_plot.car_owner_id
     *
     * @mbg.generated
     */
    public Integer getCarOwnerId() {
        return carOwnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_owner_plot.car_owner_id
     *
     * @param carOwnerId the value for t_owner_plot.car_owner_id
     *
     * @mbg.generated
     */
    public void setCarOwnerId(Integer carOwnerId) {
        this.carOwnerId = carOwnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_owner_plot.company_id
     *
     * @return the value of t_owner_plot.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_owner_plot.company_id
     *
     * @param companyId the value for t_owner_plot.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_owner_plot.village_name
     *
     * @return the value of t_owner_plot.village_name
     *
     * @mbg.generated
     */
    public String getVillageName() {
        return villageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_owner_plot.village_name
     *
     * @param villageName the value for t_owner_plot.village_name
     *
     * @mbg.generated
     */
    public void setVillageName(String villageName) {
        this.villageName = villageName == null ? null : villageName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_owner_plot.address
     *
     * @return the value of t_owner_plot.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_owner_plot.address
     *
     * @param address the value for t_owner_plot.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_owner_plot.is_review
     *
     * @return the value of t_owner_plot.is_review
     *
     * @mbg.generated
     */
    public Integer getIsReview() {
        return isReview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_owner_plot.is_review
     *
     * @param isReview the value for t_owner_plot.is_review
     *
     * @mbg.generated
     */
    public void setIsReview(Integer isReview) {
        this.isReview = isReview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_owner_plot.update_time
     *
     * @return the value of t_owner_plot.update_time
     *
     * @mbg.generated
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_owner_plot.update_time
     *
     * @param updateTime the value for t_owner_plot.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}