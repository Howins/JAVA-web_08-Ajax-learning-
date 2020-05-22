package com.demo.dao;

import java.sql.SQLException;

public interface UserDao {
	/**
	 * 用于检测当前输入的用户是否存在
	 * 
	 * @param username
	 * @return true:存在 false:不存在
	 */
	boolean checkUser(String username) throws SQLException;
}
