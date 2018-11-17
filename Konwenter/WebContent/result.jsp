<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=UTF-8">
<title>Konwenter Temperatury</title>
</head>
<body>
<c:if test="${not empty result}">
    <h1><i>Temperatura w stopniach Fahrenheita wynosi:  <font color="red"> ${result}</font> </i></h1>
</c:if>
</body>
</html>




