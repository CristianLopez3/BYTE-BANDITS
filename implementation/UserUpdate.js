document.addEventListener("DOMContentLoaded", async () => {
  const updateForm = document.getElementById('updateForm');

  updateForm.addEventListener('submit', async function (e) {
    e.preventDefault();
    const name = document.getElementById('name').value;
    const password = document.getElementById('password').value;
    const city = document.getElementById('city').value;
    const education = document.getElementById('education').value;
    const interest = document.getElementById('interest').value;
    const id = parseInt(localStorage.getItem("userId"));
    const token = localStorage.getItem("jwtToken");

    try {
      // Realizar la solicitud PUT para actualizar los datos del usuario
      const response = await axios.put(`http://localhost:9999/user/${id}`, {
        name,
        password,
        city,
        education,
        interest
      }, {
        headers: {
          "Authorization": `Bearer ${token}`,
          "Content-type": "application/json"
        }
      });

      if (response.status === 200) {
        console.log('Datos actualizados correctamente:', response.data);
        location.reload(); // Recargar la página (puedes redirigir en su lugar)
      } else {
        console.error('Error al actualizar los datos del usuario:', response.data);
      }
    } catch (error) {
      console.error('Error al actualizar los datos del usuario:', error);
      // Aquí puedes manejar errores y proporcionar retroalimentación al usuario si es necesario
    }
  });
});
