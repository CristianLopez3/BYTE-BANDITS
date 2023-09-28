<body>
    <div class="header-login">
        <a href="?b=index&s=Inicio"><i class="fa-solid fa-arrow-left"></i></a>
    </div>
    <div class="container-login container-fluid d-flex flex-column justify-content-center align-items-center">
        <form class="p-5" action="#" id="login" method="post">
            <h1 class="text-center">Inicio de Sesión</h1>
            <p class="text-center">Bienvenido, ingrese sus credenciales de acceso:</p>
            <div class="form-floating">
                <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
                <label for="floatingInput">Dirección de correo electrónico</label>
            </div>
            <div class="form-floating">
                <input type="password" class="form-control" id="floatingPassword" placeholder="Contraseña">
                <label for="floatingPassword">Contraseña</label>
            </div>
            <button type="submit" class="btn btn-primary d-block mx-auto">Acceder</button>
        </form>
        <form class="p-5 form-register">
            <p class="text-center">¿Aun no estas registrado?, <a href="?b=newAccount&s=Inicio">Registrate</a></p>
        </form>
    </div>
</body>