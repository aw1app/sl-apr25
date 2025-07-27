
class Node {

    constructor(data) {
        this.data = data;
        this.next = null;
    }

}


class LinkedList {

    // Constructor and methods
    constructor() {
        this.head = null;
    }

    // insert ops 
    // add data at the end
    add(data) {
        let newNode = new Node(data);

        // Is the LL empty
        if (this.head === null) {
            this.head = newNode;
            return;
        }

        // LL is not empty (i.e, the LL had some elements in it)
        let currentNode = this.head;

        while (currentNode.next !== null)
            currentNode = currentNode.next;

        // if you are here, it means currentNode is at the Tail
        currentNode.next = newNode;
    }

    // add data at the end
    addAtPosition(data, position) {
        let newNode = new Node(data);

        if (position == 0) {

            // Empty LL
            if (this.head === null) {
                this.head = newNode;
                return;
            }

            // Non empty LL
            newNode.next = this.head;
            return;
        }

        // inserting at position  > 0
        else {
            console.log("position", position);

            let counter = 0;
            let currentNode = this.head;

            while (position != counter && currentNode !== null) {
                currentNode = currentNode.next;
                counter++;
                console.log("position, counter", position, counter);
            }

            // if position has gone beyond  the number of elements in LL. 
            if (position > counter) {
                console.log("Canot add at position " + position + " beyond the length of current LL ");
                return;
            }

            // currentNode is at the required position within the LL length.
            newNode.next = currentNode.next; // N.N = C.N
            currentNode.next = newNode; // C.N = N
        }
    }


    // TASK1: updating at position.
    update(newData, position) {
        if (position < 0 || position >= this.size) {
            console.log(`Invalid position: ${position}`);
            return;
        }
        let current = this.head;
        let index = 0;
        while (index < position) {
            current = current.next;
            index++;
        }
        current.data = newData;
        console.log(`Updated position ${position} with ${newData}`);
    }


    // deletion at position.
    deleteAtPosition(position) {

        // deleting at the beginning 
        if (position === 0) {
            this.head = this.head.next;

            return;
        }

        // delete at position > 0
        let current = this.head;
        let previous = null;

        let counter = 0;

        while (position != counter && current != null) {
            previous = current;
            current = current.next;
            counter++;
        }

        // if position has more than the number of elements check
        if (position > counter) {
            console.log("Canot delete at position " + position + " beyond the length of current LL ");
            return;
        }

        // current is at the required position.
        previous.next = current.next; // P.N = C.N 
    }




    // Read: Traverse and display elements of the list 
    display() {
        let currentNode = this.head;

        while (currentNode !== null) {
            console.log(currentNode.data)
            currentNode = currentNode.next;
        }
    }

}


// sample usage

let linkedList1 = new LinkedList();
linkedList1.add(6);
linkedList1.add(16);
// linkedList1.display();
console.log("------")
linkedList1.add(4);
linkedList1.add(11);
linkedList1.display();

console.log("---adding 10 aT POS 2---")
linkedList1.addAtPosition(10, 2);
linkedList1.display();


console.log("---delete aT POS 1---")
linkedList1.deleteAtPosition(1);
linkedList1.display();
