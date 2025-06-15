import { Component } from "react";

class Product extends Component {


    constructor(props){
        super(props);

        this.state = {
           "seller":"Dell Inc",
           "countryOfOrgin": "USA",
           "name" : this.props.name,
           "exportLimit": this.props.exportLimit
        };

    }


    render() 
    {
        // .....
        let nameInCaps = this.state.name.toUpperCase();


        return (
            <div>
                <h3> Product info:</h3>
                <li> Seller: {this.state.seller} </li>
                <li> Name : {nameInCaps}</li>
                <li> Country of Origin : {this.state.countryOfOrgin}</li>
                <li> Export Limit: {this.state.exportLimit}</li>
                <li> Export Allowed : {this.state.exportLimit > 100 ? 'LIMIT EXCEEDED' : 'LIMIT ALLOWED' }</li>
            </div>
        );
    }

}

export default Product;
