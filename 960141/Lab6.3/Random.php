<?php
    $RANDOM = 0;
    $BIGGEST = 0;
    
    for (int $i = 1; $i<=10; $i++){
        $RANDOM = rand(1,100);
        $if($BIGGEST<$RANDOM){
            $BIGGEST = $RANDOM;
        }
        echo "Round ".$i."-".$RANDOM."<br>";
    }
?>