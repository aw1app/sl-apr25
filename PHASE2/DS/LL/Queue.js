class Queue {

    constructor() {
        this.items = []; // Array to store elements
    }


    // (add) an item to the queue 
    enqueue(item) {
        this.items.push(item);
    }

    // Delete or Remove elements from the front
    dequeue() {
        if (this.isEmpty()) {
            return "Queue is empty";
        }
        return this.items.shift();
    }

    // Empty check
    isEmpty() {

        if (this.items.length === 0) return true;
        else return false;
    }


    // Function to get the front item of the queue without removing it 
    peek() {
        if (this.isEmpty()) {
            return "Queue is empty";
        }
        return this.items[0];
    }

    // Function to get the size of the queue 
    size() {
        return this.items.length;
    }

}


// Example usage:
const queue = new Queue();
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

console.log("Front:", queue.peek()); // Peek at the front element // 10

console.log("Dequeued:", queue.dequeue()); // Dequeue the front element // 10

console.log("Queue size:", queue.size()); // Get the current size of the queue 2