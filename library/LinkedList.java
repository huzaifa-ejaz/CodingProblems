package library;

public class LinkedList {
    public LinkedListNode head;
    public int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(int data) {
        if(this.head == null) {
            head = new LinkedListNode(data);
        }
        else {
            LinkedListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new LinkedListNode(data);
        }
        size++;
    }

    public void print() {
        LinkedListNode current = head;
        while(current != null) {
            System.out.print(current.data+"-> ");
            current = current.next;
        }
        System.out.println();
    }

    public static LinkedList convertToList(int[] elements) {
        LinkedList list = new LinkedList();

        for(int i = 0; i < elements.length; i++) {
            list.add(elements[i]);
        }

        return list;
    }

}
