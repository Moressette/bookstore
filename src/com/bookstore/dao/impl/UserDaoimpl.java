package com.bookstore.dao.impl;

import com.bookstore.dao.UserDao;
import com.bookstore.entity.User;
import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.bookstore.DataSource.ConnectionManager;
import com.bookstore.DataSource.SQLManager;

public class UserDaoimpl implements UserDao{
	ConnectionManager connectionManager = new ConnectionManager();
	Connection connection = (Connection) connectionManager.openConnection();
	SQLManager sqlManager = new SQLManager();
	public User login(User user){
		
		String username = user.getUsername();
		String password = user.getPassword();
		System.out.println(username+password);
		String strSQL = "select * from users where username=? and password=?";
		Object[] params = {username,password};
		ResultSet rs = sqlManager.execQuery(connection, strSQL, params);
		try {
			User u = new User();
			if(rs.next()){
				u.setId(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setRole(rs.getString(5));
				return u;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public boolean register(User user) {
		try {
			String username = user.getUsername();
			String strSQL = "select * from users where username=?";
			Object[] param = { username };
			ResultSet rs = sqlManager.execQuery(connection, strSQL, param);
			if (rs.next()) {
				return false;
			} else {
				strSQL = "insert into users(username,password,email,role,updatetime) values(?,?,?,2,?)";
				Timestamp d = new Timestamp(System.currentTimeMillis()); 
				Object[] params = { username, user.getPassword(), user.getEmail() ,d};
				if (sqlManager.execUpdate(connection, strSQL, params) > 0) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
