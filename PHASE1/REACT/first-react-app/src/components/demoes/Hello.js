import { Component } from "react";

class Hello extends Component {

    // constructor(){

    // }

    render() 
    {
        // .....

        return (
        <div style={ {"border":"1px solid red",} } >
        <h2>Hello World, Hello {this.props.name}, aged {this.props.age}</h2>
        </div>
        ) 
        
    }
}


export default Hello;
