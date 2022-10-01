package merge_lists;

import library.LinkedList;

public class SortedListMergerTester {
    public static void main(String[] args) {
        int[][] arrOfListsInput = { //These lists should be sorted
                                    {1,3,4},
                                    {2,5,9},
                                    {3,9,12}
                                };

        LinkedList[] arrayOfList = getArrayOfLists(arrOfListsInput);
        SortedListMerger slm = new SortedListMerger(arrayOfList);
        LinkedList sortedMergedList = slm.mergeSortedLists();
        sortedMergedList.print();


    }

    public static LinkedList[] getArrayOfLists(int[][] arr) {
        LinkedList[] arrayOfLists  = new LinkedList[arr.length];
        for(int i = 0; i < arr.length; i++) {
            LinkedList list = LinkedList.convertToList(arr[i]);
            list.print();
            arrayOfLists[i] = list;
        }
        return arrayOfLists;
    }
}
