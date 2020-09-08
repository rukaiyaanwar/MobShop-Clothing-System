package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class AdminTracking_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <link rel=\"icon\" href=\"img/favicon.png\" type=\"image/png\">\n");
      out.write("    <title>MobShop Clothing</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/linericon/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/owl-carousel/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/lightbox/simpleLightbox.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/nice-select/css/nice-select.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/animate-css/animate.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/jquery-ui/jquery-ui.css\">\n");
      out.write("    <!-- main css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style_1.css\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("    function validate(){\n");
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
      out.write("            }        \n");
      out.write("            </script>\n");
      out.write("</head>\n");
      out.write("<body onload=\"return validate()\">\n");
      out.write("    \n");
      out.write("<!--          //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all :java.io.*;-->\n");
      out.write("<!--         //this statement means all the classes of io package will be imported. used when we are using input/output stream. :java.sql.*;-->\n");
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
      out.write("    \n");
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
      out.write("                                                                <a href=\"#\">Hi,Rukaiya</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"up-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"shopping-card\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i>                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"logout.jsp\" >Logout </a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<nav class=\"main-navbar\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<!-- menu -->\n");
      out.write("\t\t\t\t<ul class=\"main-menu\">\n");
      out.write("\t\t\t\t\t<li><a href=\"Admin.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Product</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"AddProduct.jsp\">Add Product</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"UpdateProduct.jsp\">Update Product</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"DeleteProduct.jsp\">Delete Product</a></li>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Order<span class=\"new\">New</span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu \">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"ActiveOrder.jsp\">Active Order</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"CancelledOrder.jsp\">Cancel Order</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"AdminChangePassword.jsp\">Change Password</a>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li><a href=\"AdminTracking.jsp\">Track</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("    <!--================Tracking Box Area =================-->\n");
      out.write("         &nbsp;&nbsp;&nbsp;\n");
      out.write("    <div  class=\"section-title\">            \n");
      out.write("        <h2 style=\"font-size: 20px; margin-bottom: 15px;\" class=\"fw-title\">TRACK ORDER</h2>\n");
      out.write("    </div>\n");
      out.write("    <section class=\"row  justify-content-center \" style=\" padding: 20px; height: 400px; \">        \n");
      out.write("        <form class=\"text-center col-4\"  action=\"AdminOrderTrackDB.jsp\" method=\"get\" >\n");
      out.write("            <input type=\"text\" class=\"form-control\" style=\"float: left; width:250px; \" name=\"order\" placeholder=\"Order ID\"> \n");
      out.write("            <button type=\"submit\" value=\"submit\" style=\"\" class=\"btn submit_btn\" >Track Order</button>\n");
      out.write("        </form>        \n");
      out.write("    </section>\n");
      out.write("    <!--================End Tracking Box Area =================-->\n");
      out.write("    <!-- Footer section -->\n");
      out.write("      <section class=\"container\" style=\"background-color: #282828;\" >\n");
      out.write("            <p class=\"text-white text-center mt-5\">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved <img src=\"img/Heart.png\" width=\"25\" height=\"25\">  by <a href=\"homepage.html\" target=\"_blank\">Mobshop Clothing</a></p>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Footer section end -->\n");
      out.write("    <!--================ End footer Area  =================-->\n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/stellar.js\"></script>\n");
      out.write("    <script src=\"vendors/lightbox/simpleLightbox.min.js\"></script>\n");
      out.write("    <script src=\"vendors/nice-select/js/jquery.nice-select.min.js\"></script>\n");
      out.write("    <script src=\"vendors/isotope/imagesloaded.pkgd.min.js\"></script>\n");
      out.write("    <script src=\"vendors/isotope/isotope-min.js\"></script>\n");
      out.write("    <script src=\"vendors/owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("    <script src=\"js/mail-script.js\"></script>\n");
      out.write("    <script src=\"vendors/jquery-ui/jquery-ui.js\"></script>\n");
      out.write("    <script src=\"vendors/counter-up/jquery.waypoints.min.js\"></script>\n");
      out.write("    <script src=\"vendors/counter-up/jquery.counterup.js\"></script>\n");
      out.write("    <script src=\"js/theme.js\"></script>\n");
      out.write("    <script>\n");
      out.write("            function logout(){                                                    \n");
      out.write("                ");

                    session.invalidate();                                                           
                
      out.write("                                                              \n");
      out.write("                document.location.reload();\n");
      out.write("            }            \n");
      out.write("\n");
      out.write("        </script>  \n");
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
