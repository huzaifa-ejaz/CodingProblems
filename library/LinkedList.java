package library;

import sun.awt.image.ImageWatched;

public class LinkedList {
    public LinkedListNode head;
    public int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public LinkedList(LinkedListNode head) {
        if( head != null) {
            this.head = head;
            this.size = getSizeTillLastNode(this.head);
        }
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

    public int getSizeTillLastNode(LinkedListNode node) {
        int count = 0;

        LinkedListNode current = node;
        while(current != null) {
            count++;
            current = current.next;
        }

        return count;
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
