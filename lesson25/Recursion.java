package lesson25;

import java.util.Scanner;

public class Recursion {
    public void decreasingNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        decreasingNumber(n - 1);
    }

    public static void main(String[] arhs) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Recursion r = new Recursion();
        r.decreasingNumber(num);

        sc.close();
    }

}
