package com.bookstore.DataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.bookstore.util.Log;


public class ConnectionManager {

	// 方法1：开启数据库的链接
	public Connection openConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String account = "root";
			String password = "123456";
			String url = "jdbc:mysql://localhost:3306/bookstore";
			Connection connection = DriverManager.getConnection(url, account, password);
			Log.out(this.getClass().getSimpleName(), "成功获取一个有效的数据库链接对象Connection……");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	// 方法2：关闭数据库的链接
	public void closeConnection(final Connection connection){
		if(connection != null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//数据库连接测试
	public static void main(String[] args) {
		ConnectionManager manager = new ConnectionManager();
		manager.openConnection();
	}
}
