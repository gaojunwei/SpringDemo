package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mengzhidu.bean.inter.IAskService;

/**
 * 需要特殊说明的是，我们这里获取的是代理的bean，而不是原来的bean，
 * 也就是我们只有被代理的bean才实现了各种通知。
 * @author gjw-pc
 */
public class Demo8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new
		ClassPathXmlApplicationContext("beans.xml");
		IAskService askService = (IAskService) applicationContext.getBean("askProxy");
		askService.postAsk();
		askService.dealAsk();
	}
}