export class Product {

    public id: number = 0;
    public name: string = '';
    public price: number = 100;

    constructor(id: number, name: string, price: number) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
