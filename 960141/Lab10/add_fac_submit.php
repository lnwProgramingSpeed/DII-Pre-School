<?php
session_start();
require_once "config.php";
$fac_name = $_POST['fac_name'];
if ($_SESSION['level'] > 1) {
    $userQuery = "Insert into position values('','$fac_name')";
    $result = mysqli_query($connect, $userQuery);
    if (!$result) {
        die("Could not successfully run the query $userQuery" . mysqli_error($connect));
    } else {
        echo "<p align=\"center\">Successfully added the new product<br><br>";
        echo "<a href=\"show_faculty.php\">Go back to display all products</a></p>";
    }
} else {
    echo "<p align=\"center\">Can not add,please login as an admin<br><br>";
    echo "<a href=\"login.php\">Click here to login</a></p>";
}
