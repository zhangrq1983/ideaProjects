<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="insertUser">insertUser</a>
	<table border="1" align="center">
    	<tr>
    	  <td>编号</td>
    	  <td>用户名</td>
    	  <td>密码</td>
    	  <td>可执行操作</td>
    	</tr>
    	<c:forEach var="user" items="${userList}">
    	  <tr>
    	  	<td>${user.id}</td>
    	  	<td>${user.user_Name}</td>
    	  	<td>${user.password}</td>
    	  	<td>
    	  	  <a href="deleteUser?id=${user.id}">删除</a>
    	  	  <a href="updateUser?id=${user.id}">修改</a>
    	  	</td>
    	  </tr>
    	</c:forEach>
    </table>

</body>
</html>
