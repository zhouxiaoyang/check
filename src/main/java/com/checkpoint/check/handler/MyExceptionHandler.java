package com.checkpoint.check.handler;

import com.checkpoint.check.exception.MyException;
import com.checkpoint.check.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 处理抛出的MyException  返回前端异常code和msg
 */
@RestControllerAdvice
@Slf4j
public class MyExceptionHandler {

    @ExceptionHandler(value = MyException.class)
    public String getException(MyException myException ){
        Map re=new HashMap<>();
        re.put("code",myException.getCode());
        re.put("msg",myException.getMessage());
        String errorMsg=JsonUtil.toJson(re);
        System.err.println(errorMsg);
        log.error("捕获到异常:{}"+myException );
        return errorMsg;


    }

}
