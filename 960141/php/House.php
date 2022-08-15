<?php
    $widthHome = $_POST['widthHome'];
    $lenghtHome = $_POST['lenghtHome'];
    $widthBlock = $_POST['widthBlock'];
    $lenghtBlock = $_POST['lenghtBlock'];

    $Home = $widthHome * $lenghtHome;
    $Block = $widthBlock * $lenghtBlock;

    $mowingArea = $Block - $Home;

    echo "Mowing Details <br>";
    
    echo "House block width =   $widthBlock lenght = $lenghtBlock . <br>";
    echo "House width =  $widthHome lenght = $lenghtHome <br>";

    echo "House block area : $Block <br>";
    echo "House area : $Home <br>";

    echo "Mowing area : $mowingArea <br>";
    echo "mowing time : " . $mowingArea/2 . " <br>";
?>
