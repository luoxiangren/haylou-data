package com.haylou.controller;

import com.haylou.config.JsonResult;
import com.haylou.config.StatusCode;
import com.haylou.mapper.SportMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/sport")
public class SportController {

    @Resource
    private SportMapper sportMapper;

    @RequestMapping(value = "/getSportTotDist")
    JsonResult getSportTotDistAndDur()
    {
        List<Map<String, Object>> list = sportMapper.getSportTotDistAndDur();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getSportTotDur")
    JsonResult getSportTotDur()
    {
        List<Map<String, Object>> list = sportMapper.getSportTotDistAndDur();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getTotSteps")
    JsonResult getTotSteps()
    {
        List<Map<String, Object>> list = sportMapper.getTotSteps();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getTotKcal")
    JsonResult getTotKcal()
    {
        List<Map<String, Object>> list = sportMapper.getTotKcal();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getSportRatio")
    JsonResult getSportRatio()
    {
        List<Map<String, Object>> list = sportMapper.getSportRatio();
        return new JsonResult(StatusCode.OK,list);
    }


}
