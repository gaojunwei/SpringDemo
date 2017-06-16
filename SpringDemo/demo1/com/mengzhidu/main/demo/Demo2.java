package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mengzhidu.bean.inter.ICourseService;

public class Demo2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("-------应用初始化完成-------");
		ICourseService courseService = (ICourseService)applicationContext.getBean("courseService");
		courseService.getById(3);
		
		System.out.println("-------服务调用完毕--------");
		//通过((AbstractApplicationContext)applicationContext).close();
		//来明确的关闭了整个应用，此时它才会被销毁。
		((AbstractApplicationContext) applicationContext).close();
		System.out.println("-------应用关闭完成--------");
	}
}