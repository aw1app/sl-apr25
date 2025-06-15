import './App.css';
import Hello from './components/demoes/Hello';
import Product from './components/Product';

function App() {

  return (
    <div >
     
    <h1>Welcome to Amazon.com</h1>
    <Hello name="Joe" age="23" />
    <Hello name="Priya" age="44"/>

    <Product name="Milk product" exportLimit="1000" />
    <Product name="Fruit Juice"  exportLimit="95" />

    </div>
  );

}

export default App;
