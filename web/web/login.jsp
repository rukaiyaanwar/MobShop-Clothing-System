<%-- 
    Document   : select
    Created on : Aug 22, 2019, 2:30:38 PM
    Author     : Rukaiya_anwar17
--%>


<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
	
<%! String C_EMAIL="null",PASSWORD="null"; %>
	<%    
        C_EMAIL =request.getParameter("username");
        PASSWORD =request.getParameter("password");
    %>	
    <%
        try
        {
                Class.forName("oracle.jdbc.driver.OracleDriver");                
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
                String qry = "SELECT * FROM CUSTOMER WHERE  CUSTOMER_PWD='"+PASSWORD+"' and CUSTOMER_EMAIL='"+C_EMAIL+"'";                
                PreparedStatement ps = con.prepareStatement(qry);
                ResultSet rs = ps.executeQuery(qry);
                if(rs.next()){
                   
                    session.setAttribute("customer_id", rs.getInt("CUSTOMER_ID"));
                    session.setAttribute("customer_name", rs.getString("CUSTOMER_NAME"));
                    session.setAttribute("customer_email", rs.getString("CUSTOMER_EMAIL"));
                    session.setAttribute("customer_mob", rs.getString("CUSTOMER_MOB"));
                    session.setAttribute("customer_addr", rs.getString("CUSTOMER_ADDR"));
                    response.sendRedirect("myaccount.jsp"); 
                   
                }else{
                    out.println("Nhi Chala... ");
                }
                ps.close();
                con.close();            
            }
            catch(Exception ex){
               out.println(ex);
            }
        %>      
