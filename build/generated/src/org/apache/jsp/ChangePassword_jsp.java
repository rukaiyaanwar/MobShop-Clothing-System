package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<!-- Required meta tags -->\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t<link rel=\"icon\" href=\"img/favicon.png\" type=\"image/png\">\n");
      out.write("\t<title>MobShop Clothing</title>\n");
      out.write("\t<!-- Bootstrap CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"vendors/linericon/style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"vendors/owl-carousel/owl.carousel.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"vendors/lightbox/simpleLightbox.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"vendors/nice-select/css/nice-select.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"vendors/animate-css/animate.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"vendors/jquery-ui/jquery-ui.css\">\n");
      out.write("\t<!-- main css -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_1.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        \n");
      out.write("         \n");
      out.write("            \n");
      out.write("                            \n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("             \n");
      out.write("        function Validate() {\n");
      out.write("        var PASSWORD = document.getElementById(\"password\").value;\n");
      out.write("        var confirmPassword = document.getElementById(\"confirmpassword\").value;\n");
      out.write("        if (PASSWORD != confirmPassword) {\n");
      out.write("            alert(\"Passwords do not match.\");\n");
      out.write("            return false;\n");
      out.write("        }  \n");
      out.write("        return true;\n");
      out.write("       }\n");
      out.write("       </script>\n");
      out.write("\n");
      out.write("       \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body onload=\"return validate()\">\n");
      out.write("     \n");
      out.write("    ");

        if((session.getAttribute("customer_id")==null)||(session.getAttribute("customer_id")==""))
            response.sendRedirect("login.html");
        else{
            
        }
    
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
      out.write("                                            <form class=\"header-search-form\" action=\"searchProduct.jsp\" method=\"get\">\n");
      out.write("                                                <input type=\"text\" name=\"searchKeywordRukaiya\" placeholder=\"Search on mobshop ....\">\n");
      out.write("                                                <button><i class=\"flaticon-search\"></i></button>\n");
      out.write("                                            </form>\n");
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
      out.write("\t\t\t\t\t\t\t</div>         &nbsp; &nbsp; &nbsp; &nbsp;     \n");
      out.write("                                                                \n");
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
      out.write("\t\t\t\t\t<li><a href=\"#\">Track</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<!--================Login Box Area =================-->\n");
      out.write("\t<section class=\"login_box_area p_120\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t<div class=\"login_box_img\">\n");
      out.write("                                            <img class=\"img-fluid\" src=\"img/product/jacket012.jpg\" width=\"600\" height=\"300\"alt=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"hover\">\n");
      out.write("\t\t\t\t\t\t\t<h4>MOBSHOP CLOTHING</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>WE BRING QUALITY TO YOU!</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t<div class=\"login_form_inner reg_form\">\n");
      out.write("\t\t\t\t\t\t<h3>Change Password Here</h3>\n");
      out.write("\t\t\t\t\t\t<form class=\"row login_form\" action=\"ChangePasswordDB.jsp\" method=\"get\" id=\"contactForm\" novalidate=\"novalidate\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"current\" name=\"curr_pwd\" placeholder=\"Current Password\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"password\" name=\"new_pwd\" placeholder=\"Enter New Password\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"confirmpassword\" placeholder=\" Confirm Password\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12 form-group\">\n");
      out.write("                                                            <button type=\"submit\" value=\"submit\" class=\"btn submit_btn\" onclick=\"return validate()\">Change Password</button>                                            \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!--================End Login Box Area =================-->\n");
      out.write("          <!-- Footer section -->\n");
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
      out.write("                                                <p> Online MObShop Clothing Pvt. Ltd. New Delhi, India.\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("<p class=\"text-white text-center mt-5\">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved <img src=\"img/Heart.png\" width=\"25\" height=\"25\">  by <a href=\"homepage.html\" target=\"_blank\">Mobshop Clothing</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Footer section end -->\n");
      out.write("\t<!-- Optional JavaScript -->\n");
      out.write("\t<!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("\t<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/popper.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/stellar.js\"></script>\n");
      out.write("\t<script src=\"vendors/lightbox/simpleLightbox.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/nice-select/js/jquery.nice-select.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/isotope/imagesloaded.pkgd.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/isotope/isotope-min.js\"></script>\n");
      out.write("\t<script src=\"vendors/owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("\t<script src=\"js/mail-script.js\"></script>\n");
      out.write("\t<script src=\"vendors/jquery-ui/jquery-ui.js\"></script>\n");
      out.write("\t<script src=\"vendors/counter-up/jquery.waypoints.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/counter-up/jquery.counterup.js\"></script>\n");
      out.write("\t<script src=\"js/theme.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function logout(){                                                    \n");
      out.write("                ");

                    session.invalidate();                                                           
                
      out.write("                                                              \n");
      out.write("                document.location.reload();\n");
      out.write("            }            \n");
      out.write("\n");
      out.write("        </script>    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
