package com.checkpoint.check.exception;

public class MyException extends RuntimeException{
    private Integer code;

    public MyException(Integer code,String msg){
        super(msg);
        this.code=code;
    }

    public Integer getCode() {
        return code;
    }
}
