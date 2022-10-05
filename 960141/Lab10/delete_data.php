<?php
session_start();
require_once "config.php";
$fac_ID = $_GET['id']; //get $id from an update link
if ($_SESSION['level'] > 2) {
    $userQuery = "Delete from position where fac_id ='$fac_ID'";
    $result = mysqli_query($connect, $userQuery);
    if (!$result) {
        die("<p align=\"center\">Could not successfully run the query $userQuery" . mysqli_error($connect)) . "</p>";
    } else {
        echo "<p align=\"center\">Successfully deleted the record<br><br>";
        echo "<a href=\"show_faculty.php\">Go back to display all faculty</a></p>";
    }
} else {
    echo "<p align=\"center\">Can not delete,please login as an admin<br><br>";
    echo "<a href=\"login.php\">Click here to login<br></a>";
    echo "<a href=\"show_faculty.php\">Click here to go back<br></a>";
    echo "<a href=\"logout.php\">Logout<br></a></p>";
}
