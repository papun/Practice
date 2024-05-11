package src.linkedlist;

public class LinkedList {
    private final Node head;
    private final Node tail;
    private final int length;


    LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public int getHead() {
        return head.value;
    }

    public int getTail() {
        return tail.value;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Value :" + temp.value);
            temp = temp.next;
        }
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
