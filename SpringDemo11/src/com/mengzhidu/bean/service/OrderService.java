package com.mengzhidu.bean.service;

import org.springframework.stereotype.Service;
import com.mengzhidu.bean.inter.IOrderService;

@Service
public class OrderService implements IOrderService {
	@Override
	public void orderSec(){
		System.out.println("用户A下订单");
	}
}