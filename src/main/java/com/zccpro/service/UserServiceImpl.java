package com.zccpro.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zccpro.vo.User;
@Service
public class UserServiceImpl implements UserService {

	@Override
	public User getUser() {
		return new User("zccpro");
	}

}
