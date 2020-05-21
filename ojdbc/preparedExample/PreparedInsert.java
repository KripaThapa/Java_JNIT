package com.ojdbc.preparedExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ojdbc.databaseConnection.DatabaseConnection;

public class PreparedInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Connection conn = DatabaseConnection.dbConnect();
		 PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?)");
	     ps.setInt(1, 1029);
	     ps.setString(2, "Kusum");
	     ps.setInt(3, 50000);
	     int insertData = ps.executeUpdate();
	      
	      if(insertData!=0)
	          System.out.println("Succesfully inserted");
		
	}
	

}
