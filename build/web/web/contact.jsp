<%-- 
    Document   : contact
    Created on : Sep 3, 2019, 11:56:07 AM
    Author     : Rukaiya_anwar17
--%>

<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <%! String CONTNAME, CONTEMAIL, CONTSUB,CONTMESSAGE; int CONT_ID; %>
        <%
                         try{
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
                            String qry1="select max(CONT_ID) from CONTACT";
                            PreparedStatement ps1=con1.prepareStatement(qry1);
                             ResultSet rs1=ps1.executeQuery();
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
