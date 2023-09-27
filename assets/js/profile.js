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

    // Arreglo provisional, se dene traer los datos desde la Base de datos. 
    const arrayForos = ["PHP - Fundamentos Básicos", "CSS - Hojas de Estilo en Cascada", "Programación Orientada a Objetos"];

    for (let i = 0; i < arrayForos.length; i++) {
        const containerForum = document.createElement("div");
        containerForum.classList.add("container-forum");

        const iconForum = document.createElement("div");
        iconForum.classList.add("icon-forum");
        iconForum.innerHTML = '<i class="fa-solid fa-book"></i>';

        const titleForum = document.createElement("div");
        titleForum.classList.add("title-forum");

        titleForum.textContent = arrayForos[i];

        containerForum.appendChild(iconForum);
        containerForum.appendChild(titleForum);

        containerForums.appendChild(containerForum);
    }
});
