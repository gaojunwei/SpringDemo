package com.mengzhidu.bean.inter;

public interface IPathService {
	void setPathDao(IPathDao pathDao);

	void getById(int id);

	void savePath(String str);
}