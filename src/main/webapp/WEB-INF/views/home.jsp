<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phamq
  Date: 4/24/2024
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HOME</title>
    <style>
        img {
            width: 200px;
            height: 120px;
        }
    </style>
</head>
<body>
<form action="" method="get">
    <input type="text" name="nameSearch" placeholder="Search...">
    <button>Search</button>
</form>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Quantity</td>
        <td>Image</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach items="${list}" var="item">
    <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.price}</td>
        <td>${item.quantity}</td>
        <td><img src="${item.image}"></td>
        <td><button>Sua</button></td>
        <td><button>Xoa</button></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
