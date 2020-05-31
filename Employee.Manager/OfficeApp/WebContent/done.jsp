<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@page import="java.sql.*"%>
		<%
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/office";
			String name="root";
			String password="band12.6";
			Connection con = DriverManager.getConnection(url, name, password);
			int eid=(Integer)session.getAttribute("eid");
			PreparedStatement ps=con.prepareStatement("update employee left join application on employee.eid = application.eid set employee.tleave = (employee.tleave - application.noDays) where application.eid=?");
			ps.setInt(1, eid);
			int rs = ps.executeUpdate();
			
			if(rs!=0){
				response.sendRedirect("./details.jsp?msg=Accepted");
		%>
		
		<% } %>

		UPDATE Main 
LEFT JOIN Sub ON main.name = sub.name
SET main.quantity = (main.quantity - sub.quantity) 
WHERE main.name = pen;