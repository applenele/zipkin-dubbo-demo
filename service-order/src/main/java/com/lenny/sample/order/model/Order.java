package com.lenny.sample.order.model;

import java.io.Serializable;

/**
 * @author lenny
 * @Title: Order
 * @ProjectName zipkin-dubbo-demo
 * @Description: TODO
 * @date 2018-12-24 17:30
 **/
public class Order implements Serializable {

  private Long id;

  private Long userId;

  private String userName;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
