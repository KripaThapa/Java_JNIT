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
			PreparedStatement ps= con.prepareStatement("update application set status='Accepted' where eid=?");
			ps.setInt(1, eid);
			int rs = ps.executeUpdate();
			if(rs!=0){
				response.sendRedirect("./details.jsp?msg=Accepted");
		%>
		
		<% } %>