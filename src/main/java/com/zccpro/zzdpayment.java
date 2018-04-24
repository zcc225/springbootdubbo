package com.zccpro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
@MapperScan(basePackages = {"com.zccpro.dao"})
@ComponentScan(basePackages = "com.zccpro")
public class zzdpayment {

	public static void main(String[] args) {
		SpringApplication.run(zzdpayment.class, args);
	}
}
