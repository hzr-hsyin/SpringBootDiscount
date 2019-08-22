<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <!-- Static content -->
    <link rel="stylesheet" href="/resources/css/style.css">
    <script type="text/javascript" src="/resources/js/app.js"></script>

    <title>Spring Boot</title>
</head>
<body>
<h1>Airport Discount Using Page</h1>
<hr>
<div class="form">
    <form action="applydiscount" method="post" onsubmit="return codeControl()">
        <table>
            <tr>
                <td>Enter Your PNR</td>
                <td><input id="ticket_PNR" name="ticket_PNR" maxlength="10" required ></td>
            </tr>
            <tr>
                <td>Enter Your Discount Code</td>
                <td><input id="discountcode" name="discountcode" maxlength="10" required></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Apply Discount"></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>