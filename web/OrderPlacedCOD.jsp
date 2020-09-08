<%-- 
    Document   : OrderPlacedDB2
    Created on : Sep 20, 2019, 4:05:27 PM
    Author     : Virus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--    <%@page import="java.util.*" %>  //Java util package contains collection framework, collection classes, classes related to date and time, event model, internationalization, and miscellaneous utility classes. On importing this package, you can access all these classes and methods.-->
<!--    <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.-->
<!--    <%@page import="java.io.*" %>  //this statement means all the classes of io package will be imported. used when we are using input/output stream.-->
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
            Class.forName("oracle.jdbc.driver.OracleDriver");              // Initialize your JDBC driver by calling the method Class.forName.     
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya"); //Establishing a connection.
            String qry = "SELECT * FROM ORDERS ";                //Sending the query .
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
            Class.forName("oracle.jdbc.driver.OracleDriver");            // Initialize your JDBC driver by calling the method Class.forName.
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");  //Establishing a connection.
            String qry = "INSERT INTO ORDERS VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";                //contains the results of executing an SQL query.  
            PreparedStatement ps = con.prepareStatement(qry);   // It is used to execute parameterized query.
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
