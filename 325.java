class Parent {
    void show() {
      System.out.printIn("Parent");
    }
    }
    class Child extends Parent {
      void show() {
        System.out.printIn("Child");
      }
    }
public class Test {
    public static void main(String[] args) {
        Parent pa = new Child();
        pa.show();
    }
}
