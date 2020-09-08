<%-- 
    Document   : OrderPlacedDB
    Created on : Sep 15, 2019, 4:44:56 PM
    Author     : Virus
--%>

<!--<%@page import="java.sql.ResultSet"%> //A ResultSet is a Java object that contains the results of executing an SQL query. 
<%@page import="java.sql.PreparedStatement"%> //A SQL statement is pre-compiled and stored in a PreparedStatement object. This object can then be used to efficiently execute this statement multiple times.
<%@page import="java.sql.DriverManager"%> //The DriverManager provides a basic service for managing a set of JDBC drivers.
<%@page import="java.sql.Connection"%>   //To set up a connection to a database.
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
        String paymentFlag,transactionId,totalPrice,paymentMode,orderQty,orderDate;
        String orderAddr,addrLine1,addrLine2,addrCountry,addrZip,addrMob;
        int customerId,orderId,prod_id,max=0,prod_detail_id;  
    %>

    <%            
//          DATA FOR ORDERS AND PRODUCT DETAIL TABLE ---------------------------------------- 
        paymentFlag = "NO";
        transactionId = "NULL";
        paymentMode = request.getParameter("shipping");
        orderDate = java.time.LocalDate.now().toString();
        orderQty = request.getParameter("qty");
        try{
        customerId = (Integer)session.getAttribute("customer_id");
        }catch(Exception e){
            response.sendRedirect("login.html");                               
        }
        totalPrice = request.getParameter("totalprice");
        prod_id = Integer.parseInt(request.getParameter("prod_id"));

//          Complete Address Data

        addrLine1 =  request.getParameter("address");
        addrLine2 =  request.getParameter("address2");
        addrCountry =  request.getParameter("country");
        addrZip = request.getParameter("zip");
        addrMob = request.getParameter("phno");

        orderAddr = addrLine1+" "+addrLine2+" "+addrCountry+" "+addrZip;
        
//---------------------------Condition to Prevent Error-----------------------

        if (paymentMode.equals("Online")) {
            response.sendRedirect("PaymentGateway.jsp?totalBill="+totalPrice);
        }        
//----------------------------Auto Increment Order Id--------------------------------------
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");              // Initialize your JDBC driver by calling the method Class.forName.    
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya"); //Establishing a connection.
            String qry = "SELECT * FROM ORDERS ";            //Sending the query .
            PreparedStatement ps = con.prepareStatement(qry);    // It is used to execute parameterized query.
            ResultSet rs = ps.executeQuery(qry);   //contains the results of executing an SQL query.   
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
            Class.forName("oracle.jdbc.driver.OracleDriver");           // Initialize your JDBC driver by calling the method Class.forName.      
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya"); //Establishing a connection.
            String qry = "INSERT INTO ORDERS VALUES(?,?,?,?,?,?,?,?,?,?)";             //Sending the query .      
            PreparedStatement ps = con.prepareStatement(qry);    // It is used to execute parameterized query.
            ps.setInt(1,orderId);
            ps.setString(2,paymentFlag);
            ps.setString(3,transactionId);            
            ps.setString(4,paymentMode);
            ps.setString(5,orderDate);
            ps.setString(6,orderQty);
            ps.setInt(7,customerId);            
            ps.setString(8,totalPrice);
            ps.setString(9,orderAddr);
            ps.setString(10,addrMob);
            ps.executeUpdate();            
            ps.close();
            con.close();            
        }
        catch(Exception ex){
           out.println(ex);
        }            
//----------------------------Auto Increment Order Id--------------------------------------
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");                // Initialize your JDBC driver by calling the method Class.forName. 
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya"); //Establishing a connection.
            String qry = "SELECT * FROM PRODUCT_DETAIL ";                //Sending the query .
            PreparedStatement ps = con.prepareStatement(qry);            // It is used to execute parameterized query.
            ResultSet rs = ps.executeQuery(qry);                        //contains the results of executing an SQL query.  
            max=0;
            while(rs.next()){
               prod_detail_id = rs.getInt("PROD_DETAIL_ID");
               if(prod_detail_id>=max){
               max = prod_detail_id;               
               }               
            }
            prod_detail_id = ++max;
            ps.close();
            con.close();            
        }
        catch(Exception ex){
           out.println(ex);
        }            
              
//----------------------Insert data in product_detail page--------------------------
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");                // Initialize your JDBC driver by calling the method Class.forName.  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");  //Establishing a connection.
            String qry = "INSERT INTO PRODUCT_DETAIL VALUES(?,?,?,?,?)";               //Sending the query .                 
            PreparedStatement ps = con.prepareStatement(qry);     // It is used to execute parameterized query.
            ps.setInt(1,prod_detail_id);
            ps.setInt(2,orderId);
            ps.setInt(3,prod_id);
            ps.setInt(4,Integer.parseInt(orderQty));
            ps.setInt(5,Integer.parseInt(totalPrice));
            ps.executeUpdate();            
            response.sendRedirect("confirmation.jsp");            
            ps.close();
            con.close();            
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
