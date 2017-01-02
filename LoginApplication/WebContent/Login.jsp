<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<style>
h3
{
color:white;
}
</style>
<body >
<img src="shreyas.jpg" style='position:fixed;top:0px;left:0px;width:100%;height:100%;z-index:-1;'><br> <br>
<br> <br>
<br> <br>

<!--    Create a form with 2 fields and 2 buttons -->

<form action="LoginServlet" method="post" > 

<center><h3> User Name : <input type="text" name ="username"></h3> <br> <br>
<center><h3>Password : <input type="password" name ="password"></h3> <br> <br>

<input type="submit" value = "Login"> 
<input type="reset">

</form>

</body>
</html>
