package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(10);
        myLinkedList.append(5);
        myLinkedList.append(16);
        myLinkedList.prepend(1);
        System.out.println(myLinkedList.get(3).value);
        myLinkedList.printList();
    }
}
