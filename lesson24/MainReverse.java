package lesson24;

import java.util.ArrayList;
import java.util.Scanner;

public class MainReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("enter the size of the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the number to be added: ");
        for (int i = 0; i < n; i++) {

            list.add(sc.nextInt());
        }

        System.out.println(list);

        ArrayList<Integer> reverseList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        System.out.println("Reversed List: " + reverseList);
    }
}
