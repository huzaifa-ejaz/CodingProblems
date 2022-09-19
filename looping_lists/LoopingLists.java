package looping_lists;

import library.LinkedList;
import library.LinkedListNode;

public class LoopingLists {
    //Problem: If a list loops (a node's next points to a previous node), return the node from where
    // the loop starts
    //Input: 1->2->3->4->5->3 (The same 3 as the previous)
    //Output: Node containing the data 3
    //Source: Cracking the Coding Interview

    public static LinkedListNode checkIfLoopExists(LinkedList list) {
        //init slowRunner and fastRunner
        LinkedListNode slowRunner = list.head;
        LinkedListNode fastRunner = list.head;

        //While the fastRunner is not null
        while(fastRunner != null && fastRunner.next != null) {
            //Move the slowRunner one step
            slowRunner = slowRunner.next;
            //Move the fastRunner two steps
            fastRunner = fastRunner.next.next;

            //If fastRunner and slowRunner are the same
            if(fastRunner == slowRunner) {
                //They have collided which means there's a loop and...
                //...they have collided at a place that is as far away...
                //...from the loop start as the head node
                //return fastRunner
                return fastRunner;
            }
        }

        //If the fastRunner is null the list does not have a loop so return null
        return null;
    }

    public static LinkedListNode getTheLoopStartNodeIfExists(LinkedList list) {

        LinkedListNode meetingPoint = checkIfLoopExists(list);

        //If it does not exist, return null
        if(meetingPoint == null) {
            return  null;
        }

        //If it does exist
        //Get the collision spot node as insideLoop
        LinkedListNode insideLoop = meetingPoint;
        //Init outsideLoop to be head of the list
        LinkedListNode outsideLoop = list.head;

        //While both insideLoop pointer and outsideLoop pointer do not converge
        while(insideLoop != outsideLoop) {
            //Move insideLoop one step
            insideLoop = insideLoop.next;
            //Move outsideLoop one step
            outsideLoop = outsideLoop.next;

            System.out.println("In the outside and inside loop");
        }
        //Return insideLoop as it's the node that starts the loop
        return insideLoop;

    }
}
