<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome to home page
<c:if test="${empty successMsg }">
<br>
<a href="login">login</a>
<br>
<a href="registration">register</a>
</c:if>
${successMsg }
${errorMSg }

<hr>
<c:if test="${showloginpage}">
<jsp:include page="login.jsp"></jsp:include>
</c:if>


<c:if test="${ not empty errorMsg }">
${errorMsg }
<jsp:include page="login.jsp"></jsp:include>
</c:if>

<c:if test="${showregistrationpage}">
<jsp:include page="registration.jsp"></jsp:include>
</c:if>


</body>
</html>
