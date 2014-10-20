<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<head>
	<link rel="stylesheet" href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/smoothness/jquery-ui.css" />
	<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script>
	<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
	<script src="<c:url value="/resources/js/startpage.js" />"></script>
	<link href="<c:url value="/resources/css/startpage.css" />" rel="stylesheet">
</head>
</head>
<style>
.css_button {
	font-size: 27px;
	font-family: Arial;
	font-weight: normal;
	text-decoration: inherit;
	-webkit-border-radius: 8px 8px 8px 8px;
	-moz-border-radius: 8px 8px 8px 8px;
	border-radius: 8px 8px 8px 8px;
	border: 1px solid #d83526;
	padding: 9px 18px;
	text-shadow: 1px 1px 0px #b23e35;
	-webkit-box-shadow: inset 1px 1px 0px 0px #f29c93;
	-moz-box-shadow: inset 1px 1px 0px 0px #f29c93;
	box-shadow: inset 1px 1px 0px 0px #f29c93;
	cursor: pointer;
	color: #ffffff;
	display: inline-block;
	background: -webkit-linear-gradient(90deg, #ce0100 5%, #fe1a00 100%);
	background: -moz-linear-gradient(90deg, #ce0100 5%, #fe1a00 100%);
	background: -ms-linear-gradient(90deg, #ce0100 5%, #fe1a00 100%);
	background: linear-gradient(180deg, #fe1a00 5%, #ce0100 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#fe1a00",
		endColorstr="#ce0100");
}

.css_button:hover {
	background: -webkit-linear-gradient(90deg, #fe1a00 5%, #ce0100 100%);
	background: -moz-linear-gradient(90deg, #fe1a00 5%, #ce0100 100%);
	background: -ms-linear-gradient(90deg, #fe1a00 5%, #ce0100 100%);
	background: linear-gradient(180deg, #ce0100 5%, #fe1a00 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#ce0100",
		endColorstr="#fe1a00");
}

.css_button:active {
	position: relative;
	top: 1px;
}
</style>

<body>
	<a href="#">
		<button class="css_button">Student List</button>
	</a>
	<a href="/SpringMVC/student">
	<button class="css_button">Add Student</button>
	</a>
</body>
</html>