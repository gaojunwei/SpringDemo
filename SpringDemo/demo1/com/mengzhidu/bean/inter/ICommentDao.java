package com.mengzhidu.bean.inter;

public interface ICommentDao {
	String getById(int id);

	boolean saveComment(String str);
}