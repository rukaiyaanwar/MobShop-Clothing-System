<%-- 
    Document   : ChangePasswordDB
    Created on : Sep 6, 2019, 1:53:26 PM
    Author     : Rukaiya_anwar17
--%>
<!--    <%@page import="java.util.*" %>  //Java util package contains collection framework, collection classes, classes related to date and time, event model, internationalization, and miscellaneous utility classes. On importing this package, you can access all these classes and methods.-->
<!--    <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.-->
<!--    <%@page import="java.io.*" %>  //this statement means all the classes of io package will be imported. used when we are using input/output stream.-->
<%     
    String newPassword = request.getParameter("new_pwd");
	String sessionEmail = session.getAttribute("customer_email").toString();
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");    // Initialize your JDBC driver by calling the method Class.forName. 
        Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");   //Establishing a connection.
        String qry1 = "UPDATE CUSTOMER SET PASSWORD=? WHERE C_EMAIL='"+sessionEmail+"'";    //Sending the query.
        PreparedStatement ps1=con1.prepareStatement(qry1);    // It is used to execute parameterized query.
        ps1.setString(1,newPassword);	
        int i=ps1.executeUpdate();
        if(i>0)
        {
                out.print("Record Updated Successfully");
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
        




