<?php
    $guest = $_POST['guest'];
    $i = 0;
    $check = 0;

    echo "Random - ";

    for($i = 0; $i<3; $i++){
        $rand = rand(1,9) ;
        if($guest == $rand){
            $check+=1;
        }
        echo $rand;
        
    }

    if($chek>0){
        echo "<br>You are the Winner <br> Answer is $guest <br>";
    } else {
        echo "<br>You are the Loser <br> Try again <br>";
    }
?>
