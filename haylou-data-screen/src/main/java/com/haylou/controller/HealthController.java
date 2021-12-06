package com.haylou.controller;

import com.haylou.config.JsonResult;
import com.haylou.config.StatusCode;
import com.haylou.mapper.HealthMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/health")
public class HealthController {

    @Resource
    private HealthMapper healthMapper;

    @RequestMapping(value = "/getTotHealthRatio")
    JsonResult getTotHealthRatio()
    {
        List<Map<String, Object>> list = healthMapper.getTotHealthRatio();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/get6MonStat")
    JsonResult get6MonStat()
    {
        List<Map<String, Object>> list = healthMapper.get6MonStat();
        return new JsonResult(StatusCode.OK,list);
    }


}
