
package lesson4;

import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a rating(1-5): ");
        int rating = sc.nextInt();

        switch (rating) {

            case 1:
                System.out.println("Bad Movie, Dont watch");
                break;
            case 2:
                System.out.println("Bad Movie, what if u want");
                break;
            case 3:
                System.out.println("Mid Movie");
                break;
            case 4:
                System.out.println("good movie");
                break;
            case 5:
                System.out.println("Great Movie, definetly watch");
                break;

            default:
                System.out.println("invalid input.Enter a rating between(1-5)");

        }

        sc.close();

    }

}
