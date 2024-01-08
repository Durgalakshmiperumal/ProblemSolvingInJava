import java.util.Scanner;

public class CheckPrimeOrNot {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean isPrime = number > 1;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? number + " is a prime number." : number + " is not a prime number.");

        scanner.close();
    }
}
