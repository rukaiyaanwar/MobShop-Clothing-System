package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newhtml_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <h3>ADD PRODUCT</h3>\n");
      out.write("    <form action=\"testJsp.jsp\" method=\"get\"  >\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("                    <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Product Name\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"brand\" name=\"brand\" placeholder=\"Brand\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-7 form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"category\" name=\"category\" placeholder=\"Product Category\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-5 form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"prod_id\" name=\"prod_id\" placeholder=\"Product ID\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("             <div class=\"col-md-6 form-group\">\n");
      out.write("                    <input type=\"text\" name=\"rukaiya\" placeholder=\"Product Feature 1\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("                    <input type=\"text\"  name=\"rukaiya2\" placeholder=\"Product Feature 2\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("                    <input type=\"text\" name=\"rukaiya3\" placeholder=\"Product Feature 3\">\n");
      out.write("            </div>\n");
      out.write("<!--            <div class=\"col-md-6 form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"pr_skey\" name=\"pr_skey\" placeholder=\"Search Keyword\">\n");
      out.write("            </div>-->\n");
      out.write("\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"prd_skey\" name=\"prd_skey\" placeholder=\"Search Keyword\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div class=\"col-md-7 form-group\">\n");
      out.write("                    <input type=\"number\" class=\"form-control\" id=\"amount\" name=\"quantity\" placeholder=\"Product Quantity\">\n");
      out.write("            </div>\n");
      out.write("             <div class=\"col-md-5 form-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"size\" name=\"size\" placeholder=\"Size\">\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-12 form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"desc\" name=\"desc\" placeholder=\"Product Description\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("                    <input type=\"number\" class=\"form-control\" id=\"price\" name=\"price\" placeholder=\"Product Price\">\n");
      out.write("            </div>\n");
      out.write("             <div class=\"col-md-6 form-group\">\n");
      out.write("                    <input type=\"number\" class=\"form-control\" id=\"price\" name=\"stock\" placeholder=\"Stock\">\n");
      out.write("            </div>\n");
      out.write("           <div class=\"col-md-12 form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"mfg\" name=\"mfg\" placeholder=\"Product Manufactured Date\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-12 form-group\">\n");
      out.write("                    <input type=\"file\" class=\"form-control\" id=\"image\" name=\"image\" placeholder=\"Upload Image\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-md-12 form-group\">\n");
      out.write("                    <button type=\"submit\" value=\"submit\" class=\"btn submit_btn\">ADD PRODUCT</button>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>    \n");
      out.write("    </body>\n");
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
