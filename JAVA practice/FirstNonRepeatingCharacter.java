public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return currentChar;
            }
        }

        return ' '; // Return a default character if no non-repeating character is found
    }

    public static void main(String[] args) {
        String input = "leetcode";
        char result = findFirstNonRepeatingCharacter(input);
        System.out.println("First non-repeating character: " + result); // Output: 'l'
    }
}
