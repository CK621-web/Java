package lesson13;

class Book {

    /** The title of the book */

    private String title;

    /** The price of the book */

    private double price;

    /** Creates a new Book with given title and price */

    public Book(String bookTitle, double bookPrice) {

        /* implementation not shown */
        title = bookTitle;
        price = bookPrice;

    }

    /** Returns the title of the book */

    public String getTitle() {

        return title;

    }

    /** Returns a string containing the title and price of the Book */

    public String getBookInfo() {

        return title + "-" + price;

    }

}

class Textbook extends Book {
    int edition;

    public Textbook(int edition, String title, double price) {
        super(title, price);
        this.edition = edition;
    }

    public String getBookInfo() {
        return super.getBookInfo() + " Edition: " + edition;

    }

    public int getEdition() {
        return edition;

    }

    public boolean canSubstituteFor(String Title, int edition) {
        if (this.edition >= edition && this.getTitle().equals(Title)) {
            return true;
        } else {
            return false;
        }
    }

}

public class Activity2 {
    public static void main(String[] args) {
        Textbook t = new Textbook(1, "Java 101", 25.00);
        System.out.println(t.getBookInfo());
        System.out.println(t.canSubstituteFor(t.getTitle(), t.getEdition()));

    }
}