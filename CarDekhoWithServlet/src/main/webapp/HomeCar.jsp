<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

<style type="text/css">

		#main
        {
            margin-top: 100px;
            text-align: center;
            
        }
        
        .links
        {
            width: 100%;
            margin-top:20px;
            padding: 10px 15px;
            border: 1px solid black;
            height: 50px;
            font-size: 20px;
            font-weight: bold;
            text-align: center;
            background-image: linear-gradient(#219ebc, #003049); 
            
        }
            
        .links:hover
        {
            background-image: linear-gradient( #003049, #04052e );
        }
        a
        {
            position: relative;
            top: 10px;
            text-decoration: none;	
            color: white;
        }
        
        a:hover 
        {
            text-decoration: underline;
  
        }
	
</style>

</head>
<body>

	<div id="main">
		
			<div class="links">			
				<a href="AddCAr.jsp">Add</a>
			</div>
			<br>

			<div class="links">
				<a href="UpdateCar.jsp">Update</a>
			</div>
            
            <br>
			
		
			<div class="links">
				<a href="DeleteCar.jsp">Remove</a>
			</div>
		 
            <br>

			<div class="links">
				<a href="viewall">ViewAll</a>
			</div>
		
	</div>
		
	
</body>
</html>