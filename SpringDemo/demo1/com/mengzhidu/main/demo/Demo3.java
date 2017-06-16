package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mengzhidu.bean.inter.IConfigService;
import com.mengzhidu.bean.inter.IPdfService;

public class Demo3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new
		ClassPathXmlApplicationContext("beans.xml");
		System.out.println("-----------Ӧ�ÿ�ʼ����-----------");
		IConfigService configService1 = (IConfigService)applicationContext.getBean("configService");
		IConfigService configService2 = (IConfigService)applicationContext.getBean("configService");
		
		IPdfService pdfService1 = (IPdfService)applicationContext.getBean("pdfService");
		IPdfService pdfService2 = (IPdfService)applicationContext.getBean("pdfService");
		System.out.println("----------����Bean�������---------");
		((AbstractApplicationContext) applicationContext).close();
	}
}