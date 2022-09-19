<?php
    require_once "config.php";

    $producct_id = $_POST['product_id'];
    $product_name = $_POST['product_name'];
    $product_price = $_POST['product_price'];
    $product_qty = $_POST['product_qty'];

    $userQuery = "Insert into product values('','$product_name','$product_price','$product_qty')";
    $result = mysqli_query($connect, $userQuery);

    if(!$result){
        die("Could not successfully run the query $userQuery".mysqli_error($connect));
    } else {
        echo "Successfully added the new product<br><br>";
        echo "<a href=\"display_product.php\">Go back to display all products</a>";
    }
?>