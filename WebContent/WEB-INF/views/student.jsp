<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="student/update.htm" method="post">
		<table border="1">
			<tr>
				<td>Họ và tên: </td>
				<td><input name="name" value="${student.name}"></td>
			</tr>
			<tr>
				<td>Điểm: </td>
				<td><input name="mark" value="${student.mark}"></td>
			</tr>
			<tr>
				<td>Chuyên ngành: </td>
				<td></td>
			</tr>
			<tr>
				<td><input name="major" value="APP" type="radio" ${student.major == 'APP'?'checked':''}>Ứng dụng phần mềm</td>
				<td><input name="major" value="WEB" type="radio" ${student.major == 'WEB'?'checked':''}>Thiết kế web</td>
			</tr>
		</table>
	</form>
</body>
</html>