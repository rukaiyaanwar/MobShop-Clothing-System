package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class KidsWearJeans_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int temp; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Kids Wear</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\t\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<!-- Google Font -->\n");
      out.write("\t<!--<link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans:300,300i,400,400i,700,700i\" rel=\"stylesheet\">-->\n");
      out.write("\n");
      out.write("\t<!-- Stylesheets -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min_1.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/flaticon.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/slicknav.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style_1.css\"/>\n");
      out.write("        <script>\n");
      out.write("        function validate(){\n");
      out.write("                if(");
      out.print( temp );
      out.write("===1){\n");
      out.write("                    document.getElementById(\"beforeLogin\").style.display = \"block\"; \n");
      out.write("                    document.getElementById(\"afterLogin\").style.display = \"none\";                \n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    document.getElementById(\"beforeLogin\").style.display = \"none\"; \n");
      out.write("                    document.getElementById(\"afterLogin\").style.display = \"block\";\n");
      out.write("                }\n");
      out.write("                return true;                    \n");
      out.write("            }    \n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t\t  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("\t  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body onload=\"return validate()\">\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            if((session.getAttribute("customer_id")==null)||(session.getAttribute("customer_id")=="")){								
                     temp=1;          
                //document.getElementById("beforeLogin").style.display = "block"; document.getElementById("afterLogin").style.display = "none";                
            }else{	
                temp=0;
		//out.println(" document.getElementById("beforeLogin").style.display = "none"; document.getElementById("afterLogin").style.display = "block";	");					
            }
        
      out.write("\n");
      out.write("   <!-- Page Preloder -->\n");
      out.write("\t<div id=\"preloder\">\n");
      out.write("\t\t<div class=\"loader\"></div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- Header section -->\n");
      out.write("\t<header class=\"header-section\">\n");
      out.write("\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-2 text-center text-lg-left\">\n");
      out.write("\t\t\t\t\t\t<!-- logo -->\n");
      out.write("\t\t\t\t\t\t<a href=\"./homepage.jsp\" class=\"site-logo\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/logo.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-6 col-lg-5\">\n");
      out.write("\t\t\t\t\t\t<form class=\"header-search-form\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search on mobshop ....\">\n");
      out.write("\t\t\t\t\t\t\t<button><i class=\"flaticon-search\"></i></button>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-4 col-lg-5\" id=\"beforeLogin\">\n");
      out.write("\t\t\t\t\t\t<div class=\"user-panel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"up-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"flaticon-profile\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"login.html\">Sign</a> In or <a href=\"registration.html\">Create Account</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"up-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"shopping-card\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"flaticon-bag\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>0</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Shopping Cart</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-4 col-lg-5\" id=\"afterLogin\">\n");
      out.write("\t\t\t\t\t\t<div class=\"user-panel\" >\n");
      out.write("\t\t\t\t\t\t\t<div class=\"up-item\"  >\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"shopping-card\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"flaticon-bag\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>0</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Shopping Cart</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                    <div class=\"up-item\" id=\"afterLogin\"  >\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"flaticon-profile\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"myaccount.jsp\">My Account</a>\n");
      out.write("\t\t\t\t\t\t\t</div>                                                   \n");
      out.write("\t\t\t\t\t\t\t<div class=\"up-item\" onclick=\"return logout()\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"flaticon-profile\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"  > Logout </a> \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<nav class=\"main-navbar\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<!-- menu -->\n");
      out.write("\t\t\t\t<ul class=\"main-menu\">\n");
      out.write("\t\t\t\t\t<li><a href=\"homepage.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"WomenWear.html\">Women<span class=\"new\">New</span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomensWearJeans.jsp\">Jeans</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWearJacket.jsp\">Jackets</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWearEthnic.jsp\">Ethnic Wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomensWearKurti.jsp\">Kurti</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWearJumpsuit.jsp\">JumpSuit</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"MenWear.jsp\">Men<span class=\"new\">New</span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu \">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearshirts.jsp\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MenWearSuit.jsp\">Suits</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearJackets.jsp\">Jackets</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearTshirt.jsp\">T-Shirt</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearJeans.jsp\">Jeans</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Child Collection</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"KidsWearJeans.jsp\">Kids Collections</a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Pages</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./product.html\">Product Page</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./category.html\">Category Page</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./cart.html\">Cart Page</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./checkout.html\">Checkout Page</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./contact.html\">Contact Page</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("\t<!-- Category section -->\n");
      out.write("\t<section class=\"category-section spad\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\"  >\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 order-2 order-lg-1\">\n");
      out.write("\t\t\t\t\t<div class=\"filter-widget\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"fw-title\">Categories</h2>\n");
      out.write("\t\t\t\t\t\t<ul class=\"category-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWear.html\">Woman wear</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"WomensWearJeans.html\">Women's Wear Jeans <span>(2)</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"WomensWearKurti.html\">Stylish Kurti<span>(56)</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"WomenWearEthnic.html\">Ethnic Dress <span>(36)</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"WomenWearJacket.html\">Women's Wear Jacket<span>(27)</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"WomenWearJumpsuit.html\">Jumpsuits<span>(19)</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Man Wear</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"MensWearJeans.html\">Men's Wear Jeans<span>(2)</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"MenWearSuit.html\">Men's Wear Suits<span>(56)</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"MensWearTshirt.html\">T-Shirts<span>(36)</span></a></li>\n");
      out.write("                                                                        <li><a href=\"MensWearshirts.html\">Men's Wear Shirts<span>(36)</span></a></li>\n");
      out.write("                                                                        <li><a href=\"MensWearJackets.html\">Men's Wear Jacket<span>(36)</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"KidsWearJeans.html\">Children</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-lg-9  order-1 order-lg-2 mb-5 mb-lg-0\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tag-sale\">ON SALE</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans001.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹999/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Sky Blue Pants</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans002.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹1,499/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Black Skinny Tight Jeans</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans003.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹1,399/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Black Ripped Jeans</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans004.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹1,699/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Denim Jeans</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans005.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹3,999/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Shirt & Jeans Stylish Dressing</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans006.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹2,499/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Stylish Kids Wear Combo Dress</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans007.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹3,999/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Combo Dress with Printed Inner</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans008.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹1,999/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Funky Pants</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans009.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹1,299/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Denim Half Pants</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tag-new\">new</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans0010.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹1,699/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Orange Half Pants</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans0011.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹1,899/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Cool Denim Kids Wear Jeans</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jeans0012.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>â¹1,799/-</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Denim Jeans</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Category section end -->\n");
      out.write("         <!-- Footer section -->\n");
      out.write("\t<section class=\"footer-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"footer-logo text-center\">                           \n");
      out.write("                            <em <b><p style = \"font-size: 40px;color : white;\" class=\"new\" >ï¸MOBSHOPï¸</p></b></em>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"footer-widget about-widget\">\n");
      out.write("\t\t\t\t\t\t<h2>About</h2>\n");
      out.write("\t\t\t\t\t\t<p>Online MobShop Clothing supposed to provide customer opportunity to shop 24x7.</p>\n");
      out.write("\t\t\t\t\t\t<img src=\"img/cards.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"footer-widget about-widget\">\n");
      out.write("\t\t\t\t\t\t<h2>Online Shopping</h2>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomensWearJeans.html\">Women's Wear Jeans</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWearJumpsuit.html\">Trendy Jumpsuits</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearJackets.html\">Men's Wear Jacket</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MenWearSuit.html\">Men's Wear Trendy Suits</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWearJacket.html\">Women's Wear Jacket</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomensWearKurti.html\">Stylish Kurti</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"footer-widget about-widget\">\n");
      out.write("\t\t\t\t\t\t<h2>Services</h2>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Shipping</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Track</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Returns Policy</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Terms & Conditions</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"footer-widget contact-widget\">\n");
      out.write("\t\t\t\t\t\t<h2>Address</h2>\n");
      out.write("                                                <p> Online MObShop ð New Delhi, India.\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("<p class=\"text-white text-center mt-5\">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved <img src=\"img/Heart.png\" width=\"25\" height=\"25\">  by <a href=\"homepage.html\" target=\"_blank\">Mobshop Clothing</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Footer section end -->\n");
      out.write("\n");
      out.write("\t<!--====== Javascripts & Jquery ======-->\n");
      out.write("\t<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.slicknav.min.js\"></script>\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("         <script>\n");
      out.write("            function logout(){                                                    \n");
      out.write("                ");

                    session.invalidate();                                                           
                
      out.write("                                                              \n");
      out.write("                document.location.reload();\n");
      out.write("            }            \n");
      out.write("\n");
      out.write("        </script>    \n");
      out.write("\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
