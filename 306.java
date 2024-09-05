abstract class Animal {
    abstract void makeSound();
    String a = " is an animal.";
    void show() {
        System.out.println("This" + a);
    }
}

class Chicken extends Animal {
    Chicken() {
        look();
    }

    @Override
    void look() {
        System.out.println("This" + a);
    }

    @Override
    void makeSound() {
        System.out.println("Cluck cluck");
    }

    void display() {
        System.out.println("Chicken is a bird.");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Chicken();
        a.show();
    }
}
// output
// This is an animal.
// This is an animal.
// This is an animal.
