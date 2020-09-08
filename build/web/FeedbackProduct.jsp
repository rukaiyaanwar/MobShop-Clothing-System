<%-- 
    Document   : FeedbackProduct
    Created on : Sep 26, 2019, 1:22:53 PM
    Author     : Virus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title> MobShop Clothing</title>
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
        <link rel="stylesheet" href="css/style.css"/>
        
        <style> 
        *{
          margin: 0px;
          padding: 0px;
          font-family: sans-serif;
          box-sizing:border-box;
        }
        #big-div{
                width:100%;
                height:100%;	
                padding:10px 100px;
                background-color:#F2F2F2;
        }
        #top_Design{
                border-radius:10px;	
                height:200px;
                width:100%;
                padding:30px;
                background-color:white;	
        }

        #bottom_Design li:hover {
                border:1px solid #FF1493;
                color:white;
                background-color:white;
        }
        #bottom_Design li:hover a{
                color:#FF1493;	
        }

        a{	
                color:white;
        }

        #bottom_Design li{
                border-radius:10px;
                background-color:#282828;
                height:40px;
                margin: 20px 0px;
                padding:10px;
                width:100%;
                list-style-type:none;
                font-size:12pt;
                text-align:center;	
        }


        #profile-left{
                width:25%;
                height:100%;
                margin:5px;
                float:left;
                border-radius:20px;
        }
        #mini_box{
                width:200px;
                height:70px;
                border-radius:30px;
        }
        #profile-right{
                float:right;
                width:69%;
                margin:5px;
                height:100%;
                background-color:white;
                border-radius:20px;
        }
        #myAccountName{
            font-size: 13pt;
        }       
                        
            #UpdateButton{
                margin: 10px 0px 0px 0px;
                width: 150px;                
                height: 35px;
                border-radius: 4px;                                
                border: none;                                
            }
        </style>
