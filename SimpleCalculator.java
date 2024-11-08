import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Simple Calculator");
        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
                validOperation = false;
        }

        // Display the result
        if (validOperation) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
