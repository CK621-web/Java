package lesson2;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("State the number of days in the year: ");
        int daysInYear = sc.nextInt();
        System.out.println(daysInYear % 2 == 0 ? "leap year" : "not a Leap year");

        sc.close();

    }

}
