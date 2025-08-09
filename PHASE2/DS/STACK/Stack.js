class Stack {

    constructor() {
        this.items = [];
    }

    push(data) {
        this.items.push(data);
    }

    pop() {
        // check for empty stack
        if (this.isEmpty())
            console.log("Cannot pop as the stack is empty")

        else
            return this.items.pop();
    }

    // peek
    peek() {
        if (this.isEmpty())
            return null;
        else
            return this.items[this.items.length - 1];
    }


    // Empty check
    isEmpty() {

        if (this.items.length === 0) return true;
        else return false;
    }

    clear() {
        this.items = [];
    }

    size() {
        return this.items.length;
    }

    display() {
        return this.items;
    }

}

// sample usage;

// Example usage:
const stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);

console.log("Stack Display :", stack.display());  // [10, 20, 30]

console.log("Size:", stack.size()); // 3

console.log("-----");
console.log("Peek:", stack.peek()); // 30
console.log("Stack after peek:", stack.display()); // [10, 20, 30]

console.log("-----");
let poppedItem = stack.pop();
console.log("Stack popped element :", poppedItem); // 30

console.log("Stack after pop:", stack.items); // [10, 20]


