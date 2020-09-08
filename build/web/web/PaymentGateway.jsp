<%-- 
    Document   : PaymentGateway
    Created on : Sep 17, 2019, 3:41:27 PM
    Author     : Virus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #payment{
                background-image: url("img/pay.png");
                width: 100%;
                height: 100%;
                background-repeat: no-repeat;
            }
            #makePayment{
                margin: 36px 0px 0px 432px;
                width: 460px;
                height: 45px;
                padding-left: 10px;                                
                font-size: 12pt;  
                background-color: #F2CC6C;
                border-radius: 3px;
            }
            #card_no{
                margin: 253px 0px 0px 434px;
                width: 392px;
                height: 34px;
                padding-left: 10px;                
                font-size: 11pt;                
            }
            #month{
                margin: 41px 0px 0px 434px;
                width: 117px;
                height: 34px;
                padding-left: 10px;                
                font-size: 11pt;
            }
            
            #year{
                margin: 41px 0px 0px 26px;
                width: 118px;
                height: 34px;
                padding-left: 10px;                
                font-size: 11pt;
            }

            #cvv{
                margin: 41px 0px 0px 26px;
                width: 117px;
                height: 34px;
                padding-left: 10px;                
                font-size: 11pt;
            }
            
            #card_holder_name{
                margin: 41px 0px 0px 434px;
                width: 441px;
                height: 34px;
                padding-left: 10px;                                
                font-size: 11pt;
            }
            
            #payAmmout{
                float: right;                
                margin: 220px 280px 0px 0px;
            }
            
            <% 
                String price = request.getParameter("price");
            %>            
            
        </style>
    </head>
    <body id="payment">
        <div id="imagePayment">
            <p id="payAmmout"><b>&#8377; <%=  price %></b></p>
            <form action="PaymentGatewayDB.jsp" method="get">
                <input type="number" required="" id="card_no" name="card_no" maxlength="16"  placeholder="Enter card number" /> <br />
                <input type="number" required="" id="month" min="01" max="12" maxlength="2" name="month" placeholder="Month" /> 
                <input type="number" required="" id="year" min="2019" max="2028" maxlength="04" name="year" placeholder="Year" /> 
                <input type="number" required="" id="cvv" name="cvv" placeholder="" maxlength="3" /> <br />
                <input type="text" required="" id="card_holder_name" name="card_holder_name" placeholder="Enter card holder name" /> <br />
                <input type="submit" value="Make Payment" id="makePayment" />
            </form>
        </div>
    </body>
</html>
