class Static {
  public int a = 20;
  public int b = 0;
}
public class Test {
  public static void main(String[] args) {
    int a = 10;
    Static st = new Static();
    st.b = a;

    System.out.println(st.b++); // Prints 10, then increments st.b to 11
    System.out.println(st.b);   // Prints 11
    System.out.println(a);      // Prints 10
    System.out.println(st.a);   // Prints 20 This prints the value of st.a, which is 20 (initialized in the Static class).
  }

}

// output
// 10
// 11
// 10
// 20
