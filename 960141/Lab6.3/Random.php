<?php
    $RANDOM = 0;
    $BIGGEST = 0;
    $i = 1;

    echo "Random 10 Numbers <br>";
    
    for ($i = 1; $i<=10; $i++){
        $RANDOM = rand(1,100);

        if($BIGGEST<$RANDOM){
            $BIGGEST = $RANDOM;
        }

        echo "Round ".$i." --- ".$RANDOM."<br>";
    }
    echo "Maximum number ".$BIGGEST;
?>