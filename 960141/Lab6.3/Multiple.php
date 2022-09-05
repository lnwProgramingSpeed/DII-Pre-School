<?php
    $NUM = $_POST['num'];

    for (int $i = 1; $i<=12; $i++){
        echo "$NUM * $i = ".$i*$NUM."<br>";
    }
?>