package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class WomenWear_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Women's Wear</title>\n");
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
      out.write("            \n");
      out.write("            function validate(){\n");
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
      out.write("            }                      \n");
      out.write("        </script>\n");
      out.write("\n");
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
      out.write("\t\t\t\t\t\t\t</div>                    &nbsp; &nbsp; &nbsp; &nbsp;                        \n");
      out.write("\t\t\t\t\t\t\t<div class=\"up-item\" onclick=\"return logout()\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"flaticon-profile\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"  > Logout </a> \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<nav class=\"main-navbar\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<!-- menu -->\n");
      out.write("\t\t\t\t<ul class=\"main-menu\">\n");
      out.write("\t\t\t\t\t<li><a href=\"homepage.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"WomenWear.jsp\">Women<span class=\"new\">New</span></a>\n");
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
      out.write("\t\t\t\t\t<li><a href=\"KidsWearJeans.jsp\">Child Collection</a>\n");
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
      out.write("        <!-- Hero section -->\n");
      out.write("\t<section class=\"hero-section\">\n");
      out.write("\t\t<div class=\"hero-slider owl-carousel\">\n");
      out.write("\t\t\t<div class=\"hs-item set-bg\" data-setbg=\"img/bg.jpg\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-6 col-lg-7 text-white\">\n");
      out.write("\t\t\t\t\t\t\t<span>New Arrivals</span>\n");
      out.write("\t\t\t\t\t\t\t<h2>MobShop Clothing</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>An ONLINE MOBSHOP CLOTHING SYSTEM is the process that the customer directly buy products over the internet. As we go to the market , visit all the shop, look at all the products and then we choose something just for the need without even liking it in real.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"site-btn sb-line\">DISCOVER</a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"site-btn sb-white\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"offer-card text-white\">\n");
      out.write("\t\t\t\t\t\t <h6>Just for </h6>\n");
      out.write("\t\t\t\t\t\t<h2>999</h2>\n");
      out.write("\t\t\t\t\t\t<p>SHOP NOW</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"hs-item set-bg\" data-setbg=\"img/bg-2.jpg\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-6 col-lg-7 text-white\">\n");
      out.write("\t\t\t\t\t\t\t<span>New Arrivals</span>\n");
      out.write("\t\t\t\t\t\t\t<h2>MobShop Clothing</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>An ONLINE MOBSHOP CLOTHING SYSTEM is the process that the customer directly buy products over the internet. As we go to the market , visit all the shop, look at all the products and then we choose something just for the need without even liking it in real.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"site-btn sb-line\">DISCOVER</a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"site-btn sb-white\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"offer-card text-white\">\n");
      out.write("\t\t\t\t\t\t <h6>Just for </h6>\n");
      out.write("\t\t\t\t\t\t<h2>999</h2>\n");
      out.write("\t\t\t\t\t\t<p>SHOP NOW</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"slide-num-holder\" id=\"snh-1\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Hero section end -->\n");
      out.write("        <div  class=\"section-title\">\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("                            <h2 class=\"fw-title\">WOMEN'S WEAR</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t<!-- Category section -->\n");
      out.write("\t<section class=\"category-section spad\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\"  >\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 order-2 order-lg-1\">\n");
      out.write("\t\t\t\t\t<div class=\"filter-widget\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"fw-title\">Categories</h2>\n");
      out.write("\t\t\t\t\t\t<ul class=\"category-menu\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomensWearJeans.jsp\">Women's Wear Jeans</a>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                                                        <li><a href=\"WomenWearJacket.jsp\">Women's Wear Jacket</a>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                                                        <li><a href=\"WomenWearJumpsuit.jsp\">Jumpsuits</a>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWearEthnic.jsp\">Ethnic Wear</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomensWearKurti.jsp\">Stylist Kurti</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-lg-9  order-1 order-lg-2 mb-5 mb-lg-0\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\t                                                                   \n");
      out.write("                                                                        <img src=\"./img/product/jeans5.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("                                                                            <a href=\"\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>Shop Now!</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"WomensWearJeans.jsp\" class=\"add-card\"><img src='img/logo.png'><span></span></a>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                    <p style=\"text-align: center\">Women's Wear Jeans</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("                                                                    <img src=\"./img/product/jacket02.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("                                                                            <a href=\"\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>Shop Now!</span></a>\n");
      out.write("                                                                            <a href=\"WomenWearJacket.jsp\" class=\"add-card\"><img src='img/logo.png'><span></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                    <p style=\"text-align: center\">Women's Wear Jacket</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("                                                                    <div class=\"tag-sale\">TRENDING</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/jumpsuit12.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("                                                                            <a href=\"\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>Shop Now!</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"WomenWearJumpsuit.jsp\" class=\"add-card\"><img src='img/logo.png'><span></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>                                                            \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                    <p style=\"text-align: center\">Trendy JumpSuits</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/kurti1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("                                                                            <a href=\"\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>Shop Now!</span></a>\n");
      out.write("                                                                            <a href=\"WomensWearKurti.jsp\" class=\"add-card\"><img src='img/logo.png'><span></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                    <p style=\"text-align: center\">Stylist Kurti Collections</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("                                                                    <div class=\"tag-sale\">TRENDING</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/product/ethnic5.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("                                                                            <a href=\"\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>Shop Now!</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"WomenWearEthnic.jsp\" class=\"add-card\"><img src='img/logo.png'><span></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                    <p style=\"text-align: center\">Trendy Ethnic Wear</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                   \n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                           \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Category section end -->\n");
      out.write("        \n");
      out.write("\t<!-- RELATED PRODUCTS section -->\n");
      out.write("\t<section class=\"related-product-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"section-title\">\n");
      out.write("\t\t\t\t<h2>RELATED PRODUCTS</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"product-slider owl-carousel\">\n");
      out.write("\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t<img src=\"./img/product/jeans1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t<h6>$35,00</h6>\n");
      out.write("\t\t\t\t\t\t<p>Flamboyant Pink Top </p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tag-new\">New</div>\n");
      out.write("\t\t\t\t\t\t<img src=\"./img/product/jacket01.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t<h6>$35,00</h6>\n");
      out.write("\t\t\t\t\t\t<p>Black and White Stripes Dress</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t<img src=\"./img/product/jacket02.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t<h6>$35,00</h6>\n");
      out.write("\t\t\t\t\t\t<p>Flamboyant Pink Top </p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"./img/product/jumpsuit1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t\t<h6>$35,00</h6>\n");
      out.write("\t\t\t\t\t\t\t<p>Flamboyant Pink Top </p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t<div class=\"pi-pic\">\n");
      out.write("\t\t\t\t\t\t<img src=\"./img/product/jacket03.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"pi-links\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"pi-text\">\n");
      out.write("\t\t\t\t\t\t<h6>$35,00</h6>\n");
      out.write("\t\t\t\t\t\t<p>Flamboyant Pink Top </p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- RELATED PRODUCTS section end -->\n");
      out.write("           <!-- Footer section -->\n");
      out.write("\t<!-- Footer section -->\n");
      out.write("\t<section class=\"footer-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"footer-logo text-center\">                           \n");
      out.write("                            <em <b><p style = \"font-size: 40px;color : white;\" class=\"new\" >MOBSHOP</p></b></em>\n");
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
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomensWearJeans.jsp\">Women's Wear Jeans</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWearJumpsuit.jsp\">Trendy Jumpsuits</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearJackets.jsp\">Men's Wear Jacket</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MenWearSuit.jsp\">Men's Wear Tredy Suits</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWearJacket.jsp\">Women's Wear Jacket</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomensWearKurti.jsp\">Stylish Kurti</a></li>\n");
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
      out.write("                                                <p> Online MObShop Pvt. Ltd. New Delhi, India.\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("<p class=\"text-white text-center mt-5\">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved <img src=\"img/Heart.png\" width=\"25\" height=\"25\">  by <a href=\"homepage.html\" target=\"_blank\">Mobshop Clothing</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Footer section end -->\n");
      out.write("\t<!--====== Javascripts & Jquery ======-->\n");
      out.write("\t<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.slicknav.min.js\"></script>\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function logout(){                                                    \n");
      out.write("                ");

                    session.invalidate();                                                           
                
      out.write("                                                              \n");
      out.write("                document.location.reload();\n");
      out.write("            }            \n");
      out.write("\n");
      out.write("        </script>  \n");
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
