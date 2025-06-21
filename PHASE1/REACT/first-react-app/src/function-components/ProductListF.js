

let products= [
    {
        "id": "1",
        "name": "HP Laptop",
        "price": 100000,
        "description": "HP Gaming Laptop",
        "inStock": true,
        "imagePath": "images/111.png"
    },
    {
        "id": 0,
        "name": "Nokia 3305",
        "price": "5000",
        "description": "",
        "inStock": true,
        "imagePath": "images/222.png"
    },
    {
        "id": 0,
        "name": "Nokia 2000",
        "price": "10000",
        "description": "",
        "inStock": true,
        "imagePath": "images/222.png"
    }
];


const ProductListF = (props) => {


    // const getProductlist = () => {
    //     if ( products ) 
    //         { return products.map ( product => <li> {product.name} </li> ) } 
    //     else return <div></div>
    // }


    return (

        <div style={ {border:"solid 1px", "border-color": 'red'} } >
            <h3> ProductList info (Functional component):</h3>

            <table border="1">
                <tr><th>NAME</th><th>PRICE</th></tr>
             { products &&  products.map ( product => <tr><td> {product.name} </td> <td> {product.price} </td> </tr>) }
            </table>

          <br></br> 

        </div>
    );

}

export default ProductListF ;