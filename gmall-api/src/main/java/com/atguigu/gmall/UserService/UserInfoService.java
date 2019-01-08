package com.atguigu.gmall.UserService;

import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {


    List<UserInfo> getUserList();

    void addUserInfo(UserInfo userInfo);
}
