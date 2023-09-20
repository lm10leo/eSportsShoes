<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
</head>
<body>
    <h1>Welcome Admin</h1>
        <a href="${pageContext.request.contextPath}/showUsers">Registerd users</a>
    

    

    <h2>Product Management</h2>
    <form method="post" action="${pageContext.request.contextPath}/products/addProduct">
        <label for="shoe">Product Name:</label>
        <input type="text" id="shoe" name="shoe" required><br><br>

        <label for="price">Price:</label>
        <input type="number" id="price" name="price" required><br><br>

        <label for="imageUrl">Image URL:</label>
        <input type="text" id="imageUrl" name="imageUrl"><br><br>

        <label for="category_cid">Category ID:</label>
        <input type="number" id="category_cid" name="category_cid" required><br><br> <!-- Add category_cid field -->

        <input type="submit" value="Add Product">
    </form>

    <h1>Product Listing</h1>
    
    <a href="${pageContext.request.contextPath}/products/allproducts">All products</a>

    <c:forEach var="product" items="${products}">
        <div>
            <div>
                <img alt="${product.shoe}" src="${product.imageUrl}" width="300px" height="300px">
            </div>
            <div>
                ${product.shoe}<br>
                Price: ${product.price}
                <form method="post" action="${pageContext.request.contextPath}/user-selections/save">
                    <input type="hidden" name="pid" value="${product.pid}">
                    <input type="text" name="username" placeholder="Enter your username" required>
                    <input type="submit" value="Buy">
                </form>
            </div>
        </div>
    </c:forEach>
    <a href="${pageContext.request.contextPath}/products/allproducts">All products</a>
</body>
</html>
