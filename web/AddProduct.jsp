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
                                            <img class="img-fluid" src="img/product/jacket08.jpg" width="600" height="300"alt="">
						<div class="hover">
							<h4>MOBSHOP CLOTHING</h4>
							<p>WE BRING QUALITY TO YOU!</p>
							
						</div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="login_form_inner reg_form">
						<h3>ADD PRODUCT</h3>
						<form class="row login_form" action="ADDPRODUCTDB.jsp" method="get" >
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
								<input type="text" class="form-control" name="ftr1" placeholder="Product Feature 1">
							</div>
                                                        <div class="col-md-6 form-group">
								<input type="text" class="form-control" name="ftr2" placeholder="Product Feature 2">
							</div>
                                                        <div class="col-md-6 form-group">
								<input type="text" class="form-control" name="ftr3" placeholder="Product Feature 3">
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
      <section class="container" style="background-color: #282828;" >
            <p class="text-white text-center mt-5">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved <img src="img/Heart.png" width="25" height="25">  by <a href="homepage.html" target="_blank">Mobshop Clothing</a></p>
	</section>
	<!-- Footer section end -->
</body>
</html>