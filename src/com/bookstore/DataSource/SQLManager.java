package com.bookstore.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.util.Log;

public class SQLManager {

	// 方法1：专门用于执行查询语句
	public ResultSet execQuery(final Connection connection, final String strSQL, final Object...params){
		com.bookstore.util.Log.out(this.getClass().getSimpleName(), strSQL);
		try {
			PreparedStatement pstmt = connection.prepareStatement(strSQL);
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i+1, params[i]);
			}
			ResultSet resultSet = pstmt.executeQuery();
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	// 方法2：专门用于执行增删改语句
	public int execUpdate(final Connection connection, final String strSQL, final Object...params){
		Log.out(this.getClass().getSimpleName(), strSQL);
		try {
			PreparedStatement pstmt = connection.prepareStatement(strSQL);
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i+1, params[i]);
			}
			int affectedRows = pstmt.executeUpdate();
			return affectedRows;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
}
