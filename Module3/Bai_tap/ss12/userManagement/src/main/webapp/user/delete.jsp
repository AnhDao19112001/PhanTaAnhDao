<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<h3>Xóa người dùng</h3>
<h4>Bạn có muốn xóa người dùng này?</h4>

<form method="post">
    <pre>Id:                <span>${user.getId()}</span></pre>
    <pre>Tên người dùng:    <span>${user.getName()}</span></pre>
    <pre>Email:             <span>${user.getEmail()}</span></pre>
    <pre>Mô tả:             <span>${user.getCountry()}</span></pre>
    <pre>                   <button style="background-color: #f14040">Xóa người dùng</button></pre>
</form>

<a href="/user">< Quay lại trang Danh sách người dùng</a>
</body>
</html>