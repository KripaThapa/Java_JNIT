package com.ojdbc.preparedExample;

import java.sql.*;

import com.ojdbc.databaseConnection.DatabaseConnection;

public class PreparedUpdate {

	public static void main(String[] args) throws Exception {
		  Connection conn = DatabaseConnection.dbConnect();
	      PreparedStatement ps = conn.prepareStatement("update employee set salary=salary+? where id=?");
	      ps.setInt(1, 500);
	      ps.setInt(2, 1029);
	      int updateData = ps.executeUpdate();
	      
	      if(updateData!=0)
	          System.out.println("Succesfully updated");
	}


}
