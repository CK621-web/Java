package lesson18;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private int id;
    private List<Item> checkedOutItems;

    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
        this.checkedOutItems = new ArrayList<>();
    }

    public void checkOutItem(Item item) {
        if (checkedOutItems.size() < 10) {
            checkedOutItems.add(item);
        }
    }

    public void returnItem(Item item) {
        checkedOutItems.remove(item);
    }

    public int getNumItemsCheckedOut() {
        return checkedOutItems.size();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Item> getCheckedOutItems() {
        return checkedOutItems;
    }
}
