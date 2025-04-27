package lesson15;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("Mickey", 5);
    Dog dog = new Dog("Rex", 3, "Golden Retreiver");
    Cat cat = new Cat("Whiskers", 2, true);

    animal.makeSound();
    System.out.println(animal.getName() + " is " + animal.getAge() + " years old");

    dog.makeSound();
    System.out.println(dog.getName() + " is a " + dog.getBreed() + " and is " + dog.getAge() + " years old");

    cat.makeSound();
    System.out.println(
        cat.getName() + " is " + cat.getAge() + " years old and is " + (cat.getIsIndoor() ? "indoor" : "outdoor"));

  }

}
