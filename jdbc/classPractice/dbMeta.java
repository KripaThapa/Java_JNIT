package com.join;

import java.sql.*;

public class dbMeta {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "band12.6";
		Connection con=DriverManager.getConnection(url, username, password);
		if(con != null)
		   System.out.println("Connected");
		
		DatabaseMetaData dmd=con.getMetaData();
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getUserName());
		System.out.println(dmd.getDriverVersion());
		//two column
	}

}
