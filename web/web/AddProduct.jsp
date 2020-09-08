<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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
				</div>
			</div>
		</div>
		<nav class="main-navbar">
			<div class="container">
				<!-- menu -->
				<ul class="main-menu">
					<li><a href="Admin.html">Home</a></li>
					<li><a href="">Product</a>
						<ul class="sub-menu">
							<li><a href="AddProduct.html">Add Product</a></li>
							<li><a href="UpdateProduct.html">Update Product</a></li>
							<li><a href="DeleteProduct.html">Delete Product</a></li>							
						</ul>					

					</li>
					<li><a href="MenWear.html">Order<span class="new">New</span></a>
						<ul class="sub-menu ">
							<li><a href="MensWearshirts.html">Active Order</a></li>
							<li><a href="MenWearSuit.html">Cancel Order</a></li>
							<li><a href="MensWearJackets.html">Update Product</a></li>							
						</ul>					
					</li>
					<li><a href="#">Payment</a>
						<ul class="sub-menu">
							<li><a href="KidsWearJeans.html">Debit Card</a></li>
							
						</ul>
					</li>
					<li><a href="#">Customer</a>
						<ul class="sub-menu">
							<li><a href="./product.html">Update Customer</a></li>
							
						</ul>
					</li>
					<li><a href="contact.html">Track</a></li>
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
                                            <img class="img-fluid" src="img/product/jacket03.jpg" width="600" height="300"alt="">
						<div class="hover">
							<h4>New to our website?</h4>
							<p>There are advances being made in science and technology everyday, and a good example of this is the</p>
							
						</div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="login_form_inner reg_form">
						<h3>ADD PRODUCT</h3>
						<form class="row login_form" action="addprod.jsp" method="get" >
							<div class="col-md-6 form-group">
								<input type="text" class="form-control" id="name" name="name" placeholder="Product Name">
							</div>
							
							<div class="col-md-6 form-group">
								<input type="text" class="form-control" id="brand" name="brand" placeholder="Brand">
							</div>
                                                        <div class="col-md-7 form-group">
								<input type="text" class="form-control" id="category" name="category" placeholder="Product Category">
							</div>
                                                        <div class="col-md-5 form-group">
								<input type="text" class="form-control" name="prod_id" placeholder="Product ID">
							</div>
                                                         <div class="col-md-6 form-group">
								<input type="text" class="form-control" name="maurya" placeholder="Product Feature 1">
							</div>
                                                        <div class="col-md-6 form-group">
								<input type="text" class="form-control" name="maurya2" placeholder="Product Feature 2">
							</div>
                                                        <div class="col-md-6 form-group">
								<input type="text" class="form-control" name="maurya3" placeholder="Product Feature 3">
							</div>
                                                        <div class="col-md-6 form-group">
								<input type="text" class="form-control" id="pr_skey" name="pr_skey" placeholder="Search Keyword">
							</div>
                                                        <div class="col-md-7 form-group">
								<input type="number" class="form-control" id="amount" name="quantity" placeholder="Product Quantity">
							</div>
                                                         <div class="col-md-5 form-group">
                                                            <input type="text" class="form-control" id="size" name="size" placeholder="Size">
                                                         </div>
						
                                                        <div class="col-md-12 form-group">
								<input type="text" class="form-control" id="desc" name="desc" placeholder="Product Description">
							</div>
                                                        <div class="col-md-6 form-group">
								<input type="number" class="form-control" id="price" name="price" placeholder="Product Price">
							</div>
                                                         <div class="col-md-6 form-group">
								<input type="number" class="form-control" id="price" name="stock" placeholder="Stock">
							</div>
                                                       <div class="col-md-12 form-group">
								<input type="text" class="form-control" id="mfg" name="mfg" placeholder="Product Manufactured Date">
							</div>
                                                        <div class="col-md-12 form-group">
								<input type="file" class="form-control" id="image" name="image" placeholder="Upload Image">
							</div>
							
							<div class="col-md-12 form-group">
								<button type="submit" value="submit" class="btn submit_btn">ADD PRODUCT</button>
                                                               
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
</body>
</html>