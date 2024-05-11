package src.linkedlist;

public class Client {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(4);
        System.out.println(ll.getHead());
        System.out.println(ll.getTail());
        System.out.println(ll.getLength());
        ll.printList();
    }
}
