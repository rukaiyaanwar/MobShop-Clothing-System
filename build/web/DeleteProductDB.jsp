<%-- 
    Document   : delete
    Created on : Aug 23, 2019, 12:57:17 AM
    Author     : Rukaiya_anwar17
--%>
<!--        <%@page import="java.util.*" %>  /*Java util package contains collection framework, collection classes, classes related to date and time, event model, internationalization, and miscellaneous utility classes. On importing this package, you can access all these classes and methods. */-->
<!--        <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.-->
<!--        <%@page import="java.io.*" %>  //this statement means all the classes of io package will be imported. used when we are using input/output stream.-->
	
<%! int PROD_ID; %>
	<%    
        PROD_ID = Integer.parseInt(request.getParameter("prod_id"));
        
    %>	
    <%
        try
        {
                Class.forName("oracle.jdbc.driver.OracleDriver");   // Initialize your JDBC driver by calling the method Class.forName. 
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");   //Establishing a connection.
               

                 String qry="delete from PRODUCT where PROD_ID=?";    //Sending the query
                  PreparedStatement ps=con.prepareStatement(qry);    // It is used to execute parameterized query.
                  ps.setInt(1,PROD_ID);
                  ps.executeUpdate();
                  out.println("Record Deleted!");
                   ps.close();
                    con.close();   //close connection.
                    }catch(Exception ex)
                     {
                     out.println(ex);
                              }
                        %>
