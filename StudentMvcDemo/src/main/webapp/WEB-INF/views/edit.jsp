<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Student Form : ---</h1>
		<form action="/StudentMvcDemo/student/updateStudent" method="post">
		    Student ID : <input type="number" name="id" value="${std.id }" readonly><br><br>
			First Name : <input type="text" name="firstname" value="${std.firstname }"><br><br>
			 Last Name : <input type="text" name="lastname" value="${std.lastname }"><br><br> 
			 Phone : <input type="text" name="phone" value="${std.phone }"><br><br>
			 Email : <input type="text" name="email" value="${std.email}" readonly><br><br>
			 <input type="submit" value="Update Student">
		</form>
</body>
</html>