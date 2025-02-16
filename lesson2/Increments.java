package lesson2;

public class Increments {

    public static void main(String[] args) {
        int a = 1;
        System.out.println(++a);

        int b = 2;
        System.out.println(b++);

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a % b);
        System.out.println(a / b);
        System.out.println(a - b);

        System.out.println(a % 2 == 0 ? "even" : "odd");
    }

}