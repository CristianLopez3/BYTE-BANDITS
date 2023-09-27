// import data
import { apiUrl, commonHeaders, handleResponse } from './apiConfig.js';

export async function get(endpoint, options = {}) {
  const url = `${apiUrl}/${endpoint}`;
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

// Implementar funciones para PUT, DELETE, etc. de manera similar
