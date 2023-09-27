<?php

class newAccountController{

    public function Inicio(){
        $page = "Login - Usuarios";
        $style = '
            <link rel="stylesheet" type="text/css" href="assets/css/global.css">
            <link rel="stylesheet" type="text/css" href="assets/css/new-account.css">
            ';
        $js = '
            <script type="module" src="./js/User.js"></script>
        ';
        require_once "view/head.php";
        require_once "view/newAccount/new-account.php";
        require_once "view/footer.php";
    }
}

?>