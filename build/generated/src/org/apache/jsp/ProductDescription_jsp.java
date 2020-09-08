package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.io.*;

public final class ProductDescription_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String searchkey,prod_title,prod_img, stock;int prod_id,price; 
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("<head>\n");
      out.write("\t<title>MobShop Clothing</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"description\" content=\" Divisima | eCommerce Template\">\n");
      out.write("\t<meta name=\"keywords\" content=\"divisima, eCommerce, creative, html\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<!-- Favicon -->\n");
      out.write("\t<link href=\"img/favicon.ico\" rel=\"shortcut icon\"/>\n");
      out.write("\n");
      out.write("\t<!-- Google Font -->\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Stylesheets -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/flaticon.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/slicknav.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style_1.css\"/>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            searchkey = request.getParameter("prod_id");            
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
            String qry = "select * from mobshop.product where prod_id='"+searchkey+"' ";                
            PreparedStatement ps = con.prepareStatement(qry);
            ResultSet rs = ps.executeQuery(qry);
                                                            
        
      out.write("\n");
      out.write("        \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- Page Preloder -->\n");
      out.write("\t<div id=\"preloder\">\n");
      out.write("\t\t<div class=\"loader\"></div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Header section -->\n");
      out.write("\t<header class=\"header-section\">\n");
      out.write("\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-2 text-center text-lg-left\">\n");
      out.write("\t\t\t\t\t\t<!-- logo -->\n");
      out.write("\t\t\t\t\t\t<a href=\"./homepage.html\" class=\"site-logo\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/logo.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-6 col-lg-5\">\n");
      out.write("\t\t\t\t\t\t<form class=\"header-search-form\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search on mobshop ....\">\n");
      out.write("\t\t\t\t\t\t\t<button><i class=\"flaticon-search\"></i></button>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-4 col-lg-5\">\n");
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
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<nav class=\"main-navbar\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<!-- menu -->\n");
      out.write("\t\t\t\t<ul class=\"main-menu\">\n");
      out.write("\t\t\t\t\t<li><a href=\"homepage.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Women<span class=\"new\">New</span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomensWearJeans.html\">Jeans</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWearJacket.html\">Jackets</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWearEthnic.html\">Ethnic Wear</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomensWearKurti.html\">Kurti</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"WomenWearJumpsuit.html\">JumpSuit</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Men<span class=\"new\">New</span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu \">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearshirts.html\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MenWearSuit.html\">Suits</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearJackets.html\">Jackets</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearTshirt.html\">T-Shirt</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearJeans.html\">Jeans</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Child Collection</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"KidsWearJeans.html\">Kids Collections</a></li>\n");
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
      out.write("\t<!-- Page info -->\n");
      out.write("\t<div class=\"page-top-info\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h4>Category Page</h4>\n");
      out.write("\t\t\t<div class=\"site-pagination\">\n");
      out.write("\t\t\t\t<a href=\"\">Home</a> /\n");
      out.write("\t\t\t\t<a href=\"\">Shop</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Page info end -->\n");
      out.write("\n");
      out.write("\t<!-- product section -->\n");
      out.write("\t<section class=\"product-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"back-link\">\n");
      out.write("\t\t\t\t<a href=\".//WomensWearJeans.html\"> &lt;&lt; Back to Category</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">                                                                                        \n");
      out.write("<!--                            JSP Code Start From Here                                                                    -->                            \n");
                            
if(rs.next()){
    


      out.write("\n");
      out.write("<!--                            JSP Code End Here                                                                    -->                                                        \n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t<div class=\"product-pic-zoom\">\n");
      out.write("\t\t\t\t\t\t<img class=\"product-big-img\" src=\"img/product/");
      out.print(rs.getString("PROD_IMG"));
      out.write("\" alt=\"\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"product-thumbs\" tabindex=\"1\" style=\"overflow: hidden; outline: none;\">\n");
      out.write("\t\t\t\t\t\t<div class=\"product-thumbs-track\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pt active\" data-imgbigurl=\"img/product/jeans7.jpg\"><img src=\"img/product/jeans7.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pt\" data-imgbigurl=\"img/product/j71.jpg\"><img src=\"img/product/j71.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pt\" data-imgbigurl=\"img/product/j72.jpg\"><img src=\"img/product/j72.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pt\" data-imgbigurl=\"img/product/j73.jpg\"><img src=\"img/product/j73.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 product-details\">\n");
      out.write("\t\t\t\t\t<h2 class=\"p-title\">");
      out.print(rs.getString("PROD_NAME"));
      out.write("</h2>\n");
      out.write("\t\t\t\t\t<h3 class=\"p-price\">Rs ");
      out.print(rs.getString("PRICE"));
      out.write("</h3>\n");
      out.write("                                        ");

                                            if(rs.getInt("STOCK")>0){
                                                stock = "In Stock";
                                            }else{
                                                stock = "Out Of Stock ";
                                            }
                                        
                                        
      out.write("\n");
      out.write("\t\t\t\t\t<h4 class=\"p-stock\">Available: <span>");
      out.print( stock );
      out.write("</span></h4>\n");
      out.write("\t\t\t\t\t<div class=\"p-rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star-o fa-fade\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        <h5>Key Feature</h5><br />\n");
      out.write("                                        <div>\n");
      out.write("                                            <p>");
      out.print(rs.getString("PR_FTR1"));
      out.write("</p>\n");
      out.write("                                            <p>");
      out.print(rs.getString("PR_FTR2"));
      out.write("</p>\n");
      out.write("                                            <p>");
      out.print(rs.getString("PR_FTR3"));
      out.write("</p><br />\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- form data will start from here-->\n");
      out.write("                                        <form action=\"Checkout.jsp\" method=\"get\">     \n");
      out.write("                                            <input type=\"hidden\" name=\"prod_id\"  value=\"");
      out.print(rs.getString("PROD_ID"));
      out.write("\">                                                                                        \n");
      out.write("                                            <input type=\"hidden\" name=\"price\"  value=\"");
      out.print(rs.getString("PRICE"));
      out.write("\">\n");
      out.write("                                            <input type=\"hidden\" name=\"img\"  value=\"");
      out.print(rs.getString("PROD_IMG"));
      out.write("\">                                           \n");
      out.write("                                            <input type=\"hidden\" name=\"name\"  value=\"");
      out.print(rs.getString("PROD_NAME"));
      out.write("\">\n");
      out.write("                                            <div class=\"fw-size-choose\">\n");
      out.write("                                                <p>Size</p>\n");
      out.write("                                                <div class=\"sc-item\">\n");
      out.write("                                                        <input type=\"radio\" name=\"sc\" value=\"xs-size\" id=\"xs-size\">\n");
      out.write("                                                        <label for=\"xs-size\">XS</label>\n");
      out.write("                                                </div>\n");
      out.write("                                                \n");
      out.write("                                                <div class=\"sc-item\">\n");
      out.write("                                                    <input type=\"radio\" name=\"sc\" value=\"s-size\" id=\"s-size\">\n");
      out.write("                                                        <label for=\"s-size\">S</label>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"sc-item\">\n");
      out.write("                                                    <input type=\"radio\" name=\"sc\" value=\"m-size\" id=\"m-size\" checked=\"\">\n");
      out.write("                                                        <label for=\"m-size\">M</label>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"sc-item\">\n");
      out.write("                                                    <input type=\"radio\" name=\"sc\" value=\"l-size\" id=\"l-size\">\n");
      out.write("                                                        <label for=\"l-size\">L</label>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"sc-item\">\n");
      out.write("                                                    <input type=\"radio\" name=\"sc\" value=\"xl-size\" id=\"xl-size\" >\n");
      out.write("                                                        <label for=\"xl-size\">XL</label>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"sc-item\">\n");
      out.write("                                                    <input type=\"radio\" name=\"sc\" value=\"xxl-size\" id=\"xxl-size\">\n");
      out.write("                                                        <label for=\"xxl-size\">XXL</label>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"quantity\">\n");
      out.write("                                                <p>Quantity</p>\n");
      out.write("                                                <div class=\"pro-qty\">\n");
      out.write("                                                    <input type=\"text\"  min=\"1\" max=\"10\" maxlength=\"2\" name=\"quantity\" value=\"1\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <input type=\"submit\" value=\"Shop Now\" class=\"site-btn\">\n");
      out.write("                                        </form>\n");
      out.write("\t\t\t\t\t<div id=\"accordion\" class=\"accordion-area\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-header\" id=\"headingOne\">\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"panel-link active\" data-toggle=\"collapse\" data-target=\"#collapse1\" aria-expanded=\"true\" aria-controls=\"collapse1\">Product Description</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"collapse1\" class=\"collapse show\" aria-labelledby=\"headingOne\" data-parent=\"#accordion\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>");
      out.print(rs.getString("PR_DESC"));
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"panel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-header\" id=\"headingThree\">\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"panel-link\" data-toggle=\"collapse\" data-target=\"#collapse3\" aria-expanded=\"false\" aria-controls=\"collapse3\">shipping & Returns</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"collapse3\" class=\"collapse\" aria-labelledby=\"headingThree\" data-parent=\"#accordion\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>7 Days Returns</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Cash on Delivery Available<br>Home Delivery <span>3 - 4 days</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>FOR RETURN OF PRODUCT PLEASE CALL ON - 0122-245451 </p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- product section end -->\n");
      out.write("\n");
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
      out.write("\t\t\t\t\t\t<img src=\"./img/product/jacket2.jpg\" alt=\"\">\n");
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
      out.write("        \n");
      out.write("        \t<!-- JSP CODE END HERE -->\n");
      out.write("        ");

            }
            ps.close();
            con.close();            
        }
        catch(Exception ex){
            out.println(ex);
        }
        
      out.write("           \n");
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
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
