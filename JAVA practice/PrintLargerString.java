import java.util.Scanner;


public class PrintLargerString {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
     
        StringBuilder updatedString = new StringBuilder();

        int length1 = word1.length();
        int length2 = word2.length();

        if(length1 < length2){
        System.out.println(word2);
     }
     else{
   System.out.println(word1);
     }

    }
}