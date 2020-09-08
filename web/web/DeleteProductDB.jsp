<%-- 
    Document   : delete
    Created on : Aug 23, 2019, 12:57:17 AM
    Author     : Rukaiya_anwar17
--%>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
	
<%! int PROD_ID; %>
	<%    
        PROD_ID = Integer.parseInt(request.getParameter("prod_id"));
        
    %>	
    <%
        try
        {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
               

                 String qry="delete from PRODUCT where PROD_ID=?";
                  PreparedStatement ps=con.prepareStatement(qry);
                  ps.setInt(1,PROD_ID);
                  ps.executeUpdate();
                  out.println("Record Deleted!");
                   ps.close();
                    con.close();
                    }catch(Exception ex)
                     {
                     out.println(ex);
                              }
                        %>
