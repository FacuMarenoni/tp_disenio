export const BACKEND_PORT = '8080';
// In a real app, this might be an env var, but keeping it dynamic for local dev as per legacy script
export const getApiBaseUrl = () => {
    if (typeof window !== 'undefined') {
        return `http://${window.location.hostname}:${BACKEND_PORT}`;
    }
    return `http://localhost:${BACKEND_PORT}`;
};

export const API_ROUTES = {
    HUESPEDES: '/api/huespedes',
    HABITACIONES_ESTADO: '/habitaciones/estado',
};
