package com.heyuhuan.admin.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class TransportOrder {

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transport_order.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transport_order.vehicleid
     *
     * @mbggenerated
     */
    private Integer vehicleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transport_order.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transport_order.modify_date
     *
     * @mbggenerated
     */
    private Date modifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transport_order.tonumber
     *
     * @mbggenerated
     */
    private String tonumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transport_order.fee
     *
     * @mbggenerated
     */
    private BigDecimal fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transport_order.date
     *
     * @mbggenerated
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transport_order.type
     *
     * @mbggenerated
     */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transport_order.state
     *
     * @mbggenerated
     */
    private Byte state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transport_order.weight
     *
     * @mbggenerated
     */
    private Float weight;

    private String phone;

    private String province;

    private String numberPlate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transport_order.id
     *
     * @return the value of transport_order.id
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transport_order.id
     *
     * @param id the value for transport_order.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transport_order.vehicleid
     *
     * @return the value of transport_order.vehicleid
     * @mbggenerated
     */
    public Integer getVehicleid() {
        return vehicleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transport_order.vehicleid
     *
     * @param vehicleid the value for transport_order.vehicleid
     * @mbggenerated
     */
    public void setVehicleid(Integer vehicleid) {
        this.vehicleid = vehicleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transport_order.create_date
     *
     * @return the value of transport_order.create_date
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transport_order.create_date
     *
     * @param createDate the value for transport_order.create_date
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transport_order.modify_date
     *
     * @return the value of transport_order.modify_date
     * @mbggenerated
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transport_order.modify_date
     *
     * @param modifyDate the value for transport_order.modify_date
     * @mbggenerated
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transport_order.tonumber
     *
     * @return the value of transport_order.tonumber
     * @mbggenerated
     */
    public String getTonumber() {
        return tonumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transport_order.tonumber
     *
     * @param tonumber the value for transport_order.tonumber
     * @mbggenerated
     */
    public void setTonumber(String tonumber) {
        this.tonumber = tonumber == null ? null : tonumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transport_order.fee
     *
     * @return the value of transport_order.fee
     * @mbggenerated
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transport_order.fee
     *
     * @param fee the value for transport_order.fee
     * @mbggenerated
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transport_order.date
     *
     * @return the value of transport_order.date
     * @mbggenerated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transport_order.date
     *
     * @param date the value for transport_order.date
     * @mbggenerated
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transport_order.type
     *
     * @return the value of transport_order.type
     * @mbggenerated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transport_order.type
     *
     * @param type the value for transport_order.type
     * @mbggenerated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transport_order.state
     *
     * @return the value of transport_order.state
     * @mbggenerated
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transport_order.state
     *
     * @param state the value for transport_order.state
     * @mbggenerated
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transport_order.weight
     *
     * @return the value of transport_order.weight
     * @mbggenerated
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transport_order.weight
     *
     * @param weight the value for transport_order.weight
     * @mbggenerated
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

}