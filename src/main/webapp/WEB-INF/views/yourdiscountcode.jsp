
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Spring Boot</title>
</head>
<body>

<div class="form">
  <form action="usediscount" method="post" >
  <h1>Airport Discount Code Create</h1>
  <hr>
    <h2>Your Discount code : ${yourdiscountcode}</h2>
    <h2>Your Discount Rate :% ${yourdiscountrate}</h2>
    <h2>You can use the code until : ${date}</h2>

  <hr>
  <hr>
    <input type="submit" value="Use Discount">
  </form>

</div>

</body>
</html>