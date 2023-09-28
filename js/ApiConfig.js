// Spring boot URL 
export const apiUrl  = "http://localhost:9999";

// Header
export const commonHeaders = {
  'Content-Type': 'application/json', 
  'access-control-allow-origin': "*"
};


// Function to manage errors
export function handleResponse(response) {
  if (!response.ok) {
    throw new Error(`Error HTTP: ${response.status}`);
  }
  return response.json();
}