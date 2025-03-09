package lesson5;

public class Activity1 {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("For Loop\n");
        for (int i = n; i > 0; i--) {
            System.out.println(i);

        }
        System.out.println("\nWhile Loop\n");
        int j = 1;

        while (j <= n) {
            System.out.println(j);
            j++;

        }
    }

}
