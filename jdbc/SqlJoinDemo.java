package com.join;
import java.sql.*;

public class SqlJoinDemo {
	public static void main(String[] args)throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/students";
			String username = "root";
			String password = "band12.6";
			Connection con=DriverManager.getConnection(url, username, password);
			if(con != null)
			   System.out.println("Connected");
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(" select name, m.major, g.gender from student\r\n" + 
					"inner join majors m on student.majorID=m.majorID\r\n" + 
					"inner join genders g on student.genderID=g.genderID where major = 'CS'");
			System.out.println("Name       Major      Gender");
	       while(rs.next())
	       {
	    	   System.out.println(rs.getString(1)+ "      " + rs.getString(2)+ "         " + rs.getString(3));
	       }
	}
}	


