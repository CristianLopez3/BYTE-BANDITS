// Funcion para habilitar el formulario de datos del usuario
function formEnabled() {
    document.querySelectorAll('input, select').forEach(function (element) {
        element.removeAttribute('disabled');
    });
    document.getElementById('editarBtn').style.display = 'none';
    document.getElementById('registrarmeBtn').style.display = 'block';
}
// Funcion para inhabilitar el formulario de datos del usuario
function formDisabled() {
    document.querySelectorAll('input, select').forEach(function (element) {
        element.setAttribute('disabled', 'disabled');
    });
    document.getElementById('registrarmeBtn').style.display = 'none';
    document.getElementById('editarBtn').style.display = 'block';
}
