

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>index Page</title>

</head>

<style>
body{
background-color: #000066;
background-size: cover;
	background-repeat: no-repeat;
	min-height: 100%;
	color:#2234AA;
}
.Css{
    border-collapse: collapse;
    margin: 160px 450px;
    font-size: 1em;
    font-family: sans-serif;
   width:300px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
    background-color: #90DDF2 ;
    align-content: center;
    padding-top: 10px;
    padding-bottom:10px;
    border-radius: 20px;
    
   
}
.button {
    display: block;
   width:200px;
    height: 30px;
    background:#C71585;
    padding: 0px;
    text-align: center;
    border-radius: 10px;
    color:white;
    font-weight: bold;
    line-height: 25px;
}


h1 {
	color: black;
	font-family: inherit;
	font-stretch: wider;
	font-weight: bold;
}

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

::selection {
	color: #000;
	background: #fff;
}

nav {
	position: absolute;
	background: #21abcd;
	width: 100%;
	padding: 30px 0;
	z-index: 12;
}

nav .menu {
	max-width: 1250px;
	margin: auto;
	display: flex;
	align-items: center;
	justify-content: space-between;
	padding: 0 20px;
}

.menu .logo a {
	text-decoration: none;
	color: #fff;
	font-size: 35px;
	font-weight: 600;
}
 td {
                width:150px;
                text-align:center;
              
                padding:10px
              
            }
</style>
<body>
<nav>
	<div class="menu">
		<div class="logo">
			<h1>
				Trip Planner
				</h1>
		</div>
		</div>
		</nav>
<div align="center"><h1 align="center">Trip Planner</h1></div>
	<div align="center" class=Css>
		<h3 style="color: #297B26">Sign In</h3>
		<br/>
		<h2>${msg}</h2>
		<form:form action="validatePlan" modelAttribute="cplanner"
			enctype="multipart/form-data">
			<table >
				
				<tr>
					<td>Name </td>
					<td><form:input path="PlanName" /></td>
				</tr>
				<tr>
					<td>Password </td>
					<td><form:input path="password" type="password"/></td>
				</tr>
				
				<tr>
				
					<td ><input type="reset" value="Clear"></td>
					<td align="right"><input type="submit" value="Login"></td>
				</tr>

			</table>
			<br/>
			<div align="left">
				<p>&nbsp New User? <a href="/addplan" style="color: red">Sign Up</a></p>
			</div>
		</form:form>
	</div>

</body>


</html>
