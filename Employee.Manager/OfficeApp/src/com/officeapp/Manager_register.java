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

@WebServlet("/managerRegister")
public class Manager_register extends HttpServlet {
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
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		try {
			ps=con.prepareStatement("insert into manager(username, password, email, phone) values(?,?,?,?)");
			ps.setString(1, user);
			ps.setString(2, pass);
			ps.setString(3, email);
			ps.setString(4, phone);
			int x = ps.executeUpdate();
			if(x!=0) {
				response.sendRedirect("./manager_login.html?msq=Successful");
				System.out.println("Successfully register");
			}
			else {
				response.sendRedirect("./manager_register.html?msq=Error");
				System.out.println("Error register");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
