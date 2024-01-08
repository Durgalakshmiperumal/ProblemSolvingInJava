/**
 * bankWithInterfaces
 */
import java.util.Scanner;
public class bankWithInterfaces {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();

    
        char operator = input.next().charAt(0);

        int num2 = input.nextInt();
////
        int result = calculate(num1, operator, num2); 
        if (result != Integer.MIN_VALUE) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid operator! Please enter a valid operator (+, -, *, /).");
        }
    }

    public static int calculate(int num1, char operator, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return Integer.MIN_VALUE; 
        }
    }
}