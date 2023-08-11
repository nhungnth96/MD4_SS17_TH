
<%@ page import="ss16.th.service.IGenericService" %>
<%@ page import="ss16.th.service.CustomerServiceFactory" %>
<%@ page import="ss16.th.model.Customer" %>
<html>
<head>
    <title>Detail</title>
</head>
<body>
<h1>Customers details</h1>
<p>
    <a href="/customers">Back to customer list</a>
</p>
<table border="1px" style="color: green">
    <tr>
        <td>ID</td>
        <td>${requestScope["customer"].getId()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${requestScope["customer"].getName()}</td>
    </tr>
    <tr>
        <td>Email: </td>
        <td>${requestScope["customer"].getEmail()}</td>
    </tr>
    <tr>
        <td>Address: </td>
        <td>${requestScope["customer"].getAddress()}</td>
    </tr>
</table>
</body>
</html>