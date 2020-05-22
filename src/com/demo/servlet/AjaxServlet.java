package com.demo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxServlet
 */
public class AjaxServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("收到一个请求。。。");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("name="+name+"----age="+age);
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write("shoudaoqingqiu ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("收到一个POST请求。。。");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write("POST reveived... ");
		
	}

}
