<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>TABULATE YOUR FUNK</title>
    <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<h1>Tabulate function</h1>
<br/>
<img src="img.png" alt="Функція, для табуляції">
<form action="tab-servlet" method="post">
    <p>Enter start:</p>
    <input id="start" type="text" name="start">
    <p>Enter end:</p>
    <input id="end" type="text" name="end">
    <p>Enter step:</p>
    <input id="step" type="text" name="step">
    <input type="submit" value="Show information">
</form>
</body>
</html>