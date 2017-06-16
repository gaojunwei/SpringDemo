package com.mengzhidu.bean.dao;

import com.mengzhidu.bean.inter.IPathDao;

public class PathDao implements IPathDao {
	@Override
	public String getById(int id) {
		return "当前路径是第" + id + "条路径";
	}

	@Override
	public boolean savePath(String str) {
		return true;
	}
}