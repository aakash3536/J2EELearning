package com.practicej2ee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practicej2ee.dblookup.DBLookUp;

/**
 * Servlet implementation class LoginHandler
 */
/*@WebServlet("/LoginHandler")*/
public class LoginHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginHandler() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest  request, HttpServletResponse response) throws ServletException, IOException {
			String userName = request.getParameter("userName");
			String pwd = request.getParameter("pwd");
			
			System.out.println("UserName : " + userName + "  Password : " + pwd);
			
			response.getWriter().write("Hi " + userName + "  Welcome to the Learning Page ");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String pwd = request.getParameter("pwd");
		
		System.out.println("-- Inside the post method -- ");
		System.out.println("UserName : " + userName + "  Password : " + pwd);
		
		DBLookUp dbLookUp = new DBLookUp();
		Boolean validUser = dbLookUp.isValidUser(userName,pwd);
		
		if(validUser)
			response.getWriter().write("Hi " + userName + "  Welcome to the Learning Page ");
		
		else
			response.getWriter().write("Not Authorized");
		
		
	}

}
