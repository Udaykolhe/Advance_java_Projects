<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Student Form :--</h1>
 <form action="saveStudent" method="post">
   First Name : <input type="text" name="firstname" required><br><br>
   Last Name : <input type="text" name="lastname" required><br><br>
   Phone : <input type="text" name="phone" required><br><br>
   Email : <input type="text" name="email" required><br><br>
   <input type="submit" value="Submit">
 </form>
</body>
</html>