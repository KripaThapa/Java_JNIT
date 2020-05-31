<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<%@page import="java.sql.*"%>
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/office";
		String name="root";
		String password="band12.6";
		Connection con = DriverManager.getConnection(url, name, password);
		int id=(Integer)session.getAttribute("eid");
		String subject=request.getParameter("subject");
		String reason=request.getParameter("reason");
		String date=request.getParameter("ldate");
		String days=request.getParameter("days");
		PreparedStatement ps=con.prepareStatement("insert into application values(aid, ?, ?, ?, ?, status, ?)");
		ps.setString(1, subject);
		ps.setString(2, reason);
		ps.setString(3, date);
		ps.setString(4, days);
		ps.setInt(5, id);
		int x = ps.executeUpdate();
		if(x!=0){
			
			response.sendRedirect("./status.jsp");
		}
	%>
</body>
</html>