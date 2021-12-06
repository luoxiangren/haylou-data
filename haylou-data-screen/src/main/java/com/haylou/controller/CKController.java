package com.haylou.controller;


import com.haylou.entity.ClusterAll;
import com.haylou.mapper.ClusterAllMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: yang
 * @create: 2021-01-26 18:57
 */
@RestController
@RequestMapping("/ck")
public class CKController {

    @Resource
    private ClusterAllMapper clusterAllMapper;

    @RequestMapping("/test")
    public String test () {
        return "test";
    }

    @RequestMapping("/saveData")
    public String saveData (){
        ClusterAll clusterAll = new ClusterAll () ;
        clusterAll.setId(4);
        clusterAll.setWebsite("hushuo");
        clusterAll.setWechat("yyyy");
        clusterAll.setFlightDate("2021-1-27");
        clusterAll.setYear("2020");
        clusterAllMapper.saveData(clusterAll);
        return "sus";
    }

    @RequestMapping("/selectById")
    public ClusterAll selectById () {
        return clusterAllMapper.selectById(1) ;
    }

    @RequestMapping("/selectList")
    public List<ClusterAll> selectList () {
        return clusterAllMapper.selectList() ;
    }
}
