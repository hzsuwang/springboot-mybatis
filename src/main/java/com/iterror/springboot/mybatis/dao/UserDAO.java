package com.iterror.springboot.mybatis.dao;

import com.iterror.springboot.mybatis.model.User;

/**
 * Created by tony.yan on 2017/7/8.
 */
public interface UserDAO {

    public User findUserInfo();
}
