package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.IRegService;

public class RegService implements IRegService {
	@Override
	public void reg(){
		System.out.println("����ע����");
	}
	@Override
	public void email(){
		System.out.println("������֤������");
	}
	@Override
	public void telephone(){
		System.out.println("������֤�ֻ�����");
	}
}