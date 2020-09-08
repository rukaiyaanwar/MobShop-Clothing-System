<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
<head>
	<title>Men's Wear</title>
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
							</div>                      &nbsp; &nbsp; &nbsp; &nbsp;                            
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
        <!-- Hero section -->
	<section class="hero-section">
		<div class="hero-slider owl-carousel">
			<div class="hs-item set-bg" data-setbg="img/bg.jpg">
				<div class="container">
					<div class="row">
						<div class="col-xl-6 col-lg-7 text-white">
							<span>New Arrivals</span>
							<h2>MobShop Clothing</h2>
							<p>An ONLINE MOBSHOP CLOTHING SYSTEM is the process that the customer directly buy products over the internet. As we go to the market , visit all the shop, look at all the products and then we choose something just for the need without even liking it in real.</p>
							<a href="#" class="site-btn sb-line">DISCOVER</a>
							<a href="#" class="site-btn sb-white">ADD TO CART</a>
						</div>
					</div>
					<div class="offer-card text-white">
						 <h6>Just for </h6>
						<h2>999</h2>
						<p>SHOP NOW</p>
					</div>
				</div>
			</div>
			<div class="hs-item set-bg" data-setbg="img/bg-2.jpg">
				<div class="container">
					<div class="row">
						<div class="col-xl-6 col-lg-7 text-white">
							<span>New Arrivals</span>
							<h2>MobShop Clothing</h2>
							<p>An ONLINE MOBSHOP CLOTHING SYSTEM is the process that the customer directly buy products over the internet. As we go to the market , visit all the shop, look at all the products and then we choose something just for the need without even liking it in real.</p>
							<a href="#" class="site-btn sb-line">DISCOVER</a>
							<a href="#" class="site-btn sb-white">ADD TO CART</a>
						</div>
					</div>
					<div class="offer-card text-white">
						<span>from</span>
						<h2>999</h2>
						<p>SHOP NOW</p>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="slide-num-holder" id="snh-1"></div>
		</div>
	</section>
	<!-- Hero section end -->
        <div  class="section-title">
                            &nbsp;&nbsp;&nbsp;
                            <h2 class="fw-title">MEN'S WEAR</h2>
			</div>
	<!-- Category section -->
	<section class="category-section spad">
		<div class="container">
			<div class="row"  >
				<div class="col-lg-3 order-2 order-lg-1">
					<div class="filter-widget">
						<h2 class="fw-title">Categories</h2>
						<ul class="category-menu">							
							<li><a href="MensWearJeans.jsp">Men's Wear Jeans</a>
								
							</li>
                                                        <li><a href="MensWearJackets.jsp">Men's Wear Jacket</a>
								
							</li>
                                                        <li><a href="MenWearSuit.jsp">Suits</a>
								
							</li>
							<li><a href="MensWearshirts.jsp">Shirts</a>
								</li>
							<li><a href="MensWearTshirt.jsp">T-Shirt</a></li>
						</ul>
					</div>
				</div>

				<div class="col-lg-9  order-1 order-lg-2 mb-5 mb-lg-0">
					<div class="row">
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">	                                                                   
                                                                        <img src="./img/product/shirt1.jpg" alt="">
									<div class="pi-links">
                                                                            <a href="" class="add-card"><i class="flaticon-bag"></i><span>Shop Now!</span></a>
										<a href="MensWearshirts.jsp" class="add-card"><img src='img/logo.png'><span></span></a>						
									</div>
								</div>
								<div class="pi-text">									
                                                                    <p style="text-align: center">Men's Wear Jeans</p>
								</div>
							</div>
						</div>
                                            
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
                                                                    <img src="./img/product/jacket11.jpg" alt="">
									<div class="pi-links">
                                                                            <a href="" class="add-card"><i class="flaticon-bag"></i><span>Shop Now!</span></a>
                                                                            <a href="MensWearJackets.jsp" class="add-card"><img src='img/logo.png'><span></span></a>
										
									</div>
								</div>
								<div class="pi-text">
									
                                                                    <p style="text-align: center">Men's Wear Jacket</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
                                                                    <div class="tag-sale">TRENDING</div>
									<img src="./img/product/suit3.jpg" alt="">
									<div class="pi-links">
                                                                            <a href="" class="add-card"><i class="flaticon-bag"></i><span>Shop Now!</span></a>
										<a href="MenWearSuit.jsp" class="add-card"><img src='img/logo.png'><span></span></a>
										
									</div>
								</div>                                                            
								<div class="pi-text">
									
                                                                    <p style="text-align: center">Men's Wear Suits</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
									<img src="./img/product/tshirt10.jpg" alt="">
									<div class="pi-links">
                                                                            <a href="" class="add-card"><i class="flaticon-bag"></i><span>Shop Now!</span></a>
                                                                            <a href="MensWearTshirt.jsp" class="add-card"><img src='img/logo.png'><span></span></a>
									</div>
								</div>
								<div class="pi-text">
									
                                                                    <p style="text-align: center">T-Shirts</p>
								</div>
							</div>
						</div>
						
						<div class="col-lg-4 col-sm-6">
							<div class="product-item">
								<div class="pi-pic">
                                                                    <div class="tag-sale">TRENDING</div>
									<img src="./img/product/jeans03.jpg" alt="">
									<div class="pi-links">
                                                                            <a href="" class="add-card"><i class="flaticon-bag"></i><span>Shop Now!</span></a>
										<a href="MensWearJeans.jsp" class="add-card"><img src='img/logo.png'><span></span></a>
										
									</div>
								</div>
								<div class="pi-text">
									
                                                                    <p style="text-align: center">Men's Wear Jeans</p>
								</div>
							</div>
                                                   
				</div>
                                           
			</div>
		</div>
	</section>
	<!-- Category section end -->
        
	<!-- RELATED PRODUCTS section -->
	<section class="related-product-section">
		<div class="container">
			<div class="section-title">
				<h2>RELATED PRODUCTS</h2>
			</div>
			<div class="product-slider owl-carousel">
				<div class="product-item">
					<div class="pi-pic">
						<img src="./img/product/jacket1.jpg" alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					
				</div>
				<div class="product-item">
					<div class="pi-pic">
						<div class="tag-new">New</div>
						<img src="./img/product/suit5.jpg" alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					
				</div>
				<div class="product-item">
					<div class="pi-pic">
						<img src="./img/product/tshirt11.jpg" alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					
				</div>
				<div class="product-item">
						<div class="pi-pic">
							<img src="./img/product/shirt10.jpg" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						
					</div>
				<div class="product-item">
					<div class="pi-pic">
						<img src="./img/product/jacket7.jpg" alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
                                                
					</div>
					<div class="pi-text">
						
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- RELATED PRODUCTS section end -->
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
