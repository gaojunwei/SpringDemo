package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mengzhidu.bean.inter.IAskService;

/**
 * ��Ҫ����˵�����ǣ����������ȡ���Ǵ����bean��������ԭ����bean��
 * Ҳ��������ֻ�б������bean��ʵ���˸���֪ͨ��
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