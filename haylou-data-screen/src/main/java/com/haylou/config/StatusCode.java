package com.haylou.config;

public enum StatusCode {

    OK(200,"Successfully handle the request."),
    FAIL(-200,"Unsuccessfully handle the request."),
    DUPLICATE_RESOURCE(201,"duplicate resource"),
    PARAM_ERROR(400,"Request parameters error"),
    PERMISSON_DENIED(403,"Permission denied"),
    UNAUTHORIZED(407,"Need login"),
    INTERFACE_LEAPID_FAIL(408,"could not get data from leadip"),
    SERVER_ERROR(500,"Server internal error");

    private final int code;
    private final String message;

    private StatusCode(int code,String message){
        this.code = code;
        this.message = message;
    }
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
