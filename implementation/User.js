document.addEventListener("DOMContentLoaded",async  e => {
 
  document.getElementById('loginForm').addEventListener('submit', async function (e) {
    e.preventDefault();
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    // Realizar la solicitud de inicio de sesión
    await axios.post('http://localhost:9999/login/', {
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

})
