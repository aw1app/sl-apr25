import './App.css';
import Hello from './components/demoes/Hello';
import Product from './components/Product';
import Timer from './components/Timer';
import ProductF from './function-components/ProductF';
import User from './function-components/User';

function App() {

  let var1=950;

  return (
    <div >

   
     
    <h1>Welcome to Amazon.com</h1>
    <User name="Manohar" email="aaa@bbb.com" />

    {/* <Timer />
    <Hello name="Joe" age="23" />
    <Hello name="Priya" age="44"/> */}

    <Product name="Milk product" exportLimit="1000" />
    <Product name="Fruit Juice"  exportLimit={var1} />


    <hr/>
    <ProductF name="Functional Fruit Juice"  exportLimit="75" />

   

    </div>
  );

}

export default App;
