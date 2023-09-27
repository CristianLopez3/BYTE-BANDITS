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
    const arrayForos = ["PHP - Fundamentos Básicos", "CSS - Hojas de Estilo en Cascada", "Programación Orientada a Objetos"];

    for (let i = 0; i < arrayForos.length; i++) {
        // Crear el enlace (etiqueta <a>) con el atributo href="#"
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

