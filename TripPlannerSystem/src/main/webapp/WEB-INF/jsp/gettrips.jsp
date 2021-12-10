<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
body{
background-color: #3399CC;
background-size: cover;
	background-repeat: no-repeat;
	min-height: 100%;
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
</style>
</head>
<body>

<div class="Css" align="center">
	<h2>Search</h2>
	<h3>${msg}</h3>
	<form action="getbyid" method="post">
		Trip ID : <input type="text" name="tripId">
		<br>
		<br>
		<input type="submit" value="Search">
	</form>
	
</div>
<br>
	<br>
	<div align="center">
	<a class="button" href="/SecPage">Home Page</a>
	</div>
</body>
</html>