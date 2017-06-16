package com.mengzhidu.bean.service;

import com.mengzhidu.bean.inter.ICourseService;

public class CourseService implements ICourseService {

	@Override
	public void getById(int id) {
		System.out.println("这是第"+id+"部教程");
	}

	@Override
	public void initCourse() {
		System.out.println("初始化课程");
	}

	@Override
	public void destroyCourse() {
		System.out.println("销毁课程");
	}

}
