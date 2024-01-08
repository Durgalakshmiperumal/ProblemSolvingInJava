import java.util.Scanner;

public class SumOfLargestAndSmallestNumInArray {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int sum = findSumOfLargestAndSmallest(arr);
    System.out.println(sum);

}
public static int findSumOfLargestAndSmallest(int[] arr) {
   int smallest = arr[0];
   int largest = arr[0];

   for (int i = 1; i < arr.length; i++) {
       if (arr[i] < smallest) {
           smallest = arr[i];
       }
       if (arr[i] > largest) {
           largest = arr[i];
       }
   }

   return smallest + largest;

}

}