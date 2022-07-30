<%-- 
    Document   : BookYourGas
    Created on : Jun 16, 2022, 12:26:42 AM
    Author     : viren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Book Your Gas</title>
    </head>
    <body>
        <div class="container mt-5  " >

            <div class="card  mt-5  w-75 card-center" style=" position: relative; left: 150px;">
                <h2 class="text-center text-warning"> Book Your Gas</h2>
                <div class="card-body bg-success">

                    <form action="GasBooking" method="post">
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="inputEmail4">Email:</label>
                                <input type="email" class="form-control" id="Email" name="Email" placeholder="Email...">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="inputPassword4">Registered Mobile No:</label>
                                <input type="tel" class="form-control" id="Number" name="MobileNumber" placeholder="Mobile number...">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="inputEmail4">Consumer Name:</label>
                                <input type="text" class="form-control" name="CosumerName" id="CosumerName" placeholder="Consumer Name...">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="inputPassword4">Distributor Name :</label>
                                <input type="tel" class="form-control" name="DistributorName" id="distributorName" placeholder="Mobile number...">
                            </div>
                        </div>
                        <div class="form-row justify-content-between">
                            <div class="form-group col-md-4 ">
                                <label for="inputEmail4">Consumer No:</label>
                                <input type="number" class="form-control" maxlength="6" name="ConsumerNo" id="consumerNo" placeholder="Consumer No...">
                            </div>
                            <div class="form-group col-md-4 ">
                                <label for="inputPassword4">Date:</label>
                                <input type="date" class="form-control" name="BookingDate" id="date" placeholder="Enter Date...">
                            </div>
                        </div>
                        <div class="form-row justify-content-between">
                            <div class="form-group col-md-4 ">
                                <label for="inputEmail4"> Type Of Cylinder:</label>
                                <select class="form-select" name="CylinderType" placeholder=" Type Of Cylinder..." style="width: inherit;height: 36px; opacity: 0.7;">
                                    <option selected value="Domestic">Domestic</option>
                                    <option value="LPG">LPG</option>
                                    
                                </select>
                            </div>
                            <div class="form-group col-md-4 ">
                                <label for="inputPassword4">Choose no of Cylinder</label>
                                <select class="form-group" name="CylinderCount" placeholder=" Choose no of Cylinder..." style="width: inherit;height: 36px;  opacity: 0.7;">
                                    <option selected value="1" >1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress">Address</label>
                            <input type="text" class="form-control" name="Address1"id="Address1" placeholder="1234 Main St">
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Address 2</label>
                            <input type="text" class="form-control" name="Address2" id="Address2" placeholder="Apartment, studio, or floor">
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="inputCity">City</label>
                                <input type="text" class="form-control" name="City" id="City">
                            </div>
                            <div class="form-group col-md-4">
                                <label for="inputState">State</label>
                                <select id="State" name="Customerstate" class="form-control">
                                    <option selected>Choose...</option>
                                    <option value="Maharashtra">Maharashtra</option>
                                    <option value="Gujarat">Gujarat</option>
                                    <option value="Rajasthan">Rajasthan</option>
                                    <option value="Keral">Keral</option>
                                    <option value="Goa">Goa</option>
                                </select>
                            </div>
                            <div class="form-group col-md-2">
                                <label for="inputZip">Zip</label>
                                <input type="text" class="form-control" id="Zipcode" name="Zipcode">
                            </div>
                        </div>
<!--                        <div class="form-row justify-content-end">
                            <div class="form-group col-md-6">
                                <label for="inputEmail4">Signature</label>
                                <input type="file" class="form-control" id="Sign" name="Sign" placeholder="Upload Signature...">
                            </div>
                            
                        </div>-->


                        <div class="form-group text-center">
                            <a href="home" class="btn btn-danger">Back</a>
                            <button type="submit" class="btn btn-warning">Book</button>
                        </div>
                    </form>

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