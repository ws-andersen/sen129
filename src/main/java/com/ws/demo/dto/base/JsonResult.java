package com.ws.demo.dto.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonResult<T> {
    private static final Logger log = LoggerFactory.getLogger(JsonResult.class);

    private int code;
    private String msg;
    private Object data;

    public static JsonResult success(Object data) {
        JsonResult success = new JsonResult();
        success.setCode(0);
        success.setData(data);
        return success;
    }

    public static JsonResult success() {
        return success(null);
    }

    public static JsonResult build(int code, String errMsg) {
        JsonResult build = new JsonResult();
        build.setCode(code);
        build.setMsg(errMsg);
        log.info("[build result] msg:{}", build.getMsg());
        return build;
    }
    public static JsonResult fail(int code, String errMsg) {
        JsonResult fail = new JsonResult();
        fail.setCode(code);
        fail.setMsg(errMsg);
        log.info("[fail result] msg:{}", fail.getMsg());
        return fail;
    }

    public boolean isSuccess() {
        return code == 0;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
