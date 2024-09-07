public class Test {
  public static void main(String[] args) {
    int ary[] = new int[][];
    int n = 1;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        ary[i][j] = j * 3 + i + 1;
        System.out.print(ary[i][j] + " ");
      }
      System.out.println();
    }

    }
}

// output

// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15

// asnwer to the
//                        public class Test {
//                          public static void main(String[] args) {
//                            // Initialize the 2D array with 3 rows and 5 columns
//      --- > answer             int ary[][] = new int[3][5];
//                            int n = 1;
//
//                            for (int i = 0; i < 3; i++) {
//                              for (int j = 0; j < 5; j++) {
//                                ary[i][j] = j * 3 + i + 1;
//                                System.out.print(ary[i][j] + " ");
//                              }
//                              System.out.println();
//                            }
//                          }
//                        }
//
