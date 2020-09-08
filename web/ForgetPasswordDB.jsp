<%-- 
    Document   : ForgetPasswd
    Created on : Sep 4, 2019, 11:29:57 PM
    Author     : Rukaiya_anwar17
--%>

<!--        <%@page import="java.io.*,java.sql.*" %> //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.:java.sql.*;-->
<!--       //this statement means all the classes of io package will be imported. used when we are using input/output stream.:java.io.*-->
        <% String C_EMAIL=null, PASSWORD=null; %>
        <%
        try {
            C_EMAIL=request.getParameter("customer_email");
            Class.forName("oracle.jdbc.driver.OracleDriver");   // Initialize your JDBC driver by calling the method Class.forName.
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");  ////Establishing a connection.
            String qry="Select * from CUSTOMER where c_email='"+C_EMAIL+"'";   //Sending the query
             PreparedStatement ps=con.prepareStatement(qry);       // It is used to execute parameterized query.
            ResultSet rs= ps.executeQuery(qry);     //contains the results of executing an SQL query.
            if(rs.next())
            {
                
                 out.println("ChangePassword.jsp");
                
            }
            else
            {
             out.println("Invalid EmailID");   
            }
        }
        catch(Exception ex)
        {out.println(ex);}
        %>