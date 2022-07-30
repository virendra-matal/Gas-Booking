<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <style>
            tr,td{
                border: 1px dashed black;
            }
            tr,th{
                border: 1px solid black;
                /*background: limegreen;*/
            }
        </style>
    </head>

    <body>


        <table style="border: 1px solid black; border-collapse: collapse; position: relative;top: 200px;">
            <tr style="background: blue; color: white;">
                <th>Booking Id</th>
                <th>Email</th>
                <th>Mobile Number</th>
                <th>Consumer Name</th>
                <th>Distributor Name</th>
                <th>Consumer No</th>
                <th>Booking Date</th>
                <th>Cylinder Type</th>
                <th>Cylinder Count</th>
                <th>Address</th>
                <th>Delete</th>
            </tr>
            <c:forEach var="a" items="${Data}">
                <tr style="border: 1px dashed black;">

                    <td><c:out value="${a.bookingId}"/></td>
                    <td><c:out value="${a.email}"/></td>
                    <td><c:out value="${a.mobileNumber}"/></td>
                    <td><c:out value="${a.cosumerName}"/></td>
                    <td><c:out value="${a.distributorName}"/></td>
                    <td><c:out value="${a.consumerNo}"/></td>
                    <td><c:out value="${a.bookingDate}"/></td>
                    <td><c:out value="${a.cylinderType}"/></td>
                    <td><c:out value="${a.cylinderCount}"/></td>
                    <td><c:out value="${a.address1} ${a.address2} ${a.city}, ${a.customerstate}-${a.zipcode}"/></td>
                    <td>
                        <a href="delete/${a.bookingId}"><input type="button" value="Delete" id="btn1" style="background: yellow; border-radius: 30px; border: none; padding: 2px;margin: 5px;"></a>
                        <a href="update/${a.bookingId}"><input type="button" value="Update" id="btn1" style="background: limegreen; border-radius: 30px; border: none; padding: 2px;margin: 5px;"></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        
        <div class="container text-center" style="position: relative; top: 250px; left: 45%">
            
            <a href="home"><input type="button" value="Home" style="background: blue; color: white; padding: 8px;"></a>
            
        </div>


    </body>
</html>
