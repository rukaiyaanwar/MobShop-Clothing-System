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
<!--        <%@page import="java.util.*" %>  //Java util package contains collection framework, collection classes, classes related to date and time, event model, internationalization, and miscellaneous utility classes. On importing this package, you can access all these classes and methods.-->
<!--        <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.-->
<!--        <%@page import="java.io.*" %>  //this statement means all the classes of io package will be imported. used when we are using input/output stream.-->

        <%     
            String name = request.getParameter("ACname"); //to retrieve the input values from Form.
            String addr = request.getParameter("ACaddr"); //to retrieve the input values from Form.
            String email = request.getParameter("ACemail"); //to retrieve the input values from Form.
            String mob = request.getParameter("ACmob"); //to retrieve the input values from Form.
            Integer c_id = Integer.parseInt(request.getParameter("ACid")); //to retrieve the input values from Form.

            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");    // Initialize your JDBC driver by calling the method Class.forName.  
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");  //Establishing a connection.
                String qry = "UPDATE CUSTOMER SET C_NAME=?,C_EMAIL=?,C_ADDR=?,C_PHONE=?  WHERE C_ID="+c_id+"";   //Sending the query
                PreparedStatement ps=con.prepareStatement(qry);     // It is used to execute parameterized query.
                ps.setString(1,name);	
                ps.setString(2,email);	
                ps.setString(3,addr);	
                ps.setString(4,mob);	
                int i=ps.executeUpdate();
                if(i>0)
                {                    
                    response.sendRedirect("myaccount.jsp");  //Redirects to Myaccount Page.
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
