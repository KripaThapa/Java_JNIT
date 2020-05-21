package com.mySql.preparedExample;

import java.sql.*;

public class PreparedUpdate {

	public static void main(String[] args) throws Exception {
		 Connection conn = DbConnection.connectDb();
	     PreparedStatement ps = conn.prepareStatement("update employee set department=? where id=?");
	     ps.setString(1, "Designer");
	     ps.setInt(2, 1029);
	     int updateData = ps.executeUpdate();
	      
	      if(updateData!=0)
	          System.out.println("Succesfully updated");
	}

}
