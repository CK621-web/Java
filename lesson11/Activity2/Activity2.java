package lesson11.Activity2;

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat meows!");
    }
}

public class Activity2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        Cat c = new Cat();
        c.makeSound();

    }

}
