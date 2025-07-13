function insertionSort(array) {
    let n = array.length;

    for (let i = 0; i < n - 1; i++) { // i is iteration number

        let key = array[i];

        let j= i - 1;

        while ( j>=0  &&   array[j] > key  ){
            array[j + 1 ] = array[j];
            j = j - 1;            
        }

        array[j + 1 ] = key;

    }

}

test_array =[5,1,4,2,8];

console.log('INSERTION SORT Demo');
console.log('Given array : ', test_array);

insertionSort(test_array);
//after bubble, the array has been transformed in-place.
console.log('Sorted array : ', test_array);