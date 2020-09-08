<%-- 
    Document   : contact
    Created on : Sep 3, 2019, 11:56:07 AM
    Author     : Rukaiya_anwar17
--%>

<!--<%@page import="java.sql.*"%>    //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.
    <%@page import="java.sql.DriverManager"%> //The DriverManager provides a basic service for managing a set of JDBC drivers.
    <%@page import="java.sql.Connection"%>    //To set up a connection to a database.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <%! String CONTNAME, CONTEMAIL, CONTSUB,CONTMESSAGE; int CONT_ID; %>
        <%
                         try{
                            Class.forName("oracle.jdbc.driver.OracleDriver");  // Initialize your JDBC driver by calling the method Class.forName.  
                            Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");  //Establishing a connection.
                            String qry1="select max(CONT_ID) from CONTACT";  //Sending the query .   
                            PreparedStatement ps1=con1.prepareStatement(qry1); // It is used to execute parameterized query.
                             ResultSet rs1=ps1.executeQuery();  //contains the results of executing an SQL query. 
                             if(rs1.next())
                             {
                             CONT_ID=rs1.getInt(1);
                             CONT_ID++;
                             }
                            }catch(Exception ex)
                            {
                               out.println(ex);
                            }
        %>
        <%
          CONTNAME =request.getParameter("name");
          CONTEMAIL =request.getParameter("email");
	                 
          CONTSUB =request.getParameter("subject");
          CONTMESSAGE =request.getParameter("message"); 
          try{
              Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
              String qry="insert into CONTACT values(?,?,?,?,?)";
              PreparedStatement ps=con.prepareStatement(qry);
              ps.setInt(1,CONT_ID);
              ps.setString(2,CONTNAME);
              ps.setString(3,CONTEMAIL);  
              ps.setString(4,CONTSUB);
              ps.setString(5,CONTMESSAGE);
              ps.executeUpdate();
              ps.close();
              con.close();
              out.println("SUCCESSFULLY SUBMITTED");
          }catch(Exception e){
              out.println(e);
          }
        %>    
