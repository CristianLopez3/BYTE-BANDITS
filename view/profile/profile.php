<body>
    <div class="container-profile">
        <!-- Header -->
        <div class="header-profile d-flex justify-content-between px-3 aling-middle py-2">
            <div class="d-flex aling-items-center gap-2 p-3">
                <p class="">
                    <i class="fa-solid fa-circle-user"></i>
                </p>
                <p id="user-name" class="">Name User</p>
            </div>
            <div class="d-flex justify-content-center aling-items-center p-3">
                <i class="fa-solid fa-arrow-right-from-bracket" id="logout"></i><
            </div>
        </div>
        <!-- Scrore -->
        <div class="container-score container-fluid d-flex justify-content-center aling-items-center p-5 flex-wrap gap-5">
            <div class="card overflow-hidden" style="width: 18rem;">
                <div class="container d-flex justify-content-center aling-items-center py-3">
                    <h3>Puntos Globales</h3>
                </div>
                <div class="card-body py-5 text-center">
                    <h1>0 puntos</h1>
                </div>
            </div>

            <div class="card-top card d-flex flex-row justify-content-center aling-items-center">
                <div class="container d-flex justify-content-center aling-items-center py-3">
                    <h3>Top Global</h3>
                </div>
                <div class="card-body">
                    <h1><strong>Top</strong><span>1</span></h1>
                </div>
            </div>
        </div>
        <!-- User Data -->
        <div class="container-fluid container-user-data">
            <form class="p-5" action="#" method="post">
                <h1 class="text-center mb-5">Datos del Usuario</h1>
                <div class="form-floating">
                    <input type="hidden" name="id_user" class="form-control" id="floatingInput" disabled>
                </div>
                <div class="form-floating">
                    <input type="text" name="name_user" class="form-control" id="floatingInput" disabled>
                    <label for="floatingInput">Nombre Completo</label>
                </div>
                <div class="form-floating mt-3">
                    <input type="text" name="city_user" class="form-control" id="floatingInput" disabled>
                    <label for="floatingInput">Ciudad de Residencia</label>
                </div>
                <div class="form-floating mt-3">
                    <select class="form-select" name="interest_user" id="floatingSelect" aria-label="Floating label select example" disabled>
                        <option selected disabled>Seleccione sus intereses</option>
                        <option value="QA">Quality Assurance</option>
                        <option value="BA">Business Analyst</option>
                        <option value="DEV">DEV</option>
                    </select>
                    <label for="floatingSelect">Carrera de Interes</label>
                </div>
                <div class="form-floating mt-3">
                    <select class="form-select" disabled name="education_user" id="floatingSelect" aria-label="Floating label select example">
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
        <!-- Forums -->
        <div id="container-forums" class="container-fluid container-forums p-5 d-flex flex-wrap justify-content-center aling-items-center gap-5">
        </div>
    </div>