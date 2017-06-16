package com.mengzhidu.bean.service;

import java.util.Random;
import org.springframework.stereotype.Component;
import com.mengzhidu.bean.inter.IRandomService;

//@Component(value="设置bean名称，默认为首字母小写")
@Component
public class RandomService implements IRandomService {
	@Override
	public int getNumber() {
		return new Random().nextInt(3333);
	}
}