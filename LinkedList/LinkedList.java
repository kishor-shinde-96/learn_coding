package LinkedList;

public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    // addFirst

    public void addFirst(int data) {
        // step-1 = create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step -2 = new node = head
        newNode.next = head;

        // step -3 = head = new node
        head = newNode;

    }

    // addLast
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            tail = head = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // remove

    // print

    // search

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

    }

}
