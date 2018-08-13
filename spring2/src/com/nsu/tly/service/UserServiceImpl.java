package com.nsu.tly.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsu.tly.dao.UserDao;
import com.nsu.tly.entity.User;
//@Transactional
@Service("service")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	//添加UserDao对象的set方法，用于依赖注入
	
	
	
	//实现了UserService中的方法
	public void addUser() {
	}



	@Transactional
	public void transfer(String outUserName, String inUserName, Double money) {
		
		this.userDao.acountOut(outUserName, money);
		// 模拟断电
		int i = 1/0;
		this.userDao.acountIn(inUserName, money);
		System.out.println("转账成功！");
	}




	
	public List<User> queryAllUser() {
		return userDao.queryAll();
		
		
		// TODO Auto-generated method stub
		//return null;
	}




	
	public List<User> queryByUserName(String userName) {
		// TODO Auto-generated method stub
		return this.userDao.queryByName(userName);
	}




	
	public void transfer1(String outAcount, String inAcount, double money) {
		this.userDao.moneyOut(outAcount, money);
		
		int n=1/0;//模拟断电
		
		this.userDao.moneyIn(inAcount, money);
		
		
		// TODO Auto-generated method stub
		
	}
}
