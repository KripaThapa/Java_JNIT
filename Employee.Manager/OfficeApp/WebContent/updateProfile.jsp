<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Update Profile</title>
</head>
<body>
	<%@page import="java.sql.*"%>
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/office";
		String name="root";
		String password="band12.6";
		Connection con = DriverManager.getConnection(url, name, password);
		String user= request.getParameter("user");
		String email= request.getParameter("email");
		String phone= request.getParameter("phone");
		int id = (Integer)session.getAttribute("eid");
		
		PreparedStatement ps=con.prepareStatement("update employee set username=?, email=?, phone=? where eid=?");
		ps.setString(1, user);
		ps.setString(2, email);
		ps.setString(3, phone);
		ps.setInt(4, id);
		int x = ps.executeUpdate();
		if(x!=0){
			response.sendRedirect("./employee_profile.jsp");
			System.out.println("Succesfully updated");
		}
		else
		{
			System.out.println("Error updated");
		}
	%>
</body>
</html>