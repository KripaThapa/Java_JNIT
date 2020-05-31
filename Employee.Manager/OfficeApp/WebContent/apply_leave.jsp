<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply</title>
</head>
<body>
<br>
<br>
<br>
	<h1 align="center">Application Form</h1>
	 <form action="applicationInsert.jsp" method="post">
	 	<table align="center" width="300" height="200">
	 		<tr><td>Subject</td></tr>
	 			<td><input type="text" name="subject"></td>
	 		</tr>
	 		<tr><td>Reason</td></tr>
	 			<td><input type="text" name="reason"></td>
	 		</tr>
	 		<tr><td>Date</td></tr>
	 			<td><input type="date" name="ldate"></td>
	 		</tr>
	 		<tr><td>No. of days</td></tr>
	 			<td><input type="text" name="days"></td>
	 		</tr>
	 		<tr><td><input type="submit" value="Submit"></td></tr>
	 	
	 	</table>
	 </form>
</body>
</html>