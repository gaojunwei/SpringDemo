package com.mengzhidu.bean.aop;

import com.mengzhidu.bean.inter.ICountService;

public class CountService implements ICountService {
	@Override
	public void before(){
		System.out.println("��¼������1");
	}
}