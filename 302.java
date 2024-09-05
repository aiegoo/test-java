class classA {
  ClassA() {
    System.out.print('A');
    this.prn();
  }
  void prn() {
    System.out.print('B');
  }
}
class ClassB extends ClassA {
  ClassB() {
    super();
    System.out.print('D');

  }void prn() {
    System.out.print('E');
  }void prn(int x) {
    System.out.print(x);
  }
}

// A
