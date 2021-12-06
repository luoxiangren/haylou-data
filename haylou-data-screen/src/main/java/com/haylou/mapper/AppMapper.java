package com.haylou.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface AppMapper {

    List<Map<String, Object>> getAppActByCountry();
}
