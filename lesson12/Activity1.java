package lesson12;

interface MyInterface {
    public void method1();

    public void method2();
}

public class Activity1 implements MyInterface {
    public void method1() {
        System.out.println("Method 1 implemented");

    }

    public void method2() {
        System.out.println("Method 2 implemented");

    }

    public static void main(String[] args) {
        MyInterface i = new Activity1();
        i.method1();
        i.method2();
    }

}