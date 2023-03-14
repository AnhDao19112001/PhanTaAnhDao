<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3><a href="/product">Chỉnh sửa sản phẩm</a></h3>
<c:if test="${mess!=null}">
    <p style="color: blue">${mess}</p>
</c:if>
<form method="post">
    <pre>Tên sản phẩm:  <input value="${product.getName()}" type="text" name="name"></pre>
    <pre>Giá :          <input value="${product.getPrice()}" type="text" name="price"></pre>
    <pre>Mô tả:         <input value="${product.getDescribe()}" type="text" name="describe"></pre>
    <pre>Nhà sản xuất:  <input value="${product.getProducer()}" type="text" name="producer"></pre>
    <pre>               <button style="background-color: #5c9be3">Cập nhật</button></pre>
</form>
<a href="/product">< Quay lại trang Danh sách sản phẩm</a>
</body>
</html>
