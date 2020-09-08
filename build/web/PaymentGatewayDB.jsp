<%-- 
    Document   : PaymentGatewayDB
    Created on : Sep 20, 2019, 2:37:43 AM
    Author     : Rukaiya_anwar17
--%>
<!--<%@page import="java.util.*" %>  //Java util package contains collection framework, collection classes, classes related to date and time, event model, internationalization, and miscellaneous utility classes. On importing this package, you can access all these classes and methods.
    <%@page import="java.sql.*" %>  //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.
    <%@page import="java.io.*" %>  //this statement means all the classes of io package will be imported. used when we are using input/output stream.
-->
<%! String CARDNO,CVV,EXPIRYYEAR,EXPIRYMONTH,HOLDERNAME,TRANS_ID; %>
<%
    CARDNO = request.getParameter("card_no");
    CVV = request.getParameter("cvv");
    EXPIRYYEAR = request.getParameter("year");
    EXPIRYMONTH = request.getParameter("month");
    HOLDERNAME=request.getParameter("card_holder_name");
//    out.println(""+EXPIRYMONTH+""+EXPIRYYEAR+""+CVV+""+HOLDERNAME); Check karne k liye kya aa rha h data m
%>
<% 
    try{
            Class.forName("oracle.jdbc.driver.OracleDriver");     // Initialize your JDBC driver by calling the method Class.forName.  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");  //Establishing a connection.
            String qry = "SELECT * FROM BANK WHERE  CARDNO='"+CARDNO+"'";          //Sending the query      
            PreparedStatement ps = con.prepareStatement(qry);    // It is used to execute parameterized query.
            ResultSet rs = ps.executeQuery(qry);                //contains the results of executing an SQL query.
            if(rs.next()){


                    if(EXPIRYMONTH.equals(rs.getString("EXPIRYMONTH"))
                        && EXPIRYYEAR.equals(rs.getString("EXPIRYYEAR"))
                        && CVV.equals(rs.getString("CVV"))
                        && HOLDERNAME.equals(rs.getString("holdername")))
                            { 
                                TRANS_ID = rs.getString("TRANSACTION_ID");                                
                                response.sendRedirect("PaymentOrderGenerate.jsp?trans_id="+TRANS_ID);
                            }
                        else
                        {
                        out.println("invalid <br />");
                        }
            }
        }
        catch(Exception ex){
            out.println(ex);            
        }
                %>