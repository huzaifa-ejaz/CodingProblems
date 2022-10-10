package queue_from_stack;

public class MyQueueTester {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.peek()); //returns 1
        System.out.println(queue.remove()); //returns 1
        queue.add(5);
        System.out.println(queue.remove()); //returns 2
        System.out.println(queue.remove()); //returns 3
        System.out.println(queue.size()); //returns 2 (Two elements 4 and 5 in the queue)
    }
}
