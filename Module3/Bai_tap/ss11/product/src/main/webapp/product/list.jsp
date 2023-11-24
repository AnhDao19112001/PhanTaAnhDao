<%--
  Created by IntelliJ IDEA.
  User: anhda
  Date: 3/10/2023
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Products List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
<h3 class="text-center"><a href="/product">DANH SÁCH SẢN PHẨM</a></h3>

<p class="text-center my-3"><a href="/product?action=create">
    <button class="btn btn-info btn-sm">+ Thêm sản phẩm mới</button>
</a></p>

<form action="/product" class="text-center" method="get">
    <input type="text" name="nameSearch" placeholder="Nhập tên sản phẩm">
    <button type="submit" name="action" value="search" class="btn btn-secondary btn-sm">Tìm kiếm</button>
</form>

<table class="table table-striped ms-5" style="width: 94%" border="1">
    <tr>
        <th>Id</th>
        <th>Tên sản phẩm</th>
        <th>Giá</th>
        <th>Mô tả</th>
        <th>Nhà sản xuất</th>
    </tr>

    <c:forEach var="product" items="${productList}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.describe}</td>
            <td>${product.producer}</td>
            <td><a href="/product?action=edit&id=${product.id}">
                <button class="btn btn-primary btn-sm">Chỉnh sửa</button>
            </a></td>
            <td><a href="/product?action=delete&id=${product.id}">
                <button class="btn btn-danger btn-sm">Xóa</button>
            </a></td>
            <td><a href="/product?action=view&id=${product.id}">
                <button class="btn btn-success btn-sm">Thông tin</button>
            </a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
