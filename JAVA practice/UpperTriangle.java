import java.util.Scanner;

public class UpperTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int[][] array = new int[num1][num1];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
                array[i][j] = sc.nextInt();
            }
        }
             
        int c = 0;
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i][j] != 0) {
                    c++;
                    break;
                }
            }
        }

        if (c > 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

