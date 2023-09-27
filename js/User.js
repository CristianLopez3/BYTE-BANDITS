// Import the request functions
// Import the request functions
import { get, post, update, del } from './ApiService.js';

// Función para obtener todos los usuarios
async function getAllUsers() {
  try {
    const users = await get('user');
    return users;
  } catch (error) {
    throw new Error(`Error fetching users: ${error.message}`);
  }
}

// Llamar a la función para obtener todos los usuarios
const users = await getAllUsers();
console.log(users);

