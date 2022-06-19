<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.PrintWriter" %>
        <%@page import="java.io.PrintWriter" %>
    
        <%@page import="java.sql.DriverManager" %>
    
        <%@page import="java.sql.ResultSet" %>
    
        <%@page import="java.sql.Statement" %>
    
        <%@page import="java.sql.Connection" %>
    
        <%@page import="java.io.IOException" %>
            <%@page import="java.sql.ResultSetMetaData" %>
                <%@page import="java.io.PrintWriter" %>
                <%@page import="java.util.Map.Entry" %>
            
        
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Entries</title>
</head>
<link rel="stylesheet" type="text/css" href="showData.css"/>
<body>
<%@ include file="header.html" %>  
<form>
<table width="80%" border="2" align="center">
<tr align="center" border="2" bgcolor="#A0D2EB">
<th>Borrow No.</th>
<th>Book Name</th>
<th>Book Author</th>
<th>Category</th>
<th>Issue Date</th>
<th>Return Date</th></tr>
<%

try{
	Class.forName("oracle.jdbc.driver.OracleDriver"); 
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from library_book");
	ResultSetMetaData metaData=rs.getMetaData();
	while(rs.next()){
		%>
		<tr align="center" border="1">
		<%
		for(int i=1;i<=metaData.getColumnCount();i++){
			%>
			<td>
			<%= rs.getString(i) %>
			</td>
			<%
		}
		%>
		</tr>
		<%
		
	}
	
}
catch(Exception e){
	out.println("Error : "+e);
}

%>

</table>
</form>
</body>
</html>