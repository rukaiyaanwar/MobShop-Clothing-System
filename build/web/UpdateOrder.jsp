<!-- <%@page import="java.sql.*" %> //the compiler will allow you to refer to that class by its short name instead of the fully resolved name - that's all.-->
           <%! String orderStatus; int orderId; %>
             <%
            orderStatus = request.getParameter("orderStatus");
            orderId = Integer.parseInt(request.getParameter("order_id"));

            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");    // Initialize your JDBC driver by calling the method Class.forName.
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Lenovo-PC:1521:XE","mobshop","rukaiya");  //Establishing a connection.
                String qry="UPDATE ORDERS SET ORDER_STATUS=? WHERE ORDER_ID='"+orderId+"'";  //Sending the query
                PreparedStatement ps=con.prepareStatement(qry);   // It is used to execute parameterized query.
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
