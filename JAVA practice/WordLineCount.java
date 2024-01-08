import java.util.Scanner;

public class WordLineCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");

        for (String word : words) {
            StringBuilder rWord = new StringBuilder(word).reverse();
            String rString = rWord.toString();

            if (word.equals(rString)) {
      continue;
            }
            else if(word.length() == 1){
                  System.out.println(word);
            }
            else{
                System.out.println(word);
            }

        }


    }
}
