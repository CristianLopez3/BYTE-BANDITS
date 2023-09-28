document.getElementById('loginForm').addEventListener('submit', function (e) {
  e.preventDefault();
  const email = document.getElementById('email').value;
  const password = document.getElementById('password').value;
  // Realizar la solicitud de inicio de sesión
  axios.post('http://localhost:9999/login/', {
      email: email,
      password: password
  })
  .then(response => {
      const token = response.data.jwTtoken;
      const userId = response.data.id;

      // Guardar el token en el almacenamiento local (localStorage)
      localStorage.setItem('jwtToken', token);
      localStorage.setItem('userId', userId)

      // Realizar una solicitud GET para obtener una lista de usuarios
      axios.get('http://localhost:9999/user', {
          headers: {
              "Authorization": `Bearer ${token}`,
              "Content-type": "application/json"
          }
      })
      .then(userResponse => {
          location.href= "?b=profile";
      })
      .catch(error => {
          console.error('Error al obtener la lista de usuarios:', error);
      });
  })
  .catch(error => {
      console.error('Error de inicio de sesión:', error);
  });
});


// Form to register user
document.getElementById('registerForm').addEventListener('submit', function (e) {
  e.preventDefault();
  const email = document.getElementById('email').value;
  const name = document.getElementById('name').value;
  const city = document.getElementById('city').value;
  const education = document.getElementById('education').value;
  const interest = document.getElementById('interest').value;
  const birthDate = document.getElementById('date').value;
  const password = document.getElementById('password').value;
  const role = document.getElementById('role').value;
  // Realizar la solicitud de inicio de sesión
  axios.post('http://localhost:9999/register/', {
      name,
      email,
      city,
      education,
      interest,
      password,
      birthDate,
      role
  })
  .then(response => {

      location.href="?b=login"
  })
  .catch(error => {
      console.error('Error de inicio de sesión:', error);
  });
});

// Button to logout of system

document.getElementById('logout').addEventListener("click", async function (e) {
  localStorage.clear(); // clear the user id and token
  // Re-location user in the login
  window.location.href = '?b=login'; // Cambia la URL según tu aplicación
})