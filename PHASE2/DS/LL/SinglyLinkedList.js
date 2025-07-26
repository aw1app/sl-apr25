
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
    add(data, position) {
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

            counter = 0;
            let currentNode = this.head;

            while (position != counter){
                currentNode = currentNode.next;
                counter++;
            }

            // currentNode is at the required position.
            newNode.next = currentNode.next; // N.N = C.N
            currentNode.next = newNode; // C.N = N

        }
    }


    // updating at position.
    update(newData, position){
        
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
linkedList1.display();
console.log("------")
linkedList1.add(4);
linkedList1.add(11);
linkedList1.display();

