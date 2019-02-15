<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
<title>Student reg form</title>

</head>
<body>
	<form:form action="processForm" modelAttribute="student">
firstName:<form:input path="firstname" />
		<br>
lastName:<form:input path="lastname" />
		<br>	
			country:<form:select path="country">
			<form:options items="${theCountryOptions}" />
		</form:select>
			<br>
			Favourite programming Language:<br><br>
		<form:radiobuttons path="favoritelanguage" items="${student.langOptions}" /><br>
		<%-- Java: <form:radiobutton path="favoritelanguage" value="java" />
		<br>
			PHP: <form:radiobutton path="favoritelanguage" value="php" />
		<br>
			C# : <form:radiobutton path="favoritelanguage" value="c#" />
		<br>
			javascript:<form:radiobutton path="favoritelanguage"
			value="javascript" />
		<br> --%>
	
		<br>
		Favorite Operating System:<br>
	<form:checkbox path="operatingSystem" value="Linux" />	Linux<br>
		<form:checkbox path="operatingSystem" value="Unix" />Unix<br>
	<form:checkbox path="operatingSystem" value="Windows" />Windows
		<br><input type="submit" value="add">
		
	</form:form>
</body>
</html>
