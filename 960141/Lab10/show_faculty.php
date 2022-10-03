<?php
session_start();
require_once "config.php";
if (isset($_SESSION['level'])) {
    $userQuery = "Select * from lab";
    $result = mysqli_query($connect, $userQuery);
    if (!$result) {
        die("Could not successfully run the query $userQuery" . mysqli_error($connect));
    }
    if (mysqli_num_rows($result) == 0) {
        echo "No records were found with query $userQuery";
    } else {
        echo "<table cellspacing = \"0\" border = \"1\">";
        echo "<tr bgcolor=\"#D4DFFF\"><th>Faculty ID</th><th>Faculty
    Name</th><th>Update</th><th>Delete</th></tr>";
        while ($row = mysqli_fetch_assoc($result)) {
            echo "<tr><td>" . $row['fac_ID'] . "</td><td>"
                . $row['fac_name'] . "</td>";
            //for update and delete
            echo "<td><a href=\"update_data.php?id=" . $row['fac_ID'] . "\">";
            echo "Update</a></td>";
            echo "<td><a href=\"delete_data.php?id=" . $row['fac_ID'] . "\">";
            echo "Delete</a></td></tr>";
        }
        echo "</table>";
    }
    echo "<a href=\"add_fac.php\">Add new record</a><br><br>";
    mysqli_close($connect);
} else {
    echo "Can not show data,please login<br><br>";
    echo "<a href=\"login.php\">Click here to login</a>";
}
echo "<a href=\"Logout.php\">Logout</a>";
