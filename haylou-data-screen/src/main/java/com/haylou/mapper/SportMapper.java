package com.haylou.mapper;

import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Map;

@Mapper
public interface SportMapper {

    // 获取运动总距离和总时长
    List<Map<String, Object>> getSportTotDistAndDur();

    // 获取总步数
    List<Map<String, Object>> getTotSteps();

    // 过去卡路里
    List<Map<String, Object>> getTotKcal();

    // 获取最近6个月运动的比例
    List<Map<String, Object>> getSportRatio();

}
