<!DOCTYPE html>
<html lang="zxx">
<head>
	<title>MOBSHOP CLOTHING</title>
	<meta charset="UTF-8">
	<meta name="description" content=" Divisima | eCommerce Template">
	<meta name="keywords" content="divisima, eCommerce, creative, html">
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

    <%! String name,img,size; int price,qty,prod_id; %>
    <% 
        name = request.getParameter("name");   //Retrieve name
        size = request.getParameter("sc");     //Retrieve Sizes
        img = request.getParameter("img");     //Retrieve image
        price = Integer.parseInt(request.getParameter("price"));  //Retrieve price
        prod_id = Integer.parseInt(request.getParameter("prod_id"));  //Retrieve product ID.
        qty = Integer.parseInt(request.getParameter("quantity"));     //Retrieve quantity
        int totalPrice = qty*price;                 //Retrieve totalprice
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
                                            <form class="header-search-form" action="searchProduct.jsp" method="get">
                                                <input type="text" name="searchKeywordRukaiya" placeholder="Search on mobshop ....">
                                                <button><i class="flaticon-search"></i></button>
                                            </form>
					</div>
					
					
					<div class="col-xl-4 col-lg-5" id="afterLogin">
						<div class="user-panel" >
							<div class="up-item"  >
								<div class="shopping-card">
									<i class="flaticon-bag"></i>
									<span>1</span>
								</div>
								<a href="#">Shopping Cart</a>
							</div>
                                                    <div class="up-item" id="afterLogin"  >
								<i class="flaticon-profile"></i>
								<a href="myaccount.jsp">My Account</a>
							</div>         &nbsp; &nbsp; &nbsp;                                          
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
					<li><a href="#">Pages</a>
						<ul class="sub-menu">
							<li><a href="./product.html">Product Page</a></li>
							<li><a href="./category.html">Category Page</a></li>
							<li><a href="./cart.html">Cart Page</a></li>
							<li><a href="./checkout.html">Checkout Page</a></li>
							<li><a href="./contact.html">Contact Page</a></li>
						</ul>
					</li>
					<li><a href="contact.html">Contact Us</a></li>
				</ul>
			</div>
		</nav>
	</header>



	<!-- Page info -->
	<div class="page-top-info">
		<div class="container">
			<h4>Your cart</h4>
			<div class="site-pagination">
				<a href="">Home</a> /
				<a href="">Your cart</a>
			</div>
		</div>
	</div>
	<!-- Page info end -->


	<!-- checkout section  -->
	<section class="checkout-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 order-2 order-lg-1">
                                    <form class="checkout-form" action="OrderPlacedCOD.jsp" method="get">
                                            <div class="cf-title">Billing Address</div>
                                            <div class="row">
                                                    <div class="col-md-7">
                                                            <p>*Billing Information</p>
                                                    </div>

                                            </div>
                                            <div class="row address-inputs">
                                                <input type="hidden" name="prod_id" value="<%= prod_id %>" />
                                                <input type="hidden" name="name" value="<%= name %>" />
                                                <input type="hidden" name="qty" value="<%= qty %>" />
                                                <input type="hidden" name="price" value="<%= price %>" />
                                                <input type="hidden" name="totalprice" value="<%= totalPrice %>" />
                                                <div class="col-md-12">
                                                        <input type="text" placeholder="Address" name="address">
                                                        <input type="text" placeholder="Address line 2" name="address2">
                                                        <input type="text" placeholder="Country" name="country">
                                                </div>
                                                <div class="col-md-6">
                                                        <input type="text" placeholder="Zip code" name="zip">
                                                </div>
                                                <div class="col-md-6">
                                                    <input type="text" placeholder="Phone no." name="phno">
                                                </div>
                                            </div>                                                                                               
                                            <div class="cf-title">Select Payment Mode</div>
                                            <div class="row shipping-btns">
                                                <div class="col-6">
                                                        <h4>Cash On Delivery (COD)</h4>
                                                </div>
                                                <div class="col-6">
                                                        <div class="cf-radio-btns">
                                                                <div class="cfr-item">
                                                                    <input id="placeOrder" type="radio" name="shipping" value="COD"  onclick="selectCOD()" >
                                                                        <label for="placeOrder">&#8377; 40/- </label>
                                                                </div>
                                                        </div>
                                                </div>
                                                <div class="col-6">
                                                    <h4>Credit / Debit card <img style="margin-left: 10px;" src="img/mastercart.png" alt="">  </h4>
                                                </div>
                                                <div class="col-6">
                                                        <div class="cf-radio-btns">
                                                                <div class="cfr-item">
                                                                    <input id="payment" type="radio" name="shipping" value="Online" onclick="selectOnline()" id="ship-2">
                                                                        <label for="payment">free</label>
                                                                </div>
                                                        </div>
                                                </div>
                                            </div>
                                            <button id="paymentButton" class="site-btn submit-order-btn" style="display:none;" formaction="OrderPlacedWithCard.jsp" formmethod="GET" >Proceed to Payment</button>
                                            <button id="placeOrderButton" class="site-btn submit-order-btn" style="display:none;"  >Place Order</button>
					</form>
				</div>
        
				<div class="col-lg-4 order-1 order-lg-2">
					<div class="checkout-cart">
						<h3>Your Cart</h3>
						<ul class="product-list">
							<li>
                                                            <div class="pl-thumb"><img src="img/product/<%= img %>" alt=""></div>
                                                            <h6><b><%= name %></b></h6>
                                                            <p><b>&#8377; <%= price %></b></p>
                                                            <p><b>Qty : <%= qty %></b></p>
							</li>
						</ul>
						<ul class="price-list">
							<li>Total<span><b>&#8377; <%= totalPrice %></b></span></li>
							<li>Shipping<span>free</span></li>
							<li class="total">Total<span>&#8377; <%= totalPrice %></span></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- checkout section end -->

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
							<li><a href="tracking.jsp">Track</a></li>
							<li><a href="">Returns Policy</a></li>
							<li><a href="">Terms & Conditions</a></li>
						
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="footer-widget contact-widget">
						<h2>Address</h2>
                                                <p>MobShop Clothing Pvt. Ltd. New Delhi, India.
					</div>
				</div>
			</div>
		</div>		
<p class="text-white text-center mt-5">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved <img src="img/Heart.png" width="25" height="25">  by <a href="homepage.html" target="_blank">Mobshop Clothing</a></p>
			</div>
		</div>
	</section>



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
        
        <script type="text/javascript">
            function selectCOD(){
                document.getElementById("placeOrderButton").style.display ="block";
                document.getElementById("paymentButton").style.display ="none";
            }
            
            function selectOnline(){
                document.getElementById("placeOrderButton").style.display ="none";
                document.getElementById("paymentButton").style.display ="block";
            }                      
        </script>
</html>
