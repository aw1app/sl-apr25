import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { fetchProducts } from "../store";

const ProductListRedux = (props) => {
    const { items, status, error } = useSelector((state) => state.products);
    const dispatch = useDispatch();


    useEffect(

        () => {

            if (status === 'idle') {
                dispatch(fetchProducts());
            }

        },

        [status]

    );


    if (status === 'loading') {
        return <p>Loading products...</p>;
    }

    if (status === 'failed') {
        return <p>Error: {error}</p>
    }



    return (

        <div style={{ border: "solid 1px", "border-color": 'red' }} >
            <h3> ProductListRedux info (Functional component):</h3>

            <table border="1">
                <tr><th>NAME</th><th>PRICE</th></tr>
                {items && items.map(prod => <tr><td> {prod.name} </td> <td> {prod.price} </td> </tr>)}
            </table>

            <br></br>


        </div>
    );

}

export default ProductListRedux;