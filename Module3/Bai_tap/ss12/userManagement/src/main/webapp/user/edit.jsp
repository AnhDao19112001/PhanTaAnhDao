<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<h3>Chỉnh sửa thông tin người dùng</h3>
<c:if test="${mess!=null}">
    <p style="color: blue">${mess}</p>
</c:if>
<form method="post">
    <pre>Tên người dùng:    <input value="${user.getName()}" type="text" name="name"></pre>
    <pre>Email:             <input value="${user.getEmail()}" type="text" name="email"></pre>
    <pre>Quốc gia:          <input value="${user.getCountry()}" type="text" name="country"></pre>
    <pre>                   <button style="background-color: #5c9be3">Cập nhật</button></pre>
</form>
<a href="/user">< Quay lại trang Danh sách người dùng</a>
</body>
</html>