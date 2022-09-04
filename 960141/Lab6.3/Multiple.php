<?php
    $NUM = $_POST['num'];

    for (int $i = 1; $i<=$NUM; $i++){
        echo "$i * 12 = ".$i*12."<br>";
    }
?>