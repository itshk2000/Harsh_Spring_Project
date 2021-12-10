<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.Css{
    border-collapse: collapse;
    margin: 50px 450px;
    font-size: 1em;
    font-family: sans-serif;
   
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
    background-color: #FFFFE0 ;
    align-content: center;
    padding-top: 1px;
    padding-bottom:50px;
}
.button {
    display: block;
   width:200px;
    height: 30px;
    background:#FFFFE0;
    padding: 0px;
    text-align: center;
    border-radius: 10px;
    color:black;
    font-weight: bold;
    line-height: 25px;
}
body{
background-color : #0066CC;
	background-size: cover;
	background-repeat: no-repeat;
	min-height: 100%;
}
</style>
</head>
<body>

<div align="center"  class="Css">
		<h2>Search</h2>
		
	     <h3>${msg}</h3>
	     
		<form:form action="validate" modelAttribute="trips">
			<table>
				<tr>
					<td>From :</td>
					<td><form:input path="from" /></td>
				</tr>

				<tr>
					<td>To :</td>
					<td><form:input path="to" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="Search"></td>
					<td><input type="reset" value="Clear"></td>
				</tr>
			</table>
			
		</form:form>
	</div>
	<div align="center">
	<a href="gettripsform" class="button">Search by Trip ID</a>
	<br/>
	<br/>
	<a class="button" href="/SecPage">Home Page</a>
	</div>
</body>
</html>