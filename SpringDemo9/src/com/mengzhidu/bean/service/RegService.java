package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.IRegService;

public class RegService implements IRegService {
	@Override
	public void reg(){
		System.out.println("有人注册了");
	}
	@Override
	public void email(){
		System.out.println("有人验证邮箱了");
	}
	@Override
	public void telephone(){
		System.out.println("有人验证手机号了");
	}
}