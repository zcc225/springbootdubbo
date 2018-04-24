package com.zccpro.springbootdubboserver;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zccpro.dao.UserMapper;
//import com.zccpro.dao.UserDao;
import com.zccpro.model.User;
import com.zccpro.service.impl.UserServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdubboserverApplicationTests {

//	@Autowired
//	UserDao userDao;
	
//	@Autowired
//	CityDao cityDao;
//	

	@Autowired
	UserMapper userMapper;
	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void userTestadd() {
		User user = new User();
		user.setCompanyCode("900");
		user.setCompanyName("11");
		user.setInsertTime(new Date());
		user.setPassword("aa");
		user.setToken("sdfasdfjalsdjfl");
		user.setUserName("aaaaa");
		int insert = userMapper.insert(user);
		System.out.println(insert);
		System.out.println(user.getId());
	}

	@Autowired
	UserServiceImpl usrServis;
	
	@Test
	public void contextLoads1() {
		usrServis.savedataTORedis();
	}
	
	
	@Test
	public void testsavedata(){
		usrServis.savedata();
	}
	
	@Test
	public void testgetdata(){
		String getdata = usrServis.getdata("abc");
		System.out.println(getdata);
	}
	
//	@Test
//	public void testdao(){
//		City city = new City();
//		city.setCityName("aaa");
//		city.setDescription("aaaaaaaaaaa");
//		city.setId(100L);
//		city.setProvinceId(100L);
//		userDao.insert(city);
//	}
	
//	@Test
//	public void testdao(){
//		City city = new City();
//		city.setCityName("aaa");
//		city.setDescription("aaaaaaaaaaa");
//		city.setId(100L);
//		city.setProvinceId(100L);
//		City findByName = userDao.findByName("温岭市");
//		System.out.println(findByName.getDescription());
//	}
//	

//	@Test
//	public void testcitydao(){
//		City city = new City();
//		city.setCityName("aaa");
//		city.setDescription("aaaaaaaaaaa");
//		city.setId(100L);
//		city.setProvinceId(100L);
//		int insertSelective = cityDao.insertSelective(city);
//		System.out.println(insertSelective);
//	}

}
