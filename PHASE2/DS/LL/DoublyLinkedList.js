class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
        this.size = 0; // Enhanced: Added size tracking
    }

    addAtPosition(data, position) {
        // Validate position using size
        if (position < 0 || position > this.size) {
            console.log(`Cannot add at position ${position} beyond the length of current LL (size ${this.size})`);
            return false;
        }

        let newNode = new Node(data);

        // Case 1: Position 0
        if (position === 0) {
            // Empty list
            if (this.head === null) {
                this.head = newNode;
                this.tail = newNode;
                this.size++; // Enhanced: Increment size
                return true;
            }
            // Non-empty list
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
            this.size++; // Enhanced: Increment size
            return true;
        }

        // Case 2: Position equals size (append)
        if (position === this.size) {
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++; // Enhanced: Increment size
            return true;
        }

        // Case 3: Non-zero position (insert before currentNode)
        let counter = 0;
        let currentNode = this.head;
        while (counter < position) {
            currentNode = currentNode.next;
            counter++;
        }

        // Insert before currentNode
        newNode.next = currentNode;
        newNode.prev = currentNode.prev;

        currentNode.prev.next = newNode;
        currentNode.prev = newNode;

        this.size++; // Enhanced: Increment size
        return true;
    }
    

    display() {
        if (this.head === null) {
            console.log("List is empty");
            return;
        }
        let currentNode = this.head;
        let output = "";
        while (currentNode) {
            output += currentNode.data;
            if (currentNode.next) {
                output += " <--> ";
            }
            currentNode = currentNode.next;
        }
        console.log(output);
    }
}

// Sample usage
let linkedList1 = new DoublyLinkedList();
linkedList1.addAtPosition(6, 0);
linkedList1.addAtPosition(16, 1);
console.log("------");
linkedList1.addAtPosition(5, 2);
linkedList1.addAtPosition(11, 3);
linkedList1.display();

console.log("------");
linkedList1.addAtPosition(117, 2);
linkedList1.display();