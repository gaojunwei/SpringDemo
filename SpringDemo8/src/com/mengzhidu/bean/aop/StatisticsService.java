package com.mengzhidu.bean.aop;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class StatisticsService implements MethodBeforeAdvice,AfterReturningAdvice{
		
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		String string = "";
		if(arg0.getName().equals("postAsk")){
			string += "�û���ʼ�������";
		}else{
			string += "�û���ʼ�������";
		}
		string += new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		System.out.println(string);
	}
	
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		String string = "";
		if(arg1.getName().equals("postAsk")){
			string += "�û�����������";
		}else{
			string += "�û�����������";
		}
		string += new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		System.out.println(string);
	}
}
