<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Car</title>

<style type="text/css">
	
	#main
	{
		height: 250px;
		width: 300px;
		color: white;
		background-color: #2a9d8f;
		border: 1px solid;
		border-radius: 10px;
		text-align: center;
		margin: 50px auto;
				
	}
	#text
	{
		margin-top: 30px;
		text-align: center;
	}
	
	.inp
	{
	    height: 25px;
	    width: 200px;
	    background-color:#2b2d42 ;
	    color: whitesmoke;
	    margin-top: 5px;
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
	
	#msg
	{
		 margin-top: 20px;
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
	
	a
	{
		text-decoration: none;
		color: #f1faee;
		font-weight: bold;
	}
	
	
	
	
</style>

</head>
<body>
	<div id="main">
		<form action="deletecar">
			<div id ="text">
				<h2>Remove Car</h2>
				<input class="inp" name="id" type="text" placeholder="Enter Id to delete car"> <br>
				
				<input type="submit" value="Delete" id="button">
				
				<div id="home">
					<a href="HomeCar.jsp">Home</a>
				</div>
			</div>
		</form>
		
		<% String msg =(String) request.getAttribute("msg");
			if(msg!=null) {%>
			
			<h3 id="msg"><%=msg %></h3>
		<%} %>
	</div>
</body>
</html>