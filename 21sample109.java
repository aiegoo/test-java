public class Test {
    public static int a = 5;  // Step 1: Declare and initialize a static variable 'a' with the value 5.
    
    public static void main(String[] args) {
        int b = 2;  // Step 2: Declare and initialize the local variable 'b' with the value 2.
        
        cal(b);  // Step 3: Call the static method 'cal' with 'b' as an argument (b = 2).
        cal(b);  // Step 4: Call the static method 'cal' again with 'b' as an argument (b = 2).
        
        System.out.printf("%d, %d\n", a, b);  // Step 5: Print the values of 'a' and 'b'.
    }
    
    static void cal(int b) {
        if (b < a)  // Step 6: If the value of 'b' is less than 'a', subtract 3 from 'a'.
            a -= 3;
        else  // Otherwise, add 3 to 'b' (this case will never execute here).
            b += 3;
    }
}

/*

### Step-by-step explanation with variable changes:

1. **Initial State:**
   - `public static int a = 5;` → The static variable `a` is initialized with the value 5.
   - In the `main` method, `int b = 2;` → The local variable `b` is initialized with the value 2.

2. **First Call to `cal(b)` (b = 2):**
   - Inside the `cal` method, the condition `if (b < a)` checks if `b` (2) is less than `a` (5). Since this is true:
     - `a -= 3;` → The value of `a` is decreased by 3.
     - So, `a = 5 - 3 = 2`.
   - `b` remains unchanged because it's a local variable and is not updated inside the method.

3. **Second Call to `cal(b)` (b = 2):**
   - The condition `if (b < a)` checks if `b` (2) is less than `a` (2). This time, the condition is false because `b` is equal to `a`.
     - The else block `b += 3;` would execute, but since `b` is passed by value and not by reference, this change won't affect the original `b` in the `main` method.
     - Therefore, `a` remains unchanged (still 2), and the `b` in the `main` method remains 2 as well.

4. **Final Print:**
   - The values of `a` and `b` are printed using `System.out.printf("%d, %d\n", a, b);`.
     - `a = 2` (after the first call to `cal`).
     - `b = 2` (unchanged throughout both method calls).

### Final Output:
The program prints:
```
2, 2
```

### Important Notes:
- The method `cal` only modifies the static variable `a` because static variables retain their values across method calls.
- The local variable `b` is passed by value to the method `cal`, so any changes to `b` inside the method do not affect the value of `b` in the `main` method.
*/