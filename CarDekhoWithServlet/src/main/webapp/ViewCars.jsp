<%@page import="com.mindscript.cardekhowithservlet.JDBC.CarsJDBC"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View all</title>

<style>

	#main
	{
		width: 400px;
		height: 350px;
		color: white;
		border: 1px solid;
		border-radius: 10px;
		margin: 50px auto;
		background-color: #2a9d8f;
		text-align: center;	
	}
	
	
	#button
	{
	    height: 30px;
	    width: 75px;
	    background-image: linear-gradient(#5c3d99, #2b2d42);
	    color: #f1faee;
	    font-weight: bold;
	    margin-top: 15px;
	    margin-left: 10px;
	    float: left;
	    
	}
		
	#home
	{
		float: right;
		margin-right: 15px;
		margin-top: 15px;
		border: 2px solid black;
		width:70px;
		height: 25px;
		background-image: linear-gradient(#a2d2ff, #264653);
	}
	
	table
	{
		text-align: center;
		width: 350px;
		height: 200px;
		border: 5px solid black;
		
	}
	
	th
	{
		height: 50px;
		font-size: 20px;
		background-color: #1b263b;
		
	}
	
	td
	{
		 text-align: left;
	}
	
	tr:hover
	{
		background-color: #003049;
	}
	
	a
	{
		text-decoration: none;
		color: #f1faee;
		font-weight: bold;
	}
	
	
	
</style>

</head>
<body>
	
	<% 
	List<CarsJDBC> cars = (List<CarsJDBC>)request.getAttribute("cars");
	if(cars!=null && cars.size()>0) 
	{ %>
		<div id="main">
			<h1>Car Details</h1>
			<table align="center" border= 1px solid >
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Brand</th>
					<th>Price</th>
				</tr>
				
				<%for(CarsJDBC carsJDBC: cars ) {%>
				<tr>
					<td><%=carsJDBC.getId() %></td>
					<td><%=carsJDBC.getName() %></td>
					<td><%=carsJDBC.getBrand() %></td>
					<td><%=carsJDBC.getPrice() %></td>
				</tr>
				<%} %>
			</table>
			
			<div id="home">
					<a href="HomeCar.jsp">Home</a>
			</div>
			
		</div>
		
	<%} else { %>
		<div id="else">
			<h1>Car details Unavailable!!!!!</h1>
			<form action="HomeCar.jsp"><button type="submit">Home</button></form>
			
		</div>
	
	
	
	<%} %>
	
	
</body>
</html>