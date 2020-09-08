package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaymentGateway_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            #payment{\n");
      out.write("               background-image: url(\"img/pay.png\");\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("            }\n");
      out.write("            #makePayment{\n");
      out.write("                margin: 36px 0px 0px 432px;\n");
      out.write("                width: 460px;\n");
      out.write("                height: 45px;\n");
      out.write("                padding-left: 10px;                                \n");
      out.write("                font-size: 12pt;  \n");
      out.write("                background-color: #F2CC6C;\n");
      out.write("                border-radius: 3px;\n");
      out.write("            }\n");
      out.write("            #card_no{\n");
      out.write("                margin: 253px 0px 0px 434px;\n");
      out.write("                width: 392px;\n");
      out.write("                height: 34px;\n");
      out.write("                padding-left: 10px;                \n");
      out.write("                font-size: 11pt;                \n");
      out.write("            }\n");
      out.write("            #month{\n");
      out.write("                margin: 41px 0px 0px 434px;\n");
      out.write("                width: 117px;\n");
      out.write("                height: 34px;\n");
      out.write("                padding-left: 10px;                \n");
      out.write("                font-size: 11pt;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #year{\n");
      out.write("                margin: 41px 0px 0px 26px;\n");
      out.write("                width: 118px;\n");
      out.write("                height: 34px;\n");
      out.write("                padding-left: 10px;                \n");
      out.write("                font-size: 11pt;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #cvv{\n");
      out.write("                margin: 41px 0px 0px 26px;\n");
      out.write("                width: 117px;\n");
      out.write("                height: 34px;\n");
      out.write("                padding-left: 10px;                \n");
      out.write("                font-size: 11pt;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #card_holder_name{\n");
      out.write("                margin: 41px 0px 0px 434px;\n");
      out.write("                width: 441px;\n");
      out.write("                height: 34px;\n");
      out.write("                padding-left: 10px;                                \n");
      out.write("                font-size: 11pt;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body id=\"payment\">\n");
      out.write("        <form action=\"PaymentGatewayDB.jsp\" method=\"get\">\n");
      out.write("        <div id=\"imagePayment\">\n");
      out.write("            <input type=\"text\" id=\"card_no\" name=\"card_no\" placeholder=\"Enter card number\" /> <br />\n");
      out.write("            <input type=\"text\" id=\"month\" name=\"month\" placeholder=\"Month\" /> \n");
      out.write("            <input type=\"text\" id=\"year\" name=\"year\" placeholder=\"Year\" /> \n");
      out.write("            <input type=\"text\" id=\"cvv\" name=\"cvv\" placeholder=\"\" /> <br />\n");
      out.write("            <input type=\"text\" id=\"card_holder_name\" name=\"card_holder_name\" placeholder=\"Enter card holder name\" /> <br />\n");
      out.write("            <input type=\"submit\" value=\"Make Payment\" id=\"makePayment\" />\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("  \n");
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
