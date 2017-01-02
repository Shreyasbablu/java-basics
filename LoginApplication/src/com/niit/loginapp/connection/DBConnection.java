package com.niit.loginapp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {


	private static String username ="sa"; 
	private static String password =""; 
	private static String url ="jdbc:h2:tcp://localhost/~/test"; 
	private static String driver = "org.h2.Driver";
	private static Connection connection = null;

	private DBConnection() {
		
	}
	
	public static Connection getDBConnection() 
	{
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
		
	//temporarily test you are able to get connection or not
	
	public static void main(String[] args) 
	{
		if(getDBConnection() == null)
			System.out.println("Connection could not be established ");
		else
			System.out.println("Connection successfully established");		
	}
}
