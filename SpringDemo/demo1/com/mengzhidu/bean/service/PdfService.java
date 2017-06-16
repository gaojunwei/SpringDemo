package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.IPdfService;
public class PdfService implements IPdfService {
	@Override
	public void init(){
		System.out.println("PDF服务被启动");
	}
	@Override
	public void destroy(){
		System.out.println("PDF服务被销毁");
	}
}