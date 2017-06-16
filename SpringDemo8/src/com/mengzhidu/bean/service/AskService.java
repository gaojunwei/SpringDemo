package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.IAskService;

public class AskService implements IAskService {
	
	@Override
	public void postAsk(){
		System.out.println("发布一条问答");
	}
	
	@Override
	public void dealAsk(){
		System.out.println("解决一条问答");
	}
}