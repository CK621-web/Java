package lesson8;

class Mammal {
    public void m() {
        System.out.println("Inside Mammal class");
    }

}

class Lion extends Mammal {
    public void roar() {
        System.out.println("Inside Lion class");
    }

}

class Human extends Mammal {
    public void hum() {
        System.out.println("Inside Human class");
    }

}

public class MammalMain {
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.m();
        obj.roar();
        Human obj2 = new Human();
        obj2.m();
        obj2.hum();
    }

}
