<%--
  Created by IntelliJ IDEA.
  User: anhda
  Date: 3/10/2023
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h3>Result:</h3>
<c:choose>
    <c:when test="${param.operator == '+'}">
        <h4>${param.firstOperand} + ${param.secondOperand} = ${addition}</h4>
    </c:when>

    <c:when test="${param.operator == '-'}">
        <h4>${param.firstOperand} - ${param.secondOperand} = ${subtraction}</h4>
    </c:when>

    <c:when test="${param.operator == '*'}">
        <h4>${param.firstOperand} * ${param.secondOperand} = ${multiplication}</h4>
    </c:when>

    <c:when test="${param.operator == '/'}">
        <c:if test="${param.secondOperand == 0}">
            <h4>Can't divide by zero!</h4>
        </c:if>

        <c:if test="${param.secondOperand != 0}">
            <h4>${param.firstOperand} / ${param.secondOperand} = ${division}</h4>
        </c:if>
    </c:when>
</c:choose>
</body>
</html>
