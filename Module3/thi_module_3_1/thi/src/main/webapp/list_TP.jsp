<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h1> LIST </h1>
    <a flag="info"
       class="dt-button buttons-colvis btn btn-white btn-primary btn-bold" data-toggle="tooltip"
       title='Thêm' href="congViec=action?create">
<span>
<i class="fa fa-plus-circle bigger-110 purple">Thêm</i>
</span>
    </a>
    <table class="table">
        <thead>
        <tr>
            <th> Số thứ tự</th>
            <th>Tên công việc</th>
            <th> Ngày thực hiện</th>
            <th>Deadline</th>
            <th>Trạng thái</th>
            <th>Mô tả thêm</th>
            <th>Chức năng</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${congViecList}" var="congViec">
            <tr>
                <td>${congViec.id}</td>
                <td>${congViec.name} </td>
                <td>${congViec.NTH} </td>
                <td>${congViec.NKT} </td>
                <td>${congViec.trangThai.name} </td>
                <td>${congViec.moTa } </td>
                <td>
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary btn-lg" data-toggle="modal"
                            data-target="#modelId ${congViec.id} ">
                        <a flag="info"
                           class="dt-button buttons-colvis btn btn-white btn-primary btn-bold" data-toggle="tooltip"
                           title='Xoa' href='/congViec=action?id = ${congViec.id}'>
    <span>
    <i class="fa fa-trash-o bigger-110 pink"> </i> xóa
    </span>
                        </a>
                    </button>

                    < !--Modal-->
                    <div class="modal fade" id=" modelId ${ congViec.id } " tabindex="-1" role="dialog"
                         aria-labelledby="modelTitleId"
                         aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title"> Bạn có muốn xóa ${ congViec.name } </h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    <button type="button" class="btn btn-primary"><a
                                            href=" /sieuThi=action?id= ${congViec.id} "> Save </a></button>
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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous">
    debugger
</script>

</body>
</html>
