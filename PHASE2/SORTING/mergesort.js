function mergeSort(array) {

    // Base case: 
    if (array.length <= 1)
        return array

    const middleIndex = Math.floor(array.length / 2);

    // Divide the array into two halves 
    const leftHalf = array.slice(0, middleIndex);
    const rightHalf = array.slice(middleIndex);

    // Recursively sort the left and right halves 
    const sortedLeft = mergeSort(leftHalf);
    const sortedRight = mergeSort(rightHalf);

    return merge(sortedLeft, sortedRight);
}

function merge(leftArray, rightArray) {

    const mergedArray = [];

    let leftIndex = 0;
    let rightIndex = 0;

    // Merge the two sorted arrays 
    while (leftIndex < leftArray.length && rightIndex < rightArray.length) {

        if (leftArray[leftIndex] <= rightArray[rightIndex]) {
            mergedArray.push(leftArray[leftIndex]);
            leftIndex++;
        } else {
            mergedArray.push(rightArray[rightIndex]);
            rightIndex++;
        };
    };

    // if there are any remaining elements in either of the array
    return mergedArray.concat(leftArray.slice(leftIndex)).concat(rightArray.slice(rightIndex));

}


let test_array = [5, 1, 4, 2, 8, 16, 9];

console.log('MERGE SORT Demo');
console.log('Given array : ', test_array);

let mergedArray = mergeSort(test_array);
//after bubble, the array has been transformed in-place.
console.log('Sorted array : ', mergedArray);