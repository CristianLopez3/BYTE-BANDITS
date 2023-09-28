document.getElementById('logout').addEventListener('click', async function (e) {
  await localStorage.clear(); // clear the user id and token
  // Re-location user in the login
  location.href = '?b=login'; // Cambia la URL según tu aplicación
})
console.log("Conect")