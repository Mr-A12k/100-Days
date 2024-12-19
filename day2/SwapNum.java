package day2;

public class SwapNum {

    public static void main(String args[]) {
        int a = 10;
        int b = 5;

        System.out.println("---Before swap---");
        System.out.println("value of a is: " + a);
        System.out.println("value of b is: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("---After swap---");

        System.out.println("value of a is: " + a);
        System.out.println("value of b is: " + b);
    }

}
