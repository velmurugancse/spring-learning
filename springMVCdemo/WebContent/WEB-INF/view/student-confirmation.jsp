<%@ taglib prefix="confirmform" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<title>Student confirmation form</title>
</head>
<body>
	The student name is ${student.firstname} ${student.lastname}
	<br> Student's country is ${student.country}
	<br>
	<%--  Student's favorite programming is ${student.favoritelanguage } --%>
	Student's favorite programming is ${student.favoritelanguage}<br> 
	Favorite Operating System:
	<ul>
		<confirmform:forEach var="temp" items="${student.operatingSystem }">
			<li>${temp}</li>
		</confirmform:forEach>
	</ul>
</body>
</html>