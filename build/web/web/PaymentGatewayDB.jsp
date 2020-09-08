<%-- 
    Document   : PaymentGatewayDB
    Created on : Sep 20, 2019, 2:37:43 AM
    Author     : Rukaiya_anwar17
--%>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
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
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
            String qry = "SELECT * FROM BANK WHERE  CARDNO='"+CARDNO+"'";                
            PreparedStatement ps = con.prepareStatement(qry);
            ResultSet rs = ps.executeQuery(qry);
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