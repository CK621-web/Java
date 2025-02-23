package lesson3;

import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 4) {
            System.out.println("The number is Square of 2");
        } else {
            System.out.println("The number is not a sqaure of 2");
        }
        sc.close();
    }

}
