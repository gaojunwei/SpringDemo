package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.ICommentDao;
import com.mengzhidu.bean.inter.ICommentService;

public class CommentService implements ICommentService {
	public ICommentDao commentDao = null;

	public CommentService() {
	}
	//通过 构造方法注入 
	public CommentService(ICommentDao commentDao){
		this.commentDao = commentDao;
	}
	
	
	@Override
	public void getById(int id) {
		System.out.println(commentDao.getById(id));
	}

	@Override
	public void saveData(String str) {
		boolean flag = commentDao.saveComment(str);
		if (flag == true) {
			System.out.println("评论保存成功");
		} else {
			System.out.println("评论保存失败");
		}
	}
	//使用设置注入
	@Override
	public void setCommentDao(ICommentDao commentDao) {
		this.commentDao = commentDao;
	}
}