<%-- 
    Document   : register
    Created on : Aug 26, 2019, 7:31:41 PM
    Author     : Rukaiya_anwar17
--%>
<!-- <%@page import="java.sql.*"%> //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.
     <%@page import="java.sql.DriverManager"%> //The DriverManager provides a basic service for managing a set of JDBC drivers.
     <%@page import="java.sql.Connection"%>   //To set up a connection to a database.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <%! String C_NAME, C_EMAIL, PASSWORD,C_ADDR; int C_ID,C_PHONE; %>
        <%
                         try{
                            Class.forName("oracle.jdbc.driver.OracleDriver"); // Initialize your JDBC driver by calling the method Class.forName.
                            Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya"); //Establishing a connection.
                            String qry1="select max(C_ID) from CUSTOMER";   //Sending the query
                            PreparedStatement ps1=con1.prepareStatement(qry1); // It is used to execute parameterized query.
                             ResultSet rs1=ps1.executeQuery();  //contains the results of executing an SQL query.
                             if(rs1.next())
                             {
                             C_ID=rs1.getInt(1);
                             C_ID++;
                             }
                            }catch(Exception ex)
                            {
                               out.println(ex);
                            }
        %>
        <%
          C_NAME =request.getParameter("name");
          C_EMAIL =request.getParameter("email");
	  C_PHONE = Integer.parseInt(request.getParameter("phone"));                  
          PASSWORD =request.getParameter("password");
          C_ADDR =request.getParameter("address"); 
          try{
              Class.forName("oracle.jdbc.driver.OracleDriver"); // Initialize your JDBC driver by calling the method Class.forName.
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya"); //Establishing a connection.
              String qry="insert into CUSTOMER values(?,?,?,?,?,?)"; //Sending the query
              PreparedStatement ps=con.prepareStatement(qry); // It is used to execute parameterized query.
              ps.setInt(1,C_ID);
              ps.setString(2,C_NAME);
              ps.setString(3,C_EMAIL);
              ps.setInt(4,C_PHONE);
              ps.setString(5,PASSWORD);
              ps.setString(6,C_ADDR);
              ps.executeUpdate();
              ps.close();
              con.close();
              pageContext.forward("login.html");
          }catch(Exception e){
              out.println(e);
          }
        %>    