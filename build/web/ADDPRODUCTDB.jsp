<%-- 
    Document   : addprod
    Created on : Sep 4, 2019, 12:39:34 AM
    Author     : Rukaiya_anwar17
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
	
        <%! int PROD_ID,PRICE,QUANTITY,STOCK; String PROD_NAME,PR_FTR1,PR_FTR2,PR_FTR3,PR_DESC,PR_CATEGORY,PR_SKEY,BRAND,PROD_IMG,MFG,SIZES; %>
        <%    
            
            PROD_NAME =request.getParameter("name");
            BRAND =request.getParameter("brand");
            PR_CATEGORY = request.getParameter("category");
            PROD_ID =Integer.parseInt(request.getParameter("prod_id"));
            PROD_IMG=request.getParameter("image");
            PR_FTR1= request.getParameter("ftr1");
            PR_FTR2= request.getParameter("ftr2");
            PR_FTR3= request.getParameter("ftr3");
            PR_SKEY= request.getParameter("pr_skey");
            QUANTITY= Integer.parseInt(request.getParameter("quantity"));
            SIZES= request.getParameter("size");
            PR_DESC = request.getParameter("desc");
            PRICE =Integer.parseInt(request.getParameter("price"));
            STOCK = Integer.parseInt(request.getParameter("stock"));         
            MFG = request.getParameter("mfg");
            
                     
        %>	
        <%
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
                String qry="insert into PRODUCT values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(qry);
                ps.setInt(1,PROD_ID);                
                ps.setString(2,PROD_NAME);                
                ps.setString(3,PR_FTR1);
                ps.setString(4,PR_FTR2);
                ps.setString(5,PR_FTR3);
                ps.setString(6,PR_DESC);                
                ps.setString(7,PR_CATEGORY);
                ps.setString(8,PR_SKEY);
                ps.setString(9,BRAND);
                ps.setInt(10,PRICE);
                ps.setString(11,MFG);                
                ps.setString(12,PROD_IMG);
                ps.setInt(13,QUANTITY);
                ps.setInt(14,STOCK);                
                ps.setString(15,SIZES);

                ps.executeUpdate();
                out.println("Congratulations!");

                ps.close();
                con.close();            
            }
            catch(Exception ex){
               out.println(ex);
            }
        %>      
        

    </body>
</html>

