

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>

<style type="text/css">
.Css{
    border-collapse: collapse;
    margin: 50px 450px;
    font-size: 1em;
    font-family: sans-serif;
   
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
    background-color: #90DDF2;
    align-content: center;
    padding-top: 1px;
    padding-bottom:50px;
}
body{
background-color: #3300CC;
background-size: cover;
	background-repeat: no-repeat;
	min-height: 100%;
	color:#2234AA;
}
</style>
</head>
<body >
	<div align="center" class="Css">

		<h1 style="color: #2874A6">${msg}</h1>
		<form:form action="regplan" modelAttribute="cplanner"
			enctype="multipart/form-data">
			
					<h3>Sign up</h3>
				
			<table class="styled-table">
				
				<tr>
					<td>Enter Name :</td>
					<td><form:input path="planName" /></td>
				</tr>
				<tr>
					<td>Enter Password :</td>
					<td><form:input path="password" type="password"/></td>
				</tr>
				<tr>
					

					<td><input type="reset" value="Clear"></td>
					<td align="right"><input type="submit" value="submit"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>


