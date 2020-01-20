<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Tabela </h2>
<table frame="border" border="border">
    <tr>
        <th>Номер</th>
        <th>  Имя </th>
        <th> Возраст </th>
        <th>action</th>
        <th>action</th>

    </tr>

<c:forEach var="list" items="${users}">
    <tr>
        <td>${list.id}</td>
        <td>${list.name}</td>
        <td>${list.age}</td>
        <td>
            <a href="/edit/${list.id}">edit</a>
        </td>
        <td>
            <a href="/delete/${list.id}">delete</a>
        </td>
    </tr>
</c:forEach>
</table>
<h2>Add</h2>
<c:url value="/add" var="add"/>
<%--<c:url value="/adr" var="adr"/>--%>
<a href="${add}">Add new klient</a>



</body>
</html>
