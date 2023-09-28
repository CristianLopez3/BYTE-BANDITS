<?php

class newAccountController{

    public function Inicio(){
        $page = "Registro - Usuarios";
        $style = '
            <link rel="stylesheet" type="text/css" href="assets/css/global.css">
            <link rel="stylesheet" type="text/css" href="assets/css/new-account.css">
            ';
        $js = '
            <script src="implementation/User.js"></script>
        ';
        require_once "view/head.php";
        require_once "view/newAccount/new-account.php";
        require_once "view/footer.php";
    }
}

?>