package com.lenny.sample.order.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.lenny.sample.order.model.Order;
import com.lenny.sample.user.model.UserInfo;
import com.lenny.sample.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lenny
 * @Title: OrderController
 * @ProjectName zipkin-dubbo-demo
 * @Description: TODO
 * @date 2018-12-24 17:27
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

  @Reference
  private UserService userService;

  @GetMapping("/{id}")
  public Order get(@PathVariable Long id) {
    UserInfo userInfo = userService.get(1L);
    Order order = new Order();
    order.setId(id);
    order.setUserId(userInfo.getId());
    order.setUserName(userInfo.getName());
    return order;
  }
}
