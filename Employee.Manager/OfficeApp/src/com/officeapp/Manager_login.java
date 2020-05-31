package com.officeapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Employee_login
 */
@WebServlet("/manager_login")
public class Manager_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 Connection con= null;
		PreparedStatement ps=null;
		 public void init(ServletConfig config) {
	    	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	    	String url = "jdbc:mysql://localhost:3306/office";
			String username = "root";
			String password = "band12.6";
			try {
				con=DriverManager.getConnection(url, username, password);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    	
	    }    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass=request.getParameter("pass");
		try {
			ps=con.prepareStatement("select * from manager where username=? and password=?");
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				HttpSession hs=request.getSession();
				hs.setAttribute("mid", rs.getInt("mid"));
				response.sendRedirect("./manager_home.jsp");
				System.out.println("Login successfully");
			}
			else {
				response.sendRedirect("./manager_login.html");
				System.out.println("Error login");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
