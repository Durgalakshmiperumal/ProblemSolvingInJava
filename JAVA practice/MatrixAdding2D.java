import java.util.Scanner;
class MatrixAdding2D {
      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m]; 
        for(int i = 0; i < n; i++){
            for(int j=0; j < m; j++){
                 a[i][j] = sc.nextInt();
            }
        }
        
        int o = sc.nextInt();
        int p = sc.nextInt();
        int[][] b = new int[n][m]; 
        for(int i = 0; i < o; i++){
            for(int j=0; j < p; j++){
                 b[i][j] = sc.nextInt();
            }
            
        }
          for(int i = 0; i < n; i++){
            for(int j=0; j < m; j++){
                 int matrix = a[i][j] + b[i][j];
                 
                 System.out.print( matrix+" ");
            }
            System.out.println();
        }
        
        
        

    }
}