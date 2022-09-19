<?php
require_once "config.php";

$product_id = $_GET['id'];

$userQuery = "Select * from product where productID ='$product_id'";
$result = mysqli_query($connect, $userQuery);

if(!$result){
    die ("Could not successfully run the query $userQuary".mysqli_error($connect));
} else {
    echo "Update product<br><br>";
    while ($row = mysqli_fetch_assoc($result)){
    

?>
<html>
<head>
<body>
    Add a new product<br><br>
    <form name="form1" method="post" action="update_product_submit.php?id=<?php echo $product_id;?>">
    <table>
        <tr>
            <td width="160">Product ID</td>
            <td width="246">Auto_Increment</td>
        </tr>
        <tr>
            <td>Product name</td>
            <td><input type="text" name="product_name" value="<?php echo $row['productName'];?>"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="text" name="product_price" value="<?php echo $row['price'];?>"></td>
        </tr>
        <tr>
            <td>Quantity</td>
            <td><input type="text" name="product_qty" value="<?php echo $row['qty'];?>"> </td>
        </tr>
        <tr>
            <td><input type="submit" name="button" value="Submit"></td>
            <td><input type="reset" name="button2" value="Cancel"></td>  
        </tr>
        
    </table>
    </form>
</body>
<?php
    }
}
?>
</html>