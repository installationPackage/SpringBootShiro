package com.ssm.bdqn.standard;

import java.io.Serializable;
import java.util.Map;

/**
 *  A return Util to pages
 * @param <T> return data type
 */
public class Resp<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private final static Integer SUCCESS_CODE = 0;

    /**
     * The status returned to the page
     */
    private Integer status;

    /**
     * Message returned to the page
     */
    private String message;

    /**
     * Return data to the page
     */
    private T data;

    /**
     *  Other data that needs to be returned to the page
     */
    private Map<String,Object> rtnMap;

    public Resp() {
        this.status = SUCCESS_CODE;
        this.message = "SUCCESS";
    }


    public Resp(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Resp(Integer status, String message, T data, Map<String, Object> rtnMap) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.rtnMap = rtnMap;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Map<String, Object> getRtnMap() {
        return rtnMap;
    }

    public void setRtnMap(Map<String, Object> rtnMap) {
        this.rtnMap = rtnMap;
    }
}