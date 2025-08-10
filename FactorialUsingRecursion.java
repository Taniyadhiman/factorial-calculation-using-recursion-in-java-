import java.util.Scanner;

public class FactorialUsingRecursion {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Input validation
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int fact = factorial(number);
            System.out.println("Factorial of " + number + " is: " + fact);
        }

        scanner.close();
    }
}
