<%-- 
    Document   : ChangePasswordDB
    Created on : Sep 6, 2019, 1:53:26 PM
    Author     : Rukaiya_anwar17
--%>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>

<%     
    String newPassword = request.getParameter("new_pwd");
	String sessionEmail = session.getAttribute("customer_email").toString();
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
        String qry1 = "UPDATE CUSTOMER SET PASSWORD=? WHERE C_EMAIL='"+sessionEmail+"'";
        PreparedStatement ps1=con1.prepareStatement(qry1);
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
        




