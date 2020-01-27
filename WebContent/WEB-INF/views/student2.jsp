<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC - Binding</title>
<base href="${pageContext.servletContext.contextPath}/">
</head>
<body>
	<h3>Sinh viên Poly</h3><hr>
	<form:form action="student/update.htm" modelAttribute="student">
		<table>
			<tr>
				<td>Họ và tên: </td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Điểm: </td>
				<td><form:input path="mark"/></td>
			</tr>
			<tr>
				<td>Chuyên ngành: </td>
				<td></td>
			</tr>
			<tr>
				<td><form:radiobuttons path="major" items="${majors}"/></td>
			</tr>
			<tr>
				<td></td>
				<td><button>Cập nhật</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>