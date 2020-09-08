<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>TODO write content</div>
        
        <form action="uploadProd.jsp" method="POST" >
            Enter Product Id -- <input type="text" name="id" value="" /> <br/><br/>
            Enter Product Name -- <input type="text" name="name" value="" /> <br/><br/>
            Enter Product Image -- <input type="file" name="img"  /> <br/><br/>
            Enter Product Price -- <input type="text" name="price" value="" /> <br/><br/>
            Enter Product Brand -- <input type="text" name="brand" value="" /> <br/><br/>
            <input type="submit" value="Submit" />
            
        </form>
    </body>
</html>
