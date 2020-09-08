<%-- 
    Document   : UpdateProductDB
    Created on : Sep 21, 2019, 9:34:30 PM
    Author     : Rukaiya_anwar17
--%>
<!--<%@page import="java.util.*" %>  //Java util package contains collection framework, collection classes, classes related to date and time, event model, internationalization, and miscellaneous utility classes. On importing this package, you can access all these classes and methods.
    <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.
    <%@page import="java.io.*" %>  //this statement means all the classes of io package will be imported. used when we are using input/output stream.
-->
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
        Class.forName("oracle.jdbc.driver.OracleDriver");  // Initialize your JDBC driver by calling the method Class.forName.
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");  //Establishing a connection.
        String qry1 = "UPDATE PRODUCT SET PROD_NAME=?,PR_FTR1=?,PR_FTR2=?,PR_FTR3=?,PR_DESC=?,PR_CATEGORY=?,PR_SKEY=?,BRAND=?,PRICE=?,MFG=?,QUANTITY=?,STOCK=?,SIZES=? WHERE PROD_ID='"+PROD_ID+"'"; //Sending the query
        PreparedStatement ps=con.prepareStatement(qry1);  // It is used to execute parameterized query.
                
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
        

