import java.util.Scanner;
public class countletter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String sentence  = sc.nextLine();
        int count = 0;

        for(int i = 0; i < sentence.length(); i++) {    
            if(sentence.charAt(i) != ' ')    
                count++;    
        }    
           System.out.print(count);
    }
    
}
