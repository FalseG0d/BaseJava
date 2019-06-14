package com.tourism.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.tourism.dao.JDBC.Database;

public class Test {
	public static void main(String arr[]) throws Exception {
		Database db=new Database();
		Connection conn=Database.getConnection();
		Statement s=conn.createStatement();
		ResultSet rs=s.executeQuery("select * from demo1");
		System.out.println("Home\t\tDest\t\tDist");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t\t|"+rs.getString(2)+"\t\t|"+rs.getString(3));
		}

		
	}
		

}
