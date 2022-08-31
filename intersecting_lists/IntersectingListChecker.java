package intersecting_lists;

import library.LinkedListNode;
import sun.awt.image.ImageWatched;

public class IntersectingListChecker {
    /*
    Problem: Given two linked lists, find and return the intersecting node if the lists intersect
             Two lists are said to be intersecting if a node in each list points(by reference) to same next node
    Input: 1->8->9
           6->2->5->8->9
    Output: Return the node containing the data 8
     */
    private LinkedListNode firstListNode;
    private LinkedListNode secondListNode;
    private LinkedListNode firstListHeadNode;
    private LinkedListNode secondListHeadNode;

    private boolean isFirstListLonger = false;

    public IntersectingListChecker(LinkedListNode firstListHeadNode, LinkedListNode secondListHeadNode) {
        if(firstListHeadNode == null || secondListHeadNode == null) {
            throw new NullPointerException("Head(s) of one or both of the list is null.");
        }
        this.firstListHeadNode = firstListHeadNode;
        this.firstListNode = firstListHeadNode;
        this.secondListHeadNode = secondListHeadNode;
        this.secondListNode = secondListHeadNode;
    }

    private LinkedListNode compareListAndGetCommonNodeIfExists() {
        while(firstListNode.next != null && secondListNode.next != null) {
            if(firstListNode == secondListNode) {
                //Both list have same nodes
                return firstListNode;
            }

            firstListNode = firstListNode.next;
            secondListNode = secondListNode.next;
        }

        return null;
    }

    public LinkedListNode getIntersectingNodeIfExists() {
        LinkedListNode commonNode = compareListAndGetCommonNodeIfExists();

        if(commonNode != null) {
            //Found intersecting node
            return commonNode;
        }

        if(firstListNode.next == null && secondListNode.next == null) {
            //The lists were of same size
            // We have checked both list till the end
            return null;
        }

        if(firstListNode.next != null) {
            //The first list is longer
            isFirstListLonger = true;
        }

        int diff = getDifferenceBetweenListsSizes();

        if(firstListNode == secondListNode) {
            //The last nodes of both the lists are same, so they have intersected.
            firstListNode = firstListHeadNode;
            secondListNode = secondListHeadNode;

            moveTheLongerListPointer(diff);

            return compareListAndGetCommonNodeIfExists();
        }

        //The last nodes of both lists are not same, so they haven't intersected
        return null;
    }

    private int getDifferenceBetweenListsSizes() {
        //Basically we need to count how many nodes are left to be traversed in the longer list
        int count = 0;
        if(isFirstListLonger) {
            while(firstListNode.next != null) {
                count++;
                firstListNode = firstListNode.next;
            }
        }
        else {
            while(secondListNode.next != null) {
                count++;
                secondListNode = secondListNode.next;
            }
        }

        return count;
    }

    private void moveTheLongerListPointer(int moves) {
        if(isFirstListLonger) {
            for(int i = 0; i < moves; i++) {
                firstListNode = firstListNode.next;
            }
        }
        else {
            for(int i = 0; i < moves; i++) {
                secondListNode = secondListNode.next;
            }
        }
    }
}
