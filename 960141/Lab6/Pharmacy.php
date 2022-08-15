<?php
    $pet = $_POST['pet'];
    $type = $_POST['type'];
    $age = $_POST['age'];
    $weight = $_POST['weight'];

    echo "Pet Name: $pet <br>";
    echo "Type: $type <br>";
    echo "Age: $age <br>";
    echo "Weight: $weight <br><br>";

    if ($age > 10){
        if ($weight > 15){
            echo "Result - Take 3 spoons";
        } else {
            echo "Result - Take 2 spoons";
        }
    } else {
        if($weight > 7){
            echo "Result - Take 1.5 spoons";
        } else {
            echo "Result - Take 1 spoons";
        }
    }
?>