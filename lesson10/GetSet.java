package lesson10;

public class GetSet {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Messi");
        System.out.println(s.getName());
    }

}

class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}