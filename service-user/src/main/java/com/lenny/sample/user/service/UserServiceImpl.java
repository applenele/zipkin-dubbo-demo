package com.lenny.sample.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lenny.sample.user.model.UserInfo;

/**
 * @author lenny
 * @Title: UserServiceImpl
 * @ProjectName zipkin-dubbo-demo
 * @Description: TODO
 * @date 2018-12-24 17:25
 **/
@Service
public class UserServiceImpl implements UserService {

  @Override
  public UserInfo get(Long id) {
    System.out.println("获取用户信息");
    UserInfo userInfo = new UserInfo();
    userInfo.setId(id);
    userInfo.setName(id + "用户");
    return userInfo;
  }

}
