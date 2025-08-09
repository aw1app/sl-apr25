// Binary tree node definition 
class Node {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Binary search tree definition 
class BST {
    constructor() {
        this.root = null;
    }


    // Function to insert a node into the binary tree 
    insert(data) {
        let newNode = new Node(data);

        if (this.root === null) {
            this.root = newNode;
        } else {
            this.insertNode(this.root, newNode);
        }

    }

    insertNode(node, newNode) {
        if (newNode.data < node.data) {
            if (!node.left) {
                node.left = newNode;
            } else {
                this.insertNode(node.left, newNode);
            }
        } else {
            if (!node.right) {
                node.right = newNode;
            } else {
                this.insertNode(node.right, newNode);
            }
        }
    }


    // Function to search for a node in the binary tree 
    search(data, node = this.root) {
        if (!node) {
            return false;
        }

        if (data === node.data) {
            return true;
        } else if (data < node.data) {
            return this.search(data, node.left);
        } else {
            return this.search(data, node.right);
        }
    }


    // Display
    // Function to perform an in-order traversal of the binary tree 
    display() {
        this.inOrder(this.root);
    }

    inOrder(node) {
        if (node !== null) {
            this.inOrder(node.left);
            console.log(node.data);
            this.inOrder(node.right);
        }
    }

}



// Sample usage
let bst = new BST();
bst.insert(10);
bst.insert(5);
bst.insert(15);
bst.insert(3);
bst.insert(7);

bst.display();


console.log("searching for 17", bst.search(17));    