<body>
    <div class="header-login">
        <a href="?b=login&s=Inicio"><i class="fa-solid fa-arrow-left"></i></a>
    </div>
    <div class="container-login container-fluid d-flex flex-column justify-content-center align-items-center">
        <form class="p-5" id="register" action="#" method="post">
            <h1 class="text-center">Registro de Usuario</h1>
            <p class="text-center">Bienvenido, ingrese sus credenciales de acceso:</p>
            <div class="form-floating">
                <input type="text" name="name_user" class="form-control" id="name" placeholder="name@example.com">
                <label for="floatingInput">Nombre Completo</label>
            </div>
            <div class="form-floating">
                <input type="text" name="email_user" class="form-control" id="email" placeholder="name@example.com">
                <label for="floatingInput">Direccion de Correo electronico</label>
            </div>
            <div class="form-floating">
                <input type="password" name="password_user" class="form-control" id="password" placeholder="Contraseña">
                <label for="floatingPassword">Contraseña</label>
            </div>
            <div class="form-floating">
                <input type="hidden" name="rol_user" value="ROLE_STUDENT" class="form-role" id="floatingInput" placeholder="name@example.com" readonly>
                <label for="floatingInput">Rol del Usuario</label>
            </div>
            <div class="form-floating">
                <input type="text" name="city_user" class="form-control" id="city" placeholder="name@example.com">
                <label for="floatingInput">Ciudad de Residencia</label>
            </div>
            <div class="form-floating">
                <input type="date" name="date_user" class="form-control" id="date" placeholder="name@example.com">
                <label for="floatingInput">Fecha de Nacimiento</label>
            </div>
            <div class="form-floating">
                <select class="form-select" name="interest_user" id="interest" aria-label="Floating label select example">
                    <option selected disabled>Seleccione sus intereses</option>
                    <option value="QA">Quality Assurance</option>
                    <option value="BA">Business Analyst</option>
                    <option value="DEV">DEV</option>
                </select>
                <label for="floatingSelect">Carrera de Interes</label>
            </div>
            <div class="form-floating">
                <select class="form-select" name="education_user" id="education" aria-label="Floating label select example">
                    <option selected disabled>Seleccione su nivel de educacion actual</option>
                    <option value="bachiller">Bachiller</option>
                    <option value="bachiller-tecnico">Bachiller Tecnico</option>
                    <option value="tecnico">Tecnico</option>
                    <option value="tecnologo">Tecnologo</option>
                    <option value="profesional">Profesional</option>
                    <option value="sin-educacion">Sin nivel educativo</option>
                </select>
                <label for="floatingSelect">Nivel de Educación</label>
            </div>
            <button type="submit" class="btn btn-primary d-block mx-auto">Registrarme</button>
        </form>
    </div>
</body>