abstract class Animal {
    abstract void makeSound();
    String a = " is an animal.";
    void show() {
        System.out.println("Zoo");
    }
}

class Chicken extends Animal {
    Chicken() {
        look();
    }

    @Override
    void look() {
        System.out.println("Chicken" + a);
    }

    @Override
    void makeSound() {
        System.out.println("Cluck cluck");
    }

    void display() {
        System.out.println("Chicken is a bird.");
    }

    @Override
    void show() {
        System.out.println("Chicken" + a);
        System.out.println("Zoo");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Chicken();
        a.show();
    }
}
// output
// Chicken is an animal.
// Zoo
