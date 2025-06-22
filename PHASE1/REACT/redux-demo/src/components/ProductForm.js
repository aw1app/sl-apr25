import { useDispatch } from "react-redux";
import { addProduct } from "../store";
import { useState } from "react";


function ProductForm() {

    const dispatch = useDispatch();


    const [product, setProduct] = useState({
        name: '',
        price: '',
        description: '',
        inStock: true,
        imagePath: '',
    });

    const handleChange = (e) => {
        let { name, value } = e.target;

        console.log(name,value);

        setProduct(
            (prev) => (
                {
                   ...prev, [name]:value
                }
            )
        );

    };

    const handleSubmit = (e) => {
        dispatch(addProduct(product));
    };

    return (

        <form onSubmit={handleSubmit} style={{ marginBottom: '20px' }}>

            <input name="name" value={product.name} onChange={handleChange} required />
            <input name="price" value={product.price} onChange={handleChange} required />

            <button type="submit">ADD PRODUCT</button>

        </form>



    )



};


export default ProductForm;