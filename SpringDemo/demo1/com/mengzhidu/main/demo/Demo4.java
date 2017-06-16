package com.mengzhidu.main.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mengzhidu.bean.inter.ICommentService;
/**
 * 现在我们来总结一下吧，我们通过注入的方式让Spring来管理我们的各个Bean，它的好处有如下几个:
 * (1)有利于Bean的统一管理。这里的统一管理，包括其生命周期、是否是单例模式还
 * 是原型模式等等，都可以在配置文件中进行管理。
 * (2)各个Bean之间的耦合降低了。由于它们的注入都是由Spring来统一处理的，所
 * 以我们无需把类的实例化耦合到我们的代码中，我们可以实现在任一个Bean中做到
 * 的都是对接口的操作，我们可以不依赖于具体的Bean实现。
 */
public class Demo4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beans.xml");
		ICommentService commentService = (ICommentService) applicationContext
				.getBean("commentService");
		commentService.getById(22);
		commentService.saveData("JPA教程..");
	}
}