<%-- 
    Document   : UpdateProductUI
    Created on : Sep 21, 2019, 12:27:27 PM
    Author     : Rukaiya_anwar17
--%>
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
        <link rel="stylesheet" href="css/style.css"/>
	<link rel="stylesheet" href="css/style_1.css"/>
        <link rel="stylesheet" href="css/style(2).css"/>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <style>
            input[type=text]
            {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                box-sizing: border-box;                   
            }
             input[type= number]
            {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                box-sizing: border-box;                   
            }
             input[type= file]
            {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                box-sizing: border-box;                   
            }
            </style>
       <!--<%@page import="java.util.*" %>  //Java util package contains collection framework, collection classes, classes related to date and time, event model, internationalization, and miscellaneous utility classes. On importing this package, you can access all these classes and methods.
           <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.
           <%@page import="java.io.*" %>  //this statement means all the classes of io package will be imported. used when we are using input/output stream.
        -->
        <%! String searchkey,prod_title,prod_img, stock;int prod_id,price; %>
        <%
            searchkey = request.getParameter("prod_id");            
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // Initialize your JDBC driver by calling the method Class.forName.  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya"); //Establishing a connection.
            String qry = "select * from mobshop.product where prod_id='"+searchkey+"' ";                //Sending the query . 
            PreparedStatement ps = con.prepareStatement(qry);  // It is used to execute parameterized query.
            ResultSet rs = ps.executeQuery(qry);      //contains the results of executing an SQL query. 
                    
                                                            
        %>

	

</head>
<body>
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
					<div class="col-xl-4 col-lg-5">
						<div class="user-panel">
							<div class="up-item">
								<i class="flaticon-profile"></i>
                                                                <a href="#">Hi,Rukaiya</a>
							</div>
							<div class="up-item">
								<div class="shopping-card">
									<i class="fa fa-sign-out" aria-hidden="true"></i>                                                                        
								</div>
								<a href="logout.jsp" >Logout </a>
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
					<li><a href="">Product</a>
						<ul class="sub-menu">
							<li><a href="AddProduct.jsp">Add Product</a></li>
							<li><a href="UpdateProduct.jsp">Update Product</a></li>
							<li><a href="DeleteProduct.jsp">Delete Product</a></li>							
						</ul>					

					</li>
					<li><a href="#">Order<span class="new">New</span></a>
						<ul class="sub-menu ">
							<li><a href="ActiveOrder.jsp">Active Order</a></li>
							<li><a href="CancelledOrder.jsp">Cancel Order</a></li>
						</ul>					
					</li>
					<li><a href="AdminChangePassword.jsp">Change Password</a>
						
					</li>
					
					<li><a href="AdminTracking.jsp">Track</a></li>
				</ul>
			</div>
		</nav>
	</header>
        <!--================Login Box Area =================-->
				
                                           <section class="login_box_area p_120">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="login_box_img">
                                            <img class="img-fluid" src="img/product/jacket04.jpg" width="600" height="300"alt="">
						<div class="hover">
							<h4>MOBSHOP CLOTHING</h4>
							<p>WE BRING QUALITY TO YOU!</p>
						</div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="login_form_inner reg_form">

<!--                            JSP Code Start From Here                                                                    -->                            
<%                            
if(rs.next()){
    

%>
<!--                            JSP Code End Here                                                                    -->                                                        
                                            
						<h3>CHANGE PRODUCT</h3>
						<form class="row login_form" action="UpdateProductDB.jsp" method="get" >
							<div class="col-md-6 form-group">
								<input type="text" class="form-control" id="name" name="name" value="<%=rs.getString("PROD_NAME")%>" placeholder="Product Name">
							</div>
							
							<div class="col-md-6 form-group">
								<input type="text" class="form-control" id="brand" name="brand" value="<%=rs.getString("BRAND")%>"  placeholder="Brand">
							</div>
                                                        <div class="col-md-7 form-group">
								<input type="text" class="form-control" id="category" name="category" value="<%=rs.getString("PR_CATEGORY")%>" placeholder="Product Category">
							</div>
                                                        <div class="col-md-5 form-group">
								<input type="text" class="form-control" name="prod_id" value="<%=rs.getString("PROD_ID")%>" placeholder="Product ID">
							</div>
                                                         <div class="col-md-6 form-group">
								<input type="text" class="form-control" name="maurya" value="<%=rs.getString("PR_FTR1")%>" placeholder="Product Feature 1">
							</div>
                                                        <div class="col-md-6 form-group">
								<input type="text" class="form-control" name="maurya2" value="<%=rs.getString("PR_FTR2")%>"placeholder="Product Feature 2">
							</div>
                                                        <div class="col-md-6 form-group">
								<input type="text" class="form-control" name="maurya3" value="<%=rs.getString("PR_FTR3")%>" placeholder="Product Feature 3">
							</div>
                                                        <div class="col-md-6 form-group">
								<input type="text" class="form-control" id="pr_skey" name="pr_skey" value="<%=rs.getString("PR_SKEY")%>" placeholder="Search Keyword">
							</div>
                                                        <div class="col-md-7 form-group">
								<input type="number" class="form-control" id="amount" name="quantity" value="<%=rs.getString("QUANTITY")%>"  placeholder="Product Quantity">
							</div>
                                                         <div class="col-md-5 form-group">
                                                            <input type="text" class="form-control" id="size" name="size"  value="<%=rs.getString("SIZES")%>" placeholder="Size">
                                                         </div>
						
                                                        <div class="col-md-12 form-group">
								<input type="text" class="form-control" id="desc" name="desc" value="<%=rs.getString("PR_DESC")%>" placeholder="Product Description">
							</div>
                                                        <div class="col-md-6 form-group">
								<input type="number" class="form-control" id="price" name="price" value="<%=rs.getString("PRICE")%>" placeholder="Product Price">
							</div>
                                                         <div class="col-md-6 form-group">
								<input type="number" class="form-control" id="price" name="stock" value="<%=rs.getString("STOCK")%>" placeholder="Stock">
							</div>
                                                       <div class="col-md-12 form-group">
								<input type="text" class="form-control" id="mfg" name="mfg" value="<%=rs.getString("MFG")%>" placeholder="Product Manufactured Date">
							</div>
<!--                                                        <div class="col-md-12 form-group">
								<input type="file" class="form-control" id="image" name="image" value="<%=rs.getString("PROD_IMG")%>"placeholder="Upload Image">
							</div>-->
							
							<div class="col-md-12 form-group">
								<button type="submit" value="submit" class="btn submit_btn">CHANGE PRODUCT</button>
                                                               
							</div>
						</form>
					</div>
				
			</div>
		</div>
	</section>
	<!--================End Login Box Area =================-->
          <!-- Footer section -->
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
							<li><a href="MenWearSuit.jsp">Men's Wear Tredy Suits</a></li>
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
<p class="text-white text-center mt-5">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved <img src="img/Heart.png" width="25" height="25">  by <a href="homepage.html" target="_blank">Mobshop Clothing</a></p>
			</div>
		</div>
	</section>
	<!-- Footer section end -->
        	<!-- JSP CODE END HERE -->
        <%
            }
            ps.close();
            con.close();            
        }
        catch(Exception ex){
            out.println(ex);
        }
        %>           
</body>
</html>