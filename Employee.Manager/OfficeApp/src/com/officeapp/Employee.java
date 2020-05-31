package com.officeapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Employee extends HttpServlet {
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
			if(con!=null)
				System.out.println("Connected");
			else
				System.out.println("Not Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String fName=request.getParameter("fname");
		String lName=request.getParameter("lname");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String department=request.getParameter("department");
		try {
			ps=con.prepareStatement("insert into employee(firstName, lastName, username, password, email, phone, department) values(?, ?,?, ?, ?, ?, ?)");
			ps.setString(1, fName);
			ps.setString(2, lName);
			ps.setString(3, user);
			ps.setString(4, pass);
			ps.setString(5, email);
			ps.setString(6, phone);
			ps.setString(7, department);
			int x = ps.executeUpdate();
			if(x!=0) {
				response.sendRedirect("./employee_login.html?msq=Successful");
				System.out.println("Successfully register");
			}
			else {
				response.sendRedirect("./employee_register.html?msq=Error");
				System.out.println("Error register");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
