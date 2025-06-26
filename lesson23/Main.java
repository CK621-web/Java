package lesson23;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();

        groceries.add("rice");
        groceries.add("eggs");
        groceries.add("bread");

        System.out.println(groceries);
        groceries.add(1, "butter");
        System.out.println(groceries);
        groceries.addAll(Arrays.asList("milk", "juice"));
        System.out.println(groceries);

        groceries.addAll(2, Arrays.asList("lettuce", "soda"));
        System.out.println(groceries);

        System.out.println("index at 3: " + groceries.get(3));
        groceries.set(4, "Alond Milk");
        System.out.println(groceries);

        groceries.remove(3);
        groceries.remove("butter");
        System.out.println(groceries);

        System.out.println("Groceries size: " + groceries.size());
        System.out.println("Contains rice? " + groceries.contains("rice"));

        System.out.println("Is the groceries empty? " + groceries.isEmpty());

        System.out.println("All the elements: ");
        for (String g : groceries) {
            System.out.println(g);
        }
        System.out.println("Index of lettuce: " + groceries.indexOf("lettuce"));

        String[] a = groceries.toArray(new String[0]);
        System.out.println("Converted Array: " + Arrays.toString(a));

        System.out.println("sublist from 1 to 4: " + groceries.subList(1, 4));

        groceries.clear();
        System.out.println(groceries);
    }
}
