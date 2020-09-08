<%-- 
    Document   : ad_login
    Created on : Aug 22, 2019, 12:52:24 AM
    Author     : Rukaiya_anwar17
--%>

<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
	
<%! String email,password; %>
	<%    
        email =request.getParameter("username");
        password =request.getParameter("pass");
    %>	
    <%
        try
        {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
                String qry="insert into login values(?,?)";
                PreparedStatement ps=con.prepareStatement(qry);
                ps.setString(2,email);                
                ps.setString(1,password);
                ps.executeUpdate();
                out.println("Hello, World!");
                response.sendRedirect("Admin.html");                
                ps.close();
                con.close();            
            }
            catch(Exception ex){
               out.println(ex);
            }
        %>      

