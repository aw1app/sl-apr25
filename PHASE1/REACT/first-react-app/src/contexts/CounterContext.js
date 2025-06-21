import { createContext, useState } from "react";


export const CountContext = createContext();


export const CountProvider = ({ children }) => {

    const [count, setCount] = useState(0);

    const increment = () => setCount((prev) => prev + 1);
    const decrement = () => setCount((prev) => prev - 1);

    return (

        <CountContext.Provider value={{ count, increment, decrement }}>
            {children}
        </CountContext.Provider>
        
    )


}
