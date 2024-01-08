import java.util.Scanner;

public class ReverseStringNotSplC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String reverse = ""; 
        for (int i = 0; i < sen.length(); i++) {
            if (abc.contains(sen)) {
               reverse = sen.reverse();
            }
        }
        System.out.println(reverse);
    }
}
