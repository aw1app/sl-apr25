function jumpSearch(arr, target) {

    // Calculate the optimal block size 
    let m = Math.floor(Math.sqrt(arr.length));

    // Start the search from the beginning of the array 
    let left = 0;
    let right = m;

    while ( left < right && arr[right] <= target && right < arr.length) {
        //console.log(`At Line 11 left=${left} and right=${right}`);

        left = right;
        right += m;

        if (right >= arr.length) {
            right = arr.length - 1;
        };

        //console.log(`At Line 19`);

    };

    //console.log(`At Line 21`);

    // if we are here, it means either have found a block (left < right) where our target could be found
    //  or we have reached the end of array (left=right)
    // now apply the linear in the block [left, right]

    for (let i = left; i <= right; i++) {

        if (arr[i] === target) {
            console.log(`Found the target ${target} at position i=${i}`);
            return;
        }

    }

    console.log(`Target ${target} not found in the given array`);
}

// Example usage 
const arr = [1, 3, 5, 8, 9];

console.log("Jump Search demo for ", arr);

jumpSearch(arr, 10);
jumpSearch(arr, 3);
jumpSearch(arr, -1);