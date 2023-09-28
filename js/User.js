// Import the request functions
import { get, post, update, del } from './ApiService.js';

const d = document;
const $formRegister = d.getElementById("register");
const $formLogin = d.getElementById("login");
const $updateForm = d.getElementById("update");

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
    // pull request
  }

  // Login form 
  // TODO - implement security module
  if (e.target === $formLogin) {
    e.preventDefault();
    try {

      const email = e.target.email_user.value;
      const password = e.target.password_user.value;

      // Build the body with the data to send
      const body = {
        email,
        password
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


  // update form
  if (e.target === $updateForm) {
    e.preventDefault();

    try {
      const name = e.target.name_user.value;
      const password = e.target.password_user.value;
      const city = e.target.city_user.value;
      const interest = e.target.interest_user.value;
      const education = e.target.education_user.value;

      // Build the body with the data to send
      const body = {
        name,
        password,
        education,
        interest
      };

      // Make post request
      const response = await update(`user/${id}`, body);
      location.reload();
      location.href = "?b=login&s=Inicio";
      //location.href = "../view/login/login.php";


    } catch (error) {
      console.error(error);
    }
  }

});


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

// const response = getAllUsers();
// console.log(response);


/**
 * Delete user
 */

  
document.addEventListener("click", async e => {

  // editar
  // if(e.target.matches(".editar")){
  //   $tittle.textContent = "Editar santo";
  //   $form.id.value = e.target.dataset.id;
  //   $form.nombre.value = e.target.dataset.name;
  //   $form.constelacion.value = e.target.dataset.constellation;
  // }

  if(e.target.matches(".eliminar")){
    let isDelete = confirm("Desea eliminar al santo con con id: "+e.target.dataset.id)
    if(isDelete){
      try{
  
        let response = await delete(`user/${id}`);
        if(!response.ok) throw {status: response.status, statusText: response.statusText};
        location.reload();

      } catch(error){

        let message = error.statusText || "Ocurrio un error";
        alert(`Error ${error.status}: ${message}`)
        
      }
    }
 

  }

})

