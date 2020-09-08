<%-- 
    Document   : UpdateProductDB
    Created on : Sep 21, 2019, 9:34:30 PM
    Author     : Rukaiya_anwar17
--%>
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
            PR_FTR1= request.getParameter("maurya");
            PR_FTR2= request.getParameter("maurya2");
            PR_FTR3= request.getParameter("maurya3");
            PR_SKEY= request.getParameter("pr_skey");
            QUANTITY= Integer.parseInt(request.getParameter("quantity"));
            SIZES= request.getParameter("size");
            PR_DESC = request.getParameter("desc");
            PRICE =Integer.parseInt(request.getParameter("price"));
            STOCK = Integer.parseInt(request.getParameter("stock"));         
            MFG = request.getParameter("mfg");
   
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
        String qry1 = "UPDATE PRODUCT SET PROD_NAME=?,PR_FTR1=?,PR_FTR2=?,PR_FTR3=?,PR_DESC=?,PR_CATEGORY=?,PR_SKEY=?,BRAND=?,PRICE=?,MFG=?,QUANTITY=?,STOCK=?,SIZES=? WHERE PROD_ID='"+PROD_ID+"'";
        PreparedStatement ps=con.prepareStatement(qry1);
                
                ps.setString(1,PROD_NAME);                
                ps.setString(2,PR_FTR1);
                ps.setString(3,PR_FTR2);
                ps.setString(4,PR_FTR3);
                ps.setString(5,PR_DESC);                
                ps.setString(6,PR_CATEGORY);
                ps.setString(7,PR_SKEY);
                ps.setString(8,BRAND);
                ps.setInt(9,PRICE);
                ps.setString(10,MFG);                
                ps.setInt(11,QUANTITY);
                ps.setInt(12,STOCK);                
                ps.setString(13,SIZES);	
        int i=ps.executeUpdate();
        if(i>0)
        {
                out.print("PRODUCT Updated Successfully");
        }
        else{
                out.print("There is a problem in updating Record.");
        }
    }
    catch(Exception e)
    {
        out.println("EXCEPTION H : \n ");
        out.println(""+e.getMessage());
    }


%>      
        

