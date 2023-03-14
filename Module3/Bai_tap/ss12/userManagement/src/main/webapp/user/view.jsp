<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
<h3>Thông tin người dùng</h3>

<pre>Id:                <span>${user.getId()}</span></pre>
<pre>Tên người dùng:    <span>${user.getName()}</span></pre>
<pre>Email:             <span>${user.getEmail()}</span></pre>
<pre>Quốc gia:          <span>${user.getCountry()}</span></pre>

<a href="/user">< Quay lại trang Danh sách người dùng</a>
</form>
</body>
</html>