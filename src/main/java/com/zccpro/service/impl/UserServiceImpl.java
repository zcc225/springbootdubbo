package com.zccpro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties.Redis;
import org.springframework.data.redis.core.RedisTemplate;

import com.alibaba.dubbo.config.annotation.Service;
import com.zccpro.service.UserService;
import com.zccpro.utils.RedisUtil;
import com.zccpro.vo.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private RedisTemplate<String, String> redisTemplate;
	
	@Autowired
    private RedisUtil redisUtil;
	
	
	@Override
	public User getUser() {
		System.out.println("调用了");
		return new User("zccpro");
	}
	
	
	public void savedataTORedis(){
		redisTemplate.opsForValue().set("cccc", "张昌超");
	}

	public void savedata(){
		redisUtil.save("abc", "啊啊啊啊");
	}
	
	public String  getdata(String key){
		return redisUtil.get(key);
	}


}
