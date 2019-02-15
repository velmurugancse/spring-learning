<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer-confirmation</title>
</head>
<body>
	customer name is: ${customer.firstName}${customer.lastName} <br>
	coupons availability : ${customer.coupons}  <br>
	postal code:${customer.postalCode}
	courseCode:${customer.courseCode}
</body>
</html>