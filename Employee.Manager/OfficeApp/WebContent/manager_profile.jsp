<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
	<br>
	<br>
	<br>
	<br><br>
	<table  align="center" width="600">
		<tr><td><a href="manager_home.jsp">Home</a></td>
			<td><a href="index.html">Logout</a></td>
		</tr>
	</table>
	<br><br>
	<br>
	<br>
	<br><br>
	<table align="center" width="800" height="100" border="solid">
		<tr>
		<td>Username</td>
		<td>Email</td>
		<td>Phone</td>
		</tr>
	
	<%@page import="java.sql.*"%>
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/office";
		String name="root";
		String password="band12.6";
		Connection con = DriverManager.getConnection(url, name, password);
		
		int id = (Integer)session.getAttribute("mid");
		PreparedStatement ps=con.prepareStatement("select * from manager where mid=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
	%>
		<tr>
			<td><%=rs.getString("username") %></td>
			<td><%=rs.getString("email") %></td>
			<td><%=rs.getString("phone") %></td>
		</tr>
	
	<% } %>
	</table>
</body>
</html>