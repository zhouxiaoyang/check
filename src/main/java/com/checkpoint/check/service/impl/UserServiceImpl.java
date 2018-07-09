package com.checkpoint.check.service.impl;

import com.checkpoint.check.dao.UserDao;
import com.checkpoint.check.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Winston Yang
 * @Date: Create in 16:37 2018/6/4
 * @Modified by:
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public Map<String, Object> getUserList(Map<String, Object> map) {
        Map<String, Object> result=new HashMap<>();
        List<Map<String, Object>> list=userDao.getUserList(map);
        result.put("userdata",list);
        return result;
    }
}
