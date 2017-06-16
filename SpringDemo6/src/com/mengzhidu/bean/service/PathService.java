package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.IPathDao;
import com.mengzhidu.bean.inter.IPathService;

public class PathService implements IPathService {
	IPathDao pathDao = null;

	@Override
	public void setPathDao(IPathDao pathDao) {
		this.pathDao = pathDao;
	}

	@Override
	public void getById(int id) {
		System.out.println(pathDao.getById(id));
	}

	@Override
	public void savePath(String str) {
		boolean flag = pathDao.savePath(str);
		if (flag == true) {
			System.out.println("保存数据成功!!");
		} else {
			System.out.println("保存数据失败!!");
		}
	}
}