package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.io.*;

public final class myaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title> MobShop Clothing</title>\n");
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
      out.write("\t<link rel=\"stylesheet\" href=\"css/style_1.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style(2).css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("        *{\n");
      out.write("          margin: 0px;\n");
      out.write("          padding: 0px;\n");
      out.write("          font-family: sans-serif;\n");
      out.write("          box-sizing:border-box;\n");
      out.write("        }\n");
      out.write("        #big-div{\n");
      out.write("                width:100%;\n");
      out.write("                height:100%;\t\n");
      out.write("                padding:10px 100px;\n");
      out.write("                background-color:#F2F2F2;\n");
      out.write("        }\n");
      out.write("        #top_Design{\n");
      out.write("                border-radius:10px;\t\n");
      out.write("                height:200px;\n");
      out.write("                width:100%;\n");
      out.write("                padding:30px;\n");
      out.write("                background-color:white;\t\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #bottom_Design li:hover {\n");
      out.write("                border:1px solid #FF1493;\n");
      out.write("                color:white;\n");
      out.write("                background-color:white;\n");
      out.write("        }\n");
      out.write("        #bottom_Design li:hover a{\n");
      out.write("                color:#FF1493;\t\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a{\t\n");
      out.write("                color:white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #bottom_Design li{\n");
      out.write("                border-radius:10px;\n");
      out.write("                background-color:#282828;\n");
      out.write("                height:40px;\n");
      out.write("                margin: 20px 0px;\n");
      out.write("                padding:10px;\n");
      out.write("                width:100%;\n");
      out.write("                list-style-type:none;\n");
      out.write("                font-size:12pt;\n");
      out.write("                text-align:center;\t\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        #profile-left{\n");
      out.write("                width:25%;\n");
      out.write("                height:100%;\n");
      out.write("                margin:5px;\n");
      out.write("                float:left;\n");
      out.write("                border-radius:20px;\n");
      out.write("        }\n");
      out.write("        #mini_box{\n");
      out.write("                width:200px;\n");
      out.write("                height:70px;\n");
      out.write("                border-radius:30px;\n");
      out.write("        }\n");
      out.write("        #profile-right{\n");
      out.write("                float:right;\n");
      out.write("                width:69%;\n");
      out.write("                margin:5px;\n");
      out.write("                height:100%;\n");
      out.write("                background-color:white;\n");
      out.write("                border-radius:20px;\n");
      out.write("        }\n");
      out.write("        #myAccountName{\n");
      out.write("            font-size: 13pt;\n");
      out.write("        }       \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if((session.getAttribute("customer_id")==null)||(session.getAttribute("customer_id")==""))
        response.sendRedirect("login.html");
    else{            
    }    
    try
    {   
            Integer id = (Integer)session.getAttribute("customer_id");
            Class.forName("oracle.jdbc.driver.OracleDriver");                
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
            String qry = "SELECT * FROM CUSTOMER WHERE  CUSTOMER_ID='"+id+"'";                
            PreparedStatement ps = con.prepareStatement(qry);
            ResultSet rs = ps.executeQuery(qry);

      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\t\n");
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
      out.write("                                                    </div>    &nbsp; &nbsp; &nbsp; &nbsp;                                               \n");
      out.write("\t\t\t\t\t\t\t<div class=\"up-item\" onclick=\"return logout()\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"flaticon-profile\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"homepage.jsp\"  > Logout </a> \n");
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
      out.write("\t<section id=\"big-div\" >\n");
      out.write("\t\t<div id=\"profile-left\">\n");
      out.write("\t\t\t<div id=\"top_Design\">\n");
      out.write("\t\t\t\t<img src=\"img/account-icon.png\" width=\"75px\" height=\"75px\" style=\"float:center;\" /> \t<br /><br />\t\t\t\n");
      out.write("\t\t\t\t<h5>Hello,<p id=\"login-name\" style=\"color:#FF1493; font-size:14pt;\">Rukaiya Anwar</p></h5>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"bottom_Design\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"ChangePassword.jsp\" >ChangePassword</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\"  >Order</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\"  >Track</a></li>\n");
      out.write("\t\t\t\t</ul>\t\t\n");
      out.write("\t\t\t</div>\t\t\n");
      out.write("\t\t</div>\n");
      out.write("            <div id=\"profile-right\" class=\"container\">\n");
      out.write("\t\t\t<div class=\"login_form_inner reg_form \">\n");
      out.write("\t\t\t\t<h3>Personal Information</h3>\n");
      out.write("                                ");

                                    if(rs.next()){                                   
                                
      out.write("\n");
      out.write("\t\t\t\t<form  action=\"AccountUpdate.jsp\" method=\"get\" >\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td id=\"myAccountName\"> Name </td>\n");
      out.write("                                            <td> <input type=\"text\" class=\"form-control\"  name=\"ACname\"  value=\"");
      out.print( rs.getString("customer_name") );
      out.write("\" disabled=\"\"> </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td  id=\"myAccountName\">Email </td>\n");
      out.write("                                            <td> <input type=\"text\" class=\"form-control\"  name=\"ACemail\"  value=\"");
      out.print( rs.getString("customer_email") );
      out.write("\" disabled=\"\"> </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td  id=\"myAccountName\">Address </td>\n");
      out.write("                                            <td> <input type=\"text\" class=\"form-control\"  name=\"ACaddr\"  value=\"");
      out.print( rs.getString("customer_addr") );
      out.write("\" disabled=\"\"> </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td  id=\"myAccountName\">Contact No </td>\n");
      out.write("                                            <td> <input type=\"text\" class=\"form-control\"  name=\"ACmob\"  value=\"");
      out.print( rs.getString("customer_mob") );
      out.write("\" disabled=\"\"> </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td colspan=\"2\"> <button type=\"submit\" value=\"submit\" class=\"btn submit_btn\" style=\"width: 200px; border-radius: 5px; margin-top: 10px;\">Update</button>  </td>                                            \n");
      out.write("                                        </tr>                                        \n");
      out.write("                                    </table>\t\t\t\t\t\t                                                            \t\t\t\t\n");
      out.write("\t\t\t\t</form>\n");
      out.write("                                ");

                                    }else{
                                        out.println("Nhi Chala... ");
                                        }
                                        ps.close();
                                        con.close();            
                                    }
                                    catch(Exception ex){
                                       out.println(ex);
                                    }

                                
      out.write("\n");
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                        </div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</section>\n");
      out.write("        <!-- Footer section -->\n");
      out.write("\t<section class=\"footer-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"footer-logo text-center\">                           \n");
      out.write("                            <em <b><p style = \"font-size: 40px;color : white;\" class=\"new\" >?MOBSHOP?</p></b></em>\n");
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
      out.write("                                                <p> Online MObShop ? New Delhi, India.\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("<p class=\"text-white text-center mt-5\">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved <img src=\"img/Heart.gif\" width=\"25\" height=\"25\">  by <a href=\"homepage.html\" target=\"_blank\">Mobshop Clothing</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("     \n");
      out.write("</body>\n");
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
