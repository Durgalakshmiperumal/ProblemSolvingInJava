import java.util.Scanner;
public class MagicSquare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         int sumOfRows = 0;
         int sumOfOneRow = 0;

         int sumOfColmn = 0;
         int sumOfOneColmn = 0;
        int num1 = sc.nextInt();
        int[][] array = new int[num1][num1];

        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num1; j++){
                array[i][j] = sc.nextInt();

                
            }

        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
                sumOfOneRow += array[i][j];
            }
            sumOfRows = sumOfOneRow;
            sumOfOneRow = 0;
            System.out.println(sumOfRows);
        }

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
               
                sumOfOneColmn += array[i][j];
            }
            sumOfColmn = sumOfOneColmn;
            sumOfOneColmn = 0;
            System.out.println(sumOfColmn);
        }

        
        
    }
}
