function linearSearch(arr, target) {

    for (let i = 0; i < arr.length; i++) {

        if (arr[i] == target) {
            console.log(`Found the target ${target} at position i=${i}`);
            return;
        }

    }

    console.log(`Target ${target} not found in the given array`);
}

// Example usage 
const arr = [1, 3, 5, 8, 9];

console.log("linearSearch demo");

linearSearch(arr, 10);
linearSearch(arr, 3);
linearSearch(arr, -1);

