package com.lenny.sample.user;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lenny
 * @Title: UserApplication
 * @ProjectName zipkin-dubbo-demo
 * @Description: TODO
 * @date 2018-12-24 17:10
 **/
@SpringBootApplication
@EnableDubbo
@DubboComponentScan
public class UserApplication {


  public static void main(String[] args) {
    SpringApplication.run(UserApplication.class, args);
  }
}
