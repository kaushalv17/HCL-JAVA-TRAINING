
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter integers only!");

        } finally {
            System.out.println("Program execution completed.");
            sc.close();
        }

        System.out.println("Program continues after exception handling.");
    }
}
