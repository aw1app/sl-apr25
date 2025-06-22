import { configureStore, createAsyncThunk, createSlice } from "@reduxjs/toolkit";

////// COUNTER SLICE ///////
const counterSlice = createSlice(
  {

    name: 'counter',
    initialState: { value: 100 },

    reducers: {
      //actions
      increment: (state) => { state.value += 1; },
      decrement: (state) => { state.value -= 1; },
    }

  }

);

export const { increment, decrement } = counterSlice.actions;

////// COUNTER SLICE ///////


////// PRODUCTS SLICE ///////

// Async thunk to fetch products from json-server
export const fetchProducts = createAsyncThunk('products/fetchProducts', async () => {

  const response = await fetch('http://localhost:5000/products');
  const data = await response.json();
  return data;
}
);


// Add product
export const addProduct = createAsyncThunk('products/addProduct', async (newProduct) => {

  const res = await fetch('http://localhost:5000/products', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(newProduct),
  });

  const data = await res.json();
  return data;
});

const productsSlice = createSlice(
  {

    name: 'products',
    initialState: {
      items: [],
      status: 'idle', // 'idle' | 'loading' | 'succeeded' | 'failed'
      error: null
    },
    reducers: {},
    extraReducers: (builder) => {

      builder
        .addCase(fetchProducts.pending, (state) => {
          state.status = 'loading';
        })
        .addCase(fetchProducts.fulfilled, (state, action) => {
          state.status = 'succeeded';
          state.items = action.payload;
        })
        .addCase(fetchProducts.rejected, (state, action) => {
          state.status = 'failed';
          state.error = action.error.message;
        })
        .addCase(addProduct.fulfilled, (state, action) => {
          state.items.push(action.payload);
        });
    },

  }
);


////// PRODUCTS SLICE ///////

const store = configureStore({
  reducer: {
    counter: counterSlice.reducer,
    products: productsSlice.reducer
  },
});

export default store;
