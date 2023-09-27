// Import the request functions
import { get, post, update, del } from './ApiService.js';

const d = document;
const $formRegister = d.getElementById("register");
const $formLogin = d.querySelector(".login");


// Function for obtain all users
async function getAllUsers() {
  try {
    const users = await get('user');
    const user = await get('user/1');
    console.log(user);
    console.log(users);
    return users;
  } catch (error) {
    throw new Error(`Error fetching users: ${error.message}`);
  }
}

const response = getAllUsers();
console.log(response);

// Manage the form register
document.addEventListener("submit", async e => {

  // Insert a new user in the database.
  if (e.target === $formRegister) {
    e.preventDefault();

    try {
      const name = e.target.name_user.value;
      const email = e.target.email_user.value;
      const password = e.target.password_user.value;
      const role = e.target.rol_user.value;
      const city = e.target.city_user.value;
      const birthDate = e.target.date_user.value;
      const interest = e.target.interest_user.value;
      const education = e.target.education_user.value;

      // Build the body with the data to send
      const body = {
        name,
        email,
        password,
        education,
        birthDate, // date in format ISO 8601 (YYYY-MM-DD)
        city,
        interest, // Roles de interés en el mundo STEM
        role // Rol de usuario (predeterminado = "ROLE_USER")
      };

      // Make post request
      const response = await post("user", body);
      location.reload();
       location.href = "?b=login&s=Inicio";
      //location.href = "../view/login/login.php";


    } catch (error) {
      console.error(error);
    }
  }


});


// Llamar a la función para obtener todos los usuarios
// const users = await getAllUsers();
// console.log(users);

