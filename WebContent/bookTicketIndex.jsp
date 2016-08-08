<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
	<%@ taglib prefix="ex" uri="WEB-INF/custom.tld"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<h2>Enter Details </h2>
</head>
<body>
<form action="BookedMovieInfo" method="post">
		<table>
			<tr>
				<td class="f1_label">Customer Name:</td>
				<td><input type="text" name="cname"></td>
			</tr>
			<tr>
				<td class="f1_label">Customer Address :</td>
				<td><input type="text" name="caddr"></td>
			</tr>
			
			<tr>
				<td class="f1_label">Movie Show:</td>
				 <td><ex:movies/></td>
				
				
			</tr>
			<tr>
				<td class="f1_label">Date :</td>
				<td><input type="date" name="date"></td>
			</tr>
			<tr>
				<td class="f1_label">No of seats :</td>
				<td><input type="number" name="seat"></td>
			</tr>
		</table>
		<br>
		<!-- <A HREF ="link.html">New User </A> -->
		<br> <input type="submit" value="Book">

	</form>
</body>
</html>