package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.IAskService;

public class AskService implements IAskService {
	
	@Override
	public void postAsk(){
		System.out.println("����һ���ʴ�");
	}
	
	@Override
	public void dealAsk(){
		System.out.println("���һ���ʴ�");
	}
}