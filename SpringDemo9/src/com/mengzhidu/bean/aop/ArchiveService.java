package com.mengzhidu.bean.aop;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

import com.mengzhidu.bean.inter.IRegService;

public class ArchiveService implements MethodBeforeAdvice {
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		//ֻΪ�û���ע�����
		if(arg2 instanceof IRegService){
			System.out.println("��ʼִ�й鵵��������ǰʱ��Ϊ:"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		}
	}
}