import logo from './logo.svg';
import './App.css';
import ProductList from './components/ProductList';
import CompA from './components/compA';
import CompB from './components/CompB';

function App() {
  return (
    <div className="App">
      
      <CompA/>
      <ProductList />
      <CompB/>
    </div>
  );
}

export default App;
