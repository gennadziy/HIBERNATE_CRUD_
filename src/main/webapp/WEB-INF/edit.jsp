<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MEDION
  Date: 2020-01-20
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${empty user.name}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty user.name}">
    <c:url value="/" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty user.name}">
        <input type="hidden" name="id" value="${user.id}">
    </c:if>
    <label for="name">Имя</label>
    <input type="text" name="name" id="name" value="${user.name}">
    <label for="age">Возраст</label>
    <input type="text" name="age" id="age" value="${user.age}">

    <c:if  test="${empty user.name}">
        <input type="submit" value="Add new klient">
    </c:if>
    <c:if test="${!empty user.name}">
        <input type="submit" value="Edit ">
    </c:if>
</form>
</body>
</html>
