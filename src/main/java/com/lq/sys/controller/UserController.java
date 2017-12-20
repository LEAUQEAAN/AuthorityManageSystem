package com.lq.sys.controller;

import com.lq.sys.service.UserService;
import com.lq.sys.viewmodel.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Software1 on 2017/12/15.
 */
@Controller
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    UserInfo login(String code ,String pwd){
        return userService.Login(code,pwd);
    }

}
