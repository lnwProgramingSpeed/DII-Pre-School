<?php
session_start();

require_once "config.php";

$fac_ID = $_GET['id'];
$fac_name = $_POST['fac_name'];

if ($_SESSION['level'] == 2) {
    $userQuery = "Update lab SET fac_name = '$fac_name'
                        where fac_id = '$fac_ID' ";

    $result = mysqli_query($connect, $userQuery);

    if (!$result) {
        die("Could not successfully run the query $userQuery" . mysqli_error($connect));
    } else {
        echo "Successfully updated the travel information<br><br>";
        echo "<a href=\"show_faculty.php\">Go back to display all faculty</a>";
    }
} else {
    echo "Can not edit,please login as an admin<br><br>";
    echo "<a href=\"login.php\">Click here to login</a>";
}
