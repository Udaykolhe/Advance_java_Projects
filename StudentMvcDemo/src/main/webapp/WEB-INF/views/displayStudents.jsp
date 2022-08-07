<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1>All Student Details : --</h1>
	<table border="2" class="table table-success table-striped">

		<tr>
			<th scope="col">Id</th>
			<th scope="col">First Name</th>
			<th scope="col">Last Name</th>
			<th scope="col">Phone</th>
			<th scope="col">Email</th>
			<th scope="col">Action</th>
		</tr>

		<c:forEach var="stud" items="${slist }">


			<tr>
				<td>${stud.id }</td>
				<td>${stud.firstname }</td>
				<td>${stud.lastname }</td>
				<td>${stud.phone }</td>
				<td>${stud.email }</td>
				<td><a href="deleteStudent/${stud.id }">Delete</a>/
				<a href="editStudent/${stud.id }">Edit</a></td>
			</tr>

		</c:forEach>


	</table>
	<a href="addStudent">Add Student</a>

</body>
</html>