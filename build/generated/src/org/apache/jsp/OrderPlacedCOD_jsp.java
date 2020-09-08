package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.io.*;

public final class OrderPlacedCOD_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
        String trans_id,totalPrice,paymentMode,orderQty,orderDate,orderStatus;
        String orderAddr,addrLine1,addrLine2,addrCountry,addrZip,addrMob,price;
        int customerId,orderId,prod_id,max=0;  
    
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    ");
            
//          DATA FOR ORDERS  TABLE ---------------------------------------- 
        orderDate = java.time.LocalDate.now().toString();
        orderStatus = "PENDING";
        trans_id = "NULL";
        paymentMode = request.getParameter("shipping");
        
        orderQty = request.getParameter("qty");
        try{
        customerId = (Integer)session.getAttribute("customer_id");
        }catch(Exception e){
            response.sendRedirect("login.html");                               
        }
        totalPrice = request.getParameter("totalprice");
        price = request.getParameter("price");
        prod_id = Integer.parseInt(request.getParameter("prod_id"));

//          Complete Address Data

        addrLine1 =  request.getParameter("address");
        addrLine2 =  request.getParameter("address2");
        addrCountry =  request.getParameter("country");
        addrZip = request.getParameter("zip");
        addrMob = request.getParameter("phno");

        orderAddr = addrLine1+""+addrLine2+""+addrCountry+""+addrZip;
        
//---------------------------Condition to Prevent Error-----------------------

        if (paymentMode.equals("Online")) {
            response.sendRedirect("PaymentGateway.jsp?price="+totalPrice+"");
        }        
//----------------------------Auto Increment Order Id--------------------------------------
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");                
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
            String qry = "SELECT * FROM ORDERS ";                
            PreparedStatement ps = con.prepareStatement(qry);
            ResultSet rs = ps.executeQuery(qry);
            while(rs.next()){
               orderId = rs.getInt("order_id");
               if(orderId>=max){
               max = orderId;                              
               }               
            }
            orderId = ++max;            
            ps.close();
            con.close();            
        }
        catch(Exception ex){
           out.println(ex);
        }            


        
//----------------------Insert data in orders table--------------------------

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");                
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
            String qry = "INSERT INTO ORDERS VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";                
            PreparedStatement ps = con.prepareStatement(qry);
            ps.setInt(1,orderId);
            ps.setString(2,orderDate);
            ps.setString(3,orderStatus);            
            ps.setString(4,orderAddr);
            ps.setString(5,addrMob);
            ps.setInt(6,prod_id);
            ps.setString(7,price);            
            ps.setString(8,totalPrice);
            ps.setString(9,orderQty);
            ps.setInt(10,customerId);
            ps.setString(11,paymentMode);
            ps.setString(12,trans_id);
            ps.executeUpdate();            
            ps.close();
            con.close();
            response.sendRedirect("confirmation.jsp");
        }
        catch(Exception ex){
           out.println(ex);
        }            
        
        
      out.write("\n");
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
