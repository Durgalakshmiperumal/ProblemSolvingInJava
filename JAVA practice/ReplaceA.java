import java.util.Scanner;

public class ReplaceA {
          public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        StringBuilder updatedString = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'A') {
                updatedString.append('$');
            } else {
                updatedString.append(ch);
            }
        }

     
        System.out.println(updatedString);
        
        }
        
}
