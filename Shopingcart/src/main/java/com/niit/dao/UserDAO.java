package com.niit.dao;

public class UserDAO 
{
 
	public boolean isValidCredentials(String id, String password )
	{
		if(id.equals("niit") &&password.equals("niit123"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
