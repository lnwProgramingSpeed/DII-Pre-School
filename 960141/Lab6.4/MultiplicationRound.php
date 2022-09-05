<?php
    $mul = $_POST['Multi'];
    $round = $_POST['Round'];
    $i = 0;
    $j = 0;

    for($i = 0; $i<$round; $i++){
        $con = $mul+$i;
        echo "Multiplication ". $con ." * 12 <br>";
        for ($j = 1; $j<=$mul; $j++){
            echo $con." * $j = ".$con*$j . "<br>";
        }
    }
    

?>