import java.util.Scanner;

public class RemoveOddIndex {
    
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
     
        StringBuilder updatedString = new StringBuilder();

        int length = word.length();

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                updatedString.append(word.charAt(i));
            }
        }

       
        String result = updatedString.toString();
        System.out.println(result);


    }
}
