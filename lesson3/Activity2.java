package lesson3;

public class Activity2 {
    public static void main(String[] args) {
        int a = 10;
        if (a >= 0) {
            System.out.println(a + " is positive");
            if (a % 2 == 0) {
                System.out.println(" And is even");
            } else
                System.out.println(" And is odd");
        } else
            System.out.println(a + " is negative");
    }

}
