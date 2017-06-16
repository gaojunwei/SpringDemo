package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mengzhidu.bean.inter.IRandomService;

public class Demo7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beans.xml");
		IRandomService randomService = (IRandomService) applicationContext
				.getBean("randomService");
		System.out.println("得到的随机数是:" + randomService.getNumber());
	}
}