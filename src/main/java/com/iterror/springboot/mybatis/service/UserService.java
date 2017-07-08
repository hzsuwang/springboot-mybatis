package com.iterror.springboot.mybatis.service;

import com.iterror.springboot.mybatis.dao.UserDAO;
import com.iterror.springboot.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tony.yan
 */

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public User getUserInfo() {
        User user = userDAO.findUserInfo();
        // User user=null;
        return user;
    }

}
