package LinkedList_Impl;

/**
 * Doubly Circular Linked List Implementation
 * 1. Combines features of both doubly and circular linked lists.
 * 2. Each node contains references to both the next and previous nodes.
 * 3. The last node points back to the head, and the head's previous points to the last node.
 * 4. Memory-intensive as it requires extra references for both previous and next links.
 * 5. Allows bidirectional traversal in a circular manner.
 */
class DoublyCircularLinkedList {
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    private Node head;

    // Add element
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        Node tail = head.prev;
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    // Print elements
    public void printList() {
        if (head == null) return;

        Node temp = head;
        System.out.print("Forward: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(head.data);

        System.out.print("Backward: ");
        Node tail = head.prev;
        Node tempTail = tail;
        do {
            System.out.print(tempTail.data + " -> ");
            tempTail = tempTail.prev;
        } while (tempTail != tail);
        System.out.println(tail.data);
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();
    }
}
