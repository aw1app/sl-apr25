function radixSort(arr) {

    const result = [...arr];

    const radixArray = Array.from({ length: 10 }, () => []); // 10 buckets. Each bucket is an array.  console.log(radixArray);

    const maxVal = Math.max(...result);

    let exp = 1;

  

    while (Math.floor(maxVal / exp) > 0) {

         // console.log("DEBUG Math.floor(maxVal / exp)" , Math.floor(maxVal / exp));
         // above check for Math.floor(maxVal / exp) is what controls number of iterations.

        // Distribute numbers to buckets
        for (let i = result.length - 1; i >= 0; i--) {
            const val = result[i];
            const radixIndex = Math.floor((val / exp) % 10); // radixIndex is the bucket number.
            radixArray[radixIndex].push(val);
        };

        //console.log(radixArray);

        // Clear result array
        result.length = 0;

        // Collect numbers from buckets
        for (const bucket of radixArray) {
            while (bucket.length > 0) {
                result.push(bucket.pop());
            }
        }

        exp = exp * 10;
    }

    return result;
};

console.log("RADIX SORT Demo:");
const unsortedArr = [170, 45, 75, 90, 802, 24, 2, 66];

console.log("Original array:", unsortedArr);

let sortedArr = radixSort(unsortedArr);

console.log("Sorted array:", sortedArr);
