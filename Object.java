class ClassA {
    int a = 10; // Define variable 'a'

    // Method to add two numbers and 'a'
    int funcAdd(int x, int y) {
        System.out.println("Adding " + x + " + " + y + " + " + a);
        return x + y + a;
    }
}

public class Test {
    public static void main(String[] args) {
        int x = 3, y = 6, r;
        ClassA obj = new ClassA();
        r = obj.funcAdd(x, y);
        System.out.print(r);
    }
}

// Output: Adding 3 + 6 + 10
// 19
