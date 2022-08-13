package sum_lists;

import library.LinkedList;

public class SumListsTester {
    public static void main(String[] args) {
        int[] arr1 = {9,7,8};
        LinkedList list1 = LinkedList.convertToList(arr1);
        list1.print();

        int[] arr2 = {6,8,5};
        LinkedList list2 = LinkedList.convertToList(arr2);
        list2.print();

        System.out.println("After calling Sum_Lists.getSumList");
        LinkedList result = SumLists.getSumList(list1,list2);
        result.print();
    }
}
