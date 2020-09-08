<%-- 
    Document   : OrderTrack
    Created on : Sep 24, 2019, 12:51:40 PM
    Author     : Virus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="icon" href="img/favicon.png" type="image/png">
    <title>MobShop Clothing</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="vendors/linericon/style.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="vendors/owl-carousel/owl.carousel.min.css">
    <link rel="stylesheet" href="vendors/lightbox/simpleLightbox.css">
    <link rel="stylesheet" href="vendors/nice-select/css/nice-select.css">
    <link rel="stylesheet" href="vendors/animate-css/animate.css">
    <link rel="stylesheet" href="vendors/jquery-ui/jquery-ui.css">
    <!-- main css -->
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/style_1.css">    
    <link rel="stylesheet" href="css/responsive.css">
    
    <script>
    function validate(){
        if(<%= temp %>===1){
            document.getElementById("beforeLogin").style.display = "block"; 
            document.getElementById("afterLogin").style.display = "none";                
        }
        else{
            document.getElementById("beforeLogin").style.display = "none"; 
            document.getElementById("afterLogin").style.display = "block";
        }
        return true;                    
    }        
    </script>

    <%@page import="java.util.*" %>
    <%@page import="java.sql.*" %>
    <%@page import="java.io.*" %>

    <%! String prod_title,prod_img,totalPrice,orderDate,orderAddr,payMode,orderQty,orderStatus; int prod_id,orderId; %>
    <%! int temp; %>
    <%
        if((session.getAttribute("customer_id")==null)||(session.getAttribute("customer_id")=="")){								
            temp=1;          
        }else{	
            temp=0;
        }   
        int order = Integer.parseInt(request.getParameter("order"));
        
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");                
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
            String qry = "SELECT ORDER2.ORDER_ID,ORDER2.PAY_MODE,ORDER2.TRANSACTION_ID,PRODUCT.PROD_ID,PRODUCT.PROD_NAME,PRODUCT.PROD_IMG,ORDER2.PROD_PRICE,ORDER2.TOTAL_QTY,ORDER2.TOTAL_PRICE,ORDER2.ORDER_DATE,ORDER2.ORDER_ADDR,ORDER2.ORDER_MOB,ORDER2.ORDER_STATUS FROM ORDER2 INNER JOIN PRODUCT ON ORDER2.PROD_ID = PRODUCT.PROD_ID AND ORDER_ID="+order;                
            PreparedStatement ps = con.prepareStatement(qry);
            ResultSet rs = ps.executeQuery(qry);
    %>      
</head>
<body onload="return validate()">
	<!-- Page Preloder -->
