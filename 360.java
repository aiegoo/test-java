public class Test {
  public static void main(String[] args) {
    int E[] = {1, 2, 3, 4, 5, 6};
    int i = 0;
    int Temp = 0;

    do
    {
      int j = i;
      do
      {
        if (E[j] > E[j + 1])
        {
          Temp = E[j];
          E[j] = E[j + 1];
          E[j + 1] = Temp;
        }
        j++;
      }
      while (j < 5);
      i++;
    }
    while (i < 4);
    for (int a = 0; a < 5; a++)
    {
      System.out.print(E[a] + "\t");
  }
    }
  }


  //output
  // 1	2	3	4	5

    public class Test { // Define a public class named Test
    public static void main(String[] args) { // Main method, entry point of the program
      int E[] = {1, 2, 3, 4, 5, 6}; // Initialize an array of integers with 6 elements
      int i = 0; // Declare and initialize a loop counter variable i
      int Temp = 0; // Declare and initialize a temporary variable Temp for swapping

      do { // Outer do-while loop
        int j = i; // Initialize j with the value of i
        do { // Inner do-while loop
          if (E[j] > E[j + 1]) { // If the current element is greater than the next element
            Temp = E[j]; // Swap the elements
            E[j] = E[j + 1];
            E[j + 1] = Temp;
          }
          j++; // Increment j
        } while (j < 5); // Continue the inner loop until j is less than 5
        i++; // Increment i
      } while (i < 4); // Continue the outer loop until i is less than 4

      for (int a = 0; a < 5; a++) { // Loop to print the first 5 elements of the array
        System.out.print(E[a] + "\t"); // Print each element followed by a tab
      }
    }
  }


  // This code defines a class Test with a main method that performs a sorting operation on an array E using nested do-while loops and then prints the first 5 elements of the sorted array.

  