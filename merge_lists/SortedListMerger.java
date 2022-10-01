package merge_lists;

import library.LinkedList;
import library.LinkedListNode;

public class SortedListMerger {
    /*Problem: Given k sorted linked list, merge them to form a single sorted Linked List*/

    LinkedList[] sortedLists;

    public SortedListMerger(LinkedList[] sortedLists) {
        this.sortedLists = sortedLists;
    }

    public LinkedList mergeSortedLists() {

        LinkedList result = new LinkedList();
        LinkedListNode nodeToBeAdded = popMinHeadNode();

        while(nodeToBeAdded != null) {
            result.appendNode(nodeToBeAdded);
            nodeToBeAdded = popMinHeadNode();
        }
        return result;
    }

    /* Returns and removes the head node with the minimum value from the head nodes of all the lists.*/
    public LinkedListNode popMinHeadNode() {
        int min = Integer.MAX_VALUE;
        int minListIndex = 0;

        //Get the list that has the minimum head node
        for(int i = 0; i < sortedLists.length; i++) {
            if(sortedLists[i].head != null && sortedLists[i].head.data < min) {
                min = sortedLists[i].head.data;
                minListIndex = i;
                //System.out.println("Min:"+min);
            }
        }

        if(min == Integer.MAX_VALUE){
            //All lists are empty
            return null;
        }

        sortedLists[minListIndex].head = sortedLists[minListIndex].head.next;
        return new LinkedListNode(min);
    }

}
