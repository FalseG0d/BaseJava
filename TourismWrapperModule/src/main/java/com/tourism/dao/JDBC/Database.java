package com.tourism.dao.JDBC;

import java.sql.*;

public class Database {

	public static void showTable()throws Exception{
		Connection conn=getConnection();
		Statement s=conn.createStatement();
		ResultSet rs=s.executeQuery("select * from alien");
		System.out.println("Id\tName");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t|"+rs.getString(2));
		}
		
	}
	public static void insertIntoTable()throws Exception{
		Connection conn=getConnection();
		Statement s=conn.createStatement();
		int x=s.executeUpdate("insert into student values ('Ashutosh',105)");
		System.out.println(x);
		
	}
	public static void deleteFromTable()throws Exception{
		Connection conn=getConnection();
		Statement s=conn.createStatement();
		int x=s.executeUpdate("delete from Student where id=105");
		System.out.println(x);
		
	}
	public static void updateTable()throws Exception{
		Connection conn=getConnection();
		Statement s=conn.createStatement();
		int x=s.executeUpdate("update student set name='rani' where id=102");
		System.out.println(x);
		
	}
	public static Connection getConnection()throws Exception{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","10111998@Ma");
			System.out.println("Connected");
			return conn;
		}catch(Exception e)
		{System.out.println(e);
		return null;
		}
	}
	

}
