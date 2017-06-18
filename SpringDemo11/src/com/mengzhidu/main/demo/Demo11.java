package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mengzhidu.bean.inter.IOrderService;

public class Demo11 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		IOrderService orderService = (IOrderService)applicationContext.getBean("orderService");
		orderService.orderSec();
	}
}