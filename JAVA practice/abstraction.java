/**
 * abstraction
 */
public class abstraction {

    public static int calculateSum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};
        int result = calculateSum(numbers);
        System.out.println("Sum: " + result);
    }
}