import java.util.Scanner;

public class PrintReverse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();


        for (int i = 1; i <= N; i++) {

            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }
   
            for (int j = i; j <= N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

  
        scanner.close();
    }
}
