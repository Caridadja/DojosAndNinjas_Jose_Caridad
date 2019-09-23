<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body>
<h1>New Ninja</h1>
<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
<form:select path="dojo">
<c:forEach items="${dojos}" var="dojo">
<option value="${dojo.id}"><c:out value="${dojo.name}"/></option>
</c:forEach>
</form:select>
<form:input type="text" path="firstName"/>
<form:input type="text" path="lastName"/>
<form:input type="number" path="age"/>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>