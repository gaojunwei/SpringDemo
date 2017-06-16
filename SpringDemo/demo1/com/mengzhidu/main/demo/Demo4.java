package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mengzhidu.bean.inter.ICommentService;
/**
 * �����������ܽ�һ�°ɣ�����ͨ��ע��ķ�ʽ��Spring���������ǵĸ���Bean�����ĺô������¼���:
 * (1)������Bean��ͳһ���������ͳһ�����������������ڡ��Ƿ��ǵ���ģʽ��
 * ��ԭ��ģʽ�ȵȣ��������������ļ��н��й���
 * (2)����Bean֮�����Ͻ����ˡ��������ǵ�ע�붼����Spring��ͳһ����ģ���
 * ��������������ʵ������ϵ����ǵĴ����У����ǿ���ʵ������һ��Bean������
 * �Ķ��ǶԽӿڵĲ��������ǿ��Բ������ھ����Beanʵ�֡�
 */
public class Demo4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beans.xml");
		ICommentService commentService = (ICommentService) applicationContext
				.getBean("commentService");
		commentService.getById(22);
		commentService.saveData("JPA�̳�..");
	}
}