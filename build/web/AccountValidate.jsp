<%-- 
    Document   : AccountValidate
    Created on : Sep 8, 2019, 4:35:30 PM
    Author     : Rukaiya_anwar17
--%>
<!--    <%@page import="java.util.*" %>  //Java util package contains collection framework, collection classes, classes related to date and time, event model, internationalization, and miscellaneous utility classes. On importing this package, you can access all these classes and methods.-->
<!--    <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.-->
<!--    <%@page import="java.io.*" %>  //this statement means all the classes of io package will be imported. used when we are using input/output stream.-->
<%! String C_EMAIL="null",PASSWORD="null"; %>
	<%    
        C_EMAIL =request.getParameter("customer_email");  //to retrieve the input values from Form.
       
    %>	
    <%
        try
        {
                Class.forName("oracle.jdbc.driver.OracleDriver");           // Initialize your JDBC driver by calling the method Class.forName.        
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");  //Establishing a connection.
                String qry = "SELECT * FROM CUSTOMER WHERE C_EMAIL='"+C_EMAIL+"'";            //Sending the query     
                PreparedStatement ps = con.prepareStatement(qry);     // It is used to execute parameterized query.
                ResultSet rs = ps.executeQuery(qry);                  //contains the results of executing an SQL query.
                if(rs.next()){
					
                    String emailSession = rs.getString("C_EMAIL");
                    session.setAttribute("customer_email",emailSession);
                   
                    response.sendRedirect("GeneratePassword.jsp"); //Redirect to GeneratePassword.jsp
                   
                }else{
                    out.println("Error... ");
                }
                ps.close();
                con.close();            
            }
            catch(Exception ex){
               out.println(ex);
            }
        %>      