<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Login Page</h1>
<form action="login/validateUser" method="post">
    Username : <input type="text" name="user" required ><br><br>
    Password : <input type="password" name="pass" required><br><br>
    <input type="submit" value="Login">
</form>

</body>
</html>