package com.haylou.config;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

public class JsonResult<T> {

    private String code;
    private String message;
    private T data;

    public JsonResult() {
        this.setCode(StatusCode.OK);
        this.setMessage(StatusCode.OK.getMessage());
    }

    public JsonResult(StatusCode code) {
        this.setCode(code);
        this.setMessage(code.getMessage());
    }

    public JsonResult(StatusCode code, T data) {
        this.setCode(code);
        this.setMessage(code.getMessage());
        this.setData(data);
    }

    /*public JsonResult(StatusCode code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }*/

    public JsonResult(StatusCode code, String message, T data) {

        this.setCode(code);
        this.setMessage(message);
        this.setData(data);

    }

    @Override
    public String toString() {

        JSONObject json = new JSONObject();
        try {
            json.put("code", code);
            json.put("message", message);
            json.put("data", data);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return json.toString();
    }

    public String getCode() {
        return code;
    }

    public void setCode(StatusCode code) {
        this.code = String.valueOf(code.getCode());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}




