<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page2</title>
</head>
<body>
	<h2>Welcome</h2>
	<%
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	try {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sys";
		String username = "root";
		String password = "root";
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);
		stmt = con.createStatement();
		rs = stmt.executeQuery("SELECT * FROM Student");
	%>
	<table>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>marks1</th>
			<th>marks2</th>
		</tr>
		<%
		while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getInt(3)%></td>
			<td><%=rs.getInt(4)%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	} finally {
	rs.close();
	stmt.close();
	con.close();
	}
	%>

</body>
</html>