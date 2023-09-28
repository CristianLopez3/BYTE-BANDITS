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
                            <button type="submit" id="registrarmeBtn" class="btn btn-primary d-block mx-auto" onclick="formDisabled()">Guardar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="d-flex justify-content-end me-5">
            <button type="button" class="btn buttonEdit" data-bs-toggle="modal" data-bs-target="#profileMenuModal">
                Datos de Usuario
            </button>
        </div>
        <div class="d-flex justify-content-end me-5">
            <button type="button" class="btn buttonDelete" onclick="exitSesion()">
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
                <p style="white-space: nowrap">Formularios</p>
            </button>
            <button class='profile-adm-btn'>
                <p><i class='fa-solid fa-users'></i></p>
                <p>Foros</p>
            </button>

        </div>
    </div>
    <div class="container-right right-column col">
        <div class="profile-adm welcome p-5" id="container-right">
            <div class="container text-center overflow-y-auto">
                <h1 class="text-center mt-5">Bienvenido al dashboard de Administracion</h1>
                <p class="pt-5"><i class="fa-solid fa-door-open"></i></p>
            </div>
        </div>
        <div class="profile-adm container-right user" id="container-right2">
            <div class="container">
                <h1 class="text-center mt-5">Listado de Formularios</h1>
                <button class="btn buttonDelete mt-4 mb-4 float-left" data-bs-toggle="modal" data-bs-target="#modalAgregarFormulario">Agregar formulario</button>

                <table class="table table-forms">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Fecha de inicio</th>
                            <th>Fecha final</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody id="results-forms"></tbody>
                </table>
                <!-- Ventana emergente para editar formulario -->
                <div class="modal fade" id="modalEditarFormulario" tabindex="-1" aria-labelledby="modalEditarFormularioLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="modalEditarFormularioLabel">Editar formulario</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <form action="#">
                                    <!-- Campo para id de formulario -->
                                    <div class="mb-3">
                                        <input type="hidden" class="form-control" id="nombreFormulario" name="title" placeholder="Ingrese el nombre del formulario">
                                    </div>
                                    <div class="mb-3">
                                        <label for="nombreFormulario" class="form-label">Nombre</label>
                                        <input type="text" class="form-control" id="nombreFormulario" name="title" placeholder="Ingrese el nombre del formulario">
                                    </div>
                                    <div class="mb-3">
                                        <label for="nombreFormulario" class="form-label">Fecha de Inicio</label>
                                        <input type="date" class="form-control" id="nombreFormulario" name="start" placeholder="Ingrese el nombre del formulario">
                                    </div>
                                    <div class="mb-3">
                                        <label for="nombreFormulario" class="form-label">Fecha Final</label>
                                        <input type="date" class="form-control" id="nombreFormulario" name="finish">
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                <button type="button" class="btn btn-primary">Guardar</button>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Ventana para agregar formulario -->
                <div class="modal fade" id="modalAgregarFormulario" tabindex="-1" aria-labelledby="modalAgregarFormularioLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="modalAgregarFormularioLabel">Agregar formulario</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <form action="#">
                                    <div class="mb-3">
                                        <label for="nombreFormulario" class="form-label">Nombre</label>
                                        <input type="text" class="form-control" id="nombreFormulario" name="title" placeholder="Ingrese el nombre del formulario">
                                    </div>
                                    <div class="mb-3">
                                        <label for="nombreFormulario" class="form-label">Descripción</label>
                                        <input type="text" class="form-control" id="nombreFormulario" name="description" placeholder="Ingrese el nombre del formulario">
                                    </div>
                                    <div class="mb-3">
                                        <label for="fechaInicio" class="form-label">Fecha de inicio</label>
                                        <input type="date" class="form-control" name="start" id="fechaInicio">
                                    </div>
                                    <div class="mb-3">
                                        <label for="fechaFinal" class="form-label">Fecha final</label>
                                        <input type="date" class="form-control" id="fechaFinal" name="finish">
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                <button type="button" class="btn btn-primary">Guardar</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class='profile-adm container-right' id='container-right3'>
            <div class="container">
                <h1 class="text-center mt-5">Listado de Foros</h1>
                <button class="btn buttonDelete mt-4 mb-4 float-left" data-bs-toggle="modal" data-bs-target="#modal-agregar-foro">Agregar foro</button>

                <table class=" table tableForum table-forms">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Descripción</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody id="results-forums"></tbody>
                </table>

                <!-- Ventana para agregar foro -->
                <div class="modal fade" id="modal-agregar-foro" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Agregar foro</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <form action="#">
                                    <div class="mb-3">
                                        <label for="nombreFormulario" class="form-label">Nombre</label>
                                        <input type="text" class="form-control" id="nombreFormulario" name="title" placeholder="Ingrese el nombre del formulario">
                                    </div>
                                    <div class="mb-3">
                                        <label for="descripcionFormulario" class="form-label">Descripción</label>
                                        <input type="text" class="form-control" id="descripcionFormulario" name="description" placeholder="Ingrese la descripción del formulario">
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                <button type="button" class="btn btn-primary">Guardar</button>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Ventana para editar Foro -->
                <div class="modal fade" id="modal-editar-foro" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Editar foro</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <form action="#">
                                    <div class="mb-3">
                                        <label for="nombreFormulario" class="form-label">Nombre</label>
                                        <input type="text" class="form-control" id="nombreFormulario" name="title" placeholder="Ingrese el nombre del formulario">
                                    </div>
                                    <div class="mb-3">
                                        <label for="descripcionFormulario" class="form-label">Descripción</label>
                                        <input type="text" class="form-control" id="descripcionFormulario" name="description" placeholder="Ingrese la descripción del formulario">
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                <button type="button" class="btn btn-primary">Guardar</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>