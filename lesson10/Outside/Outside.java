package lesson10.Outside;

import lesson10.AccessModifier.Parent;

public class Outside {
    public static void main(String[] args) {
        Parent p = new Parent();
        // System.out.println("Private Variable: " + p.privateVar);
        // System.out.println("Default Variable: " + p.defaultVar);
        // System.out.println("Protected Variable: " + p.protectedVar);
        System.out.println("Public Variable: " + p.publicVar);

    }

}
