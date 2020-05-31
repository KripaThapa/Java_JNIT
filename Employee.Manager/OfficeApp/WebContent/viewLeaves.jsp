<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<body>
<br>
<h1 align="center">Application Details</h1>
<table  align="center" width="500">
		<tr><td><a href="manager_home.jsp">Home</a></td>
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
			<td>Employee Detail</td>
			<td>Status</td>
			<td>Click done(if accept)</td>
			
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
		<td><a href="show_employee.jsp?id=<%=x.getInt("eid")%>>">Details</a></td>
		<td>
			<% if(x.getString("status").equals("Accepted")){

			%>Accepted <% 
			
			}else{
			%> 
			<a href="accept.jsp?id=<%=x.getInt("aid") %>">Accept</a>
			<% } %>
			<% if(x.getString("status").equals("Rejected")){
			%>Rejected <% 
			}else{
			%> 
			<a href="accept.jsp?id=<%=x.getInt("aid") %>">Reject</a>
			<%} %>
		</td>
		<td><a href="done.jsp">Done</a></td>
		</tr>
	
	<% } %>
	</table>
</body>
</html>
</body>
</html>