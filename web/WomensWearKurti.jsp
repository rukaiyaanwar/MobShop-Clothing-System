<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
<head>
	<title>Women's Wear : Jeans</title>
	<meta charset="UTF-8">	
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- Google Font -->
	<!--<link href="https://fonts.googleapis.com/css?family=Josefin+Sans:300,300i,400,400i,700,700i" rel="stylesheet">-->

	<!-- Stylesheets -->
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/font-awesome.min_1.css"/>
	<link rel="stylesheet" href="css/flaticon.css"/>
	<link rel="stylesheet" href="css/slicknav.min.css"/>
	<link rel="stylesheet" href="css/jquery-ui.min.css"/>
	<link rel="stylesheet" href="css/owl.carousel.min.css"/>
	<link rel="stylesheet" href="css/animate.css"/>
	<link rel="stylesheet" href="css/style_1.css"/>
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


	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->

</head>
<body onload="return validate()">
    
        <%@page import="java.io.*,java.sql.*" %>
        <%! int temp; %>
        <%
            if((session.getAttribute("customer_id")==null)||(session.getAttribute("customer_id")=="")){								
                     temp=1;          
                //document.getElementById("beforeLogin").style.display = "block"; document.getElementById("afterLogin").style.display = "none";                
            }else{	
                temp=0;
		//out.println(" document.getElementById("beforeLogin").style.display = "none"; document.getElementById("afterLogin").style.display = "block";	");					
            }
        %>
   <!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Header section -->
	
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
					<div class="col-xl-4 col-lg-5" id="beforeLogin">
						<div class="user-panel">
							<div class="up-item">
								<i class="flaticon-profile"></i>
								<a href="login.html">Sign</a> In or <a href="registration.html">Create Account</a>
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
							</div>                    &nbsp; &nbsp; &nbsp; &nbsp;                                
							<div class="up-item" onclick="return logout()">
								<i class="flaticon-profile"></i>
								<a href="#"  > Logout </a> 
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
					<li><a href="MenWear.html">Men<span class="new">New</span></a>
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
                     &nbsp;&nbsp;&nbsp;
             <div  class="section-title">
                            &nbsp;&nbsp;&nbsp;
                            <h2 style="font-size: 20px" class="fw-title">KURTI COLLECTION</h2>
			</div>
	<!-- Category section -->
	<section class="category-section spad">
		<div class="container">
			<div class="row"  >
				<div class="col-lg-3 order-2 order-lg-1">
					<div class="filter-widget">
						<h2 class="fw-title">Categories</h2>
						<ul class="category-menu">							
							<li><a href="WomensWearJeans.jsp">Women's Wear Jeans</a>
								
							</li>
                                                        <li><a href="WomenWearJacket.jsp">Women's Wear Jacket</a>
								
							</li>
                                                        <li><a href="WomenWearJumpsuit.jsp">Jumpsuits</a>
								
							</li>
							<li><a href="WomenWearEthnic.jsp">Ethnic Wear</a>
								</li>
							<li><a href="WomensWearKurti.jsp">Stylist Kurti</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-9  order-1 order-lg-2 mb-5 mb-lg-0">
					<div class="row">
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<div class="tag-sale">ON SALE</div>
									<img src="./img/product/kurti1.jpg" alt="">
									<div class="pi-links">
										<a href="AddtoCart.jsp?prod=1026" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
									<h6>Rs.2,499/-</h6>
									<p>Embroidered Black & Red Stylish Kurti </p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<img src="./img/product/kurti2.jpg" alt="">
									<div class="pi-links">
										<a href="AddtoCart.jsp?prod=1027" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
									<h6>Rs.3,999/-</h6>
									<p>Multicolor Trendy Long Kurti</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<img src="./img/product/kurti3.jpg" alt="">
									<div class="pi-links">
										<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
									<h6>Rs.1,999/-</h6>
									<p>Green Long Kurti </p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<img src="./img/product/kurti4.jpg" alt="">
									<div class="pi-links">
										<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
									<h6>Rs.2,499/-</h6>
									<p>Maroon Dress</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<img src="./img/product/kurti5.jpg" alt="">
									<div class="pi-links">
										<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
									<h6>Rs.3,599/-</h6>
									<p>Maroon Print Long Dress</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<img src="./img/product/kurti6.jpg" alt="">
									<div class="pi-links">
										<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
									<h6>Rs.3,999/-</h6>
									<p>Grey Printed Kurti</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<img src="./img/product/kurti7.jpg" alt="">
									<div class="pi-links">
										<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
									<h6>Rs.3,999/-</h6>
									<p>Black Printed Kurti</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<img src="./img/product/kurti8.jpg" alt="">
									<div class="pi-links">
										<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
									<h6>Rs.3,599/-</h6>
									<p>Black Embroidered Kurti</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<img src="./img/product/kurti9.jpg" alt="">
									<div class="pi-links">
										<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
                                                                    <h6>Rs.2,999/-</h6>
									<p>Blue Printed Dress</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<div class="tag-new">new</div>
									<img src="./img/product/kurti10.jpg" alt="">
									<div class="pi-links">
										<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
									<h6>Rs.3,499/-</h6>
									<p>Yellow Dotted Kurti</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<img src="./img/product/kurti11.jpg" alt="">
									<div class="pi-links">
										<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
									<h6>Rs.1,699/-</h6>
									<p>White & Pink Printed Kurti</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<img src="./img/product/kurti12.jpg" alt="">
									<div class="pi-links">
										<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
										<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
									</div>
								</div>
								<div class="pi-text">
									<h6>Rs.5,999/-</h6>
									<p>White Designer Indian Style Kurti</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Category section end -->
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
<p class="text-white text-center mt-5">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved <img src="img/Heart.png" width="25" height="25">  by <a href="homepage.html" target="_blank">Mobshop Clothing</a></p>
			</div>
		</div>
	</section>
	<!-- Footer section end -->



	<!--====== Javascripts & Jquery ======-->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.slicknav.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.nicescroll.min.js"></script>
	<script src="js/jquery.zoom.min.js"></script>
	<script src="js/jquery-ui.min.js"></script>
	<script src="js/main.js"></script>
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