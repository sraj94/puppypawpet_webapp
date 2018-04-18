<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pets</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="http://localhost:8080/project1frontend/resources/css/table.css">
	<link rel="stylesheet" href="http://localhost:8080/project1frontend/resources/css/navbar.css">
	<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<!--Data Table  -->
	<link href="//cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" rel="stylesheet"> 
    <script src="//cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>


</head>
<body>
<nav class="navbar navbar-inverse" id="nav_bar">
		<div class="container-fluid">
		<button type="button" class="navbar-toggle collapsed" 
   data-toggle="collapse" data-target="#collapse-example" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
			<div class="navbar-header">
			<!-- mapping /resources/**  -> /resources/images/niit.jpg
			/WEB-INF/resources/images/niit.jpg
			url - http://localhost:8080/project1frontend/resources/images/niit.jpg
			 -->
				<a class="navbar-brand" href="">
		<img src='<c:url value="/resources/images/niit.jpg"></c:url>' alt="NIIT" height="30px" width="120px"></a>
			</div>
			<div class="collapse navbar-collapse" id="collapse-example">
			<ul class="nav navbar-nav" id="links">
				<li class="active"><a href='<c:url value="/home"></c:url>'>Home</a></li>
				<!-- value is for DispatcherServlet
				DispatcherServlet using the value it has to find the handler method which can handle the request
				http://localhost:8080/project1frontend/all/getproducts -> DispatcherServlet -> /all/getproducts
				-> ProductController.getAllProducts() -> Service -> Dao -> Select * from product 
				
				controller returns ModelAndView [model is List<Product>,view is productlist]
				/WEB-INF/views/productlist.jsp
				 -->
				<li><a href='<c:url value="/all/getproducts"></c:url>'>Browse All Products</a></li>
				<li><a href='<c:url value="/admin/getproductform"></c:url>'>Add Product</a></li>
				<li class="dropdown"><a href="" class="dropdown-toggle" data-toggle="dropdown">Select By Category
				 <b class="caret"> </b></a>
					<ul class="dropdown-menu">
						<li> <a href='<c:url value="/all/searchByCategory?searchCondition=Birds"> </c:url>'>Birds </a> </li>
						<li> <a href='<c:url value="/all/searchByCategory?searchCondition=Cats"> </c:url>'>Cats </a> </li>
						<li> <a href='<c:url value="/all/searchByCategory?searchCondition=Dogs"> </c:url>'>Dogs</a> </li>
						<li> <a href='<c:url value="/all/searchByCategory?searchCondition=Dogs"> </c:url>'>Fish</a> </li>
					</ul>
				</li>
				
				<li><a href='<c:url value="/all/registrationForm"> </c:url>'>Sign Up</a></li>
				<li><a href='<c:url value="/all/regForm"> </c:url>'>Sign In</a></li>
				<!-- 
				<li><a href="">sign in</a></li>
				<li><a href="">sign up</a></li>
				<li class="dropdown"><a href="" class="dropdown-toggle"
					data-toggle="dropdown">Select by Categories<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="">General</a></li>
						<li><a href="">Discount sale</a></li>
						<li><a href="">Special edition</a></li>
					</ul></li>
				 -->
			</ul>
			</div>
		</div>
	</nav>
</body>
</html>