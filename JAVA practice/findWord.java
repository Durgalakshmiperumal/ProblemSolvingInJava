import java.util.Scanner;

public class findWord {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sen = sc.nextLine();
        String word = sc.nextLine();
       
        if (sen.contains(word)) {
            System.out.println(word);
        }
        

        
    }
}
