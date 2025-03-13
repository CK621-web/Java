package lesson6;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean Is_prime = true;

        for (int i = 2; i * i <= number; i++) {
            System.out.println(i);
            if (number % i == 0) {
                Is_prime = false;
                break;
            }

        }
        if (Is_prime) {
            System.out.println("Prime");
        } else {
            System.out.println("not prime");
        }
        sc.close();
    }

}
