class Connection {  // Define a class named Connection
  private static Connection _inst;  // Declare a private static variable to hold the singleton instance
  private int count = 0;  // Declare a private instance variable to keep track of the count

  public static Connection get() {  // Define a static method to get the singleton instance
    if (_inst == null) {  // Check if the instance is null
      _inst = new Connection();  // If null, create a new instance of Connection
      return _inst;  // Return the newly created instance
    }
    return _inst;  // If not null, return the existing instance
  }

  public void count() {  // Define a method to increment the count
    count++;  // Increment the count by 1
  }

  public int getCount() {  // Define a method to get the current count
    return count;  // Return the current value of count
  }
}

public class Test {  // Define a public class named Test
  public static void main(String[] args) {  // Define the main method, the entry point of the program
    Connection conn1 = Connection.get();  // Get the singleton instance and assign it to conn1
    conn1.count();  // Increment the count (count becomes 1)
    Connection conn2 = Connection.get();  // Get the singleton instance and assign it to conn2 (same instance as conn1)
    conn2.count();  // Increment the count (count becomes 2)
    Connection conn3 = Connection.get();  // Get the singleton instance and assign it to conn3 (same instance as conn1 and conn2)
    conn3.count();  // Increment the count (count becomes 3)
    conn1.count();  // Increment the count (count becomes 4)
    System.out.println(conn1.getCount());  // Print the current count (4)
    System.out.print(conn1.getCount());  // Print the current count again (4)
  }
}

// he Connection class implements the Singleton pattern, ensuring only one instance is created.
// The count variable is incremented four times through different references (conn1, conn2, conn3), but they all point to the same instance.
// The final value of count is 4, which is printed twice.

// Output:
// 4
// 4

// class Connection {
//   private static Connection _inst = null;
//   private int count = 0;
//   public static Connection get() {
//     if(_inst == null) {
//       _inst = new Connection();
//       return _inst;
//     }
//     return _inst;
//   }
//   public void count() { count++; }
//   public void getCount() { return count; }
// }
// public class Test {
//   public static void main(String[] args) {
//     Connection conn1 = Connection.get();
//     conn1.count();
//     Connection conn2 = Connection.get();
//     conn2.count();
//     Connection conn3 = Connection.get();
//     conn3.count();
//     conn1.count();
//     System.out.println(c.getCount());
//     System.out.print(conn1.getCount());
//
//   }
// }

// output
// 4
