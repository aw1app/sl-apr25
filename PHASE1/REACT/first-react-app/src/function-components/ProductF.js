import { useState } from "react";

function ProductF(props) {
   let [quantity,setQuantity ] = useState(1);
   let [inStock,setInStock ] = useState(true);

   //quantity=5; INCOORECT - we cannot change the state variable value directly
  //  setQuantity(5); // CORRECT WAY

  const f = () => {
    console.log('INSIDE f() ');
    setQuantity(5);
    // props.name="QQQQQQQ"; ERROR props are read-only.
  }

    return (

        <div>
            <h3> Product info (Functional componwent):</h3>
            <li> Name : {props.name}</li>
            <li> Export Limit: {props.exportLimit}</li>
            <li> Export Allowed : {props.exportLimit > 100 ? 'LIMIT EXCEEDED' : 'LIMIT ALLOWED'}</li>
            <li> Quantity : {quantity} </li>

            <li> <button onClick={f} > CLICK ME TO INCREMENT </button> </li>

            <li> <button onClick={ () => props.func1('mydata') } > CLICK ME TO CALL PARENT FUNC1 </button> </li>
        </div>

    )

}

export default ProductF;


// Task: Create an UserProfile functional comp