<?php
    require_once "config.php";

    $product_id = $_GET['id'];

    $product_name = $_POST['product_name'];
    $product_price = $_POST['product_price'];
    $product_qty = $_POST['product_qty'];

    $userQuery = "Update product SET productName = '$product_name',
                                    price = '$product_price',
                                    qty = '$product_qty'
                        where productID = '$product_id' ";

    $result = mysqli_query($connect, $userQuery);

    if(!$result){
        die ("Could not successfully run the query $userQuery".mysqli_error($connect));
    } else {
        echo "Successfully updated the product<br><br>";
        echo "<a href=\"display_product.php\">Go back to display all product</a>";
    }
?>