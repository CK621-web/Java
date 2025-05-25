package lesson18;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("B001", "1984", LocalDate.of(1949, 6, 8), "George Orwell", 328);
        DVD dvd = new DVD("D001", "Inception", LocalDate.of(2010, 7, 16), "Christopher Nolan", 148);
        CD cd = new CD("C001", "Thriller", LocalDate.of(1982, 11, 30), "Michael Jackson", 9);

        Patron alice = new Patron("Alice", 1234);
        alice.checkOutItem(book);
        alice.checkOutItem(dvd);
        System.out.println("Alice's items after return: " + alice.getNumItemsCheckedOut());

        alice.returnItem(dvd);
        System.out.println("Alice's items after return: " + alice.getNumItemsCheckedOut());
    }
}