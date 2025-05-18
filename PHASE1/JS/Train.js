export class Train {

    constructor(name, from, to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }

    startJourney(){
        return `Train ${this.name} Journey started `;
    }

}