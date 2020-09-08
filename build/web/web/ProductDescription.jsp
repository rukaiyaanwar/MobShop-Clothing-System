<%-- 
    Document   : ProductDescription
    Created on : Sep 9, 2019, 8:47:19 PM
    Author     : Virus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">
<head>
	<title>MobShop Clothing</title>
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

        <%@page import="java.util.*" %>
        <%@page import="java.sql.*" %>
        <%@page import="java.io.*" %>
        <%! String searchkey,prod_title,prod_img, stock;int prod_id,price; %>
        <%
            searchkey = request.getParameter("prod_id");            
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
            String qry = "select * from mobshop.product where prod_id='"+searchkey+"' ";                
            PreparedStatement ps = con.prepareStatement(qry);
            ResultSet rs = ps.executeQuery(qry);
                                                            
        %>
        
</head>
<body>
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
						<a href="./homepage.html" class="site-logo">
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
					<li><a href="homepage.html">Home</a></li>
					<li><a href="#">Women<span class="new">New</span></a>
						<ul class="sub-menu">
							<li><a href="WomensWearJeans.html">Jeans</a></li>
							<li><a href="WomenWearJacket.html">Jackets</a></li>
							<li><a href="WomenWearEthnic.html">Ethnic Wear</a></li>
							<li><a href="WomensWearKurti.html">Kurti</a></li>
							<li><a href="WomenWearJumpsuit.html">JumpSuit</a></li>
						</ul>					

					</li>
					<li><a href="#">Men<span class="new">New</span></a>
						<ul class="sub-menu ">
							<li><a href="MensWearshirts.html">Shirts</a></li>
							<li><a href="MenWearSuit.html">Suits</a></li>
							<li><a href="MensWearJackets.html">Jackets</a></li>
							<li><a href="MensWearTshirt.html">T-Shirt</a></li>
							<li><a href="MensWearJeans.html">Jeans</a></li>
						</ul>					
					</li>
					<li><a href="#">Child Collection</a>
						<ul class="sub-menu">
							<li><a href="KidsWearJeans.html">Kids Collections</a></li>
							
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
			<h4>Category Page</h4>
			<div class="site-pagination">
				<a href="">Home</a> /
				<a href="">Shop</a>
			</div>
		</div>
	</div>
	<!-- Page info end -->

	<!-- product section -->
	<section class="product-section">
		<div class="container">
			<div class="back-link">
				<a href=".//WomensWearJeans.html"> &lt;&lt; Back to Category</a>
			</div>
			<div class="row">                                                                                        
