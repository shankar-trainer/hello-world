// address.model.ts
export interface Address {
  street: string;
  city: string;
  state: string;
  zipCode: string;
  type: 'home' | 'work' | 'other'; // Example: differentiate address types
}

// person.model.ts
export interface Person {
  id: number;
  firstName: string;
  lastName: string;
  email: string;
  addresses: Address[]; // Array of Address objects
}
