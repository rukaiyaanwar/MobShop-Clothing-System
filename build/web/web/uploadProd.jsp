<%-- 
    Document   : uploadProd
    Created on : Sep 3, 2019, 4:40:06 PM
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
        <h1>Product Upload Successful</h1>
        
        <%@page import="java.util.*" %>
	<%@page import="java.sql.*" %>
	<%@page import="java.io.*" %>
	
        <%! int prod_id,price; String name,brand,pic; %>
        <%    
            prod_id =Integer.parseInt(request.getParameter("id"));
            name =request.getParameter("name");
            pic =request.getParameter("img");
            price =Integer.parseInt(request.getParameter("price"));
            brand =request.getParameter("brand");
                        
        %>	
        <%
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
                String qry="insert into prod values(?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(qry);
                ps.setInt(1,prod_id);                
                ps.setString(2,name);
                ps.setString(3,pic);
                ps.setInt(4,price);                
                ps.setString(5,brand);
                ps.executeUpdate();
                out.println("Chutiya");

                ps.close();
                con.close();            
            }
            catch(Exception ex){
               out.println(ex);
            }
        %>      
        

    </body>
</html>
