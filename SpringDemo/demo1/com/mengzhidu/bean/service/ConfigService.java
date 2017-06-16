package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.IConfigService;
public class ConfigService implements IConfigService {
	@Override
	public void init(){
		System.out.println("ConfigService被初始化");
	}
	@Override
	public void destroy(){
		System.out.println("ConfigService被销毁");
	}
}
