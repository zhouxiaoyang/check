package com.checkpoint.check.controller;

import com.checkpoint.check.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CheckController {
//    @RequestMapping
//    public String index(){
//        return "index";
//    }

    @RequestMapping("/getString")
    @ResponseBody
    public  String getString(@RequestParam("str") String  str){
        str+="hello world!!";

        return  str;
    }

    @RequestMapping("/getP")
    @ResponseBody
    public  String getP(String ip){

        return ip+"  hello!";
    }
    @RequestMapping("/getException")
    @ResponseBody
    public String getException(String val){
        if("yes".equals(val)){
            return val;
        }else{
            throw new MyException(1,"w  chu cuo le!!");
        }

    }
}
