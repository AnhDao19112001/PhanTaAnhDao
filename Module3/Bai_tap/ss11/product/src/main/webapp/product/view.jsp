<%--
  Created by IntelliJ IDEA.
  User: anhda
  Date: 3/10/2023
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
<form action="">
<h3><a href="/product">Thông tin sản phẩm</a></h3>
<pre>Id:            <span>${product.id}</span></pre>
<pre>Tên sản phẩm:  <span>${product.name}</span></pre>
<pre>Giá :          <span>${product.price}</span></pre>
<pre>Mô tả:         <span>${product.describe}</span></pre>
<pre>Nhà sản xuất:  <span>${product.producer}</span></pre>
<pre>               <button style="background-color: #f14040">Xóa sản phẩm</button></pre>

<a href="/product">< Quay lại trang Danh sách sản phẩm</a>
</form>
</body>
</html>