package com.demo.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.demo.dao.UserDao;
import com.demo.util.JDBCUtil;

public class UserDaoImpl implements UserDao {

	public boolean checkUser(String username) throws SQLException {
		//1. 拿数据池，并且准备查询
		QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
		//2. 查询个数，返回结果为数据
		Long result = (Long) qr.query("select count(*) from t_usr where username=?", new ScalarHandler(), username);
		//3. 判断数据是否大于0
		return result > 0;
	}

}
