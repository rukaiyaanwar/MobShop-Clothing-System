<%-- 
    Document   : select
    Created on : Aug 22, 2019, 2:30:38 PM
    Author     : Rukaiya_anwar17
--%>


<!--<%@page import="java.util.*" %>  //Java util package contains collection framework, collection classes, classes related to date and time, event model, internationalization, and miscellaneous utility classes. On importing this package, you can access all these classes and methods.
    <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.
    <%@page import="java.io.*" %>  //this statement means all the classes of io package will be imported. used when we are using input/output stream.
-->	
	
<%! String C_EMAIL="null",PASSWORD="null"; %>
	<%    
        C_EMAIL =request.getParameter("username");
        PASSWORD =request.getParameter("password");
    %>	
    <%
        try
        {
                Class.forName("oracle.jdbc.driver.OracleDriver");        // Initialize your JDBC driver by calling the method Class.forName.        
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");   //Establishing a connection.
                String qry = "SELECT * FROM CUSTOMER WHERE  password='"+PASSWORD+"' and C_EMAIL='"+C_EMAIL+"'";   //Sending the query.             
                PreparedStatement ps = con.prepareStatement(qry);  // It is used to execute parameterized query.
                ResultSet rs = ps.executeQuery(qry);      //contains the results of executing an SQL query.
                if(rs.next()){
                   
                    session.setAttribute("customer_id", rs.getInt("C_ID"));  // This method is used to save an object in session by assigning a unique string to the object.
                    session.setAttribute("customer_name", rs.getString("C_NAME"));  // This method is used to save an object in session by assigning a unique string to the object.
                    session.setAttribute("customer_email", rs.getString("C_EMAIL")); // This method is used to save an object in session by assigning a unique string to the object.
                    session.setAttribute("customer_mob", rs.getString("C_PHONE"));  // This method is used to save an object in session by assigning a unique string to the object.
                    session.setAttribute("customer_addr", rs.getString("C_ADDR"));  // This method is used to save an object in session by assigning a unique string to the object.
                    response.sendRedirect("myaccount.jsp"); 
                   
                }else{
                    out.println("Invalid Login... ");
                }
                ps.close();
                con.close();            
            }
            catch(Exception ex){
               out.println(ex);
            }
        %>      
