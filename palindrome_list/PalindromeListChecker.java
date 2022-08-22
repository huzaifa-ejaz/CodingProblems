package palindrome_list;

import library.LinkedList;
import library.LinkedListNode;

import java.util.Stack;

public class PalindromeListChecker {
    /*Problem: Check if a given list is palindrome
      Input: 2->3->8->7->8->3->2
      Output: true
     */
    public static boolean isListPalindrome(LinkedList list){
        LinkedListNode current = list.head;
        int middle = list.size / 2;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < middle; i++) {
            stack.push(current.data);
            current = current.next;
        }

        if(list.size % 2 == 1) {
            //If list is odd skip the middle element
            current = current.next;
        }

        for(int i = 0; i < middle; i++) {
            int stackTop = stack.pop();

            if(current.data == stackTop) {
                current = current.next;
            }
            else {
                return false;
            }
        }

        return true;
    }
}
