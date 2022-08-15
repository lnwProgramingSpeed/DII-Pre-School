<?php
    $height = $_POST['Height'];
    $width = $_POST['Width'];
    $height = $height/100;
    $BMI = $width/($height*$height);
    echo "$height <br>";
    echo "$width <br>";
    echo "$BMI <br>";
?>