<!--                            JSP Code Start From Here                                                                    -->                            
<%                            
if(rs.next()){
    

%>
<!--                            JSP Code End Here                                                                    -->                                                        

				<div class="col-lg-6">
					<div class="product-pic-zoom">
						<img class="product-big-img" src="img/product/<%=rs.getString("PROD_IMG")%>" alt="">
					</div>
					<div class="product-thumbs" tabindex="1" style="overflow: hidden; outline: none;">
						<div class="product-thumbs-track">
							<div  data-imgbigurl="img/product/jeans7.jpg"></div>
                                                            <!--<img src="img/product/jeans7.jpg" alt="">-->
<!--							<div class="pt" data-imgbigurl="img/product/j71.jpg"><img src="img/product/j71.jpg" alt=""></div>
							<div class="pt" data-imgbigurl="img/product/j72.jpg"><img src="img/product/j72.jpg" alt=""></div>
							<div class="pt" data-imgbigurl="img/product/j73.jpg"><img src="img/product/j73.jpg" alt=""></div>-->
						</div>
					</div>
				</div>
				<div class="col-lg-6 product-details">
					<h2 class="p-title"><%=rs.getString("PROD_NAME")%></h2>
					<h3 class="p-price">Rs <%=rs.getString("PRICE")%></h3>
                                        <%
                                            if(rs.getInt("STOCK")>0){
                                                stock = "In Stock";
                                            }else{
                                                stock = "Out Of Stock ";
                                            }
                                        
                                        %>
					<h4 class="p-stock">Available: <span><%= stock %></span></h4>
					<div class="p-rating">
						<i class="fa fa-star-o"></i>
						<i class="fa fa-star-o"></i>
						<i class="fa fa-star-o"></i>
						<i class="fa fa-star-o"></i>
						<i class="fa fa-star-o fa-fade"></i>
					</div>
                                        <h5>Key Feature</h5><br />
                                        <div>
                                            <p><%=rs.getString("PR_FTR1")%></p>
                                            <p><%=rs.getString("PR_FTR2")%></p>
                                            <p><%=rs.getString("PR_FTR3")%></p><br />
                                        </div>
                                        <!-- form data will start from here-->
                                        <form action="Checkout.jsp" method="get">     
                                            <input type="hidden" name="prod_id"  value="<%=rs.getString("PROD_ID")%>">                                                                                        
                                            <input type="hidden" name="price"  value="<%=rs.getString("PRICE")%>">
                                            <input type="hidden" name="img"  value="<%=rs.getString("PROD_IMG")%>">                                           
                                            <input type="hidden" name="name"  value="<%=rs.getString("PROD_NAME")%>">
                                            <div class="fw-size-choose">
                                                <p>Size</p>
                                                <div class="sc-item">
                                                        <input type="radio" name="sc" value="xs-size" id="xs-size">
                                                        <label for="xs-size">XS</label>
                                                </div>
                                                
                                                <div class="sc-item">
                                                    <input type="radio" name="sc" value="s-size" id="s-size">
                                                        <label for="s-size">S</label>
                                                </div>
                                                <div class="sc-item">
                                                    <input type="radio" name="sc" value="m-size" id="m-size" checked="">
                                                        <label for="m-size">M</label>
                                                </div>
                                                <div class="sc-item">
                                                    <input type="radio" name="sc" value="l-size" id="l-size">
                                                        <label for="l-size">L</label>
                                                </div>
                                                <div class="sc-item">
                                                    <input type="radio" name="sc" value="xl-size" id="xl-size" >
                                                        <label for="xl-size">XL</label>
                                                </div>
                                                <div class="sc-item">
                                                    <input type="radio" name="sc" value="xxl-size" id="xxl-size">
                                                        <label for="xxl-size">XXL</label>
                                                </div>
                                            </div>
                                            <div class="quantity">
                                                <p>Quantity</p>
                                                <div class="pro-qty">
                                                    <input type="text"  min="1" max="10" maxlength="2" name="quantity" value="1">
                                                </div>
                                            </div>
                                            <input type="submit" value="Shop Now" class="site-btn">
                                        </form>
					<div id="accordion" class="accordion-area">
						<div class="panel">
							<div class="panel-header" id="headingOne">
								<button class="panel-link active" data-toggle="collapse" data-target="#collapse1" aria-expanded="true" aria-controls="collapse1">Product Description</button>
							</div>
							<div id="collapse1" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
								<div class="panel-body">
									<p><%=rs.getString("PR_DESC")%></p>
								</div>
							</div>
						</div>
						<div class="panel">
							<div class="panel-header" id="headingThree">
								<button class="panel-link" data-toggle="collapse" data-target="#collapse3" aria-expanded="false" aria-controls="collapse3">shipping & Returns</button>
							</div>
							<div id="collapse3" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
								<div class="panel-body">
									<h4>7 Days Returns</h4>
									<p>Cash on Delivery Available<br>Home Delivery <span>3 - 4 days</span></p>
									<p>FOR RETURN OF PRODUCT PLEASE CALL ON - 0122-245451 </p>
								</div>
							</div>
						</div>
					</div>
					
				</div>
			</div>
		</div>
	</section>
	<!-- product section end -->

	<!-- RELATED PRODUCTS section -->
	<section class="related-product-section">
		<div class="container">
			<div class="section-title">
				<h2>RELATED PRODUCTS</h2>
			</div>
			<div class="product-slider owl-carousel">
				<div class="product-item">
					<div class="pi-pic">
						<img src="./img/product/jeans1.jpg" alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					<div class="pi-text">
						<h6>$35,00</h6>
						<p>Flamboyant Pink Top </p>
					</div>
				</div>
				<div class="product-item">
					<div class="pi-pic">
						<div class="tag-new">New</div>
						<img src="./img/product/jacket2.jpg" alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					<div class="pi-text">
						<h6>$35,00</h6>
						<p>Black and White Stripes Dress</p>
					</div>
				</div>
				<div class="product-item">
					<div class="pi-pic">
						<img src="./img/product/jacket02.jpg" alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					<div class="pi-text">
						<h6>$35,00</h6>
						<p>Flamboyant Pink Top </p>
					</div>
				</div>
				<div class="product-item">
						<div class="pi-pic">
							<img src="./img/product/jumpsuit1.jpg" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>$35,00</h6>
							<p>Flamboyant Pink Top </p>
						</div>
					</div>
				<div class="product-item">
					<div class="pi-pic">
						<img src="./img/product/jacket03.jpg" alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					<div class="pi-text">
						<h6>$35,00</h6>
						<p>Flamboyant Pink Top </p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- RELATED PRODUCTS section end -->
        
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


