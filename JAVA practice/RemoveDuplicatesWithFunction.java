import java.util.*;

public class RemoveDuplicatesWithFunction {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numbersList.add(num);
        }

        List<Integer> uniqueNumbers = removeDuplicates(numbersList);

        for (int num : uniqueNumbers) {
            System.out.println(num);
        }
    }

    public static List<Integer> removeDuplicates(List<Integer> numbersList) {
        Map<Integer, Boolean> uniqueMap = new HashMap<>();

        for (int num : numbersList) {
            uniqueMap.put(num, true);
        }

        return new ArrayList<>(uniqueMap.keySet());
    }
}
