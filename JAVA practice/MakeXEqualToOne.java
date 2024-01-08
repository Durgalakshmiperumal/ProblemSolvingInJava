import java.util.Scanner;

public class MakeXEqualToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int T = scanner.nextInt();
        scanner.nextLine(); 

        for (int t = 0; t < T; t++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            while (a % b == 0) {
                a /= b;
            }

            scanner.close();
            if (a == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

           
        }
    }
}
