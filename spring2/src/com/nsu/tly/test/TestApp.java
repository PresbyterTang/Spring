package com.nsu.tly.test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nsu.tly.dao.UserDao;
import com.nsu.tly.service.UserService;
public class TestApp {
	
	
	
	
	/*
	@Test
	public void demo01() {
		// 1.定义配置文件路径(类路径)
		String xmlPath = "applicationContext.xml";
		// 2.初始化spring容器，加载配置文件
		ApplicationContext applicationContext = 
			               new ClassPathXmlApplicationContext(xmlPath);
		// 3.通过容器获取userDao实例
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		// 4.调用userDao的save()方法
		userDao.save();
	}
	@Test
	public void demo02() {
		// 1.定义配置文件路径(类路径)
		String xmlPath = "applicationContext.xml";
		// 2.初始化spring容器，加载配置文件
		ApplicationContext applicationContext = 
			                new ClassPathXmlApplicationContext(xmlPath);
		// 3.通过容器获取userService实例
		UserService userService = (UserService)applicationContext.getBean("userService");
		// 4.调用userService的addUser()方法
		userService.addUser();
	}
	*/
	@Test
	public void demo3(){
		
		// 1.定义配置文件路径(类路径)
				String xmlPath = "applicationContext.xml";
				// 2.初始化spring容器，加载配置文件
				ApplicationContext applicationContext = 
					                new ClassPathXmlApplicationContext(xmlPath);
				UserService userService = (UserService)applicationContext.getBean("userService");
				
				// 4.调用userService的addUser()方法
				userService.addUser();
	}
	
}
