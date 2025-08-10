class ListNode {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

function mergeTwoLists(l1, l2) {

    if (l1 === null) {
        return l2;
    } else if (l2 === null) {
        return l1;
    }

    // if you are here, it means both l1 and l2 are not null
    let mergedListDummyHeadNode = new ListNode(-1); // initialize with a dummy node

    let current = mergedListDummyHeadNode; // initialize with the dummy node

    while (l1 !== null && l2 !== null) {

        if (l1.data < l2.data) {
            current.next = l1;
            l1 = l1.next;
        } else {
            current.next = l2;
            l2 = l2.next;
        }

        current = current.next;

    }

    // if you are here, it means one of l1 and l2 is null (that is l1 or l2 is completely traversed)
    // so assign the remaining list of the other list (l1 or l2 ) to the next of current
    if (l1 === null) {
        current.next = l2;
    } else {
        current.next = l1;
    }

    return mergedListDummyHeadNode.next;
}


// sample test case

let l1 = new ListNode(1);
l1.next = new ListNode(7);
l1.next.next = new ListNode(14);

let l2 = new ListNode(2);
l2.next = new ListNode(3);
l2.next.next = new ListNode(24);



let resultHead = mergeTwoLists(l1, l2);
//console.log(mergeTwoLists(l1, l2));

// output
while (resultHead !== null) {
    console.log(resultHead.data);
    resultHead = resultHead.next;
};