<!--	<div id="preloder">
		<div class="loader"></div>
	</div>-->

	<header class="header-section">
		<div class="header-top">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-2 text-center text-lg-left">
						<!-- logo -->
						<a href="./homepage.jsp" class="site-logo">
							<img src="img/logo.png" alt="">
						</a>
					</div>
					<div class="col-xl-6 col-lg-5">
						<form class="header-search-form">
							<input type="text" placeholder="Search on mobshop ....">
							<button><i class="flaticon-search"></i></button>
						</form>
					</div>
					<div class="col-xl-4 col-lg-5">
						<div class="user-panel">
							<div class="up-item">
								<i class="flaticon-profile"></i>
								<a href="login.html">Sign</a> In or <a href="registration.jsp">Create Account</a>
							</div>
							<div class="up-item">
								<div class="shopping-card">
									<i class="flaticon-bag"></i>
									<span>0</span>
								</div>
								<a href="#">Shopping Cart</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<nav class="main-navbar">
			<div class="container">
				<!-- menu -->
				<ul class="main-menu">
					<li><a href="Admin.jsp">Home</a></li>
					<li><a href="WomenWear.jsp">Product</a>
						<ul class="sub-menu">
							<li><a href="AddProduct.jsp">Add Product</a></li>
							<li><a href="UpdateProduct.jsp">Update Product</a></li>
							<li><a href=" DeleteProduct.jsp">Delete Product</a></li>							
						</ul>					

					</li>
					<li><a href="#">Order<span class="new">New</span></a>
						<ul class="sub-menu ">
							<li><a href="ActiveOrder.jsp">Active Order</a></li>
							<li><a href="CancelledOrder.jsp">Cancel Order</a></li>
						</ul>					
					</li>
					<li><a href="#">Payment</a>
						<ul class="sub-menu">
							<li><a href="KidsWearJeans.jsp">Debit Card</a></li>
							
						</ul>
					</li>
					<li><a href="#">Customer</a>
						<ul class="sub-menu">
							<li><a href="./product.jsp">Update Customer</a></li>
							
						</ul>
					</li>
					<li><a href="AdminTracking.jsp">Track</a></li>
				</ul>
			</div>
		</nav>
	</header>
    <!--================Tracking Box Area =================-->
         &nbsp;&nbsp;&nbsp;
    <div  class="section-title">            
        <h2 style="font-size: 20px; margin-bottom: 15px;" class="fw-title">TRACK ORDER</h2>
    </div>
    <section class="row  justify-content-center " style=" padding: 20px; height: 400px; ">        
        <form class="text-center col-4"  action="OrderTrack.jsp" method="get" >
            <input type="text" class="form-control" style="float: left; width:250px; " name="order" placeholder="Order ID"> 
            <button type="submit" value="submit" style="" class="btn submit_btn" >Track Order</button>
        </form>        

         <div class="container"   >
             <div class="row"  >
                 <div class="col-sm-12 " >
                     <table class="table table-bordered" >
                        <thead>
                          <tr>
                            <th >Order ID </th>
                            <th>Product Information </th>
                            <th>Qty </th>
                            <th>Price </th>
                            <th>Order Date </th>
                            <th>Buyer Details </th>
                            <th>Order Status </th>
                            <th>TXN ID </th>
                            <th>Payment Mode </th>
                          </tr>
                        </thead>
                        <!--  Code Display Here -->                                             
                        <%
                            while( rs.next()){
                        %>                                            
                        <!--Image display here-->                                        

                        <tbody style="height: 100px;">
                          <tr>
                            <td><%=rs.getInt("ORDER_ID")%></td>
                            <td style="width: 270px;">
                                <div style="float: left">
                                    <img src="./img/product/<%=rs.getString("PROD_IMG")%>" width="60" height="80px"  />
                                </div>
                                <div style="float: left; margin-left: 20px;" >
                                    <%=rs.getString("PROD_NAME")%> <br />Product ID - <%=rs.getInt("PROD_ID")%> <br />Price -  &#8377; <%=rs.getString("PROD_PRICE")%>
                                </div>    
                            </td>                                                                         
                            <td><%=rs.getString("TOTAL_QTY")%></td>
                            <td>&#8377; <%=rs.getString("TOTAL_PRICE")%></td>
                            <td><%=rs.getString("ORDER_DATE")%></td>
                            <td style="width: 200px;"><%=rs.getString("ORDER_ADDR")%> <br />Mobile - <%=rs.getString("ORDER_MOB")%>  </td>                                
                            <td id="orderStatus"><%=rs.getString("ORDER_STATUS")%></td>
                            <td><%=rs.getString("TRANSACTION_ID")%></td>                                                        
                            <td><%=rs.getString("PAY_MODE")%></td>
                          </tr>
                        </tbody>
                        <!--Finish Display Order-->
                        <%
                            }
                        %>

                      </table>
                 </div>
             </div>
         </div>               
    </section>
        <%
            ps.close();
            con.close();            
        }
        catch(Exception ex){
            out.println(ex);
        }
        %>           

      
	<!-- Footer section end -->
    <!--================ End footer Area  =================-->

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/popper.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/stellar.js"></script>
    <script src="vendors/lightbox/simpleLightbox.min.js"></script>
    <script src="vendors/nice-select/js/jquery.nice-select.min.js"></script>
    <script src="vendors/isotope/imagesloaded.pkgd.min.js"></script>
    <script src="vendors/isotope/isotope-min.js"></script>
    <script src="vendors/owl-carousel/owl.carousel.min.js"></script>
    <script src="js/jquery.ajaxchimp.min.js"></script>
    <script src="js/mail-script.js"></script>
    <script src="vendors/jquery-ui/jquery-ui.js"></script>
    <script src="vendors/counter-up/jquery.waypoints.min.js"></script>
    <script src="vendors/counter-up/jquery.counterup.js"></script>
    <script src="js/theme.js"></script>
    <script>
            function logout(){                                                    
                <%
                    session.invalidate();                                                           
                %>                                                              
                document.location.reload();
            }            

        </script>  
</body>
</html>