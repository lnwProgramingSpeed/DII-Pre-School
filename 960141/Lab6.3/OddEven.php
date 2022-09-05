<?php
    $START = $_POST['start'];
    $END = $_POST['end'];
    $ODD = 0;
    $EVEN = 0;

    echo "Start number - " . $START . "<br>";
    echo "End number - " . $END . "<br>";

    for ($START = $START; $START<=$END; $START++){
        if($START%2==0){
            echo "$START"." -Even"."<br>";
            $EVEN++;
        } else {
            echo "$START"." -Odd"."<br>";
            $ODD++;
        }
    }
    echo "Number of even - ".$EVEN."<br>";
    echo "Number of odd - ".$ODD;
?>