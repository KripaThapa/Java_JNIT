package com.mySql.preparedExample;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static Connection con = null;
	public static Connection connectDb(){
	try {
		if(con==null)
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "band12.6";
		con=DriverManager.getConnection(url, username, password);
		if(con != null)
		   System.out.println("Connected");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
}
}
