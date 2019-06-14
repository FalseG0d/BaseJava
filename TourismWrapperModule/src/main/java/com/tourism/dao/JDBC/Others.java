package com.tourism.dao.JDBC;

import java.sql.*;

public class Others {
	static Connection con;
	static Statement st;
	static ResultSet rs;
	
public static Connection getConnection()throws Exception
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/d1","root","10111998@Ma");
		System.out.println("Connected");
		return conn;
	}catch(Exception e)
	{System.out.println(e);}
	return null;
	
	}
public static void showSensitiveTable()
	{
	try
		{
		con=getConnection();
		st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs=st.executeQuery("select name from student");
		rs.next();
		rs.deleteRow();
		System.out.println("Record Deleted");
		}catch(Exception e)
	{System.out.println(e);}
	}
/*public static void main(String s[])throws Exception
	{
	showSensitiveTable();
	}*/
};
