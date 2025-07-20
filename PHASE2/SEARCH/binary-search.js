function binarySearch(arr, target) {

    let left = 0;
    let right = arr.length - 1;


    while (left <= right) {

        let mid = Math.floor((right + left) / 2);

        if (arr[mid] === target) {
            console.log(`Found the target ${target} at position i=${mid}`);
            return;
        }

        if (arr[mid] < target) {
            left = mid + 1; // search in the right half
        }
        else {
            right = mid - 1; // search in the left half
        }

    }

    // If we are here, then the target was not in the given array.
    console.log(`Target ${target} not found in the given array`);
    return;
}

// Example usage 
const arr = [1, 3, 5, 8, 9];

console.log("Binary Search demo for ", arr);

binarySearch(arr, 10);
binarySearch(arr, 3);
binarySearch(arr, -1);


// use binary search on a unsorted array.
console.log("\n binary search on a unsorted array demo");
const arr1 = [11, 3, 5, 28, 9];

// first sort the array yusing any of the sorting algo and then apply binary search
import {heapSort} from '../SORTING/heapSort-Ujjwal.js'
binarySearch (heapSort(arr1), 28 );
