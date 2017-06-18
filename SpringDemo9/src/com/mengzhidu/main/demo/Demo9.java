package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mengzhidu.bean.inter.IRegService;

public class Demo9 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		IRegService regService = (IRegService) applicationContext.getBean("regService");
		regService.reg();
		regService.email();
		regService.telephone();
	}
}