package sum_lists;

import library.LinkedList;

public class SumListsTester {
    public static void main(String[] args) {
        int[] arr1 = {2,5,6,8};
        LinkedList list1 = LinkedList.convertToList(arr1);
        list1.print();

        int[] arr2 = {2,5,5,6,4,6};
        LinkedList list2 = LinkedList.convertToList(arr2);
        list2.print();

        System.out.println("After calling Sum_Lists.getSumList");
        LinkedList modlist = SumLists.getSumList(list1,list2);
        modlist.print();
    }
}
