<?php
session_start();
if (isset($_SESSION['username'])) {
?>
    <table>
        <tr>
            <td>
                <?php
                echo $_SESSION['fname'] . " " . $_SESSION['lname'] . " [" . $_SESSION['username'] . "]- Level: " . $_SESSION['level'];
                ?>
            </td>
        </tr>
    </table>
<?php } ?>