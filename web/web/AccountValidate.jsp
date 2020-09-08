<%-- 
    Document   : AccountValidate
    Created on : Sep 8, 2019, 4:35:30 PM
    Author     : Rukaiya_anwar17
--%>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%! String C_EMAIL="null",PASSWORD="null"; %>
	<%    
        C_EMAIL =request.getParameter("customer_email");
       
    %>	
    <%
        try
        {
                Class.forName("oracle.jdbc.driver.OracleDriver");                
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");
                String qry = "SELECT * FROM CUSTOMER WHERE C_EMAIL='"+C_EMAIL+"'";                
                PreparedStatement ps = con.prepareStatement(qry);
                ResultSet rs = ps.executeQuery(qry);
                if(rs.next()){
					
                    String emailSession = rs.getString("C_EMAIL");
                    session.setAttribute("customer_email",emailSession);
                   
                    response.sendRedirect("GeneratePassword.jsp"); 
                   
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