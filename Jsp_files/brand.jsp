<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Clickable Photos</title>
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
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }
    pre {
            text-align: center;
            color: yellow;
            font-family: Arial, sans-serif;
            font-size:70px;
        }

  .photo-container {
    display: grid;
    grid-template-columns: auto auto; /* Adjusted to auto to ensure that the items are arranged properly */
    grid-gap: 20px;
    justify-items: center;
    align-items: center;
    margin: 20px;
  }

  a {
    text-decoration: none;
    color: inherit;
  }

  img {
    width: 300px;
    height: 300px;
    object-fit: cover; /* Ensures the image fills the specified dimensions and maintains its aspect ratio */
    border: 5px solid #fff;
    border-radius: 8px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    transition: transform 0.3s ease;
  }

  img:hover {
    transform: scale(1.05);
  }
</style>
</head>
<body>
<pre><b>Cigarette Brand 
  And
    There Toxicity </b></pre>
  <div class="photo-container">
    <a href="c1.html">
      <img src="c1.jpeg" alt="Photo 1">
    </a>
    <a href="c2.html">
      <img src="c2.jpeg" alt="Photo 2">
    </a>
    <a href="c3.html">
      <img src="c3.jpeg" alt="Photo 3">
    </a>
    <a href="c4.html">
      <img src="c4.jpeg" alt="Photo 4">
    </a>
     <a href="c5.html">
      <img src="c3.jpeg" alt="Photo 3">
    </a>
    <a href="c6.html">
      <img src="c4.jpeg" alt="Photo 4">
    </a>
    
  </div>
</body>
</html>
    