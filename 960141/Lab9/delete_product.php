<?php
    require_once "config.php";

    $product_id = $_GET['id'];

    $userQuery = "Delete from product where productID ='$product_id'";
    $result = mysqli_query($connect, $userQuery);

    if(!$result){
        die("Could not successfully run the query $userQuery".mysqli_error($connect));
    } else {
        echo "Successfully delete the product<br><br>";
        echo "<a href=\"display_product.php\">Go back to display all product</a>";
    }
?>