package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.UserService.UserInfoService;
import com.atguigu.gmall.bean.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {

   @Reference
   UserInfoService userService;

    @RequestMapping("userList")
    @ResponseBody
    public List<UserInfo> userList(){
        List<UserInfo> userInfos = userService.getUserList();

        return userInfos;
    }


}
