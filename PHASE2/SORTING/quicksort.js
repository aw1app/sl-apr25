function quickSort(array, low, high) {

    if (low < high) {
        const pivotIndex = partition(array, low, high);

        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex, high);
    }
}

function partition(array, low, high) {

    const pivot = array[high];

    let i = low - 1;

    for (let j = low; j < high; j++) {

        if (array[j] < pivot) {
            i++;
            [ array[i], array[j] ] = [ array[j], array[i] ]; // Swap elements 
        }
    }

    [ array[i + 1], array[high] ] = [ array[high], array[i + 1] ]; // One last swap  
    return i + 1;// return the pivot index
}

let test_array = [5, 11, 13, 2, 1, 6];

console.log('Given array : ', test_array);

quickSort(test_array, 0, test_array.length - 1);
//after quick, the array has been transformed in-place.
console.log('Sorted array after quick sort : ', test_array);