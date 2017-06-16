package com.mengzhidu.bean.dao;

import com.mengzhidu.bean.inter.ICommentDao;

public class CommentDao implements ICommentDao {
	@Override
	public String getById(int id) {
		return "这是第" + id + "条评论";
	}

	@Override
	public boolean saveComment(String str) {
		return true;
	}
}