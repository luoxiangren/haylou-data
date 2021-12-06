package com.haylou.controller;

import com.haylou.config.JsonResult;
import com.haylou.config.StatusCode;
import com.haylou.mapper.AppMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/app")
public class AppController {

    @Resource
    private AppMapper appMapper;

    @RequestMapping(value = "/getAppActByCountry")
    JsonResult getAppActByCountry()
    {
        List<Map<String, Object>> list = appMapper.getAppActByCountry();
        return new JsonResult(StatusCode.OK,list);
    }

}
