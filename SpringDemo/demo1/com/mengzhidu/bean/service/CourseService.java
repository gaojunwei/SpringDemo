package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.ICourseService;

public class CourseService implements ICourseService {

	@Override
	public void getById(int id) {
		System.out.println("���ǵ�"+id+"���̳�");
	}

	@Override
	public void initCourse() {
		System.out.println("��ʼ���γ�");
	}

	@Override
	public void destroyCourse() {
		System.out.println("���ٿγ�");
	}

}
