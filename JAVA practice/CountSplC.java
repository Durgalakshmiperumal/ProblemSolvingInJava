import java.util.Scanner;
public class CountSplC {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sen = sc.nextLine();
        String spl = "!@#$%^&*_-?/:,;";
        int count = 0;
        for (int i = 0; i < sen.length(); i++) {
            if (spl.contains(String.valueOf(sen.charAt(i)))) {
                count++;
            }
        }
        System.out.println(count);
    
}
}
