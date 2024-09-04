public class Main {
  /**
   * @param args
   */
  public static void main(String[] args) {
    String str = "agile";
    int[] x = {1, 2, 3, 4, 5};
    char y[] = new char[5];
    int i = 0;

    while (i < str.length()) {
      y[i] = str.charAt(i);
      i++;
    }
    /// unit test for the following code snippet
    for (int p : x) {
      i--;
      System.out.println(y[i]);
      System.out.print(p + " ");
    }
  }
}
e 1
l 2
i 3
g 4
a 5
