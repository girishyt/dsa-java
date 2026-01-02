package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
            length++;
        } else {
            tail.next = newNode;
            tail = newNode;
            length++;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
            
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if(length == 0 ) {
            System.out.println("List is empty");
            return null;
        }
        Node current = head;
        Node pre = head;
        while(current.next != null) {
            pre = current;
            current = current.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return current;
    }

    public Node removeFirst() {
        if(length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        length--;
        if(length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node start = head;
        // for(int i=1; i<=index; i++) {
        //     start = start.next;
        // }
        for(int i=0; i<index; i++) {
            start = start.next;
        }
        return start;
    }

}
