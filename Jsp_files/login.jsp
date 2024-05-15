<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login Page</title>
  <style>
    body {
    
      margin: 0;
      padding: 0;
      font-family: Arial, sans-serif;
      background-image: url('log.jpg');
    background-repeat: no-repeat;
    background-attachment: fixed;
   background-size: 100% 100%;
    }
    form{
     padding: 10px 10px;
      margin: 60px 60px;
      
    }

    .container {
    background-image: url('log3.jpeg');
    background-repeat: no-repeat;
    background-attachment: fixed;
   background-size: 100% 100%;
      position: absolute;
      color:perpule;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      padding: 30px;
      border:5px solid blue; 
      border-radius: 70px;
      box-shadow: 100px 100px 100px rgba(0, 0, 0, 0.3);
    }

    h2 {
      text-align: center;
      margin-bottom: 80px;
      color:yellow;
      font-size: 45px;
    }

    input[type="text"],
    input[type="password"] {
      
      width: 100%;
      padding: 15px;
      margin: 10px 0;
      border: 5px solid yellow;
      border-radius: 10px;
      font-size:20px;
    }

    input[type="submit"],
    input[type="reset"] {
      width: 49%;
      padding: 15px;
      margin: 10px 0;
      font-size:30px;
      border: 4px solid yellow;
      border-radius: 5px;
      background-color: orange;
      cursor: pointer;
      transition: background-color 0.3s, color 0.3s;
    }

    input[type="submit"]:hover,
    input[type="reset"]:hover {
      background-color: blue;
      color: white;
    }

  </style>
</head>
<body>
  <div class="container">
    <h2>Login</h2>
    <form action="loginServlet" method="post">
      <input type="text" name="name" placeholder="Username" required>
      <input type="password" name="password" placeholder="Password" required>
      <input type="submit" value="Submit">
      <input type="reset" value="Reset">
    
    </form>
  </div>
</body>
</html>
    