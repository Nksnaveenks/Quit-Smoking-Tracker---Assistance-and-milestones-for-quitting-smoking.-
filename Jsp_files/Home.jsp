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
     background-image: url('home_.jpg');
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: cover;
   background-size: 100% 100%;
    margin: 0;
    padding: 0;
  }
  h1 {
  
     font-size: 60px;
    font-weight: bold;
    text-align: center;
    padding: 20px 20px 40px;
  color:yellow;
  
  }
  nav {
     background-color: rgb(234, 235, 222);
    color: #fff;
    text-align: center;
    padding: 20px;
  }
  nav a {
    font-size: 25px;
    color: rgb(35, 39, 1);
    text-decoration: none;
    margin: 0 15px;
    font-weight: bold;
  }
</style>

</head>
<body>
<h1>Quit Smoking Tracker</h1>
<nav>
  <a href="./personregister.jsp">Insert</a>
  <a href="./persondelete.jsp">Delete</a>
  <a href="./personupdate.jsp">Update</a>
  <a href="./persondisplay.jsp">Display</a>
   <a href="./personlist.jsp">List</a>
   <a href="./lessthan5.jsp">OnSpecific</a>
   <a href="./brand.jsp">Brand</a>
</nav>
</body>
</html>