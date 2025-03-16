package lesson7;

public class StaticCounter {

    static int number = 10;

    static void increment() {
        number += 4;
    }

    public static void main(String[] args) {
        System.out.println(number);
        increment();
        System.out.println(number);
    }

}