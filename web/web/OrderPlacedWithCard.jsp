<%-- 
    Document   : OrderPlacedWithCard
    Created on : Sep 22, 2019, 7:48:09 PM
    Author     : Maurya
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
        String totalPrice,paymentMode,orderQty,orderDate,orderStatus;
        String orderAddr,addrLine1,addrLine2,addrCountry,addrZip,addrMob,price;
        int customerId,orderId,prod_id,max=0;  
    %>

    <%            
//          DATA FOR ORDERS AND PRODUCT DETAIL TABLE ---------------------------------------- 
        
        orderStatus = "PENDING";
        paymentMode = request.getParameter("shipping");
        orderDate = java.time.LocalDate.now().toString();
        orderQty = request.getParameter("qty");
        try{
        customerId = (Integer)session.getAttribute("customer_id");
        }catch(Exception e){
            response.sendRedirect("login.html");                               
        }
        totalPrice = request.getParameter("totalprice");
        price = request.getParameter("price").toString();
        prod_id = Integer.parseInt(request.getParameter("prod_id"));

//          Complete Address Data

        addrLine1 =  request.getParameter("address");
        addrLine2 =  request.getParameter("address2");
        addrCountry =  request.getParameter("country");
        addrZip = request.getParameter("zip");
        addrMob = request.getParameter("phno");

        orderAddr = addrLine1+", "+addrLine2+", "+addrCountry+", "+addrZip;
        
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
            orderId = max+1;            
            ps.close();
            con.close();            
        }
        catch(Exception ex){
           out.println(ex);
        }            

        session.setAttribute("orderId", orderId);
        session.setAttribute("orderDate", orderDate);
        session.setAttribute("orderStatus", orderStatus);
        session.setAttribute("orderAddr", orderAddr);
        session.setAttribute("orderMob", addrMob);
        session.setAttribute("prod_id", prod_id);
        session.setAttribute("Price", price);
        session.setAttribute("prodPrice", totalPrice);
        session.setAttribute("totalQty",orderQty);
        session.setAttribute("cust_id", customerId);
        session.setAttribute("payMode", paymentMode);
    %>
    </body>
</html>
