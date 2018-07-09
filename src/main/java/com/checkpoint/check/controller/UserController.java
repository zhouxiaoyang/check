package com.checkpoint.check.controller;

import com.checkpoint.check.dataVo.ResultVo;
import com.checkpoint.check.service.UserService;
import com.checkpoint.check.util.ResultVoUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description:
 * @Author: Winston Yang
 * @Date: Create in 16:02 2018/6/4
 * @Modified by:
 */
@RestController
@Slf4j
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUserList")
    public ResultVo getUserService(@RequestParam(value = "thisPage", defaultValue = "1")Integer thisPage, @RequestParam(value = "pageSize", defaultValue = "10")Integer pageSize) {
        Map map=new HashMap();
        map.put("thisPage",thisPage-1);
        map.put("pageSize",pageSize);
//        PageRequest request = new PageRequest(thisPage - 1, pageSize);
//        Page<ProductInfo> productInfoPage = productService.findAll(request);
        Map <String,Object> data=userService.getUserList(map);
        //HashMap
       // Arrays.sort();
        return ResultVoUtil.success(data);
    }
}
