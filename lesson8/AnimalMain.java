package lesson8;

class Animal {
    void eat() {
        System.out.println("Eating...Animal class... eat method...");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Roaring...Lion class... roar method...");
    }
}

class BabyLion extends Lion {
    void weep() {
        System.out.println("Weeping...babyLion class... weep method...");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        BabyLion s = new BabyLion();

        s.eat();
        s.roar();
        s.weep();
    }

}
