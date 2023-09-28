// Funcion para habilitar el formulario de datos del usuario
function formEnabled() {
  document.querySelectorAll('input, select').forEach(function (element) {
    element.removeAttribute('disabled');
  });
}
// Funcion para inhabilitar el formulario de datos del usuario
function formDisabled() {
  document.querySelectorAll('input, select').forEach(function (element) {
    element.setAttribute('disabled', 'disabled');
  });
}

document.addEventListener("DOMContentLoaded", function () {
  // Funcionalidad para imprimir los foros en el perfil de usuarios

  const containerForums = document.getElementById('container-forums');

  // Arreglo provisional, se debe traer los datos desde la Base de datos. 
  const arrayForos = ["PHP - Fundamentos Básicos", "CSS - Hojas de Estilo en Cascada", "Programación Orientada a Objetos", "PHP - Fundamentos Básicos", "CSS - Hojas de Estilo en Cascada", "Programación Orientada a Objetos"];

  for (let i = 0; i < arrayForos.length; i++) {

    const linkForum = document.createElement("a");
    linkForum.classList.add("container-forum");
    linkForum.setAttribute("href", "#");

    const iconForum = document.createElement("div");
    iconForum.classList.add("icon-forum");
    iconForum.innerHTML = '<i class="fa-solid fa-book"></i>';

    const titleForum = document.createElement("div");
    titleForum.classList.add("title-forum");

    titleForum.textContent = arrayForos[i];

    linkForum.appendChild(iconForum);
    linkForum.appendChild(titleForum);

    containerForums.appendChild(linkForum);
  }

});

// -----Funcionabilidad del menu de navegacion Dasboard Admin-----//
// Obtén los elementos del contenedor y los botones
const container0 = document.getElementById("container-right");
const container1 = document.getElementById("container-right2");
const container2 = document.getElementById("container-right3");

const profileAdmContainer = document.querySelectorAll(".profile-adm");
const profileAdmBtn = document.querySelectorAll(".profile-adm-btn");

profileAdmBtn.forEach((e, i) => {
  e.addEventListener("click", () => {
    profileAdmContainer.forEach((e) => {
      e.style.setProperty("display", "none");
    });
    profileAdmContainer[i].style.setProperty("display", "block");
  });
});


function exitSesion() {
  const alert = confirm("¿Esta seguro de cerrar sesón?");
  if (alert == true) {
    // Cerrar Sesión
  }
}


// -----Funcionalidad para mostrar los formularios existentes-----//

const table = document.querySelector('#results-forms');

const comunas = [
  {
    id: 1,
    nombre: "Formulario 1",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam ut leo vulputate, blandit sem sit amet, lobortis dui. Nulla ac turpis lacus. Integer rhoncus justo pellentesque enim fermentum egestas.",
    fechaInicio: new Date("2023-08-01"),
    fechaFinal: new Date("2023-08-31"),
  },
  {
    id: 2,
    nombre: "Formulario 2",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam ut leo vulputate, blandit sem sit amet, lobortis dui. Nulla ac turpis lacus. Integer rhoncus justo pellentesque enim fermentum egestas.",
    fechaInicio: new Date("2023-09-01"),
    fechaFinal: new Date("2023-09-30"),
  },
];

for (let i = 0; i < comunas.length; i++) {

  const tr = document.createElement('tr');

  const tdIdForm = document.createElement('td');
  const tdNameForm = document.createElement('td');
  const tdDesForm = document.createElement('td');
  const tdStartDate = document.createElement('td');
  const tdFinishDate = document.createElement('td');
  const buttonEdit = document.createElement('td');
  const buttonDelete = document.createElement('td');
  tdIdForm.textContent = comunas[i].id;
  tdNameForm.textContent = comunas[i].nombre;
  tdDesForm.textContent = comunas[i].description;
  tdStartDate.textContent = comunas[i].fechaInicio;
  tdFinishDate.textContent = comunas[i].fechaFinal;
  buttonEdit.innerHTML = '<button class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#modalEditarFormulario">Editar</button>';
  buttonDelete.innerHTML = '<button class="btn btn-danger">Eliminar</button>';
  tr.appendChild(tdIdForm);
  tr.appendChild(tdNameForm);
  tr.appendChild(tdDesForm)
  tr.appendChild(tdStartDate);
  tr.appendChild(tdFinishDate);
  tr.appendChild(buttonEdit);
  tr.appendChild(buttonDelete);

  table.appendChild(tr);
}




// -----Funcionalidad para mostrar los foros existentes-----//

const tableForum = document.querySelector('#results-forums');


// Crear un arreglo vacío para almacenar las comunas
const forums = [
  {
    id: 1,
    nombre: "Foro de PHP",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam ut leo vulputate, blandit sem sit amet, lobortis dui. Nulla ac turpis lacus. Integer rhoncus justo pellentesque enim fermentum egestas."
  },
  {
    id: 2,
    nombre: "Foro de Js",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam ut leo vulputate, blandit sem sit amet, lobortis dui. Nulla ac turpis lacus. Integer rhoncus justo pellentesque enim fermentum egestas."
  },
];

for (let i = 0; i < forums.length; i++) {

  const tr = document.createElement('tr');

  const tdIdForm = document.createElement('td');
  const tdNameForm = document.createElement('td');
  const tdDesForm = document.createElement('td');
  const buttonEditForum = document.createElement('td');
  const buttonDeleteForum = document.createElement('td');
  tdIdForm.textContent = forums[i].id;
  tdNameForm.textContent = forums[i].nombre;
  tdDesForm.textContent = forums[i].description;
  buttonEditForum.innerHTML = '<button class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#modal-editar-foro">Editar</button>';
  buttonDeleteForum.innerHTML = '<button class="btn btn-danger">Eliminar</button>';
  tr.appendChild(tdIdForm);
  tr.appendChild(tdNameForm);
  tr.appendChild(tdDesForm);
  tr.appendChild(buttonEditForum);
  tr.appendChild(buttonDeleteForum);

  tableForum.appendChild(tr);
}


