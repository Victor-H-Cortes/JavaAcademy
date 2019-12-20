<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 -->
 <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nationalities</title>
</head>
<body>	
	<div id="headerList">
		<h1 align="center">Nationality List</h1>
	</div>
	<div style="margin-left:5%;margin-bottom: 1%;">
		<form action=<c:url value="/nationality/edit"/> method="post">
			<button name="home" type="submit" >Home</button>
			<button name="addNew" type="submit" >Add New..</button>
		</form>
	</div>
	<div id="resultsSection">
	<table id="resultsTable">
		<tr>
			<th align="left">Nationality ID</th>
			<th align="left">Description</th>
		</tr>
		<c:forEach var="nationality" items="${ nationalities }">
			<tr>
				<td><a href="<c:url value="/nationality/edit?showDetail&id=${ nationality.nationalityId }"/>">${ nationality.nationalityId }</a></td>
				<td>${ nationality.description }</td>
			</tr>
		</c:forEach>		
	</table>
	</div>
</body>
</html>