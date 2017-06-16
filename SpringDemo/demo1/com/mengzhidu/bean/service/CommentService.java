package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.ICommentDao;
import com.mengzhidu.bean.inter.ICommentService;

public class CommentService implements ICommentService {
	public ICommentDao commentDao = null;

	public CommentService() {
	}
	//ͨ�� ���췽��ע�� 
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
			System.out.println("���۱���ɹ�");
		} else {
			System.out.println("���۱���ʧ��");
		}
	}
	//ʹ������ע��
	@Override
	public void setCommentDao(ICommentDao commentDao) {
		this.commentDao = commentDao;
	}
}