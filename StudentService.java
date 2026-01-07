package com.service;

import com.dao.StudentDao;

public class StudentService {
	StudentDao sdao;
	
	public StudentService() throws ClassNotFoundException
	{
		sdao=new StudentDao();
	}
	


	public void Show() {
		// TODO Auto-generated method stub
		sdao.show();
	}
	
	
	
	

}
