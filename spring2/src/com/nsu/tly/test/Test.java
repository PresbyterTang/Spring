package com.nsu.tly.test;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nsu.tly.dao.UserDao;
import com.nsu.tly.dao.UserDaoImpl;
import com.nsu.tly.entity.User;
import com.nsu.tly.service.GoodsService;
import com.nsu.tly.service.UserService;



public class Test {
	@org.junit.Test
	public void t2(){
		
	}
	
	@org.junit.Test
	public void t1(){
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext
				("applicationContext.xml");
		
		//JdbcTemplate jdbcTemplate= (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		
		
		UserService userService = (UserService) applicationContext
				.getBean("service");
		//List<User> uList=userService.queryAllUser();
		List<User> uList=userService.queryByUserName("lisi");
		
		for(User u:uList){
			System.out.println(u.getId()+"  "+u.getUserName()+"  "+u.getPassword()+"  "+u.getMoney());
		}
		
		/*String outUserName="zhangsan";
		String inUserName="lisi";
		double money=100;
		userService.transfer(outUserName, inUserName, money);
		System.out.println("ok");
		*/
		
		/*
		
		String sql1="CREATE table t_user(id int ,username VARCHAR(50) ,password VARCHAR(50) )";
		String sql2="insert into t_user values(1,'zhangsan','123')";
		
		String sql3="insert into t_user values(?,?,?)";
		Object[] params =new Object[]{
			2,"lisi","456"
		};
		jdbcTemplate.update(sql3, params);*/
		//jdbcTemplate.update(sql2);
		//jdbcTemplate.execute(sql1);
		
	}

}
