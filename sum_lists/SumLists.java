package sum_lists;

import library.LinkedList;
import library.LinkedListNode;

public class SumLists {
    /* Problem: Add two list containing the digits in their nodes giving a list of sum as output
       Input: 9->7->8 + 6->8->5
       Output: 1->6->6->3
     */
    public static LinkedList addPlaceholderZeroes(LinkedList list, int places) {
        for(int i = 0; i < places; i++) {
            LinkedListNode placeholder = new LinkedListNode();
            placeholder.next = list.head;
            list.head = placeholder;
        }

        return list;
    }

    public static LinkedList getSumList(LinkedList list1, LinkedList list2) {

        int diff = Math.abs(list1.size - list2.size);
        if(diff > 0) {
            if(list1.size < list2.size) {
                addPlaceholderZeroes(list1,diff);
            }
            else {
                addPlaceholderZeroes(list2,diff);
            }
        }

        PartialSum result = addLists(list1.head, list2.head);

        if(result.carry == 1) {
            LinkedListNode newNode = new LinkedListNode(result.carry);
            newNode.next = result.sum;
            result.sum = newNode;
        }

        return new LinkedList(result.sum);
    }

    public static PartialSum addLists(LinkedListNode l1, LinkedListNode l2) {
        if(l1 == null && l2 == null) {
            return new PartialSum();
        }

        PartialSum prevPartialSum = addLists(l1.next,l2.next);
        int value = l1.data + l2.data + prevPartialSum.carry;
        PartialSum currentPartialSum = new PartialSum();
        currentPartialSum.sum = new LinkedListNode(value%10);
        currentPartialSum.carry = value >= 10 ? 1 : 0;
        currentPartialSum.sum.next = prevPartialSum.sum;

        return currentPartialSum;

    }
}
