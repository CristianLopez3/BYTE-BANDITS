<?php

class loginController{

    public function Inicio(){
        $page = "Login - Usuarios";
        $style = '
            <link rel="stylesheet" type="text/css" href="assets/css/global.css">
            <link rel="stylesheet" type="text/css" href="assets/css/login.css">
            ';
        $js = '
            <script src="implementation/User.js"></script>
        ';
        require_once "view/head.php";
        require_once "view/login/login.php";
        require_once "view/footer.php";
    }
}

?>