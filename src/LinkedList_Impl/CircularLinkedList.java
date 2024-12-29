package LinkedList_Impl;

/**
 * Circular Linked List Implementation
 * 1. The last node points back to the head, forming a circular structure.
 * 2. Traversal is continuous as there is no null reference.
 * 3. Requires careful handling to avoid infinite loops during traversal.
 * 4. Memory-efficient compared to doubly circular lists as it doesn't store a previous reference.
 */
class CircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Add element
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Print elements
    public void printList() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();
    }
}
