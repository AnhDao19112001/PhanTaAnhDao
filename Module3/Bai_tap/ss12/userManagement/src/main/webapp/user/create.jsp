<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<h3>Thêm sản người dùng</h3>
<c:if test="${mess!=null}">
    <p style="color: green">${mess}</p>
</c:if>
<form method="post">
    <pre>Tên người dùng:    <input type="text" name="name"></pre>
    <pre>Email:             <input type="text" name="email"></pre>
    <pre>Quốc gia           <input type="text" name="country"></pre>
    <pre>                   <button style="background-color: #67dc6a">Lưu</button></pre>
</form>
<a href="/user">< Quay lại trang Danh sách người dùng</a>
</body>
</html>