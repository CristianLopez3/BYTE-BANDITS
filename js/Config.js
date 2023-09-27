// Spring boot URL 
export const url = "http://localhost:8080/api";

// Header
export const commonHeaders = {
  'Content-Type': 'application/json',
  // another headers like authorization
};


// Function to manage errors
export function handleResponse(response) {
  if (!response.ok) {
    throw new Error(`Error HTTP: ${response.status}`);
  }
  return response.json();
}