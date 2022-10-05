<?php
session_start();

require_once "config.php";

$fac_ID = $_GET['id'];
$fac_name = $_POST['fac_name'];

if ($_SESSION['level'] > 2) {
    $userQuery = "Update position SET fac_name = '$fac_name'
                        where fac_id = '$fac_ID' ";

    $result = mysqli_query($connect, $userQuery);

    if (!$result) {
        die("<p align=\"center\">Could not successfully run the query $userQuery" . mysqli_error($connect)) . "</p>";
    } else {
        echo "<p align=\"center\">Successfully updated the travel information<br><br>";
        echo "<a href=\"show_faculty.php\">Go back to display all faculty</a></p>";
    }
} else {
    echo "<p align=\"center\">Can not edit,please login as an admin<br><br>";
    echo "<a href=\"login.php\">Click here to login</a></p>";
}
