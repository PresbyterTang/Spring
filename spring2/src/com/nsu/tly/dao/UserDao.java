package com.nsu.tly.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nsu.tly.entity.User;


public interface UserDao {
	public int addUser(User user);
	
	public List<User> queryAll();
	
	public List<User> queryByName(String userName);
	
	
	public int moneyIn(String inAcount,double money);
	
	public int moneyOut(String outAcount,double money);
	
	
	
	public int acountIn(String inUserName,double money);
	public int acountOut(String outUserName,double money);
}
