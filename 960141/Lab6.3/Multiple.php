<?php
    $NUM = $_POST['number'];
    $i = 1;

    echo "Multiplication " . $NUM . "* 12 <br>";
    for ($i = 1; $i<=12; $i++){
        echo "$NUM * $i = ".$i*$NUM."<br>";
    }
?>