package com.qcl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qcl.controller.WebSorcketController;
import com.qcl.entity.User;

public class ApplicationContextTest {
	
	
	@Test
	public void applicationContextConnection() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/spring/applicationcontext.xml");
		WebSorcketController	websorcket=(WebSorcketController)applicationContext.getBean(WebSorcketController.class);
		
		System.out.println("user====="+websorcket);
	}
}
