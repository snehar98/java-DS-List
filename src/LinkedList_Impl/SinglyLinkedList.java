package LinkedList_Impl;

/**
 * Singly Linked List Implementation
 * 1. Each node contains data and a reference to the next node.
 * 2. Traversal is possible in one direction (forward).
 * 3. Memory-efficient as it requires less overhead compared to doubly or circular lists.
 */
class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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
    }

    // Print elements
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();  // Output: 10 -> 20 -> 30 -> null
    }
}
