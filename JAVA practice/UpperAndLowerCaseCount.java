import java.util.Scanner;

public class UpperAndLowerCaseCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int Ucount = 0;
        int Lcount = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                Ucount++;
            }
            else if (Character.isLowerCase(ch)) {
                Lcount++;
            }
        }

        System.out.println(Ucount);
        System.out.println(Lcount);

    }
}


