<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Listing</title>
</head>
<body>
    
    <h1>Product Listing</h1>

    <c:forEach var="product" items="${products}">
    <div>
        <div>
            <img alt="${product.shoe}" src="${product.imageUrl}" width="300px" height="300px">
        </div>
        <div>
            ${product.shoe}<br>
            Price: ${product.price}<br>
            Category: ${product.category.cname} <!-- Display category name -->
            <form method="post" action="/user-selections/save">
                <input type="hidden" name="pid" value="${product.pid}">
                <input type="text" name="username" placeholder="Enter your username" required>
                <input type="submit" value="Buy">
                <c:if test="${not empty successMessage}">
                    <div style="color: green; font-weight: bold;">
                        Order has been placed successfully
                    </div>
                </c:if>
            </form>
        </div>
    </div>
    </c:forEach>

    <a href="/products/allproducts">All products</a>
</body>
</html>
