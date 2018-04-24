package com.zccpro.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
@Component 
public class RedisUtil {

	@Autowired
    private RedisTemplate<String, String> redisTemplate;
	
	public void save(String key, String value){
		ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
		opsForValue.set(key, value);
	}
	
	
	public String  get(String key){
		ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
		return opsForValue.get(key);
	}
}
