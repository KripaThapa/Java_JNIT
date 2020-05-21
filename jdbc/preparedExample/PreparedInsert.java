package com.mySql.preparedExample;

import java.sql.*;

public class PreparedInsert {

	public static void main(String[] args) throws Exception {
		Connection conn = DbConnection.connectDb();
	    PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?)");
	      ps.setInt(1, 1029);
	      ps.setString(2, "Kusum");
	      ps.setString(3, "Finance");
	      ps.setInt(4, 50000);
	      int insertData = ps.executeUpdate();
	      
	      if(insertData!=0)
	          System.out.println("Succesfully inserted");
	}

}
