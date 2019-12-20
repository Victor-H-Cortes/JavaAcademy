<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 -->
 <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Genres</title>
</head>
<body>
	<div id="headerList">
		<h1 align="center">${ headerTitle }</h1>
	</div>
	<div style="margin-left: 5%; margin-top: 1%;">
		<form action="<c:url value="/genre/edit"/>" method="post">
			<table>
					<tr>
						<td align="right">Genre ID:</td>
						<td><input type="text" name="movieId"
							value="${ genre.genreId }"
							<c:if test="${ genre.genreId != null }">
							readonly
							</c:if>></input></td>
					</tr>
				<tr>
					<td align="right">Description:</td>
					<td><input type="text" name="description"
						value="${ genre.description }"></input></td>
				</tr>
			</table>
			<div style="margin-top: 1%;">
				<button name="${ frmLblSubmitBtn }" type="submit" value="">${ frmLblSubmitBtn }</button>
				<button name="cancel" type="submit" value="">Cancel</button>
				<c:if test="${ param.addNew == null }">
					<c:if test="${ param.Save == null }">
						<button id="deleteBtn" onclick="alertDelete(event)" name="delete"
							type="submit" value="">Delete</button>
					</c:if>
				</c:if>
			</div>
		</form>
	</div>
</body>
<script type="application/javascript">
function alertDelete(event) {
    if (confirm("Do you want to delete this entry?")) {
    } else {
    	event.preventDefault();
    }
}
</script>
</html>