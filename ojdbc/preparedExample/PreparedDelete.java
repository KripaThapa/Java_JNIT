package com.ojdbc.preparedExample;

import java.sql.*;

import com.ojdbc.databaseConnection.DatabaseConnection;

public class PreparedDelete {

	public static void main(String[] args)throws Exception {
		Connection conn = DatabaseConnection.dbConnect();
		
		PreparedStatement ps = conn.prepareStatement("delete from employee where id=?");
		ps.setInt(1, 1029);
		int deleteData = ps.executeUpdate();
		      
		if(deleteData!=0)
		    System.out.println("Succesfully deleted");
	}

}
