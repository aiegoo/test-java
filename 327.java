public class Test {
  static int[] arr() {
    int a[] = new int[4];
    int b = a.length;
    for(int i = 0; i < b; i++)
      a[i] = i;
    return a;
  }
  public static void main(String[] args) {
    int[] a[] = arr();
    for(int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
  }
}

// output
// 0 1 2 3

public class Test {
  public static void main(String[] args) {
    System.out.print(Test.check(1));
  }
  static String check(int num) {
    if(num == 1)
      return "one";
    else if(num == 2)
      return "two";
    else
      return "none";
  }
}
