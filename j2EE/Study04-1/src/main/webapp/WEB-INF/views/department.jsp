<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>department</title>
</head>
<body>
<table border=1>
<tr><th>부서번호</th><th>부서명</th><th>상위부서명</th><th>매니저이름</th></tr>
<c:forEach var="d" items="${dt}"> 
	<tr><td>${d.department_id}</td><td>${d.department_name}</td>
		<td>${d.parent_name}</td><td>${d.emp_name}</td></tr>
</c:forEach>
</table>
</body>
</html>