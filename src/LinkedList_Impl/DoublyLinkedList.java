package LinkedList_Impl;

/**
 * Doubly Linked List Implementation
 * 1. Each node contains data, a reference to the next node, and a reference to the previous node.
 * 2. Traversal is possible in both forward and backward directions.
 * 3. Requires extra memory for storing the previous reference.
 * 4. Allows easy deletion of nodes as it maintains links to both neighbors.
 */
class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    private Node head;

    // Add element at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Print elements in forward and backward order
    public void printList() {
        Node temp = head;
        Node last = null;

        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("null");

        System.out.print("Backward: ");
        while (last != null) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();
    }
}
