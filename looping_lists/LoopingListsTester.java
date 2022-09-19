package looping_lists;

import library.LinkedList;
import library.LinkedListNode;

public class LoopingListsTester {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        LinkedList list = LinkedList.convertToList(arr);
        loopTheList(list, list.head.next.next);

        LinkedListNode startLoopNode = LoopingLists.getTheLoopStartNodeIfExists(list);
        if(startLoopNode != null) {
            System.out.print(startLoopNode.data);
        }
        else {
            System.out.print("The list does not loop.");
        }


    }

    public static void loopTheList(LinkedList list, LinkedListNode startLoopNode) {
        LinkedListNode current = list.head;

        while(current.next != null) {
            current = current.next;
        }

        current.next = startLoopNode;

    }
}
