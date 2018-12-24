package com.lenny.sample.user.model;

import java.io.Serializable;

/**
 * @author lenny
 * @Title: UserInfo
 * @ProjectName zipkin-dubbo-demo
 * @Description: TODO
 * @date 2018-12-24 17:24
 **/
public class UserInfo implements Serializable {

  private Long id;

  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
