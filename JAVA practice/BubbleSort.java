
public class BubbleSort {
    public static void Bsort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }




    public static void main(String[] args) {
        int[] arr = {5,2,9,98,34,2};
        
        Bsort(num);
   
        for (int nums : num) {
            System.out.print(num);
        }
        
        
    }
    
}


