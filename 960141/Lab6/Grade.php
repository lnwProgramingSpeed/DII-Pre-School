<?php
    $Name = $_POST['name'];
    $Midterm = $_POST['Midterm'];
    $Final = $_POST['Final'];
    $Report = $_POST['Report'];

    $Total = $Midterm + $Final + $Report;
    $Grade = 'F';

    echo "Student Score <br><br>";

    echo "Name: $Name <br>";
    echo "Midterm Score: $Midterm <br>";
    echo "Final Score: $Final <br>";
    echo "Report Score: $Report <br>";
    
    echo "Total Score: $Total <br>";

    if ($Total >= 80){
        $Grade = 'A';
        echo "Your Grade: $Grade";
    } elseif ($Total >= 70){
        $Grade = 'B';
        echo "Your Grade: $Grade";
    } elseif ($Total >= 60){
        $Grade = 'C';
        echo "Your Grade: $Grade";
    } elseif ($Total >= 50){
        $Grade = 'D';
        echo "Your Grade: $Grade";
    } else {
        echo "Your Grade: $Grade";
    }
?>