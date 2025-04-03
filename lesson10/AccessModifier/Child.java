package lesson10.AccessModifier;

public class Child extends Parent {
    public void display() {
        // System.out.println("Private Variable: " + privateVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }

}
