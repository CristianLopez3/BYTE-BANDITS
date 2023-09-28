<div class="container-dasboard d-flex justify-content-between">
    <div class="d-flex">
        <div class=" title-dashboard d-flex align-items-center">
            <p><img src="assets/images/logo.png" alt="Byte Forum Logo"></p>
            <h1>Admin Dashboard</h1>
        </div>
    </div>
    <div class="container-mi-cuenta pt-2 pb-2 d-flex justify-content-end align-items-center">
        <div class="modal fade" id="profileMenuModal" tabindex="-1" aria-labelledby="profileMenuModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="profileMenuModalLabel">Mi cuenta</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <form class="p-5" id="register" action="#" method="post">
                        <h1 class="text-center mb-4">Datos de Usuario</h1>
                        <div class="form-floating">
                            <input disabled type="hidden" name="id_user" class="form-control" id="name" placeholder="name@example.com">
                        </div>
                        <div class="form-floating">
                            <input disabled type="text" name="name_user" class="form-control" id="name" placeholder="name@example.com">
                            <label for="floatingInput">Nombre Completo</label>
                        </div>
                        <div class="form-floating">
                            <input disabled type="text" name="email_user" class="form-control" id="email" placeholder="name@example.com">
                            <label for="floatingInput">Direccion de Correo electronico</label>
                        </div>
                        <div class="form-floating">
                            <input disabled type="password" name="password_user" class="form-control" id="password" placeholder="Contraseña">
                            <label for="floatingPassword">Contraseña</label>
                        </div>
                        <div class="form-floating">
                            <input disabled type="hidden" name="rol_user" value="ROLE_STUDENT" class="form-role" id="floatingInput" placeholder="name@example.com" readonly>
                            <label for="floatingInput">Rol del Usuario</label>
                        </div>
                        <div class="form-floating">
                            <input disabled type="text" name="city_user" class="form-control" id="city" placeholder="name@example.com">
                            <label for="floatingInput">Ciudad de Residencia</label>
                        </div>
                        <div class="form-floating">
                            <input disabled type="date" name="date_user" class="form-control" id="date" placeholder="name@example.com">
                            <label for="floatingInput">Fecha de Nacimiento</label>
                        </div>
                        <div class="form-floating">
                            <select disabled class="form-select" name="interest_user" id="interest" aria-label="Floating label select example">
                                <option selected disabled>Seleccione sus intereses</option>
                                <option value="QA">Quality Assurance</option>
                                <option value="BA">Business Analyst</option>
                                <option value="DEV">DEV</option>
                            </select>
                            <label for="floatingSelect">Carrera de Interes</label>
                        </div>
                        <div class="form-floating">
                            <select class="form-select" name="education_user" disabled id="education" aria-label="Floating label select example">
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
                        <div class="d-flex mt-5">
                            <button type="button" id="editarBtn" class="btn btn-dark d-block mx-auto" onclick="formEnabled()">Editar</button>
                            <button type="submit" id="registrarmeBtn" class="btn btn-primary d-block mx-auto" onclick="formDisabled()">Registrarme</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="d-flex justify-content-end me-5">
            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#profileMenuModal">
                Mi cuenta
            </button>
        </div>
    </div>
</div>
<div class="container-columns row">
    <div class="container-left col-2">
        <div class="left">
            <div class="user-data-menu">
                <p><i class="fa-solid fa-circle-user"></i></p>
                <p>User Name</p>
            </div>
            <button class="profile-adm-btn">
                <p><i class="fa-solid fa-house-user"></i></p>
                <p>Inicio</p>
            </button>
            <button class="profile-adm-btn">
                <p><i class="fa-solid fa-user-pen"></i></p>
                <p style="white-space: nowrap">Datos del usuario</p>
            </button>
            <button class='profile-adm-btn'>
                <p><i class='fa-solid fa-users'></i></p>
                <p>Proveedores</p>
            </button>

        </div>
    </div>
    <div class="container-right col">
        <div class="profile-adm welcome" id="container-right">
            hola 1
        </div>
        <div class="profile-adm container-right user" id="container-right2">
            hola 2
        </div>
        <div class='profile-adm container-right' id='container-right3'>
            hola 3
        </div>
    </div>