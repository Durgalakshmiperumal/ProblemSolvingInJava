import java.util.Scanner;

public class RemoveWithIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int num = sc.nextInt();
        StringBuilder updatedString = new StringBuilder();

        int length = word.length();

        for (int i = 0; i < length; i++) {
            if (i != num) {
                updatedString.append(word.charAt(i));
            }
        }

       
        String result = updatedString.toString();
        System.out.println(result);


    }

}

