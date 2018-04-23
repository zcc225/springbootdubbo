package com.zccpro.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zccpro.vo.User;

@Component
public class UserServiceClientImpl {
	

  public User getUser(){
		return new User("zccpro");
	}
  
  @Reference
   UserService usService;
  
  public User getdubboUser(){
		return usService.getUser();
	}
}
