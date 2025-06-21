import React, { useContext } from "react";
import { CountContext } from "../contexts/CounterContext";

const CompB =() => {

    const {count, decrement} = useContext(CountContext);


    return (
        <div style={{ marginBottom: "20px", color:'red' }}>
          <h3>Component B</h3>
          <p>Count: {count}</p>
          <button onClick={decrement}>Decrement from CompB</button>
        </div>
      );


}


export default CompB;
     