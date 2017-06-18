package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mengzhidu.bean.inter.ICountService;
import com.mengzhidu.bean.inter.ILoginService;

public class Demo10 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		ILoginService loginService = (ILoginService) applicationContext.getBean("loginService");
		loginService.login();
	}
}