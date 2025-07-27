
class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class StackLL {

    constructor() {
        this.top = null;
        this.size = 0;
    }

    // Push operation 
    push(data) {
        let newNode = new Node(data);

        newNode.next = this.top;
        this.top = newNode;

        this.size++;
    }

    // Pop operation 
    pop() {

        if (this.size === 0) return "Stack Underflow";

        let poppedNode = this.top; // store the current top in some tewmp variable.

        this.top = this.top.next; // current top's next will become the new Top

        this.size--;

        return poppedNode.data;
    }

    //peek
    peek() {
        return this.top ? this.top.data : null;
    }

    isEmpty() {
        return this.top === null;
    }


    // Clear the Stack 
    clear() {
        this.top = null;
        this.size = 0;
        console.log("Stack cleared.");
    }

    // Display the Stack 
    display() {
        let current = this.top;

        while (current) {
            console.log(current.data);
            current = current.next;
        }
    }
}

// sample usage

const stack = new StackLL();
stack.push(10);
stack.push(20);
stack.push(30);


console.log("Stack Display:"); // Display the stack
stack.display();

console.log("------"); 
console.log("Top:", stack.peek()); // Peek at the top element

console.log("Popped:", stack.pop()); // Pop the top element
console.log("Popped:", stack.pop()); // Pop the top element

console.log("------ Stack after above 2 pops-----"); 
stack.display();
