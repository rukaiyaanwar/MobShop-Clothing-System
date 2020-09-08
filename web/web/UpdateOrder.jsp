<%@page import="java.sql.*" %>
           <%! String orderStatus; int orderId; %>
             <%
            orderStatus = request.getParameter("orderStatus");
            orderId = Integer.parseInt(request.getParameter("order_id"));

            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mobshop","mobshop");
                String qry="UPDATE ORDER2 SET ORDER_STATUS=? WHERE ORDER_ID='"+orderId+"'";
                PreparedStatement ps=con.prepareStatement(qry);
                ps.setString(1,orderStatus);                
                int i=ps.executeUpdate();
                if(i>0)
                {                        
                        response.sendRedirect("ActiveOrder.jsp?orderStatus="+orderStatus);
                }
                else{
                        out.print("There is a problem in updating Record.");
                }

            }catch(Exception ex){
                out.println(ex);
            }
                %>
