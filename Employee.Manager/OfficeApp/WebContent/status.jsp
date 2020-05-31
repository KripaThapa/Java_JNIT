<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<br>
<h1 align="center">Status</h1>
<table  align="center" width="500">
		<tr><td><a href="employee_home.jsp">Home</a></td>
			<td><a href="index.html">Logout</a></td>
		</tr>
</table>		
<br>
<br>
<br>

	<table align="center" width="700" height="100" border="solid">
		<tr>
			<td>Application ID</td>
			<td>Subject</td>
			<td>Reason</td>
			<td>Date</td>
			<td>No. of days</td>
			<td>Status</td>
		</tr>
		<%@page import="java.sql.*"%>
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/office";
		String name="root";
		String password="band12.6";
		Connection con = DriverManager.getConnection(url, name, password);
		int eid=(Integer)session.getAttribute("eid");
		PreparedStatement ps=con.prepareStatement("select * from application where eid=?");
		ps.setInt(1, eid);
		ResultSet x = ps.executeQuery();
		while(x.next()){
	%>
	
		<tr>
		<td><%=x.getInt("aid") %> </td>
		<td><%=x.getString("subject") %> </td>
		<td><%=x.getString("reason") %> </td>
		<td><%=x.getString("date") %> </td>
		<td><%=x.getInt("noDays") %> </td>
		<td><%=x.getString("status") %></td>
		</tr>
	
	<% } %>
	</table>
</body>
</html>