
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <title>List</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        .table tr:nth-child(even) {
            background-color: white;
        }

        .table tr:nth-child(odd) {
            background-color: #eee;
        }

        th {
            background-color: #718093;
            color: aliceblue
        }

        table, td, th {
            border: 1px solid green;
            width: auto;
            text-align: center;
        }

        h1 {
            text-align: center;
            margin-top: 20px
        }
    </style>
</head>
<body>
<div class="container">
    <h1>LIST</h1>
    <a flag="info"
       class="dt-button buttons-colvis btn btn-white btn-primary btn-bold" data-toggle="tooltip"
       title='Thêm' href="sieuThi?action=create">
            <span>
                <i class="fa fa-plus-circle bigger-110 purple">Thêm</i>
            </span>
    </a>

    <table class="table">
        <thead>
        <tr>
            <th>Mã thực phẩm</th>
            <th>Tên thực phẩm</th>
            <th>Ngày sản xuất</th>
            <th>Hạn sử dụng</th>
            <th>Loại thực phẩm</th>
            <th>Mô tả thêm</th>
            <th>Chức năng</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${sieuThiList}" var="sieuThi">
            <tr>
                <td>${sieuThi.id}</td>
                <td>${sieuThi.name}</td>
                <td>${sieuThi.NSX}</td>
                <td>${sieuThi.HSD}</td>
                <td>${sieuThi.loaiThucPham.name}</td>
                <td>${sieuThi.moTa}</td>
                <td>
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#modelId${sieuThi.id}">
                        <a flag="info"
                           class="dt-button buttons-colvis btn btn-white btn-primary btn-bold" data-toggle="tooltip"
                           title='Xoa' href='/sieuThi=action?id=${sieuThi.id}'>
            <span>
			    <i class="fa fa-trash-o bigger-110 pink"></i> xóa
            </span>
                        </a>
                    </button>

                    <!-- Modal -->
                    <div class="modal fade" id="modelId${sieuThi.id}" tabindex="-1" role="dialog" aria-labelledby="modelTitleId"
                         aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">Bạn có muốn xóa ${sieuThi.name}</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    <button type="button" class="btn btn-primary"><a href="/sieuThi=action?id=${sieuThi.id}">Save</a></button>
                                </div>
                            </div>
                        </div>
                    </div>



                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>