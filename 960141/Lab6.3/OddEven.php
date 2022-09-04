<?php
    $START = $_POST['start'];
    $END = $_POST['end'];
    $ODD = 0;
    $EVEN = 0;

    for ($START = $START; $START<=$END; $START++){
        if($START%2==0){
            echo "$START"." -Even"."<br>";
            $EVEN++;
        } else {
            echo "$START"." -Odd"."<br>";
            $ODD++;
        }
    }
    echo $EVEN;
    echo $ODD;
?>