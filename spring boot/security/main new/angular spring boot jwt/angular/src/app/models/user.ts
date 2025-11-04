export interface User {
  username: string;
  password?: string; // Opcional, pois nem sempre será enviado
}