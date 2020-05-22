package com.demo.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.UserDao;
import com.demo.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class CheckUsernameServlet
 */
public class CheckUsernameServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			//拿到Ajax 传过来的参数
			String name = request.getParameter("name");
			UserDao dao = new UserDaoImpl();
			boolean isExist = dao.checkUser(name);
			//对结果判断后返回数据
			if (isExist) {
				response.getWriter().write("<font color='red'>Exist name, not allow</font>");

			} else {
				response.getWriter().write("<font color='green'>you can use " + name + "</font>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
