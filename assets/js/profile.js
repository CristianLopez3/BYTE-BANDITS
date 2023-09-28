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
  