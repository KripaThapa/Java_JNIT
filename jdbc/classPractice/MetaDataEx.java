package com.join;

import java.sql.*;

public class MetaDataEx {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "band12.6";
		Connection con=DriverManager.getConnection(url, username, password);
		if(con != null)
		   System.out.println("Connected");
		
		PreparedStatement ps = con.prepareStatement("select * from employee");
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsm=ps.getMetaData();
		System.out.println("Total Column " + rsm.getColumnCount());
		System.out.println("FIrst Column name " + rsm.getColumnName(2));
		//two column
	}

}
