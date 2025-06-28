import logo from './logo.svg';
import './App.css';
import ProductList from './components/ProductList';
import CompA from './components/compA';
import CompB from './components/CompB';
import ProductListRedux from './components/ProductListRedux';
import ProductForm from './components/ProductForm';
import { Route, Routes } from 'react-router-dom';
import Header from './components/Header';

function App() {
  return (
    <div className="App">
<Header />
      <Routes>
        <Route path="/" element={<ProductListRedux />} />
        <Route path="/add-product" element={<ProductForm />} />

      </Routes>


      {/* <ProductForm />
      <ProductListRedux />
      <CompA/>
      <ProductList />
      <CompB/> */}
    </div>
  );
}

export default App;
