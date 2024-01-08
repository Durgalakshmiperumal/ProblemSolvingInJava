import java.util.Scanner;
public class PrintThePatten2 {
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
      
            for (int space = 1; space <= N - i; space++) {
                System.out.print("  ");
            }
        
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

}
}