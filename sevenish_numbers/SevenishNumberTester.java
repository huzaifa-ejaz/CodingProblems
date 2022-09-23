package sevenish_numbers;

public class SevenishNumberTester {
    public static void main(String[] args) {
        //Print first ten sevenish numbers
        for(int i = 0; i < 10; i++) {
            System.out.print(SevenishNumberFinder.FindNthSevenishNumber(i)+",");
        }
        //Prints: 1,7,8,49,50,56,57,343,344,350,
    }
}
