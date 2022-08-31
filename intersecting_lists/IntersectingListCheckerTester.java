package intersecting_lists;

import library.LinkedList;
import library.LinkedListNode;

public class IntersectingListCheckerTester {
    public static void main(String[] args) {
        //To avoid confusion keep the numbers in both lists distinct
        int[] arr1 = {1};
        LinkedList list1 = LinkedList.convertToList(arr1);
        int[] arr2 = {6,2,5,8,9};
        LinkedList list2 = LinkedList.convertToList(arr2);
        list1.appendNode(list2.head.next.next.next);//intersect list2 with list1 at the given node.
        list1.print();
        list2.print();

        IntersectingListChecker checker = new IntersectingListChecker(list1.head,list2.head);
        LinkedListNode intersectingNode = checker.getIntersectingNodeIfExists();
        if(intersectingNode == null) {
            System.out.println("The lists do not intersect.");
        }
        else {
            System.out.println("The lists intersect at the node containing " + intersectingNode.data );
        }
    }

}
