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
<div class="px-5">
    <h3>DANH SÁCH NGƯỜI DÙNG</h3>

    <form action="/user" class="my-3">
        <input type="text" name="countrySearch" placeholder="Nhập tên quốc gia">
        <button type="submit" name="action" value="search" class="btn btn-secondary btn-sm">Tìm kiếm</button>
    </form>

    <a href="/user?action=create">
        <button class="btn btn-info btn-sm">+ Thêm mới người dùng</button>
    </a></p>

    <p class="my-2"><a href="/user?action=sort">
        <button class="btn btn-sm btn-warning btn-sm">Sắp xếp theo tên</button>
    </a></p>

    <table class="table table-striped" border="1">
        <tr class="text-center">
            <th>Id</th>
            <th>Tên người dùng</th>
            <th>Email</th>
            <th>Quốc gia</th>
            <th></th>
            <th></th>
            <th></th>
        </tr>

        <c:forEach var="user" items="${users}">
            <tr>
                <td class="text-center">${user.getId()}</td>
                <td>${user.getName()}</td>
                <td>${user.getEmail()}</td>
                <td>${user.getCountry()}</td>
                <td class="text-center"><a href="/user?action=edit&id=${user.getId()}">
                    <button class="btn btn-primary btn-sm">Chỉnh sửa</button>
                </a></td>
                <td class="text-center"><a href="/user?action=delete&id=${user.getId()}">
                    <button class="btn btn-danger btn-sm">Xóa</button>
                </a></td>
                <td class="text-center"><a href="/user?action=view&id=${user.getId()}">
                    <button class="btn btn-success btn-sm">Thông tin</button>
                </a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>