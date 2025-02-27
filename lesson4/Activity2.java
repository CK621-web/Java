package lesson4;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Is it sunny today? (true/false) ");
        boolean sunny = sc.nextBoolean();

        System.out.println("Is it hot today? (true/false) ");
        boolean hot = sc.nextBoolean();

        System.out.println("What is the temperature outside today in degrees Celcius? ");
        int temperature = sc.nextInt();
        if (sunny) {
            if (hot) {
                System.out.println("Its sunny and hot. Wear a hat and short sleeves");
            } else if (temperature < 20) {
                System.out.println("Its sunny but cold. Wear a jacket");
            } else {
                System.out.println("Its sunny but not hot. Wear a light jacket");
            }

        } else {
            if (temperature < 10) {
                System.out.println("Its cold and not sunny. Wear a heavy jacket and carry a raincoat just in case");
            } else {
                System.out.println("Its not sunny. carry a raincoat");
            }

        }
        System.out.println("Drink water and stay hydrated");
        sc.close();
    }

}
