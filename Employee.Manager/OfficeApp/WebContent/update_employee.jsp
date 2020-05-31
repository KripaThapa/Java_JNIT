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
<%@page import="java.sql.*"%>
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/office";
		String name="root";
		String password="band12.6";
		Connection con = DriverManager.getConnection(url, name, password);
		
		int id = (Integer)session.getAttribute("eid");
		PreparedStatement ps=con.prepareStatement("select * from employee where eid=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
	%>
<h1 align="center">Update Profile</h1>
	<form action="./updateProfile.jsp">
		<table align="center" width="400" height="200">
			<tr>
				<td><input type="hidden" name="eid" value="<%=rs.getInt("eid")%>"></td>
			</tr>
			
			<tr>
			<td>First Name:</td>
			<td><input type="text" value="<%=rs.getString("firstName") %>"></td>
		    </tr>
		    
		    <tr>
			<td>Last Name:</td>
			<td><input type="text" value="<%=rs.getString("lastName") %>"></td>
		    </tr>
		    
		    <tr>
			<td>Username:</td>
			<td><input type="text" name="user" required></td>
		    </tr> 
		    
		    <tr>
			<td>Email:</td>
			<td><input type="text" name="email" required></td>
		    </tr> 
		    
		    <tr>
			<td>Phone:</td>
			<td><input type="text" name="phone" required></td>
		    </tr> 
		    
		    <tr>
			<td>Department:</td>
			<td><input type="text" value="<%=rs.getString("department") %>"></td>
		    </tr>
		    
		    <tr><td><input type="Submit" value="Update"></td></tr> 
		</table>
	
	</form>
	<% } %>

</body>
</html>