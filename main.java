public class Main {
  public static void main(String[] args) {
    // Logic operations
    boolean isTrue = true;
    boolean isFalse = false;
    boolean result = isTrue && isFalse; // Logical AND
    System.out.println("Logical AND: " + result);

    result = isTrue || isFalse; // Logical OR
    System.out.println("Logical OR: " + result);

    result = !isTrue; // Logical NOT
    System.out.println("Logical NOT: " + result);

    // Arithmetic operations
    int num1 = 10;
    int num2 = 5;

    int sum = num1 + num2; // Addition
    System.out.println("Sum: " + sum);

    int difference = num1 - num2; // Subtraction
    System.out.println("Difference: " + difference);

    int product = num1 * num2; // Multiplication
    System.out.println("Product: " + product);

    int quotient = num1 / num2; // Division
    System.out.println("Quotient: " + quotient);

    int remainder = num1 % num2; // Modulus
    System.out.println("Remainder: " + remainder);
    int w = 3, x = 4, y = 3, z = 5;
    if ((w == 2 | w == y) & !(y > z) & (1 == x ^ y !=z)) {
w = x + y;
if (7 == x ^ y != w)
      System.out.println(w);
    } else {
      System.out.println(x);
    }
    else {
      w = x + y;
      if (7 == y ^ z != w) {
        System.out.println(w);
      } else {
        System.out.println(z);
    }
  }
}
