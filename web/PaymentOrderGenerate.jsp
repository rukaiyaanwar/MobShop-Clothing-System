<%-- 
    Document   : PayemtOrderGenerate
    Created on : Sep 15, 2019, 12:27:20 AM
    Author     : Maurya
--%>

<!-- <%@page import="java.sql.ResultSet"%>         //It is a table of data representing a database query result.
<%@page import="java.sql.PreparedStatement"%> //A SQL statement is pre-compiled and stored in a PreparedStatement object. This object can then be used to efficiently execute this statement multiple times.
<%@page import="java.sql.DriverManager"%>     //The DriverManager provides a basic service for managing a set of JDBC drivers.
<%@page import="java.sql.Connection"%>        ////To set up a connection to a database.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
    <%! 
        String transId,totalPrice,paymentMode,orderQty,orderDate,orderStatus;
        String orderAddr,addrLine1,addrLine2,addrCountry,addrZip,addrMob,price;
        int customerId,orderId,prod_id,max=0,paymentPrice;  
    %>

    <%            
        
        transId = request.getParameter("trans_id");
        try{
        customerId = (Integer)session.getAttribute("customer_id");
        }catch(Exception e){
            response.sendRedirect("login.html");                               
        }


        orderId = (Integer)session.getAttribute("orderId");
        orderDate = session.getAttribute("orderDate").toString();
        orderStatus = session.getAttribute("orderStatus").toString();
        orderAddr = session.getAttribute("orderAddr").toString();
        addrMob = session.getAttribute("orderMob").toString();
        prod_id = (Integer)session.getAttribute("prod_id");
        price = session.getAttribute("Price").toString();
        totalPrice = session.getAttribute("prodPrice").toString();
        orderQty = session.getAttribute("totalQty").toString();
        customerId = (Integer)session.getAttribute("customer_id");
        paymentMode = session.getAttribute("payMode").toString();
        

//----------------------------Auto Increment Order Id--------------------------------------
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");                // Initialize your JDBC driver by calling the method Class.forName. 
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya"); //Establishing a connection.
            String qry = "SELECT * FROM ORDERS ";                //Sending the query
            PreparedStatement ps = con.prepareStatement(qry);    // It is used to execute parameterized query.
            ResultSet rs = ps.executeQuery(qry);                  //contains the results of executing an SQL query.
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
            Class.forName("oracle.jdbc.driver.OracleDriver");                 // Initialize your JDBC driver by calling the method Class.forName. 
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");  //Establishing a connection.
            String qry = "INSERT INTO ORDERS VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";             //Sending the query    
            PreparedStatement ps = con.prepareStatement(qry);        // It is used to execute parameterized query.
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
            ps.setString(12,transId);
            ps.executeUpdate();            
            ps.close();
            con.close();
            response.sendRedirect("confirmation.jsp");
        }
        catch(Exception ex){
           out.println(ex);
        }            
        


//            out.println("<br /> <br /> <br /> ------------------Orders Table-------------------");        
//            out.println("<br /> Order Id : "+orderId);
//            out.println("<br /> Payment Flag : "+paymentFlag);
//            out.println("<br /> Transaction Id : "+transactionId );
//            out.println("<br /> Payment Mode : "+paymentMode);
//            out.println("<br /> Order dat : "+orderDate);
//            out.println("<br /> Order qty : "+orderQty);
//            out.println("<br /> Customer ID : "+customerId );            
//            out.println("<br /> Total Price : "+totalPrice);
//            out.println("<br /> Order Address : "+orderAddr);
//            out.println("<br /> Order Contact : "+addrMob);            
//
//            out.println("<br /> <br /> <br /> ------------------Product Detail Table-------------------");        
//            out.println("<br /> Prod detail id : "+prod_detail_id);
//            out.println("<br /> Order : "+orderId);
//            out.println("<br /> Prod id : "+prod_id );
//            out.println("<br /> Product Detail Qty : "+orderQty);
//            out.println("<br /> Product Deatil Amt : "+totalPrice);

        %>
    </body>
</html>
