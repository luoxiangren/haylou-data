package com.haylou.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface HealthMapper {

    List<Map<String, Object>> getTotHealthRatio();

    List<Map<String, Object>> get6MonStat();
}
