package lesson6;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lowest number: ");
        int low = sc.nextInt();
        System.out.println("Enter the highest numbers:");
        int high = sc.nextInt();
        System.out.println("the prime number: ");
        while (low <= high) {
            boolean Is_prime = true;
            for (int i = 2; i * i <= low; i++) {
                if (low % i == 0) {
                    Is_prime = false;
                    break;
                }
            }
            if (Is_prime) {
                System.out.println(low);
            }
            low++;
        }

    }

}
