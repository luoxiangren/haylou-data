package com.haylou.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    // 性别比率
    List<Map<String, Object>> getUserSexRatio();

    //年龄比率
    List<Map<String, Object>> getUserAgeRatio();

    //注册用户数
    List<Map<String, Object>> getTotUserRegCnt();

    //获取不同国家注册用户数
    List<Map<String, Object>> getRegCntByConuntry();

    //获取上月注册数
    List<Map<String, Object>> getRegCntLastMon();

}
