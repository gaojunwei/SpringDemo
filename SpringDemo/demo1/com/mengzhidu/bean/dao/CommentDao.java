package com.mengzhidu.bean.dao;

import com.mengzhidu.bean.inter.ICommentDao;

public class CommentDao implements ICommentDao {
	@Override
	public String getById(int id) {
		return "���ǵ�" + id + "������";
	}

	@Override
	public boolean saveComment(String str) {
		return true;
	}
}