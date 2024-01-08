import java.util.Scanner;

public class OddSum {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        System.out.println(sum);

        scanner.close();
    }
}
