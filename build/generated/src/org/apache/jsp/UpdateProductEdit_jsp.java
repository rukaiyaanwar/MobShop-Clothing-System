package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.io.*;

public final class UpdateProductEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("<head>\n");
      out.write("\t<title>MobShop Clothing</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"description\" content=\" MobShop | eCommerce Template\">\n");
      out.write("\t<meta name=\"keywords\" content=\"mobshop, eCommerce, creative, html\">\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style_1.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style(2).css\"/>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            input[type=text]\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                box-sizing: border-box;                   \n");
      out.write("            }\n");
      out.write("             input[type= number]\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                box-sizing: border-box;                   \n");
      out.write("            }\n");
      out.write("             input[type= file]\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                box-sizing: border-box;                   \n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            searchkey = request.getParameter("prod_id");            
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // Initialize your JDBC driver by calling the method Class.forName.  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya"); //Establishing a connection.
            String qry = "select * from mobshop.product where prod_id='"+searchkey+"' ";                //Sending the query . 
            PreparedStatement ps = con.prepareStatement(qry);  // It is used to execute parameterized query.
            ResultSet rs = ps.executeQuery(qry);      //contains the results of executing an SQL query. 
                    
                                                            
        
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("\t\t\t\t\t<li><a href=\"Admin.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Product</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"AddProduct.html\">Add Product</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"UpdateProduct.html\">Update Product</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"DeleteProduct.html\">Delete Product</a></li>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"MenWear.html\">Order<span class=\"new\">New</span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu \">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearshirts.html\">Active Order</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MenWearSuit.html\">Cancel Order</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MensWearJackets.html\">Update Product</a></li>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Payment</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"KidsWearJeans.html\">Debit Card</a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Customer</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./product.html\">Update Customer</a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\">Track</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("        <!--================Login Box Area =================-->\n");
      out.write("\t\t\t\t\n");
      out.write("                                           <section class=\"login_box_area p_120\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t<div class=\"login_box_img\">\n");
      out.write("                                            <img class=\"img-fluid\" src=\"img/product/jacket03.jpg\" width=\"600\" height=\"300\"alt=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"hover\">\n");
      out.write("\t\t\t\t\t\t\t<h4>New to our website?</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>There are advances being made in science and technology everyday, and a good example of this is the</p>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t<div class=\"login_form_inner reg_form\">\n");
      out.write("\n");
      out.write("<!--                            JSP Code Start From Here                                                                    -->                            \n");
                            
if(rs.next()){
    


      out.write("\n");
      out.write("<!--                            JSP Code End Here                                                                    -->                                                        \n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t\t<h3>CHANGE PRODUCT</h3>\n");
      out.write("\t\t\t\t\t\t<form class=\"row login_form\" action=\"UpdateProductDB.jsp\" method=\"get\" >\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" value=\"");
      out.print(rs.getString("PROD_NAME"));
      out.write("\" placeholder=\"Product Name\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"brand\" name=\"brand\" value=\"");
      out.print(rs.getString("BRAND"));
      out.write("\"  placeholder=\"Brand\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        <div class=\"col-md-7 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"category\" name=\"category\" value=\"");
      out.print(rs.getString("PR_CATEGORY"));
      out.write("\" placeholder=\"Product Category\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        <div class=\"col-md-5 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"prod_id\" value=\"");
      out.print(rs.getString("PROD_ID"));
      out.write("\" placeholder=\"Product ID\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                         <div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"maurya\" value=\"");
      out.print(rs.getString("PR_FTR1"));
      out.write("\" placeholder=\"Product Feature 1\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        <div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"maurya2\" value=\"");
      out.print(rs.getString("PR_FTR2"));
      out.write("\"placeholder=\"Product Feature 2\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        <div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"maurya3\" value=\"");
      out.print(rs.getString("PR_FTR3"));
      out.write("\" placeholder=\"Product Feature 3\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        <div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"pr_skey\" name=\"pr_skey\" value=\"");
      out.print(rs.getString("PR_SKEY"));
      out.write("\" placeholder=\"Search Keyword\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        <div class=\"col-md-7 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control\" id=\"amount\" name=\"quantity\" value=\"");
      out.print(rs.getString("QUANTITY"));
      out.write("\"  placeholder=\"Product Quantity\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                         <div class=\"col-md-5 form-group\">\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" id=\"size\" name=\"size\"  value=\"");
      out.print(rs.getString("SIZES"));
      out.write("\" placeholder=\"Size\">\n");
      out.write("                                                         </div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                        <div class=\"col-md-12 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"desc\" name=\"desc\" value=\"");
      out.print(rs.getString("PR_DESC"));
      out.write("\" placeholder=\"Product Description\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        <div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control\" id=\"price\" name=\"price\" value=\"");
      out.print(rs.getString("PRICE"));
      out.write("\" placeholder=\"Product Price\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                         <div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control\" id=\"price\" name=\"stock\" value=\"");
      out.print(rs.getString("STOCK"));
      out.write("\" placeholder=\"Stock\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                       <div class=\"col-md-12 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"mfg\" name=\"mfg\" value=\"");
      out.print(rs.getString("MFG"));
      out.write("\" placeholder=\"Product Manufactured Date\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("<!--                                                        <div class=\"col-md-12 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"file\" class=\"form-control\" id=\"image\" name=\"image\" value=\"");
      out.print(rs.getString("PROD_IMG"));
      out.write("\"placeholder=\"Upload Image\">\n");
      out.write("\t\t\t\t\t\t\t</div>-->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" value=\"submit\" class=\"btn submit_btn\">CHANGE PRODUCT</button>\n");
      out.write("                                                               \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!--================End Login Box Area =================-->\n");
      out.write("          <!-- Footer section -->\n");
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
      out.write("</body>\n");
      out.write("</html>");
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
