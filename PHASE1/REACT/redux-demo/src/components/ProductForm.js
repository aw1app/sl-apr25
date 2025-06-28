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
            <br></br><br></br>
            <h2>ADD a New Product </h2>

            Name: <input name="name" value={product.name} onChange={handleChange} required /> <br /><br />
            Price: <input name="price" value={product.price} onChange={handleChange} required /><br /><br />

            <button type="submit">ADD PRODUCT</button>

        </form>



    )



};


export default ProductForm;