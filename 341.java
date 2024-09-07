class P {  // Define a class named P
  public int calc(int n) {  // Define a public method calc that takes an integer n and returns an integer
    if (n <= 1) return n;  // Base case: if n is 0 or 1, return n
    return calc(n - 1) + calc(n - 2);  // Recursive case: return the sum of calc(n-1) and calc(n-2)
  }
}

class C extends P {  // Define a class named C that extends class P
  public int calc(int n) {  // Override the calc method in class P  7
    if (n <= 1) return n;  // Base case: if n is 0 or 1, return n
    return calc(n - 1) + calc(n - 3);  // Recursive case: return the sum of calc(n-1) and calc(n-3) 6 + 4
}
}
public class Test {  // Define a public class named Test
  public static void main(String[] args) {  // Define the main method, the entry point of the program
    P obj = new C();  // Create an instance of class C and assign it to a reference of type P
    System.out.print(obj.calc(7));  // Call the calc method on obj with argument 7 and print the result
  }
}

// Output: https://youtu.be/CBrWFgcTkao?si=mtGPuojXpAVpfKnz&t=273
// 2
// Calculation Steps for obj.calc(7) in Class C:
// calc(7) = calc(6) + calc(4)
// calc(6) = calc(5) + calc(3)
// calc(5) = calc(4) + calc(2)
// calc(4) = calc(3) + calc(1)
// calc(3) = calc(2) + calc(0)
// calc(2) = calc(1) + calc(-1) (returns 1 since calc(-1) is not defined)
// calc(0) = 0
// calc(1) = 1
// calc(1) = 1
// calc(2) = calc(1) + calc(-1) (returns 1 since calc(-1) is not defined)
// calc(3) = calc(2) + calc(0)
// calc(2) = calc(1) + calc(-1) (returns 1 since calc(-1) is not defined)
// calc(0) = 0
// calc(4) = calc(3) + calc(1)
// calc(3) = calc(2) + calc(0)
// calc(2) = calc(1) + calc(-1) (returns 1 since calc(-1) is not defined)
// calc(0) = 0
// calc(1) = 1

//                Steps for obj.calc(7) in class C:
//                calc(7) = calc(6) + calc(4)
//                  calc(6) = calc(5) + calc(3)
//                    calc(5) = calc(4) + calc(2)
//                      calc(4) = calc(3) + calc(1)
//                        calc(3) = calc(2) + calc(0)
//                          calc(2) = calc(1) + calc(-1) = 1 (since calc(-1) and calc(0) return base values)
//                              calc(0) = 0
//                            Therefore, calc(3) = 1 + 0 = 1
//                          Therefore, calc(4) = 1 + 1 = 2
//                        calc(2) = 1 + 0 = 1
//                      Therefore, calc(5) = 2 + 1 = 3
//                    calc(3) = 1 (already computed)
//                Therefore, calc(6) = 3 + 1 = 4
//                            calc(4) = 2 (already computed)
//                Therefore, calc(7) = 4 + 2 = 6
//                Output:
//                The result of obj.calc(7) is 6.
// class P {
//   public int calc (int n) {
//     if (n <= 1) return n;
//     return calc (n - 1) + calc (n - 2);
//   }
// }
// class C extends P {
//   public int calc (int n) {
//     if (n <= 1) return n;
//     return calc (n - 1) + calc (n - 3);
//   }
// }
//
// public class Test {
//   public static void main(String[] args) {
//     P obj = new C();
//     System.out.print(obj.calc(7));
//   }
// }

//output
// 13
