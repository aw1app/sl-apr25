import { useContext } from 'react';
import './App.css';
import Hello from './components/demoes/Hello';
import Product from './components/Product';
import Timer from './components/Timer';
import { CountContext, CountProvider } from './contexts/CounterContext';
import CompA from './function-components/CompA';
import CompB from './function-components/CompB';
import ProductF from './function-components/ProductF';
import ProductListF from './function-components/ProductListF';
import User from './function-components/User';

function App() {

  let var1 = 950;
  const {count} = useContext(CountContext);

  const parentFunc1 = (data) => { console.log('INSIDE parentFunc1' + data); }

  return (
    <div >
      COUNT in APP : {count} <br/>
    
        <CompA />
        <CompB />


      <h1>Welcome to Amazon.com</h1>
      <User name="Manohar" email="aaa@bbb.com" />

      {/* <Timer />
    <Hello name="Joe" age="23" />
    <Hello name="Priya" age="44"/> */}

      <Product name="Milk product" exportLimit="1000" />
      <Product name="Fruit Juice" exportLimit={var1} />


      <hr />
      <ProductF name="Functional Fruit Juice" exportLimit="75" func1={parentFunc1} />

      <ProductListF />


    </div>
  );

}

export default App;
