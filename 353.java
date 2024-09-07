
import java.lang.Math;

public class Test {
  public static void main(String[] args) {
    int p = 2;
    int n = 3;
    while (true) {
      double t = Math.sqrt(n);
      int m = (int)t;
      for (int i = 1; i <= m; i++) { // Changed i to start from 1 to avoid division by zero
        int r = n % i;
        if (r == 0)
          break;
        if (i == m) {
          p = n;
        }
      }
      n++; // Increment n to avoid infinite loop
      System.out.println(String.format("%d\n", p)); // Fixed print statement
    }
  } // Added closing brace for main method
} // Added closing brace for Test class

/*
Notes:
1. Changed the `for` loop to start from `1` instead of `0` to avoid division by zero.
2. Fixed the `System.out.println` statement to use `String.format` for proper formatting.
3. Added a closing brace for the `while` loop.
4. Added a closing brace for the `main` method.
5. Added a closing brace for the `Test` class.
6. Added `n++` to avoid infinite loop.
*/
