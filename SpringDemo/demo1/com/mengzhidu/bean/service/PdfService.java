package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.IPdfService;
public class PdfService implements IPdfService {
	@Override
	public void init(){
		System.out.println("PDF��������");
	}
	@Override
	public void destroy(){
		System.out.println("PDF��������");
	}
}