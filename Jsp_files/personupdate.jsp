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
  label {
    display: block;
    margin-bottom: 5px;
    color: black;
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
<body>
<div class="container">
<img src="update.jpg" width="100%" height="250px">
  <h2>Smoking Tracker Form</h2>
  <h2>Update Smokers Data</h2>
  <form action="personUpdateServlet" method="post">
  <label for="person_id">Person_id:</label>
    <input type="text" name="id" required>
    First Name:<input type="text" name="first_name" required>

    <label for="last_name">Last Name:</label>
    <input type="text" name="last_name" required>

    <label for="age">Age:</label>
    <input type="number" name="age" required>
    <label for="age"  >Gender:
    <input type="radio" name="gender" value="Male" required checked >Male
    <input type="radio" name="gender" value="Female" required >Female
    </label>
    
    <label for="cigarettes_per_day">Cigarettes per Day:</label>
    <input type="number" name="cigarettes_per_day" required>
    
     <label for="cigarettes_brand">Cigarettes Brand:</label>
    <select  name="cigarettes_brand" required>
      <option value="">Select Brand</option>
      <option value="Marlboro">Marlboro</option>
      <option value="Newport">Newport</option>
      <option value="Camel">Camel</option>
       <option value="Berkeley">Berkeley</option>
       <option value=" Esse"> Esse</option>
       <option value=" Dunhill"> Dunhill</option>
       <option value="Davidoff">Davidoff</option>
       <option value="Shift">Shift</option>
       <option value="Navy Cut">Navy Cut</option>
       <option value="Tropical ">Tropical </option>
       <option value="other">Other</option>
       
     
    </select>
    
    <label for="quit_attempt">Quit Attempt:</label>
    <input type="number" name="quit_attempt" required>
    
    <label for="user_opinion ">User Opinion:</label>
    <input type="text" name="user_opinion " required>

    <label for="address">Address:</label>
    <input type='text' name="address" required>

    <label for="contact_number">Contact Number:</label>
    <input type="text"  name="contact_number" required>
    
    <label for="amount_spending">Amount to be Spent/Month:</label>
    <input type="text"  name="amount_spending" required>

    <input type="submit" value="Update">
    <input type="reset" value="Reset">
    
  </form>
  </div>
</body>
</html>