<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<jsp:useBean id="tabulation" scope="request" class="com.example.webtabulation.Tabulation"></jsp:useBean>
<table>
    <thead>
    <tr>
        <th>X</th>
        <th>Y</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${tabulation.points}" var="p">
        <tr>
            <td><fmt:formatNumber value="${p.x}" pattern="#.###"/></td>
            <td><fmt:formatNumber value="${p.y}" pattern="#.###"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<h2>Other information:</h2>
<table>
    <thead>
    <tr>
        <th>Count of steps</th>
        <th>Min index</th>
        <th>Max index</th>
        <th>Sum</th>
        <th>Middle</th>
        <th>Minimal element</th>
        <th>Maximal element</th>
    </tr>

    </thead>
    <tbody>
    <td><fmt:formatNumber value="${tabulation.countOfSteps()}" pattern="#.###"/></td>
    <td><fmt:formatNumber value="${tabulation.minIndex(tabulation.points)}" pattern="#.###"/></td>
    <td><fmt:formatNumber value="${tabulation.maxIndex(tabulation.points)}" pattern="#.###"/></td>
    <td><fmt:formatNumber value="${tabulation.sum(tabulation.points)}" pattern="#.###"/></td>
    <td><fmt:formatNumber value="${tabulation.middleArithmetic(tabulation.points)}" pattern="#.###"/></td>
    <td><fmt:formatNumber value="${tabulation.minElem(tabulation.points)}" pattern="#.###"/></td>
    <td><fmt:formatNumber value="${tabulation.maxElem(tabulation.points)}" pattern="#.###"/></td>
    </tbody>

</table>
</body>
</html>
