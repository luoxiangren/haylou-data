package com.haylou.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DeviceMapper {

    List<Map<String, Object>> getTotalActiveCnt();

    List<Map<String, Object>> getActiveCntByType();

    List<Map<String, Object>> getLastMonActiveCnt();

    List<Map<String, Object>> getBindCntByTypeAndAge();

    List<Map<String, Object>> getBindCnt();


}
