package com.zccpro.vo;

import java.io.Serializable;

public class User implements Serializable {

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
