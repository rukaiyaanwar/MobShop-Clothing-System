package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.io.*;

public final class addprod_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int PROD_ID,PRICE,QUANTITY,STOCK; String PROD_NAME,PR_FTR1,PR_FTR2,PR_FTR3,PR_DESC,PR_CATEGORY,PR_SKEY,BRAND,PROD_IMG,MFG,SIZE; 
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Product Upload Successful</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
    
            PROD_ID =Integer.parseInt(request.getParameter("prod_id"));
            PROD_NAME =request.getParameter("name");
            PROD_IMG=request.getParameter("image");
            PRICE =Integer.parseInt(request.getParameter("price"));
            BRAND =request.getParameter("brand");
            QUANTITY = Integer.parseInt(request.getParameter("quantity"));
            STOCK = Integer.parseInt(request.getParameter("stock"));
            PR_FTR1 = request.getParameter("prd_ftr1");
            PR_FTR2 = request.getParameter("prd_ftr2");
            PR_FTR3 = request.getParameter("prd_ftr3");
            PR_DESC =  PR_FTR1 = request.getParameter("desc");
            PR_CATEGORY = request.getParameter("category");
            PR_SKEY = request.getParameter("prd_skey");
            MFG = request.getParameter("mfg");
            SIZE = request.getParameter("size");
                        
        
      out.write("\t\n");
      out.write("        ");

            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
                String qry="insert into PRODUCT values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(qry);
                ps.setString(1,PROD_NAME);                
                ps.setString(2,BRAND);
                ps.setString(3,PR_CATEGORY);
                ps.setInt(4,PROD_ID);                
                ps.setString(5,PROD_IMG);
                ps.setString(6,PR_FTR1);
                ps.setString(7,PR_FTR2);
                ps.setString(8,PR_FTR3);
                ps.setString(9,PR_SKEY);
                ps.setInt(10,QUANTITY);
                ps.setString(11,SIZE);
                ps.setString(12,PR_DESC);
                ps.setInt(13,PRICE);
                ps.setInt(14,STOCK);
                ps.setString(15,MFG);
                ps.executeUpdate();
                out.println("ERROR");

                ps.close();
                con.close();            
            }
            catch(Exception ex){
               out.println(ex);
            }
        
      out.write("      \n");
      out.write("        \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
