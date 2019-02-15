<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
<title>Customer-form registration</title>
<style>
.err {
	color: red;
}
</style>

</head>
<body>
	<i class="err">*</i> indicates required field
	<form:form action="processForm" modelAttribute="customer">
firstName<form:input path="firstName" />
		<br>
LastName<sup class="err">*</sup>:<form:input path="lastName" />
		<form:errors path="lastName" cssClass="err"></form:errors>
		<br>
Coupons<form:input path="coupons" />
		<form:errors path="coupons" class="err"></form:errors>
		<br>
Postal code:<form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="err"></form:errors>
		<br>
CourseCode:<form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="err"></form:errors><br>
		
		<input type="submit">
	</form:form>
</body>

</html>
