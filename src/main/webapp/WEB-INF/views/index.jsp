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
<h1>Airport Discount Code Create</h1>
<hr>
<div class="form">
    <form action="yourdiscountcode" method="post" >
        <table>
            <tr>
                <td>Enter Your PNR</td>
                <td><input id="ticket_PNR" name="ticket_PNR" maxlength="10" required></td>
                <td><input type="submit" value="Create Code"></td>
            </tr>
            <tr><td></td></tr>
            <tr>
                <td colspan="3" rowspan="2">
                    <fieldset>
                        <legend>Booking Details</legend>
                        <label for="date">Booking date: <input id="date" type="date" name="date" min="2019-08-19" max="2020-01-01" value="2019-01-01"></label>
                    </fieldset>
                </td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>