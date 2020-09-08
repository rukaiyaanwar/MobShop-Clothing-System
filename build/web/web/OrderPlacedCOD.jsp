<%-- 
    Document   : OrderPlacedDB2
    Created on : Sep 20, 2019, 4:05:27 PM
    Author     : Virus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%! 
        String trans_id,totalPrice,paymentMode,orderQty,orderDate,orderStatus;
        String orderAddr,addrLine1,addrLine2,addrCountry,addrZip,addrMob,price;
        int customerId,orderId,prod_id,max=0;  
    %>

    <%            
//          DATA FOR ORDERS  TABLE ---------------------------------------- 
        orderDate = java.time.LocalDate.now().toString();
        orderStatus = "PENDING";
        trans_id = "NULL";
        paymentMode = request.getParameter("shipping");
        
        orderQty = request.getParameter("qty");
        try{
        customerId = (Integer)session.getAttribute("customer_id");
        }catch(Exception e){
            response.sendRedirect("login.html");                               
        }
        totalPrice = request.getParameter("totalprice");
        price = request.getParameter("price");
        prod_id = Integer.parseInt(request.getParameter("prod_id"));

//          Complete Address Data

        addrLine1 =  request.getParameter("address");
        addrLine2 =  request.getParameter("address2");
        addrCountry =  request.getParameter("country");
        addrZip = request.getParameter("zip");
        addrMob = request.getParameter("phno");

        orderAddr = addrLine1+""+addrLine2+""+addrCountry+""+addrZip;
        
//---------------------------Condition to Prevent Error-----------------------

        if (paymentMode.equals("Online")) {
            response.sendRedirect("PaymentGateway.jsp?price="+totalPrice+"");
        }        
//----------------------------Auto Increment Order Id--------------------------------------
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");                
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
            String qry = "SELECT * FROM ORDER2 ";                
            PreparedStatement ps = con.prepareStatement(qry);
            ResultSet rs = ps.executeQuery(qry);
            while(rs.next()){
               orderId = rs.getInt("order_id");
               if(orderId>=max){
               max = orderId;                              
               }               
            }
            orderId = ++max;            
            ps.close();
            con.close();            
        }
        catch(Exception ex){
           out.println(ex);
        }            


        
//----------------------Insert data in orders table--------------------------

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");                
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
            String qry = "INSERT INTO ORDERS VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";                
            PreparedStatement ps = con.prepareStatement(qry);
            ps.setInt(1,orderId);
            ps.setString(2,orderDate);
            ps.setString(3,orderStatus);            
            ps.setString(4,orderAddr);
            ps.setString(5,addrMob);
            ps.setInt(6,prod_id);
            ps.setString(7,price);            
            ps.setString(8,totalPrice);
            ps.setString(9,orderQty);
            ps.setInt(10,customerId);
            ps.setString(11,paymentMode);
            ps.setString(12,trans_id);
            ps.executeUpdate();            
            ps.close();
            con.close();
            response.sendRedirect("confirmation.jsp");
        }
        catch(Exception ex){
           out.println(ex);
        }            
        
        %>
    </body>
</html>
