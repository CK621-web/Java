package lesson9;

class Student {
    int id;
    String name;
    float Stipend;

    public Student() {

    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, float Stipend) {
        this.id = id;
        this.name = name;
        this.Stipend = Stipend;
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + Stipend);
    }
}

public class OverloadingExample {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();

        Student student2 = new Student(102, "Alex");
        student2.display();

        Student student3 = new Student(107, "Bob", 7000f);
        student3.display();

    }

}
