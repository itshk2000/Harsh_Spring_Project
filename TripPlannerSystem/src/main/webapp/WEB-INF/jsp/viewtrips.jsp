<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>

<style type="text/css">
h3 {
color:white;
font-family: arial, sans-serif;
font-size: 25px;
font-weight:bold;

margin-top: 20px;
margin-bottom: 20px;
text-align: left;


}
body{
background-color:#E6E6FA;
color:  #8B0000;

background-size:cover;
}
.button {
    display: block;
    width: 115px;
    height: 30px;
    background: #DDA0DD;
    padding: 0px;
    text-align: center;
    border-radius: 2px;
    color:black;
    font-weight: bold;
    line-height: 25px;
}
.edit{
    display: block;
    width: 60px;
    height: 30px;
    background: #E0FFFF ;
    padding: 0px;
    text-align: center;
    border-radius: 2px;
    color:green;
    font-weight: bold;
    line-height: 25px;
}

.delete{
    display: block;
    width: 70px;
    height: 30px;
    background:#E0FFFF ;
    padding: 0px;
    text-align: center;
    border-radius: 2px;
    color:red;
    font-weight: bold;
    line-height: 25px;
}
table{
background-color: #FFB6C1;
}

</style>
</head>

<body>

<h3>Your Plans</h3>
	<div align="center" class="container">
		<!--<h2 style="color: green">${msg}</h2>-->
		<table class="table table-hover">
			<thead class="thead-dark">
				<tr>
					<th>Trip ID</th>
					<th>From</th>
					<th>To</th>
					<th>Via</th>
					<th>Mode Of Travel</th>
					<th>Type</th>
					<th>Ticket</th>
					<th>No. of People</th>
					<th>Sponsored</th>
					<th>Date Of Travel</th>
					<th>Edit</th>
					<th>Delete</th>
					
				</tr>
				</thead>



				<c:forEach items="${trips}" var="b">
				<tbody>
					<tr>
						<td>${b.tripId}</td>
						<td>${b.from}</td>
						<td>${b.to}</td>
						<td>${b.via}</td>
						<td>${b.modeofTravel}</td>
						<td>${b.type}</td>
						<td><img alt="No Photo" width="100 height=300" src="data:image/jpg;base64,${b.ticketPic}"></img></td>
						<td>${b.noofPeople}</td>
						<td>${b.sponsored}</td>
						<td>${b.dateOftravel}</td>
						<td><a class="edit" href="updatetrips/${b.tripId}">Edit</a></td>
						<td><a class="delete" href="deletetrips/${b.tripId}">Delete</a></td>
					</tr>
					</tbody>
				</c:forEach>
		</table>
		<a class="button" href="/SecPage">Home Page</a>
	</div>
</body>
</html>