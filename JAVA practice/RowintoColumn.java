import java.util.Scanner;
public class RowintoColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns =  sc.nextInt();

        int[][] array = new int[rows][columns]; 
        
   

        for(int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < columns ; j++){


                array[i][j] = sc.nextInt();

            }
        }
        int[][] tArray = new int[rows][columns];

        for(int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < columns ; j++){

                tArray[i][j] = array[j][i];

            }}
            System.out.println("Transposed matrix: ");
            for(int i = 0 ; i < rows; i++){
                for(int j = 0 ; j < columns ; j++){
                    System.out.print( tArray[i][j] + " ");
    
    
                }
                System.out.println();
            }


    }
}
