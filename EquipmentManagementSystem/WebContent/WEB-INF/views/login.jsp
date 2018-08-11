<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="loginAction" method="post">
Username : <input type="text" name="username" id="uname" /><br>
Password : <input type="password" name="password" id="pswd" /><br>
User Type : <input type="radio" name="user" id="regular"/>RegularUser<br>
<input type="radio" name="user" id="admin"/>Admin<br>
<input type="submit" name="submit" id="submit" value="login" />

</form>
</center>
</body>
</html>