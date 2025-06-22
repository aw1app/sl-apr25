import { useEffect, useState } from "react";

const ProductList = (props) => {
    let [products, setProducts] = useState([]);
    let [x0,setX0] = useState(0);
    let [x1,setX1] = useState(0);
    let x2 = 0;


    useEffect(

        () => {
            console.log('INSIDE useEffect.');

            fetch("http://localhost:5000/products")
                .then(res => res.json())
                .then(jsonData => setProducts(jsonData))
                .catch(err => console.log(' something thing went wrong ' + err));
        },
        
        [x0, x1]

    );

    const incrementX0 = () => { console.log('INSIDE incrementX0 function '); setX0( prev => prev + 1) };

    const incrementX1 = () => { console.log('INSIDE incrementX1 function '); setX1( prev => prev + 1) };
    const incrementX2 = () => { console.log('INSIDE incrementX2 function '); ++x2 };


    return (

        <div style={{ border: "solid 1px", "border-color": 'red' }} >
            <h3> ProductList info (Functional component):</h3>

            <table border="1">
                <tr><th>NAME</th><th>PRICE</th></tr>
                {products && products.map(prod => <tr><td> {prod.name} </td> <td> {prod.price} </td> </tr>)}
            </table>

            <br></br>
            X1 = {x1}<br/>
            X2 = {x2}<br/><br/>
            <button onClick={incrementX1} >Increment X1 </button>  <button onClick={incrementX0} >Increment X0 </button>
            <br/>
            <button onClick={incrementX2} >Increment X2 </button>

        </div>
    );

}

export default ProductList;