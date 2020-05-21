package com.join;

import java.sql.*;
import java.util.Scanner;

public class TaskChoices {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "band12.6";
		Connection con=DriverManager.getConnection(url, username, password);
		if(con != null)
		   System.out.println("database connected");
		PreparedStatement ps=null;
		String value = "y";
		Scanner sc=new Scanner(System.in);
		do {
		    System.out.println("Enter the choice(1.Insert 2.Display 3.Delete 4.Update)");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the choice Insert(1.All columns 2.particular column(id, salary))");
				int insertChoice=sc.nextInt();
				switch(insertChoice) {
				case 1:
			    	ps = con.prepareStatement("insert into employee values(?, ?, ?, ?) ");
			    	System.out.println("Enter id: ");
			    	int id = sc.nextInt();
			    	ps.setInt(1, id);
			    	System.out.println("Enter name: ");
			    	String name = sc.next();
			    	ps.setString(2, name);
			    	System.out.println("Enter department: ");
			    	String department=sc.next();
			    	ps.setString(3, department);
			    	System.out.println("Enter salary: ");
			    	int salary=sc.nextInt();
			    	ps.setInt(4, salary);
			    	int x=ps.executeUpdate();
			    	if(x!=0)
			    	{
			    		System.out.println("Record Inserted");
			    	}
			     break;
			     case 2:
			    	ps = con.prepareStatement("insert into employee(id,salary) values(?, ?) ");
			    	System.out.println("Enter id: ");
			    	int emp_id = sc.nextInt();
			    	ps.setInt(1, emp_id);
			    	System.out.println("Enter salary: ");
			    	int emp_salary=sc.nextInt();
			    	ps.setInt(2, emp_salary);
			    	int y=ps.executeUpdate();
			    	if(y!=0)
			    	{
			    		System.out.println("Record Inserted");
			    	}
			    break;
			    default:
			    	System.out.println("Wrong Choice");
			    break;
				}
			break;
			case 2:
				System.out.println("Enter the choice display(1.All rows & all columns 2.particular row(id search))");
				int searchChoice=sc.nextInt();
				switch(searchChoice) {
				case 1: 
					ps = con.prepareStatement("select * from employee");
					ResultSet rs = ps.executeQuery();
					while(rs.next())
					{
						System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " "+ rs.getString(3)+ " "+rs.getInt(4));
					}
					break;
				case 2:
					System.out.println("Which record you want to display(id)");
					ps = con.prepareStatement("select id from employee");
					ResultSet s = ps.executeQuery();
					while(s.next()) {
						System.out.print(s.getInt(1)+ " ");
						
					}
					System.out.println();
					ps = con.prepareStatement("select * from employee where id=?");
					System.out.println("Enter id:");
					int search_id = sc.nextInt();
					ps.setInt(1, search_id);
					ResultSet search = ps.executeQuery();
					while(search.next()) {
						System.out.println(search.getInt(1) + " " + search.getString(2)+ " " + search.getString(3) + " " + search.getInt(4) );
					}
				    break;
				 default:
					 System.out.println("Wrong choice");
				 break;
				}
			break;
			case 3:
				System.out.println("Enter the choice delete(1.all rows 2.Particular row)");
				int del = sc.nextInt();
				switch(del) {
				case 1:
					ps = con.prepareStatement("delete from employee");
					int delete = ps.executeUpdate();
					if(del!=0)
					{
						System.out.println("Record Deleted");
					}
				break;
				case 2:
					System.out.println("Which record you want to delete(id)");
					ps = con.prepareStatement("select id from employee");
					ResultSet s = ps.executeQuery();
					while(s.next()) {
						System.out.print(s.getInt(1)+ " ");
					}
					System.out.println();
					System.out.println("Which record you want to delete:");
					ps=con.prepareStatement("delete from employee where id=?");
					int delete_id = sc.nextInt();
					ps.setInt(1, delete_id);
					int del_x = ps.executeUpdate();
					if(del_x!=0)
						System.out.println("Record deleted");
			   break;
			   default:
				System.out.println("Wrong Choice");
			   break;
				}
			break;
			case 4:
				System.out.println("Enter the choice Update(1.Name 2.Salary)");
				int update = sc.nextInt();
				switch(update) {
				case 1: 
					ps = con.prepareStatement("update employee set name = ? where id = ? ");
					System.out.println("Enter the name:");
					String name = sc.next();
					ps.setString(1, name);
					System.out.println("Enter the id:");
					int id = sc.nextInt();
					ps.setInt(2, id);
					int u = ps.executeUpdate();
					if(u!=0)
						System.out.println("Record Updated");
				break;
			    case 2:
				   ps = con.prepareStatement("update employee set salary = ? where id = ? ");
					System.out.println("Enter the salary:");
					int sal = sc.nextInt();
					ps.setInt(1, sal);
					System.out.println("Enter the id:");
					int emp_id = sc.nextInt();
					ps.setInt(2, emp_id);
					int up = ps.executeUpdate();
					if(up!=0)
						System.out.println("Record Updated");
			   break;
			   default:
				  System.out.println("Wrong choice");
			   break;
		      } 
		  break;
		  default:
			 System.out.println("Wrong choice");
		  break;
		}
		System.out.println("Do you want to continue(y/n): " );
		value = sc.next();
		}
		while(value.equals("y"));
		
	}

}
