<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <style>
        .product_discount{
            width: 350px;
            height: 370px;
            border: 1px solid;
        }
        .product_discount textarea, .product_discount input{
            margin: 5px;
            padding: 5px;
        }
    </style>
</head>
<body>
<div class="product_discount">
    <h1>Product Discount Calculator</h1>
    <form method="post" action="/discount">
        <textarea name="description" cols="30" rows="10" placeholder="description"></textarea>
        <input type="text" name="price" placeholder="price"/>
        <input type="text" name="discount" placeholder="discount"/>
        <input type="submit" name="calculate" value="Calculate Discount/">
    </form>
</div>
</body>
</html>