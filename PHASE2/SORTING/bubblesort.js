
function bubbleSort(array) {
    let n = array.length;

    for (let i = 0; i < n - 1; i++) { // i is iteration number

        for (let j = 0; j < n - 1 - i; j++) { 

             if (array[j] > array[j+1])
                 [array[j], array[j + 1]] = [array[j + 1], array[j]];

        }

    }

};



test_array =[5,1,4,2,8];

console.log('Given array : ', test_array);

bubbleSort(test_array);
//after bubble, the array has been transformed in-place.
console.log('Sorted array : ', test_array);