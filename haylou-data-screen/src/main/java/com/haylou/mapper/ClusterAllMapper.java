package com.haylou.mapper;

import com.haylou.entity.ClusterAll;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;


@Mapper
public interface ClusterAllMapper {
    // 写入数据
    void saveData (ClusterAll clusterAll) ;
    // ID 查询
    ClusterAll selectById (@Param("id") Integer id) ;
    // 查询全部
    List<ClusterAll> selectList () ;
}
