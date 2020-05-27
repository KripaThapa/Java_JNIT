
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Doctor</title>
</head>
<body bgcolor="#FFFDD0">
	<table align="center" width="300" height="100">
	<tr><td><a href="doctor_profile.jsp">Home Page</a></td>
		<td><a href="index.html">Logout</a></td>
	</tr>
	</table>
	<table  align="center" width="600" height="200" border="solid">
		<tr>
			<td>Doctor ID</td>
			<td>Username</td>
			<td>Email</td>
			<td>Phone Number</td>
			<td>Speciality</td>
		</tr>
		<%@page import="java.sql.*"%>
		<%
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/doctor";
			String name="root";
			String password="band12.6";
			Connection con = DriverManager.getConnection(url, name, password);
			Object ob =session.getAttribute("id");
			int id=(Integer)ob;
			
			PreparedStatement ps= con.prepareStatement("Select * from doctor where id=?");
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
		%>
		<tr>
			<td><%=rs.getInt("id") %></td>
			<td><%=rs.getString("username") %></td>
			<td><%=rs.getString("email") %></td>
			<td><%=rs.getInt("phone") %></td>
			<td><%=rs.getString("specialist") %>
		</tr>
		
		<% } %>
		</table>
		

</body>
</html>