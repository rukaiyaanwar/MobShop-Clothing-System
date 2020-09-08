<%-- 
    Document   : ForgetPasswd
    Created on : Sep 4, 2019, 11:29:57 PM
    Author     : Rukaiya_anwar17
--%>

<%@page import="java.io.*,java.sql.*" %>
        <% String C_EMAIL=null, PASSWORD=null; %>
        <%
        try {
            C_EMAIL=request.getParameter("customer_email");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
            String qry="Select * from CUSTOMER where c_email='"+C_EMAIL+"'";
             PreparedStatement ps=con.prepareStatement(qry);
            ResultSet rs= ps.executeQuery(qry);
            if(rs.next())
            {
                
                 out.println("ChangePassword.jsp");
                
            }
            else
            {
             out.println("Invalid EmailID");   
            }
        }
        catch(Exception ex)
        {out.println(ex);}
        %>