  // import data
  import { apiUrl, commonHeaders, handleResponse } from './ApiConfig.js';

  /**
   * @Method: GET
   * @param {*} endpoint 
   * @param {*} options 
   * @returns 
   */
  export async function get(endpoint, options = {}) {
    const url = `${apiUrl}/${endpoint}`;
    console.log(url);
    try {
      const response = await fetch(url, {
        method: 'GET',
        headers: {
          ...commonHeaders,
          ...options.headers,
        },
        ...options,
      });
      return handleResponse(response);
      
    } catch (error) {
      throw new Error(`Error fetching data: ${error.message}`);
    }
  }


  /**
   * @Method: POST
   * @param {*} endpoint 
   * @param {*} options 
   * @returns 
   */
  export async function post(endpoint, data, options = {}) {
    const url = `${apiUrl}/${endpoint}`;
    try {
      const response = await fetch(url, {
        method: 'POST',
        headers: {
          ...commonHeaders,
          ...options.headers,
        },
        body: JSON.stringify(data),
        ...options,
      });
      return handleResponse(response);
    } catch (error) {
      throw new Error(`Error fetching data: ${error.message}`);
    }
  }


  /**
 * @Method: PUT (Actualizar)
 * @param {*} endpoint 
 * @param {*} data 
 * @param {*} options 
 * @returns 
 */
export async function update(endpoint, data, options = {}) {
  const url = `${apiUrl}/${endpoint}`;
  try {
    const response = await fetch(url, {
      method: 'PUT',
      headers: {
        ...commonHeaders,
        ...options.headers,
      },
      body: JSON.stringify(data),
      ...options,
    });
    return handleResponse(response);
  } catch (error) {
    throw new Error(`Error updating data: ${error.message}`);
  }
}


/**
 * @Method: DELETE (Eliminar)
 * @param {*} endpoint 
 * @param {*} options 
 * @returns 
 */
export async function del(endpoint, options = {}) {
  const url = `${apiUrl}/${endpoint}`;
  try {
    const response = await fetch(url, {
      method: 'DELETE',
      headers: {
        ...commonHeaders,
        ...options.headers,
      },
      ...options,
    });
    return handleResponse(response);
  } catch (error) {
    throw new Error(`Error deleting data: ${error.message}`);
  }
}



