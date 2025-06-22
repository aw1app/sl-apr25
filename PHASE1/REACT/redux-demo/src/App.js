import logo from './logo.svg';
import './App.css';
import ProductList from './components/ProductList';
import CompA from './components/compA';
import CompB from './components/CompB';
import ProductListRedux from './components/ProductListRedux';
import ProductForm from './components/ProductForm';

function App() {
  return (
    <div className="App">
      <ProductForm />
      <ProductListRedux />
      <CompA/>
      <ProductList />
      <CompB/>
    </div>
  );
}

export default App;
