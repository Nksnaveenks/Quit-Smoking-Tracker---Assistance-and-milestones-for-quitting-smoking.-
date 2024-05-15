<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-image: url('im.jpg');
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: cover;
   background-size: 100% 100%;
    margin: 0;
    padding: 0;
  }
  .container {
    max-width: 600px;
    margin: 20px auto;
    padding: 20px;
    background-color: skyblue;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  }
  h2 {
    text-align: center;
    color: #333;
  }
  
  input[type="text"],
  input[type="number"],
  textarea,
  select {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
  }
  input[type="radio"] {
    margin-right: 5px;
  }
  input[type="submit"],
  input[type="reset"] {
    background-color: #333;
    color: #fff;
    border: none;
    padding: 10px 20px;
    border-radius: 4px;
    cursor: pointer;
    margin-top: 10px;
  }
  input[type="submit"]:hover,
  input[type="reset"]:hover {
    background-color: #555;
  }
</style>
</head>
<body>
<div class="container">
<img src="display.jpg" width="100%" height="250px">
 <h2>Smoking Tracker Form</h2>
 <h2>Display Smokers Data</h2>
<form action="./personDisplayServlet" method="post">  
Person_id:<input type="text" name="id"/><br/>  
<input type="submit" value="Display"/> 
<input type="reset" value="Reset"> 
</form>  
</div>
</body>
</html>