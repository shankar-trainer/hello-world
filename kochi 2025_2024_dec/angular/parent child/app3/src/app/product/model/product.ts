export class Product {

    id: number;
    name: string;
    cost: number;
    mfd: Date;

    constructor(id: number,
        name: string,
        cost: number,
        mfd: Date) {

        this.id = id;
        this.name = name;
        this.cost = cost;
        this.mfd = mfd;
    }
}