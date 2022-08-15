<?php
    $country =$_POST['country'];
    $Night = $_POST['night'];
    $People = $_POST['people'];
    $Total = 0;

    echo "Travel Information <br><br>";

    if ($country == "Denmark"){
        
        $country = "Denmark";
        echo "Country - $country <br>";
        echo "Number of Night - $Night <br>";
        echo "Number of Traveller - $People <br>";

        echo "======================= <br>";

        echo "Airline Ticket - $1500 <br>";
        echo "Hotel Charge - $50 <br>";
        echo "No COVID-19 Discount <br>";

        echo "======================= <br>";

        $Night = $Night * 50 * $People;
        $People = $People * 1500;
        $Total = $People + $Night;

        echo "Total Cost --- $$Total";

    } elseif ($country == "Australia"){

        $country = "Australia";
        echo "Country - $country <br>";
        echo "Number of Night - $Night <br>";
        echo "Number of Traveller - $People <br>";

        echo "======================= <br>";

        echo "Airline Ticket - $1000 <br>";
        echo "Hotel Charge - $60 <br>";
        echo "No COVID-19 Discount <br>";

        echo "======================= <br>";

        $Night = $Night * 60 * $People;
        $People = $People * 1000;
        $Total = $People + $Night;

        echo "Total Cost --- $$Total";

    } elseif ($country == "Japan") {

        $country = "Japan";
        echo "Country - $country <br>";
        echo "Number of Night - $Night <br>";
        echo "Number of Traveller - $People <br>";

        echo "======================= <br>";

        echo "Airline Ticket - $700 <br>";
        echo "Hotel Charge - $30 <br>";
        echo "COVID-19 Discount - 10% <br>";

        echo "======================= <br>";

        $Night = $Night * 30 * $People;
        $People = $People * 700;
        $Total = $People + $Night;

        $Total = $Total * .9;

        if($Night > 5){
            $Total * .8;
        }

        echo "Total Cost --- $$Total";
    }
?>