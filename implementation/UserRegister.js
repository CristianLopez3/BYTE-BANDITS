document.addEventListener("DOMContentLoaded", () => {
  const registerForm = document.getElementById("registerForm");
  
  // Define una función asíncrona para manejar el envío del formulario
  async function handleSubmit(e) {
    e.preventDefault();
    const email = document.getElementById('email').value;
    const name = document.getElementById('name').value;
    const city = document.getElementById('city').value;
    const education = document.getElementById('education').value;
    const interest = document.getElementById('interest').value;
    const birthDate = document.getElementById('date').value;
    const password = document.getElementById('password').value;
    const role = document.getElementById('role').value;

    try {
      // Realizar la solicitud de registro
      const response = await axios.post('http://localhost:9999/register/', {
        name,
        email,
        city,
        education,
        interest,
        password,
        birthDate,
        role
      });

      // Verificar si la solicitud fue exitosa y redirigir al usuario
      if (response.status === 200) {
        location.href = "?b=login";
      } else {
        console.error('Error en la solicitud de registro:', response);
      }
    } catch (error) {
      console.error('Error de registro:', error);
    }
  }

  // Agregar el manejador de eventos al formulario
  registerForm.addEventListener('submit', handleSubmit);
});
