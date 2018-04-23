package com.zccpro.springbootdubboclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zccpro.service.UserService;
import com.zccpro.service.UserServiceClientImpl;
import com.zccpro.vo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdubboclientApplicationTests {
	
	@Autowired
	UserServiceClientImpl userService;
	
	@Test
	public void contextLoads() {
		User user = userService.getUser();
		System.out.println(user.getName());
	}
	
	
	@Test
	public void contextLoads2() {
		User user = userService.getdubboUser();
		System.out.println(user.getName());
	}

}
