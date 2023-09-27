<?php

$controller = 'index'; 

if(!isset($_REQUEST['b'])){
    require_once 'controller/'.$controller.".controller.php"; 
    $controller = ucwords($controller).'controller';
    $controller = new $controller; 
    $controller -> Inicio(); 
}else{
    $controller = $_REQUEST['b'];
    require_once 'controller/'.$controller.'.controller.php'; 
    $controller = ucwords($controller).'controller';
    $action = (isset($_REQUEST['s'])) ? $_REQUEST['s'] : "Inicio";
    $param = (isset($_REQUEST['p'])) ? $_REQUEST['p'] : "";
    $controller = new $controller; 
    call_user_func(array($controller, $action), $param); 
}

?>