<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Book</title>
</head>

<link rel="stylesheet" type="text/css" href="index.css"/>


<body>
<%@ include file="header.html" %>  

<center>
	<form action="BookMain" method="get">
		Enter Borrow No. : <input type="number" name="borrow_no"><br><br>
		
		Enter Book Name : <input type="text" name="book_name"><br><br>
		
		Enter Book Author : <input type="text" name="book_author"><br><br>
		
		Enter Book Category : <input type="text" name="category"><br><br>
		
		
		
		<input type="submit" value="Add"><br><br>
		
		
	
	</form>


</center>


</body>
</html>