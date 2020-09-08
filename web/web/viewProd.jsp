<%-- 
    Document   : viewProd
    Created on : Sep 3, 2019, 5:24:43 PM
    Author     : Virus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List Product</h1>
        
                <h1>Upload Product</h1>
        <%@page import="java.util.*" %>
        <%@page import="java.sql.*" %>
        <%@page import="java.io.*" %>
        <%
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
            String qry = "select * from mobshop.prod ";                
            PreparedStatement ps = con.prepareStatement(qry);
            ResultSet rs = ps.executeQuery(qry);
            while( rs.next()){
                %>
                
                <img src="img/product/<%=rs.getString("PROD_IMG")%>" width="200px" heigth="200px" />
                <%
            }
            ps.close();
            con.close();            
        }
        catch(Exception ex){
            out.println(ex);
        }
        %>   

    </body>
</html>
