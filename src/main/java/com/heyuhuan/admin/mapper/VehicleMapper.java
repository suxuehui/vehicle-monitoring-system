package com.heyuhuan.admin.mapper;

import com.heyuhuan.admin.pojo.Vehicle;
import org.apache.ibatis.annotations.MapKey;

import java.util.Map;

public interface VehicleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int insert(Vehicle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int insertSelective(Vehicle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    Vehicle selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Vehicle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Vehicle record);

    @MapKey("id")
    Map<Integer, Vehicle> selectVehicles();
}