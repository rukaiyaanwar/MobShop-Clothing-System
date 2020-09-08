<%-- 
    Document   : FeedbackProductDB
    Created on : Sep 26, 2019, 4:21:34 PM
    Author     : Virus
--%>

<!-- <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.-->
<!-- <%@page import="java.sql.DriverManager"%> //The DriverManager provides a basic service for managing a set of JDBC drivers. -->
<!-- <%@page import="java.sql.Connection"%>   //To set up a connection to a database. -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! String F_TEXT; Integer F_ID,C_ID,ORDER_ID; %>
        <%
         try{
            Class.forName("oracle.jdbc.driver.OracleDriver"); // Initialize your JDBC driver by calling the method Class.forName.  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya"); //Establishing a connection.
            String qry1="select max(F_ID) from FEEDBACK";   //Sending the query.
            PreparedStatement ps1=con.prepareStatement(qry1);  // It is used to execute parameterized query.
             ResultSet rs1=ps1.executeQuery(qry1);          //contains the results of executing an SQL query.
             if(rs1.next())
             {
             F_ID=rs1.getInt(1);
             ++F_ID;
             }
            }catch(Exception ex)
            {
               out.println(ex);
            }
        %>
        <%
           F_TEXT=request.getParameter("feedbackText");
          ORDER_ID = Integer.parseInt(request.getParameter("order_id"));
          C_ID = (Integer)session.getAttribute("customer_id");
          try{
              Class.forName("oracle.jdbc.driver.OracleDriver"); // Initialize your JDBC driver by calling the method Class.forName. 
              Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya"); //Establishing a connection.
              String qry="insert into FEEDBACK values(?,?,?,?)";  //Sending the query .
              PreparedStatement ps=con.prepareStatement(qry);     // It is used to execute parameterized query.
              ps.setInt(1,F_ID);
              ps.setInt(2,ORDER_ID);
              ps.setInt(3,C_ID);
              ps.setString(4,F_TEXT);
              ps.executeUpdate();
              ps.close();
              con.close();
              pageContext.forward("FeedbackConfirmation.jsp");
          }catch(Exception e){
              out.println(e);
          }
        %>  
    </body>
</html>
