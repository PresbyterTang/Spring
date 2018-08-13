package com.nsu.tly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nsu.tly.service.UserService;

public class Test3 {
	@Test
	public void t1(){
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext
				("applicationContext.xml");
		UserService userService = (UserService) applicationContext
				.getBean("service");
		
		userService.transfer("zhangsan", "lisi", 200.0);
		
		
	}

}
