package lesson10.AccessModifier;

public class Parent {
    private int privateVar = 10; // only accessible within this class
    int defaultVar = 20; // accessible within the same package
    protected int protectedVar = 30; // accessible within sam package and sub class
    public int publicVar = 40;// accessible from anywhere

    public void showValues() {
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}
