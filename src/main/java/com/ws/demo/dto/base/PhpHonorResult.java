package com.ws.demo.dto.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wangsen
 * @description 查客荣耀需要的接口数据，PHP暂时转发
 * @date 2022/4/19
 */
public class PhpHonorResult {
    private static final Logger log = LoggerFactory.getLogger(PhpHonorResult.class);

    private int code;
    private String msg;
    private String data;

    public static PhpHonorResult success(String data) {
        PhpHonorResult success = new PhpHonorResult();
        success.setCode(0);
        success.setData(data);
        return success;
    }

    public static PhpHonorResult success() {
        return success(null);
    }

    public static PhpHonorResult build(int code, String errMsg) {
        PhpHonorResult build = new PhpHonorResult();
        build.setCode(code);
        build.setMsg(errMsg);
        log.info("[build result] msg:{}", build.getMsg());
        return build;
    }
    public static PhpHonorResult fail(int code, String errMsg) {
        PhpHonorResult fail = new PhpHonorResult();
        fail.setCode(code);
        fail.setMsg(errMsg);
        log.info("[fail result] msg:{}", fail.getMsg());
        return fail;
    }

    public boolean successCode() {
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PhpHonorResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
