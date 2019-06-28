package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		//get request
		System.out.println("Hello");
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		PrintWriter out=res.getWriter();
		out.println("Get Result="+k);
		RequestDispatcher rd=req.getRequestDispatcher("square");
		//Used to call another servlet from another
		rd.forward(req, res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		//post method
		System.out.println("Hello doPost");
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		PrintWriter out=res.getWriter();
		out.println("Post Result="+k);
		RequestDispatcher rd=req.getRequestDispatcher("square");
		rd.forward(req, res);
	}

}
