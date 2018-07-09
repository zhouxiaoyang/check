package com.checkpoint.check.dao;


import com.checkpoint.check.form.UserForm;
import org.apache.ibatis.annotations.Mapper;
//import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.List;

/**
 * @Description:
 * @Author: Winston Yang
 * @Date: Create in 16:03 2018/6/4
 * @Modified by:
 */
@Mapper
//@Repository
public interface UserDao {
    /**
     * 获取用户列表
     * @return
     */
    List<Map<String,Object>> getUserList(Map<String,Object> map);

    /**
     * 插入用户
     * @return
     */
    int insertUser(UserForm userForm);
}
