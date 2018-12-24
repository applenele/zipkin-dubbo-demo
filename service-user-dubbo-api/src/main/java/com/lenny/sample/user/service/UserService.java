package com.lenny.sample.user.service;

import com.lenny.sample.user.model.UserInfo;

/**
 * @author lenny
 * @Title: UserService
 * @ProjectName zipkin-dubbo-demo
 * @Description: TODO
 * @date 2018-12-24 17:24
 **/
public interface UserService {

  UserInfo get(Long id);
}
