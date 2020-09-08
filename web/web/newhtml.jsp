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
    <h3>ADD PRODUCT</h3>
    <form action="testJsp.jsp" method="get"  >
            <div class="col-md-6 form-group">
                    <input type="text" id="name" name="name" placeholder="Product Name">
            </div>

            <div class="col-md-6 form-group">
                    <input type="text" class="form-control" id="brand" name="brand" placeholder="Brand">
            </div>
            <div class="col-md-7 form-group">
                    <input type="text" class="form-control" id="category" name="category" placeholder="Product Category">
            </div>
            <div class="col-md-5 form-group">
                    <input type="text" class="form-control" id="prod_id" name="prod_id" placeholder="Product ID">
            </div>
        
             <div class="col-md-6 form-group">
                    <input type="text" name="rukaiya" placeholder="Product Feature 1">
            </div>
            <div class="col-md-6 form-group">
                    <input type="text"  name="rukaiya2" placeholder="Product Feature 2">
            </div>
            <div class="col-md-6 form-group">
                    <input type="text" name="rukaiya3" placeholder="Product Feature 3">
            </div>
<!--            <div class="col-md-6 form-group">
                    <input type="text" class="form-control" id="pr_skey" name="pr_skey" placeholder="Search Keyword">
            </div>-->

            <div class="col-md-6 form-group">
                    <input type="text" class="form-control" id="prd_skey" name="prd_skey" placeholder="Search Keyword">
            </div>
        
        
            <div class="col-md-7 form-group">
                    <input type="number" class="form-control" id="amount" name="quantity" placeholder="Product Quantity">
            </div>
             <div class="col-md-5 form-group">
                <input type="text" class="form-control" id="size" name="size" placeholder="Size">
             </div>

            <div class="col-md-12 form-group">
                    <input type="text" class="form-control" id="desc" name="desc" placeholder="Product Description">
            </div>
            <div class="col-md-6 form-group">
                    <input type="number" class="form-control" id="price" name="price" placeholder="Product Price">
            </div>
             <div class="col-md-6 form-group">
                    <input type="number" class="form-control" id="price" name="stock" placeholder="Stock">
            </div>
           <div class="col-md-12 form-group">
                    <input type="text" class="form-control" id="mfg" name="mfg" placeholder="Product Manufactured Date">
            </div>
            <div class="col-md-12 form-group">
                    <input type="file" class="form-control" id="image" name="image" placeholder="Upload Image">
            </div>


            <div class="col-md-12 form-group">
                    <button type="submit" value="submit" class="btn submit_btn">ADD PRODUCT</button>

            </div>
        </form>    
    </body>
</html>
