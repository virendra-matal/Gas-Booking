

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@page isELIgnored="false" %>--%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Home</title>
    </head>
    <body style="background-image: url(Resources/images/image9.JPG); background-size: cover; height: 100%; width: 100%;">
        <div class="container" >
            <div class="mt-4" style="width: 150px; height: 150px; position: relative; top: 25px; left: 5px;">
                <img src="<c:url value="/Resources/images/india.jpg"/>" class="img-fluid" alt="Responsive image">


                <div style="width:600%; position:relative;left: 325px;top: -170px;">
                    <nav class="navbar navbar-expand-lg m-5" style="background-color: darkblue; opacity: 0.7">
                        <div class="container-fluid mt-1" style="    padding: 12px;">


                            <div class="collapse navbar-collapse mt-1" id="navbarSupportedContent" style="background-color: white; font-style: italic; font-weight: 500">
                                <ul class="navbar-nav me-auto mb-2 mb-lg-2" style="text-decoration: none; border-bottom-color: limegreen;">
                                    <li class="nav-item m-4" >
                                        <a class="nav-link active" aria-current="page" href="home">Home</a>
                                    </li>
                                    <li class="nav-item m-4 " >
                                        <a class="nav-link" href="gasbooking">Book your Gas</a>
                                    </li>

                                    <li class="nav-item m-4">
                                        <a class="nav-link" href="index">Cancel Booking</a>
                                    </li>

                                </ul>

                                <div class="mx-5" style="position: relative; left: 130px;">
                                    <form action="logout" method="post">
                                        <button class="btn btn-info" type="submit">Logout</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </nav>
                </div>
            </div>
            <div>
                <div class="card bg-primary" style="position: relative;left: 0px;top: 100px; width: 50%; height: 50%;">
                    <div class="card-header text-center" style="font-weight: 600; font-style: italic;">Upcoming Events</div>
                    <div class="card-body bg-warning">
                        <p class="card-text text-light" style="font-weight: 400; font-style: italic;">Events not found.</p>
                    </div>
                </div>
                <div class="card bg-warning" style="position: relative;left: 623px;top: 100px; width: 50%; height: 50%;">
                    <div class="card-header text-center" style="font-weight: 600; font-style: italic;">Notice</div>
                    <div class="card-body bg-primary">
                        <p class="card-text text-light" style="font-weight: 400; font-style: italic;">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    </div>
                </div>
            </div>
        </div>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
