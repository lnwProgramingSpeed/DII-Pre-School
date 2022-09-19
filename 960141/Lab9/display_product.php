<?php
    require_once "config.php";
    
    $userQuery = "Select * from product";
    $result = mysqli_query($connect, $userQuery);
    
    if (!$result){
        die ("Could not successfully run the query $userQuery".mysqli_error($connect));
        
    } if (mysqli_num_rows($result) == 0){
        echo "No records were found with query $userQuery";
    
    }else{
        echo "<a href=\"form_add_product.html\">Add a new product</a><br><br>";
        echo "<table cellspacing = \"0\" border = \"1\">";
        echo "<tr bgcolor=\"#D4DFFF\"><th>Product Name</th><th>Price</th><th>Quantity</th><th>Update</th><th>Delete</th></tr>";
    
            while ($row = mysqli_fetch_assoc($result)){
                echo "<tr><td>".$row['productName']."</td><td>"
                .$row['price']."</td><td>"
                .$row['qty']."</td> ";
                //for update and delete
                echo "<td><a href=\"update_product.php?id=" . $row['productID'] . "\">";
                echo "Update</a></td>";
                echo "<td><a href=\"delete_product.php?id=" . $row['productID'] . "\">";
                echo "Delete</a></td></tr>";
            }

        echo "</table>";
    }
    mysqli_close($connect);
?>