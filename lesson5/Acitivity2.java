
package lesson5;

import java.util.Scanner;

public class Acitivity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth-number:");
        int nth_number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= nth_number; i++) {
            sum += i;

        }
        System.out.println("sum: " + sum);
        sc.close();
    }
}
