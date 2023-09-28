// Importar la función de registro (POST) que envía datos al servidor
import { post, get } from './ApiService.js';

// Capturar el formulario de registro
const $login = document.getElementById('login');
//const userTable = document.getElementById('user-table'); // Agrega un elemento HTML para mostrar la lista de usuarios


document.addEventListener("submit", async e => {

  // Insert a new user in the database.
  if (e.target === $login) {
    e.preventDefault();

    try {
      const email = e.target.email.value;
      const password = e.target.password.value;
      // Build the body with the data to send
      const body = {
        email,
        password
      };

      // Make post request
      const response = await post("login", body);
      console.log(response.jwTtoken)

      localStorage.setItem("jwtToken", response.jwTtoken);
      console.log("item traido del local storage"+localStorage.getItem("jwtToken"));


      //location.href = "?b=login&s=Inicio";
      //location.href = "../view/login/login.php";


    } catch (error) {
      console.error(error);
    }
    // pull request
  }})