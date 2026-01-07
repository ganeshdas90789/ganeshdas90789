package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dataconnection.Connect;

public class StudentDao {
	
	private Connection conn;
	public StudentDao() throws ClassNotFoundException

	{
		conn=Connect.DataConnect();
	}
	public void show() {
		// TODO Auto-generated method stub
		
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	

}