<!--        <%@page import="java.util.*" %>  /*Java util package contains collection framework, collection classes, classes related to date and time, event model, internationalization, and miscellaneous utility classes. On importing this package, you can access all these classes and methods. */-->
<!--        <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.-->
<!--        <%@page import="java.io.*" %>  //this statement means all the classes of io package will be imported. used when we are using input/output stream.-->
<%
    if((session.getAttribute("customer_id")==null)||(session.getAttribute("customer_id")==""))
        response.sendRedirect("login.html");
    else{            
    }    
    try
    {   
        Integer custId = (Integer)session.getAttribute("customer_id");
        String status = "DELIVERED";
        
        Class.forName("oracle.jdbc.driver.OracleDriver");           // Initialize your JDBC driver by calling the method Class.forName.      
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");  //Establishing a connection.
        String qry = "SELECT ORDERS.ORDER_ID,PRODUCT.PROD_ID,PRODUCT.PROD_NAME,PRODUCT.PROD_IMG,ORDERS.PROD_PRICE,ORDERS.TOTAL_QTY,ORDERS.TOTAL_PRICE,ORDERS.ORDER_DATE,ORDERS.ORDER_STATUS FROM ORDERS INNER JOIN PRODUCT ON ORDERS.PROD_ID = PRODUCT.PROD_ID AND ORDER_STATUS='DELIVERED' AND C_ID="+custId;  //Sending the query              
        PreparedStatement ps = con.prepareStatement(qry);   // It is used to execute parameterized query.
        ResultSet rs = ps.executeQuery(qry);                //contains the results of executing an SQL query.
%>    
</head>
<body>	
	<!-- Header section -->
	<header class="header-section">
		<div class="header-top">
			<div class="container">
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
					
					<div class="col-xl-4 col-lg-5" id="afterLogin">
						<div class="user-panel" >
							<div class="up-item"  >
								<div class="shopping-card">
									<i class="flaticon-bag"></i>
									<span>0</span>
								</div>
								<a href="#">Shopping Cart</a>
							</div>
                                                    <div class="up-item" id="afterLogin"  >
								<i class="flaticon-profile"></i>
								<a href="myaccount.jsp">My Account</a>
                                                    </div>    &nbsp; &nbsp; &nbsp; &nbsp;                                               
							<div class="up-item" onclick="return logout()">
								<i class="flaticon-profile"></i>
								<a href="homepage.jsp"  > Logout </a> 
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
					<li><a href="homepage.jsp">Home</a></li>
					<li><a href="WomenWear.jsp">Women<span class="new">New</span></a>
						<ul class="sub-menu">
							<li><a href="WomensWearJeans.jsp">Jeans</a></li>
							<li><a href="WomenWearJacket.jsp">Jackets</a></li>
							<li><a href="WomenWearEthnic.jsp">Ethnic Wear</a></li>
							<li><a href="WomensWearKurti.jsp">Kurti</a></li>
							<li><a href="WomenWearJumpsuit.jsp">JumpSuit</a></li>
						</ul>					

					</li>
					<li><a href="MenWear.jsp">Men<span class="new">New</span></a>
						<ul class="sub-menu ">
							<li><a href="MensWearshirts.jsp">Shirts</a></li>
							<li><a href="MenWearSuit.jsp">Suits</a></li>
							<li><a href="MensWearJackets.jsp">Jackets</a></li>
							<li><a href="MensWearTshirt.jsp">T-Shirt</a></li>
							<li><a href="MensWearJeans.jsp">Jeans</a></li>
						</ul>					
					</li>
					<li><a href="KidsWearJeans.jsp">Child Collection</a>
						<ul class="sub-menu">
							<li><a href="KidsWearJeans.jsp">Kids Collections</a></li>
							
						</ul>
					</li>
					
					<li><a href="contact.html">Contact Us</a></li>
				</ul>
			</div>
		</nav>
	</header>
        <!-- Header End -->
        
        <section id="big-div" >
            <div id="profile-left">
                <div id="top_Design">
                    <img src="img/account-icon.png" width="75px" height="75px" style="float:center;" /> 	<br /><br />			
                    <h5>Hello,<p id="login-name" style="color:#FF1493; font-size:14pt;">Rukaiya Anwar</p></h5>
                </div>
                <div id="bottom_Design">
                    <ul>
                        <li><a href="ChangePassword.jsp" >ChangePassword</a></li>
                        <li><a href="CustomerOrderStatus.jsp"  >Order</a></li>					
                        <li><a href="FeedbackProduct.jsp"  >Feedback</a></li>
                    </ul>		
                </div>		
            </div>

            <div id="profile-right" class="container">
                <div class="login_form_inner reg_form ">
                    <div  class="section-title">            
                        <h2 style="font-size: 20px; margin-bottom: 15px;" class="fw-title">MY ORDERS</h2>
                    </div>
                 <div class="row" style="width: 790px"  >
                     <div class="col-sm-12 " >                         
                        <%  
                            if (!rs.isBeforeFirst() ) {                                
                        %>
                        <!--================Order Details Area =================-->
                        <section class="order_details p_120">
                            <div class="container">
                                <h3 class="title_confirmation">You Have No Orders To Feedback  .</h3>
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
                                <th> Please Review Product </th>
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
                                <td style="width: 220px;">
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
                                <td style="padding : 20px; width: 100px; ">                                                                        
                                    <a href="FeedbackProductText.jsp?order_id=<%=rs.getInt("ORDER_ID")%>" ><button type="submit" id="UpdateButton"  >Feedback</button></a>
                                </td>
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
         </section>
        
        <%
            ps.close();
            con.close();            
        }
        catch(Exception ex){
            out.println(ex);
        }
        %>           


        
        
        <!-- Footer section -->
	<section class="footer-section">
		<div class="container">
			<div class="footer-logo text-center">                           
                            <em <b><p style = "font-size: 40px;color : white;" class="new" >MOBSHOP</p></b></em>
			</div>
			<div class="row">
				<div class="col-lg-3 col-sm-6">
					<div class="footer-widget about-widget">
						<h2>About</h2>
						<p>Online MobShop Clothing supposed to provide customer opportunity to shop 24x7.</p>
						<img src="img/cards.png" alt="">
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="footer-widget about-widget">
						<h2>Online Shopping</h2>
						<ul>
							<li><a href="WomensWearJeans.jsp">Women's Wear Jeans</a></li>
							<li><a href="WomenWearJumpsuit.jsp">Trendy Jumpsuits</a></li>
							<li><a href="MensWearJackets.jsp">Men's Wear Jacket</a></li>
							<li><a href="MenWearSuit.jsp">Men's Wear Trendy Suits</a></li>
							<li><a href="WomenWearJacket.jsp">Women's Wear Jacket</a></li>
							<li><a href="WomensWearKurti.jsp">Stylish Kurti</a></li>
						</ul>						
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="footer-widget about-widget">
						<h2>Services</h2>						
						<ul>
							<li><a href="">Shipping</a></li>
							<li><a href="">Track</a></li>
							<li><a href="">Returns Policy</a></li>
							<li><a href="">Terms & Conditions</a></li>
						
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="footer-widget contact-widget">
						<h2>Address</h2>
                                                <p> Online MObShop Pvt. Ltd. New Delhi, India.
					</div>
				</div>
			</div>
		</div>		
<p class="text-white text-center mt-5">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved <img src="img/Heart.gif" width="25" height="25">  by <a href="homepage.html" target="_blank">Mobshop Clothing</a></p>
			</div>
		</div>
	</section>
     
</body>
</html>
