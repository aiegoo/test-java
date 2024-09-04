public class MainClass {

  public static void main(String[] args) {
    int r = 0;
for (int i = 1; i < 999; i++) {
  // Check if i is divisible by both 3 and 2
  if (i % 3 == 0 && i % 2 == 0) {
    // Add i to r if the condition is true
    r = i;
  }
}
System.out.println(r);
  }
}
