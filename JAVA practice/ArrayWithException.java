 import java.util.Scanner;
public class ArrayWithException {
  public static void main(String args[])
  {
  Scanner sc  = new Scanner(System.in);
    int num = sc.nextInt();
    
   int[] numbers = new int[num];

    System.out.println(numbers);

    sc.close();
  }
}

