package com.example.demo.dao;

import com.example.demo.domain.City;
import org.apache.ibatis.annotations.Param;

/**
 * Created by admin on 2018/4/7.
 */
public interface CityDao {
    City findByName(@Param("cityName") String cityName);
}
