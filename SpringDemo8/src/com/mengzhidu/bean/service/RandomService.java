package com.mengzhidu.bean.service;

import java.util.Random;
import org.springframework.stereotype.Component;
import com.mengzhidu.bean.inter.IRandomService;

//@Component(value="����bean���ƣ�Ĭ��Ϊ����ĸСд")
@Component
public class RandomService implements IRandomService {
	@Override
	public int getNumber() {
		return new Random().nextInt(3333);
	}
}