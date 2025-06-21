import React, { useContext } from "react";
import { CountContext } from "../contexts/CounterContext";

const CompA =() => {

    const {count, increment} = useContext(CountContext);


    return (
        <div style={{ marginBottom: "20px", color:'blue'  }}>
          <h3>Component A</h3>
          <p>Count: {count}</p>
          <button onClick={increment}>Increment from CompA</button>
        </div>
      );


}


export default CompA;
     