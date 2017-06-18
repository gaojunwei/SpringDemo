package com.mengzhidu.bean.aop;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

import com.mengzhidu.bean.inter.IRegService;

public class ArchiveService implements MethodBeforeAdvice {
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		//只为用户的注册服务
		if(arg2 instanceof IRegService){
			System.out.println("开始执行归档操作，当前时间为:"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		}
	}
}