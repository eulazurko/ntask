<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file ="/WEB-INF/pages/includes.jsp"%>
<html>
<head>
    <title>Справочник групп</title>
</head>
<body>
<h1>Список групп</h1>
<table>
    <th>ID</th>
    <th>NAME</th>
    <c:forEach items="group0List" var="group0">
        <tr>
            <td>${group0.id}</td>
            <td>${group0.groupName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>