package lesson7;

class Employee {
    String name;
    int id;
    float salary;
    String post;

    public Employee(String name, int id, float salary, String post) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.post = post;

    }

    public void display() {
        System.out.println(name + " | " + id + " | " + salary + " | " + post);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee messi = new Employee("Messi", 10, 1000000000f, "Right-Winger");
        Employee ronaldo = new Employee("Ronaldo", 7, 1000000000f, "Left-Winger");

        messi.display();
        ronaldo.display();

    }
}
