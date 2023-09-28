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

function deleteItem(e) {
  const alert = confirm("¿Esta seguro de elimnar este "+e+"?");
  if (alert == true) {
    // Eliminar Item
  }
}

// -----Funcionalidad para mostrar los formularios existentes-----//
// Obtener el contenedor de la tabla
const table = document.querySelector('#results-forms');

// Obtener las filas de la tabla
const trs = table.querySelectorAll('table');

// Crear un arreglo vacío para almacenar las comunas
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
// Recorrer el arreglo de comunas
for (let i = 0; i < comunas.length; i++) {
  // Crear una fila para la comuna actual
  const tr = document.createElement('tr');
  // Agregar la comuna a la fila
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
  buttonDelete.innerHTML = '<button class="btn btn-danger" onclick="deleteItem("Formulario")">Eliminar</button>';
  tr.appendChild(tdIdForm);
  tr.appendChild(tdNameForm);
  tr.appendChild(tdDesForm)
  tr.appendChild(tdStartDate);
  tr.appendChild(tdFinishDate);
  tr.appendChild(buttonEdit);
  tr.appendChild(buttonDelete);

  // Agregar la fila al tbody
  table.appendChild(tr);
}


