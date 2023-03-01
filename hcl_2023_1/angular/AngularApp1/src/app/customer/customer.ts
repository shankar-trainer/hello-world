export class Customer {
    id: number;
    name: string;
    dob: string;
salary: number;
    location: string;

    constructor(id: number, name: string, dob: string, salary: number, location: string) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.location = location;
    }
}
