package com.mengzhidu.bean.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityService {
	
	@Pointcut(value="execution(* com.mengzhidu.bean.service.*.*(..))")
	public void security(){
		System.out.println("hehe");
	}
	
	@Before("security()")
	public void beforeSecurity(){
		System.out.println("安全监测已经开始......");
	}
	
	@AfterReturning("security()")
	public void afterSecurity(){
		System.out.println("安全监测已经结束......");
	}
}