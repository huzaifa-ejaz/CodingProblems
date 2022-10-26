package stack_min;

public class StackMinTester {
    public static void main(String[] args) {
        StackMin stackMin = new StackMin(6);
        stackMin.push(6);
        System.out.println(stackMin.getMin()); //=>6
        System.out.println(stackMin.pop()); //=>6
        stackMin.push(8);
        stackMin.push(5);
        stackMin.push(9);
        System.out.println(stackMin.getMin()); //=>5
        stackMin.push(4);
        stackMin.push(2);
        System.out.println(stackMin.pop()); //=>2
        System.out.println(stackMin.getMin()); //=>4
    }


}
