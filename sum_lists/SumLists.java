package sum_lists;

import library.LinkedList;
import library.LinkedListNode;

public class SumLists {
    public static LinkedList addPlaceholderZeroes(LinkedList list, int places) {
        for(int i = 0; i < places; i++) {
            LinkedListNode placeholder = new LinkedListNode();
            placeholder.next = list.head;
            list.head = placeholder;
        }

        return list;
    }

    public static LinkedList getSumList(LinkedList list1, LinkedList list2) {

        System.out.println(String.format("Length of list1 = %d, Length of list2 = %d",list1.size,list2.size));

        int diff = Math.abs(list1.size - list2.size);
        if(diff > 0) {
            if(list1.size < list2.size) {
                list1 = addPlaceholderZeroes(list1,diff);
                return list1;
            }
            else {
                list2 = addPlaceholderZeroes(list2,diff);
                return list2;
            }
        }
        return new LinkedList();
    }
}
