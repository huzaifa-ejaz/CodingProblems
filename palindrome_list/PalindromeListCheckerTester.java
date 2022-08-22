package palindrome_list;

import library.LinkedList;

public class PalindromeListCheckerTester {
    public static void main(String[] args) {
        int[] arr = {2,3,8,7,8,3,2};
        LinkedList list = LinkedList.convertToList(arr);
        System.out.println(PalindromeListChecker.isListPalindrome(list));
    }
}
