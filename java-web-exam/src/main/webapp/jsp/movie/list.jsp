<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 -->
 <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movies</title>
</head>
<body>	
	<div id="headerList">
		<h1 align="center">Movie List</h1>
	</div>
	<div style="margin-left:5%;margin-bottom: 1%;">
		<form action=<c:url value="/movie/edit"/> method="post">
			<button name="home" type="submit" >Home</button>
			<button name="addNew" type="submit" >Add New..</button>
		</form>
	</div>
	<div id="resultsSection">
	<table id="resultsTable">
		<tr>
			<th align="left">Movie ID</th>
			<th align="left">Title</th>
			<th align="left">Genre</th>
			<th align="left">Director</th>
			<th align="left">Rating</th>
		</tr>
		<c:forEach var="movie" items="${ movies }">
			<tr>
				<td><a href="<c:url value="/movie/edit?showDetail&id=${ movie.movieId }"/>">${ movie.movieId }</a></td>
				<td>${ movie.title}</td>
				<td>${ movie.genre.description }</td>
				<td>${ movie.director.name}</td>
				<td>${ movie.rating}</td>
			</tr>
		</c:forEach>		
	</table>
	</div>
</body>
</html>