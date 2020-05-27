
<!DOCTYPE html>
<html>
<head>
<title>Home Doctor</title>
</head>
<body bgcolor="#FFFDD0">
	<table align="center" width="300" height="100">
	<tr><td><a href="patient_profile.jsp">Home Page</a></td>
		<td><a href="index.html">Logout</a></td>
	</tr>
	</table>
	<table  align="center" width="600" height="200" border="solid">
		<tr>
			<td>Patient ID</td>
			<td>Username</td>
			<td>Email</td>
			<td>Phone Number</td>
		</tr>
		<%@page import="java.sql.*"%>
		<%
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/doctor";
			String name="root";
			String password="band12.6";
			Connection con = DriverManager.getConnection(url, name, password);
			
			Object o = session.getAttribute("pid");
			int pid=(Integer)o;
			PreparedStatement ps= con.prepareStatement("Select * from patient where pid=?");
			ps.setInt(1,pid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
		%>
		<tr>
			<td><%=rs.getInt("pid") %></td>
			<td><%=rs.getString("username") %></td>
			<td><%=rs.getString("email") %></td>
			<td><%=rs.getInt("phone") %></td>
		</tr>
		
		<% } %>
		</table>
		

</body>
</html>