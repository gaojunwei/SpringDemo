package com.mengzhidu.bean.dao;

import com.mengzhidu.bean.inter.IPathDao;

public class PathDao implements IPathDao {
	@Override
	public String getById(int id) {
		return "��ǰ·���ǵ�" + id + "��·��";
	}

	@Override
	public boolean savePath(String str) {
		return true;
	}
}