package com.heyuhuan.admin.pojo;

import java.util.Date;

public class Position {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.toid
     *
     * @mbggenerated
     */
    private Integer toid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.longitude
     *
     * @mbggenerated
     */
    private Double longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.latitude
     *
     * @mbggenerated
     */
    private Double latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.datetime
     *
     * @mbggenerated
     */
    private Date datetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.id
     *
     * @return the value of position.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.id
     *
     * @param id the value for position.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.toid
     *
     * @return the value of position.toid
     *
     * @mbggenerated
     */
    public Integer getToid() {
        return toid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.toid
     *
     * @param toid the value for position.toid
     *
     * @mbggenerated
     */
    public void setToid(Integer toid) {
        this.toid = toid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.longitude
     *
     * @return the value of position.longitude
     *
     * @mbggenerated
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.longitude
     *
     * @param longitude the value for position.longitude
     *
     * @mbggenerated
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.latitude
     *
     * @return the value of position.latitude
     *
     * @mbggenerated
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.latitude
     *
     * @param latitude the value for position.latitude
     *
     * @mbggenerated
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.datetime
     *
     * @return the value of position.datetime
     *
     * @mbggenerated
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.datetime
     *
     * @param datetime the value for position.datetime
     *
     * @mbggenerated
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}