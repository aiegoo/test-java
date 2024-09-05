public class Test {  // Define a public class named Test
  public static void main(String[] args) {  // Define the main method, the entry point of the program
    String str1 = "Programming";  // Create a string literal "Programming" and assign it to str1
    String str2 = "Programming";  // Create another string literal "Programming" and assign it to str2
    String str3 = new String("Programming");  // Create a new String object with the value "Programming" and assign it to str3

    // Compare the references of str1 and str2 using '=='
    System.out.println(str1 == str2);  // true: str1 and str2 point to the same reference in the string pool

    // Compare the references of str1 and str3 using '=='
    System.out.println(str1 == str3);  // false: str1 and str3 point to different references (str3 is in heap memory)

    // Compare the content of str1 and str3 using equals() method
    System.out.println(str1.equals(str3));  // true: str1 and str3 have the same content

    // Compare the content of str1 and str3 using equals() method again
    System.out.println(str1.equals(str3));  // true: str1 and str3 have the same content
  }
}

// Output:
// true
// false
// true
// true

// Explanation:
// 1. str1 and str2 are string literals. When a string literal is created, the JVM checks the string constant pool first.
//    If the string is already available in the pool, the JVM returns the reference to that string. Hence, str1 and str2
//    point to the same reference in the pool, making str1 == str2 return true.
// 2. str3 is created using the new keyword, so it is stored in the heap memory. Therefore, str1 and str3 point to different
//    references, making str1 == str3 return false.
// 3. The equals() method compares the content of the strings. Since str1 and str3 have the same content, str1.equals(str3)
//    returns true.


// public class Test {
//   public static void main(String[] args) {
//     String str1 = "Programming";
//     String str2 = "Programming";
//     String str3 = new String("Programming");
//     System.out.println(str1 == str2);
//     System.out.println(str1 == str3);
//     System.out.println(str1.equals(str3));
//     System.out.println(str1.equals(str3));
//   }
// }

//output
// true
// false
// true
// true
// Explanation: In the above code, str1 and str2 are string literals. When we create a string literal, the JVM checks the string constant pool first. If the string is already available in the pool, the JVM returns the reference to that string. So, str1 and str2 point to the same reference in the pool. Hence, str1 == str2 returns true. str3 is created using the new keyword, so it is stored in the heap memory. Hence, str1 == str3 returns false. However, str1.equals(str3) returns true because the equals() method compares the content of the strings.
