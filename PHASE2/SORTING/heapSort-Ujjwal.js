function heapSort(arr) {
    let n = arr.length;

    for (let i = Math.floor(n / 2) - 1; i >= 0; i--) {
        heapify(arr, n, i);
    }
    console.log("Initial Max Heap:", [...arr]);

    for (let i = n - 1; i > 0; i--) {
        // Swap current root with end
        [arr[0], arr[i]] = [arr[i], arr[0]];

        console.log(`After moving max to index ${i}:`, [...arr]);
        // Heapify the reduced heap
        heapify(arr, i, 0);
    }
    
    console.log("Final Sorted Array:", arr);
}


function heapify(arr, n, i) {
    let largest = i;

    let left = 2 * i + 1;
    let right = 2 * i + 2;

    if (left < n && arr[left] > arr[largest]) {
        largest = left;
    }

    if (right < n && arr[right] > arr[largest]) {
        largest = right;
    }

    if (largest !== i) {
        [arr[i], arr[largest]] = [arr[largest], arr[i]];
        heapify(arr, n, largest);
    }
}


//Testing
let arr = [12, 11, 13, 5, 6, 7];
console.log(arr);

console.log(heapSort(arr));