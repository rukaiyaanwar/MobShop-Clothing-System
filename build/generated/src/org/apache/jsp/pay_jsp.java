package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pay_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!Doctype html>\n");
      out.write("<head>\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style_1.css\"/>\n");
      out.write(".body { margin-top:20px; }\n");
      out.write(".panel-title {display: inline;font-weight: bold;}\n");
      out.write(".checkbox.pull-right { margin: 0; }\n");
      out.write(".pl-ziro { padding-left: 0px; }\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <hr>\n");
      out.write("    <div class=\"col-lg-2 text-center text-lg-left\">\n");
      out.write("\t\t\t\t\t\t<!-- logo -->\n");
      out.write("\t\t\t\t\t\t<a href=\"./homepage.jsp\" class=\"site-logo\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/logo.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("    <hr>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <img src=\"img/cards.png\" alt=\"\">\n");
      out.write("    \n");
      out.write("    <form>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-xs-12 col-md-12\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h3 class=\"panel-title\">\n");
      out.write("                        Payment Details\n");
      out.write("                    </h3>\n");
      out.write("                    <div class=\"checkbox pull-right\">\n");
      out.write("                        <label>\n");
      out.write("                            <input type=\"checkbox\" />\n");
      out.write("                            Remember\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form role=\"form\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"cardNumber\">\n");
      out.write("                            CARD NUMBER</label>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"cardNumber\" placeholder=\"Valid Card Number\"\n");
      out.write("                                required autofocus />\n");
      out.write("                            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-lock\"></span></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-7 col-md-7\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"expityMonth\">\n");
      out.write("                                    EXPIRY DATE</label>\n");
      out.write("                                <div class=\"col-xs-6 col-lg-6 pl-ziro\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"expityMonth\" placeholder=\"MM\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-6 col-lg-6 pl-ziro\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"expityYear\" placeholder=\"YY\" required /></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-5 col-md-5 pull-right\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"cvCode\">\n");
      out.write("                                    CV CODE</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"cvCode\" placeholder=\"CV\" required />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                <li class=\"active\"><a href=\"#\"><span class=\"badge pull-right\"><span class=\"glyphicon glyphicon-usd\"></span>4200</span> Final Payment</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <br/>\n");
      out.write("            <a href=\"\" class=\"btn btn-success btn-lg btn-block\" role=\"button\">Pay</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("        <hr>\n");
      out.write("    \n");
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
