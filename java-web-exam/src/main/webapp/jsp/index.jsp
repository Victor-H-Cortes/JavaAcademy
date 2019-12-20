<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<style>
.menu-grid {
	margin-top: 10px;
}
.menu-grid-element:hover {
	background-color: dodgerblue;
}
.menu-grid-element {
	color: white;
	background-color: blue;
	padding: 20px;
	margin: 0px;
	border: solid;
	border-color: black;
	border-radius: 5px;
	border-width: 1px;
	text-align: center;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<title>Java Web Exam</title>
</head>
<body class="container-fluid">
	<div class="container">
		<div class="row">
			<div id="headerList">
				<h1 align="center">Movie Madness</h1>
			</div>
			<div class="col-sm-1 col-md-1 col-lg-1 col-xl-1"></div>
			<div class="col-sm-10 col-md-10 col-lg-10 col-xl-10">
				<div class="row menu-grid">
					<a href="<c:url value="/movie/list"/>">
						<div class="col-sm-3 col-md-3 col-lg-3 col-xl-3 menu-grid-element">
							<p>Movies</p>
						</div>
					</a>
					<a href="<c:url value="/genre/list"/>">
						<div class="col-sm-3 col-md-3 col-lg-3 col-xl-3 menu-grid-element">
							<p>Genres</p>
						</div>
					</a>
					<a href="<c:url value="/director/list"/>">
						<div class="col-sm-3 col-md-3 col-lg-3 col-xl-3 menu-grid-element">
							<p>Directors</p>
						</div>
					</a>
					<a href="<c:url value="/nationality/list"/>">
						<div class="col-sm-3 col-md-3 col-lg-3 col-xl-3 menu-grid-element">
							<p>Nationalities</p>
						</div>
					</a>
				</div>
			</div>
			<div class="col-sm-1 col-md-1 col-lg-1 col-xl-1"></div>
		</div>
	</div>
</body>
</html>
