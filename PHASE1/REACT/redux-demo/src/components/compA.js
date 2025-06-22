import { useDispatch, useSelector } from "react-redux";
import { increment,decrement } from "../store";

const CompA = (props) => {
    const count = useSelector( (state) => state.counter.value);

    const dispatch = useDispatch();


    return (
        <div>
            Count : {count}

            <button onClick={  () => dispatch ( increment() ) } > INCREMENT THE GLOBAL VARIABLE </button>   &nbsp;  &nbsp;
            <button onClick={  () => dispatch ( decrement() ) } > DECREMENT THE GLOBAL VARIABLE </button>

        </div>
    );


}


export default CompA;

