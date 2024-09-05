class A {
  int a;
  int b;
}

public class Test {
  static void func1(A m) {
    m.a *= 10;
  }

  static void func2(A m) {
    m.a += m.b;
  }

  public static void main(String[] args) {
    A m = new A();
    m.a = 100;
    func1(m);
    m.b = m.a;
    func2(m);
    System.out.printf("%d %d\n", m.a, m.b);
  }
}
// Output: 2000 1000
// Compare this snippet from test-java/MyClass.java:
// public class MyClass {

