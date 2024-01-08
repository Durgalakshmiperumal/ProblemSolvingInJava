import java.util.Scanner;

public class FindOddOrEven {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        String result = (num % 2 == 0) ? "EVEN" : "ODD";
        System.out.println("" + result);

        scanner.close();
    }
}
    