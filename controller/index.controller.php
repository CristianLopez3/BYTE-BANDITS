<?php

class IndexController{
    public function Inicio(){
        $style = '<link rel="stylesheet" type="text/css" href="assets/css/global.css">';
        require_once "view/index/index.php";
    }
}

?>