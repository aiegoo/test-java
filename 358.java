public class Test {
  public static void main(String[] args) {
    int[][] a = new int[3][4];
    for (int i = 0; i < 3; i++) {
      for (int j = 3; j >= 0; j--) {
        a[i][j] = i + j;
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}


//output
// 3 2 1 0
// 4 3 2 1
// 5 4 3 2
