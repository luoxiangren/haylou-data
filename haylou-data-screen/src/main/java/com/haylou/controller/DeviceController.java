package com.haylou.controller;

import com.haylou.config.JsonResult;
import com.haylou.config.StatusCode;
import com.haylou.mapper.DeviceMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/device")
public class DeviceController {
    @Resource
    private DeviceMapper deviceMapper;

    @RequestMapping(value = "/getTotalActiveCnt")
    JsonResult getTotalActiveCnt()
    {
        List<Map<String, Object>> list = deviceMapper.getTotalActiveCnt();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getActiveCntByType")
    JsonResult getActiveCntByType()
    {
        List<Map<String, Object>> list = deviceMapper.getActiveCntByType();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getLastMonActiveCnt")
    JsonResult getLastMonActiveCnt()
    {
        List<Map<String, Object>> list = deviceMapper.getLastMonActiveCnt();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getBindCntByTypeAndAge")
    JsonResult getBindCntByTypeAndAge()
    {
        List<Map<String, Object>> list = deviceMapper.getBindCntByTypeAndAge();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getBindCnt")
    JsonResult getBindCnt()
    {
        List<Map<String, Object>> list = deviceMapper.getBindCnt();
        return new JsonResult(StatusCode.OK,list);
    }


}
