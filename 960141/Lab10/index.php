<?php
session_start();



if (isset($_SESSION['uname'])) {
?>
    <h1 align="center">Web Database System</h1>
    <h3 align="left"><a href="index.php">Home</a></h3>
    <h3 align="right"><a href="logout.php">Logout</a></h3>

    <table>
        <tr>
            <td>
                <?php echo $_SESSION['sfname']." ".$_SESSION['slname']." [" . $_SESSION['uname'] . "]- Level: " . $_SESSION['level'];?>
            </td>
        </tr>
    </table>

    <ul>
        <li><a href="login.php">Login</a></li>
        <li><a href="show_faculty.php">จัดการข้อมูลตำแหน่งงาน(position)</a></li>
        <li><a href="show_depart.php">จัดการข้อมูลส่วนงาน(department)</a></li>
        <li><a href="show_systemuser.php">จัดการข้อมูลผู้เข้าใช้งานระบบ(systmuser)</a></li>
        <li><a href="show_employee.php">จัดการข้อมูลพนักงาน (employee)</a></li>
    </ul>
<?php } else {
    echo "<h3 align=\"center\"><a href=\"login.php\">Login</a></h3>";
}
?>