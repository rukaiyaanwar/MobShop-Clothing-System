<%-- 
    Document   : Admin_login
    Created on : Aug 27, 2019, 8:56:49 PM
    Author     : Rukaiya_anwar17
--%>

<!--    <%@page import="java.util.*" %>  //Java util package contains collection framework, collection classes, classes related to date and time, event model, internationalization, and miscellaneous utility classes. On importing this package, you can access all these classes and methods.-->
<!--    <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.-->
<!--    <%@page import="java.io.*" %>  //this statement means all the classes of io package will be imported. used when we are using input/output stream.-->
<%! String A_EMAIL="null",PASSWORD="null"; %>
	<%    
        A_EMAIL =request.getParameter("username");  //to retrieve the input values from Form.
        PASSWORD =request.getParameter("pass");     //to retrieve the input values from Form.
    %>	
    <%
        try
        {
                Class.forName("oracle.jdbc.driver.OracleDriver");    // Initialize your JDBC driver by calling the method Class.forName.  
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");   //Establishing a connection.
                String qry = "select * from MOBSHOP.ADMIN where  password='"+PASSWORD+"' and A_EMAIL='"+A_EMAIL+"'";      //Sending the query .            
                PreparedStatement ps = con.prepareStatement(qry);           // It is used to execute parameterized query.
                ResultSet rs = ps.executeQuery(qry);                     //contains the results of executing an SQL query.   
                if(rs.next()){
                    session.setAttribute("A_ID", rs.getInt("A_ID"));   // This method is used to save an object in session by assigning a unique string to the object.
                    session.setAttribute("A_NAME", rs.getString("A_NAME")); // This method is used to save an object in session by assigning a unique string to the object.

                    response.sendRedirect("Admin.jsp");  //Response Redirect to Admin.jsp       
                }else{
                    out.println("Errors... ");
                }
                ps.close();
                con.close();            
            }
            catch(Exception ex){
               out.println(ex);
            }
        %>      

