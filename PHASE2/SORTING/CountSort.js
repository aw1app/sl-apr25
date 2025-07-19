function countingSort(arr) {

    // Create a copy of input array
    const result = [];

    const maxVal = Math.max(...arr);

    const count = new Array(maxVal + 1).fill(0);

    // Build the frequency array 
    for (num of arr){
        count[num]+=1;
    }

     for (let i = 0; i < count.length; i++) {
       
         while (count[i] > 0) {
            result.push(i);
            count[i]-=1;
         }
     }

     return result;

}


// Example usage:
const unsortedArr = [4, 2, 2, 6, 3, 3, 1, 6, 5, 2, 3];
console.log("Original array:", unsortedArr);

const sortedArr = countingSort(unsortedArr);

console.log("Sorted array:", sortedArr);