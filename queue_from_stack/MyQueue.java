package queue_from_stack;

import java.util.Stack;

public class MyQueue {
    /*Problem: Implement a queue using two stacks.
        Implement add, remove, peek and size methods
     */

    Stack<Integer> inStack;
    Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void add(int data){
        inStack.push(data);
    }

    public void shiftStack() {
        if(outStack.isEmpty()) {
            while(!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

    public int peek() {
        shiftStack();
        return outStack.peek();
    }

    public int remove() {
        shiftStack();
        return outStack.pop();
    }

    public int size() {
        return inStack.size() + outStack.size();
    }
}
