<?php
session_start();
require_once "config.php";
if (isset($_SESSION['level'])) {
    $userQuery = "Select * from department";
    $result = mysqli_query($connect, $userQuery);
    if (!$result) {
        die("Could not successfully run the query $userQuery" . mysqli_error($connect));
    }
    if (mysqli_num_rows($result) == 0) {
        echo "No records were found with query $userQuery";
    } else {
        echo "<table align=\"center\" cellspacing = \"0\" border = \"1\">";
        echo "<tr bgcolor=\"#D4DFFF\"><th>Position</th><th>Employee</th><th>Update</th><th>Delete</th></tr>";
        while ($row = mysqli_fetch_assoc($result)) {
            echo "<tr><td>" . $row['job'] . "</td><td>"
                . $row['employ'] . "</td>";
            //for update and delete
            echo "<td><a href=\"update_data.php?id=" . $row['job'] . "\">";
            echo "Update</a></td>";
            echo "<td><a href=\"delete_data.php?id=" . $row['job'] . "\">";
            echo "Delete</a></td></tr>";
        }
        echo "</table>";
    }
    echo "<a href=\"add_fac.php\"><p align=\"center\">Add new record</p></a><br><br>";
    mysqli_close($connect);
    echo "<a href=\"index.php\">Back</a><br><br>";
} else {
    echo "Can not show data,please login<br><br>";
    echo "<a href=\"login.php\">Click here to login<br></a>";
}
echo "<a href=\"logout.php\">Logout</a>";
