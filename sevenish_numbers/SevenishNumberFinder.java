package sevenish_numbers;

public class SevenishNumberFinder {
    /* Problem: A "sevenish" number is any power of 7 or any sum of unique powers of 7
                First four sevenish numbers are { 1, 7, 8, 49,...}
                Write code to output the nth sevenish number in the above sequence
       Input: 4
       Output: 50 (as (7^0)+(7^2) = 50 and is the fifth number in the sequence)
     */
    public static int FindNthSevenishNumber(int n) {
        /*This code will build the array up until the nth number*/
        int[] arr = new int[n+1];
        arr[0] = 1;

        if( n == 0) {
            return arr[n];
        }

        arr[1] = 7;
        int p = 1; //Index of the number that will generate next number in the sequence
        int i = 0;

        for(int current = 2; current <= n; current++) {
            /*Add all the numbers below p to the number at p to generate new numbers*/
            if(i < p) {
                arr[current] = arr[p] + arr[i];
                i++;
            }
            /*All the numbers below p are used; we need a new p to continue the sequence*/
            else {
                arr[current] = arr[p] * 7;
                p = current;
                i = 0;
            }
        }

        return arr[n];


    }
}
