package com.classExample;

import java.sql.*;
import java.util.Scanner;
public class ChoiceSql {

	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "band12.6";
		Connection con=DriverManager.getConnection(url, username, password);
		if(con != null)
		   System.out.println("Connected");
		PreparedStatement ps=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice(1.Insert 2.Display 3.Delete)");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			ps=con.prepareStatement("insert into employee values(?,?,?,?)");
		    ps.setInt(1, 2020);
		    ps.setString(2, "Achal");
		    ps.setString(3, "Finance");
		    ps.setInt(4, 50000);
		    int x=ps.executeUpdate();
		    if(x!=0)
		    	System.out.println("Record inserted");
		break;
		case 2:
			ps=con.prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)+
						" " + rs.getInt(4));
			}
			break;
		case 3:
			ps=con.prepareStatement("delete from employee where id=?");
			ps.setInt(1, 2012);
			int d=ps.executeUpdate();
			if(d!=0)
				System.out.println("Record Deleted");
			break;
		default:
				System.out.println("Wrong choice");
		}
	}
	
	
	

}
