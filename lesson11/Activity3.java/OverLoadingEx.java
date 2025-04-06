package lesson11.Activity3;

public class OverLoadingEx {
    public static int add(int a) {
        return a + 0;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 40;
        System.out.println(add(num1));

        int num2 = 36;
        System.out.println(add(num1, num2));

    }
}