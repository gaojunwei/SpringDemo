package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mengzhidu.bean.inter.IPathService;

public class Demo6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		IPathService pathService = (IPathService) applicationContext.getBean("pathService");
		pathService.getById(33);
		pathService.savePath("Java算法学习之路");
	}
}