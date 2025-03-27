package lesson9;

class Parent {
    public void greet() {
        System.out.println("Hello from parents");
    }
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Hello from child");
    }
}

public class OverrideExample {

    public static void main(String[] args) {
        Child c = new Child();
        c.greet();

        Parent p = new Parent();
        p.greet();

        Parent t = new Child();
        t.greet();
    }

}
