package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mengzhidu.bean.inter.ICourseService;

public class Demo2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("-------Ӧ�ó�ʼ�����-------");
		ICourseService courseService = (ICourseService)applicationContext.getBean("courseService");
		courseService.getById(3);
		
		System.out.println("-------����������--------");
		//ͨ��((AbstractApplicationContext)applicationContext).close();
		//����ȷ�Ĺر�������Ӧ�ã���ʱ���Żᱻ���١�
		((AbstractApplicationContext) applicationContext).close();
		System.out.println("-------Ӧ�ùر����--------");
	}
}