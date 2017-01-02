<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Website</title>
<link rel="stylesheet" href="Example1.css" type="text/css">
</head>
<body>

	<div id="page">
		<div id="logo">
			<h1><a href="/" id="logoLink">My First Website</a></h1>
			<h2>This is a line with h2 heading</h2>
			</div>
		<div id="nav">
			<ul>
				<li><a href="#/home.html">Home</a></li>
				<li><a href="#/about.html">About</a></li>
				<li><a href="#/contact.html">Contact</a></li>
			</ul>	
		</div>
		<hr>
		<!-- hr is used to separate content -->
		<div id="content">
			<h2>Home</h2>
			<p title = "This is the tooltip">
			<!-- title is for providing tooltip -->
			   <i> This is my first webpage. </i>	<br>
				<!-- br defines line break --> 
				I was able to code all the <b> HTML </b>  
				and <mark> CSS </mark> in order to make it. 
			</p>
			<p> 
				I can use my skills here to create websites for my business, 
				my friends and family, blog or articles. 
			</p>
		</div>
		<div>
		The chemical formula for water is H<sub>2</sub>O. 
		</div>
		<p>
			<pre>
			pre tag  helps      me to preserve my    whitespaces and
			
			 line breaks 
			</pre>
		</p>	
		
		<div id="footer">
			<p>
				Webpage made by <a href="/" target="_blank">[your name]</a>
		 	</p>
		</div>
	
</div>
</body>
</html>