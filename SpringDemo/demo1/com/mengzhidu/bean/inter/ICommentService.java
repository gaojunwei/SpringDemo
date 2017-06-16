package com.mengzhidu.bean.inter;

public interface ICommentService {
	
	void setCommentDao(ICommentDao commentDao);
	
	void getById(int id);

	void saveData(String str);
}