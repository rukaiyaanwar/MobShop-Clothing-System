<%-- 
    Document   : Admin_login
    Created on : Aug 27, 2019, 8:56:49 PM
    Author     : Rukaiya_anwar17
--%>

<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
	
<%! String A_EMAIL="null",PASSWORD="null"; %>
	<%    
        A_EMAIL =request.getParameter("username");
        PASSWORD =request.getParameter("pass");
    %>	
    <%
        try
        {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
                String qry = "select * from MOBSHOP.ADMIN where  password='"+PASSWORD+"' and A_EMAIL='"+A_EMAIL+"'";                
                PreparedStatement ps = con.prepareStatement(qry);
                ResultSet rs = ps.executeQuery(qry);
                if(rs.next()){
                    response.sendRedirect("homepage.html");                
                }else{
                    out.println("Errors... ");
                }
                ps.close();
                con.close();            
            }
            catch(Exception ex){
               out.println(ex);
            }
        %>      

