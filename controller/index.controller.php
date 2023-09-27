<?php

class IndexController{
    public function Inicio(){
        $page = "Home";
        $style = '<link rel="stylesheet" type="text/css" href="assets/css/global.css">';
        $js = '<script src="assets/js/index.js"></script>';
        require_once "view/head.php";
        require_once "view/header.php";
        require_once "view/index/index.php";
        require_once "view/footer.php";
    }
}

?>