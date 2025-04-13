package lesson13;

public class Activity1 {
    public static void main(String[] args) {
        Student s = new Student("John", "CS", 18);
        System.out.println("Name: " + s.name + ", Age: " + s.age);
        System.out.println(s.getMajor());

    }
}

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class Student extends Person {

    String major;

    public Student(String name, String major, int age) {
        super(name, age);
        this.major = major;

    }

    public String getMajor() {
        return major;
    }

}