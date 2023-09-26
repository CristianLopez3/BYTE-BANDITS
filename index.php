<?php

$controller = 'index'; 

if(!isset($_REQUEST['b'])){

    require_once 'controller/'.$controller.".controller.php"; 

}

?>