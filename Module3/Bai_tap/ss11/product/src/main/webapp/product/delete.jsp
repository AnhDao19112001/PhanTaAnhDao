<%--
  Created by IntelliJ IDEA.
  User: anhda
  Date: 3/10/2023
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3><a href="/product">Xóa sản phẩm</a></h3>
<h4>Bạn có muốn xóa sản phẩm này?</h4>
<form method="post">
    <pre>Id:            <span>${product.getId()}</span></pre>
    <pre>Tên sản phẩm:  <span>${product.getName()}</span></pre>
    <pre>Giá :          <span>${product.getPrice()}</span></pre>
    <pre>Mô tả:         <span>${product.getDescribe()}</span></pre>
    <pre>Nhà sản xuất:  <span>${product.getProducer()}</span></pre>
    <pre>               <button style="background-color: #f14040">Xóa sản phẩm</button></pre>
</form>
<a href="/product">< Quay lại trang Danh sách sản phẩm</a>
</body>
</html>
