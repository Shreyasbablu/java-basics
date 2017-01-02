package com.niit.loginapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import com.niit.loginapp.dao.UserDAO;
/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    
    public LoginServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Calling doGet() method");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Calling doPost() method");
		
		String username = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");
				
		//Create the instance of UserDao
		UserDAO userDAO = new UserDAO();
		
		//declare one requestdispacther
		RequestDispatcher dispatcher;
		
		//call validate method
		
		if(userDAO.isValidUser(username, password)){
			//Need to navigate/dispatch to Home page
			//To dispatch the request and response, we need RequestDispatcher which
			//is available on request object
			
			//create the object of requestdispatcher
			dispatcher = request.getRequestDispatcher("Home.jsp"); // Just created the instance
			dispatcher.forward(request, response); // forward the request and response to homepage		
		}
		
		else
		{
			// Need to navigate to Login page + Show error message 
			dispatcher = request.getRequestDispatcher("Login.jsp"); 
			
			//Should not write SOP("Invalid Credentials") as it will be printed on console 
			//And not on webpage
			//We have to get PrintWriter object from response object
			
			PrintWriter writer = response.getWriter();
			writer.println("<html><body><center><h3>Invalid Credentials. Please try again</h3></body></html>");
			
			dispatcher.include(request, response); // whatever is there in login page + error message,
													// thus include. If forward id given, then it 
													//will go directly to Login page without including 
													//the error message.
		}
	}
}


