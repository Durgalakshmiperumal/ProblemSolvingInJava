import java.util.Scanner;

public class FindDatype{
    public static String identifyDataType(String input) {
        if (input.matches("\\d+")) { // Check only digits (integer)
            return "int";
        } else if (input.matches("\\d+\\.\\d+")) { // Check decimal numbers (double)
            return "double";
        } else {
            return "string"; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        String dataType = identifyDataType(userInput);
        System.out.println(dataType);

        scanner.close();
    }
}

