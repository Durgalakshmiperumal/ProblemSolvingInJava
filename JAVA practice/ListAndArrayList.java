import java.util.ArrayList;
import java.util.Scanner;
public class ListAndArrayList {
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> list = new ArrayList<>();

        for (String token : input.split(" ")) {
            int number = Integer.parseInt(token);
            list.add(number);
        }
        System.out.println("List: " + list);
        // If you want to create a new ArrayList based on the 'list', you can do it like this:
        ArrayList<Integer> numbers = new ArrayList<>(list);
        System.out.println("ArrayList: " + numbers);
    }


}
