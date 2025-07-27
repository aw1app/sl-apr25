class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLL {

    constructor() {
        this.front = null; // Initialize the front of the queue as null (empty)
        this.rear = null; // Initialize the rear of the queue as null (empty)
        this.size = 0; // Initialize the size of the queue as 0
    }

    // Enqueue operation: Add anelement to the rear of the queue
    enqueue(data) {

        const newNode = new Node(data); // Create a  new node

        if (this.isEmpty()) {
            // If the queue is empty, set both front and rear to the new node
            this.front = newNode;
            this.rear = newNode;
        }

        else {
            // Otherwise, update the rear to the new node
            this.rear.next = newNode;
            this.rear = newNode;
        }

        this.size++;
    }

    // Delete/remove
    // Dequeue operation: Remove and return theelement from the front of the queue
    dequeue() {
        if (this.isEmpty()) {
            return "Underflow: Queue is empty";
        }

        const removedData = this.front.data; // Get the data from the front node

        this.front = this.front.next; // Move the front pointer to the next node
        this.size--; // Decrement the size

        if (this.isEmpty()) {
            // If the queue becomes empty, also update the rear to null
            // this.front = null;
            this.rear = null;
        }


        return removedData;
    }

    isEmpty() {
        return (this.size === 0);
    }

    // Peek operation: Return the front element without removing it
    peek() {
        if (this.isEmpty()) {
            return "Queue is empty";
        }
        return this.front.data;
    }

    // Get the size (number of elements) of the queue
    getSize() {
        return this.size;
    }
}

// Example usage:
const queue = new QueueLL();
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);
console.log("Front:", queue.peek()); // Peek at the front element  10 
console.log("Dequeued:", queue.dequeue()); // Dequeue the front element 10
console.log("Queue size:", queue.getSize()); // Get the current size of the queue 2
