<?php
session_start();
require_once "config.php";
$a = $_POST['a'];
$b = $_POST['b'];

$sql="SELECT * FROM systemuser WHERE uname = '$a' AND pword = '$b' ";

$query = mysqli_query($connect, $sql);

if(mysqli_num_rows($query) > 0){

    $row = mysqli_fetch_assoc($query);
    $u=$row['uname'];
    $p=$row['pword'];
    $l=$row['level'];
    $sf=$row['sfname'];
    $sl=$row['slname'];

    $_SESSION['uname'] = $u;
    $_SESSION['level'] = $l;
    $_SESSION['sfname'] = $sf;
    $_SESSION['slname'] = $sl;
    header("Location: index.php");
    } else {

    $_SESSION['warning'] = 'Username or password are not correct. Please try again !!!!!!!';
    header("Location: login.php");

    }

mysqli_close($connect);
