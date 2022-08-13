import library.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        int[] arr = {2,5,7,9};
        LinkedList list = LinkedList.convertToList(arr);
        list.print();
        System.out.println("head is" + list.head.data);
        System.out.println("size is "+ list.size );
    }
}