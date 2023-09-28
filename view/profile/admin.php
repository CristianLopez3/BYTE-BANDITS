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
                        <!-- caja de Texto para el Id -->
                        <div class="form-floating">
                            <input disabled type="hidden" name="id_user" class="form-control" id="name" placeholder="name@example.com">
                        </div>
                        <div class="form-floating">
                            <input disabled type="text" name="name_user" class="form-control" id="name" placeholder="name@example.com">
                            <label for="floatingInput">Nombre Completo</label>
                        </div>
                        <div class="form-floating">
                            <input disabled type="text" name="city_user" class="form-control" id="city" placeholder="name@example.com">
                            <label for="floatingInput">Ciudad de Residencia</label>
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
                Datos de Usuario
            </button>
        </div>
        <div class="d-flex justify-content-end me-5">
            <button type="button" class="btn btn-danger" onclick="exitSesion()">
                Cerrar Sesion
            </button>
        </div>
    </div>
</div>
<div class="container-columns row">
    <div class="container-left col-2">
        <div class="left pb-5">
            <div class="user-data-menu">
                <p><i class="fa-solid fa-circle-user"></i></p>
                <p>User Name</p>
            </div>
            <button class="profile-adm-btn">
                <p><i class="fa-solid fa-house-user"></i></p>
                <p>Bienvenida</p>
            </button>
            <button class="profile-adm-btn">
                <p><i class="fa-solid fa-user-pen"></i></p>
                <p style="white-space: nowrap">Informancion de </p>
            </button>
            <button class='profile-adm-btn'>
                <p><i class='fa-solid fa-users'></i></p>
                <p>Proveedores</p>
            </button>

        </div>
    </div>
    <div class="container-right right-column col">
        <div class="profile-adm welcome p-5" id="container-right">
            <div class="container text-center">
                <h1 class="text-center mt-5">Bienvenido al dashboard</h1>
                <p class="pt-5"><i class="fa-solid fa-door-open"></i></p>    
            </div>
        </div>
        <div class="profile-adm container-right user" id="container-right2">
            hola 2
        </div>
        <div class='profile-adm container-right' id='container-right3'>
            hola 3
        </div>
    </div>