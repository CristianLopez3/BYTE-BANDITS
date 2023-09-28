<?php

class profileController{

    public function Inicio(){
        $page = "Dashboard";
        $style = "
            <link rel='stylesheet' type='text/css' href='assets/css/global.css'>
            <link rel='stylesheet' type='text/css' href='assets/css/profile.css'>
        ";
        $js = "<script src='assets/js/profile.js'></script>";
        require_once "view/head.php";
        require_once "view/profile/profile.php";
        require_once "view/footer.php";
    }

    public function admin(){
        $js = "<script src='assets/js/profile.js'></script>";  
        $style = "<link rel='stylesheet' type='text/css' href='assets/css/global.css'>
        <link rel='stylesheet' type='text/css' href='assets/css/profile-admin.css'>";
        require_once "view/head.php";
        require_once "view/profile/admin.php";
        require_once "view/footer.php";
    }
}

?>