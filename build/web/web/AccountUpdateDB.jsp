<%-- 
    Document   : AccountUpdateDB
    Created on : Sep 23, 2019, 9:08:30 PM
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
        <%@page import="java.util.*" %>
        <%@page import="java.sql.*" %>
        <%@page import="java.io.*" %>

        <%     
            String name = request.getParameter("ACname");
            String addr = request.getParameter("ACaddr");
            String email = request.getParameter("ACemail");
            String mob = request.getParameter("ACmob");
            Integer c_id = Integer.parseInt(request.getParameter("ACid"));

            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
                String qry = "UPDATE CUSTOMER SET CUSTOMER_NAME=?,CUSTOMER_EMAIL=?,CUSTOMER_ADDR=?,CUSTOMER_MOB=?  WHERE CUSTOMER_ID="+c_id+"";
                PreparedStatement ps=con.prepareStatement(qry);
                ps.setString(1,name);	
                ps.setString(2,email);	
                ps.setString(3,addr);	
                ps.setString(4,mob);	
                int i=ps.executeUpdate();
                if(i>0)
                {                    
                    response.sendRedirect("myaccount.jsp");
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
        
    </body>
</html>
