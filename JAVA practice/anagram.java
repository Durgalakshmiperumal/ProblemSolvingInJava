import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        int length1 = word1.length();
        int length2 = word2.length();

if(length1 != length2){
      System.out.print("not a anagram");
      return;
}
 
char[] array1 = word1.toLowerCase().toCharArray();
char[] array2 = word2.toLowerCase().toCharArray();

Arrays.sort(array1);
Arrays.sort(array2);

boolean isAnagram = Arrays.equals(array1, array2);

if (isAnagram) {
    System.out.println("Anagram");
} else {
    System.out.println("Not an anagram");
}
        
    }
}
