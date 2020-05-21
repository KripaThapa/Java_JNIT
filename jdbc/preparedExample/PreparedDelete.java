package com.mySql.preparedExample;

import java.sql.*;
public class PreparedDelete {
	public static void main(String[] args) throws Exception {
		Connection conn = DbConnection.connectDb();
		PreparedStatement ps = conn.prepareStatement("delete from employee where id=?");
		ps.setInt(1, 1029);
		int deleteData = ps.executeUpdate();
		      
		if(deleteData!=0)
		    System.out.println("Succesfully deleted");
	}
}


