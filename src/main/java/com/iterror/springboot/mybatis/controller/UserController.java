package com.iterror.springboot.mybatis.controller;

import com.iterror.springboot.mybatis.model.User;
import com.iterror.springboot.mybatis.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tony.yan
 */
@Controller
public class UserController {

    private Logger      logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    public String getUserInfo(Model model) {
        User user = userService.getUserInfo();
        if (user != null) {
            System.out.println("user.getName():" + user.getName());
        }
        model.addAttribute("user", user);
        return "getUserInfo";
    }
}
