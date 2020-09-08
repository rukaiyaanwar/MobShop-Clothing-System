<%-- 
    Document   : CancelledOrder
    Created on : Sep 23, 2019, 4:17:27 PM
    Author     : Virus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">
<head>
	<title>MobShop Clothing</title>
	<meta charset="UTF-8">
	<meta name="description" content=" MobShop | eCommerce Template">
	<meta name="keywords" content="mobshop, eCommerce, creative, html">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- Favicon -->
	<link href="img/favicon.ico" rel="shortcut icon"/>

	<!-- Google Font -->
	<link href="https://fonts.googleapis.com/css?family=Josefin+Sans:300,300i,400,400i,700,700i" rel="stylesheet">

	<!-- Stylesheets -->
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/font-awesome.min.css"/>
	<link rel="stylesheet" href="css/flaticon.css"/>
	<link rel="stylesheet" href="css/slicknav.min.css"/>
	<link rel="stylesheet" href="css/jquery-ui.min.css"/>
	<link rel="stylesheet" href="css/owl.carousel.min.css"/>
	<link rel="stylesheet" href="css/animate.css"/>
	<link rel="stylesheet" href="css/style_1.css"/>
        <link rel="stylesheet" href="css/style(2).css"/>
        
        
        <style> 
            select {
              width: 150px;
              padding: 10px 15px;
              border: none;
              border-radius: 4px;
              background-color: #f1f1f1;
            }
                        
            #UpdateButton{
                margin: 10px 0px 0px 0px;
                width: 150px;                
                height: 35px;
                border-radius: 4px;                                
                border: none;                                
            }
        </style>
    
        <%@page import="java.util.*" %>
        <%@page import="java.sql.*" %>
        <%@page import="java.io.*" %>
        <%! String prod_title,prod_img,totalPrice,orderDate,orderAddr,payMode,orderQty,orderStatus; int prod_id,orderId; %>

        <%
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");                
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
                String qry = "SELECT ORDER2.ORDER_ID,PRODUCT.PROD_ID,PRODUCT.PROD_NAME,PRODUCT.PROD_IMG,ORDER2.PROD_PRICE,ORDER2.TOTAL_QTY,ORDER2.TOTAL_PRICE,ORDER2.ORDER_DATE,ORDER2.ORDER_ADDR,ORDER2.ORDER_STATUS FROM ORDER2 INNER JOIN PRODUCT ON ORDER2.PROD_ID = PRODUCT.PROD_ID AND ORDER_STATUS='CANCEL ORDER'";                
                PreparedStatement ps = con.prepareStatement(qry);
                ResultSet rs = ps.executeQuery(qry);

        %>      


</head>
<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

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
							<li><a href="CancelOrder.jsp">Cancel Order</a></li>

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
        
         &nbsp;&nbsp;&nbsp;
        <div  class="section-title">            
            <h2 style="font-size: 20px; margin-bottom: 15px;" class="fw-title">CANCELLED ORDER</h2>
        </div>
         
         <section class="" >
             <!--style="width: 98%; margin: 0px 12px;"--> 
             <div class="container"   >
                 <div class="row"  >
                     <div class="col-sm-12 " >
                         <%  
                            if (!rs.isBeforeFirst() ) {    
                                
                                %>
                                    <!--================Order Details Area =================-->
                                    <section class="order_details p_120">
                                        <div class="container">
                                            <h3 class="title_confirmation">You Have No Cancelled Orders .</h3>
                                        </div>
                                    </section>
                                    <!--================End Order Details Area =================-->

                                <%
                                
                            }else{                          
                         %>
                         <table class="table table-bordered" >
                            <thead>
                              <tr>
                                <th >Order ID </th>
                                <th>Product Information </th>
                                <th>Qty </th>
                                <th>Price </th>
                                <th>Order Date </th>
                                <th>Delivery Address </th>
                                <th>Order Status </th>                                
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
                                <td style="width: 200px;"><%=rs.getString("ORDER_ADDR")%> </td>                                
                                <td><%=rs.getString("ORDER_STATUS")%></td>
                              </tr>
                            </tbody>
                            <!--Finish Display Order-->
                            <%
                                }// close ResultSet
                                }// else
                            %>
                            
                          </table>
                     </div>
                 </div>
             </div>
         </section>>
        
        <%
            ps.close();
            con.close();            
        }
        catch(Exception ex){
            out.println(ex);
        }
        %>           

        
	<!--====== Javascripts & Jquery ======-->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.slicknav.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.nicescroll.min.js"></script>
	<script src="js/jquery.zoom.min.js"></script>
	<script src="js/jquery-ui.min.js"></script>
	<script src="js/main.js"></script>

	</body>
</html>
