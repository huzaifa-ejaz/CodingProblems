package stack_min;

import java.util.EmptyStackException;

public class StackMin {
    public class StackNode{
        int value;
        int subStackMinValue;

        public StackNode(int data, int subStackMinValue){
            this.value = data;
            this.subStackMinValue = subStackMinValue;
        }
    }

    StackNode[] stack;
    int size;
    int capacity;

    public StackMin(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        stack = new StackNode[capacity];
    }

    public void push(int data){
        if(this.size == capacity) {
            throw new FullStackException("The stack is full");
        }
        try {
            int subStackMin = this.getMin();
            if(data < subStackMin){
                /*We found a new minimum*/
                stack[this.size] = new StackNode(data, data);
            }
            else {
                stack[this.size] = new StackNode(data, subStackMin);
            }
        }catch(EmptyStackException e){
            stack[this.size] = new StackNode(data, data);
        }

        this.size++;
    }

    public int getMin() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[this.size-1].subStackMinValue;
    }

    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        size--;
        return stack[size].value;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

}
