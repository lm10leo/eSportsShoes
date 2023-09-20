<%@ page language="java" contentType="text/html; charset=U	TF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Categories</title>
</head>
<body>
    <h1>Categories of Shoes</h1>

    <form method="POST" action="/categories/registercategory">
        <label for="cname">Category Name:</label>
        <input type="text" name="cname" id="cname">
        <button type="submit">Add</button>
    </form>
    
    <a href="/categories/allCategories">All Categories</a>


    <p>${msg}</p>

    <h2>Category List</h2>
    <ul>
        <c:forEach var="category" items="${categories}">
            <li>${category.name}</li>
        </c:forEach>
    </ul>
	
 
    
</body>
</html>
