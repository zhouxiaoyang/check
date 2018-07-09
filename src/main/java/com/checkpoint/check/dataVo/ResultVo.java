package com.checkpoint.check.dataVo;

/**
 * 返回结果集对象
 * @author Administrator
 *
 */
public class ResultVo implements java.io.Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private int code;
    private String msg;
    private Object data;


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




}


