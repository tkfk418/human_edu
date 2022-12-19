<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Room Info</title>
</head>
<body>
<table border=1 id=tblRoom>
<tr><th>객실번호</th><th>객실명</th><th>객실종류</th><th>숙박가능인원</th><th>1박요금</th></tr>
<c:forEach var="roominfo" items="${it}"> 
	<tr><td>${roominfo.num}</td><td>${roominfo.name}</td><td>${roominfo.type}</td><td>${roominfo.howmany}</td><td>${roominfo.howmuch}</td></tr>
</c:forEach>
</table>
<table>
<tr><td colspan=2>&nbsp;</td></tr>
<tr><td colspan=2>
	<form id=frmRoom action="/controlRoomInfo">
	<input type=hidden name=optype id=optype value='insert'>
	<table>
	<tr><td>객실번호</td><td><input type=text name=num id=num readonly></td></tr>
	<tr><td>객실명</td><td><input type=text name=name id=name  ></td></tr>
	<tr><td>객실타입</td><td><select id=type name=type >
	<c:forEach var="roomtype" items="${rt}"> 
	<option value="${roomtype.typenum}">${roomtype.typename}</option>
</c:forEach>
	</td></tr>
	<tr><td>숙박가능인원</td><td><input type=text name=howmany id=howmany ></td></tr>
	<tr><td>1박요금</td><td><input type=text name=howmuch id=howmuch ></td></tr>
	<tr><td colspan=2 align=center>
	<input type=button value='등록' id=btnAddNew>
	<input type=button value='삭제' id=btnDelete>
	<input type=button value='비우기' id=btnReset>
	</td></tr>
	</table>
	</form>
	</td></tr>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#tblRoom tr',function(){
	let num=$(this).find('td:eq(0)').text();
	let name=$(this).find('td:eq(1)').text();
	let type=$(this).find('td:eq(2)').text();
	let howmany=$(this).find('td:eq(3)').text();
	let howmuch=$(this).find('td:eq(4)').text();
	$('#num').val(num);
	$('#name').val(name);
	$('#type').val(type);
	$('#howmany').val(howmany);
	$('#howmuch').val(howmuch);
	$('#optype').val('update');
	return false;
})
.on('click','#btnDelete',function(){
	if($('#num').val()=='') return false;
	$('#optype').val('delete');
	$('#frmRoom').submit();
})
.on('click','#btnAddNew',function(){
	if($('#name').val()==''||$('#type').val()==''||$('#howmany').val()==''||$('#howmuch').val()=='') return false;
	$('#frmRoom').submit();
})
.on('click','#btnReset',function(){
	$('#num,#name,#type,#howmany,#howmuch').val('');
	$('#optype').val('insert');
	return false;
})
;
</script>
</html>