
function selectionSort(array) {
    let n = array.length;

    for (let i = 0; i < n; i++) {

        let minIndex = i;

        for (let j = i + 1; j < n - 1; j++) {
            
            if ( array[j] < array[minIndex] )
                minIndex = j ; 
        }

        //swap 
        [array[i] , array[minIndex] ] =  [array[minIndex] , array[i] ];

    }

}

test_array =[5,1,4,2,8];

console.log('SELECTION SORT Demo');
console.log('Given array : ', test_array);

selectionSort(test_array);
//after bubble, the array has been transformed in-place.
console.log('Sorted array : ', test_array);

