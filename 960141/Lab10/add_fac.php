<?php
session_start();
?>
<form action="add_fac_submit.php" method="post">
    <table align="center">
        <tr>
            <td>Faculty name</td>
            <td><input type="text" name="fac_name" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" name="button" id="button" value="Submit" />
                <input type="reset" name="button2" id="button2" value="Reset" />
                <br><a href="show_faculty.php">Back</a><br><br>
            </td>
        </tr>
    </table>
</form>