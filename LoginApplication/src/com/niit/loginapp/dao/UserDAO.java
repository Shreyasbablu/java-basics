package com.niit.loginapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.niit.loginapp.connection.DBConnection;
import com.niit.loginapp.model.User;

public class UserDAO {

	//CRUD operations
		//Validations
		
		private Connection con;
		private PreparedStatement pStatement;
		private ResultSet resultSet;
		
		public boolean isValidUser(String userId, String password) {
			//need to connect to db
			con = DBConnection.getDBConnection();
			
			String query = "select * from TUSER where ID =? and PASSWORD =?";
			
			//get the prepared statement instance from connection object
			try {
				pStatement = con.prepareStatement(query);
				pStatement.setString(1, userId);
				pStatement.setString(2, password);
				//execute query
				resultSet = pStatement.executeQuery();
				if (resultSet.next()) {
					return true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					con.close();
					pStatement.close();
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return false;
				
		}
		
		//Create a class with the required properties and generate getters and setters(Java Bean/ Model,DTO)
		public User getUser(String id)
		{
			con = DBConnection.getDBConnection();
			String query = "select * from tuser where id =?";
			User user = null;
			try {
				pStatement = con.prepareStatement(query);
				pStatement.setString(1, id);
				resultSet = pStatement.executeQuery();
				if(resultSet.next())
				{
					user = new User();
					user.setId(resultSet.getString(1));
					user.setPassword(resultSet.getString(2));
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					con.close();
					pStatement.close();
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return user;
			
		}
		
		public List<User> getAllUsers(){
			return null;
		}
}
