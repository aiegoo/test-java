class Static {
  public int a = 20;
  public int b = 0;
}
public class Test {
  public static void main(String[] args) {
    int a = 10;
    Static.b = a;
    Static st = new Static();
    System.out.println(Static.b++);
    System.out.println(st.b);
    System.out.println(a);
    System.out.println(st.a);
  }

}

// output
// 10
// 11
// 10
// 20
