package com.nsu.tly.service;

import java.util.List;

import com.nsu.tly.entity.User;

public interface UserService {
	public void addUser();
	public List<User> queryAllUser();
	public List<User> queryByUserName(String userName);
	
	public void transfer1(String outAcount,String inAcount,double money);
	
	
	
	
	
	public void transfer(String outUserName, String inUserName, Double money);
	
}
