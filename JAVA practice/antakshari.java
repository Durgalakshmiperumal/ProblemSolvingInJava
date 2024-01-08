import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class antakshari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.println("Enter the strings (type '##' to stop):");

        while (true) {
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("##")) {
                break;
            }

            strings.add(input);
        }

        findAntakshariWords(strings);

        sc.close();
    }

    public static void findAntakshariWords(List<String> strings) {
        boolean foundAntakshari = false;

        for (int i = 0; i < strings.size() - 1; i++) {
            String currentWord = strings.get(i);
            String nextWord = strings.get(i + 1);

            char lastLetter = currentWord.toLowerCase().charAt(currentWord.length() - 1);
            char firstLetterNextWord = nextWord.toLowerCase().charAt(0);

            if (lastLetter == firstLetterNextWord) {
                System.out.println(nextWord);
                foundAntakshari = true;
            }
        }

        if (!foundAntakshari) {
            System.out.println("No Antakshari words found in the given strings.");
        }
    }
}